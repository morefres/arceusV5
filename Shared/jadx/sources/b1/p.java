package b1;

import b1.g;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n0.c2;
import n0.l0;
import n0.l1;
import ne.x;

/* loaded from: classes.dex */
public class p extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final g.a f3686c;

    public p(l0 l0Var, g.a aVar) {
        super(l0Var);
        this.f3686c = aVar;
    }

    @Override // n0.c2, n0.l0
    public x<List<Void>> f(final List<l1> list, int i10, int i11) {
        x2.g.b(list.size() == 1, "Only support one capture config.");
        final x<m0.m> m10 = m(i10, 1);
        return r0.n.k(Collections.singletonList(r0.d.c(m10).g(new r0.a() { // from class: b1.m
            @Override // r0.a
            public final x apply(Object obj) {
                x a10;
                a10 = ((m0.m) x.this.get()).a();
                return a10;
            }
        }, q0.c.b()).g(new r0.a() { // from class: b1.n
            @Override // r0.a
            public final x apply(Object obj) {
                x a10;
                a10 = r0.f3686c.a(r0.s((l1) r1.get(0)), p.this.t((l1) list.get(0)));
                return a10;
            }
        }, q0.c.b()).g(new r0.a() { // from class: b1.o
            @Override // r0.a
            public final x apply(Object obj) {
                x b;
                b = ((m0.m) x.this.get()).b();
                return b;
            }
        }, q0.c.b())));
    }

    public final int s(l1 l1Var) {
        Integer num = (Integer) l1Var.g().h(l1.f25432j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int t(l1 l1Var) {
        Integer num = (Integer) l1Var.g().h(l1.f25431i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
