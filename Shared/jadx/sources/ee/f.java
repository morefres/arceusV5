package ee;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name */
    public static final Map f15978o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15979a;
    public final t0 b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15980c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15984g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f15985h;

    /* renamed from: i, reason: collision with root package name */
    public final a1 f15986i;

    /* renamed from: m, reason: collision with root package name */
    public ServiceConnection f15990m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f15991n;

    /* renamed from: d, reason: collision with root package name */
    public final List f15981d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f15982e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f15983f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f15988k = new IBinder.DeathRecipient() { // from class: ee.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f.k(f.this);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f15989l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f15987j = new WeakReference(null);

    public f(Context context, t0 t0Var, String str, Intent intent, a1 a1Var, z0 z0Var) {
        this.f15979a = context;
        this.b = t0Var;
        this.f15980c = str;
        this.f15985h = intent;
        this.f15986i = a1Var;
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.b.c("reportBinderDeath", new Object[0]);
        z0 z0Var = (z0) fVar.f15987j.get();
        if (z0Var != null) {
            fVar.b.c("calling onBinderDied", new Object[0]);
            z0Var.a();
        } else {
            fVar.b.c("%s : Binder has died.", fVar.f15980c);
            Iterator it = fVar.f15981d.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).a(fVar.w());
            }
            fVar.f15981d.clear();
        }
        synchronized (fVar.f15983f) {
            fVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final f fVar, final sb.k kVar) {
        fVar.f15982e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ee.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                f.this.u(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(f fVar, u0 u0Var) {
        if (fVar.f15991n != null || fVar.f15984g) {
            if (!fVar.f15984g) {
                u0Var.run();
                return;
            } else {
                fVar.b.c("Waiting to bind to the service.", new Object[0]);
                fVar.f15981d.add(u0Var);
                return;
            }
        }
        fVar.b.c("Initiate binding to the service.", new Object[0]);
        fVar.f15981d.add(u0Var);
        e eVar = new e(fVar, null);
        fVar.f15990m = eVar;
        fVar.f15984g = true;
        if (fVar.f15979a.bindService(fVar.f15985h, eVar, 1)) {
            return;
        }
        fVar.b.c("Failed to bind to the service.", new Object[0]);
        fVar.f15984g = false;
        Iterator it = fVar.f15981d.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a(new g());
        }
        fVar.f15981d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(f fVar) {
        fVar.b.c("linkToDeath", new Object[0]);
        try {
            fVar.f15991n.asBinder().linkToDeath(fVar.f15988k, 0);
        } catch (RemoteException e10) {
            fVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.b.c("unlinkToDeath", new Object[0]);
        fVar.f15991n.asBinder().unlinkToDeath(fVar.f15988k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f15978o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f15980c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f15980c, 10);
                    handlerThread.start();
                    map.put(this.f15980c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f15980c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f15991n;
    }

    public final void t(u0 u0Var, sb.k kVar) {
        c().post(new x0(this, u0Var.c(), kVar, u0Var));
    }

    public final /* synthetic */ void u(sb.k kVar, Task task) {
        synchronized (this.f15983f) {
            this.f15982e.remove(kVar);
        }
    }

    public final void v(sb.k kVar) {
        synchronized (this.f15983f) {
            this.f15982e.remove(kVar);
        }
        c().post(new y0(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.f15980c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f15982e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(w());
        }
        this.f15982e.clear();
    }
}
