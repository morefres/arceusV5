package fo;

import dt.i;
import eo.e;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i<e> f17518a;
    public final i<a> b;

    public c(i<e> iVar, i<a> iVar2) {
        this.f17518a = iVar;
        this.b = iVar2;
    }

    public static c a(i<e> iVar, i<a> iVar2) {
        return new c(iVar, iVar2);
    }

    public static b c(String str, e eVar, a aVar) {
        return new b(str, eVar, aVar);
    }

    public b b(String str) {
        return c(str, this.f17518a.get(), this.b.get());
    }
}
