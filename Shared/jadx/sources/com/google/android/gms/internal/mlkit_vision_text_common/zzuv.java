package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y9.a;

/* loaded from: classes.dex */
public final class zzuv extends zza implements IInterface {
    public zzuv(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final zzvf zzd(a aVar, zzuq zzuqVar) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzuqVar);
        Parcel zzb = zzb(3, zza);
        zzvf createFromParcel = zzb.readInt() == 0 ? null : zzvf.CREATOR.createFromParcel(zzb);
        zzb.recycle();
        return createFromParcel;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
