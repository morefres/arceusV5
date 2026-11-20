package com.google.android.gms.internal.mlkit_vision_face;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzfh implements e {
    static final zzfh zza = new zzfh();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b a10 = d.a("cameraSource");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a10.b(zzcqVar.zzb()).a();
        d.b a11 = d.a("eventType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a11.b(zzcqVar2.zzb()).a();
        d.b a12 = d.a("requestedPreviewHeight");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a12.b(zzcqVar3.zzb()).a();
        d.b a13 = d.a("requestedPreviewWidth");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a13.b(zzcqVar4.zzb()).a();
        d.b a14 = d.a("actualPreviewHeight");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a14.b(zzcqVar5.zzb()).a();
        d.b a15 = d.a("actualPreviewWidth");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a15.b(zzcqVar6.zzb()).a();
    }

    private zzfh() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
