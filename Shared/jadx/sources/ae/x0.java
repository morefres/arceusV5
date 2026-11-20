package ae;

import android.content.Context;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static s0 f470a;

    public static synchronized s0 a(Context context) {
        s0 s0Var;
        synchronized (x0.class) {
            try {
                if (f470a == null) {
                    f0 f0Var = new f0(null);
                    f0Var.a(new j(be.n0.a(context)));
                    f470a = f0Var.b();
                }
                s0Var = f470a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }
}
