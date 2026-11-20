package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class q1 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f7259a;
    public static final long b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f7260c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f7261d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7262e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7263f;

    static {
        Unsafe h10;
        try {
            try {
                h10 = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    h10 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.v1
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return q1.h();
                        }
                    });
                } catch (Exception unused2) {
                    h10 = h();
                    Unsafe unsafe = h10;
                }
            }
            try {
                f7260c = h10.objectFieldOffset(s1.class.getDeclaredField("c"));
                b = h10.objectFieldOffset(s1.class.getDeclaredField(j6.b.f21518e));
                f7261d = h10.objectFieldOffset(s1.class.getDeclaredField(ve.a.f33391e));
                f7262e = h10.objectFieldOffset(r1.class.getDeclaredField(ve.a.f33391e));
                f7263f = h10.objectFieldOffset(r1.class.getDeclaredField(j6.b.f21518e));
                f7259a = h10;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11);
        }
    }

    public /* synthetic */ q1(w1 w1Var) {
        super(null);
    }

    public static /* synthetic */ Unsafe h() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final k1 a(s1 s1Var, k1 k1Var) {
        k1 k1Var2;
        do {
            k1Var2 = s1Var.b;
            if (k1Var == k1Var2) {
                break;
            }
        } while (!e(s1Var, k1Var2, k1Var));
        return k1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final r1 b(s1 s1Var, r1 r1Var) {
        r1 r1Var2;
        do {
            r1Var2 = s1Var.f7281c;
            if (r1Var == r1Var2) {
                break;
            }
        } while (!g(s1Var, r1Var2, r1Var));
        return r1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void c(r1 r1Var, r1 r1Var2) {
        f7259a.putObject(r1Var, f7263f, r1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void d(r1 r1Var, Thread thread) {
        f7259a.putObject(r1Var, f7262e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean e(s1 s1Var, k1 k1Var, k1 k1Var2) {
        return u1.a(f7259a, s1Var, b, k1Var, k1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean f(s1 s1Var, Object obj, Object obj2) {
        return u1.a(f7259a, s1Var, f7261d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean g(s1 s1Var, r1 r1Var, r1 r1Var2) {
        return u1.a(f7259a, s1Var, f7260c, r1Var, r1Var2);
    }
}
