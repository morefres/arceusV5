package f1;

import android.view.Surface;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Executor;
import m1.l;
import y1.c;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16629a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.o f16630c;

    /* renamed from: d, reason: collision with root package name */
    public m1.l f16631d = null;

    /* renamed from: e, reason: collision with root package name */
    public Surface f16632e = null;

    /* renamed from: f, reason: collision with root package name */
    public v2 f16633f = null;

    /* renamed from: g, reason: collision with root package name */
    public Executor f16634g = null;

    /* renamed from: h, reason: collision with root package name */
    public l.c.a f16635h = null;

    /* renamed from: i, reason: collision with root package name */
    public b f16636i = b.NOT_INITIALIZED;

    /* renamed from: j, reason: collision with root package name */
    public ne.x<Void> f16637j = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    public c.a<Void> f16638k = null;

    /* renamed from: l, reason: collision with root package name */
    public ne.x<m1.l> f16639l = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    public c.a<m1.l> f16640m = null;

    public class a implements r0.c<m1.l> {
        public a() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(m1.l lVar) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.m("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            z1.this.r();
        }
    }

    public enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public z1(m1.o oVar, Executor executor, Executor executor2) {
        this.f16629a = executor2;
        this.b = executor;
        this.f16630c = oVar;
    }

    public static /* synthetic */ Object c(z1 z1Var, c.a aVar) {
        z1Var.f16638k = aVar;
        return "ReleasedFuture " + z1Var;
    }

    public static /* synthetic */ Object e(z1 z1Var, c.a aVar) {
        z1Var.f16640m = aVar;
        return "ReadyToReleaseFuture " + z1Var;
    }

    public static /* synthetic */ Object f(z1 z1Var, v2 v2Var, m1.p1 p1Var, c.a aVar) {
        z1Var.j(v2Var, p1Var, aVar);
        return "ConfigureVideoEncoderFuture " + z1Var;
    }

    public static /* synthetic */ void g(final z1 z1Var, c.a aVar, v2 v2Var, final Surface surface) {
        Executor executor;
        int ordinal = z1Var.f16636i.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (v2Var.v()) {
                    g0.r1.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(v2Var, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    z1Var.h();
                    return;
                }
                z1Var.f16632e = surface;
                g0.r1.a("VideoEncoderSession", "provide surface: " + surface);
                v2Var.w(surface, z1Var.b, new x2.a() { // from class: f1.s1
                    @Override // x2.a
                    public final void accept(Object obj) {
                        z1.this.o((v2.g) obj);
                    }
                });
                z1Var.f16636i = b.READY;
                aVar.c(z1Var.f16631d);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (z1Var.f16635h != null && (executor = z1Var.f16634g) != null) {
                        executor.execute(new Runnable() { // from class: f1.t1
                            @Override // java.lang.Runnable
                            public final void run() {
                                z1.this.f16635h.a(surface);
                            }
                        });
                    }
                    g0.r1.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (ordinal != 4) {
                    throw new IllegalStateException("State " + z1Var.f16636i + " is not handled");
                }
            }
        }
        g0.r1.a("VideoEncoderSession", "Not provide surface in " + z1Var.f16636i);
        aVar.c(null);
    }

    public final void h() {
        int ordinal = this.f16636i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            r();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            g0.r1.a("VideoEncoderSession", "closeInternal in " + this.f16636i + " state");
            this.f16636i = b.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            g0.r1.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f16636i + " is not handled");
    }

    public ne.x<m1.l> i(final v2 v2Var, final m1.p1 p1Var) {
        if (this.f16636i.ordinal() != 0) {
            return r0.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f16636i));
        }
        this.f16636i = b.INITIALIZING;
        this.f16633f = v2Var;
        g0.r1.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f16637j = y1.c.a(new c.InterfaceC0669c() { // from class: f1.v1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return z1.c(z1.this, aVar);
            }
        });
        this.f16639l = y1.c.a(new c.InterfaceC0669c() { // from class: f1.w1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return z1.e(z1.this, aVar);
            }
        });
        ne.x a10 = y1.c.a(new c.InterfaceC0669c() { // from class: f1.x1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return z1.f(z1.this, v2Var, p1Var, aVar);
            }
        });
        r0.n.j(a10, new a(), this.b);
        return r0.n.s(a10);
    }

    public final void j(final v2 v2Var, m1.p1 p1Var, final c.a<m1.l> aVar) {
        try {
            m1.l a10 = this.f16630c.a(this.f16629a, p1Var, v2Var.r());
            this.f16631d = a10;
            l.b b10 = a10.b();
            if (b10 instanceof l.c) {
                ((l.c) b10).a(this.b, new l.c.a() { // from class: f1.y1
                    @Override // m1.l.c.a
                    public final void a(Surface surface) {
                        z1.g(z1.this, aVar, v2Var, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (m1.k1 e10) {
            g0.r1.d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.f(e10);
        }
    }

    public Surface k() {
        if (this.f16636i != b.READY) {
            return null;
        }
        return this.f16632e;
    }

    public ne.x<m1.l> l() {
        return r0.n.s(this.f16639l);
    }

    public m1.l m() {
        return this.f16631d;
    }

    public boolean n(v2 v2Var) {
        int ordinal = this.f16636i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new IllegalStateException("State " + this.f16636i + " is not handled");
                        }
                    }
                }
            }
            if (this.f16633f == v2Var) {
                return true;
            }
        }
        return false;
    }

    public final void o(v2.g gVar) {
        g0.r1.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface b10 = gVar.b();
        if (b10 != this.f16632e) {
            b10.release();
            return;
        }
        this.f16632e = null;
        this.f16640m.c(this.f16631d);
        h();
    }

    public void p(Executor executor, l.c.a aVar) {
        this.f16634g = executor;
        this.f16635h = aVar;
    }

    public ne.x<Void> q() {
        h();
        return r0.n.s(this.f16637j);
    }

    public void r() {
        int ordinal = this.f16636i.ordinal();
        if (ordinal == 0) {
            this.f16636i = b.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.f16636i + " is not handled");
            }
            g0.r1.a("VideoEncoderSession", "terminateNow in " + this.f16636i + ", No-op");
            return;
        }
        this.f16636i = b.RELEASED;
        this.f16640m.c(this.f16631d);
        this.f16633f = null;
        if (this.f16631d == null) {
            g0.r1.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f16638k.c(null);
            return;
        }
        g0.r1.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f16631d);
        this.f16631d.a();
        this.f16631d.f().a(new Runnable() { // from class: f1.u1
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.f16638k.c(null);
            }
        }, this.b);
        this.f16631d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f16633f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
