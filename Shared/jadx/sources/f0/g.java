package f0;

import g0.m;
import java.util.concurrent.Executor;
import n0.n1;
import ne.x;
import r0.n;
import y.a;
import y1.c;
import z.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public final y f16352c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f16353d;

    /* renamed from: g, reason: collision with root package name */
    public c.a<Void> f16356g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16351a = false;
    public boolean b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16354e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a.C0666a f16355f = new a.C0666a();

    public g(y yVar, Executor executor) {
        this.f16352c = yVar;
        this.f16353d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final c.a aVar) {
        gVar.f16353d.execute(new Runnable() { // from class: f0.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final c.a aVar) {
        gVar.f16353d.execute(new Runnable() { // from class: f0.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public x<Void> g(l lVar) {
        h(lVar);
        return n.s(y1.c.a(new c.InterfaceC0669c() { // from class: f0.a
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g.a(g.this, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f16354e) {
            this.f16355f.c(lVar);
        }
    }

    public void i(a.C0666a c0666a) {
        synchronized (this.f16354e) {
            c0666a.d(this.f16355f.a(), n1.c.ALWAYS_OVERRIDE);
        }
    }

    public x<Void> j() {
        k();
        return n.s(y1.c.a(new c.InterfaceC0669c() { // from class: f0.c
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g.b(g.this, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f16354e) {
            this.f16355f = new a.C0666a();
        }
    }

    public final void l() {
        c.a<Void> aVar = this.f16356g;
        if (aVar != null) {
            aVar.c(null);
            this.f16356g = null;
        }
    }

    public final void m(Exception exc) {
        c.a<Void> aVar = this.f16356g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f16356g = null;
        }
    }

    public y.a n() {
        y.a b;
        synchronized (this.f16354e) {
            b = this.f16355f.b();
        }
        return b;
    }

    public void o(final boolean z10) {
        this.f16353d.execute(new Runnable() { // from class: f0.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.p(z10);
            }
        });
    }

    public final void p(boolean z10) {
        if (this.f16351a == z10) {
            return;
        }
        this.f16351a = z10;
        if (!z10) {
            m(new m.a("The camera control has became inactive."));
        } else if (this.b) {
            r();
        }
    }

    public final void q(c.a<Void> aVar) {
        this.b = true;
        m(new m.a("Camera2CameraControl was updated with new options."));
        this.f16356g = aVar;
        if (this.f16351a) {
            r();
        }
    }

    public final void r() {
        this.f16352c.r0().a(new Runnable() { // from class: f0.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.l();
            }
        }, this.f16353d);
        this.b = false;
    }
}
