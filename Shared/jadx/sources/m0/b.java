package m0;

import android.util.Size;
import g0.m1;
import java.util.List;
import m0.b1;
import m0.x;

/* loaded from: classes.dex */
public final class b extends x.c {

    /* renamed from: f, reason: collision with root package name */
    public final Size f23924f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23925g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Integer> f23926h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23927i;

    /* renamed from: j, reason: collision with root package name */
    public final m1 f23928j;

    /* renamed from: k, reason: collision with root package name */
    public final k0 f23929k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.u<v0> f23930l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.u<b1.a> f23931m;

    public b(Size size, int i10, List<Integer> list, boolean z10, m1 m1Var, k0 k0Var, x0.u<v0> uVar, x0.u<b1.a> uVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f23924f = size;
        this.f23925g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f23926h = list;
        this.f23927i = z10;
        this.f23928j = m1Var;
        this.f23929k = k0Var;
        if (uVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f23930l = uVar;
        if (uVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f23931m = uVar2;
    }

    @Override // m0.x.c
    public x0.u<b1.a> b() {
        return this.f23931m;
    }

    @Override // m0.x.c
    public m1 c() {
        return this.f23928j;
    }

    @Override // m0.x.c
    public int d() {
        return this.f23925g;
    }

    @Override // m0.x.c
    public List<Integer> e() {
        return this.f23926h;
    }

    public boolean equals(Object obj) {
        m1 m1Var;
        k0 k0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.c) {
            x.c cVar = (x.c) obj;
            if (this.f23924f.equals(cVar.k()) && this.f23925g == cVar.d() && this.f23926h.equals(cVar.e()) && this.f23927i == cVar.m() && ((m1Var = this.f23928j) != null ? m1Var.equals(cVar.c()) : cVar.c() == null) && ((k0Var = this.f23929k) != null ? k0Var.equals(cVar.f()) : cVar.f() == null) && this.f23930l.equals(cVar.h()) && this.f23931m.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.x.c
    public k0 f() {
        return this.f23929k;
    }

    @Override // m0.x.c
    public x0.u<v0> h() {
        return this.f23930l;
    }

    public int hashCode() {
        int hashCode = (((((((this.f23924f.hashCode() ^ 1000003) * 1000003) ^ this.f23925g) * 1000003) ^ this.f23926h.hashCode()) * 1000003) ^ (this.f23927i ? 1231 : 1237)) * 1000003;
        m1 m1Var = this.f23928j;
        int hashCode2 = (hashCode ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        k0 k0Var = this.f23929k;
        return ((((hashCode2 ^ (k0Var != null ? k0Var.hashCode() : 0)) * 1000003) ^ this.f23930l.hashCode()) * 1000003) ^ this.f23931m.hashCode();
    }

    @Override // m0.x.c
    public Size k() {
        return this.f23924f;
    }

    @Override // m0.x.c
    public boolean m() {
        return this.f23927i;
    }

    public String toString() {
        return "In{size=" + this.f23924f + ", inputFormat=" + this.f23925g + ", outputFormats=" + this.f23926h + ", virtualCamera=" + this.f23927i + ", imageReaderProxyProvider=" + this.f23928j + ", postviewSettings=" + this.f23929k + ", requestEdge=" + this.f23930l + ", errorEdge=" + this.f23931m + "}";
    }
}
