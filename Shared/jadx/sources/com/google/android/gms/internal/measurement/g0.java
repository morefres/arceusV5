package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f6499a;
    public final String b;

    public g0(u4 u4Var, String str) {
        this.f6499a = u4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final u4 a(q qVar) {
        u4 c10 = this.f6499a.c();
        c10.f(this.b, qVar);
        return c10;
    }
}
