package fo;

import dt.e;
import dt.i;
import fo.b;

/* loaded from: classes3.dex */
public final class d implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f17519a;

    public d(c cVar) {
        this.f17519a = cVar;
    }

    public static i<b.a> a(c cVar) {
        return e.a(new d(cVar));
    }

    @Override // fo.b.a
    public b create(String str) {
        return this.f17519a.b(str);
    }
}
