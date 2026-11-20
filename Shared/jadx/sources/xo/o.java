package xo;

import android.app.Application;

/* loaded from: classes3.dex */
public final class o implements dt.d<Application> {

    /* renamed from: a, reason: collision with root package name */
    public final n f35901a;

    public o(n nVar) {
        this.f35901a = nVar;
    }

    public static Application a(n nVar) {
        return (Application) dt.h.e(nVar.a());
    }

    public static o b(n nVar) {
        return new o(nVar);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return a(this.f35901a);
    }
}
