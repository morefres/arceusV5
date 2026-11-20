package com.google.android.gms.internal.mlkit_vision_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzej implements e {
    static final zzej zza = new zzej();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b a10 = d.a("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        d.b a11 = d.a("imageSource");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        d.b a12 = d.a("imageFormat");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        d.b a13 = d.a("imageByteSize");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
        d.b a14 = d.a("imageWidth");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a14.b(zzaeVar5.zzb()).a();
        d.b a15 = d.a("imageHeight");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a15.b(zzaeVar6.zzb()).a();
        d.b a16 = d.a("rotationDegrees");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a16.b(zzaeVar7.zzb()).a();
    }

    private zzej() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zziq zziqVar = (zziq) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zziqVar.zzg());
        fVar2.add(zzc, zziqVar.zzb());
        fVar2.add(zzd, zziqVar.zza());
        fVar2.add(zze, zziqVar.zzc());
        fVar2.add(zzf, zziqVar.zze());
        fVar2.add(zzg, zziqVar.zzd());
        fVar2.add(zzh, zziqVar.zzf());
    }
}
