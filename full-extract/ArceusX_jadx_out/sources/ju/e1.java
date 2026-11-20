package ju;

import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "Lju/d1;", "", "mode", "", ve.a.f33391e, "(Lju/d1;I)V", "Lmt/b;", "delegate", "", "undispatched", rl.d.f30696a, "(Lju/d1;Lmt/b;Z)V", "e", "(Lju/d1;)V", j6.b.f21518e, "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e1 {
    public static final <T> void a(@NotNull d1<? super T> d1Var, int i10) {
        mt.b<? super T> e10 = d1Var.e();
        boolean z10 = i10 == 4;
        if (z10 || !(e10 instanceof pu.i) || b(i10) != b(d1Var.resumeMode)) {
            d(d1Var, e10, z10);
            return;
        }
        pu.i iVar = (pu.i) e10;
        l0 l0Var = iVar.dispatcher;
        CoroutineContext context = iVar.getContext();
        if (pu.j.d(l0Var, context)) {
            pu.j.c(l0Var, context, d1Var);
        } else {
            e(d1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(@NotNull d1<? super T> d1Var, @NotNull mt.b<? super T> bVar, boolean z10) {
        Object h10;
        Object j10 = d1Var.j();
        Throwable g10 = d1Var.g(j10);
        if (g10 != null) {
            n.Companion companion = gt.n.INSTANCE;
            h10 = gt.o.a(g10);
        } else {
            n.Companion companion2 = gt.n.INSTANCE;
            h10 = d1Var.h(j10);
        }
        Object b = gt.n.b(h10);
        if (!z10) {
            bVar.resumeWith(b);
            return;
        }
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        pu.i iVar = (pu.i) bVar;
        mt.b<T> bVar2 = iVar.continuation;
        Object obj = iVar.countOrElement;
        CoroutineContext context = bVar2.getContext();
        Object i10 = pu.l0.i(context, obj);
        i3<?> m10 = i10 != pu.l0.f29191a ? j0.m(bVar2, context, i10) : null;
        try {
            iVar.continuation.resumeWith(b);
            Unit unit = Unit.f22894a;
            if (m10 == null || m10.Y0()) {
                pu.l0.f(context, i10);
            }
        } catch (Throwable th2) {
            if (m10 == null || m10.Y0()) {
                pu.l0.f(context, i10);
            }
            throw th2;
        }
    }

    public static final void e(d1<?> d1Var) {
        m1 b = c3.f22061a.b();
        if (b.g0()) {
            b.Z(d1Var);
            return;
        }
        b.c0(true);
        try {
            d(d1Var, d1Var.e(), true);
            do {
            } while (b.q0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
