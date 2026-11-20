package x5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y1.c;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lne/x;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z0 {
    public static final <T> ne.x<T> e(final Executor executor, final Function0<? extends T> function0) {
        ne.x<T> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: x5.w0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                Unit f10;
                f10 = z0.f(executor, function0, aVar);
                return f10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture(...)");
        return a10;
    }

    public static final Unit f(Executor executor, final Function0 function0, final c.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: x5.x0
            @Override // java.lang.Runnable
            public final void run() {
                z0.g(atomicBoolean);
            }
        }, h.f35278a);
        executor.execute(new Runnable() { // from class: x5.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0.h(atomicBoolean, it, function0);
            }
        });
        return Unit.f22894a;
    }

    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void h(AtomicBoolean atomicBoolean, c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}
