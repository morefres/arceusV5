package eb;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15795a = new Object();
    public static volatile h b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f15796c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile h f15797d;

    public static void a() {
        f15796c = true;
    }

    public static void b() {
        if (f15797d == null) {
            f15797d = new h(null);
        }
    }

    public static void c() {
        if (b == null) {
            b = new h(null);
        }
    }

    public static boolean d() {
        synchronized (f15795a) {
        }
        return false;
    }
}
