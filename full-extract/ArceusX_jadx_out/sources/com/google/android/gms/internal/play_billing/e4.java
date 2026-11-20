package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7082a;
    public final int b;

    public e4(Object obj, int i10) {
        this.f7082a = obj;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return this.f7082a == e4Var.f7082a && this.b == e4Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7082a) * 65535) + this.b;
    }
}
