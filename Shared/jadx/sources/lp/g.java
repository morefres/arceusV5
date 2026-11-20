package lp;

import dt.i;
import lp.e;

/* loaded from: classes3.dex */
public final class g implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f23818a;

    public g(f fVar) {
        this.f23818a = fVar;
    }

    public static i<e.a> a(f fVar) {
        return dt.e.a(new g(fVar));
    }

    @Override // lp.e.a
    public e create(String str) {
        return this.f23818a.b(str);
    }
}
