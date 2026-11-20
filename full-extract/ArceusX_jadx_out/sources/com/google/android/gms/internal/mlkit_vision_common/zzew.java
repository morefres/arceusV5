package com.google.android.gms.internal.mlkit_vision_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzew implements e {
    static final zzew zza = new zzew();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b a10 = d.a("deviceInfos");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        d.b a11 = d.a("errorInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
    }

    private zzew() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
