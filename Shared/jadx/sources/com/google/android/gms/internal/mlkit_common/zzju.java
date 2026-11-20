package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzju implements e {
    static final zzju zza = new zzju();

    static {
        d.b a10 = d.a("deviceInfo");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("nnapiInfo");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("gpuInfo");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("pipelineIdentifier");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("acceptedConfigurations");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("action");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        a16.b(zzayVar7.zzb()).a();
        d.b a17 = d.a("customErrors");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        a17.b(zzayVar8.zzb()).a();
        d.b a18 = d.a("benchmarkStatus");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        a18.b(zzayVar9.zzb()).a();
        d.b a19 = d.a("validationTestResult");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        a19.b(zzayVar10.zzb()).a();
        d.b a20 = d.a("timestampUs");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        a20.b(zzayVar11.zzb()).a();
        d.b a21 = d.a("elapsedUs");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        a21.b(zzayVar12.zzb()).a();
    }

    private zzju() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
