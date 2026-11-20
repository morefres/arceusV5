package sq;

import dt.d;
import dt.i;
import ju.p0;
import nq.e;

/* loaded from: classes3.dex */
public final class b implements d<a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<e> f31642a;
    public final i<eo.e> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<p0> f31643c;

    public b(i<e> iVar, i<eo.e> iVar2, i<p0> iVar3) {
        this.f31642a = iVar;
        this.b = iVar2;
        this.f31643c = iVar3;
    }

    public static b a(i<e> iVar, i<eo.e> iVar2, i<p0> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static a c(e eVar, eo.e eVar2, p0 p0Var) {
        return new a(eVar, eVar2, p0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f31642a.get(), this.b.get(), this.f31643c.get());
    }
}
