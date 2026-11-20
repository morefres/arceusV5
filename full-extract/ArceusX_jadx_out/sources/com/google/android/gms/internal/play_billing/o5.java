package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class o5 {
    public static final v5 b = new m5();

    /* renamed from: a, reason: collision with root package name */
    public final v5 f7248a;

    public o5() {
        o4 c10 = o4.c();
        int i10 = e3.f7081a;
        this.f7248a = new n5(c10, b);
    }

    public final h6 a(Class cls) {
        t6 t6Var = i6.f7156a;
        if (!t4.class.isAssignableFrom(cls)) {
            int i10 = e3.f7081a;
        }
        u5 a10 = this.f7248a.a(cls);
        if (a10.zzb()) {
            int i11 = e3.f7081a;
            return b6.g(i6.r(), i4.a(), a10.zza());
        }
        int i12 = e3.f7081a;
        return a6.x(cls, a10, d6.a(), j5.a(), i6.r(), a10.zzc() + (-1) != 1 ? i4.a() : null, t5.a());
    }
}
