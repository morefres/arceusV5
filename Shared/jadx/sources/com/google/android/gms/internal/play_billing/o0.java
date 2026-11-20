package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7241a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7242c;

    public o0(Object obj, Object obj2, Object obj3) {
        this.f7241a = obj;
        this.b = obj2;
        this.f7242c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7242c;
        Object obj2 = this.b;
        Object obj3 = this.f7241a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
