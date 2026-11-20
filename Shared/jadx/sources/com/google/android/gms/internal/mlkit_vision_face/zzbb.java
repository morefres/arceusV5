package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbb extends zzaq {
    final /* synthetic */ zzbd zza;
    private final Object zzb;
    private int zzc;

    public zzbb(zzbd zzbdVar, int i10) {
        this.zza = zzbdVar;
        this.zzb = zzbd.zzg(zzbdVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzv;
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzx.zza(this.zzb, zzbd.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzbd.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzbd.zzj(this.zza, i10);
        zzbd.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
