package i1;

import i1.a;

/* loaded from: classes.dex */
public final class u extends i1.a {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20146d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20148f;

    public static final class b extends a.AbstractC0354a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f20149a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f20150c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f20151d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f20152e;

        @Override // i1.a.AbstractC0354a
        public i1.a a() {
            String str = "";
            if (this.f20149a == null) {
                str = " audioSource";
            }
            if (this.b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f20150c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f20151d == null) {
                str = str + " channelCount";
            }
            if (this.f20152e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f20149a.intValue(), this.b.intValue(), this.f20150c.intValue(), this.f20151d.intValue(), this.f20152e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i1.a.AbstractC0354a
        public a.AbstractC0354a c(int i10) {
            this.f20152e = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public a.AbstractC0354a d(int i10) {
            this.f20149a = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public a.AbstractC0354a e(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public a.AbstractC0354a f(int i10) {
            this.f20151d = Integer.valueOf(i10);
            return this;
        }

        @Override // i1.a.AbstractC0354a
        public a.AbstractC0354a g(int i10) {
            this.f20150c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // i1.a
    public int b() {
        return this.f20148f;
    }

    @Override // i1.a
    public int c() {
        return this.b;
    }

    @Override // i1.a
    public int e() {
        return this.f20145c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1.a) {
            i1.a aVar = (i1.a) obj;
            if (this.b == aVar.c() && this.f20145c == aVar.e() && this.f20146d == aVar.g() && this.f20147e == aVar.f() && this.f20148f == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.a
    public int f() {
        return this.f20147e;
    }

    @Override // i1.a
    public int g() {
        return this.f20146d;
    }

    public int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.f20145c) * 1000003) ^ this.f20146d) * 1000003) ^ this.f20147e) * 1000003) ^ this.f20148f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.b + ", captureSampleRate=" + this.f20145c + ", encodeSampleRate=" + this.f20146d + ", channelCount=" + this.f20147e + ", audioFormat=" + this.f20148f + "}";
    }

    public u(int i10, int i11, int i12, int i13, int i14) {
        this.b = i10;
        this.f20145c = i11;
        this.f20146d = i12;
        this.f20147e = i13;
        this.f20148f = i14;
    }
}
