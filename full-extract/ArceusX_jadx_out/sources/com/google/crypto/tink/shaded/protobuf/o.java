package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f8564a = c();

    public static p a() {
        p b = b("getEmptyRegistry");
        return b != null ? b : p.f8570c;
    }

    public static final p b(String str) {
        Class<?> cls = f8564a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
