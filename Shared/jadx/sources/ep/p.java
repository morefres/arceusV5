package ep;

/* loaded from: classes3.dex */
public final class p implements dt.d<y> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16158a;
    public final dt.i<iv.y> b;

    public p(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16158a = fVar;
        this.b = iVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new p(fVar, iVar);
    }

    public static y c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (y) dt.h.e(fVar.k(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f16158a, this.b.get());
    }
}
