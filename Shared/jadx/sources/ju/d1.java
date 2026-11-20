package ju;

import gt.n;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lju/d1;", "T", "Lru/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "", ve.a.f33391e, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "i", "(Ljava/lang/Throwable;)V", "c", "I", "Lmt/b;", "e", "()Lmt/b;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class d1<T> extends ru.h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int resumeMode;

    public d1(int i10) {
        this.resumeMode = i10;
    }

    public void a(@Nullable Object takenState, @NotNull Throwable cause) {
    }

    @NotNull
    public abstract mt.b<T> e();

    @Nullable
    public Throwable g(@Nullable Object state) {
        c0 c0Var = state instanceof c0 ? (c0) state : null;
        if (c0Var != null) {
            return c0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(@Nullable Object state) {
        return state;
    }

    public final void i(@NotNull Throwable exception) {
        n0.a(e().getContext(), new s0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    @Nullable
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mt.b<T> e10 = e();
            Intrinsics.d(e10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            pu.i iVar = (pu.i) e10;
            mt.b<T> bVar = iVar.continuation;
            Object obj = iVar.countOrElement;
            CoroutineContext context = bVar.getContext();
            Object i10 = pu.l0.i(context, obj);
            d2 d2Var = null;
            i3<?> m10 = i10 != pu.l0.f29191a ? j0.m(bVar, context, i10) : null;
            try {
                CoroutineContext context2 = bVar.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null && e1.b(this.resumeMode)) {
                    d2Var = (d2) context2.get(d2.INSTANCE);
                }
                if (d2Var != null && !d2Var.b()) {
                    CancellationException m11 = d2Var.m();
                    a(j10, m11);
                    n.Companion companion = gt.n.INSTANCE;
                    bVar.resumeWith(gt.n.b(gt.o.a(m11)));
                } else if (g10 != null) {
                    n.Companion companion2 = gt.n.INSTANCE;
                    bVar.resumeWith(gt.n.b(gt.o.a(g10)));
                } else {
                    n.Companion companion3 = gt.n.INSTANCE;
                    bVar.resumeWith(gt.n.b(h(j10)));
                }
                Unit unit = Unit.f22894a;
                if (m10 == null || m10.Y0()) {
                    pu.l0.f(context, i10);
                }
            } catch (Throwable th2) {
                if (m10 == null || m10.Y0()) {
                    pu.l0.f(context, i10);
                }
                throw th2;
            }
        } catch (b1 e11) {
            n0.a(e().getContext(), e11.getCause());
        } catch (Throwable th3) {
            i(th3);
        }
    }
}
