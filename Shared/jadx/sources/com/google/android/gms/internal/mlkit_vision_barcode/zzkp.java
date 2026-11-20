package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzkp implements e {
    static final zzkp zza = new zzkp();

    static {
        d.b a10 = d.a("identifyLanguageConfidenceThreshold");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("identifyAllLanguagesConfidenceThreshold");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("confidenceThreshold");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        a12.b(zzfaVar3.zzb()).a();
    }

    private zzkp() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
