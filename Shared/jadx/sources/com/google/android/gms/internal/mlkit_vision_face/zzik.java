package com.google.android.gms.internal.mlkit_vision_face;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzik implements e {
    static final zzik zza = new zzik();
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
    private static final d zzl;
    private static final d zzm;

    static {
        d.b a10 = d.a("deviceInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("nnapiInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("gpuInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
        d.b a13 = d.a("pipelineIdentifier");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a13.b(zzcqVar4.zzb()).a();
        d.b a14 = d.a("acceptedConfigurations");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a14.b(zzcqVar5.zzb()).a();
        d.b a15 = d.a("action");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a15.b(zzcqVar6.zzb()).a();
        d.b a16 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a16.b(zzcqVar7.zzb()).a();
        d.b a17 = d.a("customErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a17.b(zzcqVar8.zzb()).a();
        d.b a18 = d.a("benchmarkStatus");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a18.b(zzcqVar9.zzb()).a();
        d.b a19 = d.a("validationTestResult");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = a19.b(zzcqVar10.zzb()).a();
        d.b a20 = d.a("timestampUs");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = a20.b(zzcqVar11.zzb()).a();
        d.b a21 = d.a("elapsedUs");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = a21.b(zzcqVar12.zzb()).a();
    }

    private zzik() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
