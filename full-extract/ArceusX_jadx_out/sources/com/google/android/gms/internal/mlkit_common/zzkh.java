package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzkh implements e {
    static final zzkh zza = new zzkh();
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
    private static final d zzn;
    private static final d zzo;

    static {
        d.b a10 = d.a("appId");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("appVersion");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = a16.b(zzayVar7.zzb()).a();
        d.b a17 = d.a("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = a17.b(zzayVar8.zzb()).a();
        d.b a18 = d.a("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = a18.b(zzayVar9.zzb()).a();
        d.b a19 = d.a("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        zzk = a19.b(zzayVar10.zzb()).a();
        d.b a20 = d.a("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        zzl = a20.b(zzayVar11.zzb()).a();
        d.b a21 = d.a("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        zzm = a21.b(zzayVar12.zzb()).a();
        d.b a22 = d.a("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        zzn = a22.b(zzayVar13.zzb()).a();
        d.b a23 = d.a("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        zzo = a23.b(zzayVar14.zzb()).a();
    }

    private zzkh() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzqv zzqvVar = (zzqv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzqvVar.zzg());
        fVar2.add(zzc, zzqvVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzqvVar.zzj());
        fVar2.add(zzf, zzqvVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzqvVar.zza());
        fVar2.add(zzj, zzqvVar.zzi());
        fVar2.add(zzk, zzqvVar.zzb());
        fVar2.add(zzl, zzqvVar.zzd());
        fVar2.add(zzm, zzqvVar.zzc());
        fVar2.add(zzn, zzqvVar.zze());
        fVar2.add(zzo, zzqvVar.zzf());
    }
}
