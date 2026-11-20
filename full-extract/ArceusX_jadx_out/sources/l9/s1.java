package l9;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f23372a;
    public final /* synthetic */ t1 b;

    public s1(t1 t1Var, q1 q1Var) {
        this.b = t1Var;
        this.f23372a = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            ConnectionResult b = this.f23372a.b();
            if (b.z3()) {
                t1 t1Var = this.b;
                t1Var.f23323a.startActivityForResult(GoogleApiActivity.a(t1Var.b(), (PendingIntent) n9.m.l(b.y3()), this.f23372a.a(), false), 1);
                return;
            }
            t1 t1Var2 = this.b;
            if (t1Var2.f23379e.b(t1Var2.b(), b.w3(), null) != null) {
                t1 t1Var3 = this.b;
                t1Var3.f23379e.x(t1Var3.b(), t1Var3.f23323a, b.w3(), 2, this.b);
                return;
            }
            if (b.w3() != 18) {
                this.b.l(b, this.f23372a.a());
                return;
            }
            t1 t1Var4 = this.b;
            Dialog s8 = t1Var4.f23379e.s(t1Var4.b(), t1Var4);
            t1 t1Var5 = this.b;
            t1Var5.f23379e.t(t1Var5.b().getApplicationContext(), new r1(this, s8));
        }
    }
}
