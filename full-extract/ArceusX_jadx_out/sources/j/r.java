package j;

/* loaded from: classes.dex */
public class r {

    /* renamed from: d, reason: collision with root package name */
    public static r f21393d;

    /* renamed from: a, reason: collision with root package name */
    public long f21394a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public int f21395c;

    public static r b() {
        if (f21393d == null) {
            f21393d = new r();
        }
        return f21393d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f21395c = 1;
            this.f21394a = -1L;
            this.b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f21395c = 0;
                this.f21394a = -1L;
                this.b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f21394a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.b = round2;
            if (round2 >= j10 || this.f21394a <= j10) {
                this.f21395c = 1;
            } else {
                this.f21395c = 0;
            }
        }
    }
}
