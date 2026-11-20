package n0;

import n0.n1;

/* loaded from: classes.dex */
public interface h2 extends l3 {

    /* renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f25373j;

    /* renamed from: k, reason: collision with root package name */
    public static final n1.a<Integer> f25374k;

    /* renamed from: l, reason: collision with root package name */
    public static final n1.a<g0.k0> f25375l;

    static {
        Class cls = Integer.TYPE;
        f25373j = n1.a.a("camerax.core.imageInput.inputFormat", cls);
        f25374k = n1.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f25375l = n1.a.a("camerax.core.imageInput.inputDynamicRange", g0.k0.class);
    }

    default g0.k0 M() {
        return (g0.k0) x2.g.g((g0.k0) h(f25375l, g0.k0.f17921c));
    }

    default boolean Q() {
        return a(f25375l);
    }

    default int Z() {
        return ((Integer) h(f25374k, 0)).intValue();
    }

    default int p() {
        return ((Integer) e(f25373j)).intValue();
    }
}
