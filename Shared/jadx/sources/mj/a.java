package mj;

import android.content.Context;
import ek.w;
import hj.r;
import hj.t;
import hj.x;
import java.util.Map;
import rg.t0;

/* loaded from: classes2.dex */
public class a {
    public String a(Context context, String str, x xVar) {
        return xVar.a(context, str);
    }

    public final String b(Context context) {
        return w.a(context);
    }

    public final x c() {
        return new x();
    }

    public void d(Context context, Map<String, String> map) {
        if (context == null || map == null || t.g().i(context)) {
            return;
        }
        ti.b.f().k(context);
        ci.c.e(context);
        String a10 = a(context, r.k().n(context), c());
        String b = b(context);
        nj.f a11 = new m().a(map);
        if (a11.k() && b.equals("foreground")) {
            return;
        }
        t0.t("v" + a11.o(), a10, a11.c(), a11.getId(), b, a11.o(), a11.b());
        t0.u("v" + a11.o(), a11, null);
        c a12 = new n().a(a11);
        if (a12 != null) {
            a12.a(context, a11);
        }
    }
}
