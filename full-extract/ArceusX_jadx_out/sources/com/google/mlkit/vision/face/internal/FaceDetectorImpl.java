package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.List;
import od.a;

/* loaded from: classes2.dex */
public class FaceDetectorImpl extends MobileVisionBase<List<Face>> implements FaceDetector {
    static final FaceDetectorOptions zzb = new FaceDetectorOptions.Builder().build();
    private final boolean zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FaceDetectorImpl(com.google.mlkit.vision.face.internal.zzh r1, com.google.mlkit.common.sdkinternal.ExecutorSelector r2, com.google.mlkit.vision.face.FaceDetectorOptions r3, com.google.mlkit.vision.face.internal.zzd r4) {
        /*
            r0 = this;
            java.util.concurrent.Executor r4 = r3.zzf()
            java.util.concurrent.Executor r2 = r2.getExecutorToUse(r4)
            java.lang.String r4 = com.google.mlkit.vision.face.internal.zzj.zzb()
            com.google.android.gms.internal.mlkit_vision_face.zzoc r4 = com.google.android.gms.internal.mlkit_vision_face.zzon.zzb(r4)
            r0.<init>(r1, r2)
            boolean r1 = com.google.mlkit.vision.face.internal.zzj.zzd()
            r0.zzc = r1
            com.google.android.gms.internal.mlkit_vision_face.zzku r2 = new com.google.android.gms.internal.mlkit_vision_face.zzku
            r2.<init>()
            if (r1 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_face.zzkr r1 = com.google.android.gms.internal.mlkit_vision_face.zzkr.TYPE_THICK
            goto L25
        L23:
            com.google.android.gms.internal.mlkit_vision_face.zzkr r1 = com.google.android.gms.internal.mlkit_vision_face.zzkr.TYPE_THIN
        L25:
            r2.zze(r1)
            com.google.android.gms.internal.mlkit_vision_face.zzlj r1 = new com.google.android.gms.internal.mlkit_vision_face.zzlj
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_face.zzkd r3 = com.google.mlkit.vision.face.internal.zzj.zza(r3)
            r1.zze(r3)
            com.google.android.gms.internal.mlkit_vision_face.zzll r1 = r1.zzi()
            r2.zzg(r1)
            r1 = 1
            com.google.android.gms.internal.mlkit_vision_face.zznr r1 = com.google.android.gms.internal.mlkit_vision_face.zzof.zzg(r2, r1)
            com.google.android.gms.internal.mlkit_vision_face.zzkt r2 = com.google.android.gms.internal.mlkit_vision_face.zzkt.ON_DEVICE_FACE_CREATE
            r4.zzd(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.FaceDetectorImpl.<init>(com.google.mlkit.vision.face.internal.zzh, com.google.mlkit.common.sdkinternal.ExecutorSelector, com.google.mlkit.vision.face.FaceDetectorOptions, com.google.mlkit.vision.face.internal.zzd):void");
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 2;
    }

    @Override // com.google.mlkit.vision.face.FaceDetector, k9.h
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.zzc ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_FACE};
    }

    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull a aVar) {
        return super.processBase(aVar);
    }

    @Override // com.google.mlkit.vision.face.FaceDetector
    @NonNull
    public final Task<List<Face>> process(@NonNull InputImage inputImage) {
        return super.processBase(inputImage);
    }
}
