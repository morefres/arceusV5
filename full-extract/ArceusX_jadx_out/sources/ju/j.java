package ju;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", ve.a.f33391e, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class j {
    public static final <T> T a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2) {
        m1 a10;
        CoroutineContext j10;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(kotlin.coroutines.d.INSTANCE);
        if (dVar == null) {
            a10 = c3.f22061a.b();
            j10 = j0.j(w1.f22160a, coroutineContext.plus(a10));
        } else {
            m1 m1Var = dVar instanceof m1 ? (m1) dVar : null;
            if (m1Var != null) {
                m1 m1Var2 = m1Var.u0() ? m1Var : null;
                if (m1Var2 != null) {
                    a10 = m1Var2;
                    j10 = j0.j(w1.f22160a, coroutineContext);
                }
            }
            a10 = c3.f22061a.a();
            j10 = j0.j(w1.f22160a, coroutineContext);
        }
        g gVar = new g(j10, currentThread, a10);
        gVar.W0(r0.f22143a, gVar, function2);
        return (T) gVar.X0();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        return i.e(coroutineContext, function2);
    }
}
