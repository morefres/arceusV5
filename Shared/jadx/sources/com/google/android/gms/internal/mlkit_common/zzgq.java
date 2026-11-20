package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgq implements e {
    static final zzgq zza = new zzgq();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b a10 = d.a("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = a16.b(zzayVar7.zzb()).a();
    }

    private zzgq() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznc zzncVar = (zznc) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzncVar.zzc());
        fVar2.add(zzc, zzncVar.zzf());
        fVar2.add(zzd, zzncVar.zza());
        fVar2.add(zze, zzncVar.zze());
        fVar2.add(zzf, zzncVar.zzb());
        fVar2.add(zzg, zzncVar.zzd());
        fVar2.add(zzh, (Object) null);
    }
}
