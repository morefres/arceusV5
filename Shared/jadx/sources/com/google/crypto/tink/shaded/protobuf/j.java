package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f8519a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f8520c;

    /* renamed from: d, reason: collision with root package name */
    public int f8521d = 0;

    public j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f8519a = iVar2;
        iVar2.f8497d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f8497d;
        return jVar != null ? jVar : new j(iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int A() {
        int i10 = this.f8521d;
        if (i10 != 0) {
            this.b = i10;
            this.f8521d = 0;
        } else {
            this.b = this.f8519a.C();
        }
        int i11 = this.b;
        if (i11 == 0 || i11 == this.f8520c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void B(List<String> list) {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void C(List<Float> list) {
        int C;
        int C2;
        if (!(list instanceof w)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f8519a.D();
                Y(D);
                int e10 = this.f8519a.e() + D;
                do {
                    list.add(Float.valueOf(this.f8519a.t()));
                } while (this.f8519a.e() < e10);
                return;
            }
            if (b != 5) {
                throw b0.e();
            }
            do {
                list.add(Float.valueOf(this.f8519a.t()));
                if (this.f8519a.f()) {
                    return;
                } else {
                    C = this.f8519a.C();
                }
            } while (C == this.b);
            this.f8521d = C;
            return;
        }
        w wVar = (w) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f8519a.D();
            Y(D2);
            int e11 = this.f8519a.e() + D2;
            do {
                wVar.d(this.f8519a.t());
            } while (this.f8519a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw b0.e();
        }
        do {
            wVar.d(this.f8519a.t());
            if (this.f8519a.f()) {
                return;
            } else {
                C2 = this.f8519a.C();
            }
        } while (C2 == this.b);
        this.f8521d = C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f8519a.f() || (i10 = this.b) == this.f8520c) {
            return false;
        }
        return this.f8519a.F(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int E() {
        X(5);
        return this.f8519a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void F(List<h> list) {
        int C;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        do {
            list.add(o());
            if (this.f8519a.f()) {
                return;
            } else {
                C = this.f8519a.C();
            }
        } while (C == this.b);
        this.f8521d = C;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void G(List<Double> list) {
        int C;
        int C2;
        if (!(list instanceof m)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Double.valueOf(this.f8519a.p()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int D = this.f8519a.D();
            Z(D);
            int e10 = this.f8519a.e() + D;
            do {
                list.add(Double.valueOf(this.f8519a.p()));
            } while (this.f8519a.e() < e10);
            return;
        }
        m mVar = (m) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                mVar.d(this.f8519a.p());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int D2 = this.f8519a.D();
        Z(D2);
        int e11 = this.f8519a.e() + D2;
        do {
            mVar.d(this.f8519a.p());
        } while (this.f8519a.e() < e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long H() {
        X(0);
        return this.f8519a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String I() {
        X(2);
        return this.f8519a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void J(T t8, g1<T> g1Var, p pVar) {
        X(3);
        R(t8, g1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> T K(Class<T> cls, p pVar) {
        X(3);
        return (T) T(c1.a().c(cls), pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <K, V> void L(Map<K, V> map, l0.a<K, V> aVar, p pVar) {
        X(2);
        this.f8519a.m(this.f8519a.D());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void M(T t8, g1<T> g1Var, p pVar) {
        X(2);
        S(t8, g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void N(List<T> list, g1<T> g1Var, p pVar) {
        int C;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        int i10 = this.b;
        do {
            list.add(U(g1Var, pVar));
            if (this.f8519a.f() || this.f8521d != 0) {
                return;
            } else {
                C = this.f8519a.C();
            }
        } while (C == i10);
        this.f8521d = C;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> T O(Class<T> cls, p pVar) {
        X(2);
        return (T) U(c1.a().c(cls), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> void P(List<T> list, g1<T> g1Var, p pVar) {
        int C;
        if (s1.b(this.b) != 3) {
            throw b0.e();
        }
        int i10 = this.b;
        do {
            list.add(T(g1Var, pVar));
            if (this.f8519a.f() || this.f8521d != 0) {
                return;
            } else {
                C = this.f8519a.C();
            }
        } while (C == i10);
        this.f8521d = C;
    }

    public final <T> void R(T t8, g1<T> g1Var, p pVar) {
        int i10 = this.f8520c;
        this.f8520c = s1.c(s1.a(this.b), 4);
        try {
            g1Var.i(t8, this, pVar);
            if (this.b == this.f8520c) {
            } else {
                throw b0.h();
            }
        } finally {
            this.f8520c = i10;
        }
    }

    public final <T> void S(T t8, g1<T> g1Var, p pVar) {
        int D = this.f8519a.D();
        i iVar = this.f8519a;
        if (iVar.f8495a >= iVar.b) {
            throw b0.i();
        }
        int m10 = iVar.m(D);
        this.f8519a.f8495a++;
        g1Var.i(t8, this, pVar);
        this.f8519a.a(0);
        r5.f8495a--;
        this.f8519a.l(m10);
    }

    public final <T> T T(g1<T> g1Var, p pVar) {
        T e10 = g1Var.e();
        R(e10, g1Var, pVar);
        g1Var.b(e10);
        return e10;
    }

    public final <T> T U(g1<T> g1Var, p pVar) {
        T e10 = g1Var.e();
        S(e10, g1Var, pVar);
        g1Var.b(e10);
        return e10;
    }

    public void V(List<String> list, boolean z10) {
        int C;
        int C2;
        if (s1.b(this.b) != 2) {
            throw b0.e();
        }
        if (!(list instanceof f0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C = this.f8519a.C();
                }
            } while (C == this.b);
            this.f8521d = C;
            return;
        }
        f0 f0Var = (f0) list;
        do {
            f0Var.P2(o());
            if (this.f8519a.f()) {
                return;
            } else {
                C2 = this.f8519a.C();
            }
        } while (C2 == this.b);
        this.f8521d = C2;
    }

    public final void W(int i10) {
        if (this.f8519a.e() != i10) {
            throw b0.m();
        }
    }

    public final void X(int i10) {
        if (s1.b(this.b) != i10) {
            throw b0.e();
        }
    }

    public final void Y(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.h();
        }
    }

    public final void Z(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int a() {
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long b() {
        X(1);
        return this.f8519a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f8519a.D();
                Y(D);
                int e10 = this.f8519a.e() + D;
                do {
                    list.add(Integer.valueOf(this.f8519a.w()));
                } while (this.f8519a.e() < e10);
                return;
            }
            if (b != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f8519a.w()));
                if (this.f8519a.f()) {
                    return;
                } else {
                    C = this.f8519a.C();
                }
            } while (C == this.b);
            this.f8521d = C;
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f8519a.D();
            Y(D2);
            int e11 = this.f8519a.e() + D2;
            do {
                zVar.d(this.f8519a.w());
            } while (this.f8519a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw b0.e();
        }
        do {
            zVar.d(this.f8519a.w());
            if (this.f8519a.f()) {
                return;
            } else {
                C2 = this.f8519a.C();
            }
        } while (C2 == this.b);
        this.f8521d = C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void d(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof j0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f8519a.z()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Long.valueOf(this.f8519a.z()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        j0 j0Var = (j0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                j0Var.e(this.f8519a.z());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            j0Var.e(this.f8519a.z());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean e() {
        X(0);
        return this.f8519a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long f() {
        X(1);
        return this.f8519a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void g(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof j0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f8519a.E()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Long.valueOf(this.f8519a.E()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        j0 j0Var = (j0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                j0Var.e(this.f8519a.E());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            j0Var.e(this.f8519a.E());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int h() {
        X(0);
        return this.f8519a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void i(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof j0)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.f8519a.v()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Long.valueOf(this.f8519a.v()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        j0 j0Var = (j0) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                j0Var.e(this.f8519a.v());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            j0Var.e(this.f8519a.v());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void j(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f8519a.q()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Integer.valueOf(this.f8519a.q()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                zVar.d(this.f8519a.q());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            zVar.d(this.f8519a.q());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int k() {
        X(0);
        return this.f8519a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int l() {
        X(0);
        return this.f8519a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void m(List<Boolean> list) {
        int C;
        int C2;
        if (!(list instanceof f)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f8519a.n()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Boolean.valueOf(this.f8519a.n()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        f fVar = (f) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                fVar.e(this.f8519a.n());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            fVar.e(this.f8519a.n());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void n(List<String> list) {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public h o() {
        X(2);
        return this.f8519a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int p() {
        X(0);
        return this.f8519a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void q(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof j0)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.f8519a.s()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int D = this.f8519a.D();
            Z(D);
            int e10 = this.f8519a.e() + D;
            do {
                list.add(Long.valueOf(this.f8519a.s()));
            } while (this.f8519a.e() < e10);
            return;
        }
        j0 j0Var = (j0) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                j0Var.e(this.f8519a.s());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int D2 = this.f8519a.D();
        Z(D2);
        int e11 = this.f8519a.e() + D2;
        do {
            j0Var.e(this.f8519a.s());
        } while (this.f8519a.e() < e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void r(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f8519a.y()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Integer.valueOf(this.f8519a.y()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                zVar.d(this.f8519a.y());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            zVar.d(this.f8519a.y());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public double readDouble() {
        X(1);
        return this.f8519a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public float readFloat() {
        X(5);
        return this.f8519a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long s() {
        X(0);
        return this.f8519a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void t(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f8519a.D()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Integer.valueOf(this.f8519a.D()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                zVar.d(this.f8519a.D());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            zVar.d(this.f8519a.D());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int u() {
        X(5);
        return this.f8519a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void v(List<Long> list) {
        int C;
        int C2;
        if (!(list instanceof j0)) {
            int b = s1.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.f8519a.x()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int D = this.f8519a.D();
            Z(D);
            int e10 = this.f8519a.e() + D;
            do {
                list.add(Long.valueOf(this.f8519a.x()));
            } while (this.f8519a.e() < e10);
            return;
        }
        j0 j0Var = (j0) list;
        int b10 = s1.b(this.b);
        if (b10 == 1) {
            do {
                j0Var.e(this.f8519a.x());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int D2 = this.f8519a.D();
        Z(D2);
        int e11 = this.f8519a.e() + D2;
        do {
            j0Var.e(this.f8519a.x());
        } while (this.f8519a.e() < e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void w(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.f8519a.u()));
                    if (this.f8519a.f()) {
                        return;
                    } else {
                        C = this.f8519a.C();
                    }
                } while (C == this.b);
                this.f8521d = C;
                return;
            }
            if (b != 2) {
                throw b0.e();
            }
            int e10 = this.f8519a.e() + this.f8519a.D();
            do {
                list.add(Integer.valueOf(this.f8519a.u()));
            } while (this.f8519a.e() < e10);
            W(e10);
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 0) {
            do {
                zVar.d(this.f8519a.u());
                if (this.f8519a.f()) {
                    return;
                } else {
                    C2 = this.f8519a.C();
                }
            } while (C2 == this.b);
            this.f8521d = C2;
            return;
        }
        if (b10 != 2) {
            throw b0.e();
        }
        int e11 = this.f8519a.e() + this.f8519a.D();
        do {
            zVar.d(this.f8519a.u());
        } while (this.f8519a.e() < e11);
        W(e11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void x(List<Integer> list) {
        int C;
        int C2;
        if (!(list instanceof z)) {
            int b = s1.b(this.b);
            if (b == 2) {
                int D = this.f8519a.D();
                Y(D);
                int e10 = this.f8519a.e() + D;
                do {
                    list.add(Integer.valueOf(this.f8519a.r()));
                } while (this.f8519a.e() < e10);
                return;
            }
            if (b != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f8519a.r()));
                if (this.f8519a.f()) {
                    return;
                } else {
                    C = this.f8519a.C();
                }
            } while (C == this.b);
            this.f8521d = C;
            return;
        }
        z zVar = (z) list;
        int b10 = s1.b(this.b);
        if (b10 == 2) {
            int D2 = this.f8519a.D();
            Y(D2);
            int e11 = this.f8519a.e() + D2;
            do {
                zVar.d(this.f8519a.r());
            } while (this.f8519a.e() < e11);
            return;
        }
        if (b10 != 5) {
            throw b0.e();
        }
        do {
            zVar.d(this.f8519a.r());
            if (this.f8519a.f()) {
                return;
            } else {
                C2 = this.f8519a.C();
            }
        } while (C2 == this.b);
        this.f8521d = C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long y() {
        X(0);
        return this.f8519a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String z() {
        X(2);
        return this.f8519a.A();
    }
}
