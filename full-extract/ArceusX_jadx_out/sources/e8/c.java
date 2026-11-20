package e8;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f15747c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f15748a;
    public final b b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f15749a = 0;
        public b b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f15749a, this.b);
        }

        public a b(long j10) {
            this.f15749a = j10;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    public enum b implements uf.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f15757a;

        b(int i10) {
            this.f15757a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f15757a;
        }
    }

    public c(long j10, b bVar) {
        this.f15748a = j10;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @uf.d(tag = 1)
    public long a() {
        return this.f15748a;
    }

    @uf.d(tag = 3)
    public b b() {
        return this.b;
    }
}
