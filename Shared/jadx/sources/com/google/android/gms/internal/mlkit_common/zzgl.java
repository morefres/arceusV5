package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgl implements e {
    static final zzgl zza = new zzgl();

    static {
        d.b a10 = d.a("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("latencyMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("burstCount");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("estimatedCaptureLatencyMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("errorCode");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        a14.b(zzayVar5.zzb()).a();
    }

    private zzgl() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
