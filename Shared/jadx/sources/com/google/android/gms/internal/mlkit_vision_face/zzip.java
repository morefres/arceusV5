package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzip implements e {
    static final zzip zza = new zzip();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("appVersion");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
        d.b a13 = d.a("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a13.b(zzcqVar4.zzb()).a();
        d.b a14 = d.a("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a14.b(zzcqVar5.zzb()).a();
        d.b a15 = d.a("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a15.b(zzcqVar6.zzb()).a();
        d.b a16 = d.a("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a16.b(zzcqVar7.zzb()).a();
        d.b a17 = d.a("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a17.b(zzcqVar8.zzb()).a();
        d.b a18 = d.a("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a18.b(zzcqVar9.zzb()).a();
        d.b a19 = d.a("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = a19.b(zzcqVar10.zzb()).a();
        d.b a20 = d.a("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = a20.b(zzcqVar11.zzb()).a();
        d.b a21 = d.a("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = a21.b(zzcqVar12.zzb()).a();
        d.b a22 = d.a("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        zzn = a22.b(zzcqVar13.zzb()).a();
        d.b a23 = d.a("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        zzo = a23.b(zzcqVar14.zzb()).a();
    }

    private zzip() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzmv zzmvVar = (zzmv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzmvVar.zzg());
        fVar2.add(zzc, zzmvVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzmvVar.zzj());
        fVar2.add(zzf, zzmvVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzmvVar.zza());
        fVar2.add(zzj, zzmvVar.zzi());
        fVar2.add(zzk, zzmvVar.zzb());
        fVar2.add(zzl, zzmvVar.zzd());
        fVar2.add(zzm, zzmvVar.zzc());
        fVar2.add(zzn, zzmvVar.zze());
        fVar2.add(zzo, zzmvVar.zzf());
    }
}
