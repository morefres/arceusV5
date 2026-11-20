package g0;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import g0.c2;
import g0.g0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import n0.h3;
import n0.i3;
import n0.j3;
import n0.j4;
import y1.c;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f17825s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final SparseArray<Integer> f17826t = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public final n0.d1 f17827a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f17828c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f17829d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f17830e;

    /* renamed from: f, reason: collision with root package name */
    public final HandlerThread f17831f;

    /* renamed from: g, reason: collision with root package name */
    public n0.n0 f17832g;

    /* renamed from: h, reason: collision with root package name */
    public n0.m0 f17833h;

    /* renamed from: i, reason: collision with root package name */
    public j4 f17834i;

    /* renamed from: j, reason: collision with root package name */
    public s0.m f17835j;

    /* renamed from: k, reason: collision with root package name */
    public y f17836k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f17837l;

    /* renamed from: m, reason: collision with root package name */
    public final ne.x<Void> f17838m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.y0 f17839n;

    /* renamed from: o, reason: collision with root package name */
    public a f17840o;

    /* renamed from: p, reason: collision with root package name */
    public ne.x<Void> f17841p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f17842q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17843r;

    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public f0(Context context, g0.b bVar) {
        this(context, bVar, new j3());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(final g0.f0 r16, android.content.Context r17, final java.util.concurrent.Executor r18, final int r19, final y1.c.a r20, final long r21) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.f0.a(g0.f0, android.content.Context, java.util.concurrent.Executor, int, y1.c$a, long):void");
    }

    public static /* synthetic */ void b(f0 f0Var, c.a aVar) {
        f0Var.f17832g.shutdown();
        if (f0Var.f17831f != null) {
            Executor executor = f0Var.f17829d;
            if (executor instanceof q) {
                ((q) executor).d();
            }
            f0Var.f17831f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(f0 f0Var, Context context, c.a aVar) {
        f0Var.n(f0Var.f17829d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final f0 f0Var, final c.a aVar) {
        f0Var.f17839n.z();
        f0Var.f17827a.k().a(new Runnable() { // from class: g0.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.b(f0.this, aVar);
            }
        }, f0Var.f17829d);
        return "CameraX shutdownInternal";
    }

    public static void f(Integer num) {
        synchronized (f17825s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f17826t;
                int intValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g0.b k(Context context) {
        ComponentCallbacks2 b = p0.f.b(context);
        if (b instanceof g0.b) {
            return (g0.b) b;
        }
        try {
            Context a10 = p0.f.a(context);
            Bundle bundle = a10.getPackageManager().getServiceInfo(new ComponentName(a10, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (g0.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            r1.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void m(Integer num) {
        synchronized (f17825s) {
            try {
                if (num == null) {
                    return;
                }
                x2.g.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f17826t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void t() {
        SparseArray<Integer> sparseArray = f17826t;
        if (sparseArray.size() == 0) {
            r1.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            r1.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            r1.j(4);
        } else if (sparseArray.get(5) != null) {
            r1.j(5);
        } else if (sparseArray.get(6) != null) {
            r1.j(6);
        }
    }

    public static void u(Context context, h3 h3Var, t.a<Context, h3> aVar) {
        if (h3Var != null) {
            r1.a("CameraX", "QuirkSettings from CameraXConfig: " + h3Var);
        } else {
            h3Var = aVar.apply(context);
            r1.a("CameraX", "QuirkSettings from app metadata: " + h3Var);
        }
        if (h3Var == null) {
            h3Var = i3.b;
            r1.a("CameraX", "QuirkSettings by default: " + h3Var);
        }
        i3.b().d(h3Var);
    }

    public n0.n0 g() {
        n0.n0 n0Var = this.f17832g;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public n0.d1 h() {
        return this.f17827a;
    }

    public y i() {
        y yVar = this.f17836k;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public int j() {
        return this.f17843r;
    }

    public ne.x<Void> l() {
        return this.f17838m;
    }

    public final void n(final Executor executor, final long j10, final int i10, final Context context, final c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: g0.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.a(f0.this, context, executor, i10, aVar, j10);
            }
        });
    }

    public final ne.x<Void> o(final Context context) {
        ne.x<Void> a10;
        synchronized (this.b) {
            x2.g.j(this.f17840o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f17840o = a.INITIALIZING;
            a10 = y1.c.a(new c.InterfaceC0669c() { // from class: g0.a0
                @Override // y1.c.InterfaceC0669c
                public final Object a(c.a aVar) {
                    return f0.c(f0.this, context, aVar);
                }
            });
        }
        return a10;
    }

    public final void p() {
        synchronized (this.b) {
            this.f17840o = a.INITIALIZED;
        }
    }

    public ne.x<Void> q() {
        return r();
    }

    public final ne.x<Void> r() {
        synchronized (this.b) {
            try {
                this.f17830e.removeCallbacksAndMessages("retry_token");
                int ordinal = this.f17840o.ordinal();
                if (ordinal == 0) {
                    this.f17840o = a.SHUTDOWN;
                    return r0.n.p(null);
                }
                if (ordinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (ordinal == 2 || ordinal == 3) {
                    this.f17840o = a.SHUTDOWN;
                    f(this.f17842q);
                    this.f17841p = y1.c.a(new c.InterfaceC0669c() { // from class: g0.c0
                        @Override // y1.c.InterfaceC0669c
                        public final Object a(c.a aVar) {
                            return f0.d(f0.this, aVar);
                        }
                    });
                }
                return this.f17841p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(c2.b bVar) {
        if (n5.a.h()) {
            n5.a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.m() : -1);
        }
    }

    public f0(Context context, g0.b bVar, t.a<Context, h3> aVar) {
        this.f17827a = new n0.d1();
        this.b = new Object();
        this.f17840o = a.UNINITIALIZED;
        this.f17841p = r0.n.p(null);
        if (bVar != null) {
            this.f17828c = bVar.getCameraXConfig();
        } else {
            g0.b k10 = k(context);
            if (k10 == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f17828c = k10.getCameraXConfig();
        }
        u(context, this.f17828c.o0(), aVar);
        this.f17843r = this.f17828c.m0();
        Executor i02 = this.f17828c.i0(null);
        Handler p02 = this.f17828c.p0(null);
        i02 = i02 == null ? new q() : i02;
        this.f17829d = i02;
        if (p02 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f17831f = handlerThread;
            handlerThread.start();
            this.f17830e = u2.i.a(handlerThread.getLooper());
        } else {
            this.f17831f = null;
            this.f17830e = p02;
        }
        Integer num = (Integer) this.f17828c.h(g0.V, null);
        this.f17842q = num;
        m(num);
        this.f17837l = new c2.a(this.f17828c.l0()).a();
        this.f17839n = new n0.y0(i02);
        this.f17838m = o(context);
    }
}
