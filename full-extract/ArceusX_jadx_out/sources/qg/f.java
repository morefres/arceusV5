package qg;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f29810a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final mg.d f29811c;

    /* renamed from: d, reason: collision with root package name */
    public final pg.a f29812d;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29813a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[pg.b.values().length];
            b = iArr;
            try {
                iArr[pg.b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[pg.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[pg.b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[pg.b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[pg.b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f29813a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29813a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29813a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final pg.b f29814a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f29815c;

        /* renamed from: d, reason: collision with root package name */
        public final int f29816d;

        /* renamed from: e, reason: collision with root package name */
        public final b f29817e;

        /* renamed from: f, reason: collision with root package name */
        public final int f29818f;

        public /* synthetic */ b(f fVar, pg.b bVar, int i10, int i11, int i12, b bVar2, pg.c cVar, a aVar) {
            this(bVar, i10, i11, i12, bVar2, cVar);
        }

        public b(pg.b bVar, int i10, int i11, int i12, b bVar2, pg.c cVar) {
            this.f29814a = bVar;
            this.b = i10;
            pg.b bVar3 = pg.b.BYTE;
            int i13 = (bVar == bVar3 || bVar2 == null) ? i11 : bVar2.f29815c;
            this.f29815c = i13;
            this.f29816d = i12;
            this.f29817e = bVar2;
            boolean z10 = false;
            int i14 = bVar2 != null ? bVar2.f29818f : 0;
            if ((bVar == bVar3 && bVar2 == null && i13 != 0) || (bVar2 != null && i13 != bVar2.f29815c)) {
                z10 = true;
            }
            i14 = (bVar2 == null || bVar != bVar2.f29814a || z10) ? i14 + bVar.b(cVar) + 4 : i14;
            int i15 = a.b[bVar.ordinal()];
            if (i15 == 1) {
                i14 += 13;
            } else if (i15 == 2) {
                i14 += i12 == 1 ? 6 : 11;
            } else if (i15 == 3) {
                i14 += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i15 == 4) {
                i14 += f.this.f29811c.b(f.this.f29810a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    i14 += 12;
                }
            }
            this.f29818f = i14;
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f29820a = new ArrayList();
        public final pg.c b;

        public final class a {

            /* renamed from: a, reason: collision with root package name */
            public final pg.b f29822a;
            public final int b;

            /* renamed from: c, reason: collision with root package name */
            public final int f29823c;

            /* renamed from: d, reason: collision with root package name */
            public final int f29824d;

            public a(pg.b bVar, int i10, int i11, int i12) {
                this.f29822a = bVar;
                this.b = i10;
                this.f29823c = i11;
                this.f29824d = i12;
            }

            public final void d(mg.a aVar) {
                aVar.c(this.f29822a.a(), 4);
                if (this.f29824d > 0) {
                    aVar.c(e(), this.f29822a.b(c.this.b));
                }
                if (this.f29822a == pg.b.ECI) {
                    aVar.c(f.this.f29811c.d(this.f29823c), 8);
                } else if (this.f29824d > 0) {
                    String str = f.this.f29810a;
                    int i10 = this.b;
                    qg.c.c(str.substring(i10, this.f29824d + i10), this.f29822a, aVar, f.this.f29811c.c(this.f29823c));
                }
            }

            public final int e() {
                if (this.f29822a != pg.b.BYTE) {
                    return this.f29824d;
                }
                mg.d dVar = f.this.f29811c;
                String str = f.this.f29810a;
                int i10 = this.b;
                return dVar.b(str.substring(i10, this.f29824d + i10), this.f29823c).length;
            }

            public final int f(pg.c cVar) {
                int i10;
                int b = this.f29822a.b(cVar);
                int i11 = b + 4;
                int i12 = a.b[this.f29822a.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = this.f29824d;
                        return i11 + ((i13 / 2) * 11) + (i13 % 2 == 1 ? 6 : 0);
                    }
                    if (i12 == 3) {
                        int i14 = this.f29824d;
                        int i15 = i11 + ((i14 / 3) * 10);
                        int i16 = i14 % 3;
                        if (i16 == 1) {
                            r3 = 4;
                        } else if (i16 == 2) {
                            r3 = 7;
                        }
                        return i15 + r3;
                    }
                    if (i12 != 4) {
                        return i12 != 5 ? i11 : b + 12;
                    }
                    i10 = e() * 8;
                } else {
                    i10 = this.f29824d * 13;
                }
                return i11 + i10;
            }

            public final String g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (str.charAt(i10) < ' ' || str.charAt(i10) > '~') {
                        sb2.append('.');
                    } else {
                        sb2.append(str.charAt(i10));
                    }
                }
                return sb2.toString();
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f29822a);
                sb2.append('(');
                if (this.f29822a == pg.b.ECI) {
                    sb2.append(f.this.f29811c.c(this.f29823c).displayName());
                } else {
                    String str = f.this.f29810a;
                    int i10 = this.b;
                    sb2.append(g(str.substring(i10, this.f29824d + i10)));
                }
                sb2.append(')');
                return sb2.toString();
            }
        }

        public c(pg.c cVar, b bVar) {
            int i10;
            int i11;
            int i12;
            b bVar2 = bVar;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (bVar2 == null) {
                    break;
                }
                int i15 = i13 + bVar2.f29816d;
                b bVar3 = bVar2.f29817e;
                boolean z10 = (bVar2.f29814a == pg.b.BYTE && bVar3 == null && bVar2.f29815c != 0) || !(bVar3 == null || bVar2.f29815c == bVar3.f29815c);
                i10 = z10 ? 1 : i14;
                if (bVar3 == null || bVar3.f29814a != bVar2.f29814a || z10) {
                    this.f29820a.add(0, new a(bVar2.f29814a, bVar2.b, bVar2.f29815c, i15));
                    i12 = 0;
                } else {
                    i12 = i15;
                }
                if (z10) {
                    this.f29820a.add(0, new a(pg.b.ECI, bVar2.b, bVar2.f29815c, 0));
                }
                i14 = i10;
                bVar2 = bVar3;
                i13 = i12;
            }
            if (f.this.b) {
                a aVar = this.f29820a.get(0);
                if (aVar != null) {
                    pg.b bVar4 = aVar.f29822a;
                    int i16 = i14;
                    pg.b bVar5 = pg.b.ECI;
                    if (bVar4 != bVar5 && i16 != 0) {
                        this.f29820a.add(0, new a(bVar5, 0, 0, 0));
                    }
                }
                this.f29820a.add(this.f29820a.get(0).f29822a == pg.b.ECI ? 1 : 0, new a(pg.b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int f10 = cVar.f();
            int i17 = a.f29813a[f.m(cVar).ordinal()];
            if (i17 == 1) {
                i11 = 9;
            } else if (i17 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int d10 = d(cVar);
            while (f10 < i11 && !qg.c.v(d10, pg.c.e(f10), f.this.f29812d)) {
                f10++;
            }
            while (f10 > i10 && qg.c.v(d10, pg.c.e(f10 - 1), f.this.f29812d)) {
                f10--;
            }
            this.b = pg.c.e(f10);
        }

        public void b(mg.a aVar) {
            Iterator<a> it = this.f29820a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        public int c() {
            return d(this.b);
        }

        public final int d(pg.c cVar) {
            Iterator<a> it = this.f29820a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().f(cVar);
            }
            return i10;
        }

        public pg.c e() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f29820a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    public enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");


        /* renamed from: a, reason: collision with root package name */
        public final String f29829a;

        d(String str) {
            this.f29829a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f29829a;
        }
    }

    public f(String str, Charset charset, boolean z10, pg.a aVar) {
        this.f29810a = str;
        this.b = z10;
        this.f29811c = new mg.d(str, charset, -1);
        this.f29812d = aVar;
    }

    public static c h(String str, pg.c cVar, Charset charset, boolean z10, pg.a aVar) {
        return new f(str, charset, z10, aVar).i(cVar);
    }

    public static int k(pg.b bVar) {
        int i10;
        if (bVar == null || (i10 = a.b[bVar.ordinal()]) == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + bVar);
    }

    public static pg.c l(d dVar) {
        int i10 = a.f29813a[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? pg.c.e(40) : pg.c.e(26) : pg.c.e(9);
    }

    public static d m(pg.c cVar) {
        return cVar.f() <= 9 ? d.SMALL : cVar.f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    public static boolean n(char c10) {
        return qg.c.p(c10) != -1;
    }

    public static boolean o(char c10) {
        return qg.c.s(String.valueOf(c10));
    }

    public static boolean p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public void e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f29816d][bVar.f29815c];
        int k10 = k(bVar.f29814a);
        b bVar2 = bVarArr2[k10];
        if (bVar2 == null || bVar2.f29818f > bVar.f29818f) {
            bVarArr2[k10] = bVar;
        }
    }

    public void f(pg.c cVar, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int f10 = this.f29811c.f();
        int e10 = this.f29811c.e();
        if (e10 < 0 || !this.f29811c.a(this.f29810a.charAt(i10), e10)) {
            e10 = 0;
        } else {
            f10 = e10 + 1;
        }
        int i12 = f10;
        for (int i13 = e10; i13 < i12; i13++) {
            if (this.f29811c.a(this.f29810a.charAt(i10), i13)) {
                e(bVarArr, i10, new b(this, pg.b.BYTE, i10, i13, 1, bVar, cVar, null));
            }
        }
        pg.b bVar2 = pg.b.KANJI;
        if (g(bVar2, this.f29810a.charAt(i10))) {
            e(bVarArr, i10, new b(this, bVar2, i10, 0, 1, bVar, cVar, null));
        }
        int length = this.f29810a.length();
        pg.b bVar3 = pg.b.ALPHANUMERIC;
        int i14 = 2;
        if (g(bVar3, this.f29810a.charAt(i10))) {
            int i15 = i10 + 1;
            e(bVarArr, i10, new b(this, bVar3, i10, 0, (i15 >= length || !g(bVar3, this.f29810a.charAt(i15))) ? 1 : 2, bVar, cVar, null));
        }
        pg.b bVar4 = pg.b.NUMERIC;
        if (g(bVar4, this.f29810a.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length || !g(bVar4, this.f29810a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                if (i17 < length && g(bVar4, this.f29810a.charAt(i17))) {
                    i14 = 3;
                }
                i11 = i14;
            }
            e(bVarArr, i10, new b(this, bVar4, i10, 0, i11, bVar, cVar, null));
        }
    }

    public boolean g(pg.b bVar, char c10) {
        int i10 = a.b[bVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 : p(c10) : n(c10) : o(c10);
    }

    public c i(pg.c cVar) {
        if (cVar != null) {
            c j10 = j(cVar);
            if (qg.c.v(j10.c(), l(m(j10.e())), this.f29812d)) {
                return j10;
            }
            throw new lg.c("Data too big for version" + cVar);
        }
        pg.c[] cVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr2 = {j(cVarArr[0]), j(cVarArr[1]), j(cVarArr[2])};
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int c10 = cVarArr2[i12].c();
            if (qg.c.v(c10, cVarArr[i12], this.f29812d) && c10 < i10) {
                i11 = i12;
                i10 = c10;
            }
        }
        if (i11 >= 0) {
            return cVarArr2[i11];
        }
        throw new lg.c("Data too big for any version");
    }

    public c j(pg.c cVar) {
        int length = this.f29810a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f29811c.f(), 4);
        f(cVar, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f29811c.f(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        f(cVar, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f29811c.f(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f29818f < i14) {
                    i14 = bVar2.f29818f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(cVar, bVarArr[length][i13][i15]);
        }
        throw new lg.c("Internal error: failed to encode \"" + this.f29810a + "\"");
    }
}
