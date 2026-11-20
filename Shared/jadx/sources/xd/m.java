package xd;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class m extends j {
    public final /* synthetic */ sb.k b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f35506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, sb.k kVar, sb.k kVar2, j jVar) {
        super(kVar);
        this.b = kVar2;
        this.f35505c = jVar;
        this.f35506d = tVar;
    }

    @Override // xd.j
    public final void a() {
        Object obj;
        AtomicInteger atomicInteger;
        i iVar;
        obj = this.f35506d.f35514f;
        synchronized (obj) {
            try {
                t.n(this.f35506d, this.b);
                atomicInteger = this.f35506d.f35519k;
                if (atomicInteger.getAndIncrement() > 0) {
                    iVar = this.f35506d.b;
                    iVar.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f35506d, this.f35505c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
