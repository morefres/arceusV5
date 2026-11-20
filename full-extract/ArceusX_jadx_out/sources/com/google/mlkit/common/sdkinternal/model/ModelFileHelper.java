package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;
import n9.g;

/* loaded from: classes2.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    private final MlKitContext zze;
    private static final g zzd = new g("ModelFileHelper", "");

    @NonNull
    public static final String zza = String.format("com.google.mlkit.%s.models", "translate");

    @NonNull
    public static final String zzb = String.format("com.google.mlkit.%s.models", Payload.CUSTOM);
    static final String zzc = String.format("com.google.mlkit.%s.models", "base");

    public ModelFileHelper(@NonNull MlKitContext mlKitContext) {
        this.zze = mlKitContext;
    }

    private final File zzc(@NonNull String str, @NonNull ModelType modelType, boolean z10) {
        File modelDirUnsafe = getModelDirUnsafe(str, modelType, z10);
        if (!modelDirUnsafe.exists()) {
            zzd.b("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(modelDirUnsafe)), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(modelDirUnsafe)), 6);
        }
        return modelDirUnsafe;
    }

    public synchronized void deleteAllModels(@NonNull ModelType modelType, @NonNull String str) {
        deleteRecursively(getModelDirUnsafe(str, modelType, false));
        deleteRecursively(getModelDirUnsafe(str, modelType, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean deleteRecursively(java.io.File r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isDirectory()
            r2 = 1
            if (r1 == 0) goto L2c
            java.io.File[] r1 = r8.listFiles()
            java.lang.Object r1 = n9.m.l(r1)
            java.io.File[] r1 = (java.io.File[]) r1
            int r3 = r1.length
            r4 = r0
            r5 = r2
        L18:
            if (r4 >= r3) goto L2a
            r6 = r1[r4]
            if (r5 == 0) goto L26
            boolean r5 = r7.deleteRecursively(r6)
            if (r5 == 0) goto L26
            r5 = r2
            goto L27
        L26:
            r5 = r0
        L27:
            int r4 = r4 + 1
            goto L18
        L2a:
            if (r5 == 0) goto L33
        L2c:
            boolean r8 = r8.delete()
            if (r8 == 0) goto L33
            return r2
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.ModelFileHelper.deleteRecursively(java.io.File):boolean");
    }

    public void deleteTempFilesInPrivateFolder(@NonNull String str, @NonNull ModelType modelType) {
        File zzc2 = zzc(str, modelType, true);
        if (deleteRecursively(zzc2)) {
            return;
        }
        zzd.d("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(zzc2 != null ? zzc2.getAbsolutePath() : null)));
    }

    public int getLatestCachedModelVersion(@NonNull File file) {
        File[] listFiles = file.listFiles();
        int i10 = -1;
        if (listFiles != null && (listFiles.length) != 0) {
            for (File file2 : listFiles) {
                try {
                    i10 = Math.max(i10, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    zzd.b("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return i10;
    }

    @NonNull
    public File getModelDir(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, false);
    }

    @NonNull
    public File getModelDirUnsafe(@NonNull String str, @NonNull ModelType modelType, boolean z10) {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int ordinal = modelType.ordinal();
        if (ordinal == 1) {
            str2 = zzc;
        } else if (ordinal == 2) {
            str2 = zza;
        } else {
            if (ordinal != 4) {
                throw new IllegalArgumentException("Unknown model type " + modelType.name() + ". Cannot find a dir to store the downloaded model.");
            }
            str2 = zzb;
        }
        File file = new File(this.zze.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z10) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    @NonNull
    public File getModelTempDir(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, true);
    }

    @NonNull
    public File getTempFileInPrivateFolder(@NonNull String str, @NonNull ModelType modelType, @NonNull String str2) {
        File zzc2 = zzc(str, modelType, true);
        if (zzc2.exists() && zzc2.isFile() && !zzc2.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(zzc2.getAbsolutePath())), 13);
        }
        if (!zzc2.exists()) {
            zzd.b("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(zzc2.getAbsolutePath())));
            if (!zzc2.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(zzc2, str2);
    }

    public boolean modelExistsLocally(@NonNull String str, @NonNull ModelType modelType) {
        String zzb2;
        if (modelType == ModelType.UNKNOWN || (zzb2 = zzb(str, modelType)) == null) {
            return false;
        }
        File file = new File(zzb2);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, Constants.MODEL_FILE_NAME);
        zzd.f("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    @NonNull
    public final File zza(@NonNull String str, @NonNull ModelType modelType) {
        return zzc(str, modelType, true);
    }

    public final String zzb(@NonNull String str, @NonNull ModelType modelType) {
        File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        return modelDir.getAbsolutePath() + "/" + latestCachedModelVersion;
    }
}
