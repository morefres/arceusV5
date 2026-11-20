package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s1;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f2007a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f2008c;

    /* renamed from: d, reason: collision with root package name */
    public int f2009d = 0;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2010a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f2010a = iArr;
            try {
                iArr[s1.b.f2104j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2010a[s1.b.f2108n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2010a[s1.b.f2097c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2010a[s1.b.f2110p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2010a[s1.b.f2103i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2010a[s1.b.f2102h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2010a[s1.b.f2098d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2010a[s1.b.f2101g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2010a[s1.b.f2099e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2010a[s1.b.f2107m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2010a[s1.b.f2111q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2010a[s1.b.f2112r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2010a[s1.b.f2113s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2010a[s1.b.f2114t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2010a[s1.b.f2105k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2010a[s1.b.f2109o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2010a[s1.b.f2100f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public i(h hVar) {
        h hVar2 = (h) z.b(hVar, "input");
        this.f2007a = hVar2;
        hVar2.f1987d = this;
    }

    public static i Q(h hVar) {
        i iVar = hVar.f1987d;
        return iVar != null ? iVar : new i(hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int A() {
        int i10 = this.f2009d;
        if (i10 != 0) {
            this.b = i10;
            this.f2009d = 0;
        } else {
            this.b = this.f2007a.C();
        }
        int i11 = this.b;
        if (i11 == 0 || i11 == this.f2008c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void B(List<String> list) {
        W(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void C(List<Float> list) {
        int C;
        int C2;
        if (!(list instanceof v)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f2007a.D();
                Z(D);
                int e10 = this.f2007a.e() + D;
                do {
                    list.add(Float.valueOf(this.f2007a.t()));
                } while (this.f2007a.e() < e10);
                return;
            }
            if (b != 5) {
                throw a0.e();
            }
            do {
                list.add(Float.valueOf(this.f2007a.t()));
                if (this.f2007a.f()) {
                    return;
                } else {
                    C = this.f2007a.C();
                }
            } while (C == this.b);
            this.f2009d = C;
            return;
        }
        v vVar = (v) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f2007a.D();
            Z(D2);
            int e11 = this.f2007a.e() + D2;
            do {
                vVar.b(this.f2007a.t());
            } while (this.f2007a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw a0.e();
        }
        do {
            vVar.b(this.f2007a.t());
            if (this.f2007a.f()) {
                return;
            } else {
                C2 = this.f2007a.C();
            }
        } while (C2 == this.b);
        this.f2009d = C2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f2007a.f() || (i10 = this.b) == this.f2008c) {
            return false;
        }
        return this.f2007a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int E() {
        Y(5);
        return this.f2007a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void F(List<g> list) {
        int C;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        do {
            list.add(o());
            if (this.f2007a.f()) {
                return;
            } else {
                C = this.f2007a.C();
            }
        } while (C == this.b);
        this.f2009d = C;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void G(List<Double> list) {
        int C;
        int C2;
        if (!(list instanceof l)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Double.valueOf(this.f2007a.p()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int D = this.f2007a.D();
            a0(D);
            int e10 = this.f2007a.e() + D;
            do {
                list.add(Double.valueOf(this.f2007a.p()));
            } while (this.f2007a.e() < e10);
            return;
        }
        l lVar = (l) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                lVar.b(this.f2007a.p());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int D2 = this.f2007a.D();
        a0(D2);
        int e11 = this.f2007a.e() + D2;
        do {
            lVar.b(this.f2007a.p());
        } while (this.f2007a.e() < e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long H() {
        Y(0);
        return this.f2007a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String I() {
        Y(2);
        return this.f2007a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void J(T t8, g1<T> g1Var, o oVar) {
        Y(2);
        S(t8, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void K(List<T> list, g1<T> g1Var, o oVar) {
        int C;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        int i10 = this.b;
        do {
            list.add(V(g1Var, oVar));
            if (this.f2007a.f() || this.f2009d != 0) {
                return;
            } else {
                C = this.f2007a.C();
            }
        } while (C == i10);
        this.f2009d = C;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T L(Class<T> cls, o oVar) {
        Y(2);
        return (T) V(c1.a().c(cls), oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> T M(Class<T> cls, o oVar) {
        Y(3);
        return (T) U(c1.a().c(cls), oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f2007a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void N(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.k0.a<K, V> r9, androidx.datastore.preferences.protobuf.o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f2007a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.h r2 = r7.f2007a
            int r1 = r2.m(r1)
            K r2 = r9.b
            V r3 = r9.f2049d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f2007a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.a0 r4 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.s1$b r4 = r9.f2048c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            V r5 = r9.f2049d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.s1$b r4 = r9.f2047a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.a0.a -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.a0 r8 = new androidx.datastore.preferences.protobuf.a0     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f2007a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f2007a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.N(java.util.Map, androidx.datastore.preferences.protobuf.k0$a, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void O(T t8, g1<T> g1Var, o oVar) {
        Y(3);
        R(t8, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> void P(List<T> list, g1<T> g1Var, o oVar) {
        int C;
        if (s1.b(this.b) != 3) {
            throw a0.e();
        }
        int i10 = this.b;
        do {
            list.add(U(g1Var, oVar));
            if (this.f2007a.f() || this.f2009d != 0) {
                return;
            } else {
                C = this.f2007a.C();
            }
        } while (C == i10);
        this.f2009d = C;
    }

    public final <T> void R(T t8, g1<T> g1Var, o oVar) {
        int i10 = this.f2008c;
        this.f2008c = s1.c(s1.a(this.b), 4);
        try {
            g1Var.h(t8, this, oVar);
            if (this.b == this.f2008c) {
            } else {
                throw a0.h();
            }
        } finally {
            this.f2008c = i10;
        }
    }

    public final <T> void S(T t8, g1<T> g1Var, o oVar) {
        int D = this.f2007a.D();
        h hVar = this.f2007a;
        if (hVar.f1985a >= hVar.b) {
            throw a0.i();
        }
        int m10 = hVar.m(D);
        this.f2007a.f1985a++;
        g1Var.h(t8, this, oVar);
        this.f2007a.a(0);
        r5.f1985a--;
        this.f2007a.l(m10);
    }

    public final Object T(s1.b bVar, Class<?> cls, o oVar) {
        switch (a.f2010a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return L(cls, oVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final <T> T U(g1<T> g1Var, o oVar) {
        T e10 = g1Var.e();
        R(e10, g1Var, oVar);
        g1Var.b(e10);
        return e10;
    }

    public final <T> T V(g1<T> g1Var, o oVar) {
        T e10 = g1Var.e();
        S(e10, g1Var, oVar);
        g1Var.b(e10);
        return e10;
    }

    public void W(List<String> list, boolean z10) {
        int C;
        int C2;
        if (s1.b(this.b) != 2) {
            throw a0.e();
        }
        if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C = this.f2007a.C();
                }
            } while (C == this.b);
            this.f2009d = C;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.e2(o());
            if (this.f2007a.f()) {
                return;
            } else {
                C2 = this.f2007a.C();
            }
        } while (C2 == this.b);
        this.f2009d = C2;
    }

    public final void X(int i10) {
        if (this.f2007a.e() != i10) {
            throw a0.m();
        }
    }

    public final void Y(int i10) {
        if (s1.b(this.b) != i10) {
            throw a0.e();
        }
    }

    public final void Z(int i10) {
        if ((i10 & 3) != 0) {
            throw a0.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int a() {
        return this.b;
    }

    public final void a0(int i10) {
        if ((i10 & 7) != 0) {
            throw a0.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long b() {
        Y(1);
        return this.f2007a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void c(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f2007a.D();
                Z(D);
                int e10 = this.f2007a.e() + D;
                do {
                    list.add(Integer.valueOf(this.f2007a.w()));
                } while (this.f2007a.e() < e10);
                return;
            }
            if (b != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2007a.w()));
                if (this.f2007a.f()) {
                    return;
                } else {
                    C = this.f2007a.C();
                }
            } while (C == this.b);
            this.f2009d = C;
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f2007a.D();
            Z(D2);
            int e11 = this.f2007a.e() + D2;
            do {
                yVar.d(this.f2007a.w());
            } while (this.f2007a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw a0.e();
        }
        do {
            yVar.d(this.f2007a.w());
            if (this.f2007a.f()) {
                return;
            } else {
                C2 = this.f2007a.C();
            }
        } while (C2 == this.b);
        this.f2009d = C2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void d(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof i0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f2007a.z()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Long.valueOf(this.f2007a.z()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        i0 i0Var = (i0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                i0Var.e(this.f2007a.z());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            i0Var.e(this.f2007a.z());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean e() {
        Y(0);
        return this.f2007a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long f() {
        Y(1);
        return this.f2007a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void g(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof i0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f2007a.E()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Long.valueOf(this.f2007a.E()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        i0 i0Var = (i0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                i0Var.e(this.f2007a.E());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            i0Var.e(this.f2007a.E());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int h() {
        Y(0);
        return this.f2007a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void i(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof i0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f2007a.v()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Long.valueOf(this.f2007a.v()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        i0 i0Var = (i0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                i0Var.e(this.f2007a.v());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            i0Var.e(this.f2007a.v());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void j(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2007a.q()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Integer.valueOf(this.f2007a.q()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                yVar.d(this.f2007a.q());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            yVar.d(this.f2007a.q());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int k() {
        Y(0);
        return this.f2007a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int l() {
        Y(0);
        return this.f2007a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void m(List<Boolean> list) {
        int C;
        int C2;
        if (!(list instanceof e)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2007a.n()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Boolean.valueOf(this.f2007a.n()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        e eVar = (e) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                eVar.b(this.f2007a.n());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            eVar.b(this.f2007a.n());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void n(List<String> list) {
        W(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public g o() {
        Y(2);
        return this.f2007a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int p() {
        Y(0);
        return this.f2007a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void q(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof i0)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.f2007a.s()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int D = this.f2007a.D();
            a0(D);
            int e10 = this.f2007a.e() + D;
            do {
                list.add(Long.valueOf(this.f2007a.s()));
            } while (this.f2007a.e() < e10);
            return;
        }
        i0 i0Var = (i0) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                i0Var.e(this.f2007a.s());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int D2 = this.f2007a.D();
        a0(D2);
        int e11 = this.f2007a.e() + D2;
        do {
            i0Var.e(this.f2007a.s());
        } while (this.f2007a.e() < e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void r(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2007a.y()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Integer.valueOf(this.f2007a.y()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                yVar.d(this.f2007a.y());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            yVar.d(this.f2007a.y());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public double readDouble() {
        Y(1);
        return this.f2007a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public float readFloat() {
        Y(5);
        return this.f2007a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long s() {
        Y(0);
        return this.f2007a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void t(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2007a.D()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Integer.valueOf(this.f2007a.D()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                yVar.d(this.f2007a.D());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            yVar.d(this.f2007a.D());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int u() {
        Y(5);
        return this.f2007a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void v(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof i0)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.f2007a.x()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int D = this.f2007a.D();
            a0(D);
            int e10 = this.f2007a.e() + D;
            do {
                list.add(Long.valueOf(this.f2007a.x()));
            } while (this.f2007a.e() < e10);
            return;
        }
        i0 i0Var = (i0) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                i0Var.e(this.f2007a.x());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int D2 = this.f2007a.D();
        a0(D2);
        int e11 = this.f2007a.e() + D2;
        do {
            i0Var.e(this.f2007a.x());
        } while (this.f2007a.e() < e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void w(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2007a.u()));
                    if (this.f2007a.f()) {
                        return;
                    } else {
                        C = this.f2007a.C();
                    }
                } while (C == this.b);
                this.f2009d = C;
                return;
            }
            if (b != 2) {
                throw a0.e();
            }
            int e10 = this.f2007a.e() + this.f2007a.D();
            do {
                list.add(Integer.valueOf(this.f2007a.u()));
            } while (this.f2007a.e() < e10);
            X(e10);
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                yVar.d(this.f2007a.u());
                if (this.f2007a.f()) {
                    return;
                } else {
                    C2 = this.f2007a.C();
                }
            } while (C2 == this.b);
            this.f2009d = C2;
            return;
        }
        if (b10 != 2) {
            throw a0.e();
        }
        int e11 = this.f2007a.e() + this.f2007a.D();
        do {
            yVar.d(this.f2007a.u());
        } while (this.f2007a.e() < e11);
        X(e11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void x(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof y)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f2007a.D();
                Z(D);
                int e10 = this.f2007a.e() + D;
                do {
                    list.add(Integer.valueOf(this.f2007a.r()));
                } while (this.f2007a.e() < e10);
                return;
            }
            if (b != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f2007a.r()));
                if (this.f2007a.f()) {
                    return;
                } else {
                    C = this.f2007a.C();
                }
            } while (C == this.b);
            this.f2009d = C;
            return;
        }
        y yVar = (y) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f2007a.D();
            Z(D2);
            int e11 = this.f2007a.e() + D2;
            do {
                yVar.d(this.f2007a.r());
            } while (this.f2007a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw a0.e();
        }
        do {
            yVar.d(this.f2007a.r());
            if (this.f2007a.f()) {
                return;
            } else {
                C2 = this.f2007a.C();
            }
        } while (C2 == this.b);
        this.f2009d = C2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long y() {
        Y(0);
        return this.f2007a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String z() {
        Y(2);
        return this.f2007a.A();
    }
}
