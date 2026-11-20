package v7;

import com.google.android.gms.internal.play_billing.s7;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class c1 implements com.google.android.gms.internal.play_billing.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2.a f33250a;
    public final /* synthetic */ Runnable b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.g f33251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33252d;

    public c1(com.android.billingclient.api.g gVar, int i10, x2.a aVar, Runnable runnable) {
        this.f33252d = i10;
        this.f33250a = aVar;
        this.b = runnable;
        Objects.requireNonNull(gVar);
        this.f33251c = gVar;
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f33251c.g1(s7.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, com.android.billingclient.api.h.F);
            com.google.android.gms.internal.play_billing.m0.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f33251c.g1(s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, com.android.billingclient.api.h.F);
            com.google.android.gms.internal.play_billing.m0.n("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean d12;
        com.android.billingclient.api.d e12;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        com.android.billingclient.api.g gVar = this.f33251c;
        d12 = com.android.billingclient.api.g.d1(intValue);
        if (!d12) {
            this.b.run();
        } else {
            e12 = gVar.e1(this.f33252d, num.intValue());
            this.f33250a.accept(e12);
        }
    }
}
