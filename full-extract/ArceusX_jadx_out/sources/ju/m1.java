package ju;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u000eR\"\u0010%\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\t¨\u0006,"}, d2 = {"Lju/m1;", "Lju/l0;", "<init>", "()V", "", "o0", "()J", "", "q0", "()Z", "u0", "Lju/d1;", "task", "", "Z", "(Lju/d1;)V", "unconfined", "c0", "(Z)V", "W", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lju/l0;", "shutdown", "Y", "(Z)J", "c", "J", "useCount", rl.d.f30696a, "shared", "Lkotlin/collections/i;", "e", "Lkotlin/collections/i;", "unconfinedQueue", "a0", "nextTime", "g0", "isUnconfinedLoopActive", "j0", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class m1 extends l0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long useCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public kotlin.collections.i<d1<?>> unconfinedQueue;

    public static /* synthetic */ void X(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        m1Var.W(z10);
    }

    public static /* synthetic */ void e0(m1 m1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        m1Var.c0(z10);
    }

    @Override // ju.l0
    @NotNull
    public final l0 P(int parallelism, @Nullable String name) {
        pu.m.a(parallelism);
        return pu.m.b(this, name);
    }

    public final void W(boolean unconfined) {
        long Y = this.useCount - Y(unconfined);
        this.useCount = Y;
        if (Y <= 0 && this.shared) {
            shutdown();
        }
    }

    public final long Y(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public final void Z(@NotNull d1<?> task) {
        kotlin.collections.i<d1<?>> iVar = this.unconfinedQueue;
        if (iVar == null) {
            iVar = new kotlin.collections.i<>();
            this.unconfinedQueue = iVar;
        }
        iVar.addLast(task);
    }

    public long a0() {
        kotlin.collections.i<d1<?>> iVar = this.unconfinedQueue;
        return (iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void c0(boolean unconfined) {
        this.useCount += Y(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    public final boolean g0() {
        return this.useCount >= Y(true);
    }

    public final boolean j0() {
        kotlin.collections.i<d1<?>> iVar = this.unconfinedQueue;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    public long o0() {
        return !q0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean q0() {
        d1<?> p8;
        kotlin.collections.i<d1<?>> iVar = this.unconfinedQueue;
        if (iVar == null || (p8 = iVar.p()) == null) {
            return false;
        }
        p8.run();
        return true;
    }

    public void shutdown() {
    }

    public boolean u0() {
        return false;
    }
}
