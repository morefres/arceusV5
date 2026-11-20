package or;

import dt.d;
import dt.i;
import or.a;

/* loaded from: classes3.dex */
public final class b implements d<a.C0492a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<c> f28128a;

    public b(i<c> iVar) {
        this.f28128a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0492a c(c cVar) {
        return new a.C0492a(cVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0492a get() {
        return c(this.f28128a.get());
    }
}
