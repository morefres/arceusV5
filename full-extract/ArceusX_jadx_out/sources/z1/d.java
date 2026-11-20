package z1;

import c2.d;
import java.util.Arrays;
import java.util.HashMap;
import z1.i;

/* loaded from: classes.dex */
public class d {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f37676s = false;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f37677t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f37678u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f37679v = true;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f37680w;

    /* renamed from: x, reason: collision with root package name */
    public static long f37681x;

    /* renamed from: y, reason: collision with root package name */
    public static long f37682y;

    /* renamed from: e, reason: collision with root package name */
    public a f37686e;

    /* renamed from: o, reason: collision with root package name */
    public final c f37696o;

    /* renamed from: r, reason: collision with root package name */
    public a f37699r;

    /* renamed from: a, reason: collision with root package name */
    public int f37683a = 1000;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f37684c = 0;

    /* renamed from: d, reason: collision with root package name */
    public HashMap<String, i> f37685d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f37687f = 32;

    /* renamed from: g, reason: collision with root package name */
    public int f37688g = 32;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37690i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37691j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f37692k = new boolean[32];

    /* renamed from: l, reason: collision with root package name */
    public int f37693l = 1;

    /* renamed from: m, reason: collision with root package name */
    public int f37694m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f37695n = 32;

    /* renamed from: p, reason: collision with root package name */
    public i[] f37697p = new i[1000];

    /* renamed from: q, reason: collision with root package name */
    public int f37698q = 0;

    /* renamed from: h, reason: collision with root package name */
    public z1.b[] f37689h = new z1.b[32];

    public interface a {
        i a(d dVar, boolean[] zArr);

