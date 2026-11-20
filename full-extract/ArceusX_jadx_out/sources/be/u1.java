package be;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class u1 extends r1 {
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f4002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g gVar, sb.k kVar, sb.k kVar2, r1 r1Var) {
        super(kVar);
        this.f4003d = gVar;
        this.b = kVar2;
        this.f4002c = r1Var;
    }

    @Override // be.r1
    public final void c() {
        Object obj;
        AtomicInteger atomicInteger;
        q1 q1Var;
        obj = this.f4003d.f3965f;
        synchronized (obj) {
            try {
                g.n(this.f4003d, this.b);
                atomicInteger = this.f4003d.f3970k;
                if (atomicInteger.getAndIncrement() > 0) {
                    q1Var = this.f4003d.b;
                    q1Var.d("Already connected to the service.", new Object[0]);
                }
                g.p(this.f4003d, this.f4002c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
