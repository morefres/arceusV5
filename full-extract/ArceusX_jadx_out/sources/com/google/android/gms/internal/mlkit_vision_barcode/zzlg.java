package com.google.android.gms.internal.mlkit_vision_barcode;

import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzlg implements e {
    static final zzlg zza = new zzlg();
    private static final d zzb;

    static {
        d.b a10 = d.a("errorCode");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = a10.b(zzfaVar.zzb()).a();
    }

    private zzlg() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        fVar.add(zzb, ((zzru) obj).zza());
    }
}
