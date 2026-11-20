package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f8717a = c();
    public static final x0 b = new y0();

    public static x0 a() {
        return f8717a;
    }

    public static x0 b() {
        return b;
    }

    public static x0 c() {
        if (c1.f8462d) {
            return null;
        }
        try {
            return (x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
