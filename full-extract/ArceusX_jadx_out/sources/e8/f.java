package e8;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f15764c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f15765a;
    public final long b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f15766a = 0;
        public long b = 0;

        public f a() {
            return new f(this.f15766a, this.b);
        }

        public a b(long j10) {
            this.b = j10;
            return this;
        }

        public a c(long j10) {
            this.f15766a = j10;
            return this;
        }
    }

    public f(long j10, long j11) {
        this.f15765a = j10;
        this.b = j11;
    }

    public static a c() {
        return new a();
    }

    @uf.d(tag = 2)
    public long a() {
        return this.b;
    }

    @uf.d(tag = 1)
    public long b() {
        return this.f15765a;
    }
}
