package v7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.a8;
import com.google.android.gms.internal.play_billing.d8;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.e9;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.i9;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.m9;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p8;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.v8;
import com.google.android.gms.internal.play_billing.x7;
import com.google.android.gms.internal.play_billing.x8;
import com.google.android.gms.internal.play_billing.z7;

/* loaded from: classes.dex */
public final class m1 implements i1 {
    public h8 b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f33288c;

    public m1(Context context, h8 h8Var) {
        this.f33288c = new o1(context);
        this.b = h8Var;
    }

    @Override // v7.i1
    public final void a(m9 m9Var) {
        if (m9Var == null) {
            return;
        }
        try {
            v8 D = x8.D();
            D.t(this.b);
            D.w(m9Var);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void b(l7 l7Var, int i10, long j10, boolean z10) {
        h8 h8Var;
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.o(z10);
            j7Var.r(p8Var);
            l7 l7Var2 = (l7) j7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var2 = (e8) this.b.s();
                e8Var2.s(j10);
                h8Var = (h8) e8Var2.i();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void c(p7 p7Var) {
        try {
            p(p7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void d(e9 e9Var) {
        try {
            v8 D = x8.D();
            D.t(this.b);
            a8 B = d8.B();
            B.q("ProxyBillingBroadcastReceiver");
            B.s(2);
            B.r(e9Var);
            D.r(B);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void e(p7 p7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            c(p7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void f(com.android.billingclient.api.d dVar, long j10) {
        h8 h8Var;
        try {
            a8 B = d8.B();
            B.s(4);
            B.o(z7.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (dVar != null) {
                q7 C = u7.C();
                C.t(dVar.c());
                C.p(dVar.a());
                B.p(C);
            }
            v8 D = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            D.t(h8Var);
            D.r(B);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void g(p7 p7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            n7 n7Var = (n7) p7Var.s();
            p8 p8Var = (p8) p7Var.E().s();
            p8Var.o(z10);
            n7Var.q(p8Var);
            p7 p7Var2 = (p7) n7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            p(p7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void h(long j10) {
        h8 h8Var;
        try {
            a8 B = d8.B();
            B.s(4);
            B.o(z7.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            d8 d8Var = (d8) B.i();
            v8 D = x8.D();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            D.t(h8Var);
            D.s(d8Var);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void i(i9 i9Var) {
        try {
            o1 o1Var = this.f33288c;
            v8 D = x8.D();
            D.t(this.b);
            D.v(i9Var);
            o1Var.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void j(l7 l7Var) {
        try {
            o(l7Var, this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void k(l7 l7Var, int i10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            this.b = (h8) e8Var.i();
            j(l7Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void l(l7 l7Var, long j10, boolean z10) {
        h8 h8Var;
        try {
            j7 j7Var = (j7) l7Var.s();
            p8 p8Var = (p8) l7Var.H().s();
            p8Var.o(z10);
            j7Var.r(p8Var);
            l7 l7Var2 = (l7) j7Var.i();
            if (j10 == 0) {
                h8Var = this.b;
            } else {
                e8 e8Var = (e8) this.b.s();
                e8Var.s(j10);
                h8Var = (h8) e8Var.i();
            }
            o(l7Var2, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void m(x7 x7Var) {
        try {
            v8 D = x8.D();
            D.t(this.b);
            D.q(x7Var);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // v7.i1
    public final void n(l7 l7Var, int i10, long j10) {
        try {
            e8 e8Var = (e8) this.b.s();
            e8Var.q(i10);
            h8 h8Var = (h8) e8Var.i();
            this.b = h8Var;
            if (j10 != 0) {
                e8 e8Var2 = (e8) h8Var.s();
                e8Var2.s(j10);
                h8Var = (h8) e8Var2.i();
            }
            o(l7Var, h8Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void o(l7 l7Var, h8 h8Var) {
        if (l7Var == null) {
            return;
        }
        try {
            v8 D = x8.D();
            D.t(h8Var);
            D.o(l7Var);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void p(p7 p7Var, h8 h8Var) {
        if (p7Var == null) {
            return;
        }
        try {
            v8 D = x8.D();
            D.t(h8Var);
            D.p(p7Var);
            this.f33288c.a((x8) D.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to log.", th2);
        }
    }
}
