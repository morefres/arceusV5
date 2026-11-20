package ep;

/* loaded from: classes3.dex */
public final class j implements dt.d<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16152a;
    public final dt.i<iv.y> b;

    public j(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16152a = fVar;
        this.b = iVar;
    }

    public static j a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new j(fVar, iVar);
    }

    public static w c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (w) dt.h.e(fVar.e(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f16152a, this.b.get());
    }
}
