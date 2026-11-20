package com.google.android.gms.internal.mlkit_vision_face;

import com.appsflyer.sdk_base.referrer.Payload;
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
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;

    static {
        d.b a10 = d.a("name");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("version");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a(Payload.SOURCE);
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
        d.b a13 = d.a("uri");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a13.b(zzcqVar4.zzb()).a();
        d.b a14 = d.a("hash");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a14.b(zzcqVar5.zzb()).a();
        d.b a15 = d.a("modelType");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a15.b(zzcqVar6.zzb()).a();
        d.b a16 = d.a("size");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a16.b(zzcqVar7.zzb()).a();
        d.b a17 = d.a("hasLabelMap");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a17.b(zzcqVar8.zzb()).a();
        d.b a18 = d.a("isManifestModel");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a18.b(zzcqVar9.zzb()).a();
    }

    private zzgs() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
