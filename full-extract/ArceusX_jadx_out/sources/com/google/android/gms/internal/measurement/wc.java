package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class wc {

    /* renamed from: c, reason: collision with root package name */
    public static final wc f6918c = new wc();
    public final ConcurrentMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ad f6919a = new fc();

    public static wc a() {
        return f6918c;
    }

    public final zc b(Class cls) {
        qb.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        zc zcVar = (zc) concurrentMap.get(cls);
        if (zcVar == null) {
            zcVar = this.f6919a.a(cls);
            qb.a(cls, "messageType");
            zc zcVar2 = (zc) concurrentMap.putIfAbsent(cls, zcVar);
            if (zcVar2 != null) {
                return zcVar2;
            }
        }
        return zcVar;
    }
}
