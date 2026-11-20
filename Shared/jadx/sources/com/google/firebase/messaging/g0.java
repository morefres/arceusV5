package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8819a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f8820c;

    /* renamed from: d, reason: collision with root package name */
    public int f8821d;

    /* renamed from: e, reason: collision with root package name */
    public int f8822e = 0;

    public g0(Context context) {
        this.f8819a = context;
    }

    public static String c(ff.e eVar) {
        String d10 = eVar.m().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = eVar.m().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.b;
    }

    public synchronized String b() {
        try {
            if (this.f8820c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8820c;
    }

    public synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f8821d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f8821d = f10.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8821d;
    }

    public synchronized int e() {
        int i10 = this.f8822e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f8819a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!u9.m.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8822e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f8822e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (u9.m.g()) {
            this.f8822e = 2;
        } else {
            this.f8822e = 1;
        }
        return this.f8822e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f8819a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo f10 = f(this.f8819a.getPackageName());
        if (f10 != null) {
            this.b = Integer.toString(f10.versionCode);
            this.f8820c = f10.versionName;
        }
    }
}
