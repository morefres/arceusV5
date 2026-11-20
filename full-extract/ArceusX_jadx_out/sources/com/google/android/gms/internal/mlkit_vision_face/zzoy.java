package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import y9.a;

/* loaded from: classes.dex */
public final class zzoy extends zza implements IInterface {
    public zzoy(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final List zzd(a aVar, zzoq zzoqVar) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzoqVar);
        Parcel zzb = zzb(3, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzow.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
