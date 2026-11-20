package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public class x implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f8701a = new x();

    public static x c() {
        return f8701a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public q0 a(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (q0) y.C(cls.asSubclass(y.class)).p();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public boolean b(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }
}
