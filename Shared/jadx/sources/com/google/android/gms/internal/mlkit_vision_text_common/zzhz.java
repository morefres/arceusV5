package com.google.android.gms.internal.mlkit_vision_text_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhz implements e {
    static final zzhz zza = new zzhz();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b a10 = d.a("imageFormat");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("originalImageSize");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("compressedImageSize");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = a12.b(zzctVar3.zzb()).a();
        d.b a13 = d.a("isOdmlImage");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = a13.b(zzctVar4.zzb()).a();
    }

    private zzhz() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzod zzodVar = (zzod) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzodVar.zza());
        fVar2.add(zzc, zzodVar.zzb());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, (Object) null);
    }
}
