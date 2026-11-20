package n0;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;
import y1.c;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f25566k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f25567l = g0.r1.f("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f25568m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f25569n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object f25570a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25571c;

    /* renamed from: d, reason: collision with root package name */
    public c.a<Void> f25572d;

    /* renamed from: e, reason: collision with root package name */
    public final ne.x<Void> f25573e;

    /* renamed from: f, reason: collision with root package name */
    public c.a<Void> f25574f;

    /* renamed from: g, reason: collision with root package name */
    public final ne.x<Void> f25575g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f25576h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25577i;

    /* renamed from: j, reason: collision with root package name */
    public Class<?> f25578j;

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public u1 f25579a;

        public a(String str, u1 u1Var) {
            super(str);
            this.f25579a = u1Var;
        }

        public u1 a() {
            return this.f25579a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public u1() {
        this(f25566k, 0);
    }

    public static /* synthetic */ Object a(u1 u1Var, c.a aVar) {
        synchronized (u1Var.f25570a) {
            u1Var.f25572d = aVar;
        }
        return "DeferrableSurface-termination(" + u1Var + ")";
    }

    public static /* synthetic */ Object b(u1 u1Var, c.a aVar) {
        synchronized (u1Var.f25570a) {
            u1Var.f25574f = aVar;
        }
        return "DeferrableSurface-close(" + u1Var + ")";
    }

    public static /* synthetic */ void c(u1 u1Var, String str) {
        u1Var.getClass();
        try {
            u1Var.f25573e.get();
            u1Var.n("Surface terminated", f25569n.decrementAndGet(), f25568m.get());
        } catch (Exception e10) {
            g0.r1.c("DeferrableSurface", "Unexpected surface termination for " + u1Var + "\nStack Trace:\n" + str);
            synchronized (u1Var.f25570a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", u1Var, Boolean.valueOf(u1Var.f25571c), Integer.valueOf(u1Var.b)), e10);
            }
        }
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f25570a) {
            try {
                if (this.f25571c) {
                    aVar = null;
                } else {
                    this.f25571c = true;
                    this.f25574f.c(null);
                    if (this.b == 0) {
                        aVar = this.f25572d;
                        this.f25572d = null;
                    } else {
                        aVar = null;
                    }
                    if (g0.r1.f("DeferrableSurface")) {
                        g0.r1.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a<Void> aVar;
        synchronized (this.f25570a) {
            try {
                int i10 = this.b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.b = i11;
                if (i11 == 0 && this.f25571c) {
                    aVar = this.f25572d;
                    this.f25572d = null;
                } else {
                    aVar = null;
                }
                if (g0.r1.f("DeferrableSurface")) {
                    g0.r1.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.f25571c + " " + this);
                    if (this.b == 0) {
                        n("Surface no longer in use", f25569n.get(), f25568m.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public ne.x<Void> f() {
        return r0.n.s(this.f25575g);
    }

    public Class<?> g() {
        return this.f25578j;
    }

    public Size h() {
        return this.f25576h;
    }

    public int i() {
        return this.f25577i;
    }

    public final ne.x<Surface> j() {
        synchronized (this.f25570a) {
            try {
                if (this.f25571c) {
                    return r0.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ne.x<Void> k() {
        return r0.n.s(this.f25573e);
    }

    public void l() {
        synchronized (this.f25570a) {
            try {
                int i10 = this.b;
                if (i10 == 0 && this.f25571c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.b = i10 + 1;
                if (g0.r1.f("DeferrableSurface")) {
                    if (this.b == 1) {
                        n("New surface in use", f25569n.get(), f25568m.incrementAndGet());
                    }
                    g0.r1.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f25570a) {
            z10 = this.f25571c;
        }
        return z10;
    }

    public final void n(String str, int i10, int i11) {
        if (!f25567l && g0.r1.f("DeferrableSurface")) {
            g0.r1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        g0.r1.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract ne.x<Surface> o();

    public void p(Class<?> cls) {
        this.f25578j = cls;
    }

    public u1(Size size, int i10) {
        this.f25570a = new Object();
        this.b = 0;
        this.f25571c = false;
        this.f25576h = size;
        this.f25577i = i10;
        ne.x<Void> a10 = y1.c.a(new c.InterfaceC0669c() { // from class: n0.r1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return u1.a(u1.this, aVar);
            }
        });
        this.f25573e = a10;
        this.f25575g = y1.c.a(new c.InterfaceC0669c() { // from class: n0.s1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return u1.b(u1.this, aVar);
            }
        });
        if (g0.r1.f("DeferrableSurface")) {
            n("Surface created", f25569n.incrementAndGet(), f25568m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a10.a(new Runnable() { // from class: n0.t1
                @Override // java.lang.Runnable
                public final void run() {
                    u1.c(u1.this, stackTraceString);
                }
            }, q0.c.b());
        }
    }
}
