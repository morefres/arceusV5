package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhc implements e {
    static final zzhc zza = new zzhc();

    static {
        d.b a10 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("options");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("model");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("language");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("segmentationRequest");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("segmentationResult");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a("aggregatedSegmentations");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        a16.b(zzayVar7.zzb()).a();
        d.b a17 = d.a("durationMs");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        a17.b(zzayVar8.zzb()).a();
        d.b a18 = d.a("nativeSegmentationException");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        a18.b(zzayVar9.zzb()).a();
        d.b a19 = d.a("downloadErrorCodes");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        a19.b(zzayVar10.zzb()).a();
        d.b a20 = d.a("domain");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        a20.b(zzayVar11.zzb()).a();
    }

    private zzhc() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
