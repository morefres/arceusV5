package g6;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import y5.f1;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18374a = x5.w.i("EnqueueRunnable");

    public static boolean a(y5.f0 f0Var) {
        f1 h10 = f0Var.h();
        WorkDatabase u8 = h10.u();
        u8.i();
        try {
            k.a(u8, h10.n(), f0Var);
            boolean e10 = e(f0Var);
            u8.V();
            return e10;
        } finally {
            u8.p();
        }
    }

    public static void b(y5.f0 f0Var) {
        if (!f0Var.i()) {
            if (a(f0Var)) {
                f(f0Var);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + f0Var + ")");
        }
    }

    public static boolean c(y5.f0 f0Var) {
        boolean d10 = d(f0Var.h(), f0Var.g(), (String[]) y5.f0.m(f0Var).toArray(new String[0]), f0Var.e(), f0Var.c());
        f0Var.l();
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(y5.f1 r18, java.util.List<? extends x5.q0> r19, java.lang.String[] r20, java.lang.String r21, x5.j r22) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.j.d(y5.f1, java.util.List, java.lang.String[], java.lang.String, x5.j):boolean");
    }

    public static boolean e(y5.f0 f0Var) {
        List<y5.f0> f10 = f0Var.f();
        boolean z10 = false;
        if (f10 != null) {
            for (y5.f0 f0Var2 : f10) {
                if (f0Var2.k()) {
                    x5.w.e().k(f18374a, "Already enqueued work ids (" + TextUtils.join(", ", f0Var2.d()) + ")");
                } else {
                    z10 |= e(f0Var2);
                }
            }
        }
        return c(f0Var) | z10;
    }

    public static void f(y5.f0 f0Var) {
        f1 h10 = f0Var.h();
        y5.x.f(h10.n(), h10.u(), h10.s());
    }
}
