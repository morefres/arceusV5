package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f8516a = c();
    public static final g0 b = new h0();

    public static g0 a() {
        return f8516a;
    }

    public static g0 b() {
        return b;
    }

    public static g0 c() {
        if (c1.f8462d) {
            return null;
        }
        try {
            return (g0) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
