package mu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "Lmu/c0;", ve.a.f33391e, "(Ljava/lang/Object;)Lmu/c0;", "Lmu/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/h;", rl.d.f30696a, "(Lmu/p0;Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lmu/h;", "Lpu/e0;", "Lpu/e0;", "NONE", j6.b.f21518e, "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final pu.e0 f25154a = new pu.e0("NONE");

    @NotNull
    public static final pu.e0 b = new pu.e0("PENDING");

    @NotNull
    public static final <T> c0<T> a(T t8) {
        if (t8 == null) {
            t8 = (T) kotlin.t.f27442a;
        }
        return new q0(t8);
    }

    @NotNull
    public static final <T> h<T> d(@NotNull p0<? extends T> p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != lu.a.b) ? i0.e(p0Var, coroutineContext, i10, aVar) : p0Var;
    }
}
