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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f8866a;
    public final PowerManager.WakeLock b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f8867c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    public ExecutorService f8868d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new v9.b("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public v0 f8869a;
        public Context b;

        public a(v0 v0Var) {
            this.f8869a = v0Var;
        }

        public void a() {
            if (v0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            v0 v0Var = this.f8869a;
            if (v0Var != null) {
                Context b = v0Var.b();
                this.b = b;
                b.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            v0 v0Var = this.f8869a;
            if (v0Var != null && v0Var.d()) {
                if (v0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8869a.f8867c.l(this.f8869a, 0L);
                Context context2 = this.b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f8869a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public v0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f8867c = firebaseMessaging;
        this.f8866a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f8867c.m();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() {
        try {
            if (this.f8867c.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!b0.h(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (r0.b().e(b())) {
            this.b.acquire();
        }
        try {
            try {
                this.f8867c.y(true);
                if (!this.f8867c.x()) {
                    this.f8867c.y(false);
                    if (!r0.b().e(b())) {
                        return;
                    }
                } else if (!r0.b().d(b()) || d()) {
                    if (e()) {
                        this.f8867c.y(false);
                    } else {
                        this.f8867c.C(this.f8866a);
                    }
                    if (!r0.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!r0.b().e(b())) {
                        return;
                    }
                }
                this.b.release();
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f8867c.y(false);
                if (r0.b().e(b())) {
                    this.b.release();
                }
            }
        } catch (Throwable th2) {
            if (r0.b().e(b())) {
                this.b.release();
            }
            throw th2;
        }
    }
}
