package com.google.android.gms.internal.measurement;

import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends x {
    public j0() {
        this.f6941a.add(n0.FOR_IN);
        this.f6941a.add(n0.FOR_IN_CONST);
        this.f6941a.add(n0.FOR_IN_LET);
        this.f6941a.add(n0.FOR_LET);
        this.f6941a.add(n0.FOR_OF);
        this.f6941a.add(n0.FOR_OF_CONST);
        this.f6941a.add(n0.FOR_OF_LET);
        this.f6941a.add(n0.WHILE);
    }

    public static q c(h0 h0Var, q qVar, q qVar2) {
        return e(h0Var, qVar.zzf(), qVar2);
    }

    public static q d(h0 h0Var, q qVar, q qVar2) {
        if (qVar instanceof Iterable) {
            return e(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static q e(h0 h0Var, Iterator it, q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                q b = h0Var.a((q) it.next()).b((f) qVar);
                if (b instanceof h) {
                    h hVar = (h) b;
                    if ("break".equals(hVar.c())) {
                        return q.f6791yo;
                    }
                    if ("return".equals(hVar.c())) {
                        return hVar;
                    }
                }
            }
        }
        return q.f6791yo;
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int ordinal = v5.e(str).ordinal();
        if (ordinal == 65) {
            v5.a(n0.WHILE.name(), 4, list);
            q qVar = (q) list.get(0);
            q qVar2 = (q) list.get(1);
            q qVar3 = (q) list.get(2);
            q a10 = u4Var.a((q) list.get(3));
            if (u4Var.a(qVar3).zze().booleanValue()) {
                q b = u4Var.b((f) a10);
                if (b instanceof h) {
                    h hVar = (h) b;
                    if ("break".equals(hVar.c())) {
                        return q.f6791yo;
                    }
                    if ("return".equals(hVar.c())) {
                        return hVar;
                    }
                }
            }
            while (u4Var.a(qVar).zze().booleanValue()) {
                q b10 = u4Var.b((f) a10);
                if (b10 instanceof h) {
                    h hVar2 = (h) b10;
                    if ("break".equals(hVar2.c())) {
                        return q.f6791yo;
                    }
                    if ("return".equals(hVar2.c())) {
                        return hVar2;
                    }
                }
                u4Var.a(qVar2);
            }
            return q.f6791yo;
        }
        switch (ordinal) {
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                v5.a(n0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new i0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                v5.a(n0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new f0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                v5.a(n0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new g0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 29:
                v5.a(n0.FOR_LET.name(), 4, list);
                q a11 = u4Var.a((q) list.get(0));
                if (!(a11 instanceof f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                f fVar = (f) a11;
                q qVar4 = (q) list.get(1);
                q qVar5 = (q) list.get(2);
                q a12 = u4Var.a((q) list.get(3));
                u4 c10 = u4Var.c();
                for (int i10 = 0; i10 < fVar.k(); i10++) {
                    String zzc = fVar.m(i10).zzc();
                    c10.e(zzc, u4Var.h(zzc));
                }
                while (u4Var.a(qVar4).zze().booleanValue()) {
                    q b11 = u4Var.b((f) a12);
                    if (b11 instanceof h) {
                        h hVar3 = (h) b11;
                        if ("break".equals(hVar3.c())) {
                            return q.f6791yo;
                        }
                        if ("return".equals(hVar3.c())) {
                            return hVar3;
                        }
                    }
                    u4 c11 = u4Var.c();
                    for (int i11 = 0; i11 < fVar.k(); i11++) {
                        String zzc2 = fVar.m(i11).zzc();
                        c11.e(zzc2, c10.h(zzc2));
                    }
                    c11.a(qVar5);
                    c10 = c11;
                }
                return q.f6791yo;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                v5.a(n0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new i0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 31:
                v5.a(n0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new f0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            case 32:
                v5.a(n0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new g0(u4Var, ((q) list.get(0)).zzc()), u4Var.a((q) list.get(1)), u4Var.a((q) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
