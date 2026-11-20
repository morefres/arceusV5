package n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f1 implements ServiceConnection, i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25964a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25965c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f25966d;

    /* renamed from: e, reason: collision with root package name */
    public final e1 f25967e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f25968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h1 f25969g;

    public f1(h1 h1Var, e1 e1Var) {
        Objects.requireNonNull(h1Var);
        this.f25969g = h1Var;
        this.f25967e = e1Var;
        this.f25964a = new HashMap();
        this.b = 2;
    }

    public final void a(String str) {
        e1 e1Var = this.f25967e;
        h1 h1Var = this.f25969g;
        h1Var.h().removeMessages(1, e1Var);
        h1Var.i().c(h1Var.g(), this);
        this.f25965c = false;
        this.b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f25964a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f25964a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f25965c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f25964a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f25964a.isEmpty();
    }

    public final IBinder h() {
        return this.f25966d;
    }

    public final ComponentName i() {
        return this.f25968f;
    }

    public final /* synthetic */ ConnectionResult j(String str, Executor executor) {
        h1 h1Var;
        t9.a i10;
        Context g10;
        e1 e1Var;
        try {
            Intent a10 = t0.a(this.f25969g.g(), this.f25967e);
            this.b = 3;
            StrictMode.VmPolicy a11 = u9.t.a();
            try {
                h1Var = this.f25969g;
                i10 = h1Var.i();
                g10 = h1Var.g();
                e1Var = this.f25967e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean d10 = i10.d(g10, str, a10, this, 4225, executor);
                this.f25965c = d10;
                if (d10) {
                    h1Var.h().sendMessageDelayed(h1Var.h().obtainMessage(1, e1Var), h1Var.j());
                    ConnectionResult connectionResult = ConnectionResult.f5736k;
                    StrictMode.setVmPolicy(a11);
                    return connectionResult;
                }
                this.b = 2;
                try {
                    h1Var.i().c(h1Var.g(), this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(a11);
                return connectionResult2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                StrictMode.setVmPolicy(a11);
                throw th4;
            }
        } catch (r0 e10) {
            return e10.f26001a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h1 h1Var = this.f25969g;
        synchronized (h1Var.f()) {
            try {
                h1Var.h().removeMessages(1, this.f25967e);
                this.f25966d = iBinder;
                this.f25968f = componentName;
                Iterator it = this.f25964a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h1 h1Var = this.f25969g;
        synchronized (h1Var.f()) {
            try {
                h1Var.h().removeMessages(1, this.f25967e);
                this.f25966d = null;
                this.f25968f = componentName;
                Iterator it = this.f25964a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
