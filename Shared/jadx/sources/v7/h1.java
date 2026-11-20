package v7;

import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.z7;

/* loaded from: classes.dex */
public final /* synthetic */ class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33265a = 0;

    static {
        int i10 = i1.f33276a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.a0.c(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.m0.f7225a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static l7 b(s7 s7Var, int i10, com.android.billingclient.api.d dVar, String str, z7 z7Var) {
        try {
            q7 C = u7.C();
            C.t(dVar.c());
            C.p(dVar.a());
            if (dVar.b() != 0) {
                C.r(dVar.b());
            }
            if (s7Var != null) {
                C.s(s7Var);
            }
            if (str != null) {
                C.o(str);
            }
            j7 E = l7.E();
            E.p(C);
            E.t(i10);
            if (!z7Var.equals(z7.BROADCAST_ACTION_UNSPECIFIED)) {
                E.o(z7Var);
            }
            return (l7) E.i();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static p7 c(int i10, z7 z7Var) {
        try {
            n7 C = p7.C();
            C.s(i10);
            if (!z7Var.equals(z7.BROADCAST_ACTION_UNSPECIFIED)) {
                C.o(z7Var);
            }
            return (p7) C.i();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
