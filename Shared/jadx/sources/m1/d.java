package m1;

import android.util.Size;
import m1.p1;
import n0.a4;

/* loaded from: classes.dex */
public final class d extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24077a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f24078c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f24079d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24080e;

    /* renamed from: f, reason: collision with root package name */
    public final q1 f24081f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24082g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24083h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24084i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24085j;

    public static final class b extends p1.a {

        /* renamed from: a, reason: collision with root package name */
        public String f24086a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public a4 f24087c;

        /* renamed from: d, reason: collision with root package name */
        public Size f24088d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f24089e;

        /* renamed from: f, reason: collision with root package name */
        public q1 f24090f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f24091g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f24092h;

        /* renamed from: i, reason: collision with root package name */
        public Integer f24093i;

        /* renamed from: j, reason: collision with root package name */
        public Integer f24094j;

        @Override // m1.p1.a
        public p1 a() {
            String str = "";
            if (this.f24086a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f24087c == null) {
                str = str + " inputTimebase";
            }
            if (this.f24088d == null) {
                str = str + " resolution";
            }
            if (this.f24089e == null) {
                str = str + " colorFormat";
            }
            if (this.f24090f == null) {
                str = str + " dataSpace";
            }
            if (this.f24091g == null) {
                str = str + " captureFrameRate";
            }
            if (this.f24092h == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f24093i == null) {
                str = str + " IFrameInterval";
            }
            if (this.f24094j == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new d(this.f24086a, this.b.intValue(), this.f24087c, this.f24088d, this.f24089e.intValue(), this.f24090f, this.f24091g.intValue(), this.f24092h.intValue(), this.f24093i.intValue(), this.f24094j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.p1.a
        public p1.a b(int i10) {
            this.f24094j = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a c(int i10) {
            this.f24091g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a d(int i10) {
            this.f24089e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a e(q1 q1Var) {
            if (q1Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f24090f = q1Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a f(int i10) {
            this.f24092h = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a g(int i10) {
            this.f24093i = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a h(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f24087c = a4Var;
            return this;
        }

        @Override // m1.p1.a
        public p1.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f24086a = str;
            return this;
        }

        @Override // m1.p1.a
        public p1.a j(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.p1.a
        public p1.a k(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f24088d = size;
            return this;
        }

        public b() {
        }

        public b(p1 p1Var) {
            this.f24086a = p1Var.b();
            this.b = Integer.valueOf(p1Var.k());
            this.f24087c = p1Var.c();
            this.f24088d = p1Var.l();
            this.f24089e = Integer.valueOf(p1Var.g());
            this.f24090f = p1Var.h();
            this.f24091g = Integer.valueOf(p1Var.f());
            this.f24092h = Integer.valueOf(p1Var.i());
            this.f24093i = Integer.valueOf(p1Var.j());
            this.f24094j = Integer.valueOf(p1Var.e());
        }
    }

    @Override // m1.p1, m1.n
    public String b() {
        return this.f24077a;
    }

    @Override // m1.p1, m1.n
    public a4 c() {
        return this.f24078c;
    }

    @Override // m1.p1
    public int e() {
        return this.f24085j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f24077a.equals(p1Var.b()) && this.b == p1Var.k() && this.f24078c.equals(p1Var.c()) && this.f24079d.equals(p1Var.l()) && this.f24080e == p1Var.g() && this.f24081f.equals(p1Var.h()) && this.f24082g == p1Var.f() && this.f24083h == p1Var.i() && this.f24084i == p1Var.j() && this.f24085j == p1Var.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.p1
    public int f() {
        return this.f24082g;
    }

    @Override // m1.p1
    public int g() {
        return this.f24080e;
    }

    @Override // m1.p1
    public q1 h() {
        return this.f24081f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f24077a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24078c.hashCode()) * 1000003) ^ this.f24079d.hashCode()) * 1000003) ^ this.f24080e) * 1000003) ^ this.f24081f.hashCode()) * 1000003) ^ this.f24082g) * 1000003) ^ this.f24083h) * 1000003) ^ this.f24084i) * 1000003) ^ this.f24085j;
    }

    @Override // m1.p1
    public int i() {
        return this.f24083h;
    }

    @Override // m1.p1
    public int j() {
        return this.f24084i;
    }

    @Override // m1.p1
    public int k() {
        return this.b;
    }

    @Override // m1.p1
    public Size l() {
        return this.f24079d;
    }

    @Override // m1.p1
    public p1.a m() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f24077a + ", profile=" + this.b + ", inputTimebase=" + this.f24078c + ", resolution=" + this.f24079d + ", colorFormat=" + this.f24080e + ", dataSpace=" + this.f24081f + ", captureFrameRate=" + this.f24082g + ", encodeFrameRate=" + this.f24083h + ", IFrameInterval=" + this.f24084i + ", bitrate=" + this.f24085j + "}";
    }

    public d(String str, int i10, a4 a4Var, Size size, int i11, q1 q1Var, int i12, int i13, int i14, int i15) {
        this.f24077a = str;
        this.b = i10;
        this.f24078c = a4Var;
        this.f24079d = size;
        this.f24080e = i11;
        this.f24081f = q1Var;
        this.f24082g = i12;
        this.f24083h = i13;
        this.f24084i = i14;
        this.f24085j = i15;
    }
}
