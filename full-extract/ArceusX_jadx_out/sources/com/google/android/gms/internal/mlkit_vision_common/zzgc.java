package com.google.android.gms.internal.mlkit_vision_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgc implements e {
    static final zzgc zza = new zzgc();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b a10 = d.a("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a10.b(zzaeVar.zzb()).a();
        d.b a11 = d.a("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a11.b(zzaeVar2.zzb()).a();
        d.b a12 = d.a("detectorOptions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a12.b(zzaeVar3.zzb()).a();
        d.b a13 = d.a("loadDurationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a13.b(zzaeVar4.zzb()).a();
        d.b a14 = d.a("sessionDurationMs");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a14.b(zzaeVar5.zzb()).a();
        d.b a15 = d.a("sessionTotalInferenceDurationMs");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a15.b(zzaeVar6.zzb()).a();
    }

    private zzgc() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
