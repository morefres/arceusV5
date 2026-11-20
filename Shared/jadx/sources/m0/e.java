package m0;

import g0.f1;
import m0.f0;

/* loaded from: classes.dex */
public final class e extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0.b0<byte[]> f23944a;
    public final f1.h b;

    public e(x0.b0<byte[]> b0Var, f1.h hVar) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f23944a = b0Var;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.b = hVar;
    }

    @Override // m0.f0.a
    public f1.h a() {
        return this.b;
    }

    @Override // m0.f0.a
    public x0.b0<byte[]> b() {
        return this.f23944a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a) {
            f0.a aVar = (f0.a) obj;
            if (this.f23944a.equals(aVar.b()) && this.b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23944a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f23944a + ", outputFileOptions=" + this.b + "}";
    }
}
