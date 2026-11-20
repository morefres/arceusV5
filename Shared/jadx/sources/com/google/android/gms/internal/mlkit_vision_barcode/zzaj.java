package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzaj extends zza implements IInterface {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() {
        zzc(3, zza());
    }

    public final zzu[] zze(y9.a aVar, zzan zzanVar) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzanVar);
        Parcel zzb = zzb(1, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }

    public final zzu[] zzf(y9.a aVar, zzan zzanVar) {
        Parcel zza = zza();
        zzc.zzb(zza, aVar);
        zzc.zza(zza, zzanVar);
        Parcel zzb = zzb(2, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }
}
