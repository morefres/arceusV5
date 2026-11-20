package com.appsflyer.internal;

import gt.n;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    @NotNull
    public final String registerClient() {
        Object obj;
        try {
            n.Companion companion = gt.n.INSTANCE;
            Field declaredField = u7.a.class.getDeclaredField(ve.a.f33391e);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.d(obj2, "");
            obj = gt.n.b((String) obj2);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            obj = gt.n.b(gt.o.a(th2));
        }
        return (String) (gt.n.g(obj) ? "" : obj);
    }
}
