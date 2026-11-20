package n0;

import g0.c2;

/* loaded from: classes.dex */
public final class b4 implements g0.c2 {

    /* renamed from: d, reason: collision with root package name */
    public final long f25315d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.c2 f25316e;

    public b4(long j10, g0.c2 c2Var) {
        x2.g.b(j10 >= 0, "Timeout must be non-negative.");
        this.f25315d = j10;
        this.f25316e = c2Var;
    }

    @Override // g0.c2
    public long a() {
        return this.f25315d;
    }

    @Override // g0.c2
    public c2.c e(c2.b bVar) {
        c2.c e10 = this.f25316e.e(bVar);
        return (a() <= 0 || bVar.o() < a() - e10.b()) ? e10 : c2.c.f17806d;
    }
}
