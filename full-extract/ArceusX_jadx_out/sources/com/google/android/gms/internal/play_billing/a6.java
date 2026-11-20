package com.google.android.gms.internal.play_billing;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class a6<T> implements h6<T> {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f7034l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public static final Unsafe f7035m = a7.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7036a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7037c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7038d;

    /* renamed from: e, reason: collision with root package name */
    public final x5 f7039e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7040f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7041g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7042h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7043i;

    /* renamed from: j, reason: collision with root package name */
    public final t6 f7044j;

    /* renamed from: k, reason: collision with root package name */
    public final g4 f7045k;

    public a6(int[] iArr, Object[] objArr, int i10, int i11, x5 x5Var, boolean z10, int[] iArr2, int i12, int i13, c6 c6Var, i5 i5Var, t6 t6Var, g4 g4Var, s5 s5Var) {
        this.f7036a = iArr;
        this.b = objArr;
        this.f7037c = i10;
        this.f7038d = i11;
        boolean z11 = false;
        if (g4Var != null && (x5Var instanceof q4)) {
            z11 = true;
        }
        this.f7040f = z11;
        this.f7041g = iArr2;
        this.f7042h = i12;
        this.f7043i = i13;
        this.f7044j = t6Var;
        this.f7045k = g4Var;
        this.f7039e = x5Var;
    }

    public static int B(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long D(Object obj, long j10) {
        return ((Long) a7.j(obj, j10)).longValue();
    }

    public static Field K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    public static void L(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean p(Object obj, int i10, h6 h6Var) {
        return h6Var.a(a7.j(obj, i10 & 1048575));
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t4) {
            return ((t4) obj).l();
        }
        return true;
    }

    public static final void u(int i10, Object obj, i7 i7Var) {
        if (obj instanceof String) {
            i7Var.n(i10, (String) obj);
        } else {
            i7Var.E(i10, (s3) obj);
        }
    }

    public static u6 w(Object obj) {
        t4 t4Var = (t4) obj;
        u6 u6Var = t4Var.zzc;
        if (u6Var != u6.c()) {
            return u6Var;
        }
        u6 f10 = u6.f();
        t4Var.zzc = f10;
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.a6 x(java.lang.Class r31, com.google.android.gms.internal.play_billing.u5 r32, com.google.android.gms.internal.play_billing.c6 r33, com.google.android.gms.internal.play_billing.i5 r34, com.google.android.gms.internal.play_billing.t6 r35, com.google.android.gms.internal.play_billing.g4 r36, com.google.android.gms.internal.play_billing.s5 r37) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a6.x(java.lang.Class, com.google.android.gms.internal.play_billing.u5, com.google.android.gms.internal.play_billing.c6, com.google.android.gms.internal.play_billing.i5, com.google.android.gms.internal.play_billing.t6, com.google.android.gms.internal.play_billing.g4, com.google.android.gms.internal.play_billing.s5):com.google.android.gms.internal.play_billing.a6");
    }

    public static int y(Object obj, long j10) {
        return ((Integer) a7.j(obj, j10)).intValue();
    }

    public final int A(int i10, int i11) {
        int[] iArr = this.f7036a;
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

    public final int C(int i10) {
        return this.f7036a[i10 + 1];
    }

    public final w4 E(int i10) {
        int i11 = i10 / 3;
        return (w4) this.b[i11 + i11 + 1];
    }

    public final h6 F(int i10) {
        Object[] objArr = this.b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        h6 h6Var = (h6) objArr[i12];
        if (h6Var != null) {
            return h6Var;
        }
        h6 b = e6.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = b;
        return b;
    }

    public final Object G(Object obj, int i10, Object obj2, t6 t6Var, Object obj3) {
        w4 E;
        int i11 = this.f7036a[i10];
        Object j10 = a7.j(obj, C(i10) & 1048575);
        if (j10 == null || (E = E(i10)) == null) {
            return obj2;
        }
        ((q5) H(i10)).c();
        Iterator it = ((r5) j10).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!E.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = t6Var.a(obj3);
                }
                int b = q5.b(null, entry.getKey(), entry.getValue());
                s3 s3Var = s3.b;
                byte[] bArr = new byte[b];
                boolean z10 = a4.b;
                x3 x3Var = new x3(bArr, 0, b);
                try {
                    q5.d(x3Var, null, entry.getKey(), entry.getValue());
                    ((u6) obj2).j((i11 << 3) | 2, o3.a(x3Var, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final Object H(int i10) {
        int i11 = i10 / 3;
        return this.b[i11 + i11];
    }

    public final Object I(Object obj, int i10) {
        h6 F = F(i10);
        int C = C(i10) & 1048575;
        if (!n(obj, i10)) {
            return F.zze();
        }
        Object object = f7035m.getObject(obj, C);
        if (q(object)) {
            return object;
        }
        Object zze = F.zze();
        if (object != null) {
            F.c(zze, object);
        }
        return zze;
    }

    public final Object J(Object obj, int i10, int i11) {
        h6 F = F(i11);
        if (!s(obj, i10, i11)) {
            return F.zze();
        }
        Object object = f7035m.getObject(obj, C(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        Object zze = F.zze();
        if (object != null) {
            F.c(zze, object);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final boolean a(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.f7042h) {
            int i15 = this.f7041g[i12];
            int C = C(i15);
            int[] iArr = this.f7036a;
            int i16 = iArr[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i14) {
                if (i17 != 1048575) {
                    i13 = f7035m.getInt(obj, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i14;
                i11 = i13;
            }
            Object obj2 = obj;
            if ((268435456 & C) != 0 && !o(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int B = B(C);
            if (B != 9 && B != 17) {
                if (B != 27) {
                    if (B == 60 || B == 68) {
                        if (s(obj2, iArr[i15], i15) && !p(obj2, C, F(i15))) {
                            return false;
                        }
                    } else if (B != 49) {
                        if (B == 50 && !((r5) a7.j(obj2, C & 1048575)).isEmpty()) {
                            ((q5) H(i15)).c();
                            throw null;
                        }
                    }
                }
                List list = (List) a7.j(obj2, C & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    h6 F = F(i15);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!F.a(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj2, i15, i10, i11, i18) && !p(obj2, C, F(i15))) {
                return false;
            }
            i12++;
            obj = obj2;
            i14 = i10;
            i13 = i11;
        }
        return !this.f7040f || ((q4) obj).zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void b(Object obj) {
        if (q(obj)) {
            if (obj instanceof t4) {
                t4 t4Var = (t4) obj;
                t4Var.j(Integer.MAX_VALUE);
                t4Var.zza = 0;
                t4Var.h();
            }
            int[] iArr = this.f7036a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int C = C(i10);
                int i11 = 1048575 & C;
                int B = B(C);
                long j10 = i11;
                if (B != 9) {
                    if (B != 60 && B != 68) {
                        switch (B) {
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
                                ((y4) a7.j(obj, j10)).zzb();
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f7035m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((r5) object).c();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (s(obj, iArr[i10], i10)) {
                        F(i10).b(f7035m.getObject(obj, j10));
                    }
                }
                if (n(obj, i10)) {
                    F(i10).b(f7035m.getObject(obj, j10));
                }
            }
            this.f7044j.b(obj);
            if (this.f7040f) {
                this.f7045k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void c(Object obj, Object obj2) {
        L(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f7036a;
            if (i10 >= iArr.length) {
                i6.u(this.f7044j, obj, obj2);
                if (this.f7040f) {
                    i6.t(this.f7045k, obj, obj2);
                    return;
                }
                return;
            }
            int C = C(i10);
            int i11 = 1048575 & C;
            int B = B(C);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (B) {
                case 0:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.s(obj, j10, a7.e(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 1:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.t(obj, j10, a7.f(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 2:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 3:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 4:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 5:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 6:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 7:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.q(obj, j10, a7.A(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 8:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 9:
                    g(obj, obj2, i10);
                    break;
                case 10:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 11:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 12:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 13:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 14:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 15:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 16:
                    if (!n(obj2, i10)) {
                        break;
                    } else {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                        break;
                    }
                case 17:
                    g(obj, obj2, i10);
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
                    y4 y4Var = (y4) a7.j(obj, j10);
                    y4 y4Var2 = (y4) a7.j(obj2, j10);
                    int size = y4Var.size();
                    int size2 = y4Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!y4Var.zzc()) {
                            y4Var = y4Var.r(size2 + size);
                        }
                        y4Var.addAll(y4Var2);
                    }
                    if (size > 0) {
                        y4Var2 = y4Var;
                    }
                    a7.w(obj, j10, y4Var2);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    t6 t6Var = i6.f7156a;
                    a7.w(obj, j10, s5.a(a7.j(obj, j10), a7.j(obj2, j10)));
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
                    if (!s(obj2, i12, i10)) {
                        break;
                    } else {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        j(obj, i12, i10);
                        break;
                    }
                case 60:
                    h(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(obj2, i12, i10)) {
                        break;
                    } else {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        j(obj, i12, i10);
                        break;
                    }
                case 68:
                    h(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bf, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.play_billing.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a6.d(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    @Override // com.google.android.gms.internal.play_billing.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r20, com.google.android.gms.internal.play_billing.i7 r21) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a6.e(java.lang.Object, com.google.android.gms.internal.play_billing.i7):void");
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void f(Object obj, byte[] bArr, int i10, int i11, f3 f3Var) {
        v(obj, bArr, i10, i11, 0, f3Var);
    }

    public final void g(Object obj, Object obj2, int i10) {
        if (n(obj2, i10)) {
            int C = C(i10) & 1048575;
            Unsafe unsafe = f7035m;
            long j10 = C;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f7036a[i10] + " is present but null: " + obj2.toString());
            }
            h6 F = F(i10);
            if (!n(obj, i10)) {
                if (q(object)) {
                    Object zze = F.zze();
                    F.c(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                i(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                Object zze2 = F.zze();
                F.c(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            F.c(object2, object);
        }
    }

    public final void h(Object obj, Object obj2, int i10) {
        int[] iArr = this.f7036a;
        int i11 = iArr[i10];
        if (s(obj2, i11, i10)) {
            int C = C(i10) & 1048575;
            Unsafe unsafe = f7035m;
            long j10 = C;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            h6 F = F(i10);
            if (!s(obj, i11, i10)) {
                if (q(object)) {
                    Object zze = F.zze();
                    F.c(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                j(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                Object zze2 = F.zze();
                F.c(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            F.c(object2, object);
        }
    }

    public final void i(Object obj, int i10) {
        int z10 = z(i10);
        long j10 = 1048575 & z10;
        if (j10 == 1048575) {
            return;
        }
        a7.u(obj, j10, (1 << (z10 >>> 20)) | a7.g(obj, j10));
    }

    public final void j(Object obj, int i10, int i11) {
        a7.u(obj, z(i11) & 1048575, i10);
    }

    public final void k(Object obj, int i10, Object obj2) {
        f7035m.putObject(obj, C(i10) & 1048575, obj2);
        i(obj, i10);
    }

    public final void l(Object obj, int i10, int i11, Object obj2) {
        f7035m.putObject(obj, C(i11) & 1048575, obj2);
        j(obj, i10, i11);
    }

    public final boolean m(Object obj, Object obj2, int i10) {
        return n(obj, i10) == n(obj2, i10);
    }

    public final boolean n(Object obj, int i10) {
        int z10 = z(i10);
        long j10 = z10 & 1048575;
        if (j10 != 1048575) {
            return (a7.g(obj, j10) & (1 << (z10 >>> 20))) != 0;
        }
        int C = C(i10);
        long j11 = C & 1048575;
        switch (B(C)) {
            case 0:
                return Double.doubleToRawLongBits(a7.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(a7.f(obj, j11)) != 0;
            case 2:
                return a7.h(obj, j11) != 0;
            case 3:
                return a7.h(obj, j11) != 0;
            case 4:
                return a7.g(obj, j11) != 0;
            case 5:
                return a7.h(obj, j11) != 0;
            case 6:
                return a7.g(obj, j11) != 0;
            case 7:
                return a7.A(obj, j11);
            case 8:
                Object j12 = a7.j(obj, j11);
                return j12 instanceof String ? !((String) j12).isEmpty() : j12 instanceof s3 ? !s3.b.equals(j12) : t();
            case 9:
                return a7.j(obj, j11) != null;
            case 10:
                return !s3.b.equals(a7.j(obj, j11));
            case 11:
                return a7.g(obj, j11) != 0;
            case 12:
                return a7.g(obj, j11) != 0;
            case 13:
                return a7.g(obj, j11) != 0;
            case 14:
                return a7.h(obj, j11) != 0;
            case 15:
                return a7.g(obj, j11) != 0;
            case 16:
                return a7.h(obj, j11) != 0;
            case 17:
                return a7.j(obj, j11) != null;
            default:
                return t();
        }
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? n(obj, i10) : (i12 & i13) != 0;
    }

    public final boolean r(Object obj, Object obj2, int i10) {
        long z10 = z(i10) & 1048575;
        return a7.g(obj, z10) == a7.g(obj2, z10);
    }

    public final boolean s(Object obj, int i10, int i11) {
        return a7.g(obj, (long) (z(i11) & 1048575)) == i10;
    }

    public final boolean t() {
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int v(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.f3 r39) {
        /*
            Method dump skipped, instructions count: 3866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a6.v(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.f3):int");
    }

    public final int z(int i10) {
        return this.f7036a[i10 + 2];
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zza(Object obj) {
        int i10;
        int v5;
        int v10;
        int w5;
        int v11;
        int v12;
        int v13;
        int b;
        int v14;
        int v15;
        int c10;
        int v16;
        int f10;
        int m10;
        int size;
        int q10;
        int v17;
        int b10;
        int v18;
        int b11;
        int v19;
        int v20;
        int v21;
        int i11;
        int k10;
        int v22;
        int v23;
        int i12;
        int v24;
        int v25;
        a6<T> a6Var = this;
        Object obj2 = obj;
        Unsafe unsafe = f7035m;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (true) {
            int[] iArr = a6Var.f7036a;
            if (i13 >= iArr.length) {
                int a10 = i15 + ((t4) obj).zzc.a();
                if (!a6Var.f7040f) {
                    return a10;
                }
                p6 p6Var = ((q4) obj).zzb.f7168a;
                int c11 = p6Var.c();
                int i17 = 0;
                for (int i18 = 0; i18 < c11; i18++) {
                    Map.Entry g10 = p6Var.g(i18);
                    i17 += k4.c((j4) ((k6) g10).a(), g10.getValue());
                }
                for (Map.Entry entry : p6Var.d()) {
                    i17 += k4.c((j4) entry.getKey(), entry.getValue());
                }
                return a10 + i17;
            }
            int C = a6Var.C(i13);
            int B = B(C);
            int i19 = iArr[i13];
            int i20 = iArr[i13 + 2];
            int i21 = i20 & 1048575;
            if (B <= 17) {
                if (i21 != i16) {
                    i14 = i21 == 1048575 ? 0 : unsafe.getInt(obj2, i21);
                    i16 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = 0;
            }
            int i22 = C & 1048575;
            if (B >= l4.K.zza()) {
                l4.X.zza();
            }
            long j10 = i22;
            switch (B) {
                case 0:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        i15 += a4.v(i19 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v5 = a4.v(i19 << 3);
                        v12 = v5 + 4;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 2:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.w(j11);
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 3:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.w(j12);
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 4:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.w(j13);
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 5:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v11 = a4.v(i19 << 3);
                        v12 = v11 + 8;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 6:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v5 = a4.v(i19 << 3);
                        v12 = v5 + 4;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 7:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v12 = a4.v(i19 << 3) + 1;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 8:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        int i23 = i19 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof s3) {
                            v13 = a4.v(i23);
                            b = ((s3) object).d();
                            v14 = a4.v(b);
                        } else {
                            v13 = a4.v(i23);
                            int i24 = e7.f7085a;
                            b = c7.b((String) object);
                            v14 = a4.v(b);
                        }
                        v12 = v13 + v14 + b;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 9:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        int i25 = i19 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        h6 F = a6Var.F(i13);
                        t6 t6Var = i6.f7156a;
                        v15 = a4.v(i25);
                        c10 = ((c3) object2).c(F);
                        v16 = a4.v(c10);
                        f10 = v15 + v16 + c10;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        s3 s3Var = (s3) unsafe.getObject(obj2, j10);
                        v13 = a4.v(i19 << 3);
                        b = s3Var.d();
                        v14 = a4.v(b);
                        v12 = v13 + v14 + b;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 11:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        int i26 = unsafe.getInt(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.v(i26);
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 12:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.w(j14);
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 13:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v5 = a4.v(i19 << 3);
                        v12 = v5 + 4;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 14:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        v11 = a4.v(i19 << 3);
                        v12 = v11 + 8;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 15:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        int i27 = unsafe.getInt(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.v((i27 >> 31) ^ (i27 + i27));
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 16:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        v10 = a4.v(i19 << 3);
                        w5 = a4.w((j15 >> 63) ^ (j15 + j15));
                        v12 = v10 + w5;
                        i15 += v12;
                    }
                    a6Var = this;
                    break;
                case 17:
                    if (a6Var.o(obj2, i13, i16, i14, i10)) {
                        f10 = i6.f(i19, (x5) unsafe.getObject(obj2, j10), a6Var.F(i13));
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f10 = i6.j(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case 19:
                    f10 = i6.h(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var2 = i6.f7156a;
                    if (list.size() != 0) {
                        m10 = i6.m(list) + (list.size() * a4.v(i19 << 3));
                        i15 += m10;
                        break;
                    }
                    m10 = 0;
                    i15 += m10;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var3 = i6.f7156a;
                    size = list2.size();
                    if (size != 0) {
                        q10 = i6.q(list2);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var4 = i6.f7156a;
                    size = list3.size();
                    if (size != 0) {
                        q10 = i6.l(list3);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    f10 = i6.j(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    f10 = i6.h(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var5 = i6.f7156a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        f10 = size2 * (a4.v(i19 << 3) + 1);
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var6 = i6.f7156a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        m10 = a4.v(i19 << 3) * size3;
                        if (list5 instanceof h5) {
                            h5 h5Var = (h5) list5;
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object zza = h5Var.zza();
                                if (zza instanceof s3) {
                                    b11 = ((s3) zza).d();
                                    v19 = a4.v(b11);
                                } else {
                                    int i29 = e7.f7085a;
                                    b11 = c7.b((String) zza);
                                    v19 = a4.v(b11);
                                }
                                m10 += v19 + b11;
                            }
                        } else {
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object obj3 = list5.get(i30);
                                if (obj3 instanceof s3) {
                                    b10 = ((s3) obj3).d();
                                    v18 = a4.v(b10);
                                } else {
                                    int i31 = e7.f7085a;
                                    b10 = c7.b((String) obj3);
                                    v18 = a4.v(b10);
                                }
                                m10 += v18 + b10;
                            }
                        }
                        i15 += m10;
                        break;
                    }
                    m10 = 0;
                    i15 += m10;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    h6 F2 = a6Var.F(i13);
                    t6 t6Var7 = i6.f7156a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        v20 = 0;
                    } else {
                        v20 = a4.v(i19 << 3) * size4;
                        for (int i32 = 0; i32 < size4; i32++) {
                            int c12 = ((c3) list6.get(i32)).c(F2);
                            v20 += a4.v(c12) + c12;
                        }
                    }
                    i15 += v20;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var8 = i6.f7156a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        v21 = 0;
                    } else {
                        v21 = size5 * a4.v(i19 << 3);
                        for (int i33 = 0; i33 < list7.size(); i33++) {
                            int d10 = ((s3) list7.get(i33)).d();
                            v21 += a4.v(d10) + d10;
                        }
                    }
                    i15 += v21;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var9 = i6.f7156a;
                    size = list8.size();
                    if (size != 0) {
                        q10 = i6.p(list8);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var10 = i6.f7156a;
                    size = list9.size();
                    if (size != 0) {
                        q10 = i6.g(list9);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case 31:
                    f10 = i6.h(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case 32:
                    f10 = i6.j(i19, (List) unsafe.getObject(obj2, j10), false);
                    i15 += f10;
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var11 = i6.f7156a;
                    size = list10.size();
                    if (size != 0) {
                        q10 = i6.n(list10);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var12 = i6.f7156a;
                    size = list11.size();
                    if (size != 0) {
                        q10 = i6.o(list11);
                        v17 = a4.v(i19 << 3);
                        i11 = size * v17;
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    }
                    f10 = 0;
                    i15 += f10;
                case 35:
                    k10 = i6.k((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    k10 = i6.i((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    k10 = i6.m((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    k10 = i6.q((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    k10 = i6.l((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    k10 = i6.k((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    k10 = i6.i((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    t6 t6Var13 = i6.f7156a;
                    k10 = list12.size();
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    k10 = i6.p((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    k10 = i6.g((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    k10 = i6.i((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    k10 = i6.k((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    k10 = i6.n((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    k10 = i6.o((List) unsafe.getObject(obj2, j10));
                    if (k10 > 0) {
                        v22 = a4.v(i19 << 3);
                        v23 = a4.v(k10);
                        v21 = v22 + v23 + k10;
                        i15 += v21;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    h6 F3 = a6Var.F(i13);
                    t6 t6Var14 = i6.f7156a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i12 += i6.f(i19, (x5) list13.get(i34), F3);
                        }
                    }
                    i15 += i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    r5 r5Var = (r5) unsafe.getObject(obj2, j10);
                    q5 q5Var = (q5) a6Var.H(i13);
                    if (!r5Var.isEmpty()) {
                        m10 = 0;
                        for (Map.Entry entry2 : r5Var.entrySet()) {
                            m10 += q5Var.a(i19, entry2.getKey(), entry2.getValue());
                        }
                        i15 += m10;
                        break;
                    }
                    m10 = 0;
                    i15 += m10;
                case 51:
                    if (a6Var.s(obj2, i19, i13)) {
                        v24 = a4.v(i19 << 3);
                        f10 = v24 + 8;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a6Var.s(obj2, i19, i13)) {
                        v25 = a4.v(i19 << 3);
                        f10 = v25 + 4;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a6Var.s(obj2, i19, i13)) {
                        long D = D(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.w(D);
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a6Var.s(obj2, i19, i13)) {
                        long D2 = D(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.w(D2);
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a6Var.s(obj2, i19, i13)) {
                        long y10 = y(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.w(y10);
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a6Var.s(obj2, i19, i13)) {
                        v24 = a4.v(i19 << 3);
                        f10 = v24 + 8;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a6Var.s(obj2, i19, i13)) {
                        v25 = a4.v(i19 << 3);
                        f10 = v25 + 4;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a6Var.s(obj2, i19, i13)) {
                        f10 = a4.v(i19 << 3) + 1;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a6Var.s(obj2, i19, i13)) {
                        int i35 = i19 << 3;
                        Object object3 = unsafe.getObject(obj2, j10);
                        if (object3 instanceof s3) {
                            v15 = a4.v(i35);
                            c10 = ((s3) object3).d();
                            v16 = a4.v(c10);
                        } else {
                            v15 = a4.v(i35);
                            int i36 = e7.f7085a;
                            c10 = c7.b((String) object3);
                            v16 = a4.v(c10);
                        }
                        f10 = v15 + v16 + c10;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a6Var.s(obj2, i19, i13)) {
                        int i37 = i19 << 3;
                        Object object4 = unsafe.getObject(obj2, j10);
                        h6 F4 = a6Var.F(i13);
                        t6 t6Var15 = i6.f7156a;
                        v15 = a4.v(i37);
                        c10 = ((c3) object4).c(F4);
                        v16 = a4.v(c10);
                        f10 = v15 + v16 + c10;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a6Var.s(obj2, i19, i13)) {
                        s3 s3Var2 = (s3) unsafe.getObject(obj2, j10);
                        v15 = a4.v(i19 << 3);
                        c10 = s3Var2.d();
                        v16 = a4.v(c10);
                        f10 = v15 + v16 + c10;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a6Var.s(obj2, i19, i13)) {
                        int y11 = y(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.v(y11);
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (a6Var.s(obj2, i19, i13)) {
                        long y12 = y(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.w(y12);
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a6Var.s(obj2, i19, i13)) {
                        v25 = a4.v(i19 << 3);
                        f10 = v25 + 4;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a6Var.s(obj2, i19, i13)) {
                        v24 = a4.v(i19 << 3);
                        f10 = v24 + 8;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a6Var.s(obj2, i19, i13)) {
                        int y13 = y(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.v((y13 >> 31) ^ (y13 + y13));
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a6Var.s(obj2, i19, i13)) {
                        long D3 = D(obj2, j10);
                        q10 = a4.v(i19 << 3);
                        i11 = a4.w((D3 >> 63) ^ (D3 + D3));
                        f10 = q10 + i11;
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a6Var.s(obj2, i19, i13)) {
                        f10 = i6.f(i19, (x5) unsafe.getObject(obj2, j10), a6Var.F(i13));
                        i15 += f10;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            obj2 = obj;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7036a.length; i13 += 3) {
            int C = C(i13);
            int B = B(C);
            if (B <= 50 || B >= 69) {
                long j10 = C & 1048575;
                int i14 = 37;
                switch (B) {
                    case 0:
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(a7.e(obj, j10));
                        byte[] bArr = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 1:
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(a7.f(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 2:
                        i10 = i12 * 53;
                        doubleToLongBits = a7.h(obj, j10);
                        byte[] bArr2 = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 3:
                        i10 = i12 * 53;
                        doubleToLongBits = a7.h(obj, j10);
                        byte[] bArr3 = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 4:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 5:
                        i10 = i12 * 53;
                        doubleToLongBits = a7.h(obj, j10);
                        byte[] bArr4 = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 6:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 7:
                        i10 = i12 * 53;
                        floatToIntBits = z4.a(a7.A(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 8:
                        i10 = i12 * 53;
                        floatToIntBits = ((String) a7.j(obj, j10)).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    case 9:
                        i11 = i12 * 53;
                        Object j11 = a7.j(obj, j10);
                        if (j11 != null) {
                            i14 = j11.hashCode();
                        }
                        i12 = i11 + i14;
                        break;
                    case 10:
                        i10 = i12 * 53;
                        floatToIntBits = a7.j(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    case 11:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 12:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 13:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 14:
                        i10 = i12 * 53;
                        doubleToLongBits = a7.h(obj, j10);
                        byte[] bArr5 = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 15:
                        i10 = i12 * 53;
                        floatToIntBits = a7.g(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    case 16:
                        i10 = i12 * 53;
                        doubleToLongBits = a7.h(obj, j10);
                        byte[] bArr6 = z4.f7405a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    case 17:
                        i11 = i12 * 53;
                        Object j12 = a7.j(obj, j10);
                        if (j12 != null) {
                            i14 = j12.hashCode();
                        }
                        i12 = i11 + i14;
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
                        i10 = i12 * 53;
                        floatToIntBits = a7.j(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i10 = i12 * 53;
                        floatToIntBits = a7.j(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                }
            }
        }
        int i15 = this.f7043i;
        while (true) {
            int[] iArr = this.f7041g;
            if (i15 >= iArr.length) {
                int hashCode = (i12 * 53) + ((t4) obj).zzc.hashCode();
                return this.f7040f ? (hashCode * 53) + ((q4) obj).zzb.f7168a.hashCode() : hashCode;
            }
            if (!s(obj, 0, iArr[i15])) {
                i12 = (i12 * 53) + a7.j(obj, C(r3) & 1048575).hashCode();
            }
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Object zze() {
        return ((t4) this.f7039e).u();
    }
}
