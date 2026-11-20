package m0;

import android.graphics.Bitmap;
import g0.f1;
import java.util.Objects;
import m0.l1;
import y1.c;

/* loaded from: classes.dex */
public class y0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f24040a;
    public final l1.a b;

    /* renamed from: e, reason: collision with root package name */
    public c.a<Void> f24043e;

    /* renamed from: f, reason: collision with root package name */
    public c.a<Void> f24044f;

    /* renamed from: i, reason: collision with root package name */
    public ne.x<Void> f24047i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24045g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24046h = false;

    /* renamed from: c, reason: collision with root package name */
    public final ne.x<Void> f24041c = y1.c.a(new c.InterfaceC0669c() { // from class: m0.w0
        @Override // y1.c.InterfaceC0669c
        public final Object a(c.a aVar) {
            return y0.j(y0.this, aVar);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public final ne.x<Void> f24042d = y1.c.a(new c.InterfaceC0669c() { // from class: m0.x0
        @Override // y1.c.InterfaceC0669c
        public final Object a(c.a aVar) {
            return y0.k(y0.this, aVar);
        }
    });

    public y0(l1 l1Var, l1.a aVar) {
        this.f24040a = l1Var;
        this.b = aVar;
    }

    public static /* synthetic */ Object j(y0 y0Var, c.a aVar) {
        y0Var.f24043e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(y0 y0Var, c.a aVar) {
        y0Var.f24044f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // m0.a1
    public void a(int i10) {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        this.f24040a.w(i10);
    }

    @Override // m0.a1
    public void b(Bitmap bitmap) {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        this.f24040a.y(bitmap);
    }

    @Override // m0.a1
    public void c() {
        p0.z.b();
        if (this.f24045g || this.f24046h) {
            return;
        }
        this.f24046h = true;
        this.f24040a.j();
        f1.g l10 = this.f24040a.l();
        if (l10 != null) {
            l10.c();
        }
    }

    @Override // m0.a1
    public void d(f1.i iVar) {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        o();
        r();
        this.f24040a.A(iVar);
    }

    @Override // m0.a1
    public void e(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        o();
        r();
        s(h1Var);
    }

    @Override // m0.a1
    public void f(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        boolean f10 = this.f24040a.f();
        if (!f10) {
            s(h1Var);
        }
        r();
        this.f24043e.f(h1Var);
        if (f10) {
            this.b.f(this.f24040a);
        }
    }

    @Override // m0.a1
    public void g(androidx.camera.core.d dVar) {
        p0.z.b();
        if (this.f24045g) {
            dVar.close();
            return;
        }
        o();
        r();
        this.f24040a.z(dVar);
    }

    @Override // m0.a1
    public boolean h() {
        return this.f24045g;
    }

    @Override // m0.a1
    public void i() {
        p0.z.b();
        if (this.f24045g) {
            return;
        }
        if (!this.f24046h) {
            c();
        }
        this.f24043e.c(null);
    }

    public final void l(g0.h1 h1Var) {
        p0.z.b();
        this.f24045g = true;
        ne.x<Void> xVar = this.f24047i;
        Objects.requireNonNull(xVar);
        xVar.cancel(true);
        this.f24043e.f(h1Var);
        this.f24044f.c(null);
    }

    public void m(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24042d.isDone()) {
            return;
        }
        l(h1Var);
        s(h1Var);
    }

    public void n() {
        p0.z.b();
        if (this.f24042d.isDone()) {
            return;
        }
        l(new g0.h1(3, "The request is aborted silently and retried.", null));
        this.b.f(this.f24040a);
    }

    public final void o() {
        x2.g.j(this.f24041c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public ne.x<Void> p() {
        p0.z.b();
        return this.f24041c;
    }

    public ne.x<Void> q() {
        p0.z.b();
        return this.f24042d;
    }

    public final void r() {
        if (!this.f24040a.t() || this.f24040a.s()) {
            if (!this.f24040a.t()) {
                x2.g.j(!this.f24042d.isDone(), "The callback can only complete once.");
            }
            this.f24044f.c(null);
        }
    }

    public final void s(g0.h1 h1Var) {
        p0.z.b();
        this.f24040a.x(h1Var);
    }

    public void t(ne.x<Void> xVar) {
        p0.z.b();
        x2.g.j(this.f24047i == null, "CaptureRequestFuture can only be set once.");
        this.f24047i = xVar;
    }
}
