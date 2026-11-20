package com.google.android.gms.internal.mlkit_vision_text_common;

import n9.k;

/* loaded from: classes.dex */
public final class zzes {
    private final zzou zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final zzod zzd;
    private final zzsd zze;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        zzou zzouVar;
        Boolean bool;
        zzsd zzsdVar;
        zzouVar = zzeqVar.zza;
        this.zza = zzouVar;
        this.zzb = null;
        bool = zzeqVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzsdVar = zzeqVar.zzc;
        this.zze = zzsdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        return k.b(this.zza, zzesVar.zza) && k.b(null, null) && k.b(this.zzc, zzesVar.zzc) && k.b(null, null) && k.b(this.zze, zzesVar.zze);
    }

    public final int hashCode() {
        return k.c(this.zza, null, this.zzc, null, this.zze);
    }

    @zzcx(zza = 1)
    public final zzou zza() {
        return this.zza;
    }

    @zzcx(zza = 5)
    public final zzsd zzb() {
        return this.zze;
    }

    @zzcx(zza = 3)
    public final Boolean zzc() {
        return this.zzc;
    }
}
