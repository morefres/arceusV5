package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q a(String str, f fVar, u4 u4Var, List list) {
        double d10;
        Double valueOf = Double.valueOf(-1.0d);
        String str2 = ",";
        double d11 = 0.0d;
        k kVar = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    v5.a("toString", 0, list);
                    return new u(fVar.z(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    f fVar2 = (f) fVar.a();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            q a10 = u4Var.a((q) it.next());
                            if (a10 instanceof h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int k10 = fVar2.k();
                            if (a10 instanceof f) {
                                f fVar3 = (f) a10;
                                Iterator i11 = fVar3.i();
                                while (i11.hasNext()) {
                                    Integer num = (Integer) i11.next();
                                    fVar2.p(num.intValue() + k10, fVar3.m(num.intValue()));
                                }
                            } else {
                                fVar2.p(k10, a10);
                            }
                        }
                    }
                    return fVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    v5.a("filter", 1, list);
                    q a11 = u4Var.a((q) list.get(0));
                    if (!(a11 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return new f();
                    }
                    f fVar4 = (f) fVar.a();
                    f c10 = c(fVar, u4Var, (p) a11, null, Boolean.TRUE);
                    f fVar5 = new f();
                    Iterator i12 = c10.i();
                    while (i12.hasNext()) {
                        fVar5.p(fVar5.k(), fVar4.m(((Integer) i12.next()).intValue()));
                    }
                    return fVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return b(fVar, u4Var, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new f();
                    }
                    int i13 = (int) v5.i(u4Var.a((q) list.get(0)).zzd().doubleValue());
                    if (i13 < 0) {
                        i13 = Math.max(0, i13 + fVar.k());
                    } else if (i13 > fVar.k()) {
                        i13 = fVar.k();
                    }
                    int k11 = fVar.k();
                    f fVar6 = new f();
                    if (list.size() > 1) {
                        int max = Math.max(0, (int) v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue()));
                        if (max > 0) {
                            for (int i14 = i13; i14 < Math.min(k11, i13 + max); i14++) {
                                fVar6.p(fVar6.k(), fVar.m(i13));
                                fVar.y(i13);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i15 = 2; i15 < list.size(); i15++) {
                                q a12 = u4Var.a((q) list.get(i15));
                                if (a12 instanceof h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                fVar.v((i13 + i15) - 2, a12);
                            }
                        }
                    } else {
                        while (i13 < k11) {
                            fVar6.p(fVar6.k(), fVar.m(i13));
                            fVar.p(i13, null);
                            i13++;
                        }
                    }
                    return fVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    v5.a("forEach", 1, list);
                    q a13 = u4Var.a((q) list.get(0));
                    if (!(a13 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return q.f6791yo;
                    }
                    c(fVar, u4Var, (p) a13, null, null);
                    return q.f6791yo;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    v5.c("lastIndexOf", 2, list);
                    q qVar = q.f6791yo;
                    if (!list.isEmpty()) {
                        qVar = u4Var.a((q) list.get(0));
                    }
                    int k12 = fVar.k() - 1;
                    if (list.size() > 1) {
                        q a14 = u4Var.a((q) list.get(1));
                        d10 = Double.isNaN(a14.zzd().doubleValue()) ? fVar.k() - 1 : v5.i(a14.zzd().doubleValue());
                        if (d10 < 0.0d) {
                            d10 += fVar.k();
                        }
                    } else {
                        d10 = k12;
                    }
                    if (d10 < 0.0d) {
                        return new j(valueOf);
                    }
                    for (int min = (int) Math.min(fVar.k(), d10); min >= 0; min--) {
                        if (fVar.t(min) && v5.f(fVar.m(min), qVar)) {
                            return new j(Double.valueOf(min));
                        }
                    }
                    return new j(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        f fVar7 = new f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            q a15 = u4Var.a((q) it2.next());
                            if (a15 instanceof h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            fVar7.p(fVar7.k(), a15);
                        }
                        int k13 = fVar7.k();
                        Iterator i16 = fVar.i();
                        while (i16.hasNext()) {
                            Integer num2 = (Integer) i16.next();
                            fVar7.p(num2.intValue() + k13, fVar.m(num2.intValue()));
                        }
                        fVar.u();
                        Iterator i17 = fVar7.i();
                        while (i17.hasNext()) {
                            Integer num3 = (Integer) i17.next();
                            fVar.p(num3.intValue(), fVar7.m(num3.intValue()));
                        }
                    }
                    return new j(Double.valueOf(fVar.k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    v5.a("map", 1, list);
                    q a16 = u4Var.a((q) list.get(0));
                    if (a16 instanceof p) {
                        return fVar.k() == 0 ? new f() : c(fVar, u4Var, (p) a16, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    v5.a("pop", 0, list);
                    int k14 = fVar.k();
                    if (k14 == 0) {
                        return q.f6791yo;
                    }
                    int i18 = k14 - 1;
                    q m10 = fVar.m(i18);
                    fVar.y(i18);
                    return m10;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    v5.c("join", 1, list);
                    if (fVar.k() == 0) {
                        return q.Fo;
                    }
                    if (!list.isEmpty()) {
                        q a17 = u4Var.a((q) list.get(0));
                        str2 = ((a17 instanceof o) || (a17 instanceof v)) ? "" : a17.zzc();
                    }
                    return new u(fVar.z(str2));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            fVar.p(fVar.k(), u4Var.a((q) it3.next()));
                        }
                    }
                    return new j(Double.valueOf(fVar.k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    v5.a("some", 1, list);
                    q a18 = u4Var.a((q) list.get(0));
                    if (!(a18 instanceof k)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.k() == 0) {
                        return q.Eo;
                    }
                    k kVar2 = (k) a18;
                    Iterator i19 = fVar.i();
                    while (i19.hasNext()) {
                        int intValue = ((Integer) i19.next()).intValue();
                        if (fVar.t(intValue) && kVar2.h(u4Var, Arrays.asList(fVar.m(intValue), new j(Double.valueOf(intValue)), fVar)).zze().booleanValue()) {
                            return q.Do;
                        }
                    }
                    return q.Eo;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    v5.c("sort", 1, list);
                    if (fVar.k() >= 2) {
                        List h10 = fVar.h();
                        if (!list.isEmpty()) {
                            q a19 = u4Var.a((q) list.get(0));
                            if (!(a19 instanceof k)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            kVar = (k) a19;
                        }
                        Collections.sort(h10, new b0(kVar, u4Var));
                        fVar.u();
                        Iterator it4 = h10.iterator();
                        while (it4.hasNext()) {
                            fVar.p(i10, (q) it4.next());
                            i10++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    v5.a("every", 1, list);
                    q a20 = u4Var.a((q) list.get(0));
                    if (!(a20 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.k() != 0 && c(fVar, u4Var, (p) a20, Boolean.FALSE, Boolean.TRUE).k() != fVar.k()) {
                        return q.Eo;
                    }
                    return q.Do;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    v5.a("shift", 0, list);
                    if (fVar.k() == 0) {
                        return q.f6791yo;
                    }
                    q m11 = fVar.m(0);
                    fVar.y(0);
                    return m11;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    v5.c("slice", 2, list);
                    if (list.isEmpty()) {
                        return fVar.a();
                    }
                    double k15 = fVar.k();
                    double i20 = v5.i(u4Var.a((q) list.get(0)).zzd().doubleValue());
                    double max2 = i20 < 0.0d ? Math.max(i20 + k15, 0.0d) : Math.min(i20, k15);
                    if (list.size() == 2) {
                        double i21 = v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue());
                        k15 = i21 < 0.0d ? Math.max(k15 + i21, 0.0d) : Math.min(k15, i21);
                    }
                    f fVar8 = new f();
                    for (int i22 = (int) max2; i22 < k15; i22++) {
                        fVar8.p(fVar8.k(), fVar.m(i22));
                    }
                    return fVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return b(fVar, u4Var, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    v5.a("reverse", 0, list);
                    int k16 = fVar.k();
                    if (k16 != 0) {
                        while (i10 < k16 / 2) {
                            if (fVar.t(i10)) {
                                q m12 = fVar.m(i10);
                                fVar.p(i10, null);
                                int i23 = (k16 - 1) - i10;
                                if (fVar.t(i23)) {
                                    fVar.p(i10, fVar.m(i23));
                                }
                                fVar.p(i23, m12);
                            }
                            i10++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    v5.c("indexOf", 2, list);
                    q qVar2 = q.f6791yo;
                    if (!list.isEmpty()) {
                        qVar2 = u4Var.a((q) list.get(0));
                    }
                    if (list.size() > 1) {
                        double i24 = v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue());
                        if (i24 >= fVar.k()) {
                            return new j(valueOf);
                        }
                        d11 = i24 < 0.0d ? fVar.k() + i24 : i24;
                    }
                    Iterator i25 = fVar.i();
                    while (i25.hasNext()) {
                        int intValue2 = ((Integer) i25.next()).intValue();
                        double d12 = intValue2;
                        if (d12 >= d11 && v5.f(fVar.m(intValue2), qVar2)) {
                            return new j(Double.valueOf(d12));
                        }
                    }
                    return new j(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static q b(f fVar, u4 u4Var, List list, boolean z10) {
        q qVar;
        v5.b("reduce", 1, list);
        v5.c("reduce", 2, list);
        q a10 = u4Var.a((q) list.get(0));
        if (!(a10 instanceof k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            qVar = u4Var.a((q) list.get(1));
            if (qVar instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.k() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            qVar = null;
        }
        k kVar = (k) a10;
        int k10 = fVar.k();
        int i10 = z10 ? 0 : k10 - 1;
        int i11 = z10 ? k10 - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (qVar == null) {
            qVar = fVar.m(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (fVar.t(i10)) {
                qVar = kVar.h(u4Var, Arrays.asList(qVar, fVar.m(i10), new j(Double.valueOf(i10)), fVar));
                if (qVar instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return qVar;
    }

    public static f c(f fVar, u4 u4Var, k kVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator i10 = fVar.i();
        while (i10.hasNext()) {
            int intValue = ((Integer) i10.next()).intValue();
            if (fVar.t(intValue)) {
                q h10 = kVar.h(u4Var, Arrays.asList(fVar.m(intValue), new j(Double.valueOf(intValue)), fVar));
                if (h10.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || h10.zze().equals(bool2)) {
                    fVar2.p(intValue, h10);
                }
            }
        }
        return fVar2;
    }
}
