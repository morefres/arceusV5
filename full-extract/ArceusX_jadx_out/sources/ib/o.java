package ib;

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

/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final Map f20369n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20370a;
    public final d b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20375g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f20376h;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnection f20380l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f20381m;

    /* renamed from: d, reason: collision with root package name */
    public final List f20372d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f20373e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f20374f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f20378j = new IBinder.DeathRecipient() { // from class: ib.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o.j(o.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f20379k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f20371c = "AgeSignalsService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f20377i = new WeakReference(null);

    public o(Context context, d dVar, String str, Intent intent, pd.i iVar, j jVar) {
        this.f20370a = context;
        this.b = dVar;
        this.f20376h = intent;
    }

    public static /* synthetic */ void j(o oVar) {
        d dVar = oVar.b;
        dVar.c("reportBinderDeath", new Object[0]);
        j jVar = (j) oVar.f20377i.get();
        if (jVar != null) {
            dVar.c("calling onBinderDied", new Object[0]);
            jVar.zza();
        } else {
            dVar.c("%s : Binder has died.", oVar.f20371c);
            List list = oVar.f20372d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(oVar.v());
            }
            list.clear();
        }
        synchronized (oVar.f20374f) {
            oVar.w();
        }
    }

    public static /* synthetic */ void k(o oVar, sb.k kVar, Task task) {
        synchronized (oVar.f20374f) {
            oVar.f20373e.remove(kVar);
        }
    }

    public static /* bridge */ /* synthetic */ void o(final o oVar, final sb.k kVar) {
        oVar.f20373e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ib.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                o.k(o.this, kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(o oVar, e eVar) {
        if (oVar.f20381m != null || oVar.f20375g) {
            if (!oVar.f20375g) {
                eVar.run();
                return;
            } else {
                oVar.b.c("Waiting to bind to the service.", new Object[0]);
                oVar.f20372d.add(eVar);
                return;
            }
        }
        d dVar = oVar.b;
        dVar.c("Initiate binding to the service.", new Object[0]);
        List list = oVar.f20372d;
        list.add(eVar);
        m mVar = new m(oVar, null);
        oVar.f20380l = mVar;
        oVar.f20375g = true;
        if (oVar.f20370a.bindService(oVar.f20376h, mVar, 1)) {
            return;
        }
        dVar.c("Failed to bind to the service.", new Object[0]);
        oVar.f20375g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(new p());
        }
        list.clear();
    }

    public static /* bridge */ /* synthetic */ void r(o oVar) {
        oVar.b.c("linkToDeath", new Object[0]);
        try {
            oVar.f20381m.asBinder().linkToDeath(oVar.f20378j, 0);
        } catch (RemoteException e10) {
            oVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(o oVar) {
        oVar.b.c("unlinkToDeath", new Object[0]);
        oVar.f20381m.asBinder().unlinkToDeath(oVar.f20378j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f20369n;
        synchronized (map) {
            try {
                String str = this.f20371c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f20381m;
    }

    public final void t(e eVar, sb.k kVar) {
        c().post(new h(this, eVar.c(), kVar, eVar));
    }

    public final void u(sb.k kVar) {
        synchronized (this.f20374f) {
            this.f20373e.remove(kVar);
        }
        c().post(new i(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f20371c).concat(" : Binder has died."));
    }

    public final void w() {
        Set set = this.f20373e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        set.clear();
    }
}
