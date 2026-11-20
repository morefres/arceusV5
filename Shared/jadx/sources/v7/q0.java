package v7;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.s7;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q0 extends com.google.android.gms.internal.play_billing.b {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f33303a;
    public final Boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f33305d;

    public /* synthetic */ q0(com.android.billingclient.api.b bVar, p0 p0Var, Boolean bool, int i10, s0 s0Var) {
        Objects.requireNonNull(bVar);
        this.f33305d = bVar;
        this.f33303a = p0Var;
        this.b = bool;
        this.f33304c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.c
    public final void N1(Bundle bundle) {
        int i10;
        Object obj;
        int i11;
        t tVar;
        t tVar2;
        com.google.android.gms.internal.play_billing.s0 s0Var;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Response bundle is null.");
            u2(this.f33303a, com.android.billingclient.api.h.f5209h, s7.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.b.booleanValue(), null, this.f33304c);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Response bundle doesn't contain a response code");
            u2(this.f33303a, com.android.billingclient.api.h.f5209h, s7.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.b.booleanValue(), null, this.f33304c);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            u2(this.f33303a, com.android.billingclient.api.h.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), s7.NON_OK_CODE_RETURNED_BY_PHONESKY, this.b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.f33304c);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing API version not found in response bundle.");
            u2(this.f33303a, com.android.billingclient.api.h.f5209h, s7.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.b.booleanValue(), null, this.f33304c);
            return;
        }
        int i12 = bundle.getInt("BILLING_API_VERSION_KEY");
        com.android.billingclient.api.b bVar = this.f33305d;
        com.android.billingclient.api.b.N(bVar, i12);
        bVar.f5118l = i12 >= 5;
        bVar.f5117k = i12 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                l1.g(bundle2.getBoolean("DELEGATION_API_ENABLED_KEY"));
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                l1.f(bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                l1.d(bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                l1.e(bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"));
            } catch (Throwable th5) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            com.google.android.gms.internal.play_billing.r0 r0Var = new com.google.android.gms.internal.play_billing.r0();
            for (h2 h2Var : h2.values()) {
                if (bundle3.getBoolean(h2Var.name(), false)) {
                    r0Var.b(h2Var);
                }
            }
            com.android.billingclient.api.b bVar2 = this.f33305d;
            bVar2.I = r0Var.c();
            tVar = bVar2.f5112f;
            if (tVar != null) {
                tVar2 = bVar2.f5112f;
                s0Var = bVar2.I;
                tVar2.i(s0Var);
            }
        }
        com.android.billingclient.api.b bVar3 = this.f33305d;
        i10 = bVar3.f5119m;
        if (i10 < 3) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
            u2(this.f33303a, com.android.billingclient.api.h.b, s7.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.b.booleanValue(), null, this.f33304c);
            return;
        }
        p0 p0Var = this.f33303a;
        Boolean bool = this.b;
        int i13 = this.f33304c;
        boolean booleanValue = bool.booleanValue();
        com.android.billingclient.api.b.P(bVar3, 0);
        obj = bVar3.f5108a;
        synchronized (obj) {
            try {
                i11 = bVar3.b;
                if (i11 == 3) {
                    return;
                }
                p0Var.j(booleanValue, i13);
                p0Var.k(com.android.billingclient.api.h.f5210i);
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public final void u2(p0 p0Var, com.android.billingclient.api.d dVar, s7 s7Var, boolean z10, String str, int i10) {
        this.f33305d.f0(0);
        p0Var.i(dVar, s7Var, str, z10, i10);
        p0Var.k(dVar);
    }
}
