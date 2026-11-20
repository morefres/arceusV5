package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzln implements e {
    static final zzln zza = new zzln();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("inferenceCommonLogEvent");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("imageInfo");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("recognizerOptions");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = a12.b(zzctVar3.zzb()).a();
    }

    private zzln() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzrz zzrzVar = (zzrz) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzrzVar.zzb());
        fVar2.add(zzc, zzrzVar.zza());
        fVar2.add(zzd, zzrzVar.zzc());
    }
}
