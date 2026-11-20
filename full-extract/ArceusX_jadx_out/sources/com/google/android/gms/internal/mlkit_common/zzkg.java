package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzkg implements e {
    static final zzkg zza = new zzkg();

    static {
        d.b a10 = d.a("isForegroundConfidenceMaskEnabled");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("isForegroundBitmapEnabled");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("isMultipleSubjectsEnabled");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("isSubjectConfidenceMaskEnabled");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("isSubjectBitmapEnabled");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        a14.b(zzayVar5.zzb()).a();
    }

    private zzkg() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
