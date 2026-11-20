package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzom implements e {
    static final zzom zza = new zzom();

    static {
        d.b a10 = d.a("isForegroundConfidenceMaskEnabled");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("isForegroundBitmapEnabled");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("isMultipleSubjectsEnabled");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("isSubjectConfidenceMaskEnabled");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        a13.b(zzfaVar4.zzb()).a();
        d.b a14 = d.a("isSubjectBitmapEnabled");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        a14.b(zzfaVar5.zzb()).a();
    }

    private zzom() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
