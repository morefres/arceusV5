package com.google.android.gms.internal.mlkit_vision_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgp implements e {
    static final zzgp zza = new zzgp();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        d.b a11 = d.a("nnapiInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        d.b a12 = d.a("gpuInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        d.b a13 = d.a("pipelineIdentifier");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
        d.b a14 = d.a("acceptedConfigurations");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a14.b(zzaeVar5.zzb()).a();
        d.b a15 = d.a("action");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a15.b(zzaeVar6.zzb()).a();
        d.b a16 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a16.b(zzaeVar7.zzb()).a();
        d.b a17 = d.a("customErrors");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = a17.b(zzaeVar8.zzb()).a();
        d.b a18 = d.a("benchmarkStatus");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = a18.b(zzaeVar9.zzb()).a();
        d.b a19 = d.a("validationTestResult");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = a19.b(zzaeVar10.zzb()).a();
        d.b a20 = d.a("timestampUs");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = a20.b(zzaeVar11.zzb()).a();
        d.b a21 = d.a("elapsedUs");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = a21.b(zzaeVar12.zzb()).a();
    }

    private zzgp() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
