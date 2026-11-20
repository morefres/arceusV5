package v7;

import com.google.android.gms.internal.play_billing.t9;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f33287a;
    public final /* synthetic */ com.android.billingclient.api.b b;

    public m0(com.android.billingclient.api.b bVar, t9 t9Var) {
        this.f33287a = t9Var;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }

    @Override // v7.d
    public final void a(final com.android.billingclient.api.d dVar) {
        d dVar2;
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Reconnection finished with result: " + dVar.c());
        try {
            this.f33287a.b(dVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.b bVar = this.b;
        dVar2 = bVar.J;
        if (dVar2 != null) {
            bVar.R(new Runnable() { // from class: v7.l0
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar3;
                    m0 m0Var = m0.this;
                    com.android.billingclient.api.d dVar4 = dVar;
                    try {
                        dVar3 = m0Var.b.J;
                        dVar3.a(dVar4);
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            });
        }
    }

    @Override // v7.d
    public final void b() {
        d dVar;
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Reconnection attempt failed.");
        try {
            this.f33287a.b(com.android.billingclient.api.h.f5211j);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.b bVar = this.b;
        dVar = bVar.J;
        if (dVar != null) {
            bVar.R(new Runnable() { // from class: v7.k0
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar2;
                    try {
                        dVar2 = m0.this.b.J;
                        dVar2.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            });
        }
    }
}
