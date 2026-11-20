package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;
import sb.k;
import u9.c;

/* loaded from: classes2.dex */
public abstract class LegacyModelMigrator {

    @NonNull
    protected final ModelFileHelper modelFileHelper;
    private final Context zzb;
    private final k zza = new k();
    private final Executor zzc = MLTaskExecutor.workerThreadExecutor();

    public LegacyModelMigrator(@NonNull Context context, @NonNull ModelFileHelper modelFileHelper) {
        this.zzb = context;
        this.modelFileHelper = modelFileHelper;
    }

    public static void deleteIfEmpty(@NonNull File file) {
        File[] listFiles = file.listFiles();
        if ((listFiles == null || listFiles.length == 0) && !file.delete()) {
            Log.e("MlKitLegacyMigration", "Error deleting model directory ".concat(String.valueOf(file)));
        }
    }

    public static boolean isValidFirebasePersistenceKey(@NonNull String str) {
        String[] split = str.split("\\+", -1);
        if (split.length != 2) {
            return false;
        }
        try {
            c.a(split[0]);
            c.a(split[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void migrateFile(@NonNull File file, @NonNull File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                Log.e("MlKitLegacyMigration", "Error moving model file " + String.valueOf(file) + " to " + String.valueOf(file2));
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            Log.e("MlKitLegacyMigration", "Error deleting model file ".concat(String.valueOf(file)));
        }
    }

    @NonNull
    public abstract String getLegacyModelDirName();

    @NonNull
    public File getLegacyRootDir() {
        Context context = this.zzb;
        return new File(context.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    @NonNull
    public Task<Void> getMigrationTask() {
        return this.zza.a();
    }

    public abstract void migrateAllModelDirs(@NonNull File file);

    public void start() {
        this.zzc.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() {
                LegacyModelMigrator.this.zza();
            }
        });
    }

    public final /* synthetic */ void zza() {
        File legacyRootDir = getLegacyRootDir();
        File[] listFiles = legacyRootDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.zza.c(null);
    }
}
