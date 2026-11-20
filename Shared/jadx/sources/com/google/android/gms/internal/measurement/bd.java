package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public static final ld f6438a;

    static {
        wc wcVar = wc.f6918c;
        f6438a = new nd();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ma.G(i10 << 3) + 4);
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ma.G(i10 << 3) + 8);
    }

    public static int E(int i10, Object obj, zc zcVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof xb)) {
            return ma.G(i11) + ma.d((oc) obj, zcVar);
        }
        int G = ma.G(i11);
        int b = ((xb) obj).b();
        return G + ma.G(b) + b;
    }

    public static ld a() {
        return f6438a;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(sa saVar, Object obj, Object obj2) {
        if (((db) obj2).zzb.f6916a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void d(ld ldVar, Object obj, Object obj2) {
        gb gbVar = (gb) obj;
        md mdVar = gbVar.zzc;
        md mdVar2 = ((gb) obj2).zzc;
        if (!md.a().equals(mdVar2)) {
            if (md.a().equals(mdVar)) {
                mdVar = md.c(mdVar, mdVar2);
            } else {
                mdVar.l(mdVar2);
            }
        }
        gbVar.zzc = mdVar;
    }

    public static Object e(Object obj, int i10, int i11, Object obj2, ld ldVar) {
        if (obj2 == null) {
            obj2 = ldVar.a(obj);
        }
        ((md) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.C(i10, list, z10);
    }

    public static void g(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.f(i10, list, z10);
    }

    public static void h(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.x(i10, list, z10);
    }

    public static void i(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.c(i10, list, z10);
    }

    public static void j(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.q(i10, list, z10);
    }

    public static void k(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.m(i10, list, z10);
    }

    public static void l(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.z(i10, list, z10);
    }

    public static void m(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.L(i10, list, z10);
    }

    public static void n(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.B(i10, list, z10);
    }

    public static void o(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.b(i10, list, z10);
    }

    public static void p(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.I(i10, list, z10);
    }

    public static void q(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.y(i10, list, z10);
    }

    public static void r(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.g(i10, list, z10);
    }

    public static void s(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.H(i10, list, z10);
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += ma.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        cc ccVar = (cc) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += ma.a(ccVar.u0(i10));
            i10++;
        }
        return i12;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += ma.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        cc ccVar = (cc) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += ma.a(ccVar.u0(i10));
            i10++;
        }
        return i12;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += ma.a((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        cc ccVar = (cc) list;
        int i12 = 0;
        while (i10 < size) {
            long u02 = ccVar.u0(i10);
            i12 += ma.a((u02 >> 63) ^ (u02 + u02));
            i10++;
        }
        return i12;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += ma.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        hb hbVar = (hb) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += ma.a(hbVar.c(i10));
            i10++;
        }
        return i12;
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += ma.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        hb hbVar = (hb) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += ma.a(hbVar.c(i10));
            i10++;
        }
        return i12;
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += ma.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        hb hbVar = (hb) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += ma.G(hbVar.c(i10));
            i10++;
        }
        return i12;
    }

    public static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += ma.G((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        hb hbVar = (hb) list;
        int i12 = 0;
        while (i10 < size) {
            int c10 = hbVar.c(i10);
            i12 += ma.G((c10 >> 31) ^ (c10 + c10));
            i10++;
        }
        return i12;
    }
}
