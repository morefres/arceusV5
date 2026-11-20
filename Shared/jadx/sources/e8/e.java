package e8;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f15761c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f15762a;
    public final long b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f15763a = 0;
        public long b = 0;

        public e a() {
            return new e(this.f15763a, this.b);
        }

        public a b(long j10) {
            this.f15763a = j10;
            return this;
        }

        public a c(long j10) {
            this.b = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f15762a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @uf.d(tag = 1)
    public long a() {
        return this.f15762a;
    }

    @uf.d(tag = 2)
    public long b() {
        return this.b;
    }
}
