package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzlo implements e {
    static final zzlo zza = new zzlo();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("languageOption");
        zzct zzctVar = new zzct();
        zzctVar.zza(3);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("isUsingLegacyApi");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(4);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("sdkVersion");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(5);
        zzd = a12.b(zzctVar3.zzb()).a();
    }

    private zzlo() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        f fVar2 = fVar;
        fVar2.add(zzb, ((zzsd) obj).zza());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, (Object) null);
    }
}
