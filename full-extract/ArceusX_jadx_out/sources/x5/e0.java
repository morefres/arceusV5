package x5;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.a0;
import y1.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx5/l0;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", "Lx5/a0;", "c", "(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {
    @NotNull
    public static final a0 c(@NotNull final l0 tracer, @NotNull final String label, @NotNull final Executor executor, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final android.view.d0 d0Var = new android.view.d0(a0.b);
        ne.x a10 = y1.c.a(new c.InterfaceC0669c() { // from class: x5.c0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                Unit d10;
                d10 = e0.d(executor, tracer, label, block, d0Var, aVar);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture(...)");
        return new b0(d0Var, a10);
    }

    public static final Unit d(Executor executor, final l0 l0Var, final String str, final Function0 function0, final android.view.d0 d0Var, final c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: x5.d0
            @Override // java.lang.Runnable
            public final void run() {
                e0.e(l0.this, str, function0, d0Var, completer);
            }
        });
        return Unit.f22894a;
    }

    public static final void e(l0 l0Var, String str, Function0 function0, android.view.d0 d0Var, c.a aVar) {
        boolean isEnabled = l0Var.isEnabled();
        if (isEnabled) {
            try {
                l0Var.a(str);
            } finally {
                if (isEnabled) {
                    l0Var.d();
                }
            }
        }
        try {
            function0.invoke();
            a0.b.c cVar = a0.f35240a;
            d0Var.m(cVar);
            aVar.c(cVar);
        } catch (Throwable th2) {
            d0Var.m(new a0.b.a(th2));
            aVar.f(th2);
        }
        Unit unit = Unit.f22894a;
    }
}
