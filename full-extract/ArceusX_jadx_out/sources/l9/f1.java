package l9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import k9.a;
import k9.f;

/* loaded from: classes.dex */
public final class f1 extends qb.c implements f.a, f.b {

    /* renamed from: h, reason: collision with root package name */
    public static final a.AbstractC0393a f23312h = pb.e.f28537c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23313a;
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final a.AbstractC0393a f23314c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f23315d;

    /* renamed from: e, reason: collision with root package name */
    public final n9.d f23316e;

    /* renamed from: f, reason: collision with root package name */
    public pb.f f23317f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f23318g;

    public f1(Context context, Handler handler, @NonNull n9.d dVar) {
        a.AbstractC0393a abstractC0393a = f23312h;
        this.f23313a = context;
        this.b = handler;
        this.f23316e = (n9.d) n9.m.m(dVar, "ClientSettings must not be null");
        this.f23315d = dVar.h();
        this.f23314c = abstractC0393a;
    }

    public static /* bridge */ /* synthetic */ void t2(f1 f1Var, zak zakVar) {
        ConnectionResult v32 = zakVar.v3();
        if (v32.A3()) {
            zav zavVar = (zav) n9.m.l(zakVar.w3());
            ConnectionResult v33 = zavVar.v3();
            if (!v33.A3()) {
                String valueOf = String.valueOf(v33);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                f1Var.f23318g.c(v33);
                f1Var.f23317f.disconnect();
                return;
            }
            f1Var.f23318g.b(zavVar.w3(), f1Var.f23315d);
        } else {
            f1Var.f23318g.c(v32);
        }
        f1Var.f23317f.disconnect();
    }

    @Override // qb.e
    public final void F(zak zakVar) {
        this.b.post(new d1(this, zakVar));
    }

    @Override // l9.e
    public final void onConnected(Bundle bundle) {
        this.f23317f.c(this);
    }

    @Override // l9.n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f23318g.c(connectionResult);
    }

    @Override // l9.e
    public final void onConnectionSuspended(int i10) {
        this.f23318g.d(i10);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k9.a$f, pb.f] */
    public final void u2(e1 e1Var) {
        pb.f fVar = this.f23317f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f23316e.m(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0393a abstractC0393a = this.f23314c;
        Context context = this.f23313a;
        Handler handler = this.b;
        n9.d dVar = this.f23316e;
        this.f23317f = abstractC0393a.a(context, handler.getLooper(), dVar, dVar.j(), this, this);
        this.f23318g = e1Var;
        Set set = this.f23315d;
        if (set == null || set.isEmpty()) {
            this.b.post(new c1(this));
        } else {
            this.f23317f.a();
        }
    }

    public final void v2() {
        pb.f fVar = this.f23317f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }
}
