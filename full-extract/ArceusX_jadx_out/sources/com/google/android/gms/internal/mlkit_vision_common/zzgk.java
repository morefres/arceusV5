package com.google.android.gms.internal.mlkit_vision_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgk implements e {
    static final zzgk zza = new zzgk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("languageOption");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(3);
        zzb = a10.b(zzaeVar.zzb()).a();
        d.b a11 = d.a("isUsingLegacyApi");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(4);
        zzc = a11.b(zzaeVar2.zzb()).a();
        d.b a12 = d.a("sdkVersion");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(5);
        zzd = a12.b(zzaeVar3.zzb()).a();
    }

    private zzgk() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
