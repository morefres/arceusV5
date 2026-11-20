package v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.f9;
import com.google.android.gms.internal.play_billing.i9;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.m9;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.n9;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p9;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.x7;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final d f33299a;
    public final com.google.android.gms.internal.play_billing.z b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.z f33300c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f33302e;

    public /* synthetic */ p0(com.android.billingclient.api.b bVar, d dVar, int i10, s0 s0Var) {
        com.google.android.gms.internal.play_billing.c0 c0Var;
        com.google.android.gms.internal.play_billing.c0 c0Var2;
        Objects.requireNonNull(bVar);
        this.f33302e = bVar;
        c0Var = bVar.M;
        this.b = com.google.android.gms.internal.play_billing.z.c(c0Var);
        c0Var2 = bVar.M;
        this.f33300c = com.google.android.gms.internal.play_billing.z.c(c0Var2);
        this.f33299a = dVar;
        this.f33301d = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(5:(3:78|79|(13:81|82|83|84|44|45|46|47|48|49|50|52|53))|49|50|52|53)|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Transient error during initialize(), retrying in " + r12 + "ms", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        java.lang.Thread.sleep(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        java.lang.Thread.currentThread().interrupt();
        r23.l(r0, r17, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f A[EDGE_INSN: B:64:0x017f->B:65:0x017f BREAK  A[LOOP:0: B:29:0x00a9->B:59:0x015e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(v7.p0 r23) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.p0.a(v7.p0):java.lang.Object");
    }

    public static /* synthetic */ void b(p0 p0Var) {
        com.android.billingclient.api.b bVar = p0Var.f33302e;
        bVar.f0(0);
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        com.android.billingclient.api.d dVar = com.android.billingclient.api.h.f5212k;
        bVar.e0(s7Var, dVar, p0Var.f33301d);
        p0Var.k(dVar);
    }

    public final void f() {
        Object obj;
        obj = this.f33302e.f5108a;
        synchronized (obj) {
            com.google.android.gms.internal.play_billing.z zVar = this.b;
            zVar.d();
            zVar.e();
        }
    }

    public final boolean g() {
        return this.f33301d > 0;
    }

    public final Long h(boolean z10) {
        Object obj;
        Object obj2;
        try {
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception getting connection establishment duration.", th2);
        }
        if (z10) {
            obj2 = this.f33302e.f5108a;
            synchronized (obj2) {
                try {
                    com.google.android.gms.internal.play_billing.z zVar = this.b;
                    if (!zVar.g()) {
                        return null;
                    }
                    zVar.f();
                    return Long.valueOf(zVar.a(TimeUnit.MILLISECONDS));
                } finally {
                }
            }
        }
        obj = this.f33302e.f5108a;
        synchronized (obj) {
            try {
                com.google.android.gms.internal.play_billing.z zVar2 = this.f33300c;
                if (!zVar2.g()) {
                    return null;
                }
                zVar2.f();
                return Long.valueOf(zVar2.a(TimeUnit.MILLISECONDS));
            } finally {
            }
        }
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception getting connection establishment duration.", th2);
        return null;
    }

    public final void i(com.android.billingclient.api.d dVar, s7 s7Var, String str, boolean z10, int i10) {
        i1 i1Var;
        try {
            q7 C = u7.C();
            C.t(dVar.c());
            C.p(dVar.a());
            C.s(s7Var);
            C.q(i10);
            if (str != null) {
                C.o(str);
            }
            Long h10 = h(z10);
            if (!z10) {
                f9 B = i9.B();
                B.o(C);
                if (h10 != null) {
                    B.p(h10.longValue());
                }
                i1Var = this.f33302e.f5114h;
                i1Var.i((i9) B.i());
                return;
            }
            n9 B2 = p9.B();
            int i11 = this.f33301d;
            B2.o(i11 > 0);
            B2.p(i11);
            B2.r(i10);
            if (h10 != null) {
                B2.q(h10.longValue());
            }
            com.android.billingclient.api.b bVar = this.f33302e;
            j7 E = l7.E();
            E.p(C);
            E.t(6);
            E.s(B2);
            bVar.b0((l7) E.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void j(boolean z10, int i10) {
        i1 i1Var;
        try {
            Long h10 = h(z10);
            if (!z10) {
                f9 B = i9.B();
                q7 C = u7.C();
                C.t(0);
                C.q(i10);
                B.o(C);
                if (h10 != null) {
                    B.p(h10.longValue());
                }
                i1Var = this.f33302e.f5114h;
                i1Var.i((i9) B.i());
                return;
            }
            n7 C2 = p7.C();
            C2.s(6);
            n9 B2 = p9.B();
            int i11 = this.f33301d;
            B2.o(i11 > 0);
            B2.p(i11);
            B2.r(i10);
            if (h10 != null) {
                B2.q(h10.longValue());
            }
            com.android.billingclient.api.b bVar = this.f33302e;
            C2.r(B2);
            bVar.d0((p7) C2.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void k(com.android.billingclient.api.d dVar) {
        Object obj;
        int i10;
        com.android.billingclient.api.b bVar = this.f33302e;
        obj = bVar.f5108a;
        synchronized (obj) {
            try {
                i10 = bVar.b;
                if (i10 == 3) {
                    return;
                }
                try {
                    this.f33299a.a(dVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l(Exception exc, boolean z10, int i10) {
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while invoking initialize AIDL method", exc);
        s7 s7Var = exc instanceof DeadObjectException ? s7.INITIALIZE_DEAD_OBJECT_EXCEPTION : exc instanceof RemoteException ? s7.INITIALIZE_REMOTE_EXCEPTION : exc instanceof SecurityException ? s7.INITIALIZE_SECURITY_EXCEPTION : s7.INITIALIZE_SERVICE_CALL_EXCEPTION;
        String a10 = h1.a(exc);
        this.f33302e.f0(0);
        i(com.android.billingclient.api.b.F0(exc), s7Var, a10, z10, i10);
        k(com.android.billingclient.api.b.F0(exc));
    }

    public final void m(Exception exc, boolean z10) {
        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        s7 s7Var = exc instanceof DeadObjectException ? s7.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : exc instanceof RemoteException ? s7.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : exc instanceof SecurityException ? s7.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        String a10 = s7Var.equals(s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? h1.a(exc) : null;
        this.f33302e.f0(0);
        i(com.android.billingclient.api.b.F0(exc), s7Var, a10, z10, 0);
        k(com.android.billingclient.api.b.F0(exc));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i10;
        int i11;
        i1 i1Var;
        i1 i1Var2;
        com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing service died.");
        try {
            com.android.billingclient.api.b bVar = this.f33302e;
            if (com.android.billingclient.api.b.T(bVar)) {
                i1Var2 = bVar.f5114h;
                j7 E = l7.E();
                E.t(6);
                q7 C = u7.C();
                C.s(s7.BINDING_DIED);
                E.p(C);
                n9 B = p9.B();
                int i12 = this.f33301d;
                B.o(i12 > 0);
                B.p(i12);
                E.s(B);
                i1Var2.j((l7) E.i());
            } else {
                i1Var = bVar.f5114h;
                i1Var.m(x7.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
        com.android.billingclient.api.b bVar2 = this.f33302e;
        obj = bVar2.f5108a;
        synchronized (obj) {
            i10 = bVar2.b;
            if (i10 != 3) {
                i11 = bVar2.b;
                if (i11 != 0) {
                    bVar2.f0(0);
                    bVar2.h0();
                    try {
                        this.f33299a.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i10;
        Handler Y;
        com.android.billingclient.api.d x10;
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Billing service connected.");
        com.android.billingclient.api.b bVar = this.f33302e;
        obj = bVar.f5108a;
        synchronized (obj) {
            try {
                i10 = bVar.b;
                if (i10 == 3) {
                    return;
                }
                bVar.f5115i = com.google.android.gms.internal.play_billing.e.u2(iBinder);
                Callable callable = new Callable() { // from class: v7.n0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        p0.a(p0.this);
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: v7.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p0.b(p0.this);
                    }
                };
                Y = bVar.Y();
                if (com.android.billingclient.api.b.o(callable, 30000L, runnable, Y, bVar.n()) == null) {
                    int i11 = this.f33301d;
                    x10 = bVar.x();
                    bVar.e0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, x10, i11);
                    k(x10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i10;
        i1 i1Var;
        i1 i1Var2;
        com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing service disconnected.");
        try {
            com.android.billingclient.api.b bVar = this.f33302e;
            if (com.android.billingclient.api.b.T(bVar)) {
                i1Var2 = bVar.f5114h;
                j7 E = l7.E();
                E.t(6);
                q7 C = u7.C();
                C.s(s7.SERVICE_DISCONNECTED);
                E.p(C);
                n9 B = p9.B();
                int i11 = this.f33301d;
                B.o(i11 > 0);
                B.p(i11);
                E.s(B);
                i1Var2.j((l7) E.i());
            } else {
                i1Var = bVar.f5114h;
                i1Var.a(m9.C());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Unable to log.", th2);
        }
        com.android.billingclient.api.b bVar2 = this.f33302e;
        obj = bVar2.f5108a;
        synchronized (obj) {
            try {
                com.google.android.gms.internal.play_billing.z zVar = this.f33300c;
                zVar.d();
                zVar.e();
                i10 = bVar2.b;
                if (i10 == 3) {
                    return;
                }
                bVar2.f0(0);
                try {
                    this.f33299a.b();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}
