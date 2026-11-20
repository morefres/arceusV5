package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8464a;
    public static final Class<?> b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8465c;

    static {
        f8465c = (f8464a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return b;
    }

    public static boolean c() {
        if (f8464a) {
            return true;
        }
        return (b == null || f8465c) ? false : true;
    }
}
