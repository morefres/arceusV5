package z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import backtraceio.library.services.BacktraceMetrics;
import g0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n0.g1;
import n0.h4;
import n0.j4;
import n0.l0;
import n0.l1;
import n0.o3;
import n0.p0;
import n0.u1;
import y1.c;
import z.h5;
import z.u0;

/* loaded from: classes.dex */
public final class u0 implements n0.p0 {
    public boolean A;
    public boolean B;
    public t4 C;
    public final o3 D;
    public final h5.b E;
    public final Set<String> F;
    public n0.h0 G;
    public final Object H;
    public n0.q3 I;
    public boolean J;
    public final q3 K;
    public final a0.c0 L;
    public final b0.e M;
    public final g5 N;
    public final h O;

    /* renamed from: a, reason: collision with root package name */
    public final n0.h4 f37446a;
    public final a0.p0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37447c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f37448d;

    /* renamed from: e, reason: collision with root package name */
    public volatile i f37449e = i.INITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    public final n0.u2<p0.a> f37450f;

    /* renamed from: g, reason: collision with root package name */
    public final z2 f37451g;

    /* renamed from: h, reason: collision with root package name */
    public final y f37452h;

    /* renamed from: i, reason: collision with root package name */
    public final j f37453i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f37454j;

    /* renamed from: k, reason: collision with root package name */
    public CameraDevice f37455k;

    /* renamed from: l, reason: collision with root package name */
    public int f37456l;

    /* renamed from: m, reason: collision with root package name */
    public l3 f37457m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f37458n;

    /* renamed from: o, reason: collision with root package name */
    public ne.x<Void> f37459o;

    /* renamed from: p, reason: collision with root package name */
    public c.a<Void> f37460p;

    /* renamed from: q, reason: collision with root package name */
    public final Map<l3, ne.x<Void>> f37461q;

    /* renamed from: r, reason: collision with root package name */
    public int f37462r;

    /* renamed from: s, reason: collision with root package name */
    public final e f37463s;

    /* renamed from: t, reason: collision with root package name */
    public final f f37464t;

    /* renamed from: u, reason: collision with root package name */
    public final h0.a f37465u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.g1 f37466v;

    /* renamed from: w, reason: collision with root package name */
    public final g0.g0 f37467w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f37468x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f37469y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f37470z;

    public class a implements z.g {
        public a() {
        }

        @Override // z.g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // z.g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f37472a;

        public b(c.a aVar) {
            this.f37472a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera closed");
            this.f37472a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera disconnected");
            this.f37472a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            u0.this.a0("openCameraConfigAndClose camera error " + i10);
            this.f37472a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera opened");
            ne.x X = u0.this.X(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            X.a(new Runnable() { // from class: z.v0
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, u0.this.f37447c);
        }
    }

    public class c implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f37473a;

        public c(l3 l3Var) {
            this.f37473a = l3Var;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            u0.this.f37461q.remove(this.f37473a);
            int ordinal = u0.this.f37449e.ordinal();
            if (ordinal != 1 && ordinal != 5) {
                if (ordinal != 6 && (ordinal != 7 || u0.this.f37456l == 0)) {
                    return;
                } else {
                    u0.this.a0("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (u0.this.o0()) {
                u0 u0Var = u0.this;
                if (u0Var.f37455k != null) {
                    u0Var.a0("closing camera");
                    a0.a.a(u0.this.f37455k);
                    u0.this.f37455k = null;
                }
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
        }
    }

    public class d implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f37474a;

        public d(l3 l3Var) {
            this.f37474a = l3Var;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (u0.this.f37465u.e() == 2 && u0.this.f37449e == i.OPENED) {
                u0.this.D0(i.CONFIGURED);
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof u1.a) {
                n0.o3 c02 = u0.this.c0(((u1.a) th2).a());
                if (c02 != null) {
                    u0.this.x0(c02);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                u0.this.a0("Unable to configure camera cancelled");
                return;
            }
            i iVar = u0.this.f37449e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                u0.this.E0(iVar2, w.a.b(4, th2));
            }
            g0.r1.d("Camera2CameraImpl", "Unable to configure camera " + u0.this, th2);
            u0 u0Var = u0.this;
            if (u0Var.f37457m == this.f37474a) {
                u0Var.B0(false);
            }
        }
    }

    public final class e extends CameraManager.AvailabilityCallback implements g1.c {

        /* renamed from: a, reason: collision with root package name */
        public final String f37475a;
        public boolean b = true;

        public e(String str) {
            this.f37475a = str;
        }

        @Override // n0.g1.c
        public void a() {
            if (u0.this.f37449e == i.PENDING_OPEN || u0.this.f37449e == i.OPENING_WITH_ERROR) {
                u0.this.M0(false);
            }
        }

        public boolean b() {
            return this.b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f37475a.equals(str)) {
                this.b = true;
                if (u0.this.f37449e == i.PENDING_OPEN || u0.this.f37449e == i.OPENING_WITH_ERROR) {
                    u0.this.M0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f37475a.equals(str)) {
                this.b = false;
            }
        }
    }

    public final class f implements g1.b {
        public f() {
        }

        @Override // n0.g1.b
        public void a() {
            if (u0.this.f37449e == i.OPENED) {
                u0.this.v0();
            }
        }
    }

    public final class g implements l0.d {
        public g() {
        }

        @Override // n0.l0.d
        public void a() {
            u0.this.N0();
        }

        @Override // n0.l0.d
        public void b(List<n0.l1> list) {
            u0.this.G0((List) x2.g.g(list));
        }
    }

    public enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    public final class j extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f37493a;
        public final ScheduledExecutorService b;

        /* renamed from: c, reason: collision with root package name */
        public b f37494c;

        /* renamed from: d, reason: collision with root package name */
        public ScheduledFuture<?> f37495d;

        /* renamed from: e, reason: collision with root package name */
        public final a f37496e;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final long f37498a;
            public long b = -1;

            public a(long j10) {
                this.f37498a = j10;
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.b == -1) {
                    this.b = uptimeMillis;
                }
                return uptimeMillis - this.b;
            }

            public int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long b = b();
                if (b <= 120000) {
                    return 1000;
                }
                return b <= 300000 ? 2000 : 4000;
            }

