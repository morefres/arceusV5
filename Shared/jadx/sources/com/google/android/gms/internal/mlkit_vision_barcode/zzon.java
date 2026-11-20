package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzon implements e {
    static final zzon zza = new zzon();
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
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("appVersion");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("firebaseProjectId");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("mlSdkVersion");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = a13.b(zzfaVar4.zzb()).a();
        d.b a14 = d.a("tfliteSchemaVersion");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = a14.b(zzfaVar5.zzb()).a();
        d.b a15 = d.a("gcmSenderId");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = a15.b(zzfaVar6.zzb()).a();
        d.b a16 = d.a("apiKey");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = a16.b(zzfaVar7.zzb()).a();
        d.b a17 = d.a("languages");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = a17.b(zzfaVar8.zzb()).a();
        d.b a18 = d.a("mlSdkInstanceId");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = a18.b(zzfaVar9.zzb()).a();
        d.b a19 = d.a("isClearcutClient");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = a19.b(zzfaVar10.zzb()).a();
        d.b a20 = d.a("isStandaloneMlkit");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        zzl = a20.b(zzfaVar11.zzb()).a();
        d.b a21 = d.a("isJsonLogging");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        zzm = a21.b(zzfaVar12.zzb()).a();
        d.b a22 = d.a("buildLevel");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        zzn = a22.b(zzfaVar13.zzb()).a();
        d.b a23 = d.a("optionalModuleVersion");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        zzo = a23.b(zzfaVar14.zzb()).a();
    }

    private zzon() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzvd zzvdVar = (zzvd) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzvdVar.zzg());
        fVar2.add(zzc, zzvdVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzvdVar.zzj());
        fVar2.add(zzf, zzvdVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzvdVar.zza());
        fVar2.add(zzj, zzvdVar.zzi());
        fVar2.add(zzk, zzvdVar.zzb());
        fVar2.add(zzl, zzvdVar.zzd());
        fVar2.add(zzm, zzvdVar.zzc());
        fVar2.add(zzn, zzvdVar.zze());
        fVar2.add(zzo, zzvdVar.zzf());
    }
}
