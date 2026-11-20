package wn;

/* loaded from: classes3.dex */
public final class f implements dt.d<k> {

    /* renamed from: a, reason: collision with root package name */
    public final e f34450a;
    public final dt.i<z> b;

    public f(e eVar, dt.i<z> iVar) {
        this.f34450a = eVar;
        this.b = iVar;
    }

    public static k a(e eVar, z zVar) {
        return (k) dt.h.e(eVar.a(zVar));
    }

    public static f b(e eVar, dt.i<z> iVar) {
        return new f(eVar, iVar);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return a(this.f34450a, this.b.get());
    }
}
