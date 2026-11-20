package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import n9.g;
import n9.m;

/* loaded from: classes2.dex */
public class CustomModelLoader {
    private static final g zza = new g("CustomModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final LocalModel zzd;
    private final CustomRemoteModel zze;
    private final RemoteModelDownloadManager zzf;
    private final RemoteModelFileManager zzg;
    private final zzsh zzh;
    private boolean zzi;

    public interface CustomModelLoaderHelper {
        void logLoad();

        boolean tryLoad(@NonNull LocalModel localModel);
    }

    private CustomModelLoader(@NonNull MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        MlKitContext mlKitContext2;
        CustomRemoteModel customRemoteModel2;
        if (customRemoteModel != null) {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext2, customRemoteModel2, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.zzg = remoteModelFileManager;
            this.zzf = RemoteModelDownloadManager.getInstance(mlKitContext2, customRemoteModel2, new ModelFileHelper(mlKitContext2), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext2.get(ModelInfoRetrieverInterop.class));
            this.zzi = true;
        } else {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            this.zzg = null;
            this.zzf = null;
        }
        this.zzc = mlKitContext2;
        this.zzd = localModel;
        this.zze = customRemoteModel2;
        this.zzh = zzss.zzb("common");
    }

    @NonNull
    public static synchronized CustomModelLoader getInstance(@NonNull MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        CustomModelLoader customModelLoader;
        synchronized (CustomModelLoader.class) {
            try {
                String localModel2 = customRemoteModel == null ? ((LocalModel) m.l(localModel)).toString() : customRemoteModel.getUniqueModelNameForPersist();
                Map map = zzb;
                if (!map.containsKey(localModel2)) {
                    map.put(localModel2, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
                }
                customModelLoader = (CustomModelLoader) map.get(localModel2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return customModelLoader;
    }

    private final File zza() {
        String zzb2 = ((RemoteModelFileManager) m.l(this.zzg)).zzb();
        if (zzb2 == null) {
            zza.b("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(zzb2);
        File[] listFiles = file.listFiles();
        return ((File[]) m.l(listFiles)).length == 1 ? listFiles[0] : file;
    }

    private final void zzb() {
        ((RemoteModelDownloadManager) m.l(this.zzf)).removeOrCancelDownload();
    }

    private static final LocalModel zzc(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    public synchronized LocalModel createLocalModelByLatestExistingModel() {
        zza.b("CustomModelLoader", "Try to get the latest existing model file.");
        File zza2 = zza();
        if (zza2 == null) {
            return null;
        }
        return zzc(zza2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:7:0x0022, B:9:0x002a, B:15:0x009e, B:19:0x0032, B:21:0x0049, B:24:0x0052, B:25:0x006b, B:27:0x0073, B:28:0x008f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.google.mlkit.common.model.LocalModel createLocalModelByNewlyDownloadedModel() {
        /*
            r7 = this;
            monitor-enter(r7)
            n9.g r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "Try to get newly downloaded model file."
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = n9.m.l(r1)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r1 = r1.getDownloadingId()     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.getDownloadingModelHash()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r1 == 0) goto L8f
            if (r2 != 0) goto L22
            goto L8f
        L22:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r4 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = r4.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L32
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
        L2d:
            r1 = r3
            goto L9a
        L2f:
            r0 = move-exception
            goto La4
        L32:
            java.lang.String r5 = "Download Status code: "
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "CustomModelLoader"
            r0.b(r6, r5)     // Catch: java.lang.Throwable -> L2f
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r6 = 8
            if (r5 != r6) goto L6b
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.io.File r1 = r1.zzi(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L52
            goto L2d
        L52:
            java.lang.String r4 = r1.getParent()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r6 = "CustomModelLoader"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L2f
            r0.b(r6, r4)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            r0.updateLatestModelHashAndType(r2)     // Catch: java.lang.Throwable -> L2f
            goto L9a
        L6b:
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r2 = 16
            if (r0 != r2) goto L2d
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r7.zzh     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.CustomRemoteModel r2 = r7.zze     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = n9.m.l(r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.RemoteModel r2 = (com.google.mlkit.common.model.RemoteModel) r2     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r5 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            int r1 = r5.getFailureReason(r1)     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r0.zze(r4, r2, r5, r1)     // Catch: java.lang.Throwable -> L2f
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L8f:
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L9a:
            if (r1 != 0) goto L9e
            monitor-exit(r7)
            return r3
        L9e:
            com.google.mlkit.common.model.LocalModel r0 = zzc(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r0
        La4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.CustomModelLoader.createLocalModelByNewlyDownloadedModel():com.google.mlkit.common.model.LocalModel");
    }

    public void deleteLatestExistingModel() {
        File zza2 = zza();
        if (zza2 != null) {
            ((RemoteModelFileManager) m.l(this.zzg)).zzc(zza2);
            SharedPrefManager.getInstance(this.zzc).clearLatestModelHash((RemoteModel) m.l(this.zze));
        }
    }

    public void deleteOldModels(@NonNull LocalModel localModel) {
        File parentFile = new File((String) m.l(localModel.getAbsoluteFilePath())).getParentFile();
        if (!((RemoteModelFileManager) m.l(this.zzg)).zzd((File) m.l(parentFile))) {
            zza.d("CustomModelLoader", "Failed to delete old models");
        } else {
            zza.b("CustomModelLoader", "All old models are deleted.");
            this.zzg.zza(parentFile);
        }
    }

    public synchronized void load(@NonNull CustomModelLoaderHelper customModelLoaderHelper) {
        try {
            LocalModel localModel = this.zzd;
            if (localModel == null) {
                localModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModel == null) {
                localModel = createLocalModelByLatestExistingModel();
            }
            if (localModel == null) {
                throw new MlKitException("Model is not available.", 14);
            }
            while (!customModelLoaderHelper.tryLoad(localModel)) {
                if (this.zze != null) {
                    deleteLatestExistingModel();
                    localModel = createLocalModelByLatestExistingModel();
                } else {
                    localModel = null;
                }
                if (localModel == null) {
                    customModelLoaderHelper.logLoad();
                    return;
                }
            }
            if (this.zze != null && this.zzi) {
                deleteOldModels((LocalModel) m.l(localModel));
                this.zzi = false;
            }
            customModelLoaderHelper.logLoad();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
