package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzif implements e {
    static final zzif zza = new zzif();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("languageOption");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(3);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("isUsingLegacyApi");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(4);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("sdkVersion");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(5);
        zzd = a12.b(zzcqVar3.zzb()).a();
    }

    private zzif() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
