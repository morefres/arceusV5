package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends x {
    public a0() {
        this.f6941a.add(n0.APPLY);
        this.f6941a.add(n0.BLOCK);
        this.f6941a.add(n0.BREAK);
        this.f6941a.add(n0.CASE);
        this.f6941a.add(n0.DEFAULT);
        this.f6941a.add(n0.CONTINUE);
        this.f6941a.add(n0.DEFINE_FUNCTION);
        this.f6941a.add(n0.FN);
        this.f6941a.add(n0.IF);
        this.f6941a.add(n0.QUOTE);
        this.f6941a.add(n0.RETURN);
        this.f6941a.add(n0.SWITCH);
        this.f6941a.add(n0.TERNARY);
    }

    public static q c(u4 u4Var, List list) {
        v5.b(n0.FN.name(), 2, list);
        q a10 = u4Var.a((q) list.get(0));
        q a11 = u4Var.a((q) list.get(1));
        if (!(a11 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", a11.getClass().getCanonicalName()));
        }
        List h10 = ((f) a11).h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new p(a10.zzc(), h10, arrayList, u4Var);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        if (ordinal == 2) {
            v5.a(n0.APPLY.name(), 3, list);
            q a10 = u4Var.a((q) list.get(0));
            String zzc = u4Var.a((q) list.get(1)).zzc();
            q a11 = u4Var.a((q) list.get(2));
            if (!(a11 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", a11.getClass().getCanonicalName()));
            }
            if (zzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return a10.e(zzc, u4Var, ((f) a11).h());
        }
        if (ordinal == 15) {
            v5.a(n0.BREAK.name(), 0, list);
            return q.Ao;
        }
        if (ordinal == 25) {
            return c(u4Var, list);
        }
        if (ordinal == 41) {
            v5.b(n0.IF.name(), 2, list);
            q a12 = u4Var.a((q) list.get(0));
            q a13 = u4Var.a((q) list.get(1));
            q a14 = list.size() > 2 ? u4Var.a((q) list.get(2)) : null;
            q qVar = q.f6791yo;
            q b = a12.zze().booleanValue() ? u4Var.b((f) a13) : a14 != null ? u4Var.b((f) a14) : qVar;
            return true != (b instanceof h) ? qVar : b;
        }
        if (ordinal == 54) {
            return new f(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return q.Co;
            }
            v5.a(n0.RETURN.name(), 1, list);
            return new h("return", u4Var.a((q) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                v5.b(n0.DEFINE_FUNCTION.name(), 2, list);
                p pVar = (p) c(u4Var, list);
                if (pVar.i() == null) {
                    u4Var.e("", pVar);
                    return pVar;
                }
                u4Var.e(pVar.i(), pVar);
                return pVar;
            }
            if (ordinal == 60) {
                v5.a(n0.SWITCH.name(), 3, list);
                q a15 = u4Var.a((q) list.get(0));
                q a16 = u4Var.a((q) list.get(1));
                q a17 = u4Var.a((q) list.get(2));
                if (!(a16 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(a17 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) a16;
                f fVar2 = (f) a17;
                boolean z10 = false;
                for (int i10 = 0; i10 < fVar.k(); i10++) {
                    if (z10 || a15.equals(u4Var.a(fVar.m(i10)))) {
                        q a18 = u4Var.a(fVar2.m(i10));
                        if (a18 instanceof h) {
                            return ((h) a18).c().equals("break") ? q.f6791yo : a18;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (fVar.k() + 1 == fVar2.k()) {
                    q a19 = u4Var.a(fVar2.m(fVar.k()));
                    if (a19 instanceof h) {
                        String c10 = ((h) a19).c();
                        if (c10.equals("return") || c10.equals("continue")) {
                            return a19;
                        }
                    }
                }
                return q.f6791yo;
            }
            if (ordinal == 61) {
                v5.a(n0.TERNARY.name(), 3, list);
                return u4Var.a((q) list.get(0)).zze().booleanValue() ? u4Var.a((q) list.get(1)) : u4Var.a((q) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return u4Var.c().b(new f(list));
                case 12:
                    v5.a(n0.BREAK.name(), 0, list);
                    return q.Bo;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return q.f6791yo;
        }
        q a20 = u4Var.a((q) list.get(0));
        return a20 instanceof f ? u4Var.b((f) a20) : q.f6791yo;
    }
}
