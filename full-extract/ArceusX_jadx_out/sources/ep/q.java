package ep;

/* loaded from: classes3.dex */
public final class q implements dt.d<aq.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16159a;
    public final dt.i<iv.y> b;

    public q(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16159a = fVar;
        this.b = iVar;
    }

    public static q a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new q(fVar, iVar);
    }

    public static aq.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (aq.a) dt.h.e(fVar.l(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public aq.a get() {
        return c(this.f16159a, this.b.get());
    }
}
