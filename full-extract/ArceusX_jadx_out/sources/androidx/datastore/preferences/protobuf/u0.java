package androidx.datastore.preferences.protobuf;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.z;
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
public final class u0<T> implements g1<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2172r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f2173s = q1.A();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2174a;
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2176d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f2177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2178f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2179g;

    /* renamed from: h, reason: collision with root package name */
    public final b1 f2180h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2181i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2182j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2183k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2184l;

    /* renamed from: m, reason: collision with root package name */
    public final w0 f2185m;

    /* renamed from: n, reason: collision with root package name */
    public final f0 f2186n;

    /* renamed from: o, reason: collision with root package name */
    public final n1<?, ?> f2187o;

    /* renamed from: p, reason: collision with root package name */
    public final p<?> f2188p;

    /* renamed from: q, reason: collision with root package name */
    public final m0 f2189q;

    public u0(int[] iArr, Object[] objArr, int i10, int i11, r0 r0Var, b1 b1Var, boolean z10, int[] iArr2, int i12, int i13, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        this.f2174a = iArr;
        this.b = objArr;
        this.f2175c = i10;
        this.f2176d = i11;
        this.f2179g = r0Var instanceof x;
        this.f2180h = b1Var;
        this.f2178f = pVar != null && pVar.e(r0Var);
        this.f2181i = z10;
        this.f2182j = iArr2;
        this.f2183k = i12;
        this.f2184l = i13;
        this.f2185m = w0Var;
        this.f2186n = f0Var;
        this.f2187o = n1Var;
        this.f2188p = pVar;
        this.f2177e = r0Var;
        this.f2189q = m0Var;
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).I();
        }
        return true;
    }

    public static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static <T> long G(T t8, long j10) {
        return q1.x(t8, j10);
    }

    public static <T> u0<T> O(Class<T> cls, p0 p0Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        return p0Var instanceof e1 ? Q((e1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var) : P((k1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    public static <T> u0<T> P(k1 k1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        s[] e10 = k1Var.e();
        if (e10.length != 0) {
            s sVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            s sVar2 = e10[0];
            throw null;
        }
        int[] d10 = k1Var.d();
        if (d10 == null) {
            d10 = f2172r;
        }
        if (e10.length > 0) {
            s sVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f2172r;
        int[] iArr3 = f2172r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), k1Var.c(), true, iArr4, d10.length, d10.length + iArr2.length, w0Var, f0Var, n1Var, pVar, m0Var);
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
    public static <T> androidx.datastore.preferences.protobuf.u0<T> Q(androidx.datastore.preferences.protobuf.e1 r33, androidx.datastore.preferences.protobuf.w0 r34, androidx.datastore.preferences.protobuf.f0 r35, androidx.datastore.preferences.protobuf.n1<?, ?> r36, androidx.datastore.preferences.protobuf.p<?> r37, androidx.datastore.preferences.protobuf.m0 r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.Q(androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.m0):androidx.datastore.preferences.protobuf.u0");
    }

    public static long S(int i10) {
        return i10 & 1048575;
    }

    public static <T> boolean T(T t8, long j10) {
        return ((Boolean) q1.z(t8, j10)).booleanValue();
    }

    public static <T> double U(T t8, long j10) {
        return ((Double) q1.z(t8, j10)).doubleValue();
    }

    public static <T> float V(T t8, long j10) {
        return ((Float) q1.z(t8, j10)).floatValue();
    }

    public static <T> int W(T t8, long j10) {
        return ((Integer) q1.z(t8, j10)).intValue();
    }

    public static <T> long X(T t8, long j10) {
        return ((Long) q1.z(t8, j10)).longValue();
    }

    public static Field e0(Class<?> cls, String str) {
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

    public static <T> boolean k(T t8, long j10) {
        return q1.p(t8, j10);
    }

    public static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static <T> double m(T t8, long j10) {
        return q1.u(t8, j10);
    }

    public static <T> float q(T t8, long j10) {
        return q1.v(t8, j10);
    }

    public static <T> int v(T t8, long j10) {
        return q1.w(t8, j10);
    }

    public static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean z(Object obj, int i10, g1 g1Var) {
        return g1Var.c(q1.z(obj, S(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) q1.z(obj, S(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 t8 = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!t8.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.g1] */
    public final boolean B(T t8, int i10, int i11) {
        Map<?, ?> e10 = this.f2189q.e(q1.z(t8, S(i10)));
        if (e10.isEmpty()) {
            return true;
        }
        if (this.f2189q.b(s(i11)).f2048c.a() != s1.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : e10.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = c1.a().c(obj.getClass());
            }
            if (!r52.c(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(T t8, T t10, int i10) {
        long Z = Z(i10) & 1048575;
        return q1.w(t8, Z) == q1.w(t10, Z);
    }

    public final boolean E(T t8, int i10, int i11) {
        return q1.w(t8, (long) (Z(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.t.b<ET>> void H(androidx.datastore.preferences.protobuf.n1<UT, UB> r18, androidx.datastore.preferences.protobuf.p<ET> r19, T r20, androidx.datastore.preferences.protobuf.f1 r21, androidx.datastore.preferences.protobuf.o r22) {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.H(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.o):void");
    }

    public final <K, V> void I(Object obj, int i10, Object obj2, o oVar, f1 f1Var) {
        long S = S(l0(i10));
        Object z10 = q1.z(obj, S);
        if (z10 == null) {
            z10 = this.f2189q.d(obj2);
            q1.O(obj, S, z10);
        } else if (this.f2189q.h(z10)) {
            Object d10 = this.f2189q.d(obj2);
            this.f2189q.a(d10, z10);
            q1.O(obj, S, d10);
            z10 = d10;
        }
        f1Var.N(this.f2189q.c(z10), this.f2189q.b(obj2), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(T t8, T t10, int i10) {
        if (x(t10, i10)) {
            long S = S(l0(i10));
            Unsafe unsafe = f2173s;
            Object object = unsafe.getObject(t10, S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t10);
            }
            g1 t11 = t(i10);
            if (!x(t8, i10)) {
                if (C(object)) {
                    Object e10 = t11.e();
                    t11.a(e10, object);
                    unsafe.putObject(t8, S, e10);
                } else {
                    unsafe.putObject(t8, S, object);
                }
                f0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, S);
            if (!C(object2)) {
                Object e11 = t11.e();
                t11.a(e11, object2);
                unsafe.putObject(t8, S, e11);
                object2 = e11;
            }
            t11.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(T t8, T t10, int i10) {
        int R = R(i10);
        if (E(t10, R, i10)) {
            long S = S(l0(i10));
            Unsafe unsafe = f2173s;
            Object object = unsafe.getObject(t10, S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t10);
            }
            g1 t11 = t(i10);
            if (!E(t8, R, i10)) {
                if (C(object)) {
                    Object e10 = t11.e();
                    t11.a(e10, object);
                    unsafe.putObject(t8, S, e10);
                } else {
                    unsafe.putObject(t8, S, object);
                }
                g0(t8, R, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, S);
            if (!C(object2)) {
                Object e11 = t11.e();
                t11.a(e11, object2);
                unsafe.putObject(t8, S, e11);
                object2 = e11;
            }
            t11.a(object2, object);
        }
    }

    public final void L(T t8, T t10, int i10) {
        int l02 = l0(i10);
        long S = S(l02);
        int R = R(i10);
        switch (k0(l02)) {
            case 0:
                if (x(t10, i10)) {
                    q1.K(t8, S, q1.u(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 1:
                if (x(t10, i10)) {
                    q1.L(t8, S, q1.v(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 2:
                if (x(t10, i10)) {
                    q1.N(t8, S, q1.x(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 3:
                if (x(t10, i10)) {
                    q1.N(t8, S, q1.x(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 4:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 5:
                if (x(t10, i10)) {
                    q1.N(t8, S, q1.x(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 6:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 7:
                if (x(t10, i10)) {
                    q1.E(t8, S, q1.p(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 8:
                if (x(t10, i10)) {
                    q1.O(t8, S, q1.z(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 9:
                J(t8, t10, i10);
                break;
            case 10:
                if (x(t10, i10)) {
                    q1.O(t8, S, q1.z(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 11:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 12:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 13:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 14:
                if (x(t10, i10)) {
                    q1.N(t8, S, q1.x(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 15:
                if (x(t10, i10)) {
                    q1.M(t8, S, q1.w(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 16:
                if (x(t10, i10)) {
                    q1.N(t8, S, q1.x(t10, S));
                    f0(t8, i10);
                    break;
                }
                break;
            case 17:
                J(t8, t10, i10);
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
                this.f2186n.b(t8, t10, S);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                i1.F(this.f2189q, t8, t10, S);
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
                if (E(t10, R, i10)) {
                    q1.O(t8, S, q1.z(t10, S));
                    g0(t8, R, i10);
                    break;
                }
                break;
            case 60:
                K(t8, t10, i10);
                break;
            case 61:
            case 62:
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t10, R, i10)) {
                    q1.O(t8, S, q1.z(t10, S));
                    g0(t8, R, i10);
                    break;
                }
                break;
            case 68:
                K(t8, t10, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object M(T t8, int i10) {
        g1 t10 = t(i10);
        long S = S(l0(i10));
        if (!x(t8, i10)) {
            return t10.e();
        }
        Object object = f2173s.getObject(t8, S);
        if (C(object)) {
            return object;
        }
        Object e10 = t10.e();
        if (object != null) {
            t10.a(e10, object);
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object N(T t8, int i10, int i11) {
        g1 t10 = t(i11);
        if (!E(t8, i10, i11)) {
            return t10.e();
        }
        Object object = f2173s.getObject(t8, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object e10 = t10.e();
        if (object != null) {
            t10.a(e10, object);
        }
        return e10;
    }

    public final int R(int i10) {
        return this.f2174a[i10];
    }

    public final int Y(int i10) {
        if (i10 < this.f2175c || i10 > this.f2176d) {
            return -1;
        }
        return h0(i10, 0);
    }

    public final int Z(int i10) {
        return this.f2174a[i10 + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t8, T t10) {
        l(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f2174a.length; i10 += 3) {
            L(t8, t10, i10);
        }
        i1.G(this.f2187o, t8, t10);
        if (this.f2178f) {
            i1.E(this.f2188p, t8, t10);
        }
    }

    public final <E> void a0(Object obj, long j10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.P(this.f2186n.c(obj, j10), g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g1
    public void b(T t8) {
        if (C(t8)) {
            if (t8 instanceof x) {
                x xVar = (x) t8;
                xVar.t();
                xVar.s();
                xVar.K();
            }
            int length = this.f2174a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int l02 = l0(i10);
                long S = S(l02);
                int k02 = k0(l02);
                if (k02 != 9) {
                    if (k02 != 60 && k02 != 68) {
                        switch (k02) {
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
                                this.f2186n.a(t8, S);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f2173s;
                                Object object = unsafe.getObject(t8, S);
                                if (object != null) {
                                    unsafe.putObject(t8, S, this.f2189q.f(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (E(t8, R(i10), i10)) {
                        t(i10).b(f2173s.getObject(t8, S));
                    }
                }
                if (x(t8, i10)) {
                    t(i10).b(f2173s.getObject(t8, S));
                }
            }
            this.f2187o.j(t8);
            if (this.f2178f) {
                this.f2188p.f(t8);
            }
        }
    }

    public final <E> void b0(Object obj, int i10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.K(this.f2186n.c(obj, S(i10)), g1Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f2183k) {
            int i15 = this.f2182j[i13];
            int R = R(i15);
            int l02 = l0(i15);
            int i16 = this.f2174a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f2173s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (F(l02) && !y(t10, i15, i10, i11, i18)) {
                return false;
            }
            int k02 = k0(l02);
            if (k02 != 9 && k02 != 17) {
                if (k02 != 27) {
                    if (k02 == 60 || k02 == 68) {
                        if (E(t10, R, i15) && !z(t10, l02, t(i15))) {
                            return false;
                        }
                    } else if (k02 != 49) {
                        if (k02 == 50 && !B(t10, l02, i15)) {
                            return false;
                        }
                    }
                }
                if (!A(t10, l02, i15)) {
                    return false;
                }
            } else if (y(t10, i15, i10, i11, i18) && !z(t10, l02, t(i15))) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f2178f || this.f2188p.c(t8).p();
    }

    public final void c0(Object obj, int i10, f1 f1Var) {
        if (w(i10)) {
            q1.O(obj, S(i10), f1Var.I());
        } else if (this.f2179g) {
            q1.O(obj, S(i10), f1Var.z());
        } else {
            q1.O(obj, S(i10), f1Var.o());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.g1
    public int d(T t8) {
        int i10;
        int i11;
        int q10;
        int x10;
        int i12;
        int U;
        int W;
        u0<T> u0Var = this;
        T t10 = t8;
        Unsafe unsafe = f2173s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < u0Var.f2174a.length) {
            int l02 = u0Var.l0(i14);
            int k02 = k0(l02);
            int R = u0Var.R(i14);
            int i18 = u0Var.f2174a[i14 + 2];
            int i19 = i18 & i13;
            if (k02 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t10, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long S = S(l02);
            if (k02 < u.O.a() || k02 > u.f2135b0.a()) {
                i19 = 0;
            }
            switch (k02) {
                case 0:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        i11 = j.i(R, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 1:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.q(R, 0.0f);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 2:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.x(R, unsafe.getLong(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 3:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.X(R, unsafe.getLong(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 4:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.v(R, unsafe.getInt(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 5:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.o(R, 0L);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 6:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.m(R, 0);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 7:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.d(R, true);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 8:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t10, S);
                        x10 = object instanceof g ? j.g(R, (g) object) : j.S(R, (String) object);
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 9:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        i11 = i1.o(R, unsafe.getObject(t10, S), u0Var.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 10:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.g(R, (g) unsafe.getObject(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 11:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.V(R, unsafe.getInt(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 12:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.k(R, unsafe.getInt(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 13:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.K(R, 0);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 14:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        q10 = j.M(R, 0L);
                        i16 = i20 + q10;
                        u0Var = this;
                        t10 = t8;
                        break;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 15:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.O(R, unsafe.getInt(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 16:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        x10 = j.Q(R, unsafe.getLong(t10, S));
                        i16 = i20 + x10;
                        u0Var = this;
                        break;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 17:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        i11 = j.s(R, (r0) unsafe.getObject(t10, S), u0Var.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 18:
                    i11 = i1.h(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = i1.f(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = i1.m(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    i11 = i1.x(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    i11 = i1.k(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    i11 = i1.h(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    i11 = i1.f(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = i1.a(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_SCROLL /* 26 */:
                    i11 = i1.u(R, (List) unsafe.getObject(t10, S));
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_X /* 27 */:
                    i11 = i1.p(R, (List) unsafe.getObject(t10, S), u0Var.t(i14));
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_RELATIVE_Y /* 28 */:
                    i11 = i1.c(R, (List) unsafe.getObject(t10, S));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = i1.v(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                    i11 = i1.d(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = i1.f(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 32:
                    i11 = i1.h(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_2 /* 33 */:
                    i11 = i1.q(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    i11 = i1.s(R, (List) unsafe.getObject(t10, S), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = i1.i((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    i12 = i1.g((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    i12 = i1.n((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    i12 = i1.y((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    i12 = i1.l((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 40:
                    i12 = i1.i((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 41:
                    i12 = i1.g((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    i12 = i1.b((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    i12 = i1.w((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    i12 = i1.e((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    i12 = i1.g((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    i12 = i1.i((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    i12 = i1.r((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = i1.t((List) unsafe.getObject(t10, S));
                    if (i12 > 0) {
                        if (u0Var.f2181i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        U = j.U(R);
                        W = j.W(i12);
                        i16 = i20 + U + W + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = i1.j(R, (List) unsafe.getObject(t10, S), u0Var.t(i14));
                    i16 = i20 + i11;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i11 = u0Var.f2189q.g(R, unsafe.getObject(t10, S), u0Var.s(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.i(R, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 52:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.q(R, 0.0f);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 53:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.x(R, X(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 54:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.X(R, X(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 55:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.v(R, W(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 56:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.o(R, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 57:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.m(R, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 58:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.d(R, true);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 59:
                    if (u0Var.E(t10, R, i14)) {
                        Object object2 = unsafe.getObject(t10, S);
                        i11 = object2 instanceof g ? j.g(R, (g) object2) : j.S(R, (String) object2);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 60:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = i1.o(R, unsafe.getObject(t10, S), u0Var.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 61:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.g(R, (g) unsafe.getObject(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.V(R, W(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.k(R, W(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 64:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.K(R, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.M(R, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.O(R, W(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.Q(R, X(t10, S));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 68:
                    if (u0Var.E(t10, R, i14)) {
                        i11 = j.s(R, (r0) unsafe.getObject(t10, S), u0Var.t(i14));
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
        int u8 = i16 + u0Var.u(u0Var.f2187o, t10);
        return u0Var.f2178f ? u8 + u0Var.f2188p.c(t10).l() : u8;
    }

    public final void d0(Object obj, int i10, f1 f1Var) {
        if (w(i10)) {
            f1Var.n(this.f2186n.c(obj, S(i10)));
        } else {
            f1Var.B(this.f2186n.c(obj, S(i10)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T e() {
        return (T) this.f2185m.a(this.f2177e);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int f(T t8) {
        int i10;
        int f10;
        int length = this.f2174a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int l02 = l0(i12);
            int R = R(i12);
            long S = S(l02);
            int i13 = 37;
            switch (k0(l02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = z.f(Double.doubleToLongBits(q1.u(t8, S)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(q1.v(t8, S));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = z.f(q1.x(t8, S));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = z.f(q1.x(t8, S));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = z.f(q1.x(t8, S));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = z.c(q1.p(t8, S));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) q1.z(t8, S)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object z10 = q1.z(t8, S);
                    if (z10 != null) {
                        i13 = z10.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, S).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = z.f(q1.x(t8, S));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = q1.w(t8, S);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = z.f(q1.x(t8, S));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object z11 = q1.z(t8, S);
                    if (z11 != null) {
                        i13 = z11.hashCode();
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
                    f10 = q1.z(t8, S).hashCode();
                    i11 = i10 + f10;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i10 = i11 * 53;
                    f10 = q1.z(t8, S).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(Double.doubleToLongBits(U(t8, S)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(V(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(X(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(X(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(X(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.c(T(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) q1.z(t8, S)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.z(t8, S).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.z(t8, S).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(X(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = W(t8, S);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(X(t8, S));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t8, R, i12)) {
                        i10 = i11 * 53;
                        f10 = q1.z(t8, S).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f2187o.g(t8).hashCode();
        return this.f2178f ? (hashCode * 53) + this.f2188p.c(t8).hashCode() : hashCode;
    }

    public final void f0(T t8, int i10) {
        int Z = Z(i10);
        long j10 = 1048575 & Z;
        if (j10 == 1048575) {
            return;
        }
        q1.M(t8, j10, (1 << (Z >>> 20)) | q1.w(t8, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean g(T t8, T t10) {
        int length = this.f2174a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f2187o.g(t8).equals(this.f2187o.g(t10))) {
            return false;
        }
        if (this.f2178f) {
            return this.f2188p.c(t8).equals(this.f2188p.c(t10));
        }
        return true;
    }

    public final void g0(T t8, int i10, int i11) {
        q1.M(t8, Z(i11) & 1048575, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t8, f1 f1Var, o oVar) {
        oVar.getClass();
        l(t8);
        H(this.f2187o, this.f2188p, t8, f1Var, oVar);
    }

    public final int h0(int i10, int i11) {
        int length = (this.f2174a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int R = R(i13);
            if (i10 == R) {
                return i13;
            }
            if (i10 < R) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t8, t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            n0(t8, t1Var);
        } else {
            m0(t8, t1Var);
        }
    }

    public final void i0(T t8, int i10, Object obj) {
        f2173s.putObject(t8, S(l0(i10)), obj);
        f0(t8, i10);
    }

    public final boolean j(T t8, T t10, int i10) {
        return x(t8, i10) == x(t10, i10);
    }

    public final void j0(T t8, int i10, int i11, Object obj) {
        f2173s.putObject(t8, S(l0(i11)), obj);
        g0(t8, i10, i11);
    }

    public final int l0(int i10) {
        return this.f2174a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(T r19, androidx.datastore.preferences.protobuf.t1 r20) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.m0(java.lang.Object, androidx.datastore.preferences.protobuf.t1):void");
    }

    public final boolean n(T t8, T t10, int i10) {
        int l02 = l0(i10);
        long S = S(l02);
        switch (k0(l02)) {
            case 0:
                if (!j(t8, t10, i10) || Double.doubleToLongBits(q1.u(t8, S)) != Double.doubleToLongBits(q1.u(t10, S))) {
                }
                break;
            case 1:
                if (!j(t8, t10, i10) || Float.floatToIntBits(q1.v(t8, S)) != Float.floatToIntBits(q1.v(t10, S))) {
                }
                break;
            case 2:
                if (!j(t8, t10, i10) || q1.x(t8, S) != q1.x(t10, S)) {
                }
                break;
            case 3:
                if (!j(t8, t10, i10) || q1.x(t8, S) != q1.x(t10, S)) {
                }
                break;
            case 4:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 5:
                if (!j(t8, t10, i10) || q1.x(t8, S) != q1.x(t10, S)) {
                }
                break;
            case 6:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 7:
                if (!j(t8, t10, i10) || q1.p(t8, S) != q1.p(t10, S)) {
                }
                break;
            case 8:
                if (!j(t8, t10, i10) || !i1.I(q1.z(t8, S), q1.z(t10, S))) {
                }
                break;
            case 9:
                if (!j(t8, t10, i10) || !i1.I(q1.z(t8, S), q1.z(t10, S))) {
                }
                break;
            case 10:
                if (!j(t8, t10, i10) || !i1.I(q1.z(t8, S), q1.z(t10, S))) {
                }
                break;
            case 11:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 12:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 13:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 14:
                if (!j(t8, t10, i10) || q1.x(t8, S) != q1.x(t10, S)) {
                }
                break;
            case 15:
                if (!j(t8, t10, i10) || q1.w(t8, S) != q1.w(t10, S)) {
                }
                break;
            case 16:
                if (!j(t8, t10, i10) || q1.x(t8, S) != q1.x(t10, S)) {
                }
                break;
            case 17:
                if (!j(t8, t10, i10) || !i1.I(q1.z(t8, S), q1.z(t10, S))) {
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
                if (!D(t8, t10, i10) || !i1.I(q1.z(t8, S), q1.z(t10, S))) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(T r11, androidx.datastore.preferences.protobuf.t1 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.n0(java.lang.Object, androidx.datastore.preferences.protobuf.t1):void");
    }

    public final <UT, UB> UB o(Object obj, int i10, UB ub, n1<UT, UB> n1Var, Object obj2) {
        z.c r8;
        int R = R(i10);
        Object z10 = q1.z(obj, S(l0(i10)));
        return (z10 == null || (r8 = r(i10)) == null) ? ub : (UB) p(i10, R, this.f2189q.c(z10), r8, ub, n1Var, obj2);
    }

    public final <K, V> void o0(t1 t1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            t1Var.M(i10, this.f2189q.b(s(i11)), this.f2189q.e(obj));
        }
    }

    public final <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, z.c cVar, UB ub, n1<UT, UB> n1Var, Object obj) {
        k0.a<?, ?> b = this.f2189q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n1Var.f(obj);
                }
                g.h l10 = g.l(k0.b(b, next.getKey(), next.getValue()));
                try {
                    k0.e(l10.b(), b, next.getKey(), next.getValue());
                    n1Var.d(ub, i11, l10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    public final void p0(int i10, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.e(i10, (String) obj);
        } else {
            t1Var.K(i10, (g) obj);
        }
    }

    public final <UT, UB> void q0(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.t(n1Var.g(t8), t1Var);
    }

    public final z.c r(int i10) {
        return (z.c) this.b[((i10 / 3) * 2) + 1];
    }

    public final Object s(int i10) {
        return this.b[(i10 / 3) * 2];
    }

    public final g1 t(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> c10 = c1.a().c((Class) this.b[i11 + 1]);
        this.b[i11] = c10;
        return c10;
    }

    public final <UT, UB> int u(n1<UT, UB> n1Var, T t8) {
        return n1Var.h(n1Var.g(t8));
    }

    public final boolean x(T t8, int i10) {
        boolean equals;
        int Z = Z(i10);
        long j10 = 1048575 & Z;
        if (j10 != 1048575) {
            return (q1.w(t8, j10) & (1 << (Z >>> 20))) != 0;
        }
        int l02 = l0(i10);
        long S = S(l02);
        switch (k0(l02)) {
            case 0:
                return Double.doubleToRawLongBits(q1.u(t8, S)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.v(t8, S)) != 0;
            case 2:
                return q1.x(t8, S) != 0;
            case 3:
                return q1.x(t8, S) != 0;
            case 4:
                return q1.w(t8, S) != 0;
            case 5:
                return q1.x(t8, S) != 0;
            case 6:
                return q1.w(t8, S) != 0;
            case 7:
                return q1.p(t8, S);
            case 8:
                Object z10 = q1.z(t8, S);
                if (z10 instanceof String) {
                    equals = ((String) z10).isEmpty();
                    break;
                } else {
                    if (!(z10 instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    equals = g.b.equals(z10);
                    break;
                }
            case 9:
                return q1.z(t8, S) != null;
            case 10:
                equals = g.b.equals(q1.z(t8, S));
                break;
            case 11:
                return q1.w(t8, S) != 0;
            case 12:
                return q1.w(t8, S) != 0;
            case 13:
                return q1.w(t8, S) != 0;
            case 14:
                return q1.x(t8, S) != 0;
            case 15:
                return q1.w(t8, S) != 0;
            case 16:
                return q1.x(t8, S) != 0;
            case 17:
                return q1.z(t8, S) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean y(T t8, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? x(t8, i10) : (i12 & i13) != 0;
    }
}
