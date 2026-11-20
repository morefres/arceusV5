package ep;

/* loaded from: classes3.dex */
public final class v implements dt.d<rr.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16164a;
    public final dt.i<iv.y> b;

    public v(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16164a = fVar;
        this.b = iVar;
    }

    public static v a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new v(fVar, iVar);
    }

    public static rr.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (rr.a) dt.h.e(fVar.q(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public rr.a get() {
        return c(this.f16164a, this.b.get());
    }
}
