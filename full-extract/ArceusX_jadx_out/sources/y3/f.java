package y3;

import y3.b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f36336a;
    public double b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36337c;

    /* renamed from: d, reason: collision with root package name */
    public double f36338d;

    /* renamed from: e, reason: collision with root package name */
    public double f36339e;

    /* renamed from: f, reason: collision with root package name */
    public double f36340f;

    /* renamed from: g, reason: collision with root package name */
    public double f36341g;

    /* renamed from: h, reason: collision with root package name */
    public double f36342h;

    /* renamed from: i, reason: collision with root package name */
    public double f36343i;

    /* renamed from: j, reason: collision with root package name */
    public final b.p f36344j;

    public f() {
        this.f36336a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f36337c = false;
        this.f36343i = Double.MAX_VALUE;
        this.f36344j = new b.p();
    }

    public float a() {
        return (float) this.f36343i;
    }

    public final void b() {
        if (this.f36337c) {
            return;
        }
        if (this.f36343i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.b;
        if (d10 > 1.0d) {
            double d11 = this.f36336a;
            this.f36340f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.b;
            double d13 = this.f36336a;
            this.f36341g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f36342h = this.f36336a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f36337c = true;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f36339e && ((double) Math.abs(f10 - a())) < this.f36338d;
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f10;
        this.f36337c = false;
        return this;
    }

    public f e(float f10) {
        this.f36343i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f36336a = Math.sqrt(f10);
        this.f36337c = false;
        return this;
    }

    public void g(double d10) {
        double abs = Math.abs(d10);
        this.f36338d = abs;
        this.f36339e = abs * 62.5d;
    }

    public b.p h(double d10, double d11, long j10) {
        double pow;
        double cos;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f36343i;
        double d14 = this.b;
        if (d14 > 1.0d) {
            double d15 = this.f36341g;
            double d16 = this.f36340f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            pow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f36340f * d12) * d18);
            double d19 = this.f36341g;
            double pow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f36340f;
            cos = pow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f36336a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            pow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double pow3 = d23 * Math.pow(2.718281828459045d, (-this.f36336a) * d12);
            double d24 = this.f36336a;
            cos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (pow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f36342h;
            double d26 = this.f36336a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            pow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f36342h * d12) * d13) + (Math.sin(this.f36342h * d12) * d27));
            double d28 = this.f36336a;
            double d29 = this.b;
            double pow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f36342h;
            double sin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f36342h;
            cos = ((-d28) * pow * d29) + (pow4 * (sin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f36344j;
        pVar.f36333a = (float) (pow + this.f36343i);
        pVar.b = (float) cos;
        return pVar;
    }

    public f(float f10) {
        this.f36336a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f36337c = false;
        this.f36343i = Double.MAX_VALUE;
        this.f36344j = new b.p();
        this.f36343i = f10;
    }
}
