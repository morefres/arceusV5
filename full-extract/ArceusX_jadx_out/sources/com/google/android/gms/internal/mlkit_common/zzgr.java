package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.sdk_base.referrer.Payload;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgr implements e {
    static final zzgr zza = new zzgr();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;

    static {
        d.b a10 = d.a("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("version");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a(Payload.SOURCE);
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = a12.b(zzayVar3.zzb()).a();
        d.b a13 = d.a("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = a13.b(zzayVar4.zzb()).a();
        d.b a14 = d.a("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = a14.b(zzayVar5.zzb()).a();
        d.b a15 = d.a("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = a15.b(zzayVar6.zzb()).a();
        d.b a16 = d.a("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = a16.b(zzayVar7.zzb()).a();
        d.b a17 = d.a("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = a17.b(zzayVar8.zzb()).a();
        d.b a18 = d.a("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = a18.b(zzayVar9.zzb()).a();
    }

    private zzgr() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznh zznhVar = (zznh) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zznhVar.zzd());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, zznhVar.zzb());
        fVar2.add(zze, (Object) null);
        fVar2.add(zzf, zznhVar.zzc());
        fVar2.add(zzg, zznhVar.zza());
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
    }
}
