package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzlf implements e {
    static final zzlf zza = new zzlf();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        d.b a10 = d.a("inferenceCommonLogEvent");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("options");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("detectedBarcodeFormats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("detectedBarcodeValueTypes");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = a13.b(zzfaVar4.zzb()).a();
        d.b a14 = d.a("imageInfo");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = a14.b(zzfaVar5.zzb()).a();
    }

    private zzlf() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzrr zzrrVar = (zzrr) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzrrVar.zzd());
        fVar2.add(zzc, zzrrVar.zze());
        fVar2.add(zzd, zzrrVar.zza());
        fVar2.add(zze, zzrrVar.zzb());
        fVar2.add(zzf, zzrrVar.zzc());
    }
}
