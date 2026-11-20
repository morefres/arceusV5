package yj;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f36678a = new AtomicBoolean(false);

    public static tk.b a() {
        ek.f fVar = new ek.f();
        String H = rg.a1.H();
        String F = rg.a1.F();
        return new tk.b(rg.a1.O(), fVar.b(H), F != null ? fVar.b(F) : "api");
    }

    public static void b(Context context) {
        if (f36678a.compareAndSet(false, true)) {
            tk.g.j(rg.a1.a1());
            tk.g.g(a());
            tk.g.f(new ci.t());
            tk.g.h(new uk.c());
        }
    }

    public static void c(Context context) {
        rg.a1.i0(context, new fh.d(context).a(context));
    }
}
