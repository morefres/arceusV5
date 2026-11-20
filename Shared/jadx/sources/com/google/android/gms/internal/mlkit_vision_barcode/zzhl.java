package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhl implements e {
    static final zzhl zza = new zzhl();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b a10 = d.a("errorCode");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("hasResult");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("isColdCall");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("imageInfo");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = a13.b(zzfaVar4.zzb()).a();
        d.b a14 = d.a("options");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = a14.b(zzfaVar5.zzb()).a();
        d.b a15 = d.a("detectedBarcodeFormats");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = a15.b(zzfaVar6.zzb()).a();
        d.b a16 = d.a("detectedBarcodeValueTypes");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = a16.b(zzfaVar7.zzb()).a();
    }

    private zzhl() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzft zzftVar = (zzft) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzftVar.zzc());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, zzftVar.zze());
        fVar2.add(zze, (Object) null);
        fVar2.add(zzf, zzftVar.zzd());
        fVar2.add(zzg, zzftVar.zza());
        fVar2.add(zzh, zzftVar.zzb());
    }
}
