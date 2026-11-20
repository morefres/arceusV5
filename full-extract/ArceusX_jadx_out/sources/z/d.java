package z;

import android.util.Size;
import java.util.List;
import n0.j4;
import z.u0;

/* loaded from: classes.dex */
public final class d extends u0.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f37080a;
    public final Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.o3 f37081c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.i4<?> f37082d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f37083e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.t3 f37084f;

    /* renamed from: g, reason: collision with root package name */
    public final List<j4.b> f37085g;

    public d(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<j4.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f37080a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (o3Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f37081c = o3Var;
        if (i4Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f37082d = i4Var;
        this.f37083e = size;
        this.f37084f = t3Var;
        this.f37085g = list;
    }

    @Override // z.u0.k
    public List<j4.b> c() {
        return this.f37085g;
    }

    @Override // z.u0.k
    public n0.o3 d() {
        return this.f37081c;
    }

    @Override // z.u0.k
    public n0.t3 e() {
        return this.f37084f;
    }

    public boolean equals(Object obj) {
        Size size;
        n0.t3 t3Var;
        List<j4.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0.k) {
            u0.k kVar = (u0.k) obj;
            if (this.f37080a.equals(kVar.h()) && this.b.equals(kVar.i()) && this.f37081c.equals(kVar.d()) && this.f37082d.equals(kVar.g()) && ((size = this.f37083e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((t3Var = this.f37084f) != null ? t3Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f37085g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.u0.k
    public Size f() {
        return this.f37083e;
    }

    @Override // z.u0.k
    public n0.i4<?> g() {
        return this.f37082d;
    }

    @Override // z.u0.k
    public String h() {
        return this.f37080a;
    }

    public int hashCode() {
        int hashCode = (((((((this.f37080a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f37081c.hashCode()) * 1000003) ^ this.f37082d.hashCode()) * 1000003;
        Size size = this.f37083e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        n0.t3 t3Var = this.f37084f;
        int hashCode3 = (hashCode2 ^ (t3Var == null ? 0 : t3Var.hashCode())) * 1000003;
        List<j4.b> list = this.f37085g;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // z.u0.k
    public Class<?> i() {
        return this.b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f37080a + ", useCaseType=" + this.b + ", sessionConfig=" + this.f37081c + ", useCaseConfig=" + this.f37082d + ", surfaceResolution=" + this.f37083e + ", streamSpec=" + this.f37084f + ", captureTypes=" + this.f37085g + "}";
    }
}
