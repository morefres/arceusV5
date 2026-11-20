package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class j1 {
    public static final j1 b = new j1(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7158a;

    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public j1(Throwable th2) {
        th2.getClass();
        this.f7158a = th2;
    }
}
