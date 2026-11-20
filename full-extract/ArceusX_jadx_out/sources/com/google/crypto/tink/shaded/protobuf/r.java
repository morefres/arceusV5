package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.s1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r extends q<y.d> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8597a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f8597a = iArr;
            try {
                iArr[s1.b.f8603c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8597a[s1.b.f8604d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8597a[s1.b.f8605e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8597a[s1.b.f8606f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8597a[s1.b.f8607g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8597a[s1.b.f8608h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8597a[s1.b.f8609i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8597a[s1.b.f8610j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8597a[s1.b.f8615o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8597a[s1.b.f8617q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8597a[s1.b.f8618r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8597a[s1.b.f8619s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8597a[s1.b.f8620t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8597a[s1.b.f8616p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8597a[s1.b.f8614n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8597a[s1.b.f8611k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8597a[s1.b.f8612l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8597a[s1.b.f8613m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public Object b(p pVar, s0 s0Var, int i10) {
        return pVar.a(s0Var, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> d(Object obj) {
        return ((y.c) obj).Z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public boolean e(s0 s0Var) {
        return s0Var instanceof y.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, p pVar, u<y.d> uVar, UB ub, n1<UT, UB> n1Var) {
        Object valueOf;
        Object i10;
        ArrayList arrayList;
        y.e eVar = (y.e) obj2;
        int c10 = eVar.c();
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f8597a[eVar.a().ordinal()]) {
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
                    ub = (UB) i1.z(obj, c10, arrayList, eVar.b.b(), ub, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
            uVar.x(eVar.b, arrayList);
            return ub;
        }
        if (eVar.a() != s1.b.f8616p) {
            switch (a.f8597a[eVar.a().ordinal()]) {
                case 1:
                    valueOf = Double.valueOf(f1Var.readDouble());
                    break;
                case 2:
                    valueOf = Float.valueOf(f1Var.readFloat());
                    break;
                case 3:
                    valueOf = Long.valueOf(f1Var.H());
                    break;
                case 4:
                    valueOf = Long.valueOf(f1Var.s());
                    break;
                case 5:
                    valueOf = Integer.valueOf(f1Var.p());
                    break;
                case 6:
                    valueOf = Long.valueOf(f1Var.b());
                    break;
                case 7:
                    valueOf = Integer.valueOf(f1Var.u());
                    break;
                case 8:
                    valueOf = Boolean.valueOf(f1Var.e());
                    break;
                case 9:
                    valueOf = Integer.valueOf(f1Var.h());
                    break;
                case 10:
                    valueOf = Integer.valueOf(f1Var.E());
                    break;
                case 11:
                    valueOf = Long.valueOf(f1Var.f());
                    break;
                case 12:
                    valueOf = Integer.valueOf(f1Var.l());
                    break;
                case 13:
                    valueOf = Long.valueOf(f1Var.y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = f1Var.o();
                    break;
                case 16:
                    valueOf = f1Var.z();
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object i11 = uVar.i(eVar.b);
                        if (i11 instanceof y) {
                            g1 d10 = c1.a().d(i11);
                            if (!((y) i11).J()) {
                                Object e10 = d10.e();
                                d10.a(e10, i11);
                                uVar.x(eVar.b, e10);
                                i11 = e10;
                            }
                            f1Var.J(i11, d10, pVar);
                            return ub;
                        }
                    }
                    valueOf = f1Var.K(eVar.b().getClass(), pVar);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object i12 = uVar.i(eVar.b);
                        if (i12 instanceof y) {
                            g1 d11 = c1.a().d(i12);
                            if (!((y) i12).J()) {
                                Object e11 = d11.e();
                                d11.a(e11, i12);
                                uVar.x(eVar.b, e11);
                                i12 = e11;
                            }
                            f1Var.M(i12, d11, pVar);
                            return ub;
                        }
                    }
                    valueOf = f1Var.O(eVar.b().getClass(), pVar);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        } else {
            int p8 = f1Var.p();
            if (eVar.b.b().a(p8) == null) {
                return (UB) i1.J(obj, c10, p8, ub, n1Var);
            }
            valueOf = Integer.valueOf(p8);
        }
        if (eVar.d()) {
            uVar.a(eVar.b, valueOf);
            return ub;
        }
        int i13 = a.f8597a[eVar.a().ordinal()];
        if ((i13 == 17 || i13 == 18) && (i10 = uVar.i(eVar.b)) != null) {
            valueOf = a0.g(i10, valueOf);
        }
        uVar.x(eVar.b, valueOf);
        return ub;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.b, f1Var.O(eVar.b().getClass(), pVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        s0.a e10 = eVar.b().e();
        i m10 = hVar.m();
        e10.B(m10, pVar);
        uVar.x(eVar.b, e10.d());
        m10.a(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void j(t1 t1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f8597a[dVar.g().ordinal()]) {
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
                    t1Var.M(dVar.getNumber(), (h) entry.getValue());
                    break;
                case 16:
                    t1Var.e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    t1Var.K(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    t1Var.N(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f8597a[dVar.g().ordinal()]) {
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
