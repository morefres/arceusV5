package td;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class l extends ee.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final ee.t0 f32119a = new ee.t0("OnRequestIntegrityTokenCallback");
    public final sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f32120c;

    public l(m mVar, sb.k kVar) {
        this.f32120c = mVar;
        this.b = kVar;
    }

    @Override // ee.s0
    public final void d(Bundle bundle) {
        d1 d1Var;
        String str;
        this.f32120c.f32131f.v(this.b);
        this.f32119a.c("onRequestIntegrityToken", new Object[0]);
        d1Var = this.f32120c.f32130e;
        k9.b a10 = d1Var.a(bundle);
        if (a10 != null) {
            this.b.d(a10);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.b.d(new a(-100, null));
            return;
        }
        long j10 = bundle.getLong("request.token.sid");
        str = this.f32120c.b;
        k kVar = new k(this, str, j10);
        sb.k kVar2 = this.b;
        d dVar = new d();
        dVar.b(string);
        dVar.a(kVar);
        kVar2.e(dVar.c());
    }
}
