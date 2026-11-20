package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzmg implements e {
    static final zzmg zza = new zzmg();
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
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("appVersion");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = a12.b(zzctVar3.zzb()).a();
        d.b a13 = d.a("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = a13.b(zzctVar4.zzb()).a();
        d.b a14 = d.a("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = a14.b(zzctVar5.zzb()).a();
        d.b a15 = d.a("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = a15.b(zzctVar6.zzb()).a();
        d.b a16 = d.a("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = a16.b(zzctVar7.zzb()).a();
        d.b a17 = d.a("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = a17.b(zzctVar8.zzb()).a();
        d.b a18 = d.a("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = a18.b(zzctVar9.zzb()).a();
        d.b a19 = d.a("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = a19.b(zzctVar10.zzb()).a();
        d.b a20 = d.a("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        zzl = a20.b(zzctVar11.zzb()).a();
        d.b a21 = d.a("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        zzm = a21.b(zzctVar12.zzb()).a();
        d.b a22 = d.a("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        zzn = a22.b(zzctVar13.zzb()).a();
        d.b a23 = d.a("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        zzo = a23.b(zzctVar14.zzb()).a();
    }

    private zzmg() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzst zzstVar = (zzst) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzstVar.zzg());
        fVar2.add(zzc, zzstVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzstVar.zzj());
        fVar2.add(zzf, zzstVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzstVar.zza());
        fVar2.add(zzj, zzstVar.zzi());
        fVar2.add(zzk, zzstVar.zzb());
        fVar2.add(zzl, zzstVar.zzd());
        fVar2.add(zzm, zzstVar.zzc());
        fVar2.add(zzn, zzstVar.zze());
        fVar2.add(zzo, zzstVar.zzf());
    }
}
