package lu;

import java.util.concurrent.CancellationException;
import ju.e2;
import ju.j2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0001\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\u00032\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096A¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00102\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006;"}, d2 = {"Llu/h;", "E", "Lju/a;", "", "Llu/g;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Llu/g;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "", "U", "(Ljava/lang/Throwable;)V", "element", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "Llu/k;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "D", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "s", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "C", "(Lmt/b;)Ljava/lang/Object;", "h", "A", "()Ljava/lang/Object;", "Llu/i;", "iterator", "()Llu/i;", rl.d.f30696a, "Llu/g;", "Y0", "()Llu/g;", "X0", "channel", "K", "()Z", "isClosedForSend", "i", "isClosedForReceive", "Lsu/h;", "y", "()Lsu/h;", "onReceive", "z", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class h<E> extends ju.a<Unit> implements g<E> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<E> _channel;

    public h(@NotNull CoroutineContext coroutineContext, @NotNull g<E> gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = gVar;
    }

    @Override // lu.x
    @NotNull
    public Object A() {
        return this._channel.A();
    }

    @Override // lu.x
    @Nullable
    public Object C(@NotNull mt.b<? super E> bVar) {
        return this._channel.C(bVar);
    }

    @Override // lu.y
    public boolean D(@Nullable Throwable cause) {
        return this._channel.D(cause);
    }

    @Override // lu.y
    @Nullable
    public Object E(E e10, @NotNull mt.b<? super Unit> bVar) {
        return this._channel.E(e10, bVar);
    }

    @Override // lu.y
    public boolean K() {
        return this._channel.K();
    }

    @Override // ju.j2
    public void U(@NotNull Throwable cause) {
        CancellationException M0 = j2.M0(this, cause, null, 1, null);
        this._channel.c(M0);
        S(M0);
    }

    @NotNull
    public final g<E> X0() {
        return this;
    }

    @NotNull
    public final g<E> Y0() {
        return this._channel;
    }

    @Override // ju.j2, ju.d2
    public final void c(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new e2(X(), null, this);
        }
        U(cause);
    }

    @Override // lu.x
    @Nullable
    public Object h(@NotNull mt.b<? super k<? extends E>> bVar) {
        Object h10 = this._channel.h(bVar);
        nt.c.e();
        return h10;
    }

    @Override // lu.x
    public boolean i() {
        return this._channel.i();
    }

    @Override // lu.x
    @NotNull
    public i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // lu.y
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // lu.y
    public void s(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.s(handler);
    }

    @Override // lu.y
    @NotNull
    public Object v(E element) {
        return this._channel.v(element);
    }

    @Override // lu.x
    @NotNull
    public su.h<E> y() {
        return this._channel.y();
    }

    @Override // lu.x
    @NotNull
    public su.h<k<E>> z() {
        return this._channel.z();
    }
}
