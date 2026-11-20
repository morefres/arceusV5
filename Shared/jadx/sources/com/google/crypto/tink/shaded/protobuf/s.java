package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final q<?> f8599a = new r();
    public static final q<?> b = c();

    public static q<?> a() {
        q<?> qVar = b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static q<?> b() {
        return f8599a;
    }

    public static q<?> c() {
        if (c1.f8462d) {
            return null;
        }
        try {
            return (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