        void b(i iVar);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    public static class b extends z1.b {
        public b(c cVar) {
            this.f37671e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f37696o = cVar;
        this.f37686e = new h(cVar);
        if (f37680w) {
            this.f37699r = new b(cVar);
        } else {
            this.f37699r = new z1.b(cVar);
        }
    }

    public static z1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    public static e x() {
        return null;
    }

    public void A() {
        if (this.f37686e.isEmpty()) {
            n();
            return;
        }
        if (!this.f37690i && !this.f37691j) {
            B(this.f37686e);
            return;
        }
        for (int i10 = 0; i10 < this.f37694m; i10++) {
            if (!this.f37689h[i10].f37672f) {
                B(this.f37686e);
                return;
            }
        }
        n();
    }

    public void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public final int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f37693l; i10++) {
            this.f37692k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f37693l * 2) {
                if (aVar.getKey() != null) {
                    this.f37692k[aVar.getKey().f37712c] = true;
                }
                i a10 = aVar.a(this, this.f37692k);
                if (a10 != null) {
                    boolean[] zArr = this.f37692k;
                    int i12 = a10.f37712c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (a10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f37694m; i14++) {
                        z1.b bVar = this.f37689h[i14];
                        if (bVar.f37668a.f37719j != i.a.UNRESTRICTED && !bVar.f37672f && bVar.t(a10)) {
                            float a11 = bVar.f37671e.a(a10);
                            if (a11 < 0.0f) {
                                float f11 = (-bVar.b) / a11;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        z1.b bVar2 = this.f37689h[i13];
                        bVar2.f37668a.f37713d = -1;
                        bVar2.x(a10);
                        i iVar = bVar2.f37668a;
                        iVar.f37713d = i13;
                        iVar.l(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void D() {
        int i10 = 0;
        if (f37680w) {
            while (i10 < this.f37694m) {
                z1.b bVar = this.f37689h[i10];
                if (bVar != null) {
                    this.f37696o.f37673a.a(bVar);
                }
                this.f37689h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f37694m) {
            z1.b bVar2 = this.f37689h[i10];
            if (bVar2 != null) {
                this.f37696o.b.a(bVar2);
            }
            this.f37689h[i10] = null;
            i10++;
        }
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f37696o;
            i[] iVarArr = cVar.f37675d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f37674c.c(this.f37697p, this.f37698q);
        this.f37698q = 0;
        Arrays.fill(this.f37696o.f37675d, (Object) null);
        HashMap<String, i> hashMap = this.f37685d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f37684c = 0;
        this.f37686e.clear();
        this.f37693l = 1;
        for (int i11 = 0; i11 < this.f37694m; i11++) {
            z1.b bVar = this.f37689h[i11];
            if (bVar != null) {
                bVar.f37669c = false;
            }
        }
        D();
        this.f37694m = 0;
        if (f37680w) {
            this.f37699r = new b(this.f37696o);
        } else {
            this.f37699r = new z1.b(this.f37696o);
        }
    }

    public final i a(i.a aVar, String str) {
        i b10 = this.f37696o.f37674c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.j(aVar, str);
        } else {
            b10.e();
            b10.j(aVar, str);
        }
        int i10 = this.f37698q;
        int i11 = this.f37683a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f37683a = i12;
            this.f37697p = (i[]) Arrays.copyOf(this.f37697p, i12);
        }
        i[] iVarArr = this.f37697p;
        int i13 = this.f37698q;
        this.f37698q = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    public void b(c2.e eVar, c2.e eVar2, float f10, int i10) {
        d.a aVar = d.a.LEFT;
        i q10 = q(eVar.o(aVar));
        d.a aVar2 = d.a.TOP;
        i q11 = q(eVar.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        i q12 = q(eVar.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        i q13 = q(eVar.o(aVar4));
        i q14 = q(eVar2.o(aVar));
        i q15 = q(eVar2.o(aVar2));
        i q16 = q(eVar2.o(aVar3));
        i q17 = q(eVar2.o(aVar4));
        z1.b r8 = r();
        double d10 = f10;
        double d11 = i10;
        r8.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r8);
        z1.b r10 = r();
        r10.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r10);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        z1.b r8 = r();
        r8.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r8.d(this, i12);
        }
        d(r8);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(z1.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f37694m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f37695n
            if (r0 >= r2) goto L13
            int r0 = r5.f37693l
            int r0 = r0 + r1
            int r2 = r5.f37688g
            if (r0 < r2) goto L16
        L13:
            r5.z()
        L16:
            boolean r0 = r6.f37672f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            z1.i r0 = r5.p()
            r6.f37668a = r0
            int r3 = r5.f37694m
            r5.l(r6)
            int r4 = r5.f37694m
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            z1.d$a r2 = r5.f37699r
            r2.c(r6)
            z1.d$a r2 = r5.f37699r
            r5.C(r2, r1)
            int r2 = r0.f37713d
            r3 = -1
            if (r2 != r3) goto L7d
            z1.i r2 = r6.f37668a
            if (r2 != r0) goto L5a
            z1.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f37672f
            if (r0 != 0) goto L63
            z1.i r0 = r6.f37668a
            r0.l(r5, r6)
        L63:
            boolean r0 = z1.d.f37680w
            if (r0 == 0) goto L6f
            z1.c r0 = r5.f37696o
            z1.f<z1.b> r0 = r0.f37673a
            r0.a(r6)
            goto L76
        L6f:
            z1.c r0 = r5.f37696o
            z1.f<z1.b> r0 = r0.b
            r0.a(r6)
        L76:
            int r0 = r5.f37694m
            int r0 = r0 - r1
            r5.f37694m = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.d.d(z1.b):void");
    }

    public z1.b e(i iVar, i iVar2, int i10, int i11) {
        if (f37677t && i11 == 8 && iVar2.f37716g && iVar.f37713d == -1) {
            iVar.h(this, iVar2.f37715f + i10);
            return null;
        }
        z1.b r8 = r();
        r8.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r8.d(this, i11);
        }
        d(r8);
        return r8;
    }

    public void f(i iVar, int i10) {
        if (f37677t && iVar.f37713d == -1) {
            float f10 = i10;
            iVar.h(this, f10);
            for (int i11 = 0; i11 < this.f37684c + 1; i11++) {
                i iVar2 = this.f37696o.f37675d[i11];
                if (iVar2 != null && iVar2.f37723n && iVar2.f37724o == iVar.f37712c) {
                    iVar2.h(this, iVar2.f37725p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f37713d;
        if (i12 == -1) {
            z1.b r8 = r();
            r8.i(iVar, i10);
            d(r8);
            return;
        }
        z1.b bVar = this.f37689h[i12];
        if (bVar.f37672f) {
            bVar.b = i10;
            return;
        }
        if (bVar.f37671e.h() == 0) {
            bVar.f37672f = true;
            bVar.b = i10;
        } else {
            z1.b r10 = r();
            r10.m(iVar, i10);
            d(r10);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        z1.b r8 = r();
        i t8 = t();
        t8.f37714e = 0;
        r8.o(iVar, iVar2, t8, i10);
        d(r8);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        z1.b r8 = r();
        i t8 = t();
        t8.f37714e = 0;
        r8.o(iVar, iVar2, t8, i10);
        if (i11 != 8) {
            m(r8, (int) (r8.f37671e.a(t8) * (-1.0f)), i11);
        }
        d(r8);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        z1.b r8 = r();
        i t8 = t();
        t8.f37714e = 0;
        r8.p(iVar, iVar2, t8, i10);
        d(r8);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        z1.b r8 = r();
        i t8 = t();
        t8.f37714e = 0;
        r8.p(iVar, iVar2, t8, i10);
        if (i11 != 8) {
            m(r8, (int) (r8.f37671e.a(t8) * (-1.0f)), i11);
        }
        d(r8);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        z1.b r8 = r();
        r8.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r8.d(this, i10);
        }
        d(r8);
    }

    public final void l(z1.b bVar) {
        int i10;
        if (f37678u && bVar.f37672f) {
            bVar.f37668a.h(this, bVar.b);
        } else {
            z1.b[] bVarArr = this.f37689h;
            int i11 = this.f37694m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f37668a;
            iVar.f37713d = i11;
            this.f37694m = i11 + 1;
            iVar.l(this, bVar);
        }
        if (f37678u && this.b) {
            int i12 = 0;
            while (i12 < this.f37694m) {
                if (this.f37689h[i12] == null) {
                    System.out.println("WTF");
                }
                z1.b bVar2 = this.f37689h[i12];
                if (bVar2 != null && bVar2.f37672f) {
                    bVar2.f37668a.h(this, bVar2.b);
                    if (f37680w) {
                        this.f37696o.f37673a.a(bVar2);
                    } else {
                        this.f37696o.b.a(bVar2);
                    }
                    this.f37689h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f37694m;
                        if (i13 >= i10) {
                            break;
                        }
                        z1.b[] bVarArr2 = this.f37689h;
                        int i15 = i13 - 1;
                        z1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f37668a;
                        if (iVar2.f37713d == i13) {
                            iVar2.f37713d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f37689h[i14] = null;
                    }
                    this.f37694m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.b = false;
        }
    }

    public void m(z1.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f37694m; i10++) {
            z1.b bVar = this.f37689h[i10];
            bVar.f37668a.f37715f = bVar.b;
        }
    }

    public i o(int i10, String str) {
        if (this.f37693l + 1 >= this.f37688g) {
            z();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f37684c + 1;
        this.f37684c = i11;
        this.f37693l++;
        a10.f37712c = i11;
        a10.f37714e = i10;
        this.f37696o.f37675d[i11] = a10;
        this.f37686e.b(a10);
        return a10;
    }

    public i p() {
        if (this.f37693l + 1 >= this.f37688g) {
            z();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f37684c + 1;
        this.f37684c = i10;
        this.f37693l++;
        a10.f37712c = i10;
        this.f37696o.f37675d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f37693l + 1 >= this.f37688g) {
            z();
        }
        if (obj instanceof c2.d) {
            c2.d dVar = (c2.d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f37696o);
                iVar = dVar.i();
            }
            int i10 = iVar.f37712c;
            if (i10 != -1 && i10 <= this.f37684c && this.f37696o.f37675d[i10] != null) {
                return iVar;
            }
            if (i10 != -1) {
                iVar.e();
            }
            int i11 = this.f37684c + 1;
            this.f37684c = i11;
            this.f37693l++;
            iVar.f37712c = i11;
            iVar.f37719j = i.a.UNRESTRICTED;
            this.f37696o.f37675d[i11] = iVar;
        }
        return iVar;
    }

    public z1.b r() {
        z1.b b10;
        if (f37680w) {
            b10 = this.f37696o.f37673a.b();
            if (b10 == null) {
                b10 = new b(this.f37696o);
                f37682y++;
            } else {
                b10.y();
            }
        } else {
            b10 = this.f37696o.b.b();
            if (b10 == null) {
                b10 = new z1.b(this.f37696o);
                f37681x++;
            } else {
                b10.y();
            }
        }
        i.c();
        return b10;
    }

    public i t() {
        if (this.f37693l + 1 >= this.f37688g) {
            z();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f37684c + 1;
        this.f37684c = i10;
        this.f37693l++;
        a10.f37712c = i10;
        this.f37696o.f37675d[i10] = a10;
        return a10;
    }

    public final int u(a aVar) {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f37694m; i10++) {
            z1.b bVar = this.f37689h[i10];
            if (bVar.f37668a.f37719j != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (bVar.b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f37694m) {
                                break;
                            }
                            z1.b bVar2 = this.f37689h[i12];
                            if (bVar2.f37668a.f37719j != i.a.UNRESTRICTED && !bVar2.f37672f && bVar2.b < f12) {
                                if (f37679v) {
                                    int h10 = bVar2.f37671e.h();
                                    int i16 = 0;
                                    while (i16 < h10) {
                                        i b10 = bVar2.f37671e.b(i16);
                                        float a10 = bVar2.f37671e.a(b10);
                                        if (a10 <= f12) {
                                            f11 = f12;
                                        } else {
                                            f11 = f12;
                                            for (int i17 = 0; i17 < 9; i17++) {
                                                float f14 = b10.f37717h[i17] / a10;
                                                if ((f14 < f13 && i17 == i15) || i17 > i15) {
                                                    i15 = i17;
                                                    i14 = b10.f37712c;
                                                    i13 = i12;
                                                    f13 = f14;
                                                }
                                            }
                                        }
                                        i16++;
                                        f12 = f11;
                                    }
                                } else {
                                    f10 = f12;
                                    for (int i18 = 1; i18 < this.f37693l; i18++) {
                                        i iVar = this.f37696o.f37675d[i18];
                                        float a11 = bVar2.f37671e.a(iVar);
                                        if (a11 > f10) {
                                            for (int i19 = 0; i19 < 9; i19++) {
                                                float f15 = iVar.f37717h[i19] / a11;
                                                if ((f15 < f13 && i19 == i15) || i19 > i15) {
                                                    i15 = i19;
                                                    i13 = i12;
                                                    i14 = i18;
                                                    f13 = f15;
                                                }
                                            }
                                        }
                                    }
                                    i12++;
                                    f12 = f10;
                                }
                            }
                            f10 = f12;
                            i12++;
                            f12 = f10;
                        }
                        float f16 = f12;
                        if (i13 != -1) {
                            z1.b bVar3 = this.f37689h[i13];
                            bVar3.f37668a.f37713d = -1;
                            bVar3.x(this.f37696o.f37675d[i14]);
                            i iVar2 = bVar3.f37668a;
                            iVar2.f37713d = i13;
                            iVar2.l(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f37693l / 2) {
                            z10 = true;
                        }
                        f12 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public void v(e eVar) {
    }

    public c w() {
        return this.f37696o;
    }

    public int y(Object obj) {
        i i10 = ((c2.d) obj).i();
        if (i10 != null) {
            return (int) (i10.f37715f + 0.5f);
        }
        return 0;
    }

    public final void z() {
        int i10 = this.f37687f * 2;
        this.f37687f = i10;
        this.f37689h = (z1.b[]) Arrays.copyOf(this.f37689h, i10);
        c cVar = this.f37696o;
        cVar.f37675d = (i[]) Arrays.copyOf(cVar.f37675d, this.f37687f);
        int i11 = this.f37687f;
        this.f37692k = new boolean[i11];
        this.f37688g = i11;
        this.f37695n = i11;
    }
}
