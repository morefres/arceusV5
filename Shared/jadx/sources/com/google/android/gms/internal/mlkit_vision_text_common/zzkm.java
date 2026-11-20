package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzkm implements e {
    static final zzkm zza = new zzkm();

    static {
        d.b a10 = d.a("maxLabels");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("confidenceThreshold");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("customLocalModelOptions");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        a12.b(zzctVar3.zzb()).a();
    }

    private zzkm() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
