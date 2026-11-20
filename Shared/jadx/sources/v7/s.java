package v7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.z7;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33310a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f33311c;

    public s(t tVar, boolean z10) {
        Objects.requireNonNull(tVar);
        this.f33311c = tVar;
        this.b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f33310a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f33310a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        s sVar;
        try {
            try {
                if (this.f33310a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    sVar = this;
                    context.registerReceiver(sVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    sVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                sVar.f33310a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, com.android.billingclient.api.d dVar, int i10, z7 z7Var, long j10, boolean z10) {
        i1 i1Var;
        i1 i1Var2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                i1Var2 = this.f33311c.f33314c;
                i1Var2.l(l7.G(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                i1Var = this.f33311c.f33314c;
                i1Var.l(h1.b(s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, dVar, null, z7Var), j10, z10);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z7 z7Var;
        int i10;
        int i11;
        com.android.billingclient.api.d h10;
        com.google.android.gms.internal.play_billing.s0 s0Var;
        m mVar;
        i1 i1Var;
        i1 i1Var2;
        m mVar2;
        m mVar3;
        int intValue;
        i1 i1Var3;
        m mVar4;
        m mVar5;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                z7Var = z7.PURCHASES_UPDATED_ACTION;
            }
            z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                z7Var = z7.ALTERNATIVE_BILLING_ACTION;
            }
            z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                z7Var = z7.LOCAL_PURCHASES_UPDATED_ACTION;
            }
            z7Var = z7.BROADCAST_ACTION_UNSPECIFIED;
        }
        z7 z7Var2 = z7Var;
        z7 z7Var3 = z7.LOCAL_PURCHASES_UPDATED_ACTION;
        if (z7Var2.equals(z7Var3) || z7Var2.equals(z7.ALTERNATIVE_BILLING_ACTION)) {
            i10 = 2;
            i11 = 2;
        } else {
            i11 = z7Var2.equals(z7.PURCHASES_UPDATED_ACTION) ? 32 : 1;
            i10 = 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Bundle is null.");
            t tVar = this.f33311c;
            i1Var3 = tVar.f33314c;
            s7 s7Var = s7.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.h.f5209h;
            i1Var3.j(h1.b(s7Var, i11, dVar, null, z7Var2));
            mVar4 = tVar.b;
            if (mVar4 != null) {
                mVar5 = tVar.b;
                mVar5.a(dVar, null);
            }
        } else {
            if (i11 == i10) {
                int i12 = com.google.android.gms.internal.play_billing.m0.f7225a;
                d.a d10 = com.android.billingclient.api.d.d();
                d10.d(com.google.android.gms.internal.play_billing.m0.b(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        com.google.android.gms.internal.play_billing.m0.l("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else if (obj instanceof Integer) {
                        intValue = ((Integer) obj).intValue();
                        d10.c(intValue);
                        d10.b(com.google.android.gms.internal.play_billing.m0.i(intent.getExtras(), "BillingBroadcastManager"));
                        h10 = d10.a();
                    } else {
                        com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                }
                intValue = 0;
                d10.c(intValue);
                d10.b(com.google.android.gms.internal.play_billing.m0.i(intent.getExtras(), "BillingBroadcastManager"));
                h10 = d10.a();
            } else {
                h10 = com.google.android.gms.internal.play_billing.m0.h(intent, "BillingBroadcastManager");
            }
            long j10 = extras.getLong("billingClientTransactionId", 0L);
            boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (z7Var2.equals(z7.PURCHASES_UPDATED_ACTION) || z7Var2.equals(z7Var3)) {
                com.android.billingclient.api.d dVar2 = h10;
                t tVar2 = this.f33311c;
                s0Var = tVar2.f33318g;
                List<k> k10 = com.google.android.gms.internal.play_billing.m0.k(extras, s0Var);
                if (dVar2.c() == 0) {
                    i1Var = tVar2.f33314c;
                    i1Var.g(h1.c(i11, z7Var2), j10, z10);
                } else {
                    c(extras, dVar2, i11, z7Var2, j10, z10);
                }
                mVar = tVar2.b;
                mVar.a(dVar2, k10);
                return;
            }
            if (z7Var2.equals(z7.ALTERNATIVE_BILLING_ACTION)) {
                if (h10.c() != 0) {
                    com.android.billingclient.api.d dVar3 = h10;
                    c(extras, dVar3, i11, z7Var2, j10, z10);
                    mVar3 = this.f33311c.b;
                    mVar3.a(dVar3, com.google.android.gms.internal.play_billing.n0.k());
                    return;
                }
                t tVar3 = this.f33311c;
                t.a(tVar3);
                t.f(tVar3);
                t.c(tVar3);
                com.google.android.gms.internal.play_billing.m0.m("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                i1Var2 = tVar3.f33314c;
                s7 s7Var2 = s7.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                com.android.billingclient.api.d dVar4 = com.android.billingclient.api.h.f5209h;
                i1Var2.l(h1.b(s7Var2, i11, dVar4, null, z7Var2), j10, z10);
                mVar2 = tVar3.b;
                mVar2.a(dVar4, com.google.android.gms.internal.play_billing.n0.k());
            }
        }
    }
}
