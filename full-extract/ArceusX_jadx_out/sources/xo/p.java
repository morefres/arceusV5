package xo;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p implements dt.d<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final n f35903a;

    public p(n nVar) {
        this.f35903a = nVar;
    }

    public static Context a(n nVar) {
        return (Context) dt.h.e(nVar.b());
    }

    public static p b(n nVar) {
        return new p(nVar);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f35903a);
    }
}
