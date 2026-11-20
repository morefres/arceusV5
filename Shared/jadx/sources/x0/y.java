package x0;

import g0.h1;
import g0.l1;
import java.util.Objects;
import java.util.concurrent.Executor;
import y1.c;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f34996a;
    public final l1 b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.a<Throwable> f34997c;

    public y(g0.n nVar) {
        x2.g.a(nVar.g() == 4);
        this.f34996a = nVar.c();
        l1 d10 = nVar.d();
        Objects.requireNonNull(d10);
        this.b = d10;
        this.f34997c = nVar.b();
    }

    public static /* synthetic */ Object a(final y yVar, final l1.a aVar, final c.a aVar2) {
        yVar.f34996a.execute(new Runnable() { // from class: x0.x
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = y.this;
                aVar2.c(yVar2.b.a(aVar));
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public l1.b c(final l1.a aVar) {
        try {
            return (l1.b) y1.c.a(new c.InterfaceC0669c() { // from class: x0.w
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar2) {
                    return y.a(y.this, aVar, aVar2);
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new h1(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
