package n0;

import java.util.List;
import n0.n1;

/* loaded from: classes.dex */
public interface h0 extends l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1.a<j4> f25365a = n1.a.a("camerax.core.camera.useCaseConfigFactory", j4.class);
    public static final n1.a<e2> b = n1.a.a("camerax.core.camera.compatibilityId", e2.class);

    /* renamed from: c, reason: collision with root package name */
    public static final n1.a<Integer> f25366c = n1.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* renamed from: d, reason: collision with root package name */
    public static final n1.a<q3> f25367d = n1.a.a("camerax.core.camera.SessionProcessor", q3.class);

    /* renamed from: e, reason: collision with root package name */
    public static final n1.a<Boolean> f25368e = n1.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* renamed from: f, reason: collision with root package name */
    public static final n1.a<Boolean> f25369f = n1.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* renamed from: g, reason: collision with root package name */
    public static final n1.a<a> f25370g = n1.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* renamed from: h, reason: collision with root package name */
    public static final n1.a<Boolean> f25371h = n1.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* renamed from: i, reason: collision with root package name */
    public static final a f25372i = new a() { // from class: n0.g0
        @Override // n0.h0.a
        public final int a(int i10, List list) {
            return h0.O(i10, list);
        }
    };

    public interface a {
        int a(int i10, List<Integer> list);
    }

    static /* synthetic */ int O(int i10, List list) {
        if (list.contains(35)) {
            return 35;
        }
        if (list.contains(256)) {
            return 256;
        }
        return list.contains(4101) ? 4101 : 0;
    }

    default a I() {
        return (a) h(f25370g, f25372i);
    }

    default boolean U() {
        return ((Boolean) h(f25369f, Boolean.FALSE)).booleanValue();
    }

    e2 b0();

    default boolean c0() {
        return ((Boolean) h(f25371h, Boolean.FALSE)).booleanValue();
    }

    default j4 k() {
        return (j4) h(f25365a, j4.f25410a);
    }

    default int v() {
        return ((Integer) h(f25366c, 0)).intValue();
    }

    default q3 w(q3 q3Var) {
        return (q3) h(f25367d, q3Var);
    }
}
