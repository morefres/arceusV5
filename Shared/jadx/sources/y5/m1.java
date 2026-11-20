package y5;

import androidx.work.impl.WorkDatabase;
import f6.j0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.o0;
import x5.p0;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly5/s;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Ly5/u;", "schedulers", "Lf6/j0;", "newWorkSpec", "", "", "tags", "Lx5/p0$b;", "h", "(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;", "Ly5/f1;", "name", "Lx5/q0;", "workRequest", "Lx5/a0;", "e", "(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m1 {
    @NotNull
    public static final x5.a0 e(@NotNull final f1 f1Var, @NotNull final String name, @NotNull final x5.q0 workRequest) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        x5.l0 tracer = f1Var.n().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        h6.a c10 = f1Var.v().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getSerialTaskExecutor(...)");
        return x5.e0.c(tracer, str, c10, new Function0() { // from class: y5.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit f10;
                f10 = m1.f(f1.this, name, workRequest);
                return f10;
            }
        });
    }

    public static final Unit f(final f1 f1Var, final String str, final x5.q0 q0Var) {
        Function0 function0 = new Function0() { // from class: y5.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g10;
                g10 = m1.g(x5.q0.this, f1Var, str);
                return g10;
            }
        };
        f6.k0 c02 = f1Var.u().c0();
        List<j0.IdAndState> r8 = c02.r(str);
        if (r8.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        j0.IdAndState idAndState = (j0.IdAndState) CollectionsKt.firstOrNull(r8);
        if (idAndState == null) {
            function0.invoke();
            return Unit.f22894a;
        }
        f6.j0 k10 = c02.k(idAndState.id);
        if (k10 == null) {
            throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found");
        }
        if (!k10.o()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == o0.c.f35311f) {
            c02.a(idAndState.id);
            function0.invoke();
            return Unit.f22894a;
        }
        f6.j0 e10 = f6.j0.e(q0Var.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
        s r10 = f1Var.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getProcessor(...)");
        WorkDatabase u8 = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        androidx.work.a n10 = f1Var.n();
        Intrinsics.checkNotNullExpressionValue(n10, "<get-configuration>(...)");
        List<u> s8 = f1Var.s();
        Intrinsics.checkNotNullExpressionValue(s8, "getSchedulers(...)");
        h(r10, u8, n10, s8, e10, q0Var.c());
        return Unit.f22894a;
    }

    public static final Unit g(x5.q0 q0Var, f1 f1Var, String str) {
        g6.j.b(new f0(f1Var, str, x5.j.b, kotlin.collections.o.d(q0Var)));
        return Unit.f22894a;
    }

    public static final p0.b h(s sVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends u> list, final f6.j0 j0Var, final Set<String> set) {
        final String str = j0Var.id;
        final f6.j0 k10 = workDatabase.c0().k(str);
        if (k10 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (k10.state.b()) {
            return p0.b.f35317a;
        }
        if (k10.o() ^ j0Var.o()) {
            Function1 function1 = new Function1() { // from class: y5.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String i10;
                    i10 = m1.i((f6.j0) obj);
                    return i10;
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) function1.invoke(k10)) + " Worker to " + ((String) function1.invoke(j0Var)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean k11 = sVar.k(str);
        if (!k11) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((u) it.next()).b(str);
            }
        }
        workDatabase.R(new Runnable() { // from class: y5.l1
            @Override // java.lang.Runnable
            public final void run() {
                m1.j(WorkDatabase.this, k10, j0Var, list, str, set, k11);
            }
        });
        if (!k11) {
            x.f(aVar, workDatabase, list);
        }
        return k11 ? p0.b.f35318c : p0.b.b;
    }

    public static final String i(f6.j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.o() ? "Periodic" : "OneTime";
    }

    public static final void j(WorkDatabase workDatabase, f6.j0 j0Var, f6.j0 j0Var2, List list, String str, Set set, boolean z10) {
        f6.k0 c02 = workDatabase.c0();
        f6.q1 d02 = workDatabase.d0();
        f6.j0 e10 = f6.j0.e(j0Var2, null, j0Var.state, null, null, null, null, 0L, 0L, 0L, null, j0Var.runAttemptCount, null, 0L, j0Var.lastEnqueueTime, 0L, 0L, false, null, j0Var.getPeriodCount(), j0Var.getGeneration() + 1, j0Var.getNextScheduleTimeOverride(), j0Var.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (j0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            e10.q(j0Var2.getNextScheduleTimeOverride());
            e10.r(e10.getNextScheduleTimeOverrideGeneration() + 1);
        }
        c02.g(g6.k.c(list, e10));
        d02.b(str);
        d02.d(str, set);
        if (z10) {
            return;
        }
        c02.q(str, -1L);
        workDatabase.b0().a(str);
    }
}
