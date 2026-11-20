package com.google.android.gms.internal.measurement;

import androidx.core.view.MotionEventCompat;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends x {
    public z() {
        this.f6941a.add(n0.EQUALS);
        this.f6941a.add(n0.GREATER_THAN);
        this.f6941a.add(n0.GREATER_THAN_EQUALS);
        this.f6941a.add(n0.IDENTITY_EQUALS);
        this.f6941a.add(n0.IDENTITY_NOT_EQUALS);
        this.f6941a.add(n0.LESS_THAN);
        this.f6941a.add(n0.LESS_THAN_EQUALS);
        this.f6941a.add(n0.NOT_EQUALS);
    }

    public static boolean c(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.zzc());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.zzc());
        }
        if ((qVar instanceof u) && (qVar2 instanceof u)) {
            return qVar.zzc().compareTo(qVar2.zzc()) < 0;
        }
        double doubleValue = qVar.zzd().doubleValue();
        double doubleValue2 = qVar2.zzd().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(q qVar, q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof v) || (qVar instanceof o)) {
                return true;
            }
            return qVar instanceof j ? (Double.isNaN(qVar.zzd().doubleValue()) || Double.isNaN(qVar2.zzd().doubleValue()) || qVar.zzd().doubleValue() != qVar2.zzd().doubleValue()) ? false : true : qVar instanceof u ? qVar.zzc().equals(qVar2.zzc()) : qVar instanceof g ? qVar.zze().equals(qVar2.zze()) : qVar == qVar2;
        }
        if (((qVar instanceof v) || (qVar instanceof o)) && ((qVar2 instanceof v) || (qVar2 instanceof o))) {
            return true;
        }
        boolean z10 = qVar instanceof j;
        if (z10 && (qVar2 instanceof u)) {
            return d(qVar, new j(qVar2.zzd()));
        }
        boolean z11 = qVar instanceof u;
        if ((!z11 || !(qVar2 instanceof j)) && !(qVar instanceof g)) {
            if (qVar2 instanceof g) {
                return d(qVar, new j(qVar2.zzd()));
            }
            if ((z11 || z10) && (qVar2 instanceof m)) {
                return d(qVar, new u(qVar2.zzc()));
            }
            if ((qVar instanceof m) && ((qVar2 instanceof u) || (qVar2 instanceof j))) {
                return d(new u(qVar.zzc()), qVar2);
            }
            return false;
        }
        return d(new j(qVar.zzd()), qVar2);
    }

    public static boolean e(q qVar, q qVar2) {
        if (qVar instanceof m) {
            qVar = new u(qVar.zzc());
        }
        if (qVar2 instanceof m) {
            qVar2 = new u(qVar2.zzc());
        }
        return (((qVar instanceof u) && (qVar2 instanceof u)) || !(Double.isNaN(qVar.zzd().doubleValue()) || Double.isNaN(qVar2.zzd().doubleValue()))) && !c(qVar2, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        boolean d10;
        boolean d11;
        v5.a(v5.e(str).name(), 2, list);
        q a10 = u4Var.a((q) list.get(0));
        q a11 = u4Var.a((q) list.get(1));
        int ordinal = v5.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d11 = d(a10, a11);
            } else if (ordinal == 42) {
                d10 = c(a10, a11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        d10 = c(a11, a10);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        d10 = e(a11, a10);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        d10 = v5.f(a10, a11);
                        break;
                    case 40:
                        d11 = v5.f(a10, a11);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                d10 = e(a10, a11);
            }
            d10 = !d11;
        } else {
            d10 = d(a10, a11);
        }
        return d10 ? q.Do : q.Eo;
    }
}
