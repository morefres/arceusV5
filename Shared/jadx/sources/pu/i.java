package pu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.c3;
import ju.d1;
import ju.m1;
import ju.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00102\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u0010R\u0014\u00104\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u001c\u00107\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b-\u00108R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0013\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0>8\u0002X\u0082\u0004¨\u0006@"}, d2 = {"Lpu/i;", "T", "Lju/d1;", "Lot/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lmt/b;", "Lju/l0;", "dispatcher", "continuation", "<init>", "(Lju/l0;Lmt/b;)V", "", "s", "()Z", "", "l", "()V", "v", "Lju/p;", "m", "()Lju/p;", "Lju/n;", "", "w", "(Lju/n;)Ljava/lang/Throwable;", "cause", "u", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lgt/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "o", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", rl.d.f30696a, "Lju/l0;", "e", "Lmt/b;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getCallerFrame", "()Lot/e;", "callerFrame", "()Lmt/b;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "q", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i<T> extends d1<T> implements ot.e, mt.b<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29177h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ju.l0 dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mt.b<T> continuation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object _state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull ju.l0 l0Var, @NotNull mt.b<? super T> bVar) {
        super(-1);
        e0 e0Var;
        this.dispatcher = l0Var;
        this.continuation = bVar;
        e0Var = j.f29182a;
        this._state = e0Var;
        this.countOrElement = l0.g(getContext());
    }

    @Override // ju.d1
    @NotNull
    public mt.b<T> e() {
        return this;
    }

    @Override // ot.e
    @Nullable
    public ot.e getCallerFrame() {
        mt.b<T> bVar = this.continuation;
        if (bVar instanceof ot.e) {
            return (ot.e) bVar;
        }
        return null;
    }

    @Override // mt.b
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // ju.d1
    @Nullable
    public Object j() {
        e0 e0Var;
        Object obj = this._state;
        e0Var = j.f29182a;
        this._state = e0Var;
        return obj;
    }

    public final void l() {
        while (f29177h.get(this) == j.b) {
        }
    }

    @Nullable
    public final ju.p<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29177h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f29177h.set(this, j.b);
                return null;
            }
            if (obj instanceof ju.p) {
                if (y1.b.a(f29177h, this, obj, j.b)) {
                    return (ju.p) obj;
                }
            } else if (obj != j.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void o(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.I(context, this);
    }

    public final ju.p<?> q() {
        Object obj = f29177h.get(this);
        if (obj instanceof ju.p) {
            return (ju.p) obj;
        }
        return null;
    }

    @Override // mt.b
    public void resumeWith(@NotNull Object result) {
        Object b = ju.e0.b(result);
        if (j.d(this.dispatcher, getContext())) {
            this._state = b;
            this.resumeMode = 0;
            j.c(this.dispatcher, getContext(), this);
            return;
        }
        m1 b10 = c3.f22061a.b();
        if (b10.g0()) {
            this._state = b;
            this.resumeMode = 0;
            b10.Z(this);
            return;
        }
        b10.c0(true);
        try {
            CoroutineContext context = getContext();
            Object i10 = l0.i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f22894a;
                while (b10.q0()) {
                }
            } finally {
                l0.f(context, i10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s() {
        return f29177h.get(this) != null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + t0.c(this.continuation) + ']';
    }

    public final boolean u(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29177h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = j.b;
            if (Intrinsics.c(obj, e0Var)) {
                if (y1.b.a(f29177h, this, e0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (y1.b.a(f29177h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        l();
        ju.p<?> q10 = q();
        if (q10 != null) {
            q10.u();
        }
    }

    @Nullable
    public final Throwable w(@NotNull ju.n<?> continuation) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29177h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = j.b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (y1.b.a(f29177h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!y1.b.a(f29177h, this, e0Var, continuation));
        return null;
    }
}
