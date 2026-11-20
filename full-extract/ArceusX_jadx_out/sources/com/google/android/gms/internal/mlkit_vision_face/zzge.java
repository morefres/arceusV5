package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzge implements e {
    static final zzge zza = new zzge();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b a10 = d.a("landmarkMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("classificationMode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("performanceMode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
        d.b a13 = d.a("contourMode");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a13.b(zzcqVar4.zzb()).a();
        d.b a14 = d.a("isTrackingEnabled");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a14.b(zzcqVar5.zzb()).a();
        d.b a15 = d.a("minFaceSize");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a15.b(zzcqVar6.zzb()).a();
    }

    private zzge() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzkd zzkdVar = (zzkd) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzkdVar.zzc());
        fVar2.add(zzc, zzkdVar.zza());
        fVar2.add(zzd, zzkdVar.zzd());
        fVar2.add(zze, zzkdVar.zzb());
        fVar2.add(zzf, zzkdVar.zze());
        fVar2.add(zzg, zzkdVar.zzf());
    }
}
