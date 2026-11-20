package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class k0 implements h1 {
    public static final r0 b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8549a;

    public class a implements r0 {
        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8550a;

        static {
            int[] iArr = new int[b1.values().length];
            f8550a = iArr;
            try {
                iArr[b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements r0 {

        /* renamed from: a, reason: collision with root package name */
        public r0[] f8551a;

        public c(r0... r0VarArr) {
            this.f8551a = r0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public q0 a(Class<?> cls) {
            for (r0 r0Var : this.f8551a) {
                if (r0Var.b(cls)) {
                    return r0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r0
        public boolean b(Class<?> cls) {
            for (r0 r0Var : this.f8551a) {
                if (r0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k0() {
        this(c());
    }

    public static boolean b(q0 q0Var) {
        return b.f8550a[q0Var.c().ordinal()] != 1;
    }

    public static r0 c() {
        return new c(x.c(), d());
    }

    public static r0 d() {
        if (c1.f8462d) {
            return b;
        }
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static <T> g1<T> e(Class<T> cls, q0 q0Var) {
        if (f(cls)) {
            return v0.S(cls, q0Var, z0.b(), i0.b(), i1.L(), b(q0Var) ? s.b() : null, p0.b());
        }
        x0 a10 = z0.a();
        q<?> qVar = null;
        g0 a11 = i0.a();
        n1<?, ?> K = i1.K();
        if (b(q0Var)) {
            qVar = s.a();
        }
        return v0.S(cls, q0Var, a10, a11, K, qVar, p0.a());
    }

    public static boolean f(Class<?> cls) {
        return c1.f8462d || y.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        i1.H(cls);
        q0 a10 = this.f8549a.a(cls);
        return a10.a() ? f(cls) ? w0.m(i1.L(), s.b(), a10.b()) : w0.m(i1.K(), s.a(), a10.b()) : e(cls, a10);
    }

    public k0(r0 r0Var) {
        this.f8549a = (r0) a0.b(r0Var, "messageInfoFactory");
    }
}
