package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f6837a;
    public static final Class b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f6838c;

    /* renamed from: d, reason: collision with root package name */
    public static final rd f6839d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f6840e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f6841f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f6842g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f6843h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.sd.<clinit>():void");
    }

    public static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f6839d.f6825a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void D(Throwable th2) {
        Logger.getLogger(sd.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static int E(Class cls) {
        if (f6841f) {
            return f6839d.f6825a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f6841f) {
            return f6839d.f6825a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i10 = u9.f6875a;
        Field c10 = c(Buffer.class, "effectiveDirectAddress");
        if (c10 != null) {
            return c10;
        }
        Field c11 = c(Buffer.class, "address");
        if (c11 == null || c11.getType() != Long.TYPE) {
            return null;
        }
        return c11;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6839d.f6825a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f6839d.f6825a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static boolean f() {
        return f6841f;
    }

    public static boolean g() {
        return f6840e;
    }

    public static Object h(Class cls) {
        try {
            return f6837a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int i(Object obj, long j10) {
        return f6839d.f6825a.getInt(obj, j10);
    }

    public static void j(Object obj, long j10, int i10) {
        f6839d.f6825a.putInt(obj, j10, i10);
    }

    public static long k(Object obj, long j10) {
        return f6839d.f6825a.getLong(obj, j10);
    }

    public static void l(Object obj, long j10, long j11) {
        f6839d.f6825a.putLong(obj, j10, j11);
    }

    public static boolean m(Object obj, long j10) {
        return f6839d.b(obj, j10);
    }

    public static void n(Object obj, long j10, boolean z10) {
        f6839d.c(obj, j10, z10);
    }

    public static float o(Object obj, long j10) {
        return f6839d.d(obj, j10);
    }

    public static void p(Object obj, long j10, float f10) {
        f6839d.e(obj, j10, f10);
    }

    public static double q(Object obj, long j10) {
        return f6839d.f(obj, j10);
    }

    public static void r(Object obj, long j10, double d10) {
        f6839d.g(obj, j10, d10);
    }

    public static Object s(Object obj, long j10) {
        return f6839d.f6825a.getObject(obj, j10);
    }

    public static void t(Object obj, long j10, Object obj2) {
        f6839d.f6825a.putObject(obj, j10, obj2);
    }

    public static void u(byte[] bArr, long j10, byte b10) {
        f6839d.a(bArr, f6842g + j10, b10);
    }

    public static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new od());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean w(Class cls) {
        int i10 = u9.f6875a;
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

    public static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f6839d.f6825a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
