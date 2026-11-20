package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f2057a = c();

    public static o a() {
        o b = b("getEmptyRegistry");
        return b != null ? b : o.f2059c;
    }

    public static final o b(String str) {
        Class<?> cls = f2057a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
