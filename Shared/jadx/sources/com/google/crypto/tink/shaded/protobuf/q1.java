package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f8574a = D();
    public static final Class<?> b = com.google.crypto.tink.shaded.protobuf.d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8575c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8576d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f8577e = B();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f8578f = T();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f8579g = S();

    /* renamed from: h, reason: collision with root package name */
    public static final long f8580h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f8581i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f8582j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f8583k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f8584l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f8585m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f8586n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f8587o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f8588p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f8589q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f8590r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f8591s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f8592t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f8593u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f8594v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f8595w;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean c(Object obj, long j10) {
            return q1.f8595w ? q1.s(obj, j10) : q1.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public byte d(Object obj, long j10) {
            return q1.f8595w ? q1.v(obj, j10) : q1.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void k(Object obj, long j10, boolean z10) {
            if (q1.f8595w) {
                q1.I(obj, j10, z10);
            } else {
                q1.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void l(Object obj, long j10, byte b) {
            if (q1.f8595w) {
                q1.L(obj, j10, b);
            } else {
                q1.M(obj, j10, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean c(Object obj, long j10) {
            return q1.f8595w ? q1.s(obj, j10) : q1.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public byte d(Object obj, long j10) {
            return q1.f8595w ? q1.v(obj, j10) : q1.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void k(Object obj, long j10, boolean z10) {
            if (q1.f8595w) {
                q1.I(obj, j10, z10);
            } else {
                q1.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void l(Object obj, long j10, byte b) {
            if (q1.f8595w) {
                q1.L(obj, j10, b);
            } else {
                q1.M(obj, j10, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean c(Object obj, long j10) {
            return this.f8596a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public byte d(Object obj, long j10) {
            return this.f8596a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public double e(Object obj, long j10) {
            return this.f8596a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public float f(Object obj, long j10) {
            return this.f8596a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f8596a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void l(Object obj, long j10, byte b) {
            this.f8596a.putByte(obj, j10, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void m(Object obj, long j10, double d10) {
            this.f8596a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public void n(Object obj, long j10, float f10) {
            this.f8596a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f8596a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                q1.G(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q1.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f8596a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                q1.G(th2);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f8596a;

        public e(Unsafe unsafe) {
            this.f8596a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f8596a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f8596a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f8596a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f8596a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f8596a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f8596a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f8596a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f8596a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f8596a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f8596a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                q1.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f8596a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return q1.n() != null;
            } catch (Throwable th2) {
                q1.G(th2);
                return false;
            }
        }
    }

    static {
        long l10 = l(byte[].class);
        f8580h = l10;
        f8581i = l(boolean[].class);
        f8582j = m(boolean[].class);
        f8583k = l(int[].class);
        f8584l = m(int[].class);
        f8585m = l(long[].class);
        f8586n = m(long[].class);
        f8587o = l(float[].class);
        f8588p = m(float[].class);
        f8589q = l(double[].class);
        f8590r = m(double[].class);
        f8591s = l(Object[].class);
        f8592t = m(Object[].class);
        f8593u = q(n());
        f8594v = (int) (l10 & 7);
        f8595w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j10) {
        return f8577e.h(obj, j10);
    }

    public static e B() {
        Unsafe unsafe = f8574a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f8575c) {
            return new c(unsafe);
        }
        if (f8576d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j10) {
        return f8577e.i(obj, j10);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f8579g;
    }

    public static boolean F() {
        return f8578f;
    }

    public static void G(Throwable th2) {
        Logger.getLogger(q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static void H(Object obj, long j10, boolean z10) {
        f8577e.k(obj, j10, z10);
    }

    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j10, byte b10) {
        f8577e.l(bArr, f8580h + j10, b10);
    }

    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    public static void N(Object obj, long j10, double d10) {
        f8577e.m(obj, j10, d10);
    }

    public static void O(Object obj, long j10, float f10) {
        f8577e.n(obj, j10, f10);
    }

    public static void P(Object obj, long j10, int i10) {
        f8577e.o(obj, j10, i10);
    }

    public static void Q(Object obj, long j10, long j11) {
        f8577e.p(obj, j10, j11);
    }

    public static void R(Object obj, long j10, Object obj2) {
        f8577e.q(obj, j10, obj2);
    }

    public static boolean S() {
        e eVar = f8577e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f8577e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static <T> T k(Class<T> cls) {
        try {
            return (T) f8574a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int l(Class<?> cls) {
        if (f8579g) {
            return f8577e.a(cls);
        }
        return -1;
    }

    public static int m(Class<?> cls) {
        if (f8579g) {
            return f8577e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field p8;
        if (com.google.crypto.tink.shaded.protobuf.d.c() && (p8 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p8;
        }
        Field p10 = p(Buffer.class, "address");
        if (p10 == null || p10.getType() != Long.TYPE) {
            return null;
        }
        return p10;
    }

    public static boolean o(Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f8577e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j10) {
        return f8577e.c(obj, j10);
    }

    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    public static byte u(byte[] bArr, long j10) {
        return f8577e.d(bArr, f8580h + j10);
    }

    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j10) {
        return f8577e.e(obj, j10);
    }

    public static float y(Object obj, long j10) {
        return f8577e.f(obj, j10);
    }

    public static int z(Object obj, long j10) {
        return f8577e.g(obj, j10);
    }
}
