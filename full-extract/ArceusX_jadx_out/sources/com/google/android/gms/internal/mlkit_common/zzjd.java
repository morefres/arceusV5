package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzjd implements e {
    static final zzjd zza = new zzjd();

    static {
        d.b a10 = d.a("detectorMode");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("streamModeSmoothingRatio");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("rawSizeMaskEnabled");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
    }

    private zzjd() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
