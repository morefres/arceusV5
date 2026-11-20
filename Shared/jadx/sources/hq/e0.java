package hq;

/* loaded from: classes3.dex */
public final class e0 implements dt.d<pq.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f19575a;
    public final dt.i<pq.c> b;

    public e0(c0 c0Var, dt.i<pq.c> iVar) {
        this.f19575a = c0Var;
        this.b = iVar;
    }

    public static e0 a(c0 c0Var, dt.i<pq.c> iVar) {
        return new e0(c0Var, iVar);
    }

    public static pq.a c(c0 c0Var, pq.c cVar) {
        return (pq.a) dt.h.e(c0Var.b(cVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public pq.a get() {
        return c(this.f19575a, this.b.get());
    }
}
