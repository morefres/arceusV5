package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzjc implements e {
    static final zzjc zza = new zzjc();

    static {
        d.b a10 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        a10.b(zzctVar.zzb()).a();
        d.b a11 = d.a("filename");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        a11.b(zzctVar2.zzb()).a();
        d.b a12 = d.a("lineNumber");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        a12.b(zzctVar3.zzb()).a();
    }

    private zzjc() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
