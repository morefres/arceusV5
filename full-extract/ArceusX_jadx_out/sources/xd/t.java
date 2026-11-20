package xd;

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
public final class t {

    /* renamed from: n, reason: collision with root package name */
    public static final Map f35509n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f35510a;
    public final i b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35515g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f35516h;

    /* renamed from: l, reason: collision with root package name */
    public ServiceConnection f35520l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f35521m;

    /* renamed from: d, reason: collision with root package name */
    public final List f35512d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Set f35513e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f35514f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f35518j = new IBinder.DeathRecipient() { // from class: xd.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(t.this);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f35519k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f35511c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f35517i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, wd.d dVar, o oVar) {
        this.f35510a = context;
        this.b = iVar;
        this.f35516h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f35517i.get();
        if (oVar != null) {
            tVar.b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.b.c("%s : Binder has died.", tVar.f35511c);
            Iterator it = tVar.f35512d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f35512d.clear();
        }
        synchronized (tVar.f35514f) {
            tVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final t tVar, final sb.k kVar) {
        tVar.f35513e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: xd.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                t.this.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f35521m != null || tVar.f35515g) {
            if (!tVar.f35515g) {
                jVar.run();
                return;
            } else {
                tVar.b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f35512d.add(jVar);
                return;
            }
        }
        tVar.b.c("Initiate binding to the service.", new Object[0]);
        tVar.f35512d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f35520l = rVar;
        tVar.f35515g = true;
        if (tVar.f35510a.bindService(tVar.f35516h, rVar, 1)) {
            return;
        }
        tVar.b.c("Failed to bind to the service.", new Object[0]);
        tVar.f35515g = false;
        Iterator it = tVar.f35512d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f35512d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.b.c("linkToDeath", new Object[0]);
        try {
            tVar.f35521m.asBinder().linkToDeath(tVar.f35518j, 0);
        } catch (RemoteException e10) {
            tVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.b.c("unlinkToDeath", new Object[0]);
        tVar.f35521m.asBinder().unlinkToDeath(tVar.f35518j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f35509n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f35511c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f35511c, 10);
                    handlerThread.start();
                    map.put(this.f35511c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f35511c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f35521m;
    }

    public final void s(j jVar, sb.k kVar) {
        c().post(new m(this, jVar.b(), kVar, jVar));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f35514f) {
            this.f35513e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f35514f) {
            this.f35513e.remove(kVar);
        }
        c().post(new n(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f35511c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f35513e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f35513e.clear();
    }
}
