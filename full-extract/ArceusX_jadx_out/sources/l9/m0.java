package l9;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import k9.a;

/* loaded from: classes.dex */
public final class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f23342a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, ConnectionResult connectionResult) {
        this.b = n0Var;
        this.f23342a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        n0 n0Var = this.b;
        map = n0Var.f23349f.f23305o;
        bVar = n0Var.b;
        j0 j0Var = (j0) map.get(bVar);
        if (j0Var == null) {
            return;
        }
        if (!this.f23342a.A3()) {
            j0Var.F(this.f23342a, null);
            return;
        }
        this.b.f23348e = true;
        fVar = this.b.f23345a;
        if (fVar.requiresSignIn()) {
            this.b.i();
            return;
        }
        try {
            n0 n0Var2 = this.b;
            fVar3 = n0Var2.f23345a;
            fVar4 = n0Var2.f23345a;
            fVar3.getRemoteService(null, fVar4.b());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.b.f23345a;
            fVar2.disconnect("Failed to get service from broker.");
            j0Var.F(new ConnectionResult(10), null);
        }
    }
}
