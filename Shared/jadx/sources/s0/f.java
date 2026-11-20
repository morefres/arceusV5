package s0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import g0.a2;
import g0.f1;
import g0.i0;
import g0.k0;
import g0.r1;
import g0.t;
import g0.v2;
import g0.w2;
import g0.y2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.g2;
import n0.h0;
import n0.i4;
import n0.j4;
import n0.l0;
import n0.n1;
import n0.o3;
import n0.p0;
import n0.t3;
import n0.x2;
import x0.z0;

/* loaded from: classes.dex */
public final class f implements g0.l {

    /* renamed from: a, reason: collision with root package name */
    public final n0.f f30829a;
    public final n0.f b;

    /* renamed from: c, reason: collision with root package name */
    public final j4 f30830c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.s f30831d;

    /* renamed from: g, reason: collision with root package name */
    public final h0.a f30834g;

    /* renamed from: h, reason: collision with root package name */
    public y2 f30835h;

    /* renamed from: l, reason: collision with root package name */
    public final h0 f30839l;

    /* renamed from: p, reason: collision with root package name */
    public w2 f30843p;

    /* renamed from: q, reason: collision with root package name */
    public b1.g f30844q;

    /* renamed from: r, reason: collision with root package name */
    public final i0 f30845r;

    /* renamed from: s, reason: collision with root package name */
    public final i0 f30846s;

    /* renamed from: u, reason: collision with root package name */
    public final m f30848u;

    /* renamed from: e, reason: collision with root package name */
    public final List<w2> f30832e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<w2> f30833f = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public List<g0.n> f30836i = Collections.EMPTY_LIST;

    /* renamed from: j, reason: collision with root package name */
    public int f30837j = 0;

    /* renamed from: k, reason: collision with root package name */
    public Range<Integer> f30838k = t3.f25564a;

    /* renamed from: m, reason: collision with root package name */
    public final Object f30840m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f30841n = true;

    /* renamed from: o, reason: collision with root package name */
    public n1 f30842o = null;

    /* renamed from: t, reason: collision with root package name */
    public final v0.e f30847t = new v0.e();

    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public i4<?> f30849a;
        public i4<?> b;

