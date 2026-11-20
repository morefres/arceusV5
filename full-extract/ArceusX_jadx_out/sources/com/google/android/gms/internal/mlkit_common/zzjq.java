package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzjq implements e {
    static final zzjq zza = new zzjq();

    static {
        d.b a10 = d.a("inferenceCommonLogEvent");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("options");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("inputLength");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("outputLength");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("loadDictionaryErrorCode");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("translateResultStatusCode");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        a16.b(zzayVar7.zzb()).a();
        d.b a17 = d.a("downloadHttpResponseCode");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        a17.b(zzayVar8.zzb()).a();
    }

    private zzjq() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
