package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w0<T> implements g1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f8698a;
    public final n1<?, ?> b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8699c;

    /* renamed from: d, reason: collision with root package name */
    public final q<?> f8700d;

    public w0(n1<?, ?> n1Var, q<?> qVar, s0 s0Var) {
        this.b = n1Var;
        this.f8699c = qVar.e(s0Var);
        this.f8700d = qVar;
        this.f8698a = s0Var;
    }

    private <UT, UB> int k(n1<UT, UB> n1Var, T t8) {
        return n1Var.i(n1Var.g(t8));
    }

    private <UT, UB, ET extends u.b<ET>> void l(n1<UT, UB> n1Var, q<ET> qVar, T t8, f1 f1Var, p pVar) {
        n1<UT, UB> n1Var2;
        UB f10 = n1Var.f(t8);
        u<ET> d10 = qVar.d(t8);
        while (f1Var.A() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                q<ET> qVar2 = qVar;
                f1 f1Var2 = f1Var;
                p pVar2 = pVar;
                try {
                    if (!n(f1Var2, pVar2, qVar2, d10, n1Var2, f10)) {
                        n1Var2.o(t8, f10);
                        return;
                    }
                    f1Var = f1Var2;
                    pVar = pVar2;
                    qVar = qVar2;
                    n1Var = n1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    n1Var2.o(t8, f10);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                n1Var2 = n1Var;
            }
        }
        n1Var.o(t8, f10);
    }

    public static <T> w0<T> m(n1<?, ?> n1Var, q<?> qVar, s0 s0Var) {
        return new w0<>(n1Var, qVar, s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t8, T t10) {
        i1.G(this.b, t8, t10);
        if (this.f8699c) {
            i1.E(this.f8700d, t8, t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t8) {
        this.b.j(t8);
        this.f8700d.f(t8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t8) {
        return this.f8700d.c(t8).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t8) {
        int k10 = k(this.b, t8);
        return this.f8699c ? k10 + this.f8700d.c(t8).j() : k10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        s0 s0Var = this.f8698a;
        return s0Var instanceof y ? (T) ((y) s0Var).P() : (T) s0Var.e().d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int f(T t8) {
        int hashCode = this.b.g(t8).hashCode();
        return this.f8699c ? (hashCode * 53) + this.f8700d.c(t8).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t8, T t10) {
        if (!this.b.g(t8).equals(this.b.g(t10))) {
            return false;
        }
        if (this.f8699c) {
            return this.f8700d.c(t8).equals(this.f8700d.c(t10));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf A[EDGE_INSN: B:24:0x00cf->B:25:0x00cf BREAK  A[LOOP:1: B:10:0x006f->B:18:0x006f], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.w0.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t8, f1 f1Var, p pVar) {
        l(this.b, this.f8700d, t8, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t8, t1 t1Var) {
        Iterator<Map.Entry<?, Object>> s8 = this.f8700d.c(t8).s();
        while (s8.hasNext()) {
            Map.Entry<?, Object> next = s8.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.k() != s1.c.MESSAGE || bVar.f() || bVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof d0.b) {
                t1Var.b(bVar.getNumber(), ((d0.b) next).a().e());
            } else {
                t1Var.b(bVar.getNumber(), next.getValue());
            }
        }
        o(this.b, t8, t1Var);
    }

    public final <UT, UB, ET extends u.b<ET>> boolean n(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, n1<UT, UB> n1Var, UB ub) {
        int a10 = f1Var.a();
        int i10 = 0;
        if (a10 != s1.f8600a) {
            if (s1.b(a10) != 2) {
                return f1Var.D();
            }
            Object b = qVar.b(pVar, this.f8698a, s1.a(a10));
            if (b == null) {
                return n1Var.m(ub, f1Var, 0);
            }
            qVar.h(f1Var, b, pVar, uVar);
            return true;
        }
        Object obj = null;
        h hVar = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int a11 = f1Var.a();
            if (a11 == s1.f8601c) {
                i10 = f1Var.h();
                obj = qVar.b(pVar, this.f8698a, i10);
            } else if (a11 == s1.f8602d) {
                if (obj != null) {
                    qVar.h(f1Var, obj, pVar, uVar);
                } else {
                    hVar = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != s1.b) {
            throw b0.b();
        }
        if (hVar != null) {
            if (obj != null) {
                qVar.i(hVar, obj, pVar, uVar);
            } else {
                n1Var.d(ub, i10, hVar);
            }
        }
        return true;
    }

    public final <UT, UB> void o(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.s(n1Var.g(t8), t1Var);
    }
}
