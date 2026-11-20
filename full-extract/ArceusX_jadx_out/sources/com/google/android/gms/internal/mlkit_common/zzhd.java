package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import rf.d;
import rf.e;
import rf.f;

/* loaded from: classes.dex */
final class zzhd implements e {
    static final zzhd zza = new zzhd();

    static {
        d.b a10 = d.a(NotificationCompat.CATEGORY_STATUS);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        a10.b(zzayVar.zzb()).a();
        d.b a11 = d.a("filename");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        a11.b(zzayVar2.zzb()).a();
        d.b a12 = d.a("lineNumber");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        a12.b(zzayVar3.zzb()).a();
    }

    private zzhd() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
