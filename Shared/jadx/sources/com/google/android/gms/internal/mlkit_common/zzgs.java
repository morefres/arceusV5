package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgs implements e {
    static final zzgs zza = new zzgs();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b a10 = d.a("modelInfo");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("initialDownloadConditions");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("updateDownloadConditions");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("isModelUpdateEnabled");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = a13.b(zzayVar4.zzb()).a();
    }

    private zzgs() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        f fVar2 = fVar;
        fVar2.add(zzb, ((zznl) obj).zza());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, (Object) null);
    }
}
