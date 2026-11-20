package com.google.android.gms.internal.measurement;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* loaded from: classes.dex */
public final class dh extends k {

    /* renamed from: c, reason: collision with root package name */
    public final hh f6468c;

    public dh(hh hhVar) {
        super("internal.registerCallback");
        this.f6468c = hhVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a(this.f6617a, 3, list);
        String zzc = u4Var.a((q) list.get(0)).zzc();
        q a10 = u4Var.a((q) list.get(1));
        if (!(a10 instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        q a11 = u4Var.a((q) list.get(2));
        if (!(a11 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        n nVar = (n) a11;
        if (!nVar.g(Payload.TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f6468c.a(zzc, nVar.g("priority") ? v5.g(nVar.c("priority").zzd().doubleValue()) : 1000, (p) a10, nVar.c(Payload.TYPE).zzc());
        return q.f6791yo;
    }
}
