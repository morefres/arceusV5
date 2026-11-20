package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f7075a;
    public volatile s3 b;

    /* renamed from: c, reason: collision with root package name */
    public volatile x5 f7076c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f7077d;

    public d5(x5 x5Var) {
        if (x5Var == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f7076c = x5Var;
        this.f7075a = x5Var.f();
        f4 f4Var = f4.b;
        int i10 = e3.f7081a;
        this.b = null;
        this.f7077d = false;
    }

    public final int a(int i10) {
        int v5 = a4.v(8);
        return v5 + v5 + a4.v(16) + a4.v(i10) + b(3);
    }

    public final int b(int i10) {
        return a4.v(24) + c();
    }

    public final int c() {
        int d10 = d();
        return a4.v(d10) + d10;
    }

    public final int d() {
        return this.b != null ? this.b.d() : this.f7076c.zzn();
    }

    public final s3 e() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                this.b = this.f7076c.e();
                return this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        return f().equals(obj);
    }

    public final x5 f() {
        try {
            return this.f7076c;
        } catch (f5 unused) {
            f4.b();
            return this.f7075a;
        }
    }

    public final int hashCode() {
        return f().hashCode();
    }

    public final String toString() {
        return f().toString();
    }
}
