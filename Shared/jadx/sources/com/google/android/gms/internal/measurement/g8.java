package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static f8 f6505a;

    public static synchronized void a(f8 f8Var) {
        synchronized (g8.class) {
            if (f6505a != null) {
                throw new IllegalStateException("init() already called");
            }
            f6505a = f8Var;
        }
    }

    public static synchronized f8 b() {
        f8 f8Var;
        synchronized (g8.class) {
            try {
                if (f6505a == null) {
                    a(new j8());
                }
                f8Var = f6505a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f8Var;
    }
}
