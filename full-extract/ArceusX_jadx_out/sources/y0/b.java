package y0;

import java.util.List;
import x0.n0;
import y0.r;

/* loaded from: classes.dex */
public final class b extends r.b {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f36194a;
    public final n0 b;

    /* renamed from: c, reason: collision with root package name */
    public final List<d> f36195c;

    public b(n0 n0Var, n0 n0Var2, List<d> list) {
        if (n0Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f36194a = n0Var;
        if (n0Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = n0Var2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f36195c = list;
    }

    @Override // y0.r.b
    public List<d> a() {
        return this.f36195c;
    }

    @Override // y0.r.b
    public n0 b() {
        return this.f36194a;
    }

    @Override // y0.r.b
    public n0 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f36194a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.f36195c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f36194a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f36195c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f36194a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.f36195c + "}";
    }
}
