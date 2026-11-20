package g0;

import android.util.Rational;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18082a;
    public Rational b;

    /* renamed from: c, reason: collision with root package name */
    public int f18083c;

    /* renamed from: d, reason: collision with root package name */
    public int f18084d;

    public static final class a {
        public final Rational b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18086c;

        /* renamed from: a, reason: collision with root package name */
        public int f18085a = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f18087d = 0;

        public a(Rational rational, int i10) {
            this.b = rational;
            this.f18086c = i10;
        }

        public y2 a() {
            x2.g.h(this.b, "The crop aspect ratio must be set.");
            return new y2(this.f18085a, this.b, this.f18086c, this.f18087d);
        }

        public a b(int i10) {
            this.f18087d = i10;
            return this;
        }

        public a c(int i10) {
            this.f18085a = i10;
            return this;
        }
    }

    public y2(int i10, Rational rational, int i11, int i12) {
        this.f18082a = i10;
        this.b = rational;
        this.f18083c = i11;
        this.f18084d = i12;
    }

    public Rational a() {
        return this.b;
    }

    public int b() {
        return this.f18084d;
    }

    public int c() {
        return this.f18083c;
    }

    public int d() {
        return this.f18082a;
    }
}
