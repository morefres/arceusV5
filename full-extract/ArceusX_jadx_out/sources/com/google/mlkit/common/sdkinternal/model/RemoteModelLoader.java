package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import n9.g;

/* loaded from: classes2.dex */
public class RemoteModelLoader {
    private static final g zza = new g("RemoteModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final RemoteModel zzd;
    private final RemoteModelDownloadManager zze;
    private final RemoteModelFileManager zzf;
    private final RemoteModelLoaderHelper zzg;
    private final zzsh zzh;
    private boolean zzi;

    private RemoteModelLoader(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = zzss.zzb("common");
    }

    @NonNull
    public static synchronized RemoteModelLoader getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        RemoteModelLoader remoteModelLoader;
        synchronized (RemoteModelLoader.class) {
            try {
                String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
                Map map = zzb;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
                }
                remoteModelLoader = (RemoteModelLoader) map.get(uniqueModelNameForPersist);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remoteModelLoader;
    }

    @NonNull
    private final MappedByteBuffer zza(@NonNull String str) {
        return this.zzg.loadModelAtPath(str);
    }

    private final MappedByteBuffer zzb(File file) {
        try {
            return zza(file.getAbsolutePath());
        } catch (Exception e10) {
            this.zzf.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e10);
        }
    }

    @NonNull
    public RemoteModel getRemoteModel() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:12:0x00b8, B:14:0x00c7, B:19:0x00cf, B:22:0x00d5, B:23:0x00f3, B:24:0x00f4, B:26:0x0031, B:28:0x0048, B:31:0x0051, B:33:0x006f, B:35:0x0077, B:36:0x0089, B:38:0x0091, B:39:0x00a8), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:12:0x00b8, B:14:0x00c7, B:19:0x00cf, B:22:0x00d5, B:23:0x00f3, B:24:0x00f4, B:26:0x0031, B:28:0x0048, B:31:0x0051, B:33:0x006f, B:35:0x0077, B:36:0x0089, B:38:0x0091, B:39:0x00a8), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.nio.MappedByteBuffer load() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.load():java.nio.MappedByteBuffer");
    }
}
