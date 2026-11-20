package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzeo implements e {
    static final zzeo zza = new zzeo();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
    }

    private zzeo() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzdp zzdpVar = (zzdp) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzdpVar.zza());
        fVar2.add(zzc, zzdpVar.zzc());
        fVar2.add(zzd, zzdpVar.zzb());
    }
}
