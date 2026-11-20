package y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import f6.WorkGenerationalId;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import x5.w;

/* loaded from: classes.dex */
public class f1 extends x5.p0 {

    /* renamed from: m, reason: collision with root package name */
    public static final String f36378m = x5.w.i("WorkManagerImpl");

    /* renamed from: n, reason: collision with root package name */
    public static f1 f36379n = null;

    /* renamed from: o, reason: collision with root package name */
    public static f1 f36380o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f36381p = new Object();
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f36382c;

    /* renamed from: d, reason: collision with root package name */
    public WorkDatabase f36383d;

    /* renamed from: e, reason: collision with root package name */
    public h6.b f36384e;

    /* renamed from: f, reason: collision with root package name */
    public List<u> f36385f;

    /* renamed from: g, reason: collision with root package name */
    public s f36386g;

    /* renamed from: h, reason: collision with root package name */
    public g6.w f36387h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36388i = false;

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f36389j;

    /* renamed from: k, reason: collision with root package name */
    public final d6.n f36390k;

    /* renamed from: l, reason: collision with root package name */
    public final ju.p0 f36391l;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public f1(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase, List<u> list, s sVar, d6.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        x5.w.h(new w.a(aVar.getMinimumLoggingLevel()));
        this.b = applicationContext;
        this.f36384e = bVar;
        this.f36383d = workDatabase;
        this.f36386g = sVar;
        this.f36390k = nVar;
        this.f36382c = aVar;
        this.f36385f = list;
        ju.p0 f10 = androidx.work.impl.a.f(bVar);
        this.f36391l = f10;
        this.f36387h = new g6.w(this.f36383d);
        x.e(list, this.f36386g, bVar.c(), this.f36383d, aVar);
        this.f36384e.d(new ForceStopRunnable(applicationContext, this));
        d0.c(f10, this.b, aVar, workDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (y5.f1.f36380o != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        y5.f1.f36380o = androidx.work.impl.a.c(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        y5.f1.f36379n = y5.f1.f36380o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.content.Context r3, androidx.work.a r4) {
        /*
            java.lang.Object r0 = y5.f1.f36381p
            monitor-enter(r0)
            y5.f1 r1 = y5.f1.f36379n     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            y5.f1 r2 = y5.f1.f36380o     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            y5.f1 r1 = y5.f1.f36380o     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            y5.f1 r3 = androidx.work.impl.a.c(r3, r4)     // Catch: java.lang.Throwable -> L14
            y5.f1.f36380o = r3     // Catch: java.lang.Throwable -> L14
        L26:
            y5.f1 r3 = y5.f1.f36380o     // Catch: java.lang.Throwable -> L14
            y5.f1.f36379n = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.f1.i(android.content.Context, androidx.work.a):void");
    }

    public static /* synthetic */ Unit j(f1 f1Var) {
        a6.f.d(f1Var.m());
        f1Var.u().c0().p();
        x.f(f1Var.n(), f1Var.u(), f1Var.s());
        return Unit.f22894a;
    }

    @Deprecated
    public static f1 o() {
        synchronized (f36381p) {
            try {
                f1 f1Var = f36379n;
                if (f1Var != null) {
                    return f1Var;
                }
                return f36380o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f1 p(Context context) {
        f1 o8;
        synchronized (f36381p) {
            try {
                o8 = o();
                if (o8 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    i(applicationContext, ((a.c) applicationContext).b());
                    o8 = p(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o8;
    }

    @Override // x5.p0
    public x5.a0 a(String str) {
        return g6.h.o(str, this);
    }

    @Override // x5.p0
    public x5.a0 b(String str) {
        return g6.h.k(str, this);
    }

    @Override // x5.p0
    public x5.a0 c(List<? extends x5.q0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new f0(this, list).b();
    }

    @Override // x5.p0
    public x5.a0 e(String str, x5.i iVar, x5.g0 g0Var) {
        return iVar == x5.i.f35281c ? m1.e(this, str, g0Var) : l(str, iVar, g0Var).b();
    }

    @Override // x5.p0
    public x5.a0 f(String str, x5.j jVar, List<x5.z> list) {
        return new f0(this, str, jVar, list).b();
    }

    public x5.a0 k(UUID uuid) {
        return g6.h.h(uuid, this);
    }

    public f0 l(String str, x5.i iVar, x5.g0 g0Var) {
        return new f0(this, str, iVar == x5.i.b ? x5.j.b : x5.j.f35286a, Collections.singletonList(g0Var));
    }

    public Context m() {
        return this.b;
    }

    public androidx.work.a n() {
        return this.f36382c;
    }

    public g6.w q() {
        return this.f36387h;
    }

    public s r() {
        return this.f36386g;
    }

    public List<u> s() {
        return this.f36385f;
    }

    public d6.n t() {
        return this.f36390k;
    }

    public WorkDatabase u() {
        return this.f36383d;
    }

    public h6.b v() {
        return this.f36384e;
    }

    public void w() {
        synchronized (f36381p) {
            try {
                this.f36388i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f36389j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f36389j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        x5.m0.a(n().getTracer(), "ReschedulingWork", new Function0() { // from class: y5.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.j(f1.this);
            }
        });
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f36381p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f36389j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f36389j = pendingResult;
                if (this.f36388i) {
                    pendingResult.finish();
                    this.f36389j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f36384e.d(new g6.z(this.f36386g, new y(workGenerationalId), true, i10));
    }
}
