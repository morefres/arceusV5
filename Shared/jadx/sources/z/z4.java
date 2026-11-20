package z;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import f0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n0.n1;
import n0.o3;
import n0.q3;
import n0.u1;
import y.a;
import z.h5;

/* loaded from: classes.dex */
public final class z4 implements l3 {

    /* renamed from: p, reason: collision with root package name */
    public static List<n0.u1> f37597p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public static int f37598q = 0;

    /* renamed from: a, reason: collision with root package name */
    public final n0.q3 f37599a;
    public final z0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37600c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f37601d;

    /* renamed from: e, reason: collision with root package name */
    public final k3 f37602e;

    /* renamed from: g, reason: collision with root package name */
    public n0.o3 f37604g;

    /* renamed from: h, reason: collision with root package name */
    public r2 f37605h;

    /* renamed from: i, reason: collision with root package name */
    public n0.o3 f37606i;

    /* renamed from: j, reason: collision with root package name */
    public c f37607j;

    /* renamed from: l, reason: collision with root package name */
    public final d f37609l;

    /* renamed from: o, reason: collision with root package name */
    public int f37612o;

    /* renamed from: f, reason: collision with root package name */
    public List<n0.u1> f37603f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public volatile List<n0.l1> f37608k = null;

    /* renamed from: m, reason: collision with root package name */
    public f0.l f37610m = new l.a().c();

