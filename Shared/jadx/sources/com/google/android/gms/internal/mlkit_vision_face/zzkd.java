package com.google.android.gms.internal.mlkit_vision_face;

import n9.k;

/* loaded from: classes.dex */
public final class zzkd {
    private final zzka zza;
    private final zzjy zzb;
    private final zzkb zzc;
    private final zzjz zzd;
    private final Boolean zze;
    private final Float zzf;

    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        Boolean bool;
        Float f10;
        zzkaVar = zzjxVar.zza;
        this.zza = zzkaVar;
        zzjyVar = zzjxVar.zzb;
        this.zzb = zzjyVar;
        zzkbVar = zzjxVar.zzc;
        this.zzc = zzkbVar;
        zzjzVar = zzjxVar.zzd;
        this.zzd = zzjzVar;
        bool = zzjxVar.zze;
        this.zze = bool;
        f10 = zzjxVar.zzf;
        this.zzf = f10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj;
        return k.b(this.zza, zzkdVar.zza) && k.b(this.zzb, zzkdVar.zzb) && k.b(this.zzc, zzkdVar.zzc) && k.b(this.zzd, zzkdVar.zzd) && k.b(this.zze, zzkdVar.zze) && k.b(this.zzf, zzkdVar.zzf);
    }

    public final int hashCode() {
        return k.c(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @zzcu(zza = 2)
    public final zzjy zza() {
        return this.zzb;
    }

    @zzcu(zza = 4)
    public final zzjz zzb() {
        return this.zzd;
    }

    @zzcu(zza = 1)
    public final zzka zzc() {
        return this.zza;
    }

    @zzcu(zza = 3)
    public final zzkb zzd() {
        return this.zzc;
    }

    @zzcu(zza = 5)
    public final Boolean zze() {
        return this.zze;
    }

    @zzcu(zza = 6)
    public final Float zzf() {
        return this.zzf;
    }
}
