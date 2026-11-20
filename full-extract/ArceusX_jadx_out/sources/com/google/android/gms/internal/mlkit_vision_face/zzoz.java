package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y9.a;

/* loaded from: classes.dex */
public final class zzoz extends zza implements zzpb {
    public zzoz(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzpb
    public final zzoy zzd(a aVar, zzou zzouVar) {
        zzoy zzoyVar;
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzouVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzoyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            zzoyVar = queryLocalInterface instanceof zzoy ? (zzoy) queryLocalInterface : new zzoy(readStrongBinder);
        }
        zzb.recycle();
        return zzoyVar;
    }
}
