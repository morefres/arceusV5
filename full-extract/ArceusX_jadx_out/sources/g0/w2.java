package g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k0.DynamicRangeFeature;
import k0.FpsRangeFeature;
import k0.VideoStabilizationFeature;
import n0.i4;
import n0.j4;
import n0.n1;
import n0.o3;
import n0.t3;

/* loaded from: classes.dex */
public abstract class w2 {

    /* renamed from: e, reason: collision with root package name */
    public i4<?> f18036e;

    /* renamed from: f, reason: collision with root package name */
    public i4<?> f18037f;

    /* renamed from: g, reason: collision with root package name */
    public Set<i0.b> f18038g;

    /* renamed from: h, reason: collision with root package name */
    public i4<?> f18039h;

    /* renamed from: i, reason: collision with root package name */
    public t3 f18040i;

    /* renamed from: j, reason: collision with root package name */
    public i4<?> f18041j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f18042k;

    /* renamed from: m, reason: collision with root package name */
    public n0.p0 f18044m;

    /* renamed from: n, reason: collision with root package name */
    public n0.p0 f18045n;

    /* renamed from: o, reason: collision with root package name */
    public n f18046o;

    /* renamed from: p, reason: collision with root package name */
    public String f18047p;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18033a = false;
    public final Set<c> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Object f18034c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public b f18035d = b.INACTIVE;

    /* renamed from: l, reason: collision with root package name */
    public Matrix f18043l = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    public o3 f18048q = o3.b();

    /* renamed from: r, reason: collision with root package name */
    public o3 f18049r = o3.b();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18050a;

