package f1;

import android.util.Range;
import f1.a;

/* loaded from: classes.dex */
public final class c extends f1.a {

    /* renamed from: d, reason: collision with root package name */
    public final Range<Integer> f16376d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16377e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16378f;

    /* renamed from: g, reason: collision with root package name */
    public final Range<Integer> f16379g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16380h;

    public static final class b extends a.AbstractC0304a {

        /* renamed from: a, reason: collision with root package name */
        public Range<Integer> f16381a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f16382c;

        /* renamed from: d, reason: collision with root package name */
        public Range<Integer> f16383d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f16384e;

        @Override // f1.a.AbstractC0304a
        public f1.a a() {
            String str = "";
            if (this.f16381a == null) {
                str = " bitrate";
            }
            if (this.b == null) {
                str = str + " sourceFormat";
            }
            if (this.f16382c == null) {
                str = str + " source";
            }
            if (this.f16383d == null) {
                str = str + " sampleRate";
            }
            if (this.f16384e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f16381a, this.b.intValue(), this.f16382c.intValue(), this.f16383d, this.f16384e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.a.AbstractC0304a
        public a.AbstractC0304a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f16381a = range;
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public a.AbstractC0304a c(int i10) {
            this.f16384e = Integer.valueOf(i10);
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public a.AbstractC0304a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f16383d = range;
            return this;
        }

        @Override // f1.a.AbstractC0304a
        public a.AbstractC0304a e(int i10) {
            this.f16382c = Integer.valueOf(i10);
            return this;
        }

        public a.AbstractC0304a f(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // f1.a
    public Range<Integer> b() {
        return this.f16376d;
    }

    @Override // f1.a
    public int c() {
        return this.f16380h;
    }

    @Override // f1.a
    public Range<Integer> d() {
        return this.f16379g;
    }

    @Override // f1.a
    public int e() {
        return this.f16378f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.a) {
            f1.a aVar = (f1.a) obj;
            if (this.f16376d.equals(aVar.b()) && this.f16377e == aVar.f() && this.f16378f == aVar.e() && this.f16379g.equals(aVar.d()) && this.f16380h == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.a
    public int f() {
        return this.f16377e;
    }

    public int hashCode() {
        return ((((((((this.f16376d.hashCode() ^ 1000003) * 1000003) ^ this.f16377e) * 1000003) ^ this.f16378f) * 1000003) ^ this.f16379g.hashCode()) * 1000003) ^ this.f16380h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f16376d + ", sourceFormat=" + this.f16377e + ", source=" + this.f16378f + ", sampleRate=" + this.f16379g + ", channelCount=" + this.f16380h + "}";
    }

    public c(Range<Integer> range, int i10, int i11, Range<Integer> range2, int i12) {
        this.f16376d = range;
        this.f16377e = i10;
        this.f16378f = i11;
        this.f16379g = range2;
        this.f16380h = i12;
    }
}
