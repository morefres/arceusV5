package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f7046a;
    public static final Class b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f7047c;

    /* renamed from: d, reason: collision with root package name */
    public static final z6 f7048d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f7049e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7050f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f7051g;

    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    static {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a7.<clinit>():void");
    }

    public static boolean A(Object obj, long j10) {
        return f7048d.g(obj, j10);
    }

    public static boolean B() {
        return f7049e;
    }

    public static int C(Class cls) {
        if (f7049e) {
            return f7048d.f7407a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int D(Class cls) {
        if (f7049e) {
            return f7048d.f7407a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field a() {
        int i10 = e3.f7081a;
        Field b10 = b(Buffer.class, "effectiveDirectAddress");
        if (b10 != null) {
            return b10;
        }
        Field b11 = b(Buffer.class, "address");
        if (b11 == null || b11.getType() != Long.TYPE) {
            return null;
        }
        return b11;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void c(Object obj, long j10, byte b10) {
        Unsafe unsafe = f7048d.f7407a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f7048d.f7407a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static double e(Object obj, long j10) {
        return f7048d.a(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f7048d.b(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f7048d.f7407a.getInt(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f7048d.f7407a.getLong(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f7046a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f7048d.f7407a.getObject(obj, j10);
    }

    public static Unsafe k() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new w6());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void q(Object obj, long j10, boolean z10) {
        f7048d.c(obj, j10, z10);
    }

    public static void r(byte[] bArr, long j10, byte b10) {
        f7048d.d(bArr, f7050f + j10, b10);
    }

    public static void s(Object obj, long j10, double d10) {
        f7048d.e(obj, j10, d10);
    }

    public static void t(Object obj, long j10, float f10) {
        f7048d.f(obj, j10, f10);
    }

    public static void u(Object obj, long j10, int i10) {
        f7048d.f7407a.putInt(obj, j10, i10);
    }

    public static void v(Object obj, long j10, long j11) {
        f7048d.f7407a.putLong(obj, j10, j11);
    }

    public static void w(Object obj, long j10, Object obj2) {
        f7048d.f7407a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj, long j10) {
        return ((byte) ((f7048d.f7407a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f7048d.f7407a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean z(Class cls) {
        int i10 = e3.f7081a;
        try {
            Class cls2 = b;
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
}
