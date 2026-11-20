package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6946a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f6946a.put(str, callable);
    }
}
