package ju;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lju/i3;", "T", "Lpu/a0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lmt/b;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lmt/b;)V", "", "oldValue", "", "a1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "Y0", "()Z", "X0", "()V", "state", "T0", "(Ljava/lang/Object;)V", "Z0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i3<T> extends pu.a0<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i3(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull mt.b<? super T> r4) {
        /*
            r2 = this;
            ju.j3 r0 = ju.j3.f22107a
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadStateToRecover = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.d$b r0 = kotlin.coroutines.d.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r0)
            boolean r4 = r4 instanceof ju.l0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = pu.l0.i(r3, r4)
            pu.l0.f(r3, r4)
            r2.a1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.i3.<init>(kotlin.coroutines.CoroutineContext, mt.b):void");
    }

    @Override // pu.a0, ju.a
    public void T0(@Nullable Object state) {
        Z0();
        Object a10 = e0.a(state, this.uCont);
        mt.b<T> bVar = this.uCont;
        CoroutineContext context = bVar.getContext();
        Object i10 = pu.l0.i(context, null);
        i3<?> m10 = i10 != pu.l0.f29191a ? j0.m(bVar, context, i10) : null;
        try {
            this.uCont.resumeWith(a10);
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
    }

    @Override // pu.a0
    public void X0() {
        Z0();
    }

    public final boolean Y0() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    public final void Z0() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                pu.l0.f(pair.a(), pair.b());
            }
            this.threadStateToRecover.remove();
        }
    }

    public final void a1(@NotNull CoroutineContext context, @Nullable Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(gt.s.a(context, oldValue));
    }
}
