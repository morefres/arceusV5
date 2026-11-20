package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public h f8477a;
    public p b;

    /* renamed from: c, reason: collision with root package name */
    public volatile s0 f8478c;

    /* renamed from: d, reason: collision with root package name */
    public volatile h f8479d;

    public void a(s0 s0Var) {
        if (this.f8478c != null) {
            return;
        }
        synchronized (this) {
            if (this.f8478c != null) {
                return;
            }
            try {
                if (this.f8477a != null) {
                    this.f8478c = s0Var.h().b(this.f8477a, this.b);
                    this.f8479d = this.f8477a;
                } else {
                    this.f8478c = s0Var;
                    this.f8479d = h.b;
                }
            } catch (b0 unused) {
                this.f8478c = s0Var;
                this.f8479d = h.b;
            }
        }
    }

    public int b() {
        if (this.f8479d != null) {
            return this.f8479d.size();
        }
        h hVar = this.f8477a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f8478c != null) {
            return this.f8478c.c();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f8478c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f8478c;
        this.f8477a = null;
        this.f8479d = null;
        this.f8478c = s0Var;
        return s0Var2;
    }

    public h e() {
        if (this.f8479d != null) {
            return this.f8479d;
        }
        h hVar = this.f8477a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f8479d != null) {
                    return this.f8479d;
                }
                if (this.f8478c == null) {
                    this.f8479d = h.b;
                } else {
                    this.f8479d = this.f8478c.b();
                }
                return this.f8479d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
