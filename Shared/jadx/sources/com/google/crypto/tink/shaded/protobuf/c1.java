package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f8461c = new c1();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8462d = false;
    public final ConcurrentMap<Class<?>, g1<?>> b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h1 f8463a = new k0();

    public static c1 a() {
        return f8461c;
    }

    public g1<?> b(Class<?> cls, g1<?> g1Var) {
        a0.b(cls, "messageType");
        a0.b(g1Var, "schema");
        return this.b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> c(Class<T> cls) {
        a0.b(cls, "messageType");
        g1<T> g1Var = (g1) this.b.get(cls);
        if (g1Var == null) {
            g1Var = this.f8463a.a(cls);
            g1<T> g1Var2 = (g1<T>) b(cls, g1Var);
            if (g1Var2 != null) {
                return g1Var2;
            }
        }
        return g1Var;
    }

    public <T> g1<T> d(T t8) {
        return c(t8.getClass());
    }
}
