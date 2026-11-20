package hj;

import android.content.Context;
import mm.k;
import rg.a1;
import rg.t0;

/* loaded from: classes2.dex */
public class t implements k.b, k.a {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final t f19467a = new t();
    }

    public static t g() {
        return a.f19467a;
    }

    @Override // mm.k.b
    public void a(Context context, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        x xVar = new x();
        boolean z12 = !xVar.e(context, "AndroidNotifShowRationalePrefKey") ? z10 : z10 != xVar.b(context, "AndroidNotifShowRationalePrefKey");
        if (z10) {
            xVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        }
        if (!z11 && !z12) {
            t0.l("sysPromptDismiss", false);
        } else {
            t0.l("sysPrompt", z11);
            xVar.f(context, "AndroidNotifUserInteractedPrefKey", true);
        }
    }

    @Override // mm.k.b
    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (rh.h.a().K3() || !i(context)) {
            return f(context, new x());
        }
        return false;
    }

    @Override // mm.k.b
    public boolean c(Context context, boolean z10) {
        if (context == null || (!rh.h.a().K3() && i(context))) {
            return false;
        }
        x xVar = new x();
        if (!z10) {
            return f(context, xVar);
        }
        xVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        return false;
    }

    @Override // mm.k.b
    public boolean d(Context context) {
        if (context != null) {
            return rh.h.a().K3() || !i(context);
        }
        return false;
    }

    @Override // mm.k.a
    public boolean e(Context context) {
        if (context == null) {
            return false;
        }
        x xVar = new x();
        return xVar.e(context, "AndroidNotifUserInteractedPrefKey") && xVar.b(context, "AndroidNotifUserInteractedPrefKey");
    }

    public final boolean f(Context context, x xVar) {
        return ((xVar.e(context, "AndroidNotifShowRationalePrefKey") && xVar.b(context, "AndroidNotifShowRationalePrefKey")) || (xVar.e(context, "AndroidNotifUserInteractedPrefKey") && xVar.b(context, "AndroidNotifUserInteractedPrefKey"))) ? false : true;
    }

    public s h(Context context) {
        if (i(context)) {
            return null;
        }
        s m10 = rg.y.h().m();
        return m10 == null ? ek.t.f() ? new tg.a() : new com.roblox.client.fcm.a() : m10;
    }

    public boolean i(Context context) {
        return a1.r(context);
    }
}
