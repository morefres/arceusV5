package lu;

import ju.n0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import lu.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Llu/u;", "E", "Llu/h;", "Llu/v;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Llu/g;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Llu/g;)V", "", "value", "Z0", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "U0", "(Ljava/lang/Throwable;Z)V", j6.b.f21518e, "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class u<E> extends h<E> implements v<E> {
    public u(@NotNull CoroutineContext coroutineContext, @NotNull g<E> gVar) {
        super(coroutineContext, gVar, true, true);
    }

    @Override // ju.a
    public void U0(@NotNull Throwable cause, boolean handled) {
        if (Y0().D(cause) || handled) {
            return;
        }
        n0.a(getContext(), cause);
    }

    @Override // ju.a
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public void V0(@NotNull Unit value) {
        y.a.a(Y0(), null, 1, null);
    }

    @Override // lu.v
    public /* bridge */ /* synthetic */ y a() {
        return X0();
    }

    @Override // ju.a, ju.j2, ju.d2
    public boolean b() {
        return super.b();
    }
}
