package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: d, reason: collision with root package name */
    public static final k4 f7167d = new k4(true);

    /* renamed from: a, reason: collision with root package name */
    public final p6 f7168a = new j6();
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7169c;

    public k4() {
    }

    public static int a(g7 g7Var, int i10, Object obj) {
        int v5 = a4.v(i10 << 3);
        if (g7Var == g7.f7124l) {
            v5 += v5;
        }
        return v5 + b(g7Var, obj);
    }

    public static int b(g7 g7Var, Object obj) {
        int b;
        int v5;
        g7 g7Var2 = g7.f7115c;
        h7 h7Var = h7.INT;
        switch (g7Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z10 = a4.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z11 = a4.b;
                return 4;
            case 2:
                return a4.w(((Long) obj).longValue());
            case 3:
                return a4.w(((Long) obj).longValue());
            case 4:
                return a4.w(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z12 = a4.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z13 = a4.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z14 = a4.b;
                return 1;
            case 8:
                if (!(obj instanceof s3)) {
                    boolean z15 = a4.b;
                    int i10 = e7.f7085a;
                    b = c7.b((String) obj);
                    v5 = a4.v(b);
                    break;
                } else {
                    boolean z16 = a4.b;
                    b = ((s3) obj).d();
                    v5 = a4.v(b);
                    break;
                }
            case 9:
                return ((x5) obj).zzn();
            case 10:
                return obj instanceof d5 ? ((d5) obj).c() : a4.u((x5) obj);
            case 11:
                if (!(obj instanceof s3)) {
                    boolean z17 = a4.b;
                    b = ((byte[]) obj).length;
                    v5 = a4.v(b);
                    break;
                } else {
                    boolean z18 = a4.b;
                    b = ((s3) obj).d();
                    v5 = a4.v(b);
                    break;
                }
            case 12:
                return a4.v(((Integer) obj).intValue());
            case 13:
                return obj instanceof v4 ? a4.w(((v4) obj).zza()) : a4.w(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z19 = a4.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z20 = a4.b;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return a4.v((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return a4.w((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return v5 + b;
    }

    public static int c(j4 j4Var, Object obj) {
        g7 zzb = j4Var.zzb();
        int zza = j4Var.zza();
        if (!j4Var.zze()) {
            return a(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!j4Var.zzd()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a(zzb, zza, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += b(zzb, list.get(i10));
            i10++;
        }
        return a4.v(zza << 3) + i12 + a4.v(i12);
    }

    public static k4 e() {
        return f7167d;
    }

    public static boolean j(Map.Entry entry) {
        j4 j4Var = (j4) entry.getKey();
        if (j4Var.zzc() != h7.MESSAGE) {
            return true;
        }
        if (!j4Var.zze()) {
            return k(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!k(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Object obj) {
        if (obj instanceof y5) {
            return ((y5) obj).zzo();
        }
        if (obj instanceof d5) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int l(Map.Entry entry) {
        j4 j4Var = (j4) entry.getKey();
        Object value = entry.getValue();
        if (j4Var.zzc() != h7.MESSAGE || j4Var.zze() || j4Var.zzd()) {
            return c(j4Var, value);
        }
        if (value instanceof d5) {
            return ((d5) value).a(((j4) entry.getKey()).zza());
        }
        int zza = ((j4) entry.getKey()).zza();
        int v5 = a4.v(8);
        return v5 + v5 + a4.v(16) + a4.v(zza) + a4.v(24) + a4.u((x5) value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(com.google.android.gms.internal.play_billing.j4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.g7 r0 = r2.zzb()
            r3.getClass()
            com.google.android.gms.internal.play_billing.g7 r1 = com.google.android.gms.internal.play_billing.g7.f7115c
            com.google.android.gms.internal.play_billing.h7 r1 = com.google.android.gms.internal.play_billing.h7.INT
            com.google.android.gms.internal.play_billing.h7 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.x5
            if (r0 != 0) goto L1f
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.d5
            if (r0 == 0) goto L46
        L1f:
            return
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L28
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.v4
            if (r0 == 0) goto L46
        L28:
            return
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.s3
            if (r0 != 0) goto L31
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
        L31:
            return
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.play_billing.g7 r2 = r2.zzb()
            com.google.android.gms.internal.play_billing.h7 r2 = r2.a()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.k4.m(com.google.android.gms.internal.play_billing.j4, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        k4 k4Var = new k4();
        p6 p6Var = this.f7168a;
        int c10 = p6Var.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Map.Entry g10 = p6Var.g(i10);
            k4Var.h((j4) ((k6) g10).a(), g10.getValue());
        }
        for (Map.Entry entry : p6Var.d()) {
            k4Var.h((j4) entry.getKey(), entry.getValue());
        }
        k4Var.f7169c = this.f7169c;
        return k4Var;
    }

    public final int d() {
        p6 p6Var = this.f7168a;
        int c10 = p6Var.c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            i10 += l(p6Var.g(i11));
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            i10 += l((Map.Entry) it.next());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4) {
            return this.f7168a.equals(((k4) obj).f7168a);
        }
        return false;
    }

    public final Iterator f() {
        p6 p6Var = this.f7168a;
        return p6Var.isEmpty() ? Collections.emptyIterator() : this.f7169c ? new b5(p6Var.entrySet().iterator()) : p6Var.entrySet().iterator();
    }

    public final void g() {
        if (this.b) {
            return;
        }
        p6 p6Var = this.f7168a;
        int c10 = p6Var.c();
        for (int i10 = 0; i10 < c10; i10++) {
            Object value = p6Var.g(i10).getValue();
            if (value instanceof t4) {
                ((t4) value).A();
            }
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof t4) {
                ((t4) value2).A();
            }
        }
        p6Var.a();
        this.b = true;
    }

    public final void h(j4 j4Var, Object obj) {
        if (!j4Var.zze()) {
            m(j4Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                m(j4Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof d5) {
            this.f7169c = true;
        }
        this.f7168a.put(j4Var, obj);
    }

    public final int hashCode() {
        return this.f7168a.hashCode();
    }

    public final boolean i() {
        p6 p6Var = this.f7168a;
        int c10 = p6Var.c();
        for (int i10 = 0; i10 < c10; i10++) {
            if (!j(p6Var.g(i10))) {
                return false;
            }
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public k4(boolean z10) {
        g();
        g();
    }
}
