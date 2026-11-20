package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class wa {

    /* renamed from: d, reason: collision with root package name */
    public static final wa f6915d = new wa(true);

    /* renamed from: a, reason: collision with root package name */
    public final hd f6916a = new dd();
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6917c;

    public wa() {
    }

    public static wa a() {
        return f6915d;
    }

    public static void f(ma maVar, wd wdVar, int i10, Object obj) {
        if (wdVar == wd.f6929l) {
            oc ocVar = (oc) obj;
            qb.d(ocVar);
            maVar.i(i10, 3);
            ocVar.c(maVar);
            maVar.i(i10, 4);
            return;
        }
        maVar.i(i10, wdVar.b());
        xd xdVar = xd.INT;
        switch (wdVar.ordinal()) {
            case 0:
                maVar.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                maVar.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                maVar.B(((Long) obj).longValue());
                break;
            case 3:
                maVar.B(((Long) obj).longValue());
                break;
            case 4:
                maVar.y(((Integer) obj).intValue());
                break;
            case 5:
                maVar.C(((Long) obj).longValue());
                break;
            case 6:
                maVar.A(((Integer) obj).intValue());
                break;
            case 7:
                maVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ha)) {
                    maVar.E((String) obj);
                    break;
                } else {
                    maVar.r((ha) obj);
                    break;
                }
            case 9:
                ((oc) obj).c(maVar);
                break;
            case 10:
                maVar.w((oc) obj);
                break;
            case 11:
                if (!(obj instanceof ha)) {
                    byte[] bArr = (byte[]) obj;
                    maVar.s(bArr, 0, bArr.length);
                    break;
                } else {
                    maVar.r((ha) obj);
                    break;
                }
            case 12:
                maVar.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof kb)) {
                    maVar.y(((Integer) obj).intValue());
                    break;
                } else {
                    maVar.y(((kb) obj).zza());
                    break;
                }
            case 14:
                maVar.A(((Integer) obj).intValue());
                break;
            case 15:
                maVar.C(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                maVar.z((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                maVar.B((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int h(wd wdVar, int i10, Object obj) {
        int G = ma.G(i10 << 3);
        if (wdVar == wd.f6929l) {
            qb.d((oc) obj);
            G += G;
        }
        return G + i(wdVar, obj);
    }

    public static int i(wd wdVar, Object obj) {
        int d10;
        int G;
        wd wdVar2 = wd.f6920c;
        xd xdVar = xd.INT;
        switch (wdVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = ma.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = ma.b;
                return 4;
            case 2:
                return ma.a(((Long) obj).longValue());
            case 3:
                return ma.a(((Long) obj).longValue());
            case 4:
                return ma.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = ma.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = ma.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = ma.b;
                return 1;
            case 8:
                if (!(obj instanceof ha)) {
                    return ma.b((String) obj);
                }
                Logger logger6 = ma.b;
                d10 = ((ha) obj).d();
                G = ma.G(d10);
                break;
            case 9:
                return ((oc) obj).a();
            case 10:
                if (!(obj instanceof wb)) {
                    return ma.c((oc) obj);
                }
                Logger logger7 = ma.b;
                d10 = ((wb) obj).b();
                G = ma.G(d10);
                break;
            case 11:
                if (!(obj instanceof ha)) {
                    Logger logger8 = ma.b;
                    d10 = ((byte[]) obj).length;
                    G = ma.G(d10);
                    break;
                } else {
                    Logger logger9 = ma.b;
                    d10 = ((ha) obj).d();
                    G = ma.G(d10);
                    break;
                }
            case 12:
                return ma.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof kb ? ma.a(((kb) obj).zza()) : ma.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = ma.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = ma.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return ma.G((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return ma.a((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return G + d10;
    }

    public static int j(va vaVar, Object obj) {
        wd zzb = vaVar.zzb();
        int zza = vaVar.zza();
        if (!vaVar.zzd()) {
            return h(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!vaVar.zze()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += h(zzb, zza, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += i(zzb, list.get(i10));
            i10++;
        }
        return ma.G(zza << 3) + i12 + ma.G(i12);
    }

    public static boolean k(Map.Entry entry) {
        va vaVar = (va) entry.getKey();
        if (vaVar.zzc() != xd.MESSAGE) {
            return true;
        }
        if (!vaVar.zzd()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(Object obj) {
        if (obj instanceof pc) {
            return ((pc) obj).f();
        }
        if (obj instanceof wb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int m(Map.Entry entry) {
        int i10;
        int G;
        int G2;
        va vaVar = (va) entry.getKey();
        Object value = entry.getValue();
        if (vaVar.zzc() != xd.MESSAGE || vaVar.zzd() || vaVar.zze()) {
            return j(vaVar, value);
        }
        if (value instanceof wb) {
            int zza = ((va) entry.getKey()).zza();
            int G3 = ma.G(8);
            i10 = G3 + G3;
            G = ma.G(16) + ma.G(zza);
            int G4 = ma.G(24);
            int b = ((wb) value).b();
            G2 = G4 + ma.G(b) + b;
        } else {
            int zza2 = ((va) entry.getKey()).zza();
            int G5 = ma.G(8);
            i10 = G5 + G5;
            G = ma.G(16) + ma.G(zza2);
            G2 = ma.G(24) + ma.c((oc) value);
        }
        return i10 + G + G2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(com.google.android.gms.internal.measurement.va r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.wd r0 = r2.zzb()
            java.nio.charset.Charset r1 = com.google.android.gms.internal.measurement.qb.f6799a
            r3.getClass()
            com.google.android.gms.internal.measurement.wd r1 = com.google.android.gms.internal.measurement.wd.f6920c
            com.google.android.gms.internal.measurement.xd r1 = com.google.android.gms.internal.measurement.xd.INT
            com.google.android.gms.internal.measurement.xd r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.oc
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.wb
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.kb
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.ha
            if (r0 != 0) goto L33
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.wd r2 = r2.zzb()
            com.google.android.gms.internal.measurement.xd r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.wa.n(com.google.android.gms.internal.measurement.va, java.lang.Object):void");
    }

    public final void b() {
        if (this.b) {
            return;
        }
        hd hdVar = this.f6916a;
        int c10 = hdVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Object value = hdVar.d(i10).getValue();
            if (value instanceof gb) {
                ((gb) value).p();
            }
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof gb) {
                ((gb) value2).p();
            }
        }
        hdVar.a();
        this.b = true;
    }

    public final Iterator c() {
        hd hdVar = this.f6916a;
        return hdVar.isEmpty() ? Collections.emptyIterator() : this.f6917c ? new vb(hdVar.entrySet().iterator()) : hdVar.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        wa waVar = new wa();
        hd hdVar = this.f6916a;
        int c10 = hdVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Map.Entry d10 = hdVar.d(i10);
            waVar.d((va) ((ed) d10).a(), d10.getValue());
        }
        for (Map.Entry entry : hdVar.e()) {
            waVar.d((va) entry.getKey(), entry.getValue());
        }
        waVar.f6917c = this.f6917c;
        return waVar;
    }

    public final void d(va vaVar, Object obj) {
        if (!vaVar.zzd()) {
            n(vaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(vaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof wb) {
            this.f6917c = true;
        }
        this.f6916a.put(vaVar, obj);
    }

    public final boolean e() {
        hd hdVar = this.f6916a;
        int c10 = hdVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            if (!k(hdVar.d(i10))) {
                return false;
            }
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wa) {
            return this.f6916a.equals(((wa) obj).f6916a);
        }
        return false;
    }

    public final int g() {
        hd hdVar = this.f6916a;
        int c10 = hdVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            i10 += m(hdVar.d(i11));
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            i10 += m((Map.Entry) it.next());
        }
        return i10;
    }

    public final int hashCode() {
        return this.f6916a.hashCode();
    }

    public wa(boolean z10) {
        b();
        b();
    }
}
