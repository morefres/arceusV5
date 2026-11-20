package n0;

import android.util.Size;
import java.util.Map;

/* loaded from: classes.dex */
public final class t extends x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Size f25553a;
    public final Map<Integer, Size> b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f25554c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f25555d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f25556e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f25557f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f25558g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Integer, Size> f25559h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<Integer, Size> f25560i;

    public t(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f25553a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f25554c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f25555d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f25556e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f25557f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null maximum4x3SizeMap");
        }
        this.f25558g = map4;
        if (map5 == null) {
            throw new NullPointerException("Null maximum16x9SizeMap");
        }
        this.f25559h = map5;
        if (map6 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f25560i = map6;
    }

    @Override // n0.x3
    public Size b() {
        return this.f25553a;
    }

    @Override // n0.x3
    public Map<Integer, Size> d() {
        return this.f25559h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x3) {
            x3 x3Var = (x3) obj;
            if (this.f25553a.equals(x3Var.b()) && this.b.equals(x3Var.n()) && this.f25554c.equals(x3Var.i()) && this.f25555d.equals(x3Var.l()) && this.f25556e.equals(x3Var.j()) && this.f25557f.equals(x3Var.h()) && this.f25558g.equals(x3Var.f()) && this.f25559h.equals(x3Var.d()) && this.f25560i.equals(x3Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.x3
    public Map<Integer, Size> f() {
        return this.f25558g;
    }

    @Override // n0.x3
    public Map<Integer, Size> h() {
        return this.f25557f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f25553a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25554c.hashCode()) * 1000003) ^ this.f25555d.hashCode()) * 1000003) ^ this.f25556e.hashCode()) * 1000003) ^ this.f25557f.hashCode()) * 1000003) ^ this.f25558g.hashCode()) * 1000003) ^ this.f25559h.hashCode()) * 1000003) ^ this.f25560i.hashCode();
    }

    @Override // n0.x3
    public Size i() {
        return this.f25554c;
    }

    @Override // n0.x3
    public Size j() {
        return this.f25556e;
    }

    @Override // n0.x3
    public Map<Integer, Size> l() {
        return this.f25555d;
    }

    @Override // n0.x3
    public Map<Integer, Size> n() {
        return this.b;
    }

    @Override // n0.x3
    public Map<Integer, Size> p() {
        return this.f25560i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f25553a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.f25554c + ", s1440pSizeMap=" + this.f25555d + ", recordSize=" + this.f25556e + ", maximumSizeMap=" + this.f25557f + ", maximum4x3SizeMap=" + this.f25558g + ", maximum16x9SizeMap=" + this.f25559h + ", ultraMaximumSizeMap=" + this.f25560i + "}";
    }
}
