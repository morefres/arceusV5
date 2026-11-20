package ju;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lju/y;", "T", "Lju/j2;", "Lju/x;", "Lju/d2;", "parent", "<init>", "(Lju/d2;)V", "g", "()Ljava/lang/Object;", "w", "(Lmt/b;)Ljava/lang/Object;", "value", "", "r", "(Ljava/lang/Object;)Z", "", "exception", "q", "(Ljava/lang/Throwable;)Z", "h0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class y<T> extends j2 implements x<T> {
    public y(@Nullable d2 d2Var) {
        super(true);
        q0(d2Var);
    }

    @Override // ju.w0
    public T g() {
        return (T) d0();
    }

    @Override // ju.j2
    public boolean h0() {
        return true;
    }

    @Override // ju.x
    public boolean q(@NotNull Throwable exception) {
        return w0(new c0(exception, false, 2, null));
    }

    @Override // ju.x
    public boolean r(T value) {
        return w0(value);
    }

    @Override // ju.w0
    @Nullable
    public Object w(@NotNull mt.b<? super T> bVar) {
        Object Q = Q(bVar);
        nt.c.e();
        return Q;
    }
}
