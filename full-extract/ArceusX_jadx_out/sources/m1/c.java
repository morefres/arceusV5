package m1;

import m1.a;
import n0.a4;

/* loaded from: classes.dex */
public final class c extends m1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24063a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f24064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24067f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24068g;

    public static final class b extends a.AbstractC0419a {

        /* renamed from: a, reason: collision with root package name */
        public String f24069a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public a4 f24070c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f24071d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f24072e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f24073f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f24074g;

        @Override // m1.a.AbstractC0419a
        public m1.a a() {
            String str = "";
            if (this.f24069a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (this.f24070c == null) {
                str = str + " inputTimebase";
            }
            if (this.f24071d == null) {
                str = str + " bitrate";
            }
            if (this.f24072e == null) {
                str = str + " captureSampleRate";
            }
            if (this.f24073f == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f24074g == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f24069a, this.b.intValue(), this.f24070c, this.f24071d.intValue(), this.f24072e.intValue(), this.f24073f.intValue(), this.f24074g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a c(int i10) {
            this.f24071d = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a d(int i10) {
            this.f24072e = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a e(int i10) {
            this.f24074g = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a f(int i10) {
            this.f24073f = Integer.valueOf(i10);
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a g(a4 a4Var) {
            if (a4Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f24070c = a4Var;
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f24069a = str;
            return this;
        }

        @Override // m1.a.AbstractC0419a
        public a.AbstractC0419a i(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // m1.a, m1.n
    public String b() {
        return this.f24063a;
    }

    @Override // m1.a, m1.n
    public a4 c() {
        return this.f24064c;
    }

    @Override // m1.a
    public int e() {
        return this.f24065d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1.a) {
            m1.a aVar = (m1.a) obj;
            if (this.f24063a.equals(aVar.b()) && this.b == aVar.i() && this.f24064c.equals(aVar.c()) && this.f24065d == aVar.e() && this.f24066e == aVar.f() && this.f24067f == aVar.h() && this.f24068g == aVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.a
    public int f() {
        return this.f24066e;
    }

    @Override // m1.a
    public int g() {
        return this.f24068g;
    }

    @Override // m1.a
    public int h() {
        return this.f24067f;
    }

    public int hashCode() {
        return ((((((((((((this.f24063a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24064c.hashCode()) * 1000003) ^ this.f24065d) * 1000003) ^ this.f24066e) * 1000003) ^ this.f24067f) * 1000003) ^ this.f24068g;
    }

    @Override // m1.a
    public int i() {
        return this.b;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f24063a + ", profile=" + this.b + ", inputTimebase=" + this.f24064c + ", bitrate=" + this.f24065d + ", captureSampleRate=" + this.f24066e + ", encodeSampleRate=" + this.f24067f + ", channelCount=" + this.f24068g + "}";
    }

    public c(String str, int i10, a4 a4Var, int i11, int i12, int i13, int i14) {
        this.f24063a = str;
        this.b = i10;
        this.f24064c = a4Var;
        this.f24065d = i11;
        this.f24066e = i12;
        this.f24067f = i13;
        this.f24068g = i14;
    }
}
