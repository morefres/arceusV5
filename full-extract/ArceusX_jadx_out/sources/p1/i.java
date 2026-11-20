package p1;

import a1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import f1.b2;
import f1.e1;
import f1.p1;
import f1.r0;
import g0.a2;
import g0.f1;
import g0.m;
import g0.m0;
import g0.r1;
import g0.u0;
import g0.v1;
import g0.x2;
import g0.y2;
import g0.z2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n0.i2;
import n0.t3;
import p1.b0;
import p1.i;
import r1.a;

/* loaded from: classes.dex */
public abstract class i {
    public static final f1.j Q = new a();
    public int A;
    public boolean B;
    public boolean C;
    public b D;
    public final k<z2> E;
    public final k<Integer> F;
    public final android.view.d0<k0> G;
    public final android.view.a0<Integer> H;
    public final n<Boolean> I;
    public final n<Float> J;
    public final n<Float> K;
    public final Set<g0.n> L;
    public final Context M;
    public final ne.x<Void> N;
    public final Map<a.EnumC0529a, r1.a> O;
    public long P;

    /* renamed from: a, reason: collision with root package name */
    public g0.v f28281a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public a2 f28282c;

    /* renamed from: d, reason: collision with root package name */
    public a1.c f28283d;

    /* renamed from: e, reason: collision with root package name */
    public f1 f28284e;

    /* renamed from: f, reason: collision with root package name */
    public a1.c f28285f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f28286g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f28287h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f28288i;

    /* renamed from: j, reason: collision with root package name */
    public u0.a f28289j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f28290k;

    /* renamed from: l, reason: collision with root package name */
    public a1.c f28291l;

    /* renamed from: m, reason: collision with root package name */
    public p1<r0> f28292m;

    /* renamed from: n, reason: collision with root package name */
    public e1 f28293n;

    /* renamed from: o, reason: collision with root package name */
    public Map<x2.a<b2>, e1> f28294o;

    /* renamed from: p, reason: collision with root package name */
    public f1.a0 f28295p;

    /* renamed from: q, reason: collision with root package name */
    public int f28296q;

    /* renamed from: r, reason: collision with root package name */
    public g0.k0 f28297r;

    /* renamed from: s, reason: collision with root package name */
    public g0.k0 f28298s;

    /* renamed from: t, reason: collision with root package name */
    public Range<Integer> f28299t;

    /* renamed from: u, reason: collision with root package name */
    public g0.l f28300u;

    /* renamed from: v, reason: collision with root package name */
    public y f28301v;

    /* renamed from: w, reason: collision with root package name */
    public y2 f28302w;

    /* renamed from: x, reason: collision with root package name */
    public a2.c f28303x;

    /* renamed from: y, reason: collision with root package name */
    public final b0 f28304y;

    /* renamed from: z, reason: collision with root package name */
    public final b0.b f28305z;

    public class a implements f1.j {
        @Override // g0.f1.j
        public void a(long j10, f1.k kVar) {
            kVar.a();
        }

        @Override // g0.f1.j
        public void clear() {
        }
    }

    public static class b implements r0.c<g0.n0> {
        public final PointF b;

        /* renamed from: c, reason: collision with root package name */
        public final android.view.d0<k0> f28307c;

        /* renamed from: a, reason: collision with root package name */
        public boolean f28306a = false;

        /* renamed from: d, reason: collision with root package name */
        public final Object f28308d = new Object();

        public b(PointF pointF, android.view.d0<k0> d0Var) {
            this.b = pointF;
            this.f28307c = d0Var;
        }

        public void a() {
            synchronized (this.f28308d) {
                this.f28306a = true;
            }
        }

