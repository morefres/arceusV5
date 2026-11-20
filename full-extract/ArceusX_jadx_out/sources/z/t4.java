package z;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import n0.j4;
import n0.o3;

/* loaded from: classes.dex */
public class t4 {

    /* renamed from: a, reason: collision with root package name */
    public n0.u1 f37437a;
    public n0.o3 b;

    /* renamed from: d, reason: collision with root package name */
    public final Size f37439d;

    /* renamed from: f, reason: collision with root package name */
    public final c f37441f;

    /* renamed from: e, reason: collision with root package name */
    public final d0.w f37440e = new d0.w();

    /* renamed from: g, reason: collision with root package name */
    public o3.c f37442g = null;

    /* renamed from: c, reason: collision with root package name */
    public final b f37438c = new b();

    public class a implements r0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f37443a;
        public final /* synthetic */ SurfaceTexture b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f37443a = surface;
            this.b = surfaceTexture;
        }

        @Override // r0.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f37443a.release();
            this.b.release();
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    public static class b implements n0.i4<g0.w2> {
        public final n0.n1 P;

        public b() {
            n0.x2 k02 = n0.x2.k0();
            k02.G(n0.i4.f25402y, new s2());
            k02.G(n0.h2.f25373j, 34);
            h0(k02);
            this.P = k02;
        }

        @Override // n0.i4
        public j4.b X() {
            return j4.b.METERING_REPEATING;
        }

        public final void h0(n0.x2 x2Var) {
            x2Var.G(s0.q.N, t4.class);
            x2Var.G(s0.q.M, t4.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // n0.l3
        public n0.n1 n() {
            return this.P;
        }
    }

    public interface c {
        void a();
    }

    public t4(a0.c0 c0Var, q3 q3Var, c cVar) {
        this.f37441f = cVar;
        Size g10 = g(c0Var, q3Var);
        this.f37439d = g10;
        g0.r1.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + g10);
        this.b = d();
    }

    public static /* synthetic */ void a(t4 t4Var, n0.o3 o3Var, o3.g gVar) {
        t4Var.b = t4Var.d();
        c cVar = t4Var.f37441f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        g0.r1.a("MeteringRepeating", "MeteringRepeating clear!");
        n0.u1 u1Var = this.f37437a;
        if (u1Var != null) {
            u1Var.d();
        }
        this.f37437a = null;
    }

    public n0.o3 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f37439d.getWidth(), this.f37439d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        o3.b r8 = o3.b.r(this.f37438c, this.f37439d);
        r8.B(1);
        n0.k2 k2Var = new n0.k2(surface);
        this.f37437a = k2Var;
        r0.n.j(k2Var.k(), new a(surface, surfaceTexture), q0.c.b());
        r8.l(this.f37437a);
        o3.c cVar = this.f37442g;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: z.r4
            @Override // n0.o3.d
            public final void a(n0.o3 o3Var, o3.g gVar) {
                t4.a(t4.this, o3Var, gVar);
            }
        });
        this.f37442g = cVar2;
        r8.u(cVar2);
        return r8.p();
    }

    public Size e() {
        return this.f37439d;
    }

    public String f() {
        return "MeteringRepeating";
    }

    public final Size g(a0.c0 c0Var, q3 q3Var) {
        Size[] g10 = c0Var.e().g(34);
        if (g10 == null) {
            g0.r1.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a10 = this.f37440e.a(g10);
        List asList = Arrays.asList(a10);
        Collections.sort(asList, new Comparator() { // from class: z.s4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int signum;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return signum;
            }
        });
        Size f10 = q3Var.f();
        long min = Math.min(f10.getWidth() * f10.getHeight(), 307200L);
        int length = a10.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = a10[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    public n0.o3 h() {
        return this.b;
    }

    public n0.i4<?> i() {
        return this.f37438c;
    }
}
