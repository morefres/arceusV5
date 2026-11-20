package fb;

import k9.a;

/* loaded from: classes.dex */
public final class p1 implements a.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f17129a;
    public final String b;

    public /* synthetic */ p1(int i10, String str, byte[] bArr) {
        this.f17129a = i10;
        this.b = str;
    }

    public static k1 a() {
        return new k1(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f17129a == p1Var.f17129a && n9.k.b(this.b, p1Var.b);
    }

    public final int hashCode() {
        return n9.k.c(Integer.valueOf(this.f17129a), this.b);
    }
}
