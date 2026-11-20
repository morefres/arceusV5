package ep;

/* loaded from: classes3.dex */
public final class h implements dt.d<fo.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16150a;
    public final dt.i<iv.y> b;

    public h(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16150a = fVar;
        this.b = iVar;
    }

    public static h a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new h(fVar, iVar);
    }

    public static fo.a b(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (fo.a) dt.h.e(fVar.c(yVar));
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public fo.a get() {
        return b(this.f16150a, this.b.get());
    }
}
