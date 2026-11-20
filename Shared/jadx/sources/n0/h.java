package n0;

import android.util.Range;
import android.util.Size;
import java.util.List;
import n0.j4;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceConfig f25357a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f25358c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.k0 f25359d;

    /* renamed from: e, reason: collision with root package name */
    public final List<j4.b> f25360e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f25361f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25362g;

    /* renamed from: h, reason: collision with root package name */
    public final Range<Integer> f25363h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25364i;

    public h(SurfaceConfig surfaceConfig, int i10, Size size, g0.k0 k0Var, List<j4.b> list, n1 n1Var, int i11, Range<Integer> range, boolean z10) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f25357a = surfaceConfig;
        this.b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f25358c = size;
        if (k0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f25359d = k0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f25360e = list;
        this.f25361f = n1Var;
        this.f25362g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f25363h = range;
        this.f25364i = z10;
    }

    @Override // n0.g
    public List<j4.b> b() {
        return this.f25360e;
    }

    @Override // n0.g
    public g0.k0 c() {
        return this.f25359d;
    }

    @Override // n0.g
    public int d() {
        return this.b;
    }

    @Override // n0.g
    public n1 e() {
        return this.f25361f;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f25357a.equals(gVar.h()) && this.b == gVar.d() && this.f25358c.equals(gVar.g()) && this.f25359d.equals(gVar.c()) && this.f25360e.equals(gVar.b()) && ((n1Var = this.f25361f) != null ? n1Var.equals(gVar.e()) : gVar.e() == null) && this.f25362g == gVar.f() && this.f25363h.equals(gVar.i()) && this.f25364i == gVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.g
    public int f() {
        return this.f25362g;
    }

    @Override // n0.g
    public Size g() {
        return this.f25358c;
    }

    @Override // n0.g
    public SurfaceConfig h() {
        return this.f25357a;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f25357a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f25358c.hashCode()) * 1000003) ^ this.f25359d.hashCode()) * 1000003) ^ this.f25360e.hashCode()) * 1000003;
        n1 n1Var = this.f25361f;
        return ((((((hashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ this.f25362g) * 1000003) ^ this.f25363h.hashCode()) * 1000003) ^ (this.f25364i ? 1231 : 1237);
    }

    @Override // n0.g
    public Range<Integer> i() {
        return this.f25363h;
    }

    @Override // n0.g
    public boolean j() {
        return this.f25364i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f25357a + ", imageFormat=" + this.b + ", size=" + this.f25358c + ", dynamicRange=" + this.f25359d + ", captureTypes=" + this.f25360e + ", implementationOptions=" + this.f25361f + ", sessionType=" + this.f25362g + ", targetFrameRate=" + this.f25363h + ", strictFrameRateRequired=" + this.f25364i + "}";
    }
}
