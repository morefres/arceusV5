package xo;

/* loaded from: classes3.dex */
public final class r implements dt.d<ju.p0> {

    /* renamed from: a, reason: collision with root package name */
    public final n f35906a;

    public r(n nVar) {
        this.f35906a = nVar;
    }

    public static r a(n nVar) {
        return new r(nVar);
    }

    public static ju.p0 c(n nVar) {
        return (ju.p0) dt.h.e(nVar.getLifecycleCoroutineScope());
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ju.p0 get() {
        return c(this.f35906a);
    }
}