        static {
            int[] iArr = new int[VideoStabilizationFeature.b.values().length];
            f18050a = iArr;
            try {
                iArr[VideoStabilizationFeature.b.f22193a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18050a[VideoStabilizationFeature.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18050a[VideoStabilizationFeature.b.f22194c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ACTIVE,
        INACTIVE
    }

    public interface c {
        void f(w2 w2Var);

        void m(w2 w2Var);

        void n(w2 w2Var);

        void s(w2 w2Var);
    }

    public w2(i4<?> i4Var) {
        this.f18037f = i4Var;
        this.f18039h = i4Var;
    }

    public Set<k0> A(n0.o0 o0Var) {
        return null;
    }

    public Set<Integer> B() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    public int C() {
        return ((n0.i2) this.f18039h).J(0);
    }

    public abstract i4.b<?, ?, ?> D(n0.n1 n1Var);

    public Rect E() {
        return this.f18042k;
    }

    public boolean F(int i10) {
        Iterator<Integer> it = B().iterator();
        while (it.hasNext()) {
            if (x0.z0.e(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean G() {
        return this.f18033a;
    }

    public boolean H(n0.p0 p0Var) {
        int q10 = q();
        if (q10 == -1 || q10 == 0) {
            return false;
        }
        if (q10 == 1) {
            return true;
        }
        if (q10 == 2) {
            return p0Var.l();
        }
        throw new AssertionError("Unknown mirrorMode: " + q10);
    }

    public i4<?> I(n0.o0 o0Var, i4<?> i4Var, i4<?> i4Var2) {
        n0.x2 k02;
        if (i4Var2 != null) {
            k02 = n0.x2.l0(i4Var2);
            k02.m0(s0.q.M);
        } else {
            k02 = n0.x2.k0();
        }
        if (this.f18037f.a(n0.i2.f25387m) || this.f18037f.a(n0.i2.f25391q)) {
            n1.a<a1.c> aVar = n0.i2.f25395u;
            if (k02.a(aVar)) {
                k02.m0(aVar);
            }
        }
        i4<?> i4Var3 = this.f18037f;
        n1.a<a1.c> aVar2 = n0.i2.f25395u;
        if (i4Var3.a(aVar2)) {
            n1.a<Size> aVar3 = n0.i2.f25393s;
            if (k02.a(aVar3) && ((a1.c) this.f18037f.e(aVar2)).d() != null) {
                k02.m0(aVar3);
            }
        }
        Iterator<n1.a<?>> it = this.f18037f.b().iterator();
        while (it.hasNext()) {
            n0.n1.P(k02, k02, this.f18037f, it.next());
        }
        if (i4Var != null) {
            for (n1.a<?> aVar4 : i4Var.b()) {
                if (!aVar4.c().equals(s0.q.M.c())) {
                    n0.n1.P(k02, k02, i4Var, aVar4);
                }
            }
        }
        if (k02.a(n0.i2.f25391q)) {
            n1.a<Integer> aVar5 = n0.i2.f25387m;
            if (k02.a(aVar5)) {
                k02.m0(aVar5);
            }
        }
        n1.a<a1.c> aVar6 = n0.i2.f25395u;
        if (k02.a(aVar6) && ((a1.c) k02.e(aVar6)).a() != 0) {
            k02.G(i4.E, Boolean.TRUE);
        }
        c(k02);
        return Q(o0Var, D(k02));
    }

    public final void J() {
        this.f18035d = b.ACTIVE;
        M();
    }

    public final void K() {
        this.f18035d = b.INACTIVE;
        M();
    }

    public final void L() {
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().n(this);
        }
    }

    public final void M() {
        int ordinal = this.f18035d.ordinal();
        if (ordinal == 0) {
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().s(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator<c> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().m(this);
            }
        }
    }

    public final void N() {
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }

    public void O() {
    }

    public void P() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n0.i4, n0.i4<?>] */
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        return bVar.e();
    }

    public void R() {
        this.f18033a = true;
    }

    public void S() {
        this.f18033a = false;
    }

    public t3 T(n0.n1 n1Var) {
        t3 t3Var = this.f18040i;
        if (t3Var != null) {
            return t3Var.i().d(n1Var).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public t3 U(t3 t3Var, t3 t3Var2) {
        return t3Var;
    }

    public void V() {
    }

    public final void W(c cVar) {
        this.b.remove(cVar);
    }

    public void X(n nVar) {
        x2.g.a(nVar == null || F(nVar.g()));
        this.f18046o = nVar;
    }

    public void Y(Set<i0.b> set) {
        this.f18038g = set != null ? new HashSet(set) : null;
    }

    public void Z(Matrix matrix) {
        this.f18043l = new Matrix(matrix);
    }

    public final void a(c cVar) {
        this.b.add(cVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [n0.i4, n0.i4<?>] */
    public boolean a0(int i10) {
        int J = ((n0.i2) l()).J(-1);
        if (J != -1 && J == i10) {
            return false;
        }
        i4.b<?, ?, ?> D = D(this.f18037f);
        w0.e.a(D, i10);
        this.f18037f = D.e();
        n0.p0 i11 = i();
        if (i11 == null) {
            this.f18039h = this.f18037f;
            return true;
        }
        this.f18039h = I(i11.k(), this.f18036e, this.f18041j);
        return true;
    }

    public void b(o3.b bVar, t3 t3Var) {
        if (!t3.f25564a.equals(t3Var.c())) {
            bVar.v(t3Var.c());
            return;
        }
        synchronized (this.f18034c) {
            try {
                List c10 = ((n0.p0) x2.g.g(this.f18044m)).k().l().c(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (c10.size() > 1) {
                    z10 = false;
                }
                x2.g.b(z10, "There should not have more than one AeFpsRangeQuirk.");
                if (!c10.isEmpty()) {
                    bVar.v(((AeFpsRangeQuirk) c10.get(0)).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b0(Rect rect) {
        this.f18042k = rect;
    }

    public final void c(n0.x2 x2Var) {
        r1.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f18038g + ", this = " + this);
        Set<i0.b> set = this.f18038g;
        if (set == null) {
            return;
        }
        k0 k0Var = DynamicRangeFeature.f22173j;
        Range<Integer> range = t3.f25564a;
        VideoStabilizationFeature.b bVar = VideoStabilizationFeature.f22190j;
        for (i0.b bVar2 : set) {
            if (bVar2 instanceof DynamicRangeFeature) {
                k0Var = ((DynamicRangeFeature) bVar2).getDynamicRange();
            } else if (bVar2 instanceof FpsRangeFeature) {
                FpsRangeFeature fpsRangeFeature = (FpsRangeFeature) bVar2;
                range = new Range<>(Integer.valueOf(fpsRangeFeature.getMinFps()), Integer.valueOf(fpsRangeFeature.getMaxFps()));
            } else if (bVar2 instanceof VideoStabilizationFeature) {
                bVar = ((VideoStabilizationFeature) bVar2).getMode();
            }
        }
        if ((this instanceof a2) || s0.f.e0(this)) {
            x2Var.G(n0.h2.f25375l, k0Var);
        }
        x2Var.G(i4.C, range);
        int i10 = a.f18050a[bVar.ordinal()];
        if (i10 == 1) {
            x2Var.G(i4.H, 1);
            x2Var.G(i4.I, 1);
        } else if (i10 == 2) {
            x2Var.G(i4.H, 0);
            x2Var.G(i4.I, 2);
        } else {
            if (i10 != 3) {
                return;
            }
            x2Var.G(i4.H, 2);
            x2Var.G(i4.I, 0);
        }
    }

    public final void c0(n0.p0 p0Var) {
        V();
        synchronized (this.f18034c) {
            try {
                n0.p0 p0Var2 = this.f18044m;
                if (p0Var == p0Var2) {
                    W(p0Var2);
                    this.f18044m = null;
                }
                n0.p0 p0Var3 = this.f18045n;
                if (p0Var == p0Var3) {
                    W(p0Var3);
                    this.f18045n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18040i = null;
        this.f18042k = null;
        this.f18039h = this.f18037f;
        this.f18036e = null;
        this.f18041j = null;
    }

    @SuppressLint({"WrongConstant"})
    public final void d(n0.p0 p0Var, n0.p0 p0Var2, i4<?> i4Var, i4<?> i4Var2) {
        synchronized (this.f18034c) {
            try {
                this.f18044m = p0Var;
                this.f18045n = p0Var2;
                a(p0Var);
                if (p0Var2 != null) {
                    a(p0Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18036e = i4Var;
        this.f18041j = i4Var2;
        this.f18039h = I(p0Var.k(), this.f18036e, this.f18041j);
        O();
    }

    public void d0(List<o3> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f18048q = list.get(0);
        if (list.size() > 1) {
            this.f18049r = list.get(1);
        }
        Iterator<o3> it = list.iterator();
        while (it.hasNext()) {
            for (n0.u1 u1Var : it.next().p()) {
                if (u1Var.g() == null) {
                    u1Var.p(getClass());
                }
            }
        }
    }

    public i4<?> e() {
        return this.f18037f;
    }

    public void e0(t3 t3Var, t3 t3Var2) {
        this.f18040i = U(t3Var, t3Var2);
    }

    public int f() {
        return ((n0.i2) this.f18039h).t(-1);
    }

    public void f0(n0.n1 n1Var) {
        this.f18040i = T(n1Var);
    }

    public t3 g() {
        return this.f18040i;
    }

    public Size h() {
        t3 t3Var = this.f18040i;
        if (t3Var != null) {
            return t3Var.f();
        }
        return null;
    }

    public n0.p0 i() {
        n0.p0 p0Var;
        synchronized (this.f18034c) {
            p0Var = this.f18044m;
        }
        return p0Var;
    }

    public n0.l0 j() {
        synchronized (this.f18034c) {
            try {
                n0.p0 p0Var = this.f18044m;
                if (p0Var == null) {
                    return n0.l0.f25428a;
                }
                return p0Var.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String k() {
        return ((n0.p0) x2.g.h(i(), "No camera attached to use case: " + this)).k().e();
    }

    public i4<?> l() {
        return this.f18039h;
    }

    public abstract i4<?> m(boolean z10, j4 j4Var);

    public n n() {
        return this.f18046o;
    }

    public Set<i0.b> o() {
        return this.f18038g;
    }

    public int p() {
        return this.f18039h.p();
    }

    public int q() {
        return ((n0.i2) this.f18039h).g0(-1);
    }

    public String r() {
        String u8 = this.f18039h.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(u8);
        return u8;
    }

    public String s() {
        return this.f18047p;
    }

    public int t(n0.p0 p0Var) {
        return u(p0Var, false);
    }

    public int u(n0.p0 p0Var, boolean z10) {
        int w5 = p0Var.k().w(C());
        return (p0Var.q() || !z10) ? w5 : p0.a0.w(-w5);
    }

    public n0.p0 v() {
        n0.p0 p0Var;
        synchronized (this.f18034c) {
            p0Var = this.f18045n;
        }
        return p0Var;
    }

    public String w() {
        if (v() == null) {
            return null;
        }
        return v().k().e();
    }

    public o3 x() {
        return this.f18049r;
    }

    public Matrix y() {
        return this.f18043l;
    }

    public o3 z() {
        return this.f18048q;
    }
}
