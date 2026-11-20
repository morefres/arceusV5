package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzid implements e {
    static final zzid zza = new zzid();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;

    static {
        d.b a10 = d.a("durationMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("errorCode");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = a12.b(zzctVar3.zzb()).a();
        d.b a13 = d.a("autoManageModelOnBackground");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = a13.b(zzctVar4.zzb()).a();
        d.b a14 = d.a("autoManageModelOnLowMemory");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = a14.b(zzctVar5.zzb()).a();
        d.b a15 = d.a("isNnApiEnabled");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = a15.b(zzctVar6.zzb()).a();
        d.b a16 = d.a("eventsCount");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = a16.b(zzctVar7.zzb()).a();
        d.b a17 = d.a("otherErrors");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = a17.b(zzctVar8.zzb()).a();
        d.b a18 = d.a("remoteConfigValueForAcceleration");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = a18.b(zzctVar9.zzb()).a();
        d.b a19 = d.a("isAccelerated");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = a19.b(zzctVar10.zzb()).a();
    }

    private zzid() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzoj zzojVar = (zzoj) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzojVar.zze());
        fVar2.add(zzc, zzojVar.zza());
        fVar2.add(zzd, zzojVar.zzd());
        fVar2.add(zze, zzojVar.zzb());
        fVar2.add(zzf, zzojVar.zzc());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
        fVar2.add(zzk, (Object) null);
    }
}
