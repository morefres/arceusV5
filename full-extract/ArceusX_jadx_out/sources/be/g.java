package be;

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
public final class g {

    /* renamed from: o, reason: collision with root package name */
    public static final Map f3960o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3961a;
    public final q1 b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3966g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f3967h;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnection f3971l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f3972m;

    /* renamed from: n, reason: collision with root package name */
    public final ae.r f3973n;

    /* renamed from: d, reason: collision with root package name */
    public final List f3963d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f3964e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f3965f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f3969j = new IBinder.DeathRecipient() { // from class: be.t1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            g.j(g.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3970k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f3962c = "SplitInstallService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f3968i = new WeakReference(null);

    public g(Context context, q1 q1Var, String str, Intent intent, ae.r rVar, b bVar) {
        this.f3961a = context;
        this.b = q1Var;
        this.f3967h = intent;
        this.f3973n = rVar;
    }

    public static /* synthetic */ void j(g gVar) {
        gVar.b.d("reportBinderDeath", new Object[0]);
        b bVar = (b) gVar.f3968i.get();
        if (bVar != null) {
            gVar.b.d("calling onBinderDied", new Object[0]);
            bVar.zza();
        } else {
            gVar.b.d("%s : Binder has died.", gVar.f3962c);
            Iterator it = gVar.f3963d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).b(gVar.v());
            }
            gVar.f3963d.clear();
        }
        synchronized (gVar.f3965f) {
            gVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final g gVar, final sb.k kVar) {
        gVar.f3964e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: be.s1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                g.this.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(g gVar, r1 r1Var) {
        if (gVar.f3972m != null || gVar.f3966g) {
            if (!gVar.f3966g) {
                r1Var.run();
                return;
            } else {
                gVar.b.d("Waiting to bind to the service.", new Object[0]);
                gVar.f3963d.add(r1Var);
                return;
            }
        }
        gVar.b.d("Initiate binding to the service.", new Object[0]);
        gVar.f3963d.add(r1Var);
        f fVar = new f(gVar, null);
        gVar.f3971l = fVar;
        gVar.f3966g = true;
        if (gVar.f3961a.bindService(gVar.f3967h, fVar, 1)) {
            return;
        }
        gVar.b.d("Failed to bind to the service.", new Object[0]);
        gVar.f3966g = false;
        Iterator it = gVar.f3963d.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).b(new h());
        }
        gVar.f3963d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(g gVar) {
        gVar.b.d("linkToDeath", new Object[0]);
        try {
            gVar.f3972m.asBinder().linkToDeath(gVar.f3969j, 0);
        } catch (RemoteException e10) {
            gVar.b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(g gVar) {
        gVar.b.d("unlinkToDeath", new Object[0]);
        gVar.f3972m.asBinder().unlinkToDeath(gVar.f3969j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f3960o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f3962c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3962c, 10);
                    handlerThread.start();
                    map.put(this.f3962c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f3962c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f3972m;
    }

    public final void s(r1 r1Var, sb.k kVar) {
        c().post(new u1(this, r1Var.a(), kVar, r1Var));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f3965f) {
            this.f3964e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f3965f) {
            this.f3964e.remove(kVar);
        }
        c().post(new v1(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f3962c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f3964e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f3964e.clear();
    }
}
