package ju;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lju/c1;", "T", "Lpu/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lmt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lmt/b;)V", "", "b1", "()Z", "a1", "", "state", "", "P", "(Ljava/lang/Object;)V", "T0", "Y0", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c1<T> extends pu.a0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22059e = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public c1(@NotNull CoroutineContext coroutineContext, @NotNull mt.b<? super T> bVar) {
        super(coroutineContext, bVar);
    }

    private final boolean a1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22059e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f22059e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22059e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f22059e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // pu.a0, ju.j2
    public void P(@Nullable Object state) {
        T0(state);
    }

    @Override // pu.a0, ju.a
    public void T0(@Nullable Object state) {
        if (a1()) {
            return;
        }
        pu.j.b(nt.b.c(this.uCont), e0.a(state, this.uCont));
    }

    @Nullable
    public final Object Y0() {
        if (b1()) {
            return nt.c.e();
        }
        Object h10 = k2.h(l0());
        if (h10 instanceof c0) {
            throw ((c0) h10).cause;
        }
        return h10;
    }
}
