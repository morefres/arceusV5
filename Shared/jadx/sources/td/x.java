package td;

import android.content.Context;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static w f32164a;

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (x.class) {
            try {
                if (f32164a == null) {
                    n1 n1Var = new n1(null);
                    n1Var.a(ee.h.a(context));
                    f32164a = n1Var.b();
                }
                wVar = f32164a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }
}
