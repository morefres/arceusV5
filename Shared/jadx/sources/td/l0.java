package td;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class l0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public final ee.t0 f32121c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f32122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, sb.k kVar) {
        super(n0Var, kVar);
        this.f32122d = n0Var;
        this.f32121c = new ee.t0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // td.i0, ee.n0
    public final void B1(Bundle bundle) {
        d1 d1Var;
        super.B1(bundle);
        this.f32121c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        d1Var = this.f32122d.f32136e;
        k9.b a10 = d1Var.a(bundle);
        if (a10 != null) {
            this.f32107a.d(a10);
        } else {
            this.f32107a.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
