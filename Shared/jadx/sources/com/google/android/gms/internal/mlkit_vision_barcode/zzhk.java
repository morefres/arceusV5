package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhk implements e {
    static final zzhk zza = new zzhk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b a10 = d.a("logEventKey");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
        d.b a11 = d.a("eventCount");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = a11.b(zzfaVar2.zzb()).a();
        d.b a12 = d.a("inferenceDurationStats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = a12.b(zzfaVar3.zzb()).a();
    }

    private zzhk() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzfv zzfvVar = (zzfv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzfvVar.zza());
        fVar2.add(zzc, zzfvVar.zzc());
        fVar2.add(zzd, zzfvVar.zzb());
    }
}
