package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class y8 extends k {

    /* renamed from: c, reason: collision with root package name */
    public final c f7004c;

    public y8(c cVar) {
        super("internal.eventLogger");
        this.f7004c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a(this.f6617a, 3, list);
        String zzc = u4Var.a((q) list.get(0)).zzc();
        long i10 = (long) v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue());
        q a10 = u4Var.a((q) list.get(2));
        this.f7004c.e(zzc, i10, a10 instanceof n ? v5.k((n) a10) : new HashMap());
        return q.f6791yo;
    }
}
