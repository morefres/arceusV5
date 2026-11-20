package l9;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import k9.a;
import k9.f;
import l9.k;

/* loaded from: classes.dex */
public final class j0 implements f.a, f.b {
    public final a.f b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23326c;

    /* renamed from: d, reason: collision with root package name */
    public final z f23327d;

    /* renamed from: g, reason: collision with root package name */
    public final int f23330g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f23331h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23332i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f23336r;

    /* renamed from: a, reason: collision with root package name */
    public final Queue f23325a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f23328e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Map f23329f = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final List f23333o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public ConnectionResult f23334p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f23335q = 0;

    public j0(f fVar, k9.e eVar) {
        this.f23336r = fVar;
        a.f L = eVar.L(fVar.f23309s.getLooper(), this);
        this.b = L;
        this.f23326c = eVar.u();
        this.f23327d = new z();
        this.f23330g = eVar.K();
        if (L.requiresSignIn()) {
            this.f23331h = eVar.M(fVar.f23300e, fVar.f23309s);
        } else {
            this.f23331h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(j0 j0Var, l0 l0Var) {
        Feature feature;
        Feature[] g10;
        if (j0Var.f23333o.remove(l0Var)) {
            j0Var.f23336r.f23309s.removeMessages(15, l0Var);
            j0Var.f23336r.f23309s.removeMessages(16, l0Var);
            feature = l0Var.b;
            ArrayList arrayList = new ArrayList(j0Var.f23325a.size());
            for (o1 o1Var : j0Var.f23325a) {
                if ((o1Var instanceof r0) && (g10 = ((r0) o1Var).g(j0Var)) != null && u9.b.b(g10, feature)) {
                    arrayList.add(o1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o1 o1Var2 = (o1) arrayList.get(i10);
                j0Var.f23325a.remove(o1Var2);
                o1Var2.b(new k9.p(feature));
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(j0 j0Var, l0 l0Var) {
        if (j0Var.f23333o.contains(l0Var) && !j0Var.f23332i) {
            if (j0Var.b.isConnected()) {
                j0Var.g();
            } else {
                j0Var.C();
            }
        }
    }

    public final void B() {
        n9.m.d(this.f23336r.f23309s);
        this.f23334p = null;
    }

    public final void C() {
        n9.m.d(this.f23336r.f23309s);
        if (this.b.isConnected() || this.b.isConnecting()) {
            return;
        }
        try {
            f fVar = this.f23336r;
            int b = fVar.f23302g.b(fVar.f23300e, this.b);
            if (b == 0) {
                f fVar2 = this.f23336r;
                a.f fVar3 = this.b;
                n0 n0Var = new n0(fVar2, fVar3, this.f23326c);
                if (fVar3.requiresSignIn()) {
                    ((f1) n9.m.l(this.f23331h)).u2(n0Var);
                }
                try {
                    this.b.connect(n0Var);
                    return;
                } catch (SecurityException e10) {
                    F(new ConnectionResult(10), e10);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(b, null);
            Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
            F(connectionResult, null);
        } catch (IllegalStateException e11) {
            F(new ConnectionResult(10), e11);
        }
    }

    public final void D(o1 o1Var) {
        n9.m.d(this.f23336r.f23309s);
        if (this.b.isConnected()) {
            if (m(o1Var)) {
                j();
                return;
            } else {
                this.f23325a.add(o1Var);
                return;
            }
        }
        this.f23325a.add(o1Var);
        ConnectionResult connectionResult = this.f23334p;
        if (connectionResult == null || !connectionResult.z3()) {
            C();
        } else {
            F(this.f23334p, null);
        }
    }

    public final void E() {
        this.f23335q++;
    }

    public final void F(@NonNull ConnectionResult connectionResult, Exception exc) {
        n9.m.d(this.f23336r.f23309s);
        f1 f1Var = this.f23331h;
        if (f1Var != null) {
            f1Var.v2();
        }
        B();
        this.f23336r.f23302g.c();
        d(connectionResult);
        if ((this.b instanceof p9.e) && connectionResult.w3() != 24) {
            this.f23336r.b = true;
            f fVar = this.f23336r;
            fVar.f23309s.sendMessageDelayed(fVar.f23309s.obtainMessage(19), 300000L);
        }
        if (connectionResult.w3() == 4) {
            e(f.f23294v);
            return;
        }
        if (this.f23325a.isEmpty()) {
            this.f23334p = connectionResult;
            return;
        }
        if (exc != null) {
            n9.m.d(this.f23336r.f23309s);
            f(null, exc, false);
            return;
        }
        if (!this.f23336r.f23310t) {
            e(f.g(this.f23326c, connectionResult));
            return;
        }
        f(f.g(this.f23326c, connectionResult), null, true);
        if (this.f23325a.isEmpty() || n(connectionResult) || this.f23336r.f(connectionResult, this.f23330g)) {
            return;
        }
        if (connectionResult.w3() == 18) {
            this.f23332i = true;
        }
        if (!this.f23332i) {
            e(f.g(this.f23326c, connectionResult));
            return;
        }
        f fVar2 = this.f23336r;
        fVar2.f23309s.sendMessageDelayed(Message.obtain(fVar2.f23309s, 9, this.f23326c), 5000L);
    }

    public final void G(@NonNull ConnectionResult connectionResult) {
        n9.m.d(this.f23336r.f23309s);
        a.f fVar = this.b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        F(connectionResult, null);
    }

    public final void H(p1 p1Var) {
        n9.m.d(this.f23336r.f23309s);
        this.f23328e.add(p1Var);
    }

    public final void I() {
        n9.m.d(this.f23336r.f23309s);
        if (this.f23332i) {
            C();
        }
    }

    public final void J() {
        n9.m.d(this.f23336r.f23309s);
        e(f.f23293u);
        this.f23327d.f();
        for (k.a aVar : (k.a[]) this.f23329f.keySet().toArray(new k.a[0])) {
            D(new n1(aVar, new sb.k()));
        }
        d(new ConnectionResult(4));
        if (this.b.isConnected()) {
            this.b.onUserSignOut(new i0(this));
        }
    }

    public final void K() {
        n9.m.d(this.f23336r.f23309s);
        if (this.f23332i) {
            l();
            f fVar = this.f23336r;
            e(fVar.f23301f.g(fVar.f23300e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean N() {
        return this.b.isConnected();
    }

    public final boolean a() {
        return this.b.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Feature c(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            w1.a aVar = new w1.a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                aVar.put(feature.getName(), Long.valueOf(feature.w3()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) aVar.get(feature2.getName());
                if (l10 == null || l10.longValue() < feature2.w3()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void d(ConnectionResult connectionResult) {
        Iterator it = this.f23328e.iterator();
        while (it.hasNext()) {
            ((p1) it.next()).c(this.f23326c, connectionResult, n9.k.b(connectionResult, ConnectionResult.f5736k) ? this.b.getEndpointPackageName() : null);
        }
        this.f23328e.clear();
    }

    public final void e(Status status) {
        n9.m.d(this.f23336r.f23309s);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z10) {
        n9.m.d(this.f23336r.f23309s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f23325a.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            if (!z10 || o1Var.f23355a == 2) {
                if (status != null) {
                    o1Var.a(status);
                } else {
                    o1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.f23325a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o1 o1Var = (o1) arrayList.get(i10);
            if (!this.b.isConnected()) {
                return;
            }
            if (m(o1Var)) {
                this.f23325a.remove(o1Var);
            }
        }
    }

    public final void h() {
        B();
        d(ConnectionResult.f5736k);
        l();
        Iterator it = this.f23329f.values().iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (c(w0Var.f23391a.c()) != null) {
                it.remove();
            } else {
                try {
                    w0Var.f23391a.d(this.b, new sb.k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    public final void i(int i10) {
        B();
        this.f23332i = true;
        this.f23327d.e(i10, this.b.getLastDisconnectMessage());
        b bVar = this.f23326c;
        f fVar = this.f23336r;
        fVar.f23309s.sendMessageDelayed(Message.obtain(fVar.f23309s, 9, bVar), 5000L);
        b bVar2 = this.f23326c;
        f fVar2 = this.f23336r;
        fVar2.f23309s.sendMessageDelayed(Message.obtain(fVar2.f23309s, 11, bVar2), 120000L);
        this.f23336r.f23302g.c();
        Iterator it = this.f23329f.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).f23392c.run();
        }
    }

    public final void j() {
        this.f23336r.f23309s.removeMessages(12, this.f23326c);
        b bVar = this.f23326c;
        f fVar = this.f23336r;
        fVar.f23309s.sendMessageDelayed(fVar.f23309s.obtainMessage(12, bVar), this.f23336r.f23297a);
    }

    public final void k(o1 o1Var) {
        o1Var.d(this.f23327d, a());
        try {
            o1Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.f23332i) {
            f fVar = this.f23336r;
            fVar.f23309s.removeMessages(11, this.f23326c);
            f fVar2 = this.f23336r;
            fVar2.f23309s.removeMessages(9, this.f23326c);
            this.f23332i = false;
        }
    }

    public final boolean m(o1 o1Var) {
        if (!(o1Var instanceof r0)) {
            k(o1Var);
            return true;
        }
        r0 r0Var = (r0) o1Var;
        Feature c10 = c(r0Var.g(this));
        if (c10 == null) {
            k(o1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + c10.getName() + ", " + c10.w3() + ").");
        if (!this.f23336r.f23310t || !r0Var.f(this)) {
            r0Var.b(new k9.p(c10));
            return true;
        }
        l0 l0Var = new l0(this.f23326c, c10, null);
        int indexOf = this.f23333o.indexOf(l0Var);
        if (indexOf >= 0) {
            l0 l0Var2 = (l0) this.f23333o.get(indexOf);
            this.f23336r.f23309s.removeMessages(15, l0Var2);
            f fVar = this.f23336r;
            fVar.f23309s.sendMessageDelayed(Message.obtain(fVar.f23309s, 15, l0Var2), 5000L);
            return false;
        }
        this.f23333o.add(l0Var);
        f fVar2 = this.f23336r;
        fVar2.f23309s.sendMessageDelayed(Message.obtain(fVar2.f23309s, 15, l0Var), 5000L);
        f fVar3 = this.f23336r;
        fVar3.f23309s.sendMessageDelayed(Message.obtain(fVar3.f23309s, 16, l0Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (n(connectionResult)) {
            return false;
        }
        this.f23336r.f(connectionResult, this.f23330g);
        return false;
    }

    public final boolean n(@NonNull ConnectionResult connectionResult) {
        synchronized (f.f23295w) {
            try {
                f fVar = this.f23336r;
                if (fVar.f23306p == null || !fVar.f23307q.contains(this.f23326c)) {
                    return false;
                }
                this.f23336r.f23306p.s(connectionResult, this.f23330g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean o(boolean z10) {
        n9.m.d(this.f23336r.f23309s);
        if (!this.b.isConnected() || !this.f23329f.isEmpty()) {
            return false;
        }
        if (!this.f23327d.g()) {
            this.b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    @Override // l9.e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f23336r.f23309s.getLooper()) {
            h();
        } else {
            this.f23336r.f23309s.post(new f0(this));
        }
    }

    @Override // l9.n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        F(connectionResult, null);
    }

    @Override // l9.e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f23336r.f23309s.getLooper()) {
            i(i10);
        } else {
            this.f23336r.f23309s.post(new g0(this, i10));
        }
    }

    public final int p() {
        return this.f23330g;
    }

    public final int q() {
        return this.f23335q;
    }

    public final ConnectionResult r() {
        n9.m.d(this.f23336r.f23309s);
        return this.f23334p;
    }

    public final a.f t() {
        return this.b;
    }

    public final Map v() {
        return this.f23329f;
    }
}
