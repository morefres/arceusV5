package com.google.crypto.tink.shaded.protobuf;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.share.attribution.RequestError;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class v0<T> implements g1<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f8678r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f8679s = q1.D();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8680a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8681c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8682d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f8683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8684f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8685g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f8686h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8687i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f8688j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8689k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8690l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f8691m;

    /* renamed from: n, reason: collision with root package name */
    public final g0 f8692n;

    /* renamed from: o, reason: collision with root package name */
    public final n1<?, ?> f8693o;

    /* renamed from: p, reason: collision with root package name */
    public final q<?> f8694p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f8695q;

    public v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, b1 b1Var, boolean z10, int[] iArr2, int i12, int i13, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        this.f8680a = iArr;
        this.b = objArr;
        this.f8681c = i10;
        this.f8682d = i11;
        this.f8685g = s0Var instanceof y;
        this.f8686h = b1Var;
        this.f8684f = qVar != null && qVar.e(s0Var);
        this.f8687i = z10;
        this.f8688j = iArr2;
        this.f8689k = i12;
        this.f8690l = i13;
        this.f8691m = x0Var;
        this.f8692n = g0Var;
        this.f8693o = n1Var;
        this.f8694p = qVar;
        this.f8683e = s0Var;
        this.f8695q = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(Object obj, int i10, g1 g1Var) {
        return g1Var.c(q1.C(obj, W(i10)));
    }

    public static boolean D(int i10) {
        return (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).J();
        }
        return true;
    }

    public static boolean J(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static <T> long K(T t8, long j10) {
        return q1.A(t8, j10);
    }

    public static <T> v0<T> S(Class<T> cls, q0 q0Var, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        return q0Var instanceof e1 ? U((e1) q0Var, x0Var, g0Var, n1Var, qVar, n0Var) : T((k1) q0Var, x0Var, g0Var, n1Var, qVar, n0Var);
    }

    public static <T> v0<T> T(k1 k1Var, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        t[] e10 = k1Var.e();
        if (e10.length != 0) {
            t tVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            t tVar2 = e10[0];
            throw null;
        }
        int[] d10 = k1Var.d();
        if (d10 == null) {
            d10 = f8678r;
        }
        if (e10.length > 0) {
            t tVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f8678r;
        int[] iArr3 = f8678r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, 0, 0, k1Var.b(), k1Var.c(), true, iArr4, d10.length, d10.length + iArr2.length, x0Var, g0Var, n1Var, qVar, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.crypto.tink.shaded.protobuf.v0<T> U(com.google.crypto.tink.shaded.protobuf.e1 r33, com.google.crypto.tink.shaded.protobuf.x0 r34, com.google.crypto.tink.shaded.protobuf.g0 r35, com.google.crypto.tink.shaded.protobuf.n1<?, ?> r36, com.google.crypto.tink.shaded.protobuf.q<?> r37, com.google.crypto.tink.shaded.protobuf.n0 r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.U(com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.x0, com.google.crypto.tink.shaded.protobuf.g0, com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.n0):com.google.crypto.tink.shaded.protobuf.v0");
    }

    public static long W(int i10) {
        return i10 & 1048575;
    }

    public static <T> boolean X(T t8, long j10) {
        return ((Boolean) q1.C(t8, j10)).booleanValue();
    }

    public static <T> double Y(T t8, long j10) {
        return ((Double) q1.C(t8, j10)).doubleValue();
    }

    public static <T> float Z(T t8, long j10) {
        return ((Float) q1.C(t8, j10)).floatValue();
    }

    public static <T> int a0(T t8, long j10) {
        return ((Integer) q1.C(t8, j10)).intValue();
    }

    public static <T> long b0(T t8, long j10) {
        return ((Long) q1.C(t8, j10)).longValue();
    }

    public static <T> boolean l(T t8, long j10) {
        return q1.r(t8, j10);
    }

    public static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static Field n0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> double o(T t8, long j10) {
        return q1.x(t8, j10);
    }

    public static <T> float s(T t8, long j10) {
        return q1.y(t8, j10);
    }

    public static int t0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static o1 w(Object obj) {
        y yVar = (y) obj;
        o1 o1Var = yVar.unknownFields;
        if (o1Var != o1.c()) {
            return o1Var;
        }
        o1 k10 = o1.k();
        yVar.unknownFields = k10;
        return k10;
    }

    public static <T> int y(T t8, long j10) {
        return q1.z(t8, j10);
    }

    public static boolean z(int i10) {
        return (i10 & 536870912) != 0;
    }

    public final boolean A(T t8, int i10) {
        boolean equals;
        int i02 = i0(i10);
        long j10 = 1048575 & i02;
        if (j10 != 1048575) {
            return (q1.z(t8, j10) & (1 << (i02 >>> 20))) != 0;
        }
        int u02 = u0(i10);
        long W = W(u02);
        switch (t0(u02)) {
            case 0:
                return Double.doubleToRawLongBits(q1.x(t8, W)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.y(t8, W)) != 0;
            case 2:
                return q1.A(t8, W) != 0;
            case 3:
                return q1.A(t8, W) != 0;
            case 4:
                return q1.z(t8, W) != 0;
            case 5:
                return q1.A(t8, W) != 0;
            case 6:
                return q1.z(t8, W) != 0;
            case 7:
                return q1.r(t8, W);
            case 8:
                Object C = q1.C(t8, W);
                if (C instanceof String) {
                    equals = ((String) C).isEmpty();
                    break;
                } else {
                    if (!(C instanceof h)) {
                        throw new IllegalArgumentException();
                    }
                    equals = h.b.equals(C);
                    break;
                }
            case 9:
                return q1.C(t8, W) != null;
            case 10:
                equals = h.b.equals(q1.C(t8, W));
                break;
            case 11:
                return q1.z(t8, W) != 0;
            case 12:
                return q1.z(t8, W) != 0;
            case 13:
                return q1.z(t8, W) != 0;
            case 14:
                return q1.A(t8, W) != 0;
            case 15:
                return q1.z(t8, W) != 0;
            case 16:
                return q1.A(t8, W) != 0;
            case 17:
                return q1.C(t8, W) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean B(T t8, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? A(t8, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean E(Object obj, int i10, int i11) {
        List list = (List) q1.C(obj, W(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 v5 = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!v5.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(T t8, int i10, int i11) {
        if (this.f8695q.e(q1.C(t8, W(i10))).isEmpty()) {
            return true;
        }
        this.f8695q.b(u(i11));
        throw null;
    }

    public final boolean H(T t8, T t10, int i10) {
        long i02 = i0(i10) & 1048575;
        return q1.z(t8, i02) == q1.z(t10, i02);
    }

    public final boolean I(T t8, int i10, int i11) {
        return q1.z(t8, (long) (i0(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.n1<UT, UB> r18, com.google.crypto.tink.shaded.protobuf.q<ET> r19, T r20, com.google.crypto.tink.shaded.protobuf.f1 r21, com.google.crypto.tink.shaded.protobuf.p r22) {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.L(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final <K, V> void M(Object obj, int i10, Object obj2, p pVar, f1 f1Var) {
        long W = W(u0(i10));
        Object C = q1.C(obj, W);
        if (C == null) {
            C = this.f8695q.d(obj2);
            q1.R(obj, W, C);
        } else if (this.f8695q.h(C)) {
            Object d10 = this.f8695q.d(obj2);
            this.f8695q.a(d10, C);
            q1.R(obj, W, d10);
            C = d10;
        }
        Map<?, ?> c10 = this.f8695q.c(C);
        this.f8695q.b(obj2);
        f1Var.L(c10, null, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(T t8, T t10, int i10) {
        if (A(t10, i10)) {
            long W = W(u0(i10));
            Unsafe unsafe = f8679s;
            Object object = unsafe.getObject(t10, W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t10);
            }
            g1 v5 = v(i10);
            if (!A(t8, i10)) {
                if (G(object)) {
                    Object e10 = v5.e();
                    v5.a(e10, object);
                    unsafe.putObject(t8, W, e10);
                } else {
                    unsafe.putObject(t8, W, object);
                }
                o0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, W);
            if (!G(object2)) {
                Object e11 = v5.e();
                v5.a(e11, object2);
                unsafe.putObject(t8, W, e11);
                object2 = e11;
            }
            v5.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(T t8, T t10, int i10) {
        int V = V(i10);
        if (I(t10, V, i10)) {
            long W = W(u0(i10));
            Unsafe unsafe = f8679s;
            Object object = unsafe.getObject(t10, W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t10);
            }
            g1 v5 = v(i10);
            if (!I(t8, V, i10)) {
                if (G(object)) {
                    Object e10 = v5.e();
                    v5.a(e10, object);
                    unsafe.putObject(t8, W, e10);
                } else {
                    unsafe.putObject(t8, W, object);
                }
                p0(t8, V, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, W);
            if (!G(object2)) {
                Object e11 = v5.e();
                v5.a(e11, object2);
                unsafe.putObject(t8, W, e11);
                object2 = e11;
            }
            v5.a(object2, object);
        }
    }

    public final void P(T t8, T t10, int i10) {
        int u02 = u0(i10);
        long W = W(u02);
        int V = V(i10);
        switch (t0(u02)) {
            case 0:
                if (A(t10, i10)) {
                    q1.N(t8, W, q1.x(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 1:
                if (A(t10, i10)) {
                    q1.O(t8, W, q1.y(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 2:
                if (A(t10, i10)) {
                    q1.Q(t8, W, q1.A(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 3:
                if (A(t10, i10)) {
                    q1.Q(t8, W, q1.A(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 4:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 5:
                if (A(t10, i10)) {
                    q1.Q(t8, W, q1.A(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 6:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 7:
                if (A(t10, i10)) {
                    q1.H(t8, W, q1.r(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 8:
                if (A(t10, i10)) {
                    q1.R(t8, W, q1.C(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 9:
                N(t8, t10, i10);
                break;
            case 10:
                if (A(t10, i10)) {
                    q1.R(t8, W, q1.C(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 11:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 12:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 13:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 14:
                if (A(t10, i10)) {
                    q1.Q(t8, W, q1.A(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 15:
                if (A(t10, i10)) {
                    q1.P(t8, W, q1.z(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 16:
                if (A(t10, i10)) {
                    q1.Q(t8, W, q1.A(t10, W));
                    o0(t8, i10);
                    break;
                }
                break;
            case 17:
                N(t8, t10, i10);
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
                this.f8692n.b(t8, t10, W);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                i1.F(this.f8695q, t8, t10, W);
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
                if (I(t10, V, i10)) {
                    q1.R(t8, W, q1.C(t10, W));
                    p0(t8, V, i10);
                    break;
                }
                break;
            case 60:
                O(t8, t10, i10);
                break;
            case 61:
            case 62:
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(t10, V, i10)) {
                    q1.R(t8, W, q1.C(t10, W));
                    p0(t8, V, i10);
                    break;
                }
                break;
            case 68:
                O(t8, t10, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object Q(T t8, int i10) {
        g1 v5 = v(i10);
        long W = W(u0(i10));
        if (!A(t8, i10)) {
            return v5.e();
        }
        Object object = f8679s.getObject(t8, W);
        if (G(object)) {
            return object;
        }
        Object e10 = v5.e();
        if (object != null) {
            v5.a(e10, object);
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object R(T t8, int i10, int i11) {
        g1 v5 = v(i11);
        if (!I(t8, i10, i11)) {
            return v5.e();
        }
        Object object = f8679s.getObject(t8, W(u0(i11)));
        if (G(object)) {
            return object;
        }
        Object e10 = v5.e();
        if (object != null) {
            v5.a(e10, object);
        }
        return e10;
    }

    public final int V(int i10) {
        return this.f8680a[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t8, T t10) {
        m(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f8680a.length; i10 += 3) {
            P(t8, t10, i10);
        }
        i1.G(this.f8693o, t8, t10);
        if (this.f8684f) {
            i1.E(this.f8694p, t8, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t8) {
        if (G(t8)) {
            if (t8 instanceof y) {
                y yVar = (y) t8;
                yVar.s();
                yVar.r();
                yVar.L();
            }
            int length = this.f8680a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int u02 = u0(i10);
                long W = W(u02);
                int t02 = t0(u02);
                if (t02 != 9) {
                    if (t02 != 60 && t02 != 68) {
                        switch (t02) {
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
                                this.f8692n.a(t8, W);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f8679s;
                                Object object = unsafe.getObject(t8, W);
                                if (object != null) {
                                    unsafe.putObject(t8, W, this.f8695q.f(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (I(t8, V(i10), i10)) {
                        v(i10).b(f8679s.getObject(t8, W));
                    }
                }
                if (A(t8, i10)) {
                    v(i10).b(f8679s.getObject(t8, W));
                }
            }
            this.f8693o.j(t8);
            if (this.f8684f) {
                this.f8694p.f(t8);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f8689k) {
            int i15 = this.f8688j[i13];
            int V = V(i15);
            int u02 = u0(i15);
            int i16 = this.f8680a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f8679s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (J(u02) && !B(t10, i15, i10, i11, i18)) {
                return false;
            }
            int t02 = t0(u02);
            if (t02 != 9 && t02 != 17) {
                if (t02 != 27) {
                    if (t02 == 60 || t02 == 68) {
                        if (I(t10, V, i15) && !C(t10, u02, v(i15))) {
                            return false;
                        }
                    } else if (t02 != 49) {
                        if (t02 == 50 && !F(t10, u02, i15)) {
                            return false;
                        }
                    }
                }
                if (!E(t10, u02, i15)) {
                    return false;
                }
            } else if (B(t10, i15, i10, i11, i18) && !C(t10, u02, v(i15))) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f8684f || this.f8694p.c(t8).o();
    }

    public final <K, V> int c0(T t8, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = f8679s;
        Object u8 = u(i12);
        Object object = unsafe.getObject(t8, j10);
        if (this.f8695q.h(object)) {
            Object d10 = this.f8695q.d(u8);
            this.f8695q.a(d10, object);
            unsafe.putObject(t8, j10, d10);
            object = d10;
        }
        this.f8695q.b(u8);
        return n(bArr, i10, i11, null, this.f8695q.c(object), bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t8) {
        int i10;
        int i11;
        int q10;
        int x10;
        int i12;
        int U;
        int W;
        v0<T> v0Var = this;
        T t10 = t8;
        Unsafe unsafe = f8679s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < v0Var.f8680a.length) {
            int u02 = v0Var.u0(i14);
            int t02 = t0(u02);
            int V = v0Var.V(i14);
            int i18 = v0Var.f8680a[i14 + 2];
            int i19 = i18 & i13;
            if (t02 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t10, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long W2 = W(u02);
            if (t02 < v.O.a() || t02 > v.f8641b0.a()) {
                i19 = 0;
            }
            switch (t02) {
                case 0:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        i11 = k.i(V, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 1:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.q(V, 0.0f);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 2:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.x(V, unsafe.getLong(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 3:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.X(V, unsafe.getLong(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 4:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.v(V, unsafe.getInt(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 5:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.o(V, 0L);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 6:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.m(V, 0);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 7:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.d(V, true);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 8:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t10, W2);
                        x10 = object instanceof h ? k.g(V, (h) object) : k.S(V, (String) object);
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 9:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        i11 = i1.o(V, unsafe.getObject(t10, W2), v0Var.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 10:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.g(V, (h) unsafe.getObject(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 11:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.V(V, unsafe.getInt(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 12:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.k(V, unsafe.getInt(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 13:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.K(V, 0);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 14:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        q10 = k.M(V, 0L);
                        i16 = i20 + q10;
                        v0Var = this;
                        t10 = t8;
                        break;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 15:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.O(V, unsafe.getInt(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 16:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        x10 = k.Q(V, unsafe.getLong(t10, W2));
                        i16 = i20 + x10;
                        v0Var = this;
                        break;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 17:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        i11 = k.s(V, (s0) unsafe.getObject(t10, W2), v0Var.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 18:
                    i11 = i1.h(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = i1.f(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = i1.m(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    i11 = i1.x(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    i11 = i1.k(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    i11 = i1.h(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    i11 = i1.f(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = i1.a(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    i11 = i1.u(V, (List) unsafe.getObject(t10, W2));
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    i11 = i1.p(V, (List) unsafe.getObject(t10, W2), v0Var.v(i14));
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    i11 = i1.c(V, (List) unsafe.getObject(t10, W2));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = i1.v(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    i11 = i1.d(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = i1.f(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 32:
                    i11 = i1.h(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    i11 = i1.q(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    i11 = i1.s(V, (List) unsafe.getObject(t10, W2), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = i1.i((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    i12 = i1.g((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    i12 = i1.n((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    i12 = i1.y((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    i12 = i1.l((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 40:
                    i12 = i1.i((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 41:
                    i12 = i1.g((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    i12 = i1.b((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    i12 = i1.w((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    i12 = i1.e((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    i12 = i1.g((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    i12 = i1.i((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    i12 = i1.r((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = i1.t((List) unsafe.getObject(t10, W2));
                    if (i12 > 0) {
                        if (v0Var.f8687i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = k.U(V);
                        W = k.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = i1.j(V, (List) unsafe.getObject(t10, W2), v0Var.v(i14));
                    i16 = i20 + i11;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i11 = v0Var.f8695q.g(V, unsafe.getObject(t10, W2), v0Var.u(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.i(V, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 52:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.q(V, 0.0f);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 53:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.x(V, b0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 54:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.X(V, b0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 55:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.v(V, a0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 56:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.o(V, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 57:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.m(V, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 58:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.d(V, true);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 59:
                    if (v0Var.I(t10, V, i14)) {
                        Object object2 = unsafe.getObject(t10, W2);
                        i11 = object2 instanceof h ? k.g(V, (h) object2) : k.S(V, (String) object2);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 60:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = i1.o(V, unsafe.getObject(t10, W2), v0Var.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 61:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.g(V, (h) unsafe.getObject(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.V(V, a0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.k(V, a0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 64:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.K(V, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.M(V, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.O(V, a0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.Q(V, b0(t10, W2));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 68:
                    if (v0Var.I(t10, V, i14)) {
                        i11 = k.s(V, (s0) unsafe.getObject(t10, W2), v0Var.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                default:
                    i16 = i20;
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        int x11 = i16 + v0Var.x(v0Var.f8693o, t10);
        return v0Var.f8684f ? x11 + v0Var.f8694p.c(t10).l() : x11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d0(T r27, byte[] r28, int r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.b r32) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.d0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        return (T) this.f8691m.a(this.f8683e);
    }

    public final int e0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) {
        Unsafe unsafe = f8679s;
        long j11 = this.f8680a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Double.valueOf(e.e(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Float.valueOf(e.m(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int M = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(bVar.b));
                unsafe.putInt(t8, j11, i13);
                return M;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int J = e.J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(bVar.f8473a));
                unsafe.putInt(t8, j11, i13);
                return J;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Long.valueOf(e.k(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(e.i(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int M2 = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Boolean.valueOf(bVar.b != 0));
                unsafe.putInt(t8, j11, i13);
                return M2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int J2 = e.J(bArr, i10, bVar);
                int i22 = bVar.f8473a;
                if (i22 == 0) {
                    unsafe.putObject(t8, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !r1.m(bArr, J2, J2 + i22)) {
                        throw b0.d();
                    }
                    unsafe.putObject(t8, j10, new String(bArr, J2, i22, a0.b));
                    J2 += i22;
                }
                unsafe.putInt(t8, j11, i13);
                return J2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object R = R(t8, i13, i17);
                int P = e.P(R, v(i17), bArr, i10, i11, bVar);
                s0(t8, i13, i17, R);
                return P;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int c10 = e.c(bArr, i10, bVar);
                unsafe.putObject(t8, j10, bVar.f8474c);
                unsafe.putInt(t8, j11, i13);
                return c10;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i14 != 0) {
                    return i10;
                }
                int J3 = e.J(bArr, i10, bVar);
                int i23 = bVar.f8473a;
                a0.e t10 = t(i17);
                if (t10 != null && !t10.a(i23)) {
                    w(t8).n(i12, Long.valueOf(i23));
                    return J3;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(i23));
                unsafe.putInt(t8, j11, i13);
                return J3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int J4 = e.J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(i.c(bVar.f8473a)));
                unsafe.putInt(t8, j11, i13);
                return J4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int M3 = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(i.d(bVar.b)));
                unsafe.putInt(t8, j11, i13);
                return M3;
            case 68:
                if (i14 == 3) {
                    Object R2 = R(t8, i13, i17);
                    int O = e.O(R2, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    s0(t8, i13, i17, R2);
                    return O;
                }
                break;
        }
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int f(T t8) {
        int i10;
        int f10;
        int length = this.f8680a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int u02 = u0(i12);
            int V = V(i12);
            long W = W(u02);
            int i13 = 37;
            switch (t0(u02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = a0.f(Double.doubleToLongBits(q1.x(t8, W)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(q1.y(t8, W));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = a0.f(q1.A(t8, W));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = a0.f(q1.A(t8, W));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = a0.f(q1.A(t8, W));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = a0.c(q1.r(t8, W));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) q1.C(t8, W)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object C = q1.C(t8, W);
                    if (C != null) {
                        i13 = C.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = q1.C(t8, W).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = a0.f(q1.A(t8, W));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, W);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = a0.f(q1.A(t8, W));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object C2 = q1.C(t8, W);
                    if (C2 != null) {
                        i13 = C2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
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
                    i10 = i11 * 53;
                    f10 = q1.C(t8, W).hashCode();
                    i11 = i10 + f10;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i10 = i11 * 53;
                    f10 = q1.C(t8, W).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(Double.doubleToLongBits(Y(t8, W)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(Z(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(b0(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(b0(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(b0(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.c(X(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) q1.C(t8, W)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.C(t8, W).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.C(t8, W).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(b0(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0(t8, W);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = a0.f(b0(t8, W));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (I(t8, V, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.C(t8, W).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f8693o.g(t8).hashCode();
        return this.f8684f ? (hashCode * 53) + this.f8694p.c(t8).hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int f0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) {
        int K;
        Unsafe unsafe = f8679s;
        a0.i iVar = (a0.i) unsafe.getObject(t8, j11);
        if (!iVar.n()) {
            int size = iVar.size();
            iVar = iVar.o(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j11, iVar);
        }
        a0.i iVar2 = iVar;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.t(bArr, i10, iVar2, bVar);
                }
                if (i14 == 1) {
                    return e.f(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 19:
            case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                if (i14 == 2) {
                    return e.w(bArr, i10, iVar2, bVar);
                }
                if (i14 == 5) {
                    return e.n(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 20:
            case MotionEventCompat.AXIS_WHEEL /* 21 */:
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                if (i14 == 2) {
                    return e.A(bArr, i10, iVar2, bVar);
                }
                if (i14 == 0) {
                    return e.N(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_GAS /* 22 */:
            case 29:
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                if (i14 == 2) {
                    return e.z(bArr, i10, iVar2, bVar);
                }
                if (i14 == 0) {
                    return e.K(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_BRAKE /* 23 */:
            case 32:
            case 40:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                if (i14 == 2) {
                    return e.v(bArr, i10, iVar2, bVar);
                }
                if (i14 == 1) {
                    return e.l(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_DISTANCE /* 24 */:
            case 31:
            case 41:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                if (i14 == 2) {
                    return e.u(bArr, i10, iVar2, bVar);
                }
                if (i14 == 5) {
                    return e.j(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 25:
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                if (i14 == 2) {
                    return e.s(bArr, i10, iVar2, bVar);
                }
                if (i14 == 0) {
                    return e.b(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_SCROLL /* 26 */:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? e.E(i12, bArr, i10, i11, iVar2, bVar) : e.F(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                if (i14 == 2) {
                    return e.r(v(i15), i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                if (i14 == 2) {
                    return e.d(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        K = e.K(i12, bArr, i10, i11, iVar2, bVar);
                    }
                    return i10;
                }
                K = e.z(bArr, i10, iVar2, bVar);
                i1.A(t8, i13, iVar2, t(i15), null, this.f8693o);
                return K;
            case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                if (i14 == 2) {
                    return e.x(bArr, i10, iVar2, bVar);
                }
                if (i14 == 0) {
                    return e.B(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
            case 48:
                if (i14 == 2) {
                    return e.y(bArr, i10, iVar2, bVar);
                }
                if (i14 == 0) {
                    return e.C(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return e.p(v(i15), i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t8, T t10) {
        int length = this.f8680a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f8693o.g(t8).equals(this.f8693o.g(t10))) {
            return false;
        }
        if (this.f8684f) {
            return this.f8694p.c(t8).equals(this.f8694p.c(t10));
        }
        return true;
    }

    public final int g0(int i10) {
        if (i10 < this.f8681c || i10 > this.f8682d) {
            return -1;
        }
        return q0(i10, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t8, byte[] bArr, int i10, int i11, e.b bVar) {
        d0(t8, bArr, i10, i11, 0, bVar);
    }

    public final int h0(int i10, int i11) {
        if (i10 < this.f8681c || i10 > this.f8682d) {
            return -1;
        }
        return q0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t8, f1 f1Var, p pVar) {
        pVar.getClass();
        m(t8);
        L(this.f8693o, this.f8694p, t8, f1Var, pVar);
    }

    public final int i0(int i10) {
        return this.f8680a[i10 + 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t8, t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            w0(t8, t1Var);
        } else {
            v0(t8, t1Var);
        }
    }

    public final <E> void j0(Object obj, long j10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.P(this.f8692n.c(obj, j10), g1Var, pVar);
    }

    public final boolean k(T t8, T t10, int i10) {
        return A(t8, i10) == A(t10, i10);
    }

    public final <E> void k0(Object obj, int i10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.N(this.f8692n.c(obj, W(i10)), g1Var, pVar);
    }

    public final void l0(Object obj, int i10, f1 f1Var) {
        if (z(i10)) {
            q1.R(obj, W(i10), f1Var.I());
        } else if (this.f8685g) {
            q1.R(obj, W(i10), f1Var.z());
        } else {
            q1.R(obj, W(i10), f1Var.o());
        }
    }

    public final void m0(Object obj, int i10, f1 f1Var) {
        if (z(i10)) {
            f1Var.n(this.f8692n.c(obj, W(i10)));
        } else {
            f1Var.B(this.f8692n.c(obj, W(i10)));
        }
    }

    public final <K, V> int n(byte[] bArr, int i10, int i11, l0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int J = e.J(bArr, i10, bVar);
        int i12 = bVar.f8473a;
        if (i12 < 0 || i12 > i11 - J) {
            throw b0.m();
        }
        throw null;
    }

    public final void o0(T t8, int i10) {
        int i02 = i0(i10);
        long j10 = 1048575 & i02;
        if (j10 == 1048575) {
            return;
        }
        q1.P(t8, j10, (1 << (i02 >>> 20)) | q1.z(t8, j10));
    }

    public final boolean p(T t8, T t10, int i10) {
        int u02 = u0(i10);
        long W = W(u02);
        switch (t0(u02)) {
            case 0:
                if (!k(t8, t10, i10) || Double.doubleToLongBits(q1.x(t8, W)) != Double.doubleToLongBits(q1.x(t10, W))) {
                }
                break;
            case 1:
                if (!k(t8, t10, i10) || Float.floatToIntBits(q1.y(t8, W)) != Float.floatToIntBits(q1.y(t10, W))) {
                }
                break;
            case 2:
                if (!k(t8, t10, i10) || q1.A(t8, W) != q1.A(t10, W)) {
                }
                break;
            case 3:
                if (!k(t8, t10, i10) || q1.A(t8, W) != q1.A(t10, W)) {
                }
                break;
            case 4:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 5:
                if (!k(t8, t10, i10) || q1.A(t8, W) != q1.A(t10, W)) {
                }
                break;
            case 6:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 7:
                if (!k(t8, t10, i10) || q1.r(t8, W) != q1.r(t10, W)) {
                }
                break;
            case 8:
                if (!k(t8, t10, i10) || !i1.I(q1.C(t8, W), q1.C(t10, W))) {
                }
                break;
            case 9:
                if (!k(t8, t10, i10) || !i1.I(q1.C(t8, W), q1.C(t10, W))) {
                }
                break;
            case 10:
                if (!k(t8, t10, i10) || !i1.I(q1.C(t8, W), q1.C(t10, W))) {
                }
                break;
            case 11:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 12:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 13:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 14:
                if (!k(t8, t10, i10) || q1.A(t8, W) != q1.A(t10, W)) {
                }
                break;
            case 15:
                if (!k(t8, t10, i10) || q1.z(t8, W) != q1.z(t10, W)) {
                }
                break;
            case 16:
                if (!k(t8, t10, i10) || q1.A(t8, W) != q1.A(t10, W)) {
                }
                break;
            case 17:
                if (!k(t8, t10, i10) || !i1.I(q1.C(t8, W), q1.C(t10, W))) {
                }
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
                if (!H(t8, t10, i10) || !i1.I(q1.C(t8, W), q1.C(t10, W))) {
                }
                break;
        }
        return true;
    }

    public final void p0(T t8, int i10, int i11) {
        q1.P(t8, i0(i11) & 1048575, i10);
    }

    public final <UT, UB> UB q(Object obj, int i10, UB ub, n1<UT, UB> n1Var, Object obj2) {
        a0.e t8;
        int V = V(i10);
        Object C = q1.C(obj, W(u0(i10)));
        return (C == null || (t8 = t(i10)) == null) ? ub : (UB) r(i10, V, this.f8695q.c(C), t8, ub, n1Var, obj2);
    }

    public final int q0(int i10, int i11) {
        int length = (this.f8680a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int V = V(i13);
            if (i10 == V) {
                return i13;
            }
            if (i10 < V) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub, n1<UT, UB> n1Var, Object obj) {
        this.f8695q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n1Var.f(obj);
                }
                h.C0133h l10 = h.l(l0.b(null, next.getKey(), next.getValue()));
                try {
                    l0.d(l10.b(), null, next.getKey(), next.getValue());
                    n1Var.d(ub, i11, l10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    public final void r0(T t8, int i10, Object obj) {
        f8679s.putObject(t8, W(u0(i10)), obj);
        o0(t8, i10);
    }

    public final void s0(T t8, int i10, int i11, Object obj) {
        f8679s.putObject(t8, W(u0(i11)), obj);
        p0(t8, i10, i11);
    }

    public final a0.e t(int i10) {
        return (a0.e) this.b[((i10 / 3) * 2) + 1];
    }

    public final Object u(int i10) {
        return this.b[(i10 / 3) * 2];
    }

    public final int u0(int i10) {
        return this.f8680a[i10 + 1];
    }

    public final g1 v(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> c10 = c1.a().c((Class) this.b[i11 + 1]);
        this.b[i11] = c10;
        return c10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(T r19, com.google.crypto.tink.shaded.protobuf.t1 r20) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.v0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.t1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(T r11, com.google.crypto.tink.shaded.protobuf.t1 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.w0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.t1):void");
    }

    public final <UT, UB> int x(n1<UT, UB> n1Var, T t8) {
        return n1Var.h(n1Var.g(t8));
    }

    public final <K, V> void x0(t1 t1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f8695q.b(u(i11));
            t1Var.J(i10, null, this.f8695q.e(obj));
        }
    }

    public final void y0(int i10, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.e(i10, (String) obj);
        } else {
            t1Var.M(i10, (h) obj);
        }
    }

    public final <UT, UB> void z0(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.t(n1Var.g(t8), t1Var);
    }
}
