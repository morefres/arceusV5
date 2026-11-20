package td;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class k0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public final ee.t0 f32116c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f32118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, sb.k kVar, long j10) {
        super(n0Var, kVar);
        this.f32118e = n0Var;
        this.f32116c = new ee.t0("OnRequestIntegrityTokenCallback");
        this.f32117d = j10;
    }

    @Override // td.i0, ee.n0
    public final void b(Bundle bundle) {
        d1 d1Var;
        String str;
        super.b(bundle);
        this.f32116c.c("onRequestExpressIntegrityToken", new Object[0]);
        d1Var = this.f32118e.f32136e;
        k9.b a10 = d1Var.a(bundle);
        if (a10 != null) {
            this.f32107a.d(a10);
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f32118e.b;
        j0 j0Var = new j0(this, str, j10);
        sb.k kVar = this.f32107a;
        a0 a0Var = new a0();
        a0Var.b(bundle.getString("token"));
        a0Var.a(j0Var);
        kVar.e(a0Var.c());
    }
}
