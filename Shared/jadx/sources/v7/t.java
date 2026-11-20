package v7;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33313a;
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f33314c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33317f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.s0 f33318g = com.google.android.gms.internal.play_billing.s0.k();

    /* renamed from: d, reason: collision with root package name */
    public final s f33315d = new s(this, true);

    /* renamed from: e, reason: collision with root package name */
    public final s f33316e = new s(this, false);

    public t(Context context, m mVar, p1 p1Var, c0 c0Var, q qVar, h hVar, i1 i1Var) {
        this.f33313a = context;
        this.b = mVar;
        this.f33314c = i1Var;
    }

    public static /* bridge */ /* synthetic */ c0 a(t tVar) {
        tVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ h c(t tVar) {
        tVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ q f(t tVar) {
        tVar.getClass();
        return null;
    }

    public final m e() {
        return this.b;
    }

    public final void h(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f33317f = z10;
        s sVar = this.f33316e;
        Context context = this.f33313a;
        sVar.a(context, intentFilter2);
        if (this.f33317f) {
            this.f33315d.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f33315d.a(context, intentFilter);
        }
    }

    public final void i(com.google.android.gms.internal.play_billing.s0 s0Var) {
        this.f33318g = s0Var;
    }
}
