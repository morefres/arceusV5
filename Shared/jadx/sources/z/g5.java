package z;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.FpsRangeFeature;
import kotlin.jvm.functions.Function0;
import n0.SurfaceConfig;
import n0.SurfaceStreamSpecQueryResult;
import n0.o3;
import n0.t3;

/* loaded from: classes.dex */
public final class g5 {
    public final r3 B;
    public final m4 C;
    public final j0.a D;

    /* renamed from: k, reason: collision with root package name */
    public final String f37175k;

    /* renamed from: l, reason: collision with root package name */
    public final g f37176l;

    /* renamed from: m, reason: collision with root package name */
    public final a0.c0 f37177m;

    /* renamed from: n, reason: collision with root package name */
    public final d0.f f37178n;

    /* renamed from: o, reason: collision with root package name */
    public final int f37179o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37180p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37181q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f37182r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f37183s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37184t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37185u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f37186v;

    /* renamed from: w, reason: collision with root package name */
    public n0.x3 f37187w;

    /* renamed from: y, reason: collision with root package name */
    public final q3 f37189y;

    /* renamed from: a, reason: collision with root package name */
    public final List<n0.v3> f37166a = new ArrayList();
    public final List<n0.v3> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List<n0.v3> f37167c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final List<n0.v3> f37168d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final List<n0.v3> f37169e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<n0.v3> f37170f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Map<d, List<n0.v3>> f37171g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final List<n0.v3> f37172h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final List<n0.v3> f37173i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final List<n0.v3> f37174j = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public List<Integer> f37188x = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final d0.x f37190z = new d0.x();
    public final d0.t A = new d0.t();

    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public static abstract class b {
        public static b f(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
            return new e(list, list2, i10, i11, i12);
        }

        public abstract List<Size> a();

        public abstract List<Size> b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    public enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    public static abstract class d {
        public static d j(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
            return new f(i10, z10, i11, z11, z12, z13, z14, z15, range, z16);
        }

        public abstract int a();

        public abstract int b();

        public abstract Range<Integer> c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean k();
    }

    public g5(Context context, String str, a0.p0 p0Var, g gVar, j0.a aVar) {
        this.f37180p = false;
        this.f37181q = false;
        this.f37184t = false;
        this.f37185u = false;
        String str2 = (String) x2.g.g(str);
        this.f37175k = str2;
        this.f37176l = (g) x2.g.g(gVar);
        this.f37178n = new d0.f();
        this.f37189y = q3.c(context);
        try {
            a0.c0 c10 = p0Var.c(str2);
            this.f37177m = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f37179o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f37180p = true;
                    } else if (i10 == 6) {
                        this.f37181q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f37184t = true;
                    } else if (i10 == 1) {
                        this.f37185u = true;
                    }
                }
            }
            r3 r3Var = new r3(this.f37177m);
            this.B = r3Var;
            this.C = new m4(this.f37177m);
            q();
            if (this.f37184t) {
                t();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f37182r = hasSystemFeature;
            if (hasSystemFeature) {
                l();
            }
            if (r3Var.d()) {
                k();
            }
            boolean h10 = c5.h(this.f37177m);
            this.f37183s = h10;
            if (h10) {
                p();
            }
            boolean a10 = y5.a(this.f37177m);
            this.f37186v = a10;
            if (a10) {
                o();
            }
            r();
            d();
            this.D = aVar;
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    public static Size[] D(StreamConfigurationMap streamConfigurationMap, int i10, Rational rational) {
        Size[] sizeArr;
        try {
            sizeArr = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        } catch (Throwable unused) {
            sizeArr = null;
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        if (rational == null) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (p0.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public static int E(Range<Integer> range, Range<Integer> range2) {
        x2.g.j((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    public static int F(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    public static int J(Map<n0.i4<?>, g0.k0> map) {
        Iterator<g0.k0> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public static List<Integer> R(List<n0.i4<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<n0.i4<?>> it = list.iterator();
        while (it.hasNext()) {
            int B = it.next().B(0);
            if (!arrayList2.contains(Integer.valueOf(B))) {
                arrayList2.add(Integer.valueOf(B));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int intValue = ((Integer) obj).intValue();
            for (n0.i4<?> i4Var : list) {
                if (intValue == i4Var.B(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(i4Var)));
                }
            }
        }
        return arrayList;
    }

    public static boolean S(int i10, Range<Integer> range, int i11) {
        return n0.t3.f25564a.equals(range) || i11 >= i10 || i11 >= range.getUpper().intValue();
    }

    public static boolean U(List<n0.g> list, Map<n0.i4<?>, List<Size>> map) {
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 4101) {
                return true;
            }
        }
        Iterator<n0.i4<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().p() == 4101) {
                return true;
            }
        }
        return false;
    }

    public static Range<Integer> f(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double F = F(range2.intersect(range));
        double F2 = F(range3.intersect(range));
        double F3 = F2 / F(range3);
        double F4 = F / F(range2);
        return (F2 <= F ? F2 != F ? F4 >= 0.5d || F3 <= F4 : F3 <= F4 && (F3 != F4 || range3.getLower().intValue() <= range2.getLower().intValue()) : F3 < 0.5d && F3 < F4) ? range2 : range3;
    }

    public final Size A(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10, Rational rational) {
        Size[] a10;
        Size[] D = D(streamConfigurationMap, i10, rational);
        if (D == null || D.length == 0) {
            return null;
        }
        p0.e eVar = new p0.e();
        Size size = (Size) Collections.max(Arrays.asList(D), eVar);
        Size size2 = w0.d.f33612a;
        if (z10 && (a10 = a.a(streamConfigurationMap, i10)) != null && a10.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(a10), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    public final int B(List<n0.g> list, boolean z10) {
        int i10 = Integer.MAX_VALUE;
        for (n0.g gVar : list) {
            i10 = O(i10, gVar.d(), gVar.g(), z10);
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<SurfaceConfig> C(d dVar, List<SurfaceConfig> list, Map<Integer, n0.g> map, Map<Integer, n0.i4<?>> map2) {
        if (!c5.n(dVar)) {
            return null;
        }
        Iterator<n0.v3> it = this.f37174j.iterator();
        while (it.hasNext()) {
            final List<SurfaceConfig> d10 = it.next().d(list);
            if (d10 != null) {
                boolean a10 = c5.a(map, map2, d10);
                gt.e0 e0Var = new gt.e0(new Function0() { // from class: z.e5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(c5.c(g5.this.f37177m, d10));
                        return valueOf;
                    }
                });
                if (a10 && ((Boolean) e0Var.getValue()).booleanValue()) {
                    return d10;
                }
            }
        }
        return null;
    }

    public final Size G() {
        try {
            Size H = H(Integer.parseInt(this.f37175k));
            if (H != null) {
                return H;
            }
        } catch (NumberFormatException unused) {
        }
        Size I = I();
        return I != null ? I : w0.d.f33614d;
    }

    public final Size H(int i10) {
        CamcorderProfile a10;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (this.f37176l.b(i10, i12) && (a10 = this.f37176l.a(i10, i12)) != null) {
                return new Size(a10.videoFrameWidth, a10.videoFrameHeight);
            }
        }
        return null;
    }

    public final Size I() {
        Size[] sizeArr;
        try {
            sizeArr = this.f37177m.e().h().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        Arrays.sort(sizeArr, new p0.e(true));
        for (Size size : sizeArr) {
            int width = size.getWidth();
            Size size2 = w0.d.f33616f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    public SurfaceStreamSpecQueryResult K(int i10, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean T;
        Range<Integer> N;
        X();
        boolean l10 = m4.l(list, map.keySet());
        Map<n0.i4<?>, List<Size>> d10 = l10 ? this.C.d(map) : map;
        ArrayList arrayList = new ArrayList(d10.keySet());
        List<Integer> R = R(arrayList);
        Map<n0.i4<?>, g0.k0> g10 = this.B.g(list, arrayList, R);
        g0.r1.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + g10);
        boolean U = U(list, d10);
        if (z13) {
            N = n0.t3.f25564a;
            T = false;
        } else {
            T = T(list, arrayList);
            N = N(list, arrayList, R, T);
        }
        Range<Integer> range = N;
        boolean z14 = T;
        g0.r1.a("SupportedSurfaceCombination", "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z10 + ", mIsPreviewStabilizationSupported = " + this.f37186v + ", isFeatureComboInvocation = " + z12);
        if (z10 && !this.f37186v && z12) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return Y(w(g10.values(), range, z10, U, z12), h(i10, z11, g10, z10, U, l10, z12, false, range, z14), list, d10, arrayList, R, g10, z13);
    }

    public final List<n0.v3> L(d dVar) {
        if (this.f37171g.containsKey(dVar)) {
            return this.f37171g.get(dVar);
        }
        List<n0.v3> arrayList = new ArrayList<>();
        if (dVar.k()) {
            if (this.f37170f.isEmpty()) {
                m();
            }
            arrayList.addAll(this.f37170f);
        } else if (dVar.i()) {
            if (this.f37173i.isEmpty()) {
                s();
            }
            if (dVar.a() == 0) {
                arrayList.addAll(this.f37173i);
            }
        } else if (dVar.f()) {
            if (this.f37169e.isEmpty()) {
                n();
            }
            arrayList.addAll(this.f37169e);
        } else if (dVar.b() == 8) {
            int a10 = dVar.a();
            if (a10 == 1) {
                arrayList = this.f37167c;
            } else if (a10 != 2) {
                arrayList.addAll(dVar.g() ? this.f37168d : this.f37166a);
            } else {
                arrayList.addAll(this.b);
                arrayList.addAll(this.f37166a);
            }
        } else if (dVar.b() == 10 && dVar.a() == 0) {
            arrayList.addAll(this.f37172h);
        }
        this.f37171g.put(dVar, arrayList);
        return arrayList;
    }

    public final Pair<List<SurfaceConfig>, Integer> M(d dVar, List<n0.g> list, List<Size> list2, List<n0.i4<?>> list3, List<Integer> list4, int i10, Map<Integer, n0.g> map, Map<Integer, n0.i4<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (n0.g gVar : list) {
            arrayList.add(gVar.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), gVar);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = list2.get(i11);
            n0.i4<?> i4Var = list3.get(list4.get(i11).intValue());
            int p8 = i4Var.p();
            arrayList.add(SurfaceConfig.l(p8, size, P(p8), dVar.a(), dVar.k() ? SurfaceConfig.c.f25629a : SurfaceConfig.c.b, i4Var.W()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), i4Var);
            }
            i10 = O(i10, i4Var.p(), size, dVar.f());
        }
        return new Pair<>(arrayList, Integer.valueOf(i10));
    }

    public final Range<Integer> N(List<n0.g> list, List<n0.i4<?>> list2, List<Integer> list3, boolean z10) {
        Range<Integer> range = n0.t3.f25564a;
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            range = Q(it.next().i(), range, z10);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            Range<Integer> z11 = list2.get(it2.next().intValue()).z(n0.t3.f25564a);
            Objects.requireNonNull(z11);
            range = Q(z11, range, z10);
        }
        return range;
    }

    public final int O(int i10, int i11, Size size, boolean z10) {
        return Math.min(i10, y(i11, size, z10));
    }

    public n0.x3 P(int i10) {
        if (!this.f37188x.contains(Integer.valueOf(i10))) {
            c0(this.f37187w.n(), w0.d.f33615e, i10);
            c0(this.f37187w.l(), w0.d.f33617g, i10);
            b0(this.f37187w.h(), i10, null);
            b0(this.f37187w.f(), i10, p0.a.f28189a);
            b0(this.f37187w.d(), i10, p0.a.f28190c);
            d0(this.f37187w.p(), i10);
            this.f37188x.add(Integer.valueOf(i10));
        }
        return this.f37187w;
    }

    public final Range<Integer> Q(Range<Integer> range, Range<Integer> range2, boolean z10) {
        Range<Integer> range3 = n0.t3.f25564a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z10) {
            x2.g.j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean T(List<n0.g> list, List<n0.i4<?>> list2) {
        Iterator<n0.g> it = list.iterator();
        Boolean bool = null;
        while (it.hasNext()) {
            bool = Boolean.valueOf(v(it.next().j(), bool));
        }
        Iterator<n0.i4<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            bool = Boolean.valueOf(v(it2.next().H(), bool));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean V(d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        p0.e eVar = new p0.e();
        for (n0.i4<?> i4Var : map.keySet()) {
            List<Size> list2 = map.get(i4Var);
            x2.g.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + i4Var + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int p8 = i4Var.p();
            arrayList.add(SurfaceConfig.l(p8, size, P(p8), dVar.a(), SurfaceConfig.c.b, i4Var.W()));
        }
        Map<SurfaceConfig, g0.k0> map2 = Collections.EMPTY_MAP;
        List<n0.i4<?>> list3 = Collections.EMPTY_LIST;
        return e(dVar, arrayList, map2, list3, list3);
    }

    public final void W(d dVar, Range<Integer> range, Size size, int i10, n0.u3 u3Var, boolean z10, Map<SurfaceConfig.b, Set<Integer>> map, List<Size> list) {
        SurfaceConfig.b configSize = SurfaceConfig.l(i10, size, P(i10), dVar.a(), dVar.k() ? SurfaceConfig.c.f25629a : SurfaceConfig.c.b, u3Var).getConfigSize();
        Range<Integer> range2 = n0.t3.f25564a;
        int y10 = (!range2.equals(range) || z10) ? y(i10, size, dVar.f()) : Integer.MAX_VALUE;
        if (dVar.e()) {
            if (configSize == SurfaceConfig.b.f25625q) {
                return;
            }
            if (!range2.equals(range) && y10 < range.getUpper().intValue()) {
                return;
            }
        }
        Set<Integer> set = map.get(configSize);
        if (set == null) {
            set = new HashSet<>();
            map.put(configSize, set);
        }
        if (set.contains(Integer.valueOf(y10))) {
            return;
        }
        list.add(size);
        set.add(Integer.valueOf(y10));
    }

    public final void X() {
        this.f37189y.g();
        if (this.f37187w == null) {
            r();
        } else {
            this.f37187w = n0.x3.a(this.f37187w.b(), this.f37187w.n(), this.f37189y.f(), this.f37187w.l(), this.f37187w.j(), this.f37187w.h(), this.f37187w.f(), this.f37187w.d(), this.f37187w.p());
        }
    }

    public final SurfaceStreamSpecQueryResult Y(c cVar, d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, List<n0.i4<?>> list2, List<Integer> list3, Map<n0.i4<?>, g0.k0> map2, boolean z10) {
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int ordinal = cVar.ordinal();
        if (ordinal == 1) {
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
        if (ordinal != 2) {
            return Z(dVar, list, map, list2, list3, map2, z10);
        }
        try {
            return Z(dVar, list, map, list2, list3, map2, z10);
        } catch (IllegalArgumentException e10) {
            g0.r1.b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e10);
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
    }

    public final SurfaceStreamSpecQueryResult Z(d dVar, List<n0.g> list, Map<n0.i4<?>, List<Size>> map, List<n0.i4<?>> list2, List<Integer> list3, Map<n0.i4<?>, g0.k0> map2, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        int i10;
        int i11;
        List<n0.g> list4 = list;
        List<n0.i4<?>> list5 = list2;
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.k() && !V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f37175k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map<n0.i4<?>, List<Size>> i12 = i(map, dVar, z10);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list3.iterator();
        while (it.hasNext()) {
            n0.i4<?> i4Var = list5.get(it.next().intValue());
            List<Size> list6 = i12.get(i4Var);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(c(list6, i4Var.p()));
        }
        List<List<Size>> j10 = dVar.f() ? this.C.j(arrayList) : u(arrayList);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        boolean d10 = c5.d(list4, list5);
        int B = B(list4, dVar.f());
        List<SurfaceConfig> list7 = null;
        if (!this.f37183s || d10) {
            hashMap = hashMap5;
            hashMap2 = hashMap6;
            i10 = B;
        } else {
            Iterator<List<Size>> it2 = j10.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    hashMap = hashMap5;
                    hashMap2 = hashMap6;
                    i10 = B;
                    break;
                }
                Pair<List<SurfaceConfig>, Integer> M = M(dVar, list4, it2.next(), list5, list3, B, hashMap5, hashMap6);
                hashMap = hashMap5;
                hashMap2 = hashMap6;
                i10 = B;
                list7 = C(dVar, (List) M.first, hashMap, hashMap2);
                if (list7 != null) {
                    break;
                }
                hashMap.clear();
                hashMap2.clear();
                list5 = list2;
                hashMap5 = hashMap;
                B = i10;
                list4 = list;
                hashMap6 = hashMap2;
            }
            g0.r1.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + list7);
        }
        List<SurfaceConfig> list8 = list7;
        HashMap hashMap7 = hashMap;
        HashMap hashMap8 = hashMap2;
        b j11 = j(dVar, list, list2, list3, j10, list8, map2, i10, z10);
        g0.r1.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + j11);
        List<Size> a10 = j11.a();
        int d11 = j11.d();
        List<Size> b10 = j11.b();
        int e10 = j11.e();
        int c10 = j11.c();
        if (a10 == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f37175k + " and Hardware level: " + this.f37179o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range<Integer> range = n0.t3.f25564a;
        if (range.equals(dVar.c())) {
            i11 = c10;
            if (dVar.f()) {
                range = x(m4.f37309f, d11, this.C.f(a10));
            }
        } else {
            Range<Integer>[] f10 = dVar.f() ? this.C.f(a10) : (Range[]) this.f37177m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> x10 = x(dVar.c(), d11, f10);
            if (dVar.e() || dVar.h()) {
                boolean equals = x10.equals(dVar.c());
                Range<Integer>[] rangeArr = f10;
                StringBuilder sb2 = new StringBuilder();
                i11 = c10;
                sb2.append("Target FPS range ");
                sb2.append(dVar.c());
                sb2.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb2.append(d11);
                sb2.append(". Calculated best FPS range for device: ");
                sb2.append(x10);
                sb2.append(". Device supported FPS ranges: ");
                sb2.append(Arrays.toString(rangeArr));
                x2.g.b(equals, sb2.toString());
            } else {
                i11 = c10;
            }
            range = x10;
        }
        Iterator<n0.i4<?>> it3 = list2.iterator();
        while (it3.hasNext()) {
            n0.i4<?> next = it3.next();
            Iterator<n0.i4<?>> it4 = it3;
            t3.a h10 = n0.t3.a(a10.get(list3.indexOf(Integer.valueOf(list2.indexOf(next))))).g(dVar.f() ? 1 : 0).b((g0.k0) x2.g.g(map2.get(next))).d(c5.e(next)).h(dVar.d());
            if (!n0.t3.f25564a.equals(range)) {
                h10.c(range);
            }
            hashMap4.put(next, h10.a());
            it3 = it4;
        }
        if (list8 != null && d11 == e10 && a10.size() == b10.size()) {
            int i13 = 0;
            while (true) {
                if (i13 < a10.size()) {
                    if (!a10.get(i13).equals(b10.get(i13))) {
                        break;
                    }
                    i13++;
                } else if (!c5.k(this.f37177m, list, hashMap4, hashMap3)) {
                    c5.l(hashMap4, hashMap3, hashMap7, hashMap8, list8);
                }
            }
        }
        return new SurfaceStreamSpecQueryResult(hashMap4, hashMap3, i11);
    }

    public SurfaceConfig a0(int i10, int i11, Size size, n0.u3 u3Var) {
        return SurfaceConfig.l(i11, size, P(i11), i10, SurfaceConfig.c.b, u3Var);
    }

    public final void b0(Map<Integer, Size> map, int i10, Rational rational) {
        Size A = A(this.f37177m.e().h(), i10, true, rational);
        if (A != null) {
            map.put(Integer.valueOf(i10), A);
        }
    }

    public List<Size> c(List<Size> list, int i10) {
        Rational rational;
        int a10 = this.f37190z.a(this.f37175k, this.f37177m);
        if (a10 == 0) {
            rational = p0.a.f28189a;
        } else if (a10 != 1) {
            rational = null;
            if (a10 == 2) {
                Size g10 = P(256).g(256);
                if (g10 != null) {
                    rational = new Rational(g10.getWidth(), g10.getHeight());
                }
            } else if (a10 != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + a10);
            }
        } else {
            rational = p0.a.f28190c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (p0.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.A.a(SurfaceConfig.f(i10), list);
    }

    public final void c0(Map<Integer, Size> map, Size size, int i10) {
        if (this.f37182r) {
            Size A = A(this.f37177m.e().h(), i10, false, null);
            Integer valueOf = Integer.valueOf(i10);
            if (A != null) {
                size = (Size) Collections.min(Arrays.asList(size, A), new p0.e());
            }
            map.put(valueOf, size);
        }
    }

    public final void d() {
    }

    public final void d0(Map<Integer, Size> map, int i10) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.f37184t) {
            return;
        }
        a0.c0 c0Var = this.f37177m;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0Var.a(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i10), A(streamConfigurationMap, i10, true, null));
    }

    public boolean e(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, g0.k0> map, List<n0.i4<?>> list2, List<Integer> list3) {
        Iterator<n0.v3> it = L(dVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = it.next().d(list) != null;
            if (z10) {
                break;
            }
        }
        if (!z10 || !dVar.k()) {
            return z10;
        }
        n0.o3 g10 = g(dVar, list, map, list2, list3);
        boolean b10 = this.D.b(g10);
        Iterator<n0.u1> it2 = g10.p().iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        return b10;
    }

    public final n0.o3 g(d dVar, List<SurfaceConfig> list, Map<SurfaceConfig, g0.k0> map, List<n0.i4<?>> list2, List<Integer> list3) {
        Range<Integer> c10 = dVar.c();
        o3.h hVar = new o3.h();
        for (int i10 = 0; i10 < list.size(); i10++) {
            SurfaceConfig surfaceConfig = list.get(i10);
            Size h10 = surfaceConfig.h(P(surfaceConfig.getImageFormat()));
            n0.i4<?> i4Var = list2.get(list3.get(i10).intValue());
            g0.k0 k0Var = map.get(surfaceConfig);
            Objects.requireNonNull(k0Var);
            o3.b a10 = j0.a.a(i4Var, h10, k0Var);
            a10.v(n0.t3.f25564a.equals(c10) ? FpsRangeFeature.f22182k : c10);
            if (dVar.g()) {
                a10.z(2);
            }
            hVar.b(a10.p());
            x2.g.j(hVar.g(), "Cannot create a combined SessionConfig for feature combo after adding " + i4Var + " with " + surfaceConfig + " due to [" + hVar.e() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.c();
    }

    public final d h(int i10, boolean z10, Map<n0.i4<?>, g0.k0> map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        int J = J(map);
        if (i10 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f37175k, n0.q0.a(i10)));
        }
        if (i10 != 0 && J == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f37175k, n0.q0.a(i10)));
        }
        if (i10 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f37175k, n0.q0.a(i10)));
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z13 && !this.C.m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z14 && range == n0.t3.f25564a && z15) {
            range = FpsRangeFeature.f22182k;
        }
        return d.j(i10, z10, J, z11, z12, z13, z14, z15, range, z16);
    }

    public Map<n0.i4<?>, List<Size>> i(Map<n0.i4<?>, List<Size>> map, d dVar, boolean z10) {
        HashMap hashMap = new HashMap();
        for (n0.i4<?> i4Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            List<Size> list = map.get(i4Var);
            Objects.requireNonNull(list);
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                W(dVar, dVar.c(), it.next(), i4Var.p(), i4Var.W(), z10, hashMap2, arrayList);
            }
            hashMap.put(i4Var, arrayList);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b j(final d dVar, List<n0.g> list, final List<n0.i4<?>> list2, final List<Integer> list3, List<List<Size>> list4, List<SurfaceConfig> list5, Map<n0.i4<?>, g0.k0> map, int i10, boolean z10) {
        d dVar2;
        Range<Integer> c10 = dVar.c();
        Iterator<List<Size>> it = list4.iterator();
        int i11 = Integer.MAX_VALUE;
        boolean z11 = false;
        int i12 = Integer.MAX_VALUE;
        boolean z12 = false;
        int i13 = Integer.MAX_VALUE;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (!it.hasNext()) {
                dVar2 = dVar;
                break;
            }
            List<Size> next = it.next();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Pair<List<SurfaceConfig>, Integer> M = M(dVar, list, next, list2, list3, i10, hashMap, hashMap2);
            final List<SurfaceConfig> list8 = (List) M.first;
            int intValue = ((Integer) M.second).intValue();
            boolean S = S(i10, c10, intValue);
            final HashMap hashMap3 = new HashMap();
            Iterator<List<Size>> it2 = it;
            int i14 = 0;
            while (i14 < list8.size()) {
                SurfaceConfig surfaceConfig = list8.get(i14);
                g0.k0 k0Var = g0.k0.f17921c;
                int i15 = i14;
                if (hashMap.containsKey(Integer.valueOf(i15))) {
                    n0.g gVar = hashMap.get(Integer.valueOf(i15));
                    Objects.requireNonNull(gVar);
                    k0Var = gVar.c();
                } else if (hashMap2.containsKey(Integer.valueOf(i15))) {
                    n0.i4<?> i4Var = hashMap2.get(Integer.valueOf(i15));
                    Objects.requireNonNull(i4Var);
                    k0Var = map.get(i4Var);
                    hashMap3.put(surfaceConfig, k0Var);
                    i14 = i15 + 1;
                }
                hashMap3.put(surfaceConfig, k0Var);
                i14 = i15 + 1;
            }
            gt.e0 e0Var = new gt.e0(new Function0() { // from class: z.f5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(g5.this.e(dVar, list8, hashMap3, list2, list3));
                    return valueOf;
                }
            });
            if (z10 && ((Boolean) e0Var.getValue()).booleanValue() && (i11 == Integer.MAX_VALUE || i11 < intValue)) {
                i11 = intValue;
            }
            if (!z11 && ((Boolean) e0Var.getValue()).booleanValue()) {
                if (i12 == Integer.MAX_VALUE || i12 < intValue) {
                    i12 = intValue;
                    list6 = next;
                }
                if (S) {
                    if (z12 && !z10) {
                        dVar2 = dVar;
                        i12 = intValue;
                        list6 = next;
                        break;
                    }
                    z11 = true;
                    i12 = intValue;
                    list6 = next;
                }
            }
            if (list5 != null && !z12) {
                dVar2 = dVar;
                if (C(dVar2, list8, hashMap, hashMap2) != null) {
                    if (i13 == Integer.MAX_VALUE || i13 < intValue) {
                        i13 = intValue;
                        list7 = next;
                    }
                    if (!S) {
                        continue;
                    } else {
                        if (z11 && !z10) {
                            i13 = intValue;
                            list7 = next;
                            break;
                        }
                        z12 = true;
                        i13 = intValue;
                        list7 = next;
                    }
                } else {
                    continue;
                }
            }
            it = it2;
        }
        return (!dVar2.e() || n0.t3.f25564a.equals(c10) || (i12 != Integer.MAX_VALUE && i12 >= c10.getUpper().intValue())) ? b.f(list6, list7, i12, i13, i11) : b.f(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final void k() {
        this.f37172h.addAll(i4.e());
    }

    public final void l() {
        this.f37167c.addAll(i4.g());
    }

    public final void m() {
        this.f37170f.addAll(i4.c());
    }

    public final void n() {
        if (this.C.m()) {
            this.f37169e.clear();
            Size i10 = this.C.i();
            if (i10 != null) {
                this.f37169e.addAll(i4.b(i10, P(34)));
            }
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f37168d.addAll(i4.l());
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f37174j.addAll(i4.n());
        }
    }

    public final void q() {
        this.f37166a.addAll(i4.d(this.f37179o, this.f37180p, this.f37181q));
        this.f37166a.addAll(this.f37178n.a(this.f37175k));
    }

    public final void r() {
        this.f37187w = n0.x3.a(w0.d.f33613c, new HashMap(), this.f37189y.f(), new HashMap(), G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final void s() {
        this.f37173i.addAll(i4.o());
    }

    public final void t() {
        this.b.addAll(i4.p());
    }

    public final List<List<Size>> u(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            i10 *= it.next().size();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new ArrayList());
        }
        int size = i10 / list.get(0).size();
        int i12 = i10;
        for (int i13 = 0; i13 < list.size(); i13++) {
            List<Size> list2 = list.get(i13);
            for (int i14 = 0; i14 < i10; i14++) {
                ((List) arrayList.get(i14)).add(list2.get((i14 % i12) / size));
            }
            if (i13 < list.size() - 1) {
                i12 = size;
                size /= list.get(i13 + 1).size();
            }
        }
        return arrayList;
    }

    public final boolean v(boolean z10, Boolean bool) {
        if (bool == null || bool.booleanValue() == z10) {
            return z10;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final c w(Collection<g0.k0> collection, Range<Integer> range, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? contains = collection.contains(g0.k0.f17924f);
        int i10 = contains;
        if (range != null) {
            i10 = contains;
            if (range.getUpper().intValue() == 60) {
                i10 = contains + 1;
            }
        }
        if (z10) {
            i10++;
        }
        if (z11) {
            i10++;
        }
        return i10 > 1 ? c.WITH_FEATURE_COMBO : i10 == 1 ? c.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : c.WITHOUT_FEATURE_COMBO;
    }

    public final Range<Integer> x(Range<Integer> range, int i10, Range<Integer>[] rangeArr) {
        Range<Integer> range2 = n0.t3.f25564a;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range<Integer> range3 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i10)), Integer.valueOf(Math.min(range.getUpper().intValue(), i10)));
        int i11 = 0;
        for (Range<Integer> range4 : rangeArr) {
            Objects.requireNonNull(range4);
            if (i10 >= range4.getLower().intValue()) {
                if (range2.equals(n0.t3.f25564a)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int F = F(range4.intersect(range3));
                    if (i11 == 0) {
                        i11 = F;
                    } else {
                        if (F >= i11) {
                            range2 = f(range3, range2, range4);
                            i11 = F(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i11 == 0) {
                        if (E(range4, range3) >= E(range2, range3)) {
                            if (E(range4, range3) == E(range2, range3)) {
                                if (range4.getLower().intValue() <= range2.getUpper().intValue() && F(range4) >= F(range2)) {
                                }
                            }
                        }
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    public final int y(int i10, Size size, boolean z10) {
        x2.g.i(!z10 || i10 == 34);
        return z10 ? this.C.h(size) : z(this.f37177m, i10, size);
    }

    public final int z(a0.c0 c0Var, int i10, Size size) {
        a0.u0 e10 = c0Var.e();
        Objects.requireNonNull(e10);
        long f10 = e10.f(i10, size);
        if (f10 > 0) {
            return (int) (1.0E9d / f10);
        }
        if (!this.f37185u) {
            return Integer.MAX_VALUE;
        }
        g0.r1.l("SupportedSurfaceCombination", "minFrameDuration: " + f10 + " is invalid for imageFormat = " + i10 + ", size = " + size);
        return 0;
    }
}
