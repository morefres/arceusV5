package mu;

import gt.n;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmu/s0;", "Lnu/d;", "Lmu/q0;", "<init>", "()V", "flow", "", rl.d.f30696a, "(Lmu/q0;)Z", "", "Lmt/b;", "", "f", "(Lmu/q0;)[Lmt/b;", "g", "h", "()Z", "e", "(Lmt/b;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", ve.a.f33391e, "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s0 extends kotlin.d<q0<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlin.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull q0<?> flow) {
        pu.e0 e0Var;
        if (pu.d.a(this._state) != null) {
            return false;
        }
        AtomicReference<Object> atomicReference = this._state;
        e0Var = r0.f25154a;
        pu.d.b(atomicReference, e0Var);
        return true;
    }

    @Nullable
    public final Object e(@NotNull mt.b<? super Unit> bVar) {
        pu.e0 e0Var;
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        AtomicReference atomicReference = this._state;
        e0Var = r0.f25154a;
        if (!p1.t.a(atomicReference, e0Var, pVar)) {
            n.Companion companion = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(Unit.f22894a));
        }
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    @Override // kotlin.d
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public mt.b<Unit>[] b(@NotNull q0<?> flow) {
        pu.d.b(this._state, null);
        return kotlin.c.f27377a;
    }

    public final void g() {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        pu.e0 e0Var3;
        pu.e0 e0Var4;
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object a10 = pu.d.a(atomicReference);
            if (a10 == null) {
                return;
            }
            e0Var = r0.b;
            if (a10 == e0Var) {
                return;
            }
            e0Var2 = r0.f25154a;
            if (a10 == e0Var2) {
                AtomicReference<Object> atomicReference2 = this._state;
                e0Var3 = r0.b;
                if (p1.t.a(atomicReference2, a10, e0Var3)) {
                    return;
                }
            } else {
                AtomicReference<Object> atomicReference3 = this._state;
                e0Var4 = r0.f25154a;
                if (p1.t.a(atomicReference3, a10, e0Var4)) {
                    n.Companion companion = gt.n.INSTANCE;
                    ((ju.p) a10).resumeWith(gt.n.b(Unit.f22894a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        pu.e0 e0Var;
        pu.e0 e0Var2;
        AtomicReference<Object> atomicReference = this._state;
        e0Var = r0.f25154a;
        Object andSet = atomicReference.getAndSet(e0Var);
        Intrinsics.checkNotNull(andSet);
        e0Var2 = r0.b;
        return andSet == e0Var2;
    }
}
