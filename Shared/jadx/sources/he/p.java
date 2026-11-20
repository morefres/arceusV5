package he;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final he.d f19361a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final e f19362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19363d;

    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ he.d f19364a;

        /* renamed from: he.p$a$a, reason: collision with other inner class name */
        public class C0345a extends d {
            public C0345a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // he.p.d
            public int g(int i10) {
                return i10 + 1;
            }

            @Override // he.p.d
            public int h(int i10) {
                return a.this.f19364a.b(this.f19369c, i10);
            }
        }

        public a(he.d dVar) {
            this.f19364a = dVar;
        }

        @Override // he.p.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new C0345a(pVar, charSequence);
        }
    }

    public class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f19366a;

        public class a extends d {
            public a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // he.p.d
            public int g(int i10) {
                return i10;
            }

            @Override // he.p.d
            public int h(int i10) {
                int i11 = i10 + b.this.f19366a;
                if (i11 < this.f19369c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        public b(int i10) {
            this.f19366a = i10;
        }

        @Override // he.p.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new a(pVar, charSequence);
        }
    }

    public class c implements Iterable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f19368a;

        public c(CharSequence charSequence) {
            this.f19368a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return p.this.i(this.f19368a);
        }

        public String toString() {
            g d10 = g.d(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder b = d10.b(sb2, this);
            b.append(']');
            return b.toString();
        }
    }

    public static abstract class d extends he.b<String> {

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f19369c;

        /* renamed from: d, reason: collision with root package name */
        public final he.d f19370d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f19371e;

        /* renamed from: f, reason: collision with root package name */
        public int f19372f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f19373g;

        public d(p pVar, CharSequence charSequence) {
            this.f19370d = pVar.f19361a;
            this.f19371e = pVar.b;
            this.f19373g = pVar.f19363d;
            this.f19369c = charSequence;
        }

        @Override // he.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int h10;
            int i10 = this.f19372f;
            while (true) {
                int i11 = this.f19372f;
                if (i11 == -1) {
                    return d();
                }
                h10 = h(i11);
                if (h10 == -1) {
                    h10 = this.f19369c.length();
                    this.f19372f = -1;
                } else {
                    this.f19372f = g(h10);
                }
                int i12 = this.f19372f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f19372f = i13;
                    if (i13 > this.f19369c.length()) {
                        this.f19372f = -1;
                    }
                } else {
                    while (i10 < h10 && this.f19370d.d(this.f19369c.charAt(i10))) {
                        i10++;
                    }
                    while (h10 > i10 && this.f19370d.d(this.f19369c.charAt(h10 - 1))) {
                        h10--;
                    }
                    if (!this.f19371e || i10 != h10) {
                        break;
                    }
                    i10 = this.f19372f;
                }
            }
            int i14 = this.f19373g;
            if (i14 == 1) {
                h10 = this.f19369c.length();
                this.f19372f = -1;
                while (h10 > i10 && this.f19370d.d(this.f19369c.charAt(h10 - 1))) {
                    h10--;
                }
            } else {
                this.f19373g = i14 - 1;
            }
            return this.f19369c.subSequence(i10, h10).toString();
        }

        public abstract int g(int i10);

        public abstract int h(int i10);
    }

    public interface e {
        Iterator<String> a(p pVar, CharSequence charSequence);
    }

    public p(e eVar) {
        this(eVar, false, he.d.e(), Integer.MAX_VALUE);
    }

    public static p e(int i10) {
        n.e(i10 > 0, "The length may not be less than 1");
        return new p(new b(i10));
    }

    public static p f(char c10) {
        return g(he.d.c(c10));
    }

    public static p g(he.d dVar) {
        n.l(dVar);
        return new p(new a(dVar));
    }

    public Iterable<String> h(CharSequence charSequence) {
        n.l(charSequence);
        return new c(charSequence);
    }

    public final Iterator<String> i(CharSequence charSequence) {
        return this.f19362c.a(this, charSequence);
    }

    public p(e eVar, boolean z10, he.d dVar, int i10) {
        this.f19362c = eVar;
        this.b = z10;
        this.f19361a = dVar;
        this.f19363d = i10;
    }
}
