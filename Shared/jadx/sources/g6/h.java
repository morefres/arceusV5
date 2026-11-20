package g6;

import androidx.work.impl.WorkDatabase;
import f6.k0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.l0;
import x5.o0;
import y5.f1;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly5/f1;", "workManagerImpl", "", "workSpecId", "", "g", "(Ly5/f1;Ljava/lang/String;)V", "s", "(Ly5/f1;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "r", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Lx5/a0;", "h", "(Ljava/util/UUID;Ly5/f1;)Lx5/a0;", "tag", "o", "(Ljava/lang/String;Ly5/f1;)Lx5/a0;", "name", "k", "m", "(Ljava/lang/String;Ly5/f1;)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final void g(f1 f1Var, String str) {
        WorkDatabase u8 = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        r(u8, str);
        y5.s r8 = f1Var.r();
        Intrinsics.checkNotNullExpressionValue(r8, "getProcessor(...)");
        r8.p(str, 1);
        Iterator<y5.u> it = f1Var.s().iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    @NotNull
    public static final x5.a0 h(@NotNull final UUID id2, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        h6.a c10 = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getSerialTaskExecutor(...)");
        return x5.e0.c(tracer, "CancelWorkById", c10, new Function0() { // from class: g6.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = h.i(f1.this, id2);
                return i10;
            }
        });
    }

    public static final Unit i(final f1 f1Var, final UUID uuid) {
        WorkDatabase u8 = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        u8.R(new Runnable() { // from class: g6.e
            @Override // java.lang.Runnable
            public final void run() {
                h.j(f1.this, uuid);
            }
        });
        s(f1Var);
        return Unit.f22894a;
    }

    public static final void j(f1 f1Var, UUID uuid) {
        String uuid2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        g(f1Var, uuid2);
    }

    @NotNull
    public static final x5.a0 k(@NotNull final String name, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        String str = "CancelWorkByName_" + name;
        h6.a c10 = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getSerialTaskExecutor(...)");
        return x5.e0.c(tracer, str, c10, new Function0() { // from class: g6.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l10;
                l10 = h.l(name, workManagerImpl);
                return l10;
            }
        });
    }

    public static final Unit l(String str, f1 f1Var) {
        m(str, f1Var);
        s(f1Var);
        return Unit.f22894a;
    }

    public static final void m(@NotNull final String name, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase u8 = workManagerImpl.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        u8.R(new Runnable() { // from class: g6.c
            @Override // java.lang.Runnable
            public final void run() {
                h.n(WorkDatabase.this, name, workManagerImpl);
            }
        });
    }

    public static final void n(WorkDatabase workDatabase, String str, f1 f1Var) {
        Iterator<String> it = workDatabase.c0().i(str).iterator();
        while (it.hasNext()) {
            g(f1Var, it.next());
        }
    }

    @NotNull
    public static final x5.a0 o(@NotNull final String tag, @NotNull final f1 workManagerImpl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l0 tracer = workManagerImpl.n().getTracer();
        String str = "CancelWorkByTag_" + tag;
        h6.a c10 = workManagerImpl.v().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getSerialTaskExecutor(...)");
        return x5.e0.c(tracer, str, c10, new Function0() { // from class: g6.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p8;
                p8 = h.p(f1.this, tag);
                return p8;
            }
        });
    }

    public static final Unit p(final f1 f1Var, final String str) {
        final WorkDatabase u8 = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(u8, "getWorkDatabase(...)");
        u8.R(new Runnable() { // from class: g6.f
            @Override // java.lang.Runnable
            public final void run() {
                h.q(WorkDatabase.this, str, f1Var);
            }
        });
        s(f1Var);
        return Unit.f22894a;
    }

    public static final void q(WorkDatabase workDatabase, String str, f1 f1Var) {
        Iterator<String> it = workDatabase.c0().m(str).iterator();
        while (it.hasNext()) {
            g(f1Var, it.next());
        }
    }

    public static final void r(WorkDatabase workDatabase, String str) {
        k0 c02 = workDatabase.c0();
        f6.b X = workDatabase.X();
        List p8 = kotlin.collections.p.p(str);
        while (!p8.isEmpty()) {
            String str2 = (String) kotlin.collections.u.H(p8);
            o0.c j10 = c02.j(str2);
            if (j10 != o0.c.f35308c && j10 != o0.c.f35309d) {
                c02.l(str2);
            }
            p8.addAll(X.a(str2));
        }
    }

    public static final void s(f1 f1Var) {
        y5.x.f(f1Var.n(), f1Var.u(), f1Var.s());
    }
}
