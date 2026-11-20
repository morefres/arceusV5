package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzoe implements e {
    static final zzoe zza = new zzoe();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b a10 = d.a("appName");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("sessionId");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("startZoomLevel");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("endZoomLevel");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = a13.b(zzfaVar4.zzb()).a();
        d.b a14 = d.a("durationMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = a14.b(zzfaVar5.zzb()).a();
        d.b a15 = d.a("predictedArea");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = a15.b(zzfaVar6.zzb()).a();
    }

    private zzoe() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzut zzutVar = (zzut) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzutVar.zze());
        fVar2.add(zzc, zzutVar.zzf());
        fVar2.add(zzd, zzutVar.zzc());
        fVar2.add(zze, zzutVar.zzb());
        fVar2.add(zzf, zzutVar.zzd());
        fVar2.add(zzg, zzutVar.zza());
    }
}
