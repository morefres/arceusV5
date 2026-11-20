package mu;

import ju.d2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmu/d0;", "T", "Lmu/g0;", "Lmu/c;", "Lnu/q;", "flow", "Lju/d2;", "job", "<init>", "(Lmu/g0;Lju/d2;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/h;", "h", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Lju/d2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d0<T> implements g0<T>, c<T>, kotlin.q<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0<T> f25046a;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final d2 job;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull g0<? extends T> g0Var, @Nullable d2 d2Var) {
        this.f25046a = g0Var;
        this.job = d2Var;
    }

    @Override // mu.g0, mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull mt.b<?> bVar) {
        return this.f25046a.collect(iVar, bVar);
    }

    @Override // kotlin.q
    @NotNull
    public h<T> h(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        return i0.e(this, context, capacity, onBufferOverflow);
    }
}
