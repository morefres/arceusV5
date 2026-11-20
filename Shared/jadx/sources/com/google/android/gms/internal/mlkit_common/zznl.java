package com.google.android.gms.internal.mlkit_common;

import n9.k;

/* loaded from: classes.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb;
    private final zznj zzc;
    private final Boolean zzd;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        zznh zznhVar;
        zznhVar = zzniVar.zza;
        this.zza = zznhVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznl) && k.b(this.zza, ((zznl) obj).zza) && k.b(null, null) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, null, null);
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.zza;
    }
}
