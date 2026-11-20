package jq;

import dt.i;
import ju.l0;

/* loaded from: classes3.dex */
public final class b implements dt.d<a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<l0> f22031a;

    public b(i<l0> iVar) {
        this.f22031a = iVar;
    }

    public static b a(i<l0> iVar) {
        return new b(iVar);
    }

    public static a c(l0 l0Var) {
        return new a(l0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f22031a.get());
    }
}
