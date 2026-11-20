package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f2208a = c();
    public static final w0 b = new x0();

    public static w0 a() {
        return f2208a;
    }

    public static w0 b() {
        return b;
    }

    public static w0 c() {
        if (c1.f1963d) {
            return null;
        }
        try {
            return (w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
