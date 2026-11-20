package f1;

import f1.g1;
import g0.v2;

/* loaded from: classes.dex */
public final class m extends g1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f16447d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.a f16448e;

    /* renamed from: f, reason: collision with root package name */
    public final v2.h f16449f;

    public m(int i10, g1.a aVar, v2.h hVar) {
        this.f16447d = i10;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f16448e = aVar;
        this.f16449f = hVar;
    }

    @Override // f1.g1
    public int a() {
        return this.f16447d;
    }

    @Override // f1.g1
    public v2.h b() {
        return this.f16449f;
    }

    @Override // f1.g1
    public g1.a c() {
        return this.f16448e;
    }

    public boolean equals(Object obj) {
        v2.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f16447d == g1Var.a() && this.f16448e.equals(g1Var.c()) && ((hVar = this.f16449f) != null ? hVar.equals(g1Var.b()) : g1Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f16447d ^ 1000003) * 1000003) ^ this.f16448e.hashCode()) * 1000003;
        v2.h hVar = this.f16449f;
        return hashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f16447d + ", streamState=" + this.f16448e + ", inProgressTransformationInfo=" + this.f16449f + "}";
    }
}
