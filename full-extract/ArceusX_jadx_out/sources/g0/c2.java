package g0;

import g0.c2;
import n0.a1;
import n0.b4;
import n0.n3;

/* loaded from: classes.dex */
public interface c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f17803a = new c2() { // from class: g0.b2
        @Override // g0.c2
        public final c2.c e(c2.b bVar) {
            c2.c cVar;
            cVar = c2.c.f17806d;
            return cVar;
        }
    };
    public static final c2 b = new a1.b(c());

    /* renamed from: c, reason: collision with root package name */
    public static final c2 f17804c = new n0.a1(c());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c2 f17805a;
        public long b;

        public a(c2 c2Var) {
            this.f17805a = c2Var;
            this.b = c2Var.a();
        }

        public c2 a() {
            c2 c2Var = this.f17805a;
            return c2Var instanceof n3 ? ((n3) c2Var).b(this.b) : new b4(this.b, this.f17805a);
        }
    }

    public interface b {
        int m();

        Throwable n();

        long o();
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f17806d = new c(false, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final c f17807e = new c(true);

        /* renamed from: f, reason: collision with root package name */
        public static final c f17808f = new c(true, 100);

        /* renamed from: g, reason: collision with root package name */
        public static c f17809g = new c(false, 0, true);

        /* renamed from: a, reason: collision with root package name */
        public final long f17810a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f17811c;

        public c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f17810a;
        }

        public boolean c() {
            return this.f17811c;
        }

        public boolean d() {
            return this.b;
        }

        public c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        public c(boolean z10, long j10, boolean z11) {
            this.b = z10;
            this.f17810a = j10;
            if (z11) {
                x2.g.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f17811c = z11;
        }
    }

    static long c() {
        return 6000L;
    }

    default long a() {
        return 0L;
    }

    c e(b bVar);
}
