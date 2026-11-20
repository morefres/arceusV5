package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1965a;
    public static final Class<?> b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1966c;

    static {
        f1966c = (f1965a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return b;
    }

    public static boolean c() {
        if (f1965a) {
            return true;
        }
        return (b == null || f1966c) ? false : true;
    }
}
