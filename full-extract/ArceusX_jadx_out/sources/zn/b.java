package zn;

import dt.i;
import zn.a;

/* loaded from: classes3.dex */
public final class b implements dt.d<a.C0697a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<c> f38133a;

    public b(i<c> iVar) {
        this.f38133a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0697a c(c cVar) {
        return new a.C0697a(cVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0697a get() {
        return c(this.f38133a.get());
    }
}
