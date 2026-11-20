package lu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.d0;
import lu.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pu.s0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Llu/s;", "E", "Llu/e;", "", "capacity", "Llu/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILlu/a;Lkotlin/jvm/functions/Function1;)V", "element", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "Llu/k;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isSendOp", "z1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "y1", "m", "I", "n", "Llu/a;", "C0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class s<E> extends e<E> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a onBufferOverflow;

    public s(int i10, @NotNull a aVar, @Nullable Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.capacity = i10;
        this.onBufferOverflow = aVar;
        if (aVar == a.f23848a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + d0.b(e.class).g() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ <E> Object x1(s<E> sVar, E e10, mt.b<? super Unit> bVar) {
        s0 c10;
        Object z12 = sVar.z1(e10, true);
        if (!(z12 instanceof k.Closed)) {
            return Unit.f22894a;
        }
        k.e(z12);
        Function1<E, Unit> function1 = sVar.onUndeliveredElement;
        if (function1 == null || (c10 = pu.x.c(function1, e10, null, 2, null)) == null) {
            throw sVar.p0();
        }
        gt.a.a(c10, sVar.p0());
        throw c10;
    }

    @Override // lu.e
    public boolean C0() {
        return this.onBufferOverflow == a.b;
    }

    @Override // lu.e, lu.y
    @Nullable
    public Object E(E e10, @NotNull mt.b<? super Unit> bVar) {
        return x1(this, e10, bVar);
    }

    @Override // lu.e, lu.y
    @NotNull
    public Object v(E element) {
        return z1(element, false);
    }

    public final Object y1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        s0 c10;
        Object v5 = super.v(element);
        if (k.i(v5) || k.h(v5)) {
            return v5;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (c10 = pu.x.c(function1, element, null, 2, null)) == null) {
            return k.INSTANCE.c(Unit.f22894a);
        }
        throw c10;
    }

    public final Object z1(E element, boolean isSendOp) {
        return this.onBufferOverflow == a.f23849c ? y1(element, isSendOp) : n1(element);
    }
}
