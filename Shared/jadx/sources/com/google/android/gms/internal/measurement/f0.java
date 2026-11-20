package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f6484a;
    public final String b;

    public f0(u4 u4Var, String str) {
        this.f6484a = u4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final u4 a(q qVar) {
        u4 c10 = this.f6484a.c();
        c10.g(this.b, qVar);
        return c10;
    }
}
