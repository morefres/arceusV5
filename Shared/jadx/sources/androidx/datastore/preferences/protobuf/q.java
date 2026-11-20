package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends p<x.d> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2068a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f2068a = iArr;
            try {
                iArr[s1.b.f2097c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2068a[s1.b.f2098d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2068a[s1.b.f2099e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2068a[s1.b.f2100f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2068a[s1.b.f2101g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2068a[s1.b.f2102h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2068a[s1.b.f2103i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2068a[s1.b.f2104j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2068a[s1.b.f2109o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2068a[s1.b.f2111q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2068a[s1.b.f2112r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2068a[s1.b.f2113s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2068a[s1.b.f2114t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2068a[s1.b.f2110p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2068a[s1.b.f2108n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2068a[s1.b.f2105k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2068a[s1.b.f2106l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2068a[s1.b.f2107m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public Object b(o oVar, r0 r0Var, int i10) {
        return oVar.a(r0Var, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public t<x.d> d(Object obj) {
        return ((x.c) obj).U();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public boolean e(r0 r0Var) {
        return r0Var instanceof x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<x.d> tVar, UB ub, n1<UT, UB> n1Var) {
        Object i10;
        ArrayList arrayList;
        x.e eVar = (x.e) obj2;
        int c10 = eVar.c();
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f2068a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f1Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f1Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f1Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f1Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f1Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f1Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f1Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f1Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f1Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f1Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f1Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f1Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f1Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f1Var.j(arrayList);
                    eVar.b.b();
                    ub = (UB) i1.z(obj, c10, arrayList, null, ub, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
            tVar.y(eVar.b, arrayList);
            return ub;
        }
        Object obj3 = null;
        if (eVar.a() == s1.b.f2110p) {
            f1Var.p();
            eVar.b.b();
            throw null;
        }
        int[] iArr = a.f2068a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                obj3 = Double.valueOf(f1Var.readDouble());
                break;
            case 2:
                obj3 = Float.valueOf(f1Var.readFloat());
                break;
            case 3:
                obj3 = Long.valueOf(f1Var.H());
                break;
            case 4:
                obj3 = Long.valueOf(f1Var.s());
                break;
            case 5:
                obj3 = Integer.valueOf(f1Var.p());
                break;
            case 6:
                obj3 = Long.valueOf(f1Var.b());
                break;
            case 7:
                obj3 = Integer.valueOf(f1Var.u());
                break;
            case 8:
                obj3 = Boolean.valueOf(f1Var.e());
                break;
            case 9:
                obj3 = Integer.valueOf(f1Var.h());
                break;
            case 10:
                obj3 = Integer.valueOf(f1Var.E());
                break;
            case 11:
                obj3 = Long.valueOf(f1Var.f());
                break;
            case 12:
                obj3 = Integer.valueOf(f1Var.l());
                break;
            case 13:
                obj3 = Long.valueOf(f1Var.y());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                obj3 = f1Var.o();
                break;
            case 16:
                obj3 = f1Var.z();
                break;
            case 17:
                if (!eVar.d()) {
                    Object i11 = tVar.i(eVar.b);
                    if (i11 instanceof x) {
                        g1 d10 = c1.a().d(i11);
                        if (!((x) i11).I()) {
                            Object e10 = d10.e();
                            d10.a(e10, i11);
                            tVar.y(eVar.b, e10);
                            i11 = e10;
                        }
                        f1Var.O(i11, d10, oVar);
                        return ub;
                    }
                }
                obj3 = f1Var.M(eVar.b().getClass(), oVar);
                break;
            case 18:
                if (!eVar.d()) {
                    Object i12 = tVar.i(eVar.b);
                    if (i12 instanceof x) {
                        g1 d11 = c1.a().d(i12);
                        if (!((x) i12).I()) {
                            Object e11 = d11.e();
                            d11.a(e11, i12);
                            tVar.y(eVar.b, e11);
                            i12 = e11;
                        }
                        f1Var.J(i12, d11, oVar);
                        return ub;
                    }
                }
                obj3 = f1Var.L(eVar.b().getClass(), oVar);
                break;
        }
        if (eVar.d()) {
            tVar.a(eVar.b, obj3);
            return ub;
        }
        int i13 = iArr[eVar.a().ordinal()];
        if ((i13 == 17 || i13 == 18) && (i10 = tVar.i(eVar.b)) != null) {
            obj3 = z.g(i10, obj3);
        }
        tVar.y(eVar.b, obj3);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void h(f1 f1Var, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        tVar.y(eVar.b, f1Var.L(eVar.b().getClass(), oVar));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void i(g gVar, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        r0.a e10 = eVar.b().e();
        h m10 = gVar.m();
        e10.u(m10, oVar);
        tVar.y(eVar.b, e10.d());
        m10.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void j(t1 t1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f2068a[dVar.g().ordinal()]) {
                case 1:
                    t1Var.p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    t1Var.B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    t1Var.u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    t1Var.f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    t1Var.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    t1Var.s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    t1Var.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    t1Var.v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    t1Var.o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    t1Var.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    t1Var.i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    t1Var.H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    t1Var.m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    t1Var.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    t1Var.K(dVar.getNumber(), (g) entry.getValue());
                    break;
                case 16:
                    t1Var.e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    t1Var.N(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    t1Var.L(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2068a[dVar.g().ordinal()]) {
            case 1:
                i1.O(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 2:
                i1.S(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 3:
                i1.V(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 4:
                i1.d0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 5:
                i1.U(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 6:
                i1.R(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 7:
                i1.Q(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 8:
                i1.M(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 9:
                i1.c0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 10:
                i1.X(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 11:
                i1.Y(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 12:
                i1.Z(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 13:
                i1.a0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 14:
                i1.U(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 15:
                i1.N(dVar.getNumber(), (List) entry.getValue(), t1Var);
                break;
            case 16:
                i1.b0(dVar.getNumber(), (List) entry.getValue(), t1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    i1.T(dVar.getNumber(), (List) entry.getValue(), t1Var, c1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    i1.W(dVar.getNumber(), (List) entry.getValue(), t1Var, c1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
