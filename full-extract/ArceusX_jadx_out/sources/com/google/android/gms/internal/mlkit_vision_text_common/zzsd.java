package com.google.android.gms.internal.mlkit_vision_text_common;

import n9.k;

/* loaded from: classes.dex */
public final class zzsd {
    private final zzsb zza;
    private final Boolean zzb;
    private final String zzc;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        zzsb zzsbVar;
        zzsbVar = zzsaVar.zza;
        this.zza = zzsbVar;
        this.zzb = null;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzsd) && k.b(this.zza, ((zzsd) obj).zza) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, null);
    }

    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.zza;
    }
}
