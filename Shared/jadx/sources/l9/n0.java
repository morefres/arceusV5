package l9;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.Set;
import k9.a;
import n9.c;

/* loaded from: classes.dex */
public final class n0 implements c.InterfaceC0458c, e1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.f f23345a;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.b f23346c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f23347d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23348e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f23349f;

    public n0(f fVar, a.f fVar2, b bVar) {
        this.f23349f = fVar;
        this.f23345a = fVar2;
        this.b = bVar;
    }

    @Override // n9.c.InterfaceC0458c
    public final void a(@NonNull ConnectionResult connectionResult) {
        this.f23349f.f23309s.post(new m0(this, connectionResult));
    }

    @Override // l9.e1
    public final void b(com.google.android.gms.common.internal.b bVar, Set set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
        } else {
            this.f23346c = bVar;
            this.f23347d = set;
            i();
        }
    }

    @Override // l9.e1
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f23349f.f23305o;
        j0 j0Var = (j0) map.get(this.b);
        if (j0Var != null) {
            j0Var.G(connectionResult);
        }
    }

    @Override // l9.e1
    public final void d(int i10) {
        Map map;
        boolean z10;
        map = this.f23349f.f23305o;
        j0 j0Var = (j0) map.get(this.b);
        if (j0Var != null) {
            z10 = j0Var.f23332i;
            if (z10) {
                j0Var.G(new ConnectionResult(17));
            } else {
                j0Var.onConnectionSuspended(i10);
            }
        }
    }

    public final void i() {
        com.google.android.gms.common.internal.b bVar;
        if (!this.f23348e || (bVar = this.f23346c) == null) {
            return;
        }
        this.f23345a.getRemoteService(bVar, this.f23347d);
    }
}
