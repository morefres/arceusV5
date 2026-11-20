package iv;

import iv.c;
import iv.u;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f21226a;
    public static final u b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f21227c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f21226a = null;
            b = new u();
            f21227c = new c();
        } else if (property.equals("Dalvik")) {
            f21226a = new a();
            b = new u.a();
            f21227c = new c.a();
        } else {
            f21226a = null;
            b = new u.b();
            f21227c = new c.a();
        }
    }
}
