package x5;

/* loaded from: classes.dex */
public interface a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f35240a;
    public static final b.C0651b b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f35241a;

            public a(Throwable th2) {
                this.f35241a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f35241a.getMessage() + ")";
            }
        }

        /* renamed from: x5.a0$b$b, reason: collision with other inner class name */
        public static final class C0651b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0651b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f35240a = new b.c();
        b = new b.C0651b();
    }
}
