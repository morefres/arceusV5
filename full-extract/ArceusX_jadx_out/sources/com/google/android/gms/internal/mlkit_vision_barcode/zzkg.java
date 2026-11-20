package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzkg implements e {
    static final zzkg zza = new zzkg();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b a10 = d.a("imageFormat");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("originalImageSize");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("compressedImageSize");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
        d.b a13 = d.a("isOdmlImage");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = a13.b(zzfaVar4.zzb()).a();
    }

    private zzkg() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzqk zzqkVar = (zzqk) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzqkVar.zza());
        fVar2.add(zzc, zzqkVar.zzb());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, (Object) null);
    }
}
