package g0;

import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c3;
import n0.h3;
import n0.j4;
import n0.m0;
import n0.n0;
import n0.n1;

/* loaded from: classes.dex */
public final class g0 implements s0.q<f0> {
    public static final n1.a<n0.a> Q = n1.a.a("camerax.core.appConfig.cameraFactoryProvider", n0.a.class);
    public static final n1.a<m0.a> R = n1.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", m0.a.class);
    public static final n1.a<j4.c> S = n1.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", j4.c.class);
    public static final n1.a<Executor> T = n1.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final n1.a<Handler> U = n1.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final n1.a<Integer> V;
    public static final n1.a<v> W;
    public static final n1.a<Long> X;
    public static final n1.a<c2> Y;
    public static final n1.a<h3> Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final n1.a<Integer> f17881a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final n1.a<Boolean> f17882b0;
    public final c3 P;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n0.x2 f17883a;

        public a() {
            this(n0.x2.k0());
        }

        public g0 a() {
            return new g0(c3.j0(this.f17883a));
        }

        public n0.w2 b() {
            return this.f17883a;
        }

        public a c(n0.a aVar) {
            b().G(g0.Q, aVar);
            return this;
        }

        public a d(int i10) {
            b().G(g0.f17881a0, Integer.valueOf(i10));
            return this;
        }

        public a e(m0.a aVar) {
            b().G(g0.R, aVar);
            return this;
        }

        public a f(boolean z10) {
            b().G(g0.f17882b0, Boolean.valueOf(z10));
            return this;
        }

        public a g(Class<f0> cls) {
            b().G(s0.q.N, cls);
            if (b().h(s0.q.M, null) == null) {
                h(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a h(String str) {
            b().G(s0.q.M, str);
            return this;
        }

        public a i(j4.c cVar) {
            b().G(g0.S, cVar);
            return this;
        }

        public a(n0.x2 x2Var) {
            this.f17883a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(f0.class)) {
                g(f0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        g0 getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        V = n1.a.a("camerax.core.appConfig.minimumLoggingLevel", cls);
        W = n1.a.a("camerax.core.appConfig.availableCamerasLimiter", v.class);
        X = n1.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        Y = n1.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", c2.class);
        Z = n1.a.a("camerax.core.appConfig.quirksSettings", h3.class);
        f17881a0 = n1.a.a("camerax.core.appConfig.configImplType", cls);
        f17882b0 = n1.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public g0(c3 c3Var) {
        this.P = c3Var;
    }

    public v h0(v vVar) {
        return (v) this.P.h(W, vVar);
    }

    public Executor i0(Executor executor) {
        return (Executor) this.P.h(T, executor);
    }

    public n0.a j0(n0.a aVar) {
        return (n0.a) this.P.h(Q, aVar);
    }

    public long k0() {
        return ((Long) this.P.h(X, -1L)).longValue();
    }

    public c2 l0() {
        c2 c2Var = (c2) this.P.h(Y, c2.b);
        Objects.requireNonNull(c2Var);
        return c2Var;
    }

    public int m0() {
        return ((Integer) this.P.h(f17881a0, -1)).intValue();
    }

    @Override // n0.l3
    public n0.n1 n() {
        return this.P;
    }

    public m0.a n0(m0.a aVar) {
        return (m0.a) this.P.h(R, aVar);
    }

    public h3 o0() {
        return (h3) this.P.h(Z, null);
    }

    public Handler p0(Handler handler) {
        return (Handler) this.P.h(U, handler);
    }

    public j4.c q0(j4.c cVar) {
        return (j4.c) this.P.h(S, cVar);
    }

    public boolean r0() {
        return ((Boolean) this.P.h(f17882b0, Boolean.TRUE)).booleanValue();
    }
}
