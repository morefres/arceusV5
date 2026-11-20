package m0;

import java.util.List;
import m0.u0;

/* loaded from: classes.dex */
public final class g extends u0.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0.u<u0.b> f23953a;
    public final x0.u<u0.b> b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23954c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Integer> f23955d;

    public g(x0.u<u0.b> uVar, x0.u<u0.b> uVar2, int i10, List<Integer> list) {
        if (uVar == null) {
            throw new NullPointerException("Null edge");
        }
        this.f23953a = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.b = uVar2;
        this.f23954c = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f23955d = list;
    }

    @Override // m0.u0.a
    public x0.u<u0.b> a() {
        return this.f23953a;
    }

    @Override // m0.u0.a
    public int b() {
        return this.f23954c;
    }

    @Override // m0.u0.a
    public List<Integer> c() {
        return this.f23955d;
    }

    @Override // m0.u0.a
    public x0.u<u0.b> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0.a) {
            u0.a aVar = (u0.a) obj;
            if (this.f23953a.equals(aVar.a()) && this.b.equals(aVar.d()) && this.f23954c == aVar.b() && this.f23955d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f23953a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23954c) * 1000003) ^ this.f23955d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f23953a + ", postviewEdge=" + this.b + ", inputFormat=" + this.f23954c + ", outputFormats=" + this.f23955d + "}";
    }
}
