package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.h1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class h1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8826a;
    public final Intent b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f8827c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue<a> f8828d;

    /* renamed from: e, reason: collision with root package name */
    public e1 f8829e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8830f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f8831a;
        public final sb.k<Void> b = new sb.k<>();

        public a(Intent intent) {
            this.f8831a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f8831a.getAction() + " finishing.");
            aVar.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.f1
                @Override // java.lang.Runnable
                public final void run() {
                    h1.a.b(h1.a.this);
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.g1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        public void d() {
            this.b.e(null);
        }

        public Task<Void> e() {
            return this.b.a();
        }
    }

    public h1(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new v9.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final void b() {
        while (!this.f8828d.isEmpty()) {
            this.f8828d.poll().d();
        }
    }

    public final synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f8828d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                e1 e1Var = this.f8829e;
                if (e1Var == null || !e1Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f8829e.b(this.f8828d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Task<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f8827c);
            this.f8828d.add(aVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    public final void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f8830f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f8830f) {
            return;
        }
        this.f8830f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (t9.a.b().a(this.f8826a, this.b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f8830f = false;
        b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f8830f = false;
            if (iBinder instanceof e1) {
                this.f8829e = (e1) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    public h1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8828d = new ArrayDeque();
        this.f8830f = false;
        Context applicationContext = context.getApplicationContext();
        this.f8826a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f8827c = scheduledExecutorService;
    }
}
