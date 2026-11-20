package pu;

import gt.n;
import java.util.concurrent.CancellationException;
import ju.b1;
import ju.c3;
import ju.d2;
import ju.i3;
import ju.m1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lju/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "", "c", "(Lju/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", rl.d.f30696a, "(Lju/l0;Lkotlin/coroutines/CoroutineContext;)Z", "T", "Lmt/b;", "Lgt/n;", "result", j6.b.f21518e, "(Lmt/b;Ljava/lang/Object;)V", "Lpu/i;", "e", "(Lpu/i;)Z", "Lpu/e0;", ve.a.f33391e, "Lpu/e0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f29182a = new e0("UNDEFINED");

    @NotNull
    public static final e0 b = new e0("REUSABLE_CLAIMED");

    public static final <T> void b(@NotNull mt.b<? super T> bVar, @NotNull Object obj) {
        if (!(bVar instanceof i)) {
            bVar.resumeWith(obj);
            return;
        }
        i iVar = (i) bVar;
        Object b10 = ju.e0.b(obj);
        if (d(iVar.dispatcher, iVar.getContext())) {
            iVar._state = b10;
            iVar.resumeMode = 1;
            c(iVar.dispatcher, iVar.getContext(), iVar);
            return;
        }
        m1 b11 = c3.f22061a.b();
        if (b11.g0()) {
            iVar._state = b10;
            iVar.resumeMode = 1;
            b11.Z(iVar);
            return;
        }
        b11.c0(true);
        try {
            d2 d2Var = (d2) iVar.getContext().get(d2.INSTANCE);
            if (d2Var == null || d2Var.b()) {
                mt.b<T> bVar2 = iVar.continuation;
                Object obj2 = iVar.countOrElement;
                CoroutineContext context = bVar2.getContext();
                Object i10 = l0.i(context, obj2);
                i3<?> m10 = i10 != l0.f29191a ? ju.j0.m(bVar2, context, i10) : null;
                try {
                    iVar.continuation.resumeWith(obj);
                    Unit unit = Unit.f22894a;
                } finally {
                    if (m10 == null || m10.Y0()) {
                        l0.f(context, i10);
                    }
                }
            } else {
                CancellationException m11 = d2Var.m();
                iVar.a(b10, m11);
                n.Companion companion = gt.n.INSTANCE;
                iVar.resumeWith(gt.n.b(gt.o.a(m11)));
            }
            while (b11.q0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void c(@NotNull ju.l0 l0Var, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            l0Var.y(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new b1(th2, l0Var, coroutineContext);
        }
    }

    public static final boolean d(@NotNull ju.l0 l0Var, @NotNull CoroutineContext coroutineContext) {
        try {
            return l0Var.L(coroutineContext);
        } catch (Throwable th2) {
            throw new b1(th2, l0Var, coroutineContext);
        }
    }

    public static final boolean e(@NotNull i<? super Unit> iVar) {
        Unit unit = Unit.f22894a;
        m1 b10 = c3.f22061a.b();
        if (b10.j0()) {
            return false;
        }
        if (b10.g0()) {
            iVar._state = unit;
            iVar.resumeMode = 1;
            b10.Z(iVar);
            return true;
        }
        b10.c0(true);
        try {
            iVar.run();
            do {
            } while (b10.q0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
