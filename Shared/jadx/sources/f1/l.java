package f1;

/* loaded from: classes.dex */
public final class l extends f1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16443a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16444c;

    public l(long j10, long j11, b bVar) {
        this.f16443a = j10;
        this.b = j11;
        if (bVar == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f16444c = bVar;
    }

    @Override // f1.f1
    public b a() {
        return this.f16444c;
    }

    @Override // f1.f1
    public long b() {
        return this.b;
    }

    @Override // f1.f1
    public long c() {
        return this.f16443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f16443a == f1Var.c() && this.b == f1Var.b() && this.f16444c.equals(f1Var.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f16443a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16444c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f16443a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.f16444c + "}";
    }
}
