package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class z0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f8886i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8887a;
    public final g0 b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f8888c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f8889d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f8891f;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f8893h;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, ArrayDeque<sb.k<Void>>> f8890e = new w1.a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f8892g = false;

    public z0(FirebaseMessaging firebaseMessaging, g0 g0Var, x0 x0Var, b0 b0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f8889d = firebaseMessaging;
        this.b = g0Var;
        this.f8893h = x0Var;
        this.f8888c = b0Var;
        this.f8887a = context;
        this.f8891f = scheduledExecutorService;
    }

    public static /* synthetic */ z0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g0 g0Var, b0 b0Var) {
        return new z0(firebaseMessaging, g0Var, x0.a(context, scheduledExecutorService), b0Var, context, scheduledExecutorService);
    }

    public static <T> void b(Task<T> task) {
        try {
            sb.m.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Task<z0> e(final FirebaseMessaging firebaseMessaging, final g0 g0Var, final b0 b0Var, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return sb.m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return z0.a(context, scheduledExecutorService, firebaseMessaging, g0Var, b0Var);
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void c(String str) {
        b(this.f8888c.l(this.f8889d.k(), str));
    }

    public final void d(String str) {
        b(this.f8888c.m(this.f8889d.k(), str));
    }

    public boolean f() {
        return this.f8893h.b() != null;
    }

    public synchronized boolean h() {
        return this.f8892g;
    }

    public final void i(w0 w0Var) {
        synchronized (this.f8890e) {
            try {
                String e10 = w0Var.e();
                if (this.f8890e.containsKey(e10)) {
                    ArrayDeque<sb.k<Void>> arrayDeque = this.f8890e.get(e10);
                    sb.k<Void> poll = arrayDeque.poll();
                    if (poll != null) {
                        poll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f8890e.remove(e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(w0 w0Var) {
        try {
            String b = w0Var.b();
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b.equals("U")) {
                    d(w0Var.c());
                    if (!g()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + w0Var.c() + " succeeded.");
                    return true;
                }
            } else if (b.equals("S")) {
                c(w0Var.c());
                if (!g()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + w0Var.c() + " succeeded.");
                return true;
            }
            if (!g()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + w0Var + ".");
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void k(Runnable runnable, long j10) {
        this.f8891f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public synchronized void l(boolean z10) {
        this.f8892g = z10;
    }

    public final void m() {
        if (h()) {
            return;
        }
        p(0L);
    }

    public void n() {
        if (f()) {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.x0 r0 = r2.f8893h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.w0 r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.j(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.x0 r1 = r2.f8893h
            r1.d(r0)
            r2.i(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.z0.o():boolean");
    }

    public void p(long j10) {
        k(new a1(this, this.f8887a, this.b, Math.min(Math.max(30L, 2 * j10), f8886i)), j10);
        l(true);
    }
}
