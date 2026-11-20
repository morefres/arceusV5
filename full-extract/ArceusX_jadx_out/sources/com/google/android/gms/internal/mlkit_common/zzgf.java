package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.sdk_base.referrer.Payload;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgf implements e {
    static final zzgf zza = new zzgf();

    static {
        d.b a10 = d.a(Payload.SOURCE);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("errorCode");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
    }

    private zzgf() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
