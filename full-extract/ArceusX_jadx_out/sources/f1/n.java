package f1;

import android.util.Range;
import f1.c2;

/* loaded from: classes.dex */
public final class n extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final a0 f16452c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16453d;

    /* renamed from: e, reason: collision with root package name */
    public final Range<Integer> f16454e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16455f;

    public static final class b extends c2.a {

        /* renamed from: a, reason: collision with root package name */
        public a0 f16456a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Range<Integer> f16457c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f16458d;

        @Override // f1.c2.a
        public c2 a() {
            String str = "";
            if (this.f16456a == null) {
                str = " qualitySelector";
            }
            if (this.b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f16457c == null) {
                str = str + " bitrate";
            }
            if (this.f16458d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new n(this.f16456a, this.b.intValue(), this.f16457c, this.f16458d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.c2.a
        public c2.a b(int i10) {
            this.f16458d = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f16457c = range;
            return this;
        }

        @Override // f1.c2.a
        public c2.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.c2.a
        public c2.a e(a0 a0Var) {
            if (a0Var == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f16456a = a0Var;
            return this;
        }

        public b() {
        }

        public b(c2 c2Var) {
            this.f16456a = c2Var.e();
            this.b = Integer.valueOf(c2Var.d());
            this.f16457c = c2Var.c();
            this.f16458d = Integer.valueOf(c2Var.b());
        }
    }

    @Override // f1.c2
    public int b() {
        return this.f16455f;
    }

    @Override // f1.c2
    public Range<Integer> c() {
        return this.f16454e;
    }

    @Override // f1.c2
    public int d() {
        return this.f16453d;
    }

    @Override // f1.c2
    public a0 e() {
        return this.f16452c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f16452c.equals(c2Var.e()) && this.f16453d == c2Var.d() && this.f16454e.equals(c2Var.c()) && this.f16455f == c2Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.c2
    public c2.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f16452c.hashCode() ^ 1000003) * 1000003) ^ this.f16453d) * 1000003) ^ this.f16454e.hashCode()) * 1000003) ^ this.f16455f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f16452c + ", encodeFrameRate=" + this.f16453d + ", bitrate=" + this.f16454e + ", aspectRatio=" + this.f16455f + "}";
    }

    public n(a0 a0Var, int i10, Range<Integer> range, int i11) {
        this.f16452c = a0Var;
        this.f16453d = i10;
        this.f16454e = range;
        this.f16455f = i11;
    }
}
