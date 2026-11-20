package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzgh implements e {
    static final zzgh zza = new zzgh();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("isDownloaded");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = a12.b(zzayVar3.zzb()).a();
    }

    private zzgh() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzmj zzmjVar = (zzmj) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzmjVar.zza());
        fVar2.add(zzc, zzmjVar.zzb());
        fVar2.add(zzd, (Object) null);
    }
}
