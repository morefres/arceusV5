package ju;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m3 {
    @Nullable
    public static final Object a(@NotNull mt.b<? super Unit> bVar) {
        Object e10;
        CoroutineContext context = bVar.getContext();
        g2.g(context);
        mt.b c10 = nt.b.c(bVar);
        pu.i iVar = c10 instanceof pu.i ? (pu.i) c10 : null;
        if (iVar == null) {
            e10 = Unit.f22894a;
        } else {
            if (pu.j.d(iVar.dispatcher, context)) {
                iVar.o(context, Unit.f22894a);
            } else {
                l3 l3Var = new l3();
                CoroutineContext plus = context.plus(l3Var);
                Unit unit = Unit.f22894a;
                iVar.o(plus, unit);
                if (l3Var.dispatcherWasUnconfined) {
                    e10 = pu.j.e(iVar) ? nt.c.e() : unit;
                }
            }
            e10 = nt.c.e();
        }
        if (e10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }
}
