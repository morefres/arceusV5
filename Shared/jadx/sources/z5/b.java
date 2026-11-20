package z5;

import android.content.Context;
import android.text.TextUtils;
import b6.b;
import b6.i;
import b6.l;
import b6.m;
import d6.n;
import f6.WorkGenerationalId;
import f6.o1;
import g6.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ju.d2;
import x5.j0;
import x5.o0;
import x5.w;
import y5.b1;
import y5.e;
import y5.s;
import y5.u;
import y5.y;
import y5.z;

/* loaded from: classes.dex */
public class b implements u, i, e {

    /* renamed from: o, reason: collision with root package name */
    public static final String f37900o = w.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f37901a;

    /* renamed from: c, reason: collision with root package name */
    public z5.a f37902c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37903d;

    /* renamed from: g, reason: collision with root package name */
    public final s f37906g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f37907h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.work.a f37908i;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f37910k;

    /* renamed from: l, reason: collision with root package name */
    public final l f37911l;

    /* renamed from: m, reason: collision with root package name */
    public final h6.b f37912m;

    /* renamed from: n, reason: collision with root package name */
    public final d f37913n;
    public final Map<WorkGenerationalId, d2> b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f37904e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final z f37905f = z.a();

    /* renamed from: j, reason: collision with root package name */
    public final Map<WorkGenerationalId, C0690b> f37909j = new HashMap();

    /* renamed from: z5.b$b, reason: collision with other inner class name */
    public static class C0690b {

        /* renamed from: a, reason: collision with root package name */
        public final int f37914a;
        public final long b;

        public C0690b(int i10, long j10) {
            this.f37914a = i10;
            this.b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, s sVar, b1 b1Var, h6.b bVar) {
        this.f37901a = context;
        j0 runnableScheduler = aVar.getRunnableScheduler();
        this.f37902c = new z5.a(this, runnableScheduler, aVar.getClock());
        this.f37913n = new d(runnableScheduler, b1Var);
        this.f37912m = bVar;
        this.f37911l = new l(nVar);
        this.f37908i = aVar;
        this.f37906g = sVar;
        this.f37907h = b1Var;
    }

    @Override // y5.u
    public void a(f6.j0... j0VarArr) {
        if (this.f37910k == null) {
            f();
        }
        if (!this.f37910k.booleanValue()) {
            w.e().f(f37900o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<f6.j0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (f6.j0 j0Var : j0VarArr) {
            if (!this.f37905f.e(o1.a(j0Var))) {
                long max = Math.max(j0Var.c(), i(j0Var));
                long a10 = this.f37908i.getClock().a();
                if (j0Var.state == o0.c.f35307a) {
                    if (a10 < max) {
                        z5.a aVar = this.f37902c;
                        if (aVar != null) {
                            aVar.a(j0Var, max);
                        }
                    } else if (j0Var.m()) {
                        x5.d dVar = j0Var.constraints;
                        if (dVar.getRequiresDeviceIdle()) {
                            w.e().a(f37900o, "Ignoring " + j0Var + ". Requires device idle.");
                        } else if (dVar.g()) {
                            w.e().a(f37900o, "Ignoring " + j0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(j0Var);
                            hashSet2.add(j0Var.id);
                        }
                    } else if (!this.f37905f.e(o1.a(j0Var))) {
                        w.e().a(f37900o, "Starting work for " + j0Var.id);
                        y d10 = this.f37905f.d(j0Var);
                        this.f37913n.c(d10);
                        this.f37907h.d(d10);
                    }
                }
            }
        }
        synchronized (this.f37904e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.e().a(f37900o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (f6.j0 j0Var2 : hashSet) {
                        WorkGenerationalId a11 = o1.a(j0Var2);
                        if (!this.b.containsKey(a11)) {
                            this.b.put(a11, m.e(this.f37911l, j0Var2, this.f37912m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y5.u
    public void b(String str) {
        if (this.f37910k == null) {
            f();
        }
        if (!this.f37910k.booleanValue()) {
            w.e().f(f37900o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        w.e().a(f37900o, "Cancelling work ID " + str);
        z5.a aVar = this.f37902c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f37905f.remove(str)) {
            this.f37913n.b(yVar);
            this.f37907h.a(yVar);
        }
    }

    @Override // y5.u
    public boolean c() {
        return false;
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        y c10 = this.f37905f.c(workGenerationalId);
        if (c10 != null) {
            this.f37913n.b(c10);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f37904e) {
            this.f37909j.remove(workGenerationalId);
        }
    }

    @Override // b6.i
    public void e(f6.j0 j0Var, b6.b bVar) {
        WorkGenerationalId a10 = o1.a(j0Var);
        if (bVar instanceof b.a) {
            if (this.f37905f.e(a10)) {
                return;
            }
            w.e().a(f37900o, "Constraints met: Scheduling work ID " + a10);
            y f10 = this.f37905f.f(a10);
            this.f37913n.c(f10);
            this.f37907h.d(f10);
            return;
        }
        w.e().a(f37900o, "Constraints not met: Cancelling work ID " + a10);
        y c10 = this.f37905f.c(a10);
        if (c10 != null) {
            this.f37913n.b(c10);
            this.f37907h.c(c10, ((b.ConstraintsNotMet) bVar).getReason());
        }
    }

    public final void f() {
        this.f37910k = Boolean.valueOf(x.b(this.f37901a, this.f37908i));
    }

    public final void g() {
        if (this.f37903d) {
            return;
        }
        this.f37906g.e(this);
        this.f37903d = true;
    }

    public final void h(WorkGenerationalId workGenerationalId) {
        d2 remove;
        synchronized (this.f37904e) {
            remove = this.b.remove(workGenerationalId);
        }
        if (remove != null) {
            w.e().a(f37900o, "Stopping tracking for " + workGenerationalId);
            remove.c(null);
        }
    }

    public final long i(f6.j0 j0Var) {
        long max;
        synchronized (this.f37904e) {
            try {
                WorkGenerationalId a10 = o1.a(j0Var);
                C0690b c0690b = this.f37909j.get(a10);
                if (c0690b == null) {
                    c0690b = new C0690b(j0Var.runAttemptCount, this.f37908i.getClock().a());
                    this.f37909j.put(a10, c0690b);
                }
                max = c0690b.b + (Math.max((j0Var.runAttemptCount - c0690b.f37914a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }
}
