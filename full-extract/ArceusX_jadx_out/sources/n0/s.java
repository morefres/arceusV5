package n0;

import android.util.Range;
import android.util.Size;
import n0.t3;

/* loaded from: classes.dex */
public final class s extends t3 {
    public final Size b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f25526c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.k0 f25527d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25528e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f25529f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f25530g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25531h;

    public static final class b extends t3.a {

        /* renamed from: a, reason: collision with root package name */
        public Size f25532a;
        public Size b;

        /* renamed from: c, reason: collision with root package name */
        public g0.k0 f25533c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f25534d;

        /* renamed from: e, reason: collision with root package name */
        public Range<Integer> f25535e;

        /* renamed from: f, reason: collision with root package name */
        public n1 f25536f;

        /* renamed from: g, reason: collision with root package name */
        public Boolean f25537g;

        @Override // n0.t3.a
        public t3 a() {
            String str = "";
            if (this.f25532a == null) {
                str = " resolution";
            }
            if (this.b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f25533c == null) {
                str = str + " dynamicRange";
            }
            if (this.f25534d == null) {
                str = str + " sessionType";
            }
            if (this.f25535e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f25537g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new s(this.f25532a, this.b, this.f25533c, this.f25534d.intValue(), this.f25535e, this.f25536f, this.f25537g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n0.t3.a
        public t3.a b(g0.k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f25533c = k0Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f25535e = range;
            return this;
        }

        @Override // n0.t3.a
        public t3.a d(n1 n1Var) {
            this.f25536f = n1Var;
            return this;
        }

        @Override // n0.t3.a
        public t3.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.b = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f25532a = size;
            return this;
        }

        @Override // n0.t3.a
        public t3.a g(int i10) {
            this.f25534d = Integer.valueOf(i10);
            return this;
        }

        @Override // n0.t3.a
        public t3.a h(boolean z10) {
            this.f25537g = Boolean.valueOf(z10);
            return this;
        }

        public b() {
        }

        public b(t3 t3Var) {
            this.f25532a = t3Var.f();
            this.b = t3Var.e();
            this.f25533c = t3Var.b();
            this.f25534d = Integer.valueOf(t3Var.g());
            this.f25535e = t3Var.c();
            this.f25536f = t3Var.d();
            this.f25537g = Boolean.valueOf(t3Var.h());
        }
    }

    @Override // n0.t3
    public g0.k0 b() {
        return this.f25527d;
    }

    @Override // n0.t3
    public Range<Integer> c() {
        return this.f25529f;
    }

    @Override // n0.t3
    public n1 d() {
        return this.f25530g;
    }

    @Override // n0.t3
    public Size e() {
        return this.f25526c;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (this.b.equals(t3Var.f()) && this.f25526c.equals(t3Var.e()) && this.f25527d.equals(t3Var.b()) && this.f25528e == t3Var.g() && this.f25529f.equals(t3Var.c()) && ((n1Var = this.f25530g) != null ? n1Var.equals(t3Var.d()) : t3Var.d() == null) && this.f25531h == t3Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.t3
    public Size f() {
        return this.b;
    }

    @Override // n0.t3
    public int g() {
        return this.f25528e;
    }

    @Override // n0.t3
    public boolean h() {
        return this.f25531h;
    }

    public int hashCode() {
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f25526c.hashCode()) * 1000003) ^ this.f25527d.hashCode()) * 1000003) ^ this.f25528e) * 1000003) ^ this.f25529f.hashCode()) * 1000003;
        n1 n1Var = this.f25530g;
        return ((hashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ (this.f25531h ? 1231 : 1237);
    }

    @Override // n0.t3
    public t3.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.b + ", originalConfiguredResolution=" + this.f25526c + ", dynamicRange=" + this.f25527d + ", sessionType=" + this.f25528e + ", expectedFrameRateRange=" + this.f25529f + ", implementationOptions=" + this.f25530g + ", zslDisabled=" + this.f25531h + "}";
    }

    public s(Size size, Size size2, g0.k0 k0Var, int i10, Range<Integer> range, n1 n1Var, boolean z10) {
        this.b = size;
        this.f25526c = size2;
        this.f25527d = k0Var;
        this.f25528e = i10;
        this.f25529f = range;
        this.f25530g = n1Var;
        this.f25531h = z10;
    }
}
