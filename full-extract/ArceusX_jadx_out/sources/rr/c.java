package rr;

import dt.d;
import dt.i;
import rr.b;

/* loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<a> f30756a;

    public c(i<a> iVar) {
        this.f30756a = iVar;
    }

    public static c a(i<a> iVar) {
        return new c(iVar);
    }

    public static b.a c(a aVar) {
        return new b.a(aVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f30756a.get());
    }
}
