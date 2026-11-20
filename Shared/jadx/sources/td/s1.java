package td;

import android.content.Context;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static l1 f32158a;

    public static synchronized l1 a(Context context) {
        l1 l1Var;
        synchronized (s1.class) {
            try {
                if (f32158a == null) {
                    j1 j1Var = new j1(null);
                    j1Var.a(ee.h.a(context));
                    f32158a = j1Var.b();
                }
                l1Var = f32158a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l1Var;
    }
}