    /* renamed from: n, reason: collision with root package name */
    public f0.l f37611n = new l.a().c();

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.d("ProcessingCaptureSession", "open session failed ", th2);
            z4.this.close();
            z4.this.f(false);
        }
    }

    public static class b implements q3.a {

        /* renamed from: a, reason: collision with root package name */
        public List<n0.u> f37614a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public n0.e0 f37615c;

        public /* synthetic */ b(int i10, List list, a aVar) {
            this(i10, list);
        }

        public b(int i10, List<n0.u> list) {
            this.f37615c = null;
            this.b = i10;
            this.f37614a = list;
        }
    }

    public enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public static class d implements q3.a {
    }

    public z4(n0.q3 q3Var, z0 z0Var, b0.e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService, f0.i iVar) {
        this.f37612o = 0;
        this.f37602e = new k3(eVar, c0.e.b(CaptureSessionShouldUseMrirQuirk.class) != null, iVar);
        this.f37599a = q3Var;
        this.b = z0Var;
        this.f37600c = executor;
        this.f37601d = scheduledExecutorService;
        this.f37607j = c.UNINITIALIZED;
        this.f37609l = new d();
        int i10 = f37598q;
        f37598q = i10 + 1;
        this.f37612o = i10;
        g0.r1.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f37612o + ")");
    }

    public static /* synthetic */ Void j(z4 z4Var, Void r12) {
        z4Var.y(z4Var.f37602e);
        return null;
    }

    public static /* synthetic */ void l(z4 z4Var, n0.u1 u1Var) {
        n0.x1.c(z4Var.f37603f);
        if (u1Var != null) {
            u1Var.e();
        }
    }

    public static /* synthetic */ ne.x m(final z4 z4Var, n0.o3 o3Var, CameraDevice cameraDevice, h5.a aVar, List list) {
        n0.d3 d3Var;
        z4Var.getClass();
        g0.r1.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + z4Var.f37612o + ")");
        if (z4Var.f37607j == c.DE_INITIALIZED) {
            return r0.n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final n0.u1 u1Var = null;
        if (list.contains(null)) {
            return r0.n.n(new u1.a("Surface closed", o3Var.p().get(list.indexOf(null))));
        }
        n0.d3 d3Var2 = null;
        n0.d3 d3Var3 = null;
        n0.d3 d3Var4 = null;
        for (int i10 = 0; i10 < o3Var.p().size(); i10++) {
            n0.u1 u1Var2 = o3Var.p().get(i10);
            if (t(u1Var2) || u(u1Var2)) {
                d3Var2 = n0.d3.a(u1Var2.j().get(), u1Var2.h(), u1Var2.i());
            } else if (s(u1Var2)) {
                d3Var3 = n0.d3.a(u1Var2.j().get(), u1Var2.h(), u1Var2.i());
            } else if (r(u1Var2)) {
                d3Var4 = n0.d3.a(u1Var2.j().get(), u1Var2.h(), u1Var2.i());
            }
        }
        if (o3Var.j() != null) {
            u1Var = o3Var.j().f();
            d3Var = n0.d3.a(u1Var.j().get(), u1Var.h(), u1Var.i());
        } else {
            d3Var = null;
        }
        z4Var.f37607j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(z4Var.f37603f);
            if (u1Var != null) {
                arrayList.add(u1Var);
            }
            n0.x1.d(arrayList);
            g0.r1.l("ProcessingCaptureSession", "== initSession (id=" + z4Var.f37612o + ")");
            try {
                n0.o3 i11 = z4Var.f37599a.i(z4Var.b, n0.e3.a(d3Var2, d3Var3, d3Var4, d3Var));
                z4Var.f37606i = i11;
                i11.p().get(0).k().a(new Runnable() { // from class: z.u4
                    @Override // java.lang.Runnable
                    public final void run() {
                        z4.l(z4.this, u1Var);
                    }
                }, q0.c.b());
                for (final n0.u1 u1Var3 : z4Var.f37606i.p()) {
                    f37597p.add(u1Var3);
                    u1Var3.k().a(new Runnable() { // from class: z.v4
                        @Override // java.lang.Runnable
                        public final void run() {
                            z4.f37597p.remove(n0.u1.this);
                        }
                    }, z4Var.f37600c);
                }
                o3.h hVar = new o3.h();
                hVar.b(o3Var);
                hVar.d();
                hVar.b(z4Var.f37606i);
                x2.g.b(hVar.g(), "Cannot transform the SessionConfig");
                ne.x<Void> a10 = z4Var.f37602e.a(hVar.c(), (CameraDevice) x2.g.g(cameraDevice), aVar);
                r0.n.j(a10, z4Var.new a(), z4Var.f37600c);
                return a10;
            } catch (Throwable th2) {
                g0.r1.d("ProcessingCaptureSession", "initSession failed", th2);
                n0.x1.c(z4Var.f37603f);
                if (u1Var != null) {
                    u1Var.e();
                }
                throw th2;
            }
        } catch (u1.a e10) {
            return r0.n.n(e10);
        }
    }

    public static /* synthetic */ void n(z4 z4Var) {
        z4Var.getClass();
        g0.r1.a("ProcessingCaptureSession", "== deInitSession (id=" + z4Var.f37612o + ")");
        z4Var.f37599a.d();
    }

    public static void o(List<n0.l1> list) {
        for (n0.l1 l1Var : list) {
            Iterator<n0.u> it = l1Var.c().iterator();
            while (it.hasNext()) {
                it.next().a(l1Var.f());
            }
        }
    }

    public static List<n0.r3> p(List<n0.u1> list) {
        ArrayList arrayList = new ArrayList();
        for (n0.u1 u1Var : list) {
            x2.g.b(u1Var instanceof n0.r3, "Surface must be SessionProcessorSurface");
            arrayList.add((n0.r3) u1Var);
        }
        return arrayList;
    }

    public static boolean q(n0.l1 l1Var) {
        for (n0.u1 u1Var : l1Var.i()) {
            if (t(u1Var) || u(u1Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.u0.class);
    }

    public static boolean s(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.f1.class);
    }

    public static boolean t(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.a2.class);
    }

    public static boolean u(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), b1.g.class);
    }

    @Override // z.l3
    public ne.x<Void> a(final n0.o3 o3Var, final CameraDevice cameraDevice, final h5.a aVar) {
        x2.g.b(this.f37607j == c.UNINITIALIZED, "Invalid state state:" + this.f37607j);
        x2.g.b(o3Var.p().isEmpty() ^ true, "SessionConfig contains no surfaces");
        g0.r1.a("ProcessingCaptureSession", "open (id=" + this.f37612o + ")");
        List<n0.u1> p8 = o3Var.p();
        this.f37603f = p8;
        return r0.d.c(n0.x1.e(p8, false, 5000L, this.f37600c, this.f37601d)).g(new r0.a() { // from class: z.x4
            @Override // r0.a
            public final ne.x apply(Object obj) {
                return z4.m(z4.this, o3Var, cameraDevice, aVar, (List) obj);
            }
        }, this.f37600c).f(new t.a() { // from class: z.y4
            @Override // t.a
            public final Object apply(Object obj) {
                return z4.j(z4.this, (Void) obj);
            }
        }, this.f37600c);
    }

    @Override // z.l3
    public void b(List<n0.l1> list) {
        if (list.isEmpty()) {
            return;
        }
        g0.r1.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f37612o + ") + state =" + this.f37607j);
        int ordinal = this.f37607j.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.f37608k == null) {
                this.f37608k = list;
                return;
            } else {
                o(list);
                g0.r1.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (ordinal == 2) {
            for (n0.l1 l1Var : list) {
                if (v(l1Var.k())) {
                    w(l1Var);
                } else {
                    x(l1Var);
                }
            }
            return;
        }
        if (ordinal == 3 || ordinal == 4) {
            g0.r1.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f37607j);
            o(list);
        }
    }

    @Override // z.l3
    public boolean c() {
        return this.f37602e.c();
    }

    @Override // z.l3
    public void close() {
        g0.r1.a("ProcessingCaptureSession", "close (id=" + this.f37612o + ") state=" + this.f37607j);
        if (this.f37607j == c.ON_CAPTURE_SESSION_STARTED) {
            g0.r1.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f37612o + ")");
            this.f37599a.c();
            r2 r2Var = this.f37605h;
            if (r2Var != null) {
                r2Var.a();
            }
            this.f37607j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f37602e.close();
    }

    @Override // z.l3
    public void d(n0.o3 o3Var) {
        g0.r1.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f37612o + ")");
        this.f37604g = o3Var;
        if (o3Var == null) {
            return;
        }
        r2 r2Var = this.f37605h;
        if (r2Var != null) {
            r2Var.b(o3Var);
        }
        if (this.f37607j == c.ON_CAPTURE_SESSION_STARTED) {
            l.a d10 = l.a.d(o3Var.g());
            Integer h10 = k2.h(o3Var.l());
            if (h10 != null) {
                d10.f(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, h10);
            }
            f0.l c10 = d10.c();
            this.f37610m = c10;
            z(c10, this.f37611n);
            if (q(o3Var.l())) {
                this.f37599a.l(o3Var.l().j(), this.f37609l);
            } else {
                this.f37599a.a();
            }
        }
    }

    @Override // z.l3
    public void e() {
        g0.r1.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f37612o + ")");
        if (this.f37608k != null) {
            for (n0.l1 l1Var : this.f37608k) {
                Iterator<n0.u> it = l1Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(l1Var.f());
                }
            }
            this.f37608k = null;
        }
    }

    @Override // z.l3
    public ne.x<Void> f(boolean z10) {
        g0.r1.a("ProcessingCaptureSession", "release (id=" + this.f37612o + ") mProcessorState=" + this.f37607j);
        ne.x<Void> f10 = this.f37602e.f(z10);
        int ordinal = this.f37607j.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            f10.a(new Runnable() { // from class: z.w4
                @Override // java.lang.Runnable
                public final void run() {
                    z4.n(z4.this);
                }
            }, q0.c.b());
        }
        this.f37607j = c.DE_INITIALIZED;
        return f10;
    }

    @Override // z.l3
    public List<n0.l1> g() {
        return this.f37608k != null ? this.f37608k : Collections.EMPTY_LIST;
    }

    @Override // z.l3
    public n0.o3 h() {
        return this.f37604g;
    }

    @Override // z.l3
    public void i(Map<n0.u1, Long> map) {
    }

    public final boolean v(int i10) {
        return i10 == 2 || i10 == 4;
    }

    public void w(n0.l1 l1Var) {
        l.a d10 = l.a.d(l1Var.g());
        n0.n1 g10 = l1Var.g();
        n1.a<Integer> aVar = n0.l1.f25431i;
        if (g10.a(aVar)) {
            d10.f(CaptureRequest.JPEG_ORIENTATION, (Integer) l1Var.g().e(aVar));
        }
        n0.n1 g11 = l1Var.g();
        n1.a<Integer> aVar2 = n0.l1.f25432j;
        if (g11.a(aVar2)) {
            d10.f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l1Var.g().e(aVar2)).byteValue()));
        }
        f0.l c10 = d10.c();
        this.f37611n = c10;
        z(this.f37610m, c10);
        this.f37599a.b(l1Var.m(), l1Var.j(), new b(l1Var.f(), l1Var.c(), null));
    }

    public void x(n0.l1 l1Var) {
        g0.r1.a("ProcessingCaptureSession", "issueTriggerRequest");
        f0.l c10 = l.a.d(l1Var.g()).c();
        Iterator<n1.a<?>> it = c10.b().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f37599a.n(c10, l1Var.j(), new b(l1Var.f(), l1Var.c(), null));
                return;
            }
        }
        o(Arrays.asList(l1Var));
    }

    public void y(k3 k3Var) {
        if (this.f37607j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f37605h = new r2(k3Var, p(this.f37606i.p()));
        g0.r1.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f37612o + ")");
        this.f37599a.k(this.f37605h);
        this.f37607j = c.ON_CAPTURE_SESSION_STARTED;
        n0.o3 o3Var = this.f37604g;
        if (o3Var != null) {
            d(o3Var);
        }
        if (this.f37608k != null) {
            b(this.f37608k);
            this.f37608k = null;
        }
    }

    public final void z(f0.l lVar, f0.l lVar2) {
        a.C0666a c0666a = new a.C0666a();
        c0666a.c(lVar);
        c0666a.c(lVar2);
        this.f37599a.g(c0666a.b());
    }
}
