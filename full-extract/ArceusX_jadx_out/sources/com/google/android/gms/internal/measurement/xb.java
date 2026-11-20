package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    public volatile oc f6977a;
    public volatile ha b;

    public final oc a(oc ocVar) {
        oc ocVar2 = this.f6977a;
        this.b = null;
        this.f6977a = ocVar;
        return ocVar2;
    }

    public final int b() {
        if (this.b != null) {
            return ((ga) this.b).f6506c.length;
        }
        if (this.f6977a != null) {
            return this.f6977a.a();
        }
        return 0;
    }

    public final ha c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.f6977a == null) {
                    this.b = ha.b;
                } else {
                    this.b = this.f6977a.b();
                }
                return this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
