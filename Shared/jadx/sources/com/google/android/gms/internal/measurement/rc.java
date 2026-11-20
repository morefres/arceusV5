package com.google.android.gms.internal.measurement;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class rc<T> implements zc<T> {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f6813l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public static final Unsafe f6814m = sd.v();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6815a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6816c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6817d;

    /* renamed from: e, reason: collision with root package name */
    public final oc f6818e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6819f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6820g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6821h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6822i;

    /* renamed from: j, reason: collision with root package name */
    public final ld f6823j;

    /* renamed from: k, reason: collision with root package name */
    public final sa f6824k;

    public rc(int[] iArr, Object[] objArr, int i10, int i11, oc ocVar, boolean z10, int[] iArr2, int i12, int i13, tc tcVar, zb zbVar, ld ldVar, sa saVar, jc jcVar) {
        this.f6815a = iArr;
        this.b = objArr;
        this.f6816c = i10;
        this.f6817d = i11;
        boolean z11 = false;
        if (saVar != null && (ocVar instanceof db)) {
            z11 = true;
        }
        this.f6819f = z11;
        this.f6820g = iArr2;
        this.f6821h = i12;
        this.f6822i = i13;
        this.f6823j = ldVar;
        this.f6824k = saVar;
        this.f6818e = ocVar;
    }

    public static boolean J(Object obj, int i10, zc zcVar) {
        return zcVar.a(sd.s(obj, i10 & 1048575));
    }

    public static int M(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof gb) {
            return ((gb) obj).k();
        }
        return true;
    }

    public static void h(Object obj) {
        if (!g(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static double i(Object obj, long j10) {
        return ((Double) sd.s(obj, j10)).doubleValue();
    }

    public static float j(Object obj, long j10) {
        return ((Float) sd.s(obj, j10)).floatValue();
    }

    public static int k(Object obj, long j10) {
        return ((Integer) sd.s(obj, j10)).intValue();
    }

    public static long l(Object obj, long j10) {
        return ((Long) sd.s(obj, j10)).longValue();
    }

    public static boolean m(Object obj, long j10) {
        return ((Boolean) sd.s(obj, j10)).booleanValue();
    }

    public static final int u(byte[] bArr, int i10, int i11, wd wdVar, Class cls, v9 v9Var) {
        wd wdVar2 = wd.f6920c;
        switch (wdVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                v9Var.f6899c = Double.valueOf(Double.longBitsToDouble(w9.e(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                v9Var.f6899c = Float.valueOf(Float.intBitsToFloat(w9.d(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int c10 = w9.c(bArr, i10, v9Var);
                v9Var.f6899c = Long.valueOf(v9Var.b);
                return c10;
            case 4:
            case 12:
            case 13:
                int a10 = w9.a(bArr, i10, v9Var);
                v9Var.f6899c = Integer.valueOf(v9Var.f6898a);
                return a10;
            case 5:
            case 15:
                int i14 = i10 + 8;
                v9Var.f6899c = Long.valueOf(w9.e(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                v9Var.f6899c = Integer.valueOf(w9.d(bArr, i10));
                return i15;
            case 7:
                int c11 = w9.c(bArr, i10, v9Var);
                v9Var.f6899c = Boolean.valueOf(v9Var.b != 0);
                return c11;
            case 8:
                return w9.f(bArr, i10, v9Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return w9.h(wc.a().b(cls), bArr, i10, i11, v9Var);
            case 11:
                return w9.g(bArr, i10, v9Var);
            case 16:
                int a11 = w9.a(bArr, i10, v9Var);
                v9Var.f6899c = Integer.valueOf(ja.a(v9Var.f6898a));
                return a11;
            case 17:
                int c12 = w9.c(bArr, i10, v9Var);
                v9Var.f6899c = Long.valueOf(ja.b(v9Var.b));
                return c12;
        }
    }

    public static final void v(int i10, Object obj, yd ydVar) {
        if (obj instanceof String) {
            ydVar.p(i10, (String) obj);
        } else {
            ydVar.v(i10, (ha) obj);
        }
    }

    public static md w(Object obj) {
        gb gbVar = (gb) obj;
        md mdVar = gbVar.zzc;
        if (mdVar != md.a()) {
            return mdVar;
        }
        md b = md.b();
        gbVar.zzc = b;
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.rc y(java.lang.Class r32, com.google.android.gms.internal.measurement.lc r33, com.google.android.gms.internal.measurement.tc r34, com.google.android.gms.internal.measurement.zb r35, com.google.android.gms.internal.measurement.ld r36, com.google.android.gms.internal.measurement.sa r37, com.google.android.gms.internal.measurement.jc r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.rc.y(java.lang.Class, com.google.android.gms.internal.measurement.lc, com.google.android.gms.internal.measurement.tc, com.google.android.gms.internal.measurement.zb, com.google.android.gms.internal.measurement.ld, com.google.android.gms.internal.measurement.sa, com.google.android.gms.internal.measurement.jc):com.google.android.gms.internal.measurement.rc");
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public final void A(Object obj, Object obj2, int i10) {
        if (p(obj2, i10)) {
            int K = K(i10) & 1048575;
            Unsafe unsafe = f6814m;
            long j10 = K;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f6815a[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zc C = C(i10);
            if (!p(obj, i10)) {
                if (g(object)) {
                    Object zza = C.zza();
                    C.b(zza, object);
                    unsafe.putObject(obj, j10, zza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                q(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object zza2 = C.zza();
                C.b(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            C.b(object2, object);
        }
    }

    public final void B(Object obj, Object obj2, int i10) {
        int[] iArr = this.f6815a;
        int i11 = iArr[i10];
        if (r(obj2, i11, i10)) {
            int K = K(i10) & 1048575;
            Unsafe unsafe = f6814m;
            long j10 = K;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zc C = C(i10);
            if (!r(obj, i11, i10)) {
                if (g(object)) {
                    Object zza = C.zza();
                    C.b(zza, object);
                    unsafe.putObject(obj, j10, zza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object zza2 = C.zza();
                C.b(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            C.b(object2, object);
        }
    }

    public final zc C(int i10) {
        Object[] objArr = this.b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zc zcVar = (zc) objArr[i12];
        if (zcVar != null) {
            return zcVar;
        }
        zc b = wc.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = b;
        return b;
    }

    public final Object D(int i10) {
        int i11 = i10 / 3;
        return this.b[i11 + i11];
    }

    public final lb E(int i10) {
        int i11 = i10 / 3;
        return (lb) this.b[i11 + i11 + 1];
    }

    public final Object F(Object obj, int i10) {
        zc C = C(i10);
        int K = K(i10) & 1048575;
        if (!p(obj, i10)) {
            return C.zza();
        }
        Object object = f6814m.getObject(obj, K);
        if (g(object)) {
            return object;
        }
        Object zza = C.zza();
        if (object != null) {
            C.b(zza, object);
        }
        return zza;
    }

    public final void G(Object obj, int i10, Object obj2) {
        f6814m.putObject(obj, K(i10) & 1048575, obj2);
        q(obj, i10);
    }

    public final Object H(Object obj, int i10, int i11) {
        zc C = C(i11);
        if (!r(obj, i10, i11)) {
            return C.zza();
        }
        Object object = f6814m.getObject(obj, K(i11) & 1048575);
        if (g(object)) {
            return object;
        }
        Object zza = C.zza();
        if (object != null) {
            C.b(zza, object);
        }
        return zza;
    }

    public final void I(Object obj, int i10, int i11, Object obj2) {
        f6814m.putObject(obj, K(i11) & 1048575, obj2);
        s(obj, i10, i11);
    }

    public final int K(int i10) {
        return this.f6815a[i10 + 1];
    }

    public final int L(int i10) {
        return this.f6815a[i10 + 2];
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean a(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f6821h) {
            int[] iArr = this.f6820g;
            int[] iArr2 = this.f6815a;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int K = K(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f6814m.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & K) != 0 && !o(obj, i11, i10, i12, i20)) {
                return false;
            }
            int M = M(K);
            if (M != 9 && M != 17) {
                if (M != 27) {
                    if (M == 60 || M == 68) {
                        if (r(obj, i17, i11) && !J(obj, K, C(i11))) {
                            return false;
                        }
                    } else if (M != 49) {
                        if (M != 50) {
                            continue;
                        } else {
                            ic icVar = (ic) sd.s(obj, K & 1048575);
                            if (!icVar.isEmpty() && ((hc) D(i11)).e().f6508c.a() == xd.MESSAGE) {
                                zc zcVar = null;
                                for (Object obj2 : icVar.values()) {
                                    if (zcVar == null) {
                                        zcVar = wc.a().b(obj2.getClass());
                                    }
                                    if (!zcVar.a(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) sd.s(obj, K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zc C = C(i11);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!C.a(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i11, i10, i12, i20) && !J(obj, K, C(i11))) {
                return false;
            }
            i14++;
            i15 = i10;
            i13 = i12;
        }
        return !this.f6819f || ((db) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void b(Object obj, Object obj2) {
        h(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6815a;
            if (i10 >= iArr.length) {
                bd.d(this.f6823j, obj, obj2);
                if (this.f6819f) {
                    bd.c(this.f6824k, obj, obj2);
                    return;
                }
                return;
            }
            int K = K(i10);
            int i11 = 1048575 & K;
            int M = M(K);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (M) {
                case 0:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.r(obj, j10, sd.q(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 1:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.p(obj, j10, sd.o(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 2:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 3:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 4:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 5:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 6:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 7:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.n(obj, j10, sd.m(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 8:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 9:
                    A(obj, obj2, i10);
                    break;
                case 10:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 11:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 12:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 13:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 14:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 15:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 16:
                    if (!p(obj2, i10)) {
                        break;
                    } else {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                        break;
                    }
                case 17:
                    A(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case 35:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    pb pbVar = (pb) sd.s(obj, j10);
                    pb pbVar2 = (pb) sd.s(obj2, j10);
                    int size = pbVar.size();
                    int size2 = pbVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!pbVar.zza()) {
                            pbVar = pbVar.w(size2 + size);
                        }
                        pbVar.addAll(pbVar2);
                    }
                    if (size > 0) {
                        pbVar2 = pbVar;
                    }
                    sd.t(obj, j10, pbVar2);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    ld ldVar = bd.f6438a;
                    sd.t(obj, j10, jc.a(sd.s(obj, j10), sd.s(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!r(obj2, i12, i10)) {
                        break;
                    } else {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        s(obj, i12, i10);
                        break;
                    }
                case 60:
                    B(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!r(obj2, i12, i10)) {
                        break;
                    } else {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        s(obj, i12, i10);
                        break;
                    }
                case 68:
                    B(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void c(Object obj) {
        if (g(obj)) {
            if (obj instanceof gb) {
                gb gbVar = (gb) obj;
                gbVar.s(Integer.MAX_VALUE);
                gbVar.zza = 0;
                gbVar.l();
            }
            int[] iArr = this.f6815a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int K = K(i10);
                int i11 = 1048575 & K;
                int M = M(K);
                long j10 = i11;
                if (M != 9) {
                    if (M != 60 && M != 68) {
                        switch (M) {
                            case 18:
                            case 19:
                            case 20:
                            case MotionEventCompat.AXIS_WHEEL /* 21 */:
                            case MotionEventCompat.AXIS_GAS /* 22 */:
                            case MotionEventCompat.AXIS_BRAKE /* 23 */:
                            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                            case 25:
                            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                            case 29:
                            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                            case 31:
                            case 32:
                            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                            case 35:
                            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                            case 40:
                            case 41:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
                                ((pb) sd.s(obj, j10)).zzb();
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f6814m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((ic) object).e();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (r(obj, iArr[i10], i10)) {
                        C(i10).c(f6814m.getObject(obj, j10));
                    }
                }
                if (p(obj, i10)) {
                    C(i10).c(f6814m.getObject(obj, j10));
                }
            }
            this.f6823j.b(obj);
            if (this.f6819f) {
                this.f6824k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void d(Object obj, byte[] bArr, int i10, int i11, v9 v9Var) {
        x(obj, bArr, i10, i11, 0, v9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r19, com.google.android.gms.internal.measurement.yd r20) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.rc.e(java.lang.Object, com.google.android.gms.internal.measurement.yd):void");
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean f(Object obj, Object obj2) {
        boolean b;
        for (int i10 = 0; i10 < this.f6815a.length; i10 += 3) {
            int K = K(i10);
            long j10 = K & 1048575;
            switch (M(K)) {
                case 0:
                    if (n(obj, obj2, i10) && Double.doubleToLongBits(sd.q(obj, j10)) == Double.doubleToLongBits(sd.q(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (n(obj, obj2, i10) && Float.floatToIntBits(sd.o(obj, j10)) == Float.floatToIntBits(sd.o(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (n(obj, obj2, i10) && sd.k(obj, j10) == sd.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (n(obj, obj2, i10) && sd.k(obj, j10) == sd.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (n(obj, obj2, i10) && sd.k(obj, j10) == sd.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (n(obj, obj2, i10) && sd.m(obj, j10) == sd.m(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (n(obj, obj2, i10) && bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (n(obj, obj2, i10) && bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (n(obj, obj2, i10) && bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (n(obj, obj2, i10) && sd.k(obj, j10) == sd.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (n(obj, obj2, i10) && sd.i(obj, j10) == sd.i(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (n(obj, obj2, i10) && sd.k(obj, j10) == sd.k(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (n(obj, obj2, i10) && bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case 35:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    b = bd.b(sd.s(obj, j10), sd.s(obj2, j10));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    b = bd.b(sd.s(obj, j10), sd.s(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long L = L(i10) & 1048575;
                    if (sd.i(obj, L) == sd.i(obj2, L) && bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!b) {
                return false;
            }
        }
        if (!((gb) obj).zzc.equals(((gb) obj2).zzc)) {
            return false;
        }
        if (this.f6819f) {
            return ((db) obj).zzb.equals(((db) obj2).zzb);
        }
        return true;
    }

    public final boolean n(Object obj, Object obj2, int i10) {
        return p(obj, i10) == p(obj2, i10);
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? p(obj, i10) : (i12 & i13) != 0;
    }

    public final boolean p(Object obj, int i10) {
        int L = L(i10);
        long j10 = L & 1048575;
        if (j10 != 1048575) {
            return (sd.i(obj, j10) & (1 << (L >>> 20))) != 0;
        }
        int K = K(i10);
        long j11 = K & 1048575;
        switch (M(K)) {
            case 0:
                return Double.doubleToRawLongBits(sd.q(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(sd.o(obj, j11)) != 0;
            case 2:
                return sd.k(obj, j11) != 0;
            case 3:
                return sd.k(obj, j11) != 0;
            case 4:
                return sd.i(obj, j11) != 0;
            case 5:
                return sd.k(obj, j11) != 0;
            case 6:
                return sd.i(obj, j11) != 0;
            case 7:
                return sd.m(obj, j11);
            case 8:
                Object s8 = sd.s(obj, j11);
                if (s8 instanceof String) {
                    return !((String) s8).isEmpty();
                }
                if (s8 instanceof ha) {
                    return !ha.b.equals(s8);
                }
                throw new IllegalArgumentException();
            case 9:
                return sd.s(obj, j11) != null;
            case 10:
                return !ha.b.equals(sd.s(obj, j11));
            case 11:
                return sd.i(obj, j11) != 0;
            case 12:
                return sd.i(obj, j11) != 0;
            case 13:
                return sd.i(obj, j11) != 0;
            case 14:
                return sd.k(obj, j11) != 0;
            case 15:
                return sd.i(obj, j11) != 0;
            case 16:
                return sd.k(obj, j11) != 0;
            case 17:
                return sd.s(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void q(Object obj, int i10) {
        int L = L(i10);
        long j10 = 1048575 & L;
        if (j10 == 1048575) {
            return;
        }
        sd.j(obj, j10, (1 << (L >>> 20)) | sd.i(obj, j10));
    }

    public final boolean r(Object obj, int i10, int i11) {
        return sd.i(obj, (long) (L(i11) & 1048575)) == i10;
    }

    public final void s(Object obj, int i10, int i11) {
        sd.j(obj, L(i11) & 1048575, i10);
    }

    public final int t(int i10, int i11) {
        int[] iArr = this.f6815a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int x(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.v9 r40) {
        /*
            Method dump skipped, instructions count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.rc.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.v9):int");
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final Object zza() {
        return ((gb) this.f6818e).n();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int zzc(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f6815a;
            if (i12 >= iArr.length) {
                int hashCode = (i13 * 53) + ((gb) obj).zzc.hashCode();
                return this.f6819f ? (hashCode * 53) + ((db) obj).zzb.f6916a.hashCode() : hashCode;
            }
            int K = K(i12);
            int i14 = 1048575 & K;
            int M = M(K);
            int i15 = iArr[i12];
            long j10 = i14;
            int i16 = 37;
            switch (M) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(sd.q(obj, j10));
                    Charset charset = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(sd.o(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = sd.k(obj, j10);
                    Charset charset2 = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = sd.k(obj, j10);
                    Charset charset3 = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = sd.k(obj, j10);
                    Charset charset4 = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    floatToIntBits = qb.b(sd.m(obj, j10));
                    i13 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    floatToIntBits = ((String) sd.s(obj, j10)).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object s8 = sd.s(obj, j10);
                    if (s8 != null) {
                        i16 = s8.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 10:
                    i10 = i13 * 53;
                    floatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = sd.k(obj, j10);
                    Charset charset5 = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    floatToIntBits = sd.i(obj, j10);
                    i13 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = sd.k(obj, j10);
                    Charset charset6 = qb.f6799a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + floatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object s10 = sd.s(obj, j10);
                    if (s10 != null) {
                        i16 = s10.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                case 25:
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                case 29:
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                case 31:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case 35:
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    floatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i10 = i13 * 53;
                    floatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(i(obj, j10));
                        Charset charset7 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(j(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = l(obj, j10);
                        Charset charset8 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = l(obj, j10);
                        Charset charset9 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = l(obj, j10);
                        Charset charset10 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = qb.b(m(obj, j10));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = ((String) sd.s(obj, j10)).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = l(obj, j10);
                        Charset charset11 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = k(obj, j10);
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        doubleToLongBits = l(obj, j10);
                        Charset charset12 = qb.f6799a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!r(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int zze(Object obj) {
        int i10;
        int G;
        int G2;
        int a10;
        int G3;
        int G4;
        int G5;
        int d10;
        int G6;
        int E;
        int t8;
        int size;
        int u8;
        int G7;
        int G8;
        int G9;
        int i11;
        int C;
        int G10;
        int G11;
        int i12;
        int G12;
        int G13;
        int G14;
        int d11;
        int G15;
        rc<T> rcVar = this;
        Object obj2 = obj;
        Unsafe unsafe = f6814m;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = rcVar.f6815a;
            if (i13 >= iArr.length) {
                int i17 = i15 + ((gb) obj).zzc.i();
                if (!rcVar.f6819f) {
                    return i17;
                }
                hd hdVar = ((db) obj).zzb.f6916a;
                int c10 = hdVar.c();
                int i18 = 0;
                for (int i19 = 0; i19 < c10; i19++) {
                    Map.Entry d12 = hdVar.d(i19);
                    i18 += wa.j((va) ((ed) d12).a(), d12.getValue());
                }
                for (Map.Entry entry : hdVar.e()) {
                    i18 += wa.j((va) entry.getKey(), entry.getValue());
                }
                return i17 + i18;
            }
            int K = rcVar.K(i13);
            int M = M(K);
            int i20 = iArr[i13];
            int i21 = iArr[i13 + 2];
            int i22 = i21 & 1048575;
            if (M <= 17) {
                if (i22 != i16) {
                    i14 = i22 == 1048575 ? 0 : unsafe.getInt(obj2, i22);
                    i16 = i22;
                }
                i10 = 1 << (i21 >>> 20);
            } else {
                i10 = 0;
            }
            int i23 = K & 1048575;
            if (M >= xa.K.zza()) {
                xa.X.zza();
            }
            long j10 = i23;
            switch (M) {
                case 0:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        i15 += ma.G(i20 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G = ma.G(i20 << 3);
                        G4 = G + 4;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 2:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.a(j11);
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 3:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.a(j12);
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 4:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.a(j13);
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 5:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G3 = ma.G(i20 << 3);
                        G4 = G3 + 8;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 6:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G = ma.G(i20 << 3);
                        G4 = G + 4;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 7:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G4 = ma.G(i20 << 3) + 1;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 8:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof ha) {
                            G5 = ma.G(i24);
                            d10 = ((ha) object).d();
                            G6 = ma.G(d10);
                            G4 = G5 + G6 + d10;
                            i15 += G4;
                        } else {
                            G2 = ma.G(i24);
                            a10 = ma.b((String) object);
                            G4 = G2 + a10;
                            i15 += G4;
                        }
                    }
                    rcVar = this;
                    break;
                case 9:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        E = bd.E(i20, unsafe.getObject(obj2, j10), rcVar.C(i13));
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        ha haVar = (ha) unsafe.getObject(obj2, j10);
                        G5 = ma.G(i20 << 3);
                        d10 = haVar.d();
                        G6 = ma.G(d10);
                        G4 = G5 + G6 + d10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 11:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        int i25 = unsafe.getInt(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.G(i25);
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 12:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.a(j14);
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 13:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G = ma.G(i20 << 3);
                        G4 = G + 4;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 14:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        G3 = ma.G(i20 << 3);
                        G4 = G3 + 8;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 15:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        int i26 = unsafe.getInt(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.G((i26 >> 31) ^ (i26 + i26));
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 16:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        G2 = ma.G(i20 << 3);
                        a10 = ma.a((j15 >> 63) ^ (j15 + j15));
                        G4 = G2 + a10;
                        i15 += G4;
                    }
                    rcVar = this;
                    break;
                case 17:
                    if (rcVar.o(obj2, i13, i16, i14, i10)) {
                        E = ma.g(i20, (oc) unsafe.getObject(obj2, j10), rcVar.C(i13));
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    E = bd.D(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case 19:
                    E = bd.B(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    ld ldVar = bd.f6438a;
                    if (list.size() != 0) {
                        t8 = bd.t(list) + (list.size() * ma.G(i20 << 3));
                        i15 += t8;
                        break;
                    }
                    t8 = 0;
                    i15 += t8;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar2 = bd.f6438a;
                    size = list2.size();
                    if (size != 0) {
                        u8 = bd.u(list2);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar3 = bd.f6438a;
                    size = list3.size();
                    if (size != 0) {
                        u8 = bd.x(list3);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    E = bd.D(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    E = bd.B(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar4 = bd.f6438a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        E = size2 * (ma.G(i20 << 3) + 1);
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar5 = bd.f6438a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        t8 = ma.G(i20 << 3) * size3;
                        if (list5 instanceof yb) {
                            yb ybVar = (yb) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object zzc = ybVar.zzc();
                                if (zzc instanceof ha) {
                                    int d13 = ((ha) zzc).d();
                                    t8 += ma.G(d13) + d13;
                                } else {
                                    t8 += ma.b((String) zzc);
                                }
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof ha) {
                                    int d14 = ((ha) obj3).d();
                                    t8 += ma.G(d14) + d14;
                                } else {
                                    t8 += ma.b((String) obj3);
                                }
                            }
                        }
                        i15 += t8;
                        break;
                    }
                    t8 = 0;
                    i15 += t8;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zc C2 = rcVar.C(i13);
                    ld ldVar6 = bd.f6438a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        G8 = 0;
                    } else {
                        G8 = ma.G(i20 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj4 = list6.get(i29);
                            if (obj4 instanceof xb) {
                                int b = ((xb) obj4).b();
                                G8 += ma.G(b) + b;
                            } else {
                                G8 += ma.d((oc) obj4, C2);
                            }
                        }
                    }
                    i15 += G8;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar7 = bd.f6438a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        G9 = 0;
                    } else {
                        G9 = size5 * ma.G(i20 << 3);
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int d15 = ((ha) list7.get(i30)).d();
                            G9 += ma.G(d15) + d15;
                        }
                    }
                    i15 += G9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar8 = bd.f6438a;
                    size = list8.size();
                    if (size != 0) {
                        u8 = bd.y(list8);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar9 = bd.f6438a;
                    size = list9.size();
                    if (size != 0) {
                        u8 = bd.w(list9);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case 31:
                    E = bd.B(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case 32:
                    E = bd.D(i20, (List) unsafe.getObject(obj2, j10), false);
                    i15 += E;
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar10 = bd.f6438a;
                    size = list10.size();
                    if (size != 0) {
                        u8 = bd.z(list10);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar11 = bd.f6438a;
                    size = list11.size();
                    if (size != 0) {
                        u8 = bd.v(list11);
                        G7 = ma.G(i20 << 3);
                        i11 = size * G7;
                        E = u8 + i11;
                        i15 += E;
                        break;
                    }
                    E = 0;
                    i15 += E;
                case 35:
                    C = bd.C((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    C = bd.A((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    C = bd.t((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    C = bd.u((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    C = bd.x((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    C = bd.C((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    C = bd.A((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    ld ldVar12 = bd.f6438a;
                    C = list12.size();
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    C = bd.y((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    C = bd.w((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    C = bd.A((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    C = bd.C((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    C = bd.z((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    C = bd.v((List) unsafe.getObject(obj2, j10));
                    if (C > 0) {
                        G10 = ma.G(i20 << 3);
                        G11 = ma.G(C);
                        G9 = G10 + G11 + C;
                        i15 += G9;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zc C3 = rcVar.C(i13);
                    ld ldVar13 = bd.f6438a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            i12 += ma.g(i20, (oc) list13.get(i31), C3);
                        }
                    }
                    i15 += i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    ic icVar = (ic) unsafe.getObject(obj2, j10);
                    hc hcVar = (hc) rcVar.D(i13);
                    if (!icVar.isEmpty()) {
                        t8 = 0;
                        for (Map.Entry entry2 : icVar.entrySet()) {
                            t8 += hcVar.d(i20, entry2.getKey(), entry2.getValue());
                        }
                        i15 += t8;
                        break;
                    }
                    t8 = 0;
                    i15 += t8;
                case 51:
                    if (rcVar.r(obj2, i20, i13)) {
                        G12 = ma.G(i20 << 3);
                        E = G12 + 8;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (rcVar.r(obj2, i20, i13)) {
                        G13 = ma.G(i20 << 3);
                        E = G13 + 4;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (rcVar.r(obj2, i20, i13)) {
                        long l10 = l(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.a(l10);
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (rcVar.r(obj2, i20, i13)) {
                        long l11 = l(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.a(l11);
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (rcVar.r(obj2, i20, i13)) {
                        long k10 = k(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.a(k10);
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (rcVar.r(obj2, i20, i13)) {
                        G12 = ma.G(i20 << 3);
                        E = G12 + 8;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (rcVar.r(obj2, i20, i13)) {
                        G13 = ma.G(i20 << 3);
                        E = G13 + 4;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (rcVar.r(obj2, i20, i13)) {
                        E = ma.G(i20 << 3) + 1;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!rcVar.r(obj2, i20, i13)) {
                        break;
                    } else {
                        int i32 = i20 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof ha) {
                            G14 = ma.G(i32);
                            d11 = ((ha) object2).d();
                            G15 = ma.G(d11);
                            E = G14 + G15 + d11;
                            i15 += E;
                            break;
                        } else {
                            u8 = ma.G(i32);
                            i11 = ma.b((String) object2);
                            E = u8 + i11;
                            i15 += E;
                        }
                    }
                case 60:
                    if (rcVar.r(obj2, i20, i13)) {
                        E = bd.E(i20, unsafe.getObject(obj2, j10), rcVar.C(i13));
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (rcVar.r(obj2, i20, i13)) {
                        ha haVar2 = (ha) unsafe.getObject(obj2, j10);
                        G14 = ma.G(i20 << 3);
                        d11 = haVar2.d();
                        G15 = ma.G(d11);
                        E = G14 + G15 + d11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (rcVar.r(obj2, i20, i13)) {
                        int k11 = k(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.G(k11);
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (rcVar.r(obj2, i20, i13)) {
                        long k12 = k(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.a(k12);
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (rcVar.r(obj2, i20, i13)) {
                        G13 = ma.G(i20 << 3);
                        E = G13 + 4;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (rcVar.r(obj2, i20, i13)) {
                        G12 = ma.G(i20 << 3);
                        E = G12 + 8;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (rcVar.r(obj2, i20, i13)) {
                        int k13 = k(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.G((k13 >> 31) ^ (k13 + k13));
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (rcVar.r(obj2, i20, i13)) {
                        long l12 = l(obj2, j10);
                        u8 = ma.G(i20 << 3);
                        i11 = ma.a((l12 >> 63) ^ (l12 + l12));
                        E = u8 + i11;
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (rcVar.r(obj2, i20, i13)) {
                        E = ma.g(i20, (oc) unsafe.getObject(obj2, j10), rcVar.C(i13));
                        i15 += E;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            obj2 = obj;
        }
    }
}
