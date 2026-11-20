package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference<x0> f8877d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8878a;
    public t0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8879c;

    public x0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8879c = executor;
        this.f8878a = sharedPreferences;
    }

    public static synchronized x0 a(Context context, Executor executor) {
        x0 x0Var;
        synchronized (x0.class) {
            try {
                WeakReference<x0> weakReference = f8877d;
                x0Var = weakReference != null ? weakReference.get() : null;
                if (x0Var == null) {
                    x0Var = new x0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    x0Var.c();
                    f8877d = new WeakReference<>(x0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x0Var;
    }

    public synchronized w0 b() {
        return w0.a(this.b.e());
    }

    public final synchronized void c() {
        this.b = t0.c(this.f8878a, "topic_operation_queue", ",", this.f8879c);
    }

    public synchronized boolean d(w0 w0Var) {
        return this.b.f(w0Var.e());
    }
}
