package td;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class g0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f32098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.k f32099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f32100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, sb.k kVar, int i10, long j10, sb.k kVar2) {
        super(n0Var, kVar);
        this.f32098c = j10;
        this.f32099d = kVar2;
        this.f32100e = n0Var;
    }

    @Override // ee.u0
    public final void b() {
        ee.t0 t0Var;
        if (n0.j(this.f32100e)) {
            super.a(new b(-2, null));
            return;
        }
        if (n0.i(this.f32100e, 0)) {
            super.a(new b(-14, null));
            return;
        }
        try {
            n0 n0Var = this.f32100e;
            ((ee.l0) n0Var.f32137f.e()).L0(n0.b(n0Var, this.f32098c, 0), new l0(this.f32100e, this.f32099d));
        } catch (RemoteException e10) {
            n0 n0Var2 = this.f32100e;
            long j10 = this.f32098c;
            t0Var = n0Var2.f32133a;
            t0Var.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j10));
            this.f32099d.d(new b(-100, e10));
        }
    }
}
