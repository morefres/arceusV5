package f1;

/* loaded from: classes.dex */
public final class d extends b {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final double f16391c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16392d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f16393e;

    public d(int i10, double d10, long j10, Throwable th2) {
        this.b = i10;
        this.f16391c = d10;
        this.f16392d = j10;
        this.f16393e = th2;
    }

    @Override // f1.b
    public double a() {
        return this.f16391c;
    }

    @Override // f1.b
    public long b() {
        return this.f16392d;
    }

    @Override // f1.b
    public int c() {
        return this.b;
    }

    @Override // f1.b
    public Throwable d() {
        return this.f16393e;
    }

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b == bVar.c() && Double.doubleToLongBits(this.f16391c) == Double.doubleToLongBits(bVar.a()) && this.f16392d == bVar.b() && ((th2 = this.f16393e) != null ? th2.equals(bVar.d()) : bVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = (((this.b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f16391c) >>> 32) ^ Double.doubleToLongBits(this.f16391c)))) * 1000003;
        long j10 = this.f16392d;
        int i10 = (doubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th2 = this.f16393e;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.f16391c + ", audioBytesRecorded=" + this.f16392d + ", errorCause=" + this.f16393e + "}";
    }
}