        @Override // r0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(g0.n0 n0Var) {
            synchronized (this.f28308d) {
                try {
                    if (this.f28306a) {
                        return;
                    }
                    if (n0Var == null) {
                        return;
                    }
                    r1.a("CameraController", "Tap-to-focus onSuccess: " + n0Var.c());
                    this.f28307c.m(new k0(n0Var.c() ? 2 : 3, this.b));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f28308d) {
                try {
                    if (this.f28306a) {
                        return;
                    }
                    r1.a("CameraController", "Tap-to-focus reset.");
                    this.f28307c.m(new k0(0, null));
                    this.f28306a = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            synchronized (this.f28308d) {
                try {
                    if (this.f28306a) {
                        return;
                    }
                    if (!(th2 instanceof m.a)) {
                        r1.b("CameraController", "Tap-to-focus failed.", th2);
                        this.f28307c.m(new k0(4, this.b));
                    } else {
                        r1.b("CameraController", "Tap-to-focus canceled", th2);
                        this.f28307c.m(new k0(0, null));
                        a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Deprecated
    public static final class c {
    }

    public i(Context context) {
        this(context, r0.n.x(d1.k.e(context), new t.a() { // from class: p1.e
            @Override // t.a
            public final Object apply(Object obj) {
                return new z((d1.k) obj);
            }
        }, q0.c.b()));
    }

    public static /* synthetic */ Void a(i iVar, y yVar) {
        iVar.f28301v = yVar;
        iVar.P();
        iVar.L();
        return null;
    }

    public static /* synthetic */ void b(i iVar, int i10) {
        iVar.A = i10;
        iVar.f28290k.u0(i10);
        iVar.f28284e.R0(i10);
        iVar.f28292m.c1(i10);
    }

    public void A(float f10) {
        if (!t()) {
            r1.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.B) {
            r1.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        r1.a("CameraController", "Pinch to zoom with scale: " + f10);
        z2 f11 = s().f();
        if (f11 == null) {
            return;
        }
        I(Math.min(Math.max(f11.d() * J(f10), f11.c()), f11.a()));
    }

    public void B(v1 v1Var, float f10, float f11) {
        if (!t()) {
            r1.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.C) {
            r1.a("CameraController", "Tap to focus disabled. ");
            return;
        }
        PointF pointF = new PointF(f10, f11);
        g0.m0 f12 = f(v1Var, pointF);
        r1.a("CameraController", "Tap to focus started: " + f10 + ", " + f11);
        b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
        this.G.m(new k0(1, pointF));
        final b bVar2 = new b(pointF, this.G);
        this.D = bVar2;
        r0.n.j(this.f28300u.c().o(f12), bVar2, q0.c.b());
        long millis = TimeUnit.NANOSECONDS.toMillis(this.P);
        r1.a("CameraController", "Tap to focus auto cancel duration: " + millis + " ms");
        if (millis > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p1.d
                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.c();
                }
            }, millis);
        }
    }

    public final void C(u0.a aVar, u0.a aVar2) {
        if (Objects.equals(aVar == null ? null : aVar.c(), aVar2 != null ? aVar2.c() : null)) {
            return;
        }
        R(Integer.valueOf(this.f28290k.m0()), Integer.valueOf(this.f28290k.n0()), Integer.valueOf(this.f28290k.p0()));
        L();
    }

    public void D(Executor executor, u0.a aVar) {
        p0.z.b();
        u0.a aVar2 = this.f28289j;
        if (aVar2 == aVar && this.f28287h == executor) {
            return;
        }
        this.f28287h = executor;
        this.f28289j = aVar;
        this.f28290k.t0(executor, aVar);
        C(aVar2, aVar);
    }

    public void E(a1.c cVar) {
        p0.z.b();
        if (this.f28291l == cVar) {
            return;
        }
        this.f28291l = cVar;
        R(Integer.valueOf(this.f28290k.m0()), Integer.valueOf(this.f28290k.n0()), Integer.valueOf(this.f28290k.p0()));
        L();
    }

    public void F(int i10) {
        p0.z.b();
        if (i10 == 3) {
            Integer d10 = this.f28281a.d();
            if (d10 != null && d10.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            W();
        }
        this.f28284e.N0(i10);
    }

    public ne.x<Void> G(float f10) {
        p0.z.b();
        return !t() ? this.J.c(Float.valueOf(f10)) : this.f28300u.c().e(f10);
    }

    public void H(r1.a aVar) {
        r1.a p8 = p();
        this.O.put(aVar.a(), aVar);
        r1.a p10 = p();
        if (p10 == null || p10.equals(p8)) {
            return;
        }
        W();
    }

    public ne.x<Void> I(float f10) {
        p0.z.b();
        return !t() ? this.K.c(Float.valueOf(f10)) : this.f28300u.c().g(f10);
    }

    public final float J(float f10) {
        return f10 > 1.0f ? ((f10 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f10) * 2.0f);
    }

    public abstract g0.l K();

    public void L() {
        M(null);
    }

    public void M(Runnable runnable) {
        try {
            this.f28300u = K();
            if (!t()) {
                r1.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.E.r(this.f28300u.d().z());
            this.F.r(this.f28300u.d().p());
            this.I.b(new t.a() { // from class: p1.a
                @Override // t.a
                public final Object apply(Object obj) {
                    return i.this.l(((Boolean) obj).booleanValue());
                }
            });
            this.J.b(new t.a() { // from class: p1.b
                @Override // t.a
                public final Object apply(Object obj) {
                    return i.this.G(((Float) obj).floatValue());
                }
            });
            this.K.b(new t.a() { // from class: p1.c
                @Override // t.a
                public final Object apply(Object obj) {
                    return i.this.I(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e10) {
            if (runnable != null) {
                runnable.run();
            }
            throw e10;
        }
    }

    public final void N() {
        if (this.f28304y.a(q0.c.e(), this.f28305z)) {
            return;
        }
        r1.l("CameraController", "The device cannot detect rotation changes.");
    }

    public final void O() {
        this.f28304y.c(this.f28305z);
    }

    public final void P() {
        T();
        S(Integer.valueOf(n()));
        R(Integer.valueOf(this.f28290k.m0()), Integer.valueOf(this.f28290k.n0()), Integer.valueOf(this.f28290k.p0()));
        U();
    }

    public final void Q() {
        if (u()) {
            this.f28301v.c(this.f28282c, this.f28284e, this.f28290k, this.f28292m);
        }
    }

    public final void R(Integer num, Integer num2, Integer num3) {
        u0.a aVar;
        p0.z.b();
        if (u()) {
            this.f28301v.c(this.f28290k);
        }
        u0 g10 = g(num, num2, num3);
        this.f28290k = g10;
        Executor executor = this.f28287h;
        if (executor == null || (aVar = this.f28289j) == null) {
            return;
        }
        g10.t0(executor, aVar);
    }

    public final void S(Integer num) {
        if (u()) {
            this.f28301v.c(this.f28284e);
        }
        int w02 = this.f28284e.w0();
        this.f28284e = h(num);
        F(w02);
    }

    public final void T() {
        if (u()) {
            this.f28301v.c(this.f28282c);
        }
        a2 i10 = i();
        this.f28282c = i10;
        a2.c cVar = this.f28303x;
        if (cVar != null) {
            i10.q0(cVar);
        }
    }

    public final void U() {
        if (u()) {
            this.f28301v.c(this.f28292m);
        }
        this.f28292m = k();
    }

    public void V(Matrix matrix) {
        p0.z.b();
        u0.a aVar = this.f28289j;
        if (aVar != null && aVar.d() == 1) {
            this.f28289j.e(matrix);
        }
    }

    public void W() {
        r1.a p8 = p();
        if (p8 == null) {
            r1.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.f28284e.O0(Q);
            return;
        }
        this.f28284e.O0(p8.b());
        r1.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + p8.a().name());
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    public void c(a2.c cVar, y2 y2Var) {
        p0.z.b();
        if (this.f28303x != cVar) {
            this.f28303x = cVar;
            this.f28282c.q0(cVar);
        }
        boolean z10 = this.f28302w == null || r(y2Var) != r(this.f28302w);
        this.f28302w = y2Var;
        N();
        if (z10) {
            P();
        }
        L();
    }

    public void d() {
        p0.z.b();
        y yVar = this.f28301v;
        if (yVar != null) {
            yVar.c(this.f28282c, this.f28284e, this.f28290k, this.f28292m);
        }
        this.f28282c.q0(null);
        this.f28300u = null;
        this.f28303x = null;
        this.f28302w = null;
        O();
    }

    public final void e(i2.a<?> aVar, a1.c cVar, c cVar2) {
        a1.a r8;
        if (cVar != null) {
            aVar.b(cVar);
            return;
        }
        y2 y2Var = this.f28302w;
        if (y2Var == null || (r8 = r(y2Var)) == null) {
            return;
        }
        aVar.b(new c.a().d(r8).a());
    }

    public final g0.m0 f(v1 v1Var, PointF pointF) {
        m0.a a10 = new m0.a(v1Var.c(pointF.x, pointF.y, 0.16666667f), 1).a(v1Var.c(pointF.x, pointF.y, 0.25f), 2);
        long j10 = this.P;
        return (j10 > 0 ? a10.e(j10, TimeUnit.NANOSECONDS) : a10.c()).b();
    }

    @SuppressLint({"WrongConstant"})
    public final u0 g(Integer num, Integer num2, Integer num3) {
        u0.c cVar = new u0.c();
        if (num != null) {
            cVar.j(num.intValue());
        }
        if (num2 != null) {
            cVar.n(num2.intValue());
        }
        if (num3 != null) {
            cVar.o(num3.intValue());
        }
        e(cVar, this.f28291l, null);
        Executor executor = this.f28288i;
        if (executor != null) {
            cVar.i(executor);
        }
        int i10 = this.A;
        if (i10 != -1) {
            cVar.c(i10);
        }
        return cVar.f();
    }

    @SuppressLint({"WrongConstant"})
    public final f1 h(Integer num) {
        f1.b bVar = new f1.b();
        if (num != null) {
            bVar.i(num.intValue());
        }
        e(bVar, this.f28285f, null);
        Executor executor = this.f28286g;
        if (executor != null) {
            bVar.l(executor);
        }
        int i10 = this.A;
        if (i10 != -1) {
            bVar.c(i10);
        }
        return bVar.f();
    }

    public final a2 i() {
        a2.a aVar = new a2.a();
        e(aVar, this.f28283d, null);
        aVar.j(this.f28298s);
        return aVar.f();
    }

    public x2 j() {
        if (!u()) {
            r1.a("CameraController", "Camera not initialized.");
            return null;
        }
        if (!x()) {
            r1.a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        Q();
        x2.a b10 = new x2.a().b(this.f28282c);
        if (w()) {
            b10.b(this.f28284e);
        }
        if (v()) {
            b10.b(this.f28290k);
        }
        if (z()) {
            b10.b(this.f28292m);
        }
        b10.e(this.f28302w);
        Iterator<g0.n> it = this.L.iterator();
        while (it.hasNext()) {
            b10.a(it.next());
        }
        return b10.c();
    }

    @SuppressLint({"WrongConstant"})
    public final p1<r0> k() {
        int q10;
        r0.i f10 = new r0.i().f(this.f28295p);
        y2 y2Var = this.f28302w;
        if (y2Var != null && this.f28295p == r0.f16498s0 && (q10 = q(y2Var)) != -1) {
            f10.d(q10);
        }
        p1.d k10 = new p1.d(f10.c()).q(this.f28299t).l(this.f28296q).k(this.f28297r);
        int i10 = this.A;
        if (i10 != -1) {
            k10.c(i10);
        }
        return k10.f();
    }

    public ne.x<Void> l(boolean z10) {
        p0.z.b();
        return !t() ? this.I.c(Boolean.valueOf(z10)) : this.f28300u.c().c(z10);
    }

    public int m() {
        p0.z.b();
        return this.f28284e.w0();
    }

    public int n() {
        p0.z.b();
        return this.f28284e.v0();
    }

    public final String o(g0.v vVar) {
        if (vVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder("CameraSelector{");
        Integer d10 = vVar.d();
        if (d10 != null) {
            int intValue = d10.intValue();
            if (intValue == 0) {
                sb2.append("lensFacing=FRONT");
            } else if (intValue == 1) {
                sb2.append("lensFacing=BACK");
            } else if (intValue != 2) {
                sb2.append("lensFacing=UNKNOWN(");
                sb2.append(d10);
                sb2.append(")");
            } else {
                sb2.append("lensFacing=EXTERNAL");
            }
        } else {
            sb2.append("lensFacing=NOT_SPECIFIED");
        }
        sb2.append("}");
        return sb2.toString();
    }

    public r1.a p() {
        Map<a.EnumC0529a, r1.a> map = this.O;
        a.EnumC0529a enumC0529a = a.EnumC0529a.SCREEN_FLASH_VIEW;
        if (map.get(enumC0529a) != null) {
            return this.O.get(enumC0529a);
        }
        Map<a.EnumC0529a, r1.a> map2 = this.O;
        a.EnumC0529a enumC0529a2 = a.EnumC0529a.PREVIEW_VIEW;
        if (map2.get(enumC0529a2) != null) {
            return this.O.get(enumC0529a2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(g0.y2 r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            r1 = r0
            goto Ld
        L5:
            int r1 = r9.c()
            int r1 = p0.c.b(r1)
        Ld:
            r2 = 1
            p1.y r3 = r8.f28301v     // Catch: java.lang.IllegalArgumentException -> L27
            if (r3 == 0) goto L2a
            g0.v r4 = r8.f28281a     // Catch: java.lang.IllegalArgumentException -> L27
            g0.t r3 = r3.a(r4)     // Catch: java.lang.IllegalArgumentException -> L27
            int r4 = r3.d()     // Catch: java.lang.IllegalArgumentException -> L27
            int r3 = r3.i()     // Catch: java.lang.IllegalArgumentException -> L25
            if (r3 != r2) goto L23
            goto L48
        L23:
            r3 = r0
            goto L49
        L25:
            r3 = move-exception
            goto L2c
        L27:
            r3 = move-exception
            r4 = r0
            goto L2c
        L2a:
            r4 = r0
            goto L48
        L2c:
            g0.v r5 = r8.f28281a
            java.lang.String r5 = r8.o(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to retrieve CameraInfo for selector: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CameraController"
            g0.r1.m(r6, r5, r3)
        L48:
            r3 = r2
        L49:
            int r1 = p0.c.a(r1, r4, r3)
            android.util.Rational r9 = r9.a()
            r3 = 90
            if (r1 == r3) goto L59
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L67
        L59:
            android.util.Rational r1 = new android.util.Rational
            int r3 = r9.getDenominator()
            int r9 = r9.getNumerator()
            r1.<init>(r3, r9)
            r9 = r1
        L67:
            android.util.Rational r1 = p0.a.f28189a
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L70
            return r0
        L70:
            android.util.Rational r0 = p0.a.f28190c
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L79
            return r2
        L79:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.i.q(g0.y2):int");
    }

    public final a1.a r(y2 y2Var) {
        int q10 = q(y2Var);
        if (q10 != -1) {
            return new a1.a(q10, 1);
        }
        return null;
    }

    public android.view.a0<z2> s() {
        p0.z.b();
        return this.E;
    }

    public final boolean t() {
        return this.f28300u != null;
    }

    public final boolean u() {
        return this.f28301v != null;
    }

    public boolean v() {
        p0.z.b();
        return y(2);
    }

    public boolean w() {
        p0.z.b();
        return y(1);
    }

    public final boolean x() {
        return (this.f28303x == null || this.f28302w == null) ? false : true;
    }

    public final boolean y(int i10) {
        return (i10 & this.b) != 0;
    }

    public boolean z() {
        p0.z.b();
        return y(4);
    }

    public i(Context context, ne.x<y> xVar) {
        this.f28281a = g0.v.f17986d;
        this.b = 3;
        this.f28293n = null;
        this.f28294o = new HashMap();
        this.f28295p = r0.f16498s0;
        this.f28296q = 0;
        g0.k0 k0Var = g0.k0.f17921c;
        this.f28297r = k0Var;
        this.f28298s = k0Var;
        this.f28299t = t3.f25564a;
        this.A = -1;
        this.B = true;
        this.C = true;
        this.E = new k<>();
        this.F = new k<>();
        android.view.d0<k0> d0Var = new android.view.d0<>(new k0(0, null));
        this.G = d0Var;
        this.H = p0.m.a(d0Var, new t.a() { // from class: p1.f
            @Override // t.a
            public final Object apply(Object obj) {
                return Integer.valueOf(((k0) obj).getFocusState());
            }
        });
        this.I = new n<>();
        this.J = new n<>();
        this.K = new n<>();
        this.L = new HashSet();
        this.O = new HashMap();
        this.P = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context a10 = p0.f.a(context);
        this.M = a10;
        this.f28282c = i();
        this.f28284e = h(null);
        this.f28290k = g(null, null, null);
        this.f28292m = k();
        this.N = r0.n.x(xVar, new t.a() { // from class: p1.g
            @Override // t.a
            public final Object apply(Object obj) {
                return i.a(i.this, (y) obj);
            }
        }, q0.c.e());
        this.f28304y = new b0(a10);
        this.f28305z = new b0.b() { // from class: p1.h
            @Override // p1.b0.b
            public final void a(int i10) {
                i.b(i.this, i10);
            }
        };
    }
}
