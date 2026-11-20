package p1;

import java.util.Objects;
import y1.c;

/* loaded from: classes.dex */
public class n<T> {

    /* renamed from: a, reason: collision with root package name */
    public x2.c<c.a<Void>, T> f28317a;

    public static /* synthetic */ Object a(n nVar, Object obj, c.a aVar) {
        x2.c<c.a<Void>, T> cVar = nVar.f28317a;
        if (cVar != null) {
            c.a<Void> aVar2 = cVar.f35015a;
            Objects.requireNonNull(aVar2);
            aVar2.d();
        }
        nVar.f28317a = new x2.c<>(aVar, obj);
        return "PendingValue " + obj;
    }

    public void b(t.a<T, ne.x<Void>> aVar) {
        p0.z.b();
        x2.c<c.a<Void>, T> cVar = this.f28317a;
        if (cVar != null) {
            ne.x<Void> apply = aVar.apply(cVar.b);
            c.a<Void> aVar2 = this.f28317a.f35015a;
            Objects.requireNonNull(aVar2);
            r0.n.t(apply, aVar2);
            this.f28317a = null;
        }
    }

    public ne.x<Void> c(final T t8) {
        p0.z.b();
        return y1.c.a(new c.InterfaceC0669c() { // from class: p1.m
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return n.a(n.this, t8, aVar);
            }
        });
    }
}
