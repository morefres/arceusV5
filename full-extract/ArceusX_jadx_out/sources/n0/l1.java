package n0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n0.n1;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n1.a<Integer> f25431i = n1.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f25432j = n1.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k, reason: collision with root package name */
    public static final n1.a<Range<Integer>> f25433k = n1.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a, reason: collision with root package name */
    public final List<u1> f25434a;
    public final n1 b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25435c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25436d;

    /* renamed from: e, reason: collision with root package name */
    public final List<u> f25437e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25438f;

    /* renamed from: g, reason: collision with root package name */
    public final z3 f25439g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f25440h;

    public interface b {
        void a(i4<?> i4Var, a aVar);
    }

    public l1(List<u1> list, n1 n1Var, int i10, boolean z10, List<u> list2, boolean z11, z3 z3Var, e0 e0Var) {
        this.f25434a = list;
        this.b = n1Var;
        this.f25435c = i10;
        this.f25437e = Collections.unmodifiableList(list2);
        this.f25438f = z11;
        this.f25439g = z3Var;
        this.f25440h = e0Var;
        this.f25436d = z10;
    }

    public static l1 b() {
        return new a().h();
    }

    public List<u> c() {
        return this.f25437e;
    }

    public e0 d() {
        return this.f25440h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.b.h(f25433k, t3.f25564a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object d10 = this.f25439g.d("CAPTURE_CONFIG_ID_KEY");
        if (d10 == null) {
            return -1;
        }
        return ((Integer) d10).intValue();
    }

    public n1 g() {
        return this.b;
    }

    public int h() {
        Integer num = (Integer) this.b.h(i4.H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<u1> i() {
        return Collections.unmodifiableList(this.f25434a);
    }

    public z3 j() {
        return this.f25439g;
    }

    public int k() {
        return this.f25435c;
    }

    public int l() {
        Integer num = (Integer) this.b.h(i4.I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f25436d;
    }

    public boolean n() {
        return this.f25438f;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Set<u1> f25441a;
        public w2 b;

        /* renamed from: c, reason: collision with root package name */
        public int f25442c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f25443d;

        /* renamed from: e, reason: collision with root package name */
        public List<u> f25444e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f25445f;

        /* renamed from: g, reason: collision with root package name */
        public z2 f25446g;

        /* renamed from: h, reason: collision with root package name */
        public e0 f25447h;

        public a() {
            this.f25441a = new HashSet();
            this.b = x2.k0();
            this.f25442c = -1;
            this.f25443d = false;
            this.f25444e = new ArrayList();
            this.f25445f = false;
            this.f25446g = z2.g();
        }

        public static a j(i4<?> i4Var) {
            b K = i4Var.K(null);
            if (K != null) {
                a aVar = new a();
                K.a(i4Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + i4Var.u(i4Var.toString()));
        }

        public static a k(l1 l1Var) {
            return new a(l1Var);
        }

        public void a(Collection<u> collection) {
            Iterator<u> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(z3 z3Var) {
            this.f25446g.f(z3Var);
        }

        public void c(u uVar) {
            if (this.f25444e.contains(uVar)) {
                return;
            }
            this.f25444e.add(uVar);
        }

        public <T> void d(n1.a<T> aVar, T t8) {
            this.b.G(aVar, t8);
        }

        public void e(n1 n1Var) {
            for (n1.a<?> aVar : n1Var.b()) {
                Object h10 = this.b.h(aVar, null);
                Object e10 = n1Var.e(aVar);
                if (h10 instanceof v2) {
                    ((v2) h10).a(((v2) e10).c());
                } else {
                    if (e10 instanceof v2) {
                        e10 = ((v2) e10).clone();
                    }
                    this.b.D(aVar, n1Var.g(aVar), e10);
                }
            }
        }

        public void f(u1 u1Var) {
            this.f25441a.add(u1Var);
        }

        public void g(String str, Object obj) {
            this.f25446g.i(str, obj);
        }

        public l1 h() {
            return new l1(new ArrayList(this.f25441a), c3.j0(this.b), this.f25442c, this.f25443d, new ArrayList(this.f25444e), this.f25445f, z3.c(this.f25446g), this.f25447h);
        }

        public void i() {
            this.f25441a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.b.h(l1.f25433k, t3.f25564a);
        }

        public Set<u1> m() {
            return this.f25441a;
        }

        public int n() {
            return this.f25442c;
        }

        public boolean o(u uVar) {
            return this.f25444e.remove(uVar);
        }

        public void p(e0 e0Var) {
            this.f25447h = e0Var;
        }

        public void q(Range<Integer> range) {
            d(l1.f25433k, range);
        }

        public void r(int i10) {
            this.f25446g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(n1 n1Var) {
            this.b = x2.l0(n1Var);
        }

        public void t(boolean z10) {
            this.f25443d = z10;
        }

        public void u(int i10) {
            if (i10 != 0) {
                d(i4.H, Integer.valueOf(i10));
            }
        }

        public void v(int i10) {
            this.f25442c = i10;
        }

        public void w(boolean z10) {
            this.f25445f = z10;
        }

        public void x(int i10) {
            if (i10 != 0) {
                d(i4.I, Integer.valueOf(i10));
            }
        }

        public a(l1 l1Var) {
            HashSet hashSet = new HashSet();
            this.f25441a = hashSet;
            this.b = x2.k0();
            this.f25442c = -1;
            this.f25443d = false;
            this.f25444e = new ArrayList();
            this.f25445f = false;
            this.f25446g = z2.g();
            hashSet.addAll(l1Var.f25434a);
            this.b = x2.l0(l1Var.b);
            this.f25442c = l1Var.f25435c;
            this.f25444e.addAll(l1Var.c());
            this.f25445f = l1Var.n();
            this.f25446g = z2.h(l1Var.j());
            this.f25443d = l1Var.f25436d;
        }
    }
}
