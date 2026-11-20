package j8;

import j8.e;

/* loaded from: classes.dex */
public final class a extends e {
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21525c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21526d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21527e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21528f;

    public static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f21529a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f21530c;

        /* renamed from: d, reason: collision with root package name */
        public Long f21531d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f21532e;

        @Override // j8.e.a
        public e a() {
            String str = "";
            if (this.f21529a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21530c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21531d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21532e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21529a.longValue(), this.b.intValue(), this.f21530c.intValue(), this.f21531d.longValue(), this.f21532e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j8.e.a
        public e.a b(int i10) {
            this.f21530c = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a c(long j10) {
            this.f21531d = Long.valueOf(j10);
            return this;
        }

        @Override // j8.e.a
        public e.a d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a e(int i10) {
            this.f21532e = Integer.valueOf(i10);
            return this;
        }

        @Override // j8.e.a
        public e.a f(long j10) {
            this.f21529a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j8.e
    public int b() {
        return this.f21526d;
    }

    @Override // j8.e
    public long c() {
        return this.f21527e;
    }

    @Override // j8.e
    public int d() {
        return this.f21525c;
    }

    @Override // j8.e
    public int e() {
        return this.f21528f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.b == eVar.f() && this.f21525c == eVar.d() && this.f21526d == eVar.b() && this.f21527e == eVar.c() && this.f21528f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // j8.e
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j10 = this.b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21525c) * 1000003) ^ this.f21526d) * 1000003;
        long j11 = this.f21527e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21528f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.f21525c + ", criticalSectionEnterTimeoutMs=" + this.f21526d + ", eventCleanUpAge=" + this.f21527e + ", maxBlobByteSizePerRow=" + this.f21528f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.b = j10;
        this.f21525c = i10;
        this.f21526d = i11;
        this.f21527e = j11;
        this.f21528f = i12;
    }
}
