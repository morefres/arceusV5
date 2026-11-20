package ku;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.g2;
import ju.i1;
import ju.n;
import ju.q2;
import ju.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b(\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lku/f;", "Lku/g;", "Lju/y0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "L", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lju/n;", "continuation", "f", "(JLju/n;)V", "Lju/i1;", "h", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lju/i1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c0", "c", "Landroid/os/Handler;", rl.d.f30696a, "Ljava/lang/String;", "e", "Z", "Lku/f;", "e0", "()Lku/f;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends g implements y0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean invokeImmediately;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f immediate;

    public f(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new f(handler, str, true);
    }

    public static final void g0(f fVar, Runnable runnable) {
        fVar.handler.removeCallbacks(runnable);
    }

    public static final void j0(n nVar, f fVar) {
        nVar.t(fVar, Unit.f22894a);
    }

    public static final Unit o0(f fVar, Runnable runnable, Throwable th2) {
        fVar.handler.removeCallbacks(runnable);
        return Unit.f22894a;
    }

    @Override // ju.l0
    public boolean L(@NotNull CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.c(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public final void c0(CoroutineContext context, Runnable block) {
        g2.c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().y(context, block);
    }

    @Override // ju.n2
    @NotNull
    /* renamed from: e0, reason: from getter and merged with bridge method [inline-methods] */
    public f W() {
        return this.immediate;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return fVar.handler == this.handler && fVar.invokeImmediately == this.invokeImmediately;
    }

    @Override // ju.y0
    public void f(long timeMillis, @NotNull final n<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: ku.c
            @Override // java.lang.Runnable
            public final void run() {
                f.j0(n.this, this);
            }
        };
        if (this.handler.postDelayed(runnable, kotlin.ranges.d.g(timeMillis, 4611686018427387903L))) {
            continuation.k(new Function1() { // from class: ku.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit o02;
                    o02 = f.o0(f.this, runnable, (Throwable) obj);
                    return o02;
                }
            });
        } else {
            c0(continuation.getContext(), runnable);
        }
    }

    @Override // ku.g, ju.y0
    @NotNull
    public i1 h(long timeMillis, @NotNull final Runnable block, @NotNull CoroutineContext context) {
        if (this.handler.postDelayed(block, kotlin.ranges.d.g(timeMillis, 4611686018427387903L))) {
            return new i1() { // from class: ku.e
                @Override // ju.i1
                public final void a() {
                    f.g0(f.this, block);
                }
            };
        }
        c0(context, block);
        return q2.f22142a;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // ju.n2, ju.l0
    @NotNull
    /* renamed from: toString */
    public String getName() {
        String X = X();
        if (X != null) {
            return X;
        }
        String str = this.name;
        if (str == null) {
            str = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return str;
        }
        return str + ".immediate";
    }

    @Override // ju.l0
    public void y(@NotNull CoroutineContext context, @NotNull Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        c0(context, block);
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
