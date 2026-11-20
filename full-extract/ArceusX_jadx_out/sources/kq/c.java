package kq;

import dt.h;

/* loaded from: classes3.dex */
public final class c implements dt.d<a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f23144a;

    public c(b bVar) {
        this.f23144a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static a b(b bVar) {
        return (a) h.e(bVar.getDataCollector());
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f23144a);
    }
}
