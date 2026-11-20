package n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h1 extends f {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f25975g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Context f25976h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Handler f25977i;

    /* renamed from: j, reason: collision with root package name */
    public final g1 f25978j;

    /* renamed from: k, reason: collision with root package name */
    public final t9.a f25979k;

    /* renamed from: l, reason: collision with root package name */
    public final long f25980l;

    /* renamed from: m, reason: collision with root package name */
    public final long f25981m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Executor f25982n;

    public h1(Context context, Looper looper, Executor executor) {
        g1 g1Var = new g1(this, null);
        this.f25978j = g1Var;
        this.f25976h = context.getApplicationContext();
        this.f25977i = new db.p(looper, g1Var);
        this.f25979k = t9.a.b();
        this.f25980l = 5000L;
        this.f25981m = 300000L;
        this.f25982n = executor;
    }

    @Override // n9.f
    public final ConnectionResult c(e1 e1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResult;
        m.m(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f25975g;
        synchronized (hashMap) {
            try {
                f1 f1Var = (f1) hashMap.get(e1Var);
                if (executor == null) {
                    executor = this.f25982n;
                }
                if (f1Var == null) {
                    f1Var = new f1(this, e1Var);
                    f1Var.b(serviceConnection, serviceConnection, str);
                    connectionResult = f1Var.j(str, executor);
                    hashMap.put(e1Var, f1Var);
                } else {
                    this.f25977i.removeMessages(0, e1Var);
                    if (f1Var.f(serviceConnection)) {
                        String obj = e1Var.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(obj);
                        throw new IllegalStateException(sb2.toString());
                    }
                    f1Var.b(serviceConnection, serviceConnection, str);
                    int e10 = f1Var.e();
                    if (e10 == 1) {
                        serviceConnection.onServiceConnected(f1Var.i(), f1Var.h());
                    } else if (e10 == 2) {
                        connectionResult = f1Var.j(str, executor);
                    }
                    connectionResult = null;
                }
                if (f1Var.d()) {
                    return ConnectionResult.f5736k;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n9.f
    public final void e(e1 e1Var, ServiceConnection serviceConnection, String str) {
        m.m(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f25975g;
        synchronized (hashMap) {
            try {
                f1 f1Var = (f1) hashMap.get(e1Var);
                if (f1Var == null) {
                    String obj = e1Var.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!f1Var.f(serviceConnection)) {
                    String obj2 = e1Var.toString();
                    StringBuilder sb3 = new StringBuilder(obj2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(obj2);
                    throw new IllegalStateException(sb3.toString());
                }
                f1Var.c(serviceConnection, str);
                if (f1Var.g()) {
                    this.f25977i.sendMessageDelayed(this.f25977i.obtainMessage(0, e1Var), this.f25980l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.f25975g;
    }

    public final /* synthetic */ Context g() {
        return this.f25976h;
    }

    public final /* synthetic */ Handler h() {
        return this.f25977i;
    }

    public final /* synthetic */ t9.a i() {
        return this.f25979k;
    }

    public final /* synthetic */ long j() {
        return this.f25981m;
    }
}
