package b8;

/* loaded from: classes.dex */
public final class r<T> implements y7.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final o f3908a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.c f3909c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.g<T, byte[]> f3910d;

    /* renamed from: e, reason: collision with root package name */
    public final s f3911e;

    public r(o oVar, String str, y7.c cVar, y7.g<T, byte[]> gVar, s sVar) {
        this.f3908a = oVar;
        this.b = str;
        this.f3909c = cVar;
        this.f3910d = gVar;
        this.f3911e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // y7.h
    public void a(y7.d<T> dVar) {
        c(dVar, new y7.j() { // from class: b8.q
            @Override // y7.j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(y7.d<T> dVar, y7.j jVar) {
        this.f3911e.a(n.a().e(this.f3908a).c(dVar).f(this.b).d(this.f3910d).b(this.f3909c).a(), jVar);
    }
}
