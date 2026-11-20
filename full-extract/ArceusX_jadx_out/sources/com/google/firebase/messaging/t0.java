package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8855a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8856c;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f8858e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f8857d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8859f = false;

    public t0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8855a = sharedPreferences;
        this.b = str;
        this.f8856c = str2;
        this.f8858e = executor;
    }

    public static t0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        t0 t0Var = new t0(sharedPreferences, str, str2, executor);
        t0Var.d();
        return t0Var;
    }

    public final boolean b(boolean z10) {
        if (z10 && !this.f8859f) {
            i();
        }
        return z10;
    }

    public final void d() {
        synchronized (this.f8857d) {
            try {
                this.f8857d.clear();
                String string = this.f8855a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f8856c)) {
                    String[] split = string.split(this.f8856c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f8857d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String e() {
        String peek;
        synchronized (this.f8857d) {
            peek = this.f8857d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b;
        synchronized (this.f8857d) {
            b = b(this.f8857d.remove(obj));
        }
        return b;
    }

    @NonNull
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f8857d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f8856c);
        }
        return sb2.toString();
    }

    public final void h() {
        synchronized (this.f8857d) {
            this.f8855a.edit().putString(this.b, g()).commit();
        }
    }

    public final void i() {
        this.f8858e.execute(new Runnable() { // from class: com.google.firebase.messaging.s0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.h();
            }
        });
    }
}
