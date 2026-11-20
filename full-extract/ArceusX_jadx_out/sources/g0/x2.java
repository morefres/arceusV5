package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f18075a;
    public final List<w2> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<n> f18076c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final List<Integer> f18077d = Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: a, reason: collision with root package name */
        public y2 f18078a;
        public final List<w2> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List<n> f18079c = new ArrayList();

        public a a(n nVar) {
            this.f18079c.add(nVar);
            return this;
        }

        public a b(w2 w2Var) {
            this.b.add(w2Var);
            return this;
        }

        public x2 c() {
            x2.g.b(!this.b.isEmpty(), "UseCase must not be empty.");
            d();
            return new x2(this.f18078a, this.b, this.f18079c);
        }

        public final void d() {
            Iterator<n> it = this.f18079c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int g10 = it.next().g();
                x0.z0.a(f18077d, g10);
                int i11 = i10 & g10;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", x0.z0.b(i11)));
                }
                i10 |= g10;
            }
        }

        public a e(y2 y2Var) {
            this.f18078a = y2Var;
            return this;
        }
    }

    public x2(y2 y2Var, List<w2> list, List<n> list2) {
        this.f18075a = y2Var;
        this.b = list;
        this.f18076c = list2;
    }

    public List<n> a() {
        return this.f18076c;
    }

    public List<w2> b() {
        return this.b;
    }

    public y2 c() {
        return this.f18075a;
    }
}
