package he;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19404a;
    public static final Method b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f19405c;

    static {
        Object b10 = b();
        f19404a = b10;
        b = b10 == null ? null : a();
        f19405c = b10 != null ? d(b10) : null;
    }

    public static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    public static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Object obj) {
        try {
            Method c10 = c("getStackTraceDepth", Throwable.class);
            if (c10 == null) {
                return null;
            }
            c10.invoke(obj, new Throwable());
            return c10;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    public static RuntimeException e(Throwable th2) {
        j(th2);
        throw new RuntimeException(th2);
    }

    @Deprecated
    public static <X extends Throwable> void f(Throwable th2, Class<X> cls) {
        if (th2 != null) {
            i(th2, cls);
        }
    }

    @Deprecated
    public static void g(Throwable th2) {
        if (th2 != null) {
            j(th2);
        }
    }

    public static <X extends Throwable> void h(Throwable th2, Class<X> cls) {
        f(th2, cls);
        g(th2);
    }

    public static <X extends Throwable> void i(Throwable th2, Class<X> cls) {
        n.l(th2);
        if (cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    public static void j(Throwable th2) {
        n.l(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
