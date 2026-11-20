package dn;

/* loaded from: classes3.dex */
public final class l implements dt.d<jn.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f15102a;
    public final dt.i<jn.b> b;

    public l(k kVar, dt.i<jn.b> iVar) {
        this.f15102a = kVar;
        this.b = iVar;
    }

    public static jn.a a(k kVar, at.a<jn.b> aVar) {
        return (jn.a) dt.h.e(kVar.a(aVar));
    }

    public static l b(k kVar, dt.i<jn.b> iVar) {
        return new l(kVar, iVar);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public jn.a get() {
        return a(this.f15102a, dt.c.b(this.b));
    }
}
