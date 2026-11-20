package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.atomic.AtomicBoolean;
import n9.g;

/* loaded from: classes.dex */
final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    public zzxj(zzxk zzxkVar, zzrc zzrcVar, float f10, zzxn zzxnVar, float f11) {
        this.zza = zzrcVar;
        this.zzb = f10;
        this.zzc = zzxnVar;
        this.zzd = f11;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th2) {
        g gVar;
        AtomicBoolean atomicBoolean;
        gVar = zzxk.zzf;
        gVar.i("AutoZoom", "Unable to set zoom to " + this.zzd, th2);
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f10 = (Float) obj;
        if (f10.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f10.floatValue());
            this.zze.zzq(this.zza, this.zzb, f10.floatValue(), this.zzc);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }
}
