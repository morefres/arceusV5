package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ab extends k {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd f6424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(bc bcVar, String str, cd cdVar) {
        super("getValue");
        this.f6424c = cdVar;
        Objects.requireNonNull(bcVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a("getValue", 2, list);
        q a10 = u4Var.a((q) list.get(0));
        q a11 = u4Var.a((q) list.get(1));
        String a12 = this.f6424c.a(a10.zzc());
        return a12 != null ? new u(a12) : a11;
    }
}
