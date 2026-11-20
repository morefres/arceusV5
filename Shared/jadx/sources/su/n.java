package su;

import gt.n;
import ju.l0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lju/n;", "result", "", "c", "(Lju/n;Ljava/lang/Object;)V", "", "exception", rl.d.f30696a, "(Lju/n;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void c(ju.n<? super T> nVar, T t8) {
        l0 l0Var = (l0) nVar.getContext().get(l0.INSTANCE);
        if (l0Var != null) {
            nVar.t(l0Var, t8);
        } else {
            nVar.resumeWith(gt.n.b(t8));
        }
    }

    public static final void d(ju.n<?> nVar, Throwable th2) {
        l0 l0Var = (l0) nVar.getContext().get(l0.INSTANCE);
        if (l0Var != null) {
            nVar.G(l0Var, th2);
        } else {
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(th2)));
        }
    }
}