        public b(i4<?> i4Var, i4<?> i4Var2) {
            this.f30849a = i4Var;
            this.b = i4Var2;
        }
    }

    public f(p0 p0Var, p0 p0Var2, n0.e eVar, n0.e eVar2, i0 i0Var, i0 i0Var2, h0.a aVar, m mVar, j4 j4Var) {
        this.f30839l = eVar.C();
        this.f30829a = new n0.f(p0Var, eVar);
        if (p0Var2 == null || eVar2 == null) {
            this.b = null;
        } else {
            this.b = new n0.f(p0Var2, eVar2);
        }
        this.f30845r = i0Var;
        this.f30846s = i0Var2;
        this.f30834g = aVar;
        this.f30830c = j4Var;
        this.f30831d = g0.s.b(eVar, eVar2);
        this.f30848u = mVar;
    }

    public static Matrix B(Rect rect, Size size) {
        x2.g.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static void D(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            it.next().Y(null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [n0.i4, n0.i4<?>] */
    public static i4<?> I(j4 j4Var, b1.g gVar) {
        i4<?> m10 = new a2.a().f().m(false, j4Var);
        if (m10 == null) {
            return null;
        }
        x2 l02 = x2.l0(m10);
        l02.m0(q.N);
        return gVar.D(l02).e();
    }

    private int K() {
        synchronized (this.f30840m) {
            try {
                return this.f30834g.e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Map<w2, b> L(Collection<w2> collection, j4 j4Var, j4 j4Var2, int i10, Range<Integer> range) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : collection) {
            hashMap.put(w2Var, new b(b1.g.A0(w2Var) ? I(j4Var, (b1.g) w2Var) : w2Var.m(false, j4Var), v(w2Var, w2Var.m(true, j4Var2), i10, range)));
        }
        return hashMap;
    }

    public static boolean Q(t3 t3Var, o3 o3Var) {
        n1 d10 = t3Var.d();
        n1 g10 = o3Var.g();
        Objects.requireNonNull(d10);
        if (d10.b().size() != o3Var.g().b().size()) {
            return true;
        }
        for (n1.a<?> aVar : d10.b()) {
            if (!g10.a(aVar) || !Objects.equals(g10.e(aVar), d10.e(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            if (a0(it.next().l().M())) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(Collection<w2> collection) {
        for (w2 w2Var : collection) {
            if (Z(w2Var)) {
                i4<?> l10 = w2Var.l();
                n1.a<?> aVar = g2.U;
                if (l10.a(aVar) && ((Integer) x2.g.g((Integer) l10.e(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean T(Collection<w2> collection) {
        for (w2 w2Var : collection) {
            if (Z(w2Var)) {
                i4<?> l10 = w2Var.l();
                n1.a<?> aVar = g2.U;
                if (l10.a(aVar) && ((Integer) x2.g.g((Integer) l10.e(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean U(Collection<w2> collection) {
        Iterator<w2> it = collection.iterator();
        while (it.hasNext()) {
            if (e0(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean W(Collection<w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w2 w2Var : collection) {
            if (b0(w2Var) || b1.g.A0(w2Var)) {
                z10 = true;
            } else if (Z(w2Var)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    public static boolean X(Collection<w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w2 w2Var : collection) {
            if (b0(w2Var) || b1.g.A0(w2Var)) {
                z11 = true;
            } else if (Z(w2Var)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    @SafeVarargs
    public static boolean Y(List<w2>... listArr) {
        boolean z10 = false;
        for (List<w2> list : listArr) {
            Iterator<w2> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().o() != null) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public static boolean Z(w2 w2Var) {
        return w2Var instanceof f1;
    }

    public static boolean a0(k0 k0Var) {
        return (k0Var.a() == 10) || (k0Var.b() != 1 && k0Var.b() != 0);
    }

    public static boolean b0(w2 w2Var) {
        return w2Var instanceof a2;
    }

    public static boolean d0(Collection<w2> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (w2 w2Var : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (w2Var.F(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    public static boolean e0(w2 w2Var) {
        if (w2Var != null) {
            if (w2Var.l().a(i4.G)) {
                return w2Var.l().X() == j4.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", w2Var + " UseCase does not have capture type.");
        }
        return false;
    }

    public static /* synthetic */ void f(v2 v2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        v2Var.w(surface, q0.c.b(), new x2.a() { // from class: s0.d
            @Override // x2.a
            public final void accept(Object obj) {
                f.m(surface, surfaceTexture, (v2.g) obj);
            }
        });
    }

    public static void g0(Map<w2, Set<i0.b>> map) {
        for (Map.Entry<w2, Set<i0.b>> entry : map.entrySet()) {
            entry.getKey().Y(entry.getValue());
        }
    }

    public static List<g0.n> j0(List<g0.n> list, Collection<w2> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (w2 w2Var : collection) {
            w2Var.X(null);
            for (g0.n nVar : list) {
                if (w2Var.F(nVar.g())) {
                    x2.g.j(w2Var.n() == null, w2Var + " already has effect" + w2Var.n());
                    w2Var.X(nVar);
                    arrayList.remove(nVar);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void m(Surface surface, SurfaceTexture surfaceTexture, v2.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void p0(List<g0.n> list, Collection<w2> collection, Collection<w2> collection2) {
        List<g0.n> j02 = j0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<g0.n> j03 = j0(j02, arrayList);
        if (j03.isEmpty()) {
            return;
        }
        r1.l("CameraUseCaseAdapter", "Unused effects: " + j03);
    }

    public static Map<w2, Set<i0.b>> u(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        HashMap hashMap = new HashMap();
        for (w2 w2Var : collection) {
            hashMap.put(w2Var, w2Var.o());
            w2Var.Y(resolvedFeatureGroup != null ? resolvedFeatureGroup.a() : null);
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n0.i4, n0.i4<?>] */
    public static i4<?> v(w2 w2Var, i4<?> i4Var, int i10, Range<Integer> range) {
        x2 l02 = i4Var != null ? x2.l0(i4Var) : x2.k0();
        l02.G(i4.B, Integer.valueOf(i10));
        if (!t3.f25564a.equals(range)) {
            l02.D(i4.C, n1.c.HIGH_PRIORITY_REQUIRED, range);
            l02.G(i4.D, Boolean.TRUE);
        }
        return w2Var.D(l02).e();
    }

    public static Collection<w2> z(Collection<w2> collection, w2 w2Var, b1.g gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (w2Var != null) {
            arrayList.add(w2Var);
        }
        if (gVar != null) {
            arrayList.add(gVar);
            arrayList.removeAll(gVar.s0());
        }
        return arrayList;
    }

    public final w2 A(Collection<w2> collection, b1.g gVar) {
        w2 w2Var;
        synchronized (this.f30840m) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.s0());
                }
                if (V()) {
                    if (X(arrayList)) {
                        w2Var = b0(this.f30843p) ? this.f30843p : F();
                    } else if (W(arrayList)) {
                        w2Var = Z(this.f30843p) ? this.f30843p : E();
                    }
                }
                w2Var = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w2Var;
    }

    public final void C(Collection<w2> collection) {
        if (P()) {
            if (R(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (S(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f30840m) {
            try {
                if (!this.f30836i.isEmpty() && (T(collection) || S(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    public final f1 E() {
        return new f1.b().s("ImageCapture-Extra").f();
    }

    public final a2 F() {
        a2 f10 = new a2.a().p("Preview-Extra").f();
        f10.q0(new a2.c() { // from class: s0.e
            @Override // g0.a2.c
            public final void a(v2 v2Var) {
                f.f(v2Var);
            }
        });
        return f10;
    }

    public final b1.g G(Collection<w2> collection, boolean z10) {
        synchronized (this.f30840m) {
            try {
                Set<w2> N = N(collection, z10);
                if (N.size() >= 2 || (P() && U(N))) {
                    b1.g gVar = this.f30844q;
                    if (gVar == null || !gVar.s0().equals(N)) {
                        if (!d0(N)) {
                            return null;
                        }
                        return new b1.g(this.f30829a, this.b, this.f30845r, this.f30846s, N, this.f30830c);
                    }
                    this.f30844q.F0(N);
                    b1.g gVar2 = this.f30844q;
                    Objects.requireNonNull(gVar2);
                    return gVar2;
                }
                return null;
            } finally {
            }
        }
    }

    public void H() {
        synchronized (this.f30840m) {
            try {
                if (this.f30841n) {
                    this.f30829a.j(new ArrayList(this.f30833f));
                    n0.f fVar = this.b;
                    if (fVar != null) {
                        fVar.j(new ArrayList(this.f30833f));
                    }
                    x();
                    this.f30841n = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g0.s J() {
        return this.f30831d;
    }

    public final int M(boolean z10) {
        int i10;
        synchronized (this.f30840m) {
            try {
                Iterator<g0.n> it = this.f30836i.iterator();
                g0.n nVar = null;
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    g0.n next = it.next();
                    if (z0.d(next.g()) > 1) {
                        x2.g.j(nVar == null, "Can only have one sharing effect.");
                        nVar = next;
                    }
                }
                if (nVar != null) {
                    i10 = nVar.g();
                }
                if (z10) {
                    i10 |= 3;
                }
            } finally {
            }
        }
        return i10;
    }

    public final Set<w2> N(Collection<w2> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int M = M(z10);
        for (w2 w2Var : collection) {
            x2.g.b(!b1.g.A0(w2Var), "Only support one level of sharing for now.");
            if (w2Var.F(M)) {
                hashSet.add(w2Var);
            }
        }
        return hashSet;
    }

    public List<w2> O() {
        ArrayList arrayList;
        synchronized (this.f30840m) {
            arrayList = new ArrayList(this.f30832e);
        }
        return arrayList;
    }

    public final boolean P() {
        boolean z10;
        synchronized (this.f30840m) {
            z10 = this.f30839l.w(null) != null;
        }
        return z10;
    }

    public final boolean V() {
        boolean z10;
        synchronized (this.f30840m) {
            z10 = true;
            if (this.f30839l.v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // g0.l
    public g0.m c() {
        return this.f30829a.c();
    }

    public final boolean c0() {
        return (P() || this.b != null || this.f30837j == 1) ? false : true;
    }

    @Override // g0.l
    public t d() {
        return this.f30829a.d();
    }

    public void f0(Collection<w2> collection) {
        synchronized (this.f30840m) {
            D(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30832e);
            linkedHashSet.removeAll(collection);
            s(y(linkedHashSet, this.b != null, false));
        }
    }

    public void h(boolean z10) {
        this.f30829a.h(z10);
    }

    public final void h0() {
        synchronized (this.f30840m) {
            try {
                if (this.f30842o != null) {
                    this.f30829a.e().l(this.f30842o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0(List<g0.n> list) {
        synchronized (this.f30840m) {
            this.f30836i = list;
        }
    }

    public void k0(Range<Integer> range) {
        synchronized (this.f30840m) {
            this.f30838k = range;
        }
    }

    public void l0(int i10) {
        synchronized (this.f30840m) {
            this.f30837j = i10;
        }
    }

    public void m0(y2 y2Var) {
        synchronized (this.f30840m) {
            this.f30835h = y2Var;
        }
    }

    public void n(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        r1.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f30840m) {
            try {
                t();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30832e);
                linkedHashSet.addAll(collection);
                Map<w2, Set<i0.b>> u8 = u(linkedHashSet, resolvedFeatureGroup);
                try {
                    s(y(linkedHashSet, this.b != null, false));
                } catch (IllegalArgumentException e10) {
                    g0(u8);
                    throw new a(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n0(Collection<w2> collection) {
        if (P() && U(collection)) {
            return true;
        }
        return this.f30847t.a(this.f30829a.k().e(), collection);
    }

    public CalculatedUseCaseInfo o0(Collection<w2> collection, ResolvedFeatureGroup resolvedFeatureGroup, boolean z10) {
        CalculatedUseCaseInfo y10;
        r1.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f30840m) {
            t();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f30832e);
            linkedHashSet.addAll(collection);
            Map<w2, Set<i0.b>> u8 = u(linkedHashSet, resolvedFeatureGroup);
            try {
                try {
                    y10 = y(linkedHashSet, this.b != null, z10);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } finally {
                g0(u8);
            }
        }
        return y10;
    }

    public final void q0(Map<w2, t3> map, Collection<w2> collection) {
        Map<w2, t3> map2;
        synchronized (this.f30840m) {
            try {
                if (this.f30835h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<w2, Rect> a10 = s.a(this.f30829a.k().h(), this.f30829a.k().i() == 0, this.f30835h.a(), this.f30829a.k().w(this.f30835h.c()), this.f30835h.d(), this.f30835h.b(), map2);
                    for (w2 w2Var : collection) {
                        w2Var.b0((Rect) x2.g.g(a10.get(w2Var)));
                    }
                }
                for (w2 w2Var2 : collection) {
                    w2Var2.Z(B(this.f30829a.k().h(), ((t3) x2.g.g(map2.get(w2Var2))).f()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(CalculatedUseCaseInfo calculatedUseCaseInfo) {
        q0(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b(), calculatedUseCaseInfo.b());
        p0(this.f30836i, calculatedUseCaseInfo.b(), calculatedUseCaseInfo.a());
        Iterator<w2> it = calculatedUseCaseInfo.d().iterator();
        while (it.hasNext()) {
            it.next().c0(this.f30829a);
        }
        this.f30829a.j(calculatedUseCaseInfo.d());
        if (this.b != null) {
            for (w2 w2Var : calculatedUseCaseInfo.d()) {
                n0.f fVar = this.b;
                Objects.requireNonNull(fVar);
                w2Var.c0(fVar);
            }
            n0.f fVar2 = this.b;
            Objects.requireNonNull(fVar2);
            fVar2.j(calculatedUseCaseInfo.d());
        }
        if (calculatedUseCaseInfo.d().isEmpty()) {
            for (w2 w2Var2 : calculatedUseCaseInfo.e()) {
                Map<w2, t3> b10 = calculatedUseCaseInfo.getPrimaryStreamSpecResult().b();
                if (b10.containsKey(w2Var2)) {
                    t3 t3Var = b10.get(w2Var2);
                    Objects.requireNonNull(t3Var);
                    n1 d10 = t3Var.d();
                    if (d10 != null && Q(t3Var, w2Var2.z())) {
                        w2Var2.f0(d10);
                        if (this.f30841n) {
                            this.f30829a.f(w2Var2);
                            n0.f fVar3 = this.b;
                            if (fVar3 != null) {
                                Objects.requireNonNull(fVar3);
                                fVar3.f(w2Var2);
                            }
                        }
                    }
                }
            }
        }
        for (w2 w2Var3 : calculatedUseCaseInfo.c()) {
            b bVar = calculatedUseCaseInfo.j().get(w2Var3);
            Objects.requireNonNull(bVar);
            n0.f fVar4 = this.b;
            if (fVar4 != null) {
                n0.f fVar5 = this.f30829a;
                Objects.requireNonNull(fVar4);
                w2Var3.d(fVar5, fVar4, bVar.f30849a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), ((StreamSpecQueryResult) x2.g.g(calculatedUseCaseInfo.getSecondaryStreamSpecResult())).b().get(w2Var3));
            } else {
                w2Var3.d(this.f30829a, null, bVar.f30849a, bVar.b);
                w2Var3.e0((t3) x2.g.g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().b().get(w2Var3)), null);
            }
        }
        if (this.f30841n) {
            this.f30829a.i(calculatedUseCaseInfo.c());
            n0.f fVar6 = this.b;
            if (fVar6 != null) {
                Objects.requireNonNull(fVar6);
                fVar6.i(calculatedUseCaseInfo.c());
            }
        }
        Iterator<w2> it2 = calculatedUseCaseInfo.c().iterator();
        while (it2.hasNext()) {
            it2.next().M();
        }
        this.f30832e.clear();
        this.f30832e.addAll(calculatedUseCaseInfo.a());
        this.f30833f.clear();
        this.f30833f.addAll(calculatedUseCaseInfo.b());
        this.f30843p = calculatedUseCaseInfo.getPlaceholderForExtensions();
        this.f30844q = calculatedUseCaseInfo.getStreamSharing();
    }

    public final void t() {
        this.f30829a.o(this.f30839l);
        n0.f fVar = this.b;
        if (fVar != null) {
            fVar.o(this.f30839l);
        }
    }

    public void w() {
        synchronized (this.f30840m) {
            try {
                if (!this.f30841n) {
                    if (!this.f30833f.isEmpty()) {
                        this.f30829a.o(this.f30839l);
                        n0.f fVar = this.b;
                        if (fVar != null) {
                            fVar.o(this.f30839l);
                        }
                    }
                    this.f30829a.i(this.f30833f);
                    n0.f fVar2 = this.b;
                    if (fVar2 != null) {
                        fVar2.i(this.f30833f);
                    }
                    h0();
                    Iterator<w2> it = this.f30833f.iterator();
                    while (it.hasNext()) {
                        it.next().M();
                    }
                    this.f30841n = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this.f30840m) {
            l0 e10 = this.f30829a.e();
            this.f30842o = e10.j();
            e10.n();
        }
    }

    public final CalculatedUseCaseInfo y(Collection<w2> collection, boolean z10, boolean z11) {
        StreamSpecQueryResult a10;
        StreamSpecQueryResult streamSpecQueryResult;
        boolean z12 = z11;
        C(collection);
        if (!z10 && n0(collection)) {
            return y(collection, true, z12);
        }
        b1.g G = G(collection, z10);
        w2 A = A(collection, G);
        Collection<w2> z13 = z(collection, A, G);
        ArrayList arrayList = new ArrayList(z13);
        arrayList.removeAll(this.f30833f);
        ArrayList arrayList2 = new ArrayList(z13);
        arrayList2.retainAll(this.f30833f);
        ArrayList arrayList3 = new ArrayList(this.f30833f);
        arrayList3.removeAll(z13);
        Map<w2, b> L = L(arrayList, this.f30839l.k(), this.f30830c, this.f30837j, this.f30838k);
        boolean Y = Y(arrayList, arrayList2);
        try {
            a10 = this.f30848u.a(K(), this.f30829a.k(), arrayList, arrayList2, this.f30839l, this.f30837j, this.f30838k, Y, z12);
        } catch (IllegalArgumentException e10) {
            e = e10;
        }
        try {
            if (this.b != null) {
                m mVar = this.f30848u;
                int K = K();
                n0.f fVar = this.b;
                Objects.requireNonNull(fVar);
                z12 = z11;
                streamSpecQueryResult = mVar.a(K, fVar.k(), arrayList, arrayList2, this.f30839l, this.f30837j, this.f30838k, Y, z12);
            } else {
                streamSpecQueryResult = null;
            }
            return new CalculatedUseCaseInfo(collection, z13, arrayList, arrayList2, arrayList3, G, A, L, a10, streamSpecQueryResult);
        } catch (IllegalArgumentException e11) {
            e = e11;
            z12 = z11;
            if (z10 || !c0()) {
                throw e;
            }
            return y(collection, true, z12);
        }
    }
}
