package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n9 implements t8 {

    /* renamed from: f, reason: collision with root package name */
    public static final Map f6732f = new w1.a();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6733a;
    public SharedPreferences.OnSharedPreferenceChangeListener b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f6735d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6734c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final List f6736e = new ArrayList();

    public n9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f6733a = sharedPreferences;
    }

    public static n9 c(Context context, String str, Runnable runnable) {
        final n9 n9Var;
        SharedPreferences a10;
        if (k8.a() && !str.startsWith("direct_boot:") && !k8.c(context)) {
            return null;
        }
        synchronized (n9.class) {
            Map map = f6732f;
            n9Var = (n9) map.get(str);
            if (n9Var == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (k8.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        a10 = j1.a(context, str.substring(12), 0, f1.f6485a);
                    } else {
                        a10 = j1.a(context, str, 0, f1.f6485a);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    n9Var = new n9(a10, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.m9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            n9.this.e(sharedPreferences, str2);
                        }
                    };
                    n9Var.b = onSharedPreferenceChangeListener;
                    n9Var.f6733a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, n9Var);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return n9Var;
    }

    public static synchronized void d() {
        synchronized (n9.class) {
            try {
                Map map = f6732f;
                for (n9 n9Var : map.values()) {
                    n9Var.f6733a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) he.n.l(n9Var.b));
                }
                map.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final Object b(String str) {
        Map<String, ?> map = this.f6735d;
        if (map == null) {
            synchronized (this.f6734c) {
                try {
                    map = this.f6735d;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6733a.getAll();
                            this.f6735d = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f6734c) {
            this.f6735d = null;
            l9.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6736e.iterator();
                while (it.hasNext()) {
                    ((q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
