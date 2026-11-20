package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class i1<V> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final m1<V> f7154a;
    public final i2<? extends V> b;

    public i1(m1 m1Var, i2 i2Var) {
        this.f7154a = m1Var;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object t8;
        if (this.f7154a.f7280a != this) {
            return;
        }
        i2<? extends V> i2Var = this.b;
        m1<V> m1Var = this.f7154a;
        t8 = m1.t(i2Var);
        if (s1.k(m1Var, this, t8)) {
            m1.w(this.f7154a, false);
        }
    }
}
