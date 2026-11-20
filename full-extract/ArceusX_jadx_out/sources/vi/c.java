package vi;

import android.app.Activity;
import android.view.InterfaceC0703r;
import e4.q;
import rg.d0;
import rg.t0;
import rg.x0;
import ti.b;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public x0 f33425a;

    public class a implements d0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f33426a;

        public a(q qVar) {
            this.f33426a = qVar;
        }

        @Override // rg.d0.d
        public void a() {
            c.this.b(this.f33426a);
        }
    }

    public interface b {
        void a();
    }

    public c(x0 x0Var) {
        this.f33425a = x0Var;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            ti.b.f().i(activity, b.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    public void c(InterfaceC0703r interfaceC0703r) {
        if (this.f33425a == null) {
            return;
        }
        t0.v("logout");
        q p8 = this.f33425a.p();
        d0 d0Var = new d0();
        d0Var.r2(2, 0);
        if (interfaceC0703r != null) {
            d0Var.a().a(interfaceC0703r);
        }
        d0Var.B2(new a(p8));
        d0Var.t2(p8.l1(), "dialog");
    }
}
