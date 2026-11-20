package ep;

/* loaded from: classes3.dex */
public final class s implements dt.d<or.c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16161a;
    public final dt.i<iv.y> b;

    public s(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        this.f16161a = fVar;
        this.b = iVar;
    }

    public static s a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<iv.y> iVar) {
        return new s(fVar, iVar);
    }

    public static or.c c(com.withpersona.sdk2.inquiry.internal.network.f fVar, iv.y yVar) {
        return (or.c) dt.h.e(fVar.n(yVar));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public or.c get() {
        return c(this.f16161a, this.b.get());
    }
}
