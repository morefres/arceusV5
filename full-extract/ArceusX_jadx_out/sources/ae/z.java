package ae;

import android.os.Bundle;
import be.q1;
import java.util.List;

/* loaded from: classes2.dex */
public class z extends be.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final sb.k f474a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, sb.k kVar) {
        this.b = a0Var;
        this.f474a = kVar;
    }

    public void R0(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onDeferredUninstall", new Object[0]);
    }

    @Override // be.m0
    public final void Z(int i10, Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public final void b0(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // be.m0
    public void d1(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // be.m0
    public final void h0(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        int i10 = bundle.getInt("error_code");
        q1Var = a0.f403c;
        q1Var.b("onError(%d)", Integer.valueOf(i10));
        this.f474a.d(new a(i10));
    }

    @Override // be.m0
    public void i(int i10, Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public void j(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onDeferredLanguageUninstall", new Object[0]);
    }

    public void k0(int i10, Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public final void q0(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // be.m0
    public void r(List list) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onGetSessionStates", new Object[0]);
    }

    public void t1(Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onDeferredInstall", new Object[0]);
    }

    @Override // be.m0
    public void v0(int i10, Bundle bundle) {
        q1 q1Var;
        this.b.b.u(this.f474a);
        q1Var = a0.f403c;
        q1Var.d("onGetSession(%d)", Integer.valueOf(i10));
    }
}
