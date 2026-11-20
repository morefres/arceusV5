package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzht implements e {
    static final zzht zza = new zzht();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b a10 = d.a("maxMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("minMs");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("avgMs");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = a12.b(zzctVar3.zzb()).a();
        d.b a13 = d.a("firstQuartileMs");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = a13.b(zzctVar4.zzb()).a();
        d.b a14 = d.a("medianMs");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = a14.b(zzctVar5.zzb()).a();
        d.b a15 = d.a("thirdQuartileMs");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = a15.b(zzctVar6.zzb()).a();
    }

    private zzht() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznw zznwVar = (zznw) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zznwVar.zzc());
        fVar2.add(zzc, zznwVar.zze());
        fVar2.add(zzd, zznwVar.zza());
        fVar2.add(zze, zznwVar.zzb());
        fVar2.add(zzf, zznwVar.zzd());
        fVar2.add(zzg, zznwVar.zzf());
    }
}
