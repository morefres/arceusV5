package n0;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import n0.n1;

/* loaded from: classes.dex */
public interface i2 extends l3 {

    /* renamed from: m, reason: collision with root package name */
    public static final n1.a<Integer> f25387m = n1.a.a("camerax.core.imageOutput.targetAspectRatio", g0.d.class);

    /* renamed from: n, reason: collision with root package name */
    public static final n1.a<Integer> f25388n;

    /* renamed from: o, reason: collision with root package name */
    public static final n1.a<Integer> f25389o;

    /* renamed from: p, reason: collision with root package name */
    public static final n1.a<Integer> f25390p;

    /* renamed from: q, reason: collision with root package name */
    public static final n1.a<Size> f25391q;

    /* renamed from: r, reason: collision with root package name */
    public static final n1.a<Size> f25392r;

    /* renamed from: s, reason: collision with root package name */
    public static final n1.a<Size> f25393s;

    /* renamed from: t, reason: collision with root package name */
    public static final n1.a<List<Pair<Integer, Size[]>>> f25394t;

    /* renamed from: u, reason: collision with root package name */
    public static final n1.a<a1.c> f25395u;

    /* renamed from: v, reason: collision with root package name */
    public static final n1.a<List<Size>> f25396v;

    public interface a<B> {
        B b(a1.c cVar);

        B c(int i10);

        B d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f25388n = n1.a.a("camerax.core.imageOutput.targetRotation", cls);
        f25389o = n1.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f25390p = n1.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f25391q = n1.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f25392r = n1.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f25393s = n1.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f25394t = n1.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f25395u = n1.a.a("camerax.core.imageOutput.resolutionSelector", a1.c.class);
        f25396v = n1.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void Y(i2 i2Var) {
        boolean A = i2Var.A();
        boolean z10 = i2Var.V(null) != null;
        if (A && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (i2Var.q(null) != null) {
            if (A || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default boolean A() {
        return a(f25387m);
    }

    default int C() {
        return ((Integer) e(f25387m)).intValue();
    }

    default int J(int i10) {
        return ((Integer) h(f25388n, Integer.valueOf(i10))).intValue();
    }

    default List<Size> N(List<Size> list) {
        List list2 = (List) h(f25396v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size R(Size size) {
        return (Size) h(f25392r, size);
    }

    default Size V(Size size) {
        return (Size) h(f25391q, size);
    }

    default int g0(int i10) {
        return ((Integer) h(f25390p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) h(f25393s, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f25394t, list);
    }

    default a1.c m() {
        return (a1.c) e(f25395u);
    }

    default a1.c q(a1.c cVar) {
        return (a1.c) h(f25395u, cVar);
    }

    default int t(int i10) {
        return ((Integer) h(f25389o, Integer.valueOf(i10))).intValue();
    }
}
