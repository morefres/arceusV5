package bp;

/* loaded from: classes3.dex */
public final class d implements dt.d<xo.h> {

    /* renamed from: a, reason: collision with root package name */
    public final c f4324a;

    public d(c cVar) {
        this.f4324a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static xo.h b(c cVar) {
        return (xo.h) dt.h.e(cVar.getEnvironment());
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xo.h get() {
        return b(this.f4324a);
    }
}
