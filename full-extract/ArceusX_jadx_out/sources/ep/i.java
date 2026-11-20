package ep;

/* loaded from: classes3.dex */
public final class i implements dt.d<com.withpersona.sdk2.inquiry.governmentid.network.b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16151a;
    public final dt.i<iv.y> b;

    public i(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16151a = fVar;
        this.b = iVar;
    }

    public static i a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new i(fVar, iVar);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.network.b c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (com.withpersona.sdk2.inquiry.governmentid.network.b) dt.h.e(fVar.d(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.network.b get() {
        return c(this.f16151a, this.b.get());
    }
}
