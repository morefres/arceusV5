package ep;

/* loaded from: classes3.dex */
public final class f implements dt.d<zn.c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16148a;
    public final dt.i<iv.y> b;

    public f(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16148a = fVar;
        this.b = iVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new f(fVar, iVar);
    }

    public static zn.c b(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (zn.c) dt.h.e(fVar.a(yVar));
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zn.c get() {
        return b(this.f16148a, this.b.get());
    }
}
