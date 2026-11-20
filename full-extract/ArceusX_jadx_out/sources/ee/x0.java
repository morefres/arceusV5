package ee;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class x0 extends u0 {
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f16010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f16011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(f fVar, sb.k kVar, sb.k kVar2, u0 u0Var) {
        super(kVar);
        this.b = kVar2;
        this.f16010c = u0Var;
        this.f16011d = fVar;
    }

    @Override // ee.u0
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        t0 t0Var;
        obj = this.f16011d.f15983f;
        synchronized (obj) {
            try {
                f.o(this.f16011d, this.b);
                atomicInteger = this.f16011d.f15989l;
                if (atomicInteger.getAndIncrement() > 0) {
                    t0Var = this.f16011d.b;
                    t0Var.c("Already connected to the service.", new Object[0]);
                }
                f.q(this.f16011d, this.f16010c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
