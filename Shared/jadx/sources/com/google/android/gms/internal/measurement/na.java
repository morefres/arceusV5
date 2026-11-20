package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class na implements yd {

    /* renamed from: a, reason: collision with root package name */
    public final ma f6737a;

    public na(ma maVar) {
        Charset charset = qb.f6799a;
        this.f6737a = maVar;
        maVar.f6673a = this;
    }

    public static na M(ma maVar) {
        na naVar = maVar.f6673a;
        return naVar != null ? naVar : new na(maVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void A(int i10, long j10) {
        this.f6737a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += ma.G(((Integer) list.get(i13)).intValue());
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6737a.k(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            i14 += ma.G(hbVar.c(i15));
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.z(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof oa)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        oa oaVar = (oa) list;
        if (!z10) {
            while (i11 < oaVar.size()) {
                this.f6737a.n(i10, Double.doubleToRawLongBits(oaVar.c(i11)));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < oaVar.size(); i15++) {
            oaVar.c(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < oaVar.size()) {
            maVar2.C(Double.doubleToRawLongBits(oaVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void D(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f6737a.q(i10, (ha) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void E(int i10, int i11) {
        this.f6737a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void F(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof yb)) {
            while (i11 < list.size()) {
                this.f6737a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        yb ybVar = (yb) list;
        while (i11 < list.size()) {
            Object zzc = ybVar.zzc();
            if (zzc instanceof String) {
                this.f6737a.p(i10, (String) zzc);
            } else {
                this.f6737a.q(i10, (ha) zzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void G(int i10, int i11) {
        this.f6737a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof x9)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        x9 x9Var = (x9) list;
        if (!z10) {
            while (i11 < x9Var.size()) {
                this.f6737a.o(i10, x9Var.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x9Var.size(); i15++) {
            x9Var.c(i15);
            i14++;
        }
        maVar2.z(i14);
        while (i11 < x9Var.size()) {
            maVar2.x(x9Var.c(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6737a.l(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            hbVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.A(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void J(int i10, Object obj) {
        if (obj instanceof ha) {
            this.f6737a.v(i10, (ha) obj);
        } else {
            this.f6737a.u(i10, (oc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void K(int i10, boolean z10) {
        this.f6737a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += ma.a(((Integer) list.get(i13)).intValue());
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6737a.j(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            i14 += ma.a(hbVar.c(i15));
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.y(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void a(int i10, double d10) {
        this.f6737a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    ma maVar = this.f6737a;
                    int intValue = ((Integer) list.get(i11)).intValue();
                    maVar.k(i10, (intValue >> 31) ^ (intValue + intValue));
                    i11++;
                }
                return;
            }
            ma maVar2 = this.f6737a;
            maVar2.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue2 = ((Integer) list.get(i13)).intValue();
                i12 += ma.G((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            maVar2.z(i12);
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                maVar2.z((intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                ma maVar3 = this.f6737a;
                int c10 = hbVar.c(i11);
                maVar3.k(i10, (c10 >> 31) ^ (c10 + c10));
                i11++;
            }
            return;
        }
        ma maVar4 = this.f6737a;
        maVar4.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            int c11 = hbVar.c(i15);
            i14 += ma.G((c11 >> 31) ^ (c11 + c11));
        }
        maVar4.z(i14);
        while (i11 < hbVar.size()) {
            int c12 = hbVar.c(i11);
            maVar4.z((c12 >> 31) ^ (c12 + c12));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += ma.a(((Long) list.get(i13)).longValue());
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6737a.m(i10, ccVar.u0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            i14 += ma.a(ccVar.u0(i15));
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.B(ccVar.u0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void d(int i10, int i11) {
        this.f6737a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void e(int i10, int i11) {
        this.f6737a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof ya)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z10) {
            while (i11 < yaVar.size()) {
                this.f6737a.l(i10, Float.floatToRawIntBits(yaVar.c(i11)));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < yaVar.size(); i15++) {
            yaVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < yaVar.size()) {
            maVar2.A(Float.floatToRawIntBits(yaVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += ma.a(((Integer) list.get(i13)).intValue());
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6737a.j(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            i14 += ma.a(hbVar.c(i15));
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.y(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void h(int i10, int i11) {
        this.f6737a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void i(int i10, gc gcVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            maVar.z(hc.c(gcVar, entry.getKey(), entry.getValue()));
            hc.b(maVar, gcVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void j(int i10, Object obj, zc zcVar) {
        this.f6737a.t(i10, (oc) obj, zcVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void k(int i10, long j10) {
        this.f6737a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void l(int i10, long j10) {
        this.f6737a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6737a.n(i10, ccVar.u0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            ccVar.u0(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.C(ccVar.u0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    @Deprecated
    public final void n(int i10) {
        this.f6737a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    @Deprecated
    public final void o(int i10) {
        this.f6737a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void p(int i10, String str) {
        this.f6737a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    ma maVar = this.f6737a;
                    long longValue = ((Long) list.get(i11)).longValue();
                    maVar.m(i10, (longValue >> 63) ^ (longValue + longValue));
                    i11++;
                }
                return;
            }
            ma maVar2 = this.f6737a;
            maVar2.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue2 = ((Long) list.get(i13)).longValue();
                i12 += ma.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            maVar2.z(i12);
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                maVar2.B((longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                ma maVar3 = this.f6737a;
                long u02 = ccVar.u0(i11);
                maVar3.m(i10, (u02 >> 63) ^ (u02 + u02));
                i11++;
            }
            return;
        }
        ma maVar4 = this.f6737a;
        maVar4.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            long u03 = ccVar.u0(i15);
            i14 += ma.a((u03 >> 63) ^ (u03 + u03));
        }
        maVar4.z(i14);
        while (i11 < ccVar.size()) {
            long u04 = ccVar.u0(i11);
            maVar4.B((u04 >> 63) ^ (u04 + u04));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void r(int i10, int i11) {
        this.f6737a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void s(int i10, Object obj, zc zcVar) {
        ma maVar = this.f6737a;
        maVar.i(i10, 3);
        zcVar.e((oc) obj, maVar.f6673a);
        maVar.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void t(int i10, long j10) {
        this.f6737a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void u(int i10, float f10) {
        this.f6737a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void v(int i10, ha haVar) {
        this.f6737a.q(i10, haVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void w(int i10, long j10) {
        this.f6737a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += ma.a(((Long) list.get(i13)).longValue());
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6737a.m(i10, ccVar.u0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            i14 += ma.a(ccVar.u0(i15));
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.B(ccVar.u0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6737a.l(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            hbVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.A(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6737a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6737a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6737a.n(i10, ccVar.u0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6737a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            ccVar.u0(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.C(ccVar.u0(i11));
            i11++;
        }
    }
}
