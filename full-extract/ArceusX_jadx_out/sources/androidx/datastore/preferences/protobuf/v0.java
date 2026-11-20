package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.t;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class v0<T> implements g1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f2190a;
    public final n1<?, ?> b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2191c;

    /* renamed from: d, reason: collision with root package name */
    public final p<?> f2192d;

    public v0(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        this.b = n1Var;
        this.f2191c = pVar.e(r0Var);
        this.f2192d = pVar;
        this.f2190a = r0Var;
    }

    private <UT, UB> int j(n1<UT, UB> n1Var, T t8) {
        return n1Var.i(n1Var.g(t8));
    }

    private <UT, UB, ET extends t.b<ET>> void k(n1<UT, UB> n1Var, p<ET> pVar, T t8, f1 f1Var, o oVar) {
        n1<UT, UB> n1Var2;
        UB f10 = n1Var.f(t8);
        t<ET> d10 = pVar.d(t8);
        while (f1Var.A() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                p<ET> pVar2 = pVar;
                f1 f1Var2 = f1Var;
                o oVar2 = oVar;
                try {
                    if (!m(f1Var2, oVar2, pVar2, d10, n1Var2, f10)) {
                        n1Var2.o(t8, f10);
                        return;
                    }
                    f1Var = f1Var2;
                    oVar = oVar2;
                    pVar = pVar2;
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

    public static <T> v0<T> l(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        return new v0<>(n1Var, pVar, r0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t8, T t10) {
        i1.G(this.b, t8, t10);
        if (this.f2191c) {
            i1.E(this.f2192d, t8, t10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void b(T t8) {
        this.b.j(t8);
        this.f2192d.f(t8);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(T t8) {
        return this.f2192d.c(t8).p();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int d(T t8) {
        int j10 = j(this.b, t8);
        return this.f2191c ? j10 + this.f2192d.c(t8).j() : j10;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T e() {
        r0 r0Var = this.f2190a;
        return r0Var instanceof x ? (T) ((x) r0Var).O() : (T) r0Var.e().d();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int f(T t8) {
        int hashCode = this.b.g(t8).hashCode();
        return this.f2191c ? (hashCode * 53) + this.f2192d.c(t8).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean g(T t8, T t10) {
        if (!this.b.g(t8).equals(this.b.g(t10))) {
            return false;
        }
        if (this.f2191c) {
            return this.f2192d.c(t8).equals(this.f2192d.c(t10));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t8, f1 f1Var, o oVar) {
        k(this.b, this.f2192d, t8, f1Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t8, t1 t1Var) {
        Iterator<Map.Entry<?, Object>> t10 = this.f2192d.c(t8).t();
        while (t10.hasNext()) {
            Map.Entry<?, Object> next = t10.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.k() != s1.c.MESSAGE || bVar.f() || bVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof c0.b) {
                t1Var.b(bVar.getNumber(), ((c0.b) next).a().e());
            } else {
                t1Var.b(bVar.getNumber(), next.getValue());
            }
        }
        n(this.b, t8, t1Var);
    }

    public final <UT, UB, ET extends t.b<ET>> boolean m(f1 f1Var, o oVar, p<ET> pVar, t<ET> tVar, n1<UT, UB> n1Var, UB ub) {
        int a10 = f1Var.a();
        int i10 = 0;
        if (a10 != s1.f2094a) {
            if (s1.b(a10) != 2) {
                return f1Var.D();
            }
            Object b = pVar.b(oVar, this.f2190a, s1.a(a10));
            if (b == null) {
                return n1Var.m(ub, f1Var, 0);
            }
            pVar.h(f1Var, b, oVar, tVar);
            return true;
        }
        Object obj = null;
        g gVar = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int a11 = f1Var.a();
            if (a11 == s1.f2095c) {
                i10 = f1Var.h();
                obj = pVar.b(oVar, this.f2190a, i10);
            } else if (a11 == s1.f2096d) {
                if (obj != null) {
                    pVar.h(f1Var, obj, oVar, tVar);
                } else {
                    gVar = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != s1.b) {
            throw a0.b();
        }
        if (gVar != null) {
            if (obj != null) {
                pVar.i(gVar, obj, oVar, tVar);
            } else {
                n1Var.d(ub, i10, gVar);
            }
        }
        return true;
    }

    public final <UT, UB> void n(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.s(n1Var.g(t8), t1Var);
    }
}
