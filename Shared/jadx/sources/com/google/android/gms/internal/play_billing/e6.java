package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: c, reason: collision with root package name */
    public static final e6 f7083c = new e6();
    public final ConcurrentMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final o5 f7084a = new o5();

    public static e6 a() {
        return f7083c;
    }

    public final h6 b(Class cls) {
        Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (h6) obj;
    }

    public final <T> h6<T> c(Class<T> cls) {
        ConcurrentMap concurrentMap = this.b;
        h6<T> a10 = this.f7084a.a(cls);
        h6<T> h6Var = (h6) concurrentMap.putIfAbsent(cls, a10);
        return h6Var != null ? h6Var : a10;
    }
}
