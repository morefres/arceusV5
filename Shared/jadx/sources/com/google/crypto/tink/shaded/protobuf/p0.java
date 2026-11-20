package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f8573a = c();
    public static final n0 b = new o0();

    public static n0 a() {
        return f8573a;
    }

    public static n0 b() {
        return b;
    }

    public static n0 c() {
        if (c1.f8462d) {
            return null;
        }
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
