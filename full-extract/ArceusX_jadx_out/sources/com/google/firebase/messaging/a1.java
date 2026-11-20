package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public class a1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8787f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f8788g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f8789h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8790a;
    public final g0 b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f8791c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f8792d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8793e;

    public class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public a1 f8794a;

        public a(a1 a1Var) {
            this.f8794a = a1Var;
        }

        public void a() {
            if (a1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            a1.this.f8790a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                a1 a1Var = this.f8794a;
                if (a1Var == null) {
                    return;
                }
                if (a1Var.i()) {
                    if (a1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f8794a.f8792d.k(this.f8794a, 0L);
                    context.unregisterReceiver(this);
                    this.f8794a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a1(z0 z0Var, Context context, g0 g0Var, long j10) {
        this.f8792d = z0Var;
        this.f8790a = context;
        this.f8793e = j10;
        this.b = g0Var;
        this.f8791c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f8787f) {
            try {
                Boolean bool = f8789h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f8789h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f8787f) {
            try {
                Boolean bool = f8788g;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f8788g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized boolean i() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f8790a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f8790a)) {
            this.f8791c.acquire(d.f8808a);
        }
        try {
            try {
                try {
                    this.f8792d.l(true);
                    if (!this.b.g()) {
                        this.f8792d.l(false);
                        if (h(this.f8790a)) {
                            try {
                                this.f8791c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f8790a) || i()) {
                        if (this.f8792d.o()) {
                            this.f8792d.l(false);
                        } else {
                            this.f8792d.p(this.f8793e);
                        }
                        if (h(this.f8790a)) {
                            this.f8791c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f8790a)) {
                        try {
                            this.f8791c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (Throwable th2) {
                    if (h(this.f8790a)) {
                        try {
                            this.f8791c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f8792d.l(false);
                if (h(this.f8790a)) {
                    this.f8791c.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
