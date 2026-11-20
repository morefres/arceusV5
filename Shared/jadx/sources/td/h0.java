package td;

import android.os.RemoteException;
import td.c;

/* loaded from: classes2.dex */
public final class h0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.d f32102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f32103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f32104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb.k f32105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f32106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, sb.k kVar, int i10, c.d dVar, long j10, long j11, sb.k kVar2) {
        super(n0Var, kVar);
        this.f32102c = dVar;
        this.f32103d = j10;
        this.f32104e = j11;
        this.f32105f = kVar2;
        this.f32106g = n0Var;
    }

    @Override // ee.u0
    public final void b() {
        ee.t0 t0Var;
        if (n0.j(this.f32106g)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f32106g, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f32106g;
            ((ee.l0) n0Var.f32137f.e()).m1(n0.a(n0Var, this.f32102c, this.f32103d, this.f32104e, 0), new k0(this.f32106g, this.f32105f, this.f32103d));
        } catch (RemoteException e10) {
            n0 n0Var2 = this.f32106g;
            c.d dVar = this.f32102c;
            t0Var = n0Var2.f32133a;
            t0Var.b(e10, "requestExpressIntegrityToken(%s, %s, %s)", dVar.b(), this.f32102c.c(), Long.valueOf(this.f32103d));
            this.f32105f.d(new b(-100, e10));
        }
    }
}
