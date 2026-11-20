package ib;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h extends e {
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, sb.k kVar, sb.k kVar2, e eVar) {
        super(kVar);
        this.b = kVar2;
        this.f20365c = eVar;
        Objects.requireNonNull(oVar);
        this.f20366d = oVar;
    }

    @Override // ib.e
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        d dVar;
        o oVar = this.f20366d;
        obj = oVar.f20374f;
        synchronized (obj) {
            try {
                o.o(oVar, this.b);
                atomicInteger = oVar.f20379k;
                if (atomicInteger.getAndIncrement() > 0) {
                    dVar = oVar.b;
                    dVar.c("Already connected to the service.", new Object[0]);
                }
                o.q(oVar, this.f20365c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
