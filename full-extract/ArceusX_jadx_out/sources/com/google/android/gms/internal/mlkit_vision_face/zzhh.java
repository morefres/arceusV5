package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhh implements e {
    static final zzhh zza = new zzhh();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b a10 = d.a("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
    }

    private zzhh() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
