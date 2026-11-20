package y5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class f0 extends x5.n0 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f36369j = x5.w.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final f1 f36370a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final x5.j f36371c;

    /* renamed from: d, reason: collision with root package name */
    public final List<? extends x5.q0> f36372d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f36373e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f36374f;

    /* renamed from: g, reason: collision with root package name */
    public final List<f0> f36375g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36376h;

    /* renamed from: i, reason: collision with root package name */
    public x5.a0 f36377i;

    public f0(f1 f1Var, List<? extends x5.q0> list) {
        this(f1Var, null, x5.j.b, list, null);
    }

    public static /* synthetic */ Unit a(f0 f0Var) {
        f0Var.getClass();
        g6.j.b(f0Var);
        return Unit.f22894a;
    }

    public static boolean j(f0 f0Var, Set<String> set) {
        set.addAll(f0Var.d());
        Set<String> m10 = m(f0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (m10.contains(it.next())) {
                return true;
            }
        }
        List<f0> f10 = f0Var.f();
        if (f10 != null && !f10.isEmpty()) {
            Iterator<f0> it2 = f10.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(f0Var.d());
        return false;
    }

    public static Set<String> m(f0 f0Var) {
        HashSet hashSet = new HashSet();
        List<f0> f10 = f0Var.f();
        if (f10 != null && !f10.isEmpty()) {
            Iterator<f0> it = f10.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public x5.a0 b() {
        if (this.f36376h) {
            x5.w.e().k(f36369j, "Already enqueued work ids (" + TextUtils.join(", ", this.f36373e) + ")");
        } else {
            this.f36377i = x5.e0.c(this.f36370a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f36370a.v().c(), new Function0() { // from class: y5.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(f0.this);
                }
            });
        }
        return this.f36377i;
    }

    public x5.j c() {
        return this.f36371c;
    }

    public List<String> d() {
        return this.f36373e;
    }

    public String e() {
        return this.b;
    }

    public List<f0> f() {
        return this.f36375g;
    }

    public List<? extends x5.q0> g() {
        return this.f36372d;
    }

    public f1 h() {
        return this.f36370a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f36376h;
    }

    public void l() {
        this.f36376h = true;
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list) {
        this(f1Var, str, jVar, list, null);
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list, List<f0> list2) {
        this.f36370a = f1Var;
        this.b = str;
        this.f36371c = jVar;
        this.f36372d = list;
        this.f36375g = list2;
        this.f36373e = new ArrayList(list.size());
        this.f36374f = new ArrayList();
        if (list2 != null) {
            Iterator<f0> it = list2.iterator();
            while (it.hasNext()) {
                this.f36374f.addAll(it.next().f36374f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (jVar == x5.j.f35286a && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String b = list.get(i10).b();
            this.f36373e.add(b);
            this.f36374f.add(b);
        }
    }
}
