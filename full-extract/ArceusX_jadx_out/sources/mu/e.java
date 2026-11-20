package mu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004¨\u0006)"}, d2 = {"Lmu/e;", "T", "Lnu/e;", "Llu/x;", "channel", "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Llu/x;ZLkotlin/coroutines/CoroutineContext;ILlu/a;)V", "e", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lnu/e;", "Lmu/h;", "f", "()Lmu/h;", "Llu/v;", "scope", "", rl.d.f30696a, "(Llu/v;Lmt/b;)Ljava/lang/Object;", "Lju/p0;", "m", "(Lju/p0;)Llu/x;", "Lmu/i;", "collector", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "", j6.b.f21518e, "()Ljava/lang/String;", "o", "()V", "Llu/x;", "Z", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e<T> extends kotlin.e<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25047f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.x<T> channel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean consume;

    public /* synthetic */ e(lu.x xVar, boolean z10, CoroutineContext coroutineContext, int i10, lu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, z10, (i11 & 4) != 0 ? kotlin.coroutines.e.f22936a : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? lu.a.f23848a : aVar);
    }

    @Override // kotlin.e
    @NotNull
    public String b() {
        return "channel=" + this.channel;
    }

    @Override // kotlin.e, mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull mt.b<? super Unit> bVar) {
        if (this.capacity != -3) {
            Object collect = super.collect(iVar, bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
        o();
        Object c10 = l.c(iVar, this.channel, this.consume, bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    @Override // kotlin.e
    @Nullable
    public Object d(@NotNull lu.v<? super T> vVar, @NotNull mt.b<? super Unit> bVar) {
        Object c10 = l.c(new kotlin.z(vVar), this.channel, this.consume, bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    @Override // kotlin.e
    @NotNull
    public kotlin.e<T> e(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        return new e(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.e
    @NotNull
    public h<T> f() {
        return new e(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlin.e
    @NotNull
    public lu.x<T> m(@NotNull ju.p0 scope) {
        o();
        return this.capacity == -3 ? this.channel : super.m(scope);
    }

    public final void o() {
        if (this.consume && f25047f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull lu.x<? extends T> xVar, boolean z10, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        super(coroutineContext, i10, aVar);
        this.channel = xVar;
        this.consume = z10;
    }
}