            public int d() {
                if (!j.this.f()) {
                    long j10 = this.f37498a;
                    return j10 > 0 ? Math.min((int) j10, BacktraceMetrics.defaultTimeBetweenRetriesMs) : BacktraceMetrics.defaultTimeBetweenRetriesMs;
                }
                long j11 = this.f37498a;
                if (j11 > 0) {
                    return Math.min((int) j11, 1800000);
                }
                return 1800000;
            }

            public void e() {
                this.b = -1L;
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public Executor f37500a;
            public boolean b = false;

            public b(Executor executor) {
                this.f37500a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.b) {
                    return;
                }
                x2.g.i(u0.this.f37449e == i.REOPENING || u0.this.f37449e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    u0.this.L0(true);
                } else {
                    u0.this.M0(true);
                }
            }

            public void b() {
                this.b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37500a.execute(new Runnable() { // from class: z.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.j.b.a(u0.j.b.this);
                    }
                });
            }
        }

        public j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f37493a = executor;
            this.b = scheduledExecutorService;
            this.f37496e = new a(j10);
        }

        public boolean a() {
            if (this.f37495d == null) {
                return false;
            }
            u0.this.a0("Cancelling scheduled re-open: " + this.f37494c);
            this.f37494c.b();
            this.f37494c = null;
            this.f37495d.cancel(false);
            this.f37495d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i10) {
            x2.g.j(u0.this.f37449e == i.OPENING || u0.this.f37449e == i.OPENED || u0.this.f37449e == i.CONFIGURED || u0.this.f37449e == i.REOPENING || u0.this.f37449e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + u0.this.f37449e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                g0.r1.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), u0.g0(i10)));
                c(i10);
                return;
            }
            g0.r1.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + u0.g0(i10) + " closing camera.");
            u0.this.E0(i.CLOSING, w.a.a(i10 == 3 ? 5 : 6));
            u0.this.V(false);
        }

        public final void c(int i10) {
            int i11 = 1;
            x2.g.j(u0.this.f37456l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            u0.this.E0(i.REOPENING, w.a.a(i11));
            u0.this.V(false);
        }

        public void d() {
            this.f37496e.e();
        }

        public void e() {
            x2.g.i(this.f37494c == null);
            x2.g.i(this.f37495d == null);
            if (!this.f37496e.a()) {
                g0.r1.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f37496e.d() + "ms without success.");
                u0.this.F0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f37494c = new b(this.f37493a);
            u0.this.a0("Attempting camera re-open in " + this.f37496e.c() + "ms: " + this.f37494c + " activeResuming = " + u0.this.J);
            this.f37495d = this.b.schedule(this.f37494c, (long) this.f37496e.c(), TimeUnit.MILLISECONDS);
        }

        public boolean f() {
            u0 u0Var = u0.this;
            if (!u0Var.J) {
                return false;
            }
            int i10 = u0Var.f37456l;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onClosed()");
            x2.g.j(u0.this.f37455k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = u0.this.f37449e.ordinal();
            if (ordinal == 1 || ordinal == 5) {
                x2.g.i(u0.this.o0());
                u0.this.Y();
                return;
            }
            if (ordinal != 6 && ordinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + u0.this.f37449e);
            }
            u0 u0Var = u0.this;
            if (u0Var.f37456l == 0) {
                u0Var.M0(false);
                return;
            }
            u0Var.a0("Camera closed due to error: " + u0.g0(u0.this.f37456l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            u0 u0Var = u0.this;
            u0Var.f37455k = cameraDevice;
            u0Var.f37456l = i10;
            u0Var.O.b();
            int ordinal = u0.this.f37449e.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        g0.r1.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), u0.g0(i10), u0.this.f37449e.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + u0.this.f37449e);
                }
            }
            g0.r1.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), u0.g0(i10), u0.this.f37449e.name()));
            u0.this.V(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onOpened()");
            u0 u0Var = u0.this;
            u0Var.f37455k = cameraDevice;
            u0Var.f37456l = 0;
            d();
            int ordinal = u0.this.f37449e.ordinal();
            if (ordinal == 1 || ordinal == 5) {
                x2.g.i(u0.this.o0());
                u0.this.f37455k.close();
                u0.this.f37455k = null;
            } else {
                if (ordinal != 6 && ordinal != 7 && ordinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + u0.this.f37449e);
                }
                u0.this.D0(i.OPENED);
                n0.g1 g1Var = u0.this.f37466v;
                String id2 = cameraDevice.getId();
                u0 u0Var2 = u0.this;
                if (g1Var.j(id2, u0Var2.f37465u.d(u0Var2.f37455k.getId()))) {
                    u0.this.v0();
                }
            }
        }
    }

    public static abstract class k {
        public static k a(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<j4.b> list) {
            return new z.d(str, cls, o3Var, i4Var, size, t3Var, list);
        }

        public static k b(g0.w2 w2Var, boolean z10) {
            return a(u0.j0(w2Var), w2Var.getClass(), z10 ? w2Var.z() : w2Var.x(), w2Var.l(), w2Var.h(), w2Var.g(), u0.f0(w2Var));
        }

        public abstract List<j4.b> c();

        public abstract n0.o3 d();

        public abstract n0.t3 e();

        public abstract Size f();

        public abstract n0.i4<?> g();

        public abstract String h();

        public abstract Class<?> i();
    }

    @SuppressLint({"NullAnnotationGroup"})
    public u0(Context context, a0.p0 p0Var, String str, z0 z0Var, h0.a aVar, n0.g1 g1Var, Executor executor, Handler handler, q3 q3Var, long j10, g0.g0 g0Var) {
        n0.u2<p0.a> u2Var = new n0.u2<>();
        this.f37450f = u2Var;
        this.f37456l = 0;
        this.f37458n = new AtomicInteger(0);
        this.f37461q = new LinkedHashMap();
        this.f37462r = 0;
        this.f37470z = false;
        this.A = false;
        this.B = true;
        this.F = new HashSet();
        this.G = n0.k0.a();
        this.H = new Object();
        this.J = false;
        this.O = new h(this, null);
        this.b = p0Var;
        this.f37465u = aVar;
        this.f37466v = g1Var;
        ScheduledExecutorService f10 = q0.c.f(handler);
        this.f37448d = f10;
        Executor g10 = q0.c.g(executor);
        this.f37447c = g10;
        this.f37453i = new j(g10, f10, j10);
        this.f37446a = new n0.h4(str);
        u2Var.n(p0.a.CLOSED);
        z2 z2Var = new z2(g1Var);
        this.f37451g = z2Var;
        o3 o3Var = new o3(g10);
        this.D = o3Var;
        this.K = q3Var;
        this.f37467w = g0Var;
        try {
            a0.c0 c10 = p0Var.c(str);
            this.L = c10;
            y yVar = new y(c10, f10, g10, new g(), z0Var.l());
            this.f37452h = yVar;
            this.f37454j = z0Var;
            z0Var.G(yVar);
            z0Var.J(z2Var.a());
            this.M = b0.e.a(c10);
            this.f37457m = q0();
            this.E = new h5.b(g10, f10, handler, o3Var, z0Var.l(), c0.e.c());
            this.f37468x = d0.c.a(z0Var.l());
            this.f37469y = z0Var.l().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f37463s = eVar;
            f fVar = new f();
            this.f37464t = fVar;
            g1Var.g(this, g10, fVar, eVar);
            p0Var.g(g10, eVar);
            this.N = new g5(context, str, p0Var, new a(), j0.a.b);
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    public static /* synthetic */ ne.x A(k3 k3Var, n0.u1 u1Var, Void r22) {
        k3Var.close();
        u1Var.d();
        return k3Var.f(false);
    }

    public static /* synthetic */ void B(u0 u0Var, boolean z10) {
        u0Var.J = z10;
        if (z10) {
            if (u0Var.f37449e == i.PENDING_OPEN || u0Var.f37449e == i.OPENING_WITH_ERROR) {
                u0Var.L0(false);
            }
        }
    }

    public static /* synthetic */ void E(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " ACTIVE");
        u0Var.f37446a.q(str, o3Var, i4Var, t3Var, list);
        u0Var.f37446a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.N0();
    }

    public static /* synthetic */ void F(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " RESET");
        u0Var.f37446a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.T();
        u0Var.B0(false);
        u0Var.N0();
        if (u0Var.f37449e == i.OPENED) {
            u0Var.v0();
        }
    }

    public static /* synthetic */ Object G(final u0 u0Var, final c.a aVar) {
        u0Var.f37447c.execute(new Runnable() { // from class: z.m0
            @Override // java.lang.Runnable
            public final void run() {
                r0.n.t(u0.this.y0(), aVar);
            }
        });
        return "Release[request=" + u0Var.f37458n.getAndIncrement() + "]";
    }

    public static /* synthetic */ void I(u0 u0Var) {
        u0Var.a0("Camera is removed. Updating state and cleaning up.");
        i iVar = u0Var.f37449e;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || u0Var.f37449e == i.RELEASED) {
            return;
        }
        w.a a10 = w.a.a(8);
        u0Var.f37451g.c(p0.a.CLOSED, a10);
        u0Var.E0(iVar2, a10);
        u0Var.f37453i.a();
        u0Var.O.a();
        if (u0Var.f37455k != null) {
            u0Var.V(false);
        } else {
            u0Var.d0();
        }
    }

    public static /* synthetic */ void K(u0 u0Var, List list) {
        u0Var.getClass();
        try {
            u0Var.J0(list);
        } finally {
            u0Var.f37452h.D();
        }
    }

    public static /* synthetic */ Object L(u0 u0Var, c.a aVar) {
        x2.g.j(u0Var.f37460p == null, "Camera can only be released once, so release completer should be null on creation.");
        u0Var.f37460p = aVar;
        return "Release[camera=" + u0Var + "]";
    }

    public static List<j4.b> f0(g0.w2 w2Var) {
        if (w2Var.i() == null) {
            return null;
        }
        return b1.g.q0(w2Var);
    }

    public static String g0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String h0(t4 t4Var) {
        return t4Var.f() + t4Var.hashCode();
    }

    public static String j0(g0.w2 w2Var) {
        return w2Var.r() + w2Var.hashCode();
    }

    public static /* synthetic */ Object t(u0 u0Var, c.a aVar) {
        u0Var.getClass();
        try {
            ArrayList arrayList = new ArrayList(u0Var.f37446a.g().c().c());
            arrayList.add(u0Var.D.c());
            arrayList.add(u0Var.new b(aVar));
            u0Var.b.f(u0Var.f37454j.e(), u0Var.f37447c, w2.a(arrayList));
            return "configAndCloseTask";
        } catch (a0.f | RuntimeException e10) {
            u0Var.b0("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object u(final u0 u0Var, final c.a aVar) {
        u0Var.getClass();
        try {
            u0Var.f37447c.execute(new Runnable() { // from class: z.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(u0.this.l0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void v(u0 u0Var) {
        if (u0Var.k0()) {
            u0Var.C0(h0(u0Var.C), u0Var.C.h(), u0Var.C.i(), null, Collections.singletonList(j4.b.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void w(u0 u0Var) {
        u0Var.A = false;
        u0Var.f37470z = false;
        u0Var.a0("OpenCameraConfigAndClose is done, state: " + u0Var.f37449e);
        int ordinal = u0Var.f37449e.ordinal();
        if (ordinal == 1 || ordinal == 5) {
            x2.g.i(u0Var.o0());
            u0Var.d0();
            return;
        }
        if (ordinal != 7) {
            u0Var.a0("OpenCameraConfigAndClose finished while in state: " + u0Var.f37449e);
            return;
        }
        if (u0Var.f37456l == 0) {
            u0Var.M0(false);
            return;
        }
        u0Var.a0("OpenCameraConfigAndClose in error: " + g0(u0Var.f37456l));
        u0Var.f37453i.e();
    }

    public static /* synthetic */ void x(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void y(u0 u0Var, String str) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " INACTIVE");
        u0Var.f37446a.t(str);
        u0Var.N0();
    }

    public static /* synthetic */ void z(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " UPDATED");
        u0Var.f37446a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.N0();
    }

    public final void A0() {
        if (this.C != null) {
            this.f37446a.s(this.C.f() + this.C.hashCode());
            this.f37446a.t(this.C.f() + this.C.hashCode());
            this.C.c();
            this.C = null;
        }
    }

    public void B0(boolean z10) {
        x2.g.i(this.f37457m != null);
        a0("Resetting Capture Session");
        l3 l3Var = this.f37457m;
        n0.o3 h10 = l3Var.h();
        List<n0.l1> g10 = l3Var.g();
        l3 q02 = q0();
        this.f37457m = q02;
        q02.d(h10);
        this.f37457m.b(g10);
        if (this.f37449e.ordinal() != 9) {
            a0("Skipping Capture Session state check due to current camera state: " + this.f37449e + " and previous session status: " + l3Var.c());
        } else if (this.f37468x && l3Var.c()) {
            a0("Close camera before creating new session");
            D0(i.REOPENING_QUIRK);
        }
        if (this.f37469y && l3Var.c()) {
            a0("ConfigAndClose is required when close the camera.");
            this.f37470z = true;
        }
        z0(l3Var, z10);
    }

    public final void C0(final String str, final n0.o3 o3Var, final n0.i4<?> i4Var, final n0.t3 t3Var, final List<j4.b> list) {
        this.f37447c.execute(new Runnable() { // from class: z.i0
            @Override // java.lang.Runnable
            public final void run() {
                u0.F(u0.this, str, o3Var, i4Var, t3Var, list);
            }
        });
    }

    public void D0(i iVar) {
        E0(iVar, null);
    }

    public void E0(i iVar, w.a aVar) {
        F0(iVar, aVar, true);
    }

    public void F0(i iVar, w.a aVar, boolean z10) {
        p0.a aVar2;
        a0("Transitioning camera internal state: " + this.f37449e + " --> " + iVar);
        I0(iVar, aVar);
        this.f37449e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = p0.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = p0.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = p0.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = p0.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = p0.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = p0.a.OPENING;
                break;
            case OPENED:
                aVar2 = p0.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = p0.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f37466v.e(this, aVar2, z10);
        this.f37450f.n(aVar2);
        this.f37451g.c(aVar2, aVar);
    }

    public void G0(List<n0.l1> list) {
        ArrayList arrayList = new ArrayList();
        for (n0.l1 l1Var : list) {
            l1.a k10 = l1.a.k(l1Var);
            if (l1Var.k() == 5 && l1Var.d() != null) {
                k10.p(l1Var.d());
            }
            if (!l1Var.i().isEmpty() || !l1Var.n() || U(k10)) {
                arrayList.add(k10.h());
            }
        }
        a0("Issue capture request");
        this.f37457m.b(arrayList);
    }

    public final Collection<k> H0(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<g0.w2> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b(it.next(), this.B));
        }
        return arrayList;
    }

    public void I0(i iVar, w.a aVar) {
        if (n5.a.h()) {
            n5.a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f37462r++;
            }
            if (this.f37462r > 0) {
                n5.a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    public final void J0(Collection<k> collection) {
        Size f10;
        boolean isEmpty = this.f37446a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f37446a.o(kVar.h())) {
                this.f37446a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == g0.a2.class && (f10 = kVar.f()) != null) {
                    rational = new Rational(f10.getWidth(), f10.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f37452h.k0(true);
            this.f37452h.Y();
        }
        T();
        P0();
        O0();
        N0();
        B0(false);
        if (this.f37449e == i.OPENED) {
            v0();
        } else {
            w0();
        }
        if (rational != null) {
            this.f37452h.n0(rational);
        }
    }

    public final void K0(Collection<k> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k kVar : collection) {
            if (this.f37446a.o(kVar.h())) {
                this.f37446a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == g0.a2.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f37452h.n0(null);
        }
        T();
        if (this.f37446a.i().isEmpty()) {
            this.f37452h.p0(false);
            this.f37452h.m0(false);
        } else {
            P0();
            O0();
        }
        if (this.f37446a.h().isEmpty()) {
            this.f37452h.D();
            B0(false);
            this.f37452h.k0(false);
            this.f37457m = q0();
            W();
            return;
        }
        N0();
        B0(false);
        if (this.f37449e == i.OPENED) {
            v0();
        }
    }

    public void L0(boolean z10) {
        a0("Attempting to force open the camera.");
        if (this.f37466v.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    public void M0(boolean z10) {
        a0("Attempting to open the camera.");
        if (this.f37463s.b() && this.f37466v.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    public void N0() {
        o3.h e10 = this.f37446a.e();
        if (!e10.g()) {
            this.f37452h.j0();
            this.f37457m.d(this.f37452h.O());
            return;
        }
        this.f37452h.o0(e10.c().q());
        e10.b(this.f37452h.O());
        this.f37457m.d(e10.c());
    }

    public final void O0() {
        if (this.f37454j.F()) {
            o3.h e10 = this.f37446a.e();
            if (e10.g()) {
                if (e10.c().e().getUpper().intValue() > 30) {
                    this.f37452h.m0(true);
                } else {
                    this.f37452h.m0(false);
                }
            }
        }
    }

    public final void P0() {
        Iterator<n0.i4<?>> it = this.f37446a.i().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= it.next().T(false);
        }
        this.f37452h.p0(z10);
    }

    public final void S() {
        t4 t4Var = this.C;
        if (t4Var != null) {
            String h02 = h0(t4Var);
            n0.h4 h4Var = this.f37446a;
            n0.o3 h10 = this.C.h();
            n0.i4<?> i10 = this.C.i();
            j4.b bVar = j4.b.METERING_REPEATING;
            h4Var.r(h02, h10, i10, null, Collections.singletonList(bVar));
            this.f37446a.q(h02, this.C.h(), this.C.i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r0 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            r6 = this;
            n0.h4 r0 = r6.f37446a
            n0.o3$h r0 = r0.g()
            n0.o3 r0 = r0.c()
            n0.l1 r1 = r0.l()
            java.util.List r1 = r1.i()
            int r1 = r1.size()
            java.util.List r0 = r0.p()
            int r0 = r0.size()
            boolean r2 = r6.l0()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r1 != r4) goto L2d
            if (r0 != r4) goto L2b
            goto L2d
        L2b:
            r0 = r3
            goto L2e
        L2d:
            r0 = r4
        L2e:
            if (r0 != 0) goto L38
            z.t4 r1 = r6.C
            boolean r1 = r6.n0(r1)
            if (r1 == 0) goto L66
        L38:
            r6.A0()
            if (r0 != 0) goto L66
            goto L67
        L3e:
            if (r1 != 0) goto L66
            if (r0 <= 0) goto L66
            z.t4 r0 = r6.C
            if (r0 != 0) goto L5a
            z.t4 r0 = new z.t4
            z.z0 r1 = r6.f37454j
            a0.c0 r1 = r1.C()
            z.q3 r2 = r6.K
            z.l0 r5 = new z.l0
            r5.<init>()
            r0.<init>(r1, r2, r5)
            r6.C = r0
        L5a:
            z.t4 r0 = r6.C
            boolean r0 = r6.n0(r0)
            if (r0 == 0) goto L63
            goto L67
        L63:
            r6.S()
        L66:
            r3 = r4
        L67:
            z.y r0 = r6.f37452h
            r0.l0(r3)
            if (r3 != 0) goto L75
            java.lang.String r0 = "Camera2CameraImpl"
            java.lang.String r1 = "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly."
            g0.r1.c(r0, r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u0.T():void");
    }

    public final boolean U(l1.a aVar) {
        if (!aVar.m().isEmpty()) {
            g0.r1.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<n0.o3> it = this.f37446a.f().iterator();
        while (it.hasNext()) {
            n0.l1 l10 = it.next().l();
            List<n0.u1> i10 = l10.i();
            if (!i10.isEmpty()) {
                if (l10.h() != 0) {
                    aVar.u(l10.h());
                }
                if (l10.l() != 0) {
                    aVar.x(l10.l());
                }
                Iterator<n0.u1> it2 = i10.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        g0.r1.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void V(boolean z10) {
        x2.g.j(this.f37449e == i.CLOSING || this.f37449e == i.RELEASING || (this.f37449e == i.REOPENING && this.f37456l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f37449e + " (error: " + g0(this.f37456l) + ")");
        B0(z10);
        this.f37457m.e();
    }

    public final void W() {
        a0("Closing camera.");
        switch (this.f37449e.ordinal()) {
            case 3:
            case 4:
                x2.g.i(this.f37455k == null);
                D0(i.INITIALIZED);
                break;
            case 5:
            default:
                a0("close() ignored due to being in state: " + this.f37449e);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f37453i.a() && !this.O.c()) {
                    r1 = false;
                }
                this.O.a();
                D0(i.CLOSING);
                if (r1) {
                    x2.g.i(o0());
                    Y();
                    break;
                }
                break;
            case 9:
            case 10:
                D0(i.CLOSING);
                V(false);
                break;
        }
    }

    public final ne.x<Void> X(CameraDevice cameraDevice) {
        final k3 k3Var = new k3(this.M);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final n0.k2 k2Var = new n0.k2(surface);
        k2Var.k().a(new Runnable() { // from class: z.p0
            @Override // java.lang.Runnable
            public final void run() {
                u0.x(surface, surfaceTexture);
            }
        }, q0.c.b());
        o3.b bVar = new o3.b();
        bVar.h(k2Var);
        bVar.B(1);
        a0("Start configAndClose.");
        return r0.d.c(r0.n.z(k3Var.a(bVar.p(), cameraDevice, this.E.a()))).g(new r0.a() { // from class: z.q0
            @Override // r0.a
            public final ne.x apply(Object obj) {
                return u0.A(k3.this, k2Var, (Void) obj);
            }
        }, this.f37447c);
    }

    public final void Y() {
        x2.g.i(this.f37449e == i.RELEASING || this.f37449e == i.CLOSING);
        x2.g.i(this.f37461q.isEmpty());
        if (!this.f37470z) {
            d0();
            return;
        }
        if (this.A) {
            a0("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f37463s.b()) {
            this.f37470z = false;
            d0();
            a0("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            a0("Open camera to configAndClose");
            ne.x<Void> t02 = t0();
            this.A = true;
            t02.a(new Runnable() { // from class: z.s0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.w(u0.this);
                }
            }, this.f37447c);
        }
    }

    public final CameraDevice.StateCallback Z() {
        ArrayList arrayList = new ArrayList(this.f37446a.g().c().c());
        arrayList.add(this.D.c());
        arrayList.add(this.f37453i);
        return w2.a(arrayList);
    }

    @Override // n0.p0
    public ne.x<Void> a() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.f0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return u0.G(u0.this, aVar);
            }
        });
    }

    public void a0(String str) {
        b0(str, null);
    }

    @Override // n0.p0
    public n0.a3<p0.a> b() {
        return this.f37450f;
    }

    public final void b0(String str, Throwable th2) {
        g0.r1.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    public n0.o3 c0(n0.u1 u1Var) {
        for (n0.o3 o3Var : this.f37446a.h()) {
            if (o3Var.p().contains(u1Var)) {
                return o3Var;
            }
        }
        return null;
    }

    public void d0() {
        x2.g.i(this.f37449e == i.RELEASING || this.f37449e == i.CLOSING);
        x2.g.i(this.f37461q.isEmpty());
        this.f37455k = null;
        if (this.f37449e == i.CLOSING) {
            D0(i.INITIALIZED);
            return;
        }
        this.b.h(this.f37463s);
        D0(i.RELEASED);
        c.a<Void> aVar = this.f37460p;
        if (aVar != null) {
            aVar.c(null);
            this.f37460p = null;
        }
    }

    @Override // n0.p0
    public n0.l0 e() {
        return this.f37452h;
    }

    public final int e0() {
        synchronized (this.H) {
            try {
                return this.f37465u.e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.w2.c
    public void f(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String j02 = j0(w2Var);
        final n0.o3 z10 = this.B ? w2Var.z() : w2Var.x();
        final n0.i4<?> l10 = w2Var.l();
        final n0.t3 g10 = w2Var.g();
        final List<j4.b> f02 = f0(w2Var);
        this.f37447c.execute(new Runnable() { // from class: z.c0
            @Override // java.lang.Runnable
            public final void run() {
                u0.z(u0.this, j02, z10, l10, g10, f02);
            }
        });
    }

    @Override // n0.p0
    public n0.h0 g() {
        return this.G;
    }

    @Override // n0.p0
    public void h(final boolean z10) {
        this.f37447c.execute(new Runnable() { // from class: z.j0
            @Override // java.lang.Runnable
            public final void run() {
                u0.B(u0.this, z10);
            }
        });
    }

    @Override // n0.p0
    public void i(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f37452h.Y();
        r0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        try {
            this.f37447c.execute(new Runnable() { // from class: z.t0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.K(u0.this, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            b0("Unable to attach use cases.", e10);
            this.f37452h.D();
        }
    }

    public final ne.x<Void> i0() {
        if (this.f37459o == null) {
            if (this.f37449e != i.RELEASED) {
                this.f37459o = y1.c.a(new c.InterfaceC0669c() { // from class: z.n0
                    @Override // y1.c.InterfaceC0669c
                    public final Object a(c.a aVar) {
                        return u0.L(u0.this, aVar);
                    }
                });
            } else {
                this.f37459o = r0.n.p(null);
            }
        }
        return this.f37459o;
    }

    @Override // n0.p0
    public void j(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        s0(new ArrayList(arrayList));
        this.f37447c.execute(new Runnable() { // from class: z.h0
            @Override // java.lang.Runnable
            public final void run() {
                u0.this.K0(arrayList2);
            }
        });
    }

    @Override // n0.p0
    public n0.o0 k() {
        return this.f37454j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean k0() {
        try {
            return ((Boolean) y1.c.a(new c.InterfaceC0669c() { // from class: z.o0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return u0.u(u0.this, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    public final boolean l0() {
        t4 t4Var = this.C;
        if (t4Var == null) {
            return false;
        }
        return this.f37446a.o(h0(t4Var));
    }

    @Override // g0.w2.c
    public void m(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String j02 = j0(w2Var);
        this.f37447c.execute(new Runnable() { // from class: z.d0
            @Override // java.lang.Runnable
            public final void run() {
                u0.y(u0.this, j02);
            }
        });
    }

    public final boolean m0() {
        g0.g0 g0Var = this.f37467w;
        return (g0Var == null || g0Var.r0()) ? false : true;
    }

    @Override // g0.w2.c
    public void n(g0.w2 w2Var) {
        x2.g.g(w2Var);
        C0(j0(w2Var), this.B ? w2Var.z() : w2Var.x(), w2Var.l(), w2Var.g(), f0(w2Var));
    }

    public final boolean n0(t4 t4Var) {
        x2.g.g(t4Var);
        return !p0(t4Var) || m0();
    }

    @Override // n0.p0
    public void o(n0.h0 h0Var) {
        if (h0Var == null) {
            h0Var = n0.k0.a();
        }
        n0.q3 w5 = h0Var.w(null);
        this.G = h0Var;
        synchronized (this.H) {
            this.I = w5;
        }
    }

    public boolean o0() {
        return this.f37461q.isEmpty();
    }

    @Override // n0.p0
    public void p() {
        this.f37447c.execute(new Runnable() { // from class: z.k0
            @Override // java.lang.Runnable
            public final void run() {
                u0.I(u0.this);
            }
        });
    }

    public final boolean p0(t4 t4Var) {
        ArrayList arrayList = new ArrayList();
        int e02 = e0();
        for (h4.b bVar : this.f37446a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != j4.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    g0.r1.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                n0.o3 d10 = bVar.d();
                n0.i4<?> f10 = bVar.f();
                for (n0.u1 u1Var : d10.p()) {
                    arrayList.add(n0.g.a(this.N.a0(e02, f10.p(), u1Var.h(), f10.W()), f10.p(), u1Var.h(), bVar.e().b(), bVar.c(), bVar.e().d(), bVar.e().g(), bVar.e().c(), f10.H()));
                }
            }
        }
        x2.g.g(t4Var);
        HashMap hashMap = new HashMap();
        hashMap.put(t4Var.i(), Collections.singletonList(t4Var.e()));
        try {
            this.N.K(e02, arrayList, hashMap, false, false, false, false);
            a0("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            b0("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    public final l3 q0() {
        synchronized (this.H) {
            try {
                g0.g0 g0Var = this.f37467w;
                f0.i a10 = g0Var == null ? null : f0.j.a(g0Var);
                if (this.I == null) {
                    return new k3(this.M, this.f37454j.l(), a10);
                }
                return new z4(this.I, this.f37454j, this.M, this.f37447c, this.f37448d, a10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.p0
    public void r(boolean z10) {
        this.B = z10;
    }

    public final void r0(List<g0.w2> list) {
        for (g0.w2 w2Var : list) {
            String j02 = j0(w2Var);
            if (!this.F.contains(j02)) {
                this.F.add(j02);
                w2Var.R();
                w2Var.P();
            }
        }
    }

    @Override // g0.w2.c
    public void s(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String j02 = j0(w2Var);
        final n0.o3 z10 = this.B ? w2Var.z() : w2Var.x();
        final n0.i4<?> l10 = w2Var.l();
        final n0.t3 g10 = w2Var.g();
        final List<j4.b> f02 = f0(w2Var);
        this.f37447c.execute(new Runnable() { // from class: z.e0
            @Override // java.lang.Runnable
            public final void run() {
                u0.E(u0.this, j02, z10, l10, g10, f02);
            }
        });
    }

    public final void s0(List<g0.w2> list) {
        for (g0.w2 w2Var : list) {
            String j02 = j0(w2Var);
            if (this.F.contains(j02)) {
                w2Var.S();
                this.F.remove(j02);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final ne.x<Void> t0() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: z.b0
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return u0.t(u0.this, aVar);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f37454j.e());
    }

    @SuppressLint({"MissingPermission"})
    public final void u0(boolean z10) {
        if (!z10) {
            this.f37453i.d();
        }
        this.f37453i.a();
        this.O.a();
        a0("Opening camera.");
        D0(i.OPENING);
        try {
            this.b.f(this.f37454j.e(), this.f37447c, Z());
        } catch (a0.f e10) {
            a0("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                this.O.d();
            } else {
                E0(i.INITIALIZED, w.a.b(7, e10));
            }
        } catch (SecurityException e11) {
            a0("Unable to open camera due to " + e11.getMessage());
            D0(i.REOPENING);
            this.f37453i.e();
        } catch (RuntimeException e12) {
            b0("Unexpected error occurred when opening camera.", e12);
            E0(i.OPENING_WITH_ERROR, w.a.a(6));
        }
    }

    public void v0() {
        x2.g.i(this.f37449e == i.OPENED);
        o3.h g10 = this.f37446a.g();
        if (!g10.g()) {
            a0("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f37466v.j(this.f37455k.getId(), this.f37465u.d(this.f37455k.getId()))) {
            a0("Unable to create capture session in camera operating mode = " + this.f37465u.e());
            return;
        }
        HashMap hashMap = new HashMap();
        c5.m(this.f37446a.h(), this.f37446a.i(), hashMap);
        this.f37457m.i(hashMap);
        l3 l3Var = this.f37457m;
        r0.n.j(l3Var.a(g10.c(), (CameraDevice) x2.g.g(this.f37455k), this.E.a()), new d(l3Var), this.f37447c);
    }

    public final void w0() {
        int ordinal = this.f37449e.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            L0(false);
            return;
        }
        if (ordinal != 5) {
            a0("open() ignored due to being in state: " + this.f37449e);
            return;
        }
        D0(i.REOPENING);
        if (o0() || this.A || this.f37456l != 0) {
            return;
        }
        x2.g.j(this.f37455k != null, "Camera Device should be open if session close is not complete");
        D0(i.OPENED);
        v0();
    }

    public void x0(final n0.o3 o3Var) {
        ScheduledExecutorService e10 = q0.c.e();
        final o3.d d10 = o3Var.d();
        if (d10 != null) {
            b0("Posting surface closed", new Throwable());
            e10.execute(new Runnable() { // from class: z.g0
                @Override // java.lang.Runnable
                public final void run() {
                    o3.d.this.a(o3Var, o3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public final ne.x<Void> y0() {
        ne.x<Void> i02 = i0();
        switch (this.f37449e.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f37453i.a() && !this.O.c()) {
                    r2 = false;
                }
                this.O.a();
                D0(i.RELEASING);
                if (r2) {
                    x2.g.i(o0());
                    Y();
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
                x2.g.i(this.f37455k == null);
                D0(i.RELEASING);
                x2.g.i(o0());
                Y();
                break;
            case 9:
            case 10:
                D0(i.RELEASING);
                V(false);
                break;
            default:
                a0("release() ignored due to being in state: " + this.f37449e);
                break;
        }
        return i02;
    }

    public ne.x<Void> z0(l3 l3Var, boolean z10) {
        l3Var.close();
        ne.x<Void> f10 = l3Var.f(z10);
        a0("Releasing session in state " + this.f37449e.name());
        this.f37461q.put(l3Var, f10);
        r0.n.j(f10, new c(l3Var), q0.c.b());
        return f10;
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public a f37479a;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final ScheduledFuture<?> f37480a;
            public final AtomicBoolean b = new AtomicBoolean(false);

            public a() {
                this.f37480a = u0.this.f37448d.schedule(new Runnable() { // from class: z.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.h.a.this.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public void c() {
                this.b.set(true);
                this.f37480a.cancel(true);
            }

            public final void d() {
                if (this.b.getAndSet(true)) {
                    return;
                }
                u0.this.f37447c.execute(new Runnable() { // from class: z.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.h.a.this.e();
                    }
                });
            }

            public final void e() {
                if (u0.this.f37449e == i.OPENING) {
                    u0.this.a0("Camera onError timeout, reopen it.");
                    u0.this.D0(i.REOPENING);
                    u0.this.f37453i.e();
                } else {
                    u0.this.a0("Camera skip reopen at state: " + u0.this.f37449e);
                }
            }

            public boolean f() {
                return this.b.get();
            }
        }

        public h() {
            this.f37479a = null;
        }

        public void a() {
            a aVar = this.f37479a;
            if (aVar != null) {
                aVar.c();
            }
            this.f37479a = null;
        }

        public void b() {
            u0.this.a0("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f37479a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (u0.this.f37449e != i.OPENING) {
                u0.this.a0("Don't need the onError timeout handler.");
                return;
            }
            u0.this.a0("Camera waiting for onError.");
            a();
            this.f37479a = new a();
        }

        public /* synthetic */ h(u0 u0Var, a aVar) {
            this();
        }
    }
}
