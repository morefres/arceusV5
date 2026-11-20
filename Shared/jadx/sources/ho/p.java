package ho;

/* loaded from: classes3.dex */
public final class p implements dt.d<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<sq.a> f19515a;

    public p(dt.i<sq.a> iVar) {
        this.f19515a = iVar;
    }

    public static p a(dt.i<sq.a> iVar) {
        return new p(iVar);
    }

    public static n c(sq.a aVar) {
        return new n(aVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f19515a.get());
    }
}
