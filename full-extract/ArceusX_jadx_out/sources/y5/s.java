package y5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f6.WorkGenerationalId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import y5.q1;

/* loaded from: classes.dex */
public class s implements e6.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f36468l = x5.w.i("Processor");
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f36470c;

    /* renamed from: d, reason: collision with root package name */
    public h6.b f36471d;

    /* renamed from: e, reason: collision with root package name */
    public WorkDatabase f36472e;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, q1> f36474g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map<String, q1> f36473f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Set<String> f36476i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final List<e> f36477j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f36469a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f36478k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public Map<String, Set<y>> f36475h = new HashMap();

    public s(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase) {
        this.b = context;
        this.f36470c = aVar;
        this.f36471d = bVar;
        this.f36472e = workDatabase;
    }

    public static /* synthetic */ f6.j0 b(s sVar, ArrayList arrayList, String str) {
        arrayList.addAll(sVar.f36472e.d0().a(str));
        return sVar.f36472e.c0().k(str);
    }

    public static /* synthetic */ void c(s sVar, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (sVar.f36478k) {
            try {
                Iterator<e> it = sVar.f36477j.iterator();
                while (it.hasNext()) {
                    it.next().d(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(s sVar, ne.x xVar, q1 q1Var) {
        boolean z10;
        sVar.getClass();
        try {
            z10 = ((Boolean) xVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        sVar.l(q1Var, z10);
    }

    public static boolean i(String str, q1 q1Var, int i10) {
        if (q1Var == null) {
            x5.w.e().a(f36468l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        q1Var.p(i10);
        x5.w.e().a(f36468l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // e6.a
    public void a(String str, x5.k kVar) {
        synchronized (this.f36478k) {
            try {
                x5.w.e().f(f36468l, "Moving WorkSpec (" + str + ") to the foreground");
                q1 remove = this.f36474g.remove(str);
                if (remove != null) {
                    if (this.f36469a == null) {
                        PowerManager.WakeLock a10 = g6.a0.a(this.b, "ProcessorForegroundLck");
                        this.f36469a = a10;
                        a10.acquire();
                    }
                    this.f36473f.put(str, remove);
                    l2.b.q(this.b, androidx.work.impl.foreground.a.f(this.b, remove.m(), kVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(e eVar) {
        synchronized (this.f36478k) {
            this.f36477j.add(eVar);
        }
    }

    public final q1 f(String str) {
        q1 remove = this.f36473f.remove(str);
        boolean z10 = remove != null;
        if (!z10) {
            remove = this.f36474g.remove(str);
        }
        this.f36475h.remove(str);
        if (z10) {
            q();
        }
        return remove;
    }

    public f6.j0 g(String str) {
        synchronized (this.f36478k) {
            try {
                q1 h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                return h10.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q1 h(String str) {
        q1 q1Var = this.f36473f.get(str);
        return q1Var == null ? this.f36474g.get(str) : q1Var;
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f36478k) {
            contains = this.f36476i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f36478k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public final void l(q1 q1Var, boolean z10) {
        synchronized (this.f36478k) {
            try {
                WorkGenerationalId m10 = q1Var.m();
                String workSpecId = m10.getWorkSpecId();
                if (h(workSpecId) == q1Var) {
                    f(workSpecId);
                }
                x5.w.e().a(f36468l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<e> it = this.f36477j.iterator();
                while (it.hasNext()) {
                    it.next().d(m10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(e eVar) {
        synchronized (this.f36478k) {
            this.f36477j.remove(eVar);
        }
    }

    public final void n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f36471d.a().execute(new Runnable() { // from class: y5.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(s.this, workGenerationalId, z10);
            }
        });
    }

    public boolean o(y yVar, WorkerParameters.a aVar) {
        Throwable th2;
        WorkGenerationalId id2 = yVar.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        f6.j0 j0Var = (f6.j0) this.f36472e.P(new Callable() { // from class: y5.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.b(s.this, arrayList, workSpecId);
            }
        });
        if (j0Var == null) {
            x5.w.e().k(f36468l, "Didn't find WorkSpec for id " + id2);
            n(id2, false);
            return false;
        }
        synchronized (this.f36478k) {
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
            try {
                if (k(workSpecId)) {
                    Set<y> set = this.f36475h.get(workSpecId);
                    if (set.iterator().next().getId().getGeneration() == id2.getGeneration()) {
                        set.add(yVar);
                        x5.w.e().a(f36468l, "Work " + id2 + " is already enqueued for processing");
                    } else {
                        n(id2, false);
                    }
                    return false;
                }
                if (j0Var.getGeneration() != id2.getGeneration()) {
                    n(id2, false);
                    return false;
                }
                final q1 a10 = new q1.a(this.b, this.f36470c, this.f36471d, this, this.f36472e, j0Var, arrayList).k(aVar).a();
                final ne.x<Boolean> r8 = a10.r();
                r8.a(new Runnable() { // from class: y5.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.d(s.this, r8, a10);
                    }
                }, this.f36471d.a());
                this.f36474g.put(workSpecId, a10);
                HashSet hashSet = new HashSet();
                hashSet.add(yVar);
                this.f36475h.put(workSpecId, hashSet);
                x5.w.e().a(f36468l, getClass().getSimpleName() + ": processing " + id2);
                return true;
            } catch (Throwable th5) {
                th2 = th5;
                throw th2;
            }
        }
    }

    public boolean p(String str, int i10) {
        q1 f10;
        synchronized (this.f36478k) {
            x5.w.e().a(f36468l, "Processor cancelling " + str);
            this.f36476i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public final void q() {
        synchronized (this.f36478k) {
            try {
                if (this.f36473f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th2) {
                        x5.w.e().d(f36468l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f36469a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f36469a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean r(y yVar, int i10) {
        q1 f10;
        String workSpecId = yVar.getId().getWorkSpecId();
        synchronized (this.f36478k) {
            f10 = f(workSpecId);
        }
        return i(workSpecId, f10, i10);
    }

    public boolean s(y yVar, int i10) {
        String workSpecId = yVar.getId().getWorkSpecId();
        synchronized (this.f36478k) {
            try {
                if (this.f36473f.get(workSpecId) == null) {
                    Set<y> set = this.f36475h.get(workSpecId);
                    if (set != null && set.contains(yVar)) {
                        return i(workSpecId, f(workSpecId), i10);
                    }
                    return false;
                }
                x5.w.e().a(f36468l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
