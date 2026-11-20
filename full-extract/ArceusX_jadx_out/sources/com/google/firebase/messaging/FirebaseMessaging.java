package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.p0;
import com.google.firebase.messaging.u0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xf.a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    public static u0 f8748n;

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f8750p;

    /* renamed from: a, reason: collision with root package name */
    public final ff.e f8751a;
    public final xf.a b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8752c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f8753d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f8754e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8755f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f8756g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f8757h;

    /* renamed from: i, reason: collision with root package name */
    public final Task<z0> f8758i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f8759j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8760k;

    /* renamed from: l, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f8761l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f8747m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    public static yf.b<y7.i> f8749o = new yf.b() { // from class: com.google.firebase.messaging.p
        @Override // yf.b
        public final Object get() {
            return FirebaseMessaging.d();
        }
    };

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final vf.d f8762a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public vf.b<ff.b> f8763c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f8764d;

        public a(vf.d dVar) {
            this.f8762a = dVar;
        }

        public static /* synthetic */ void a(a aVar, vf.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.B();
            }
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean d10 = d();
                this.f8764d = d10;
                if (d10 == null) {
                    vf.b<ff.b> bVar = new vf.b() { // from class: com.google.firebase.messaging.y
                        @Override // vf.b
                        public final void a(vf.a aVar) {
                            FirebaseMessaging.a.a(FirebaseMessaging.a.this, aVar);
                        }
                    };
                    this.f8763c = bVar;
                    this.f8762a.b(ff.b.class, bVar);
                }
                this.b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f8764d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f8751a.s();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j10 = FirebaseMessaging.this.f8751a.j();
            SharedPreferences sharedPreferences = j10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<hg.i> bVar, yf.b<wf.j> bVar2, zf.h hVar, yf.b<y7.i> bVar3, vf.d dVar) {
        this(eVar, aVar, bVar, bVar2, hVar, bVar3, dVar, new g0(eVar.j()));
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, u0.a aVar, String str2) {
        o(firebaseMessaging.f8752c).f(firebaseMessaging.p(), str, str2, firebaseMessaging.f8759j.a());
        if (aVar == null || !str2.equals(aVar.f8863a)) {
            firebaseMessaging.v(str2);
        }
        return sb.m.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.w()) {
            firebaseMessaging.B();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, sb.k kVar) {
        firebaseMessaging.getClass();
        try {
            kVar.c(firebaseMessaging.k());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public static /* synthetic */ y7.i d() {
        return null;
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            f0.y(cloudMessage.v3());
            firebaseMessaging.t();
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull ff.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
            n9.m.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, z0 z0Var) {
        if (firebaseMessaging.w()) {
            z0Var.n();
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(ff.e.k());
        }
        return firebaseMessaging;
    }

    @NonNull
    public static synchronized u0 o(Context context) {
        u0 u0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f8748n == null) {
                    f8748n = new u0(context);
                }
                u0Var = f8748n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u0Var;
    }

    public static y7.i s() {
        return f8749o.get();
    }

    public final synchronized void A() {
        if (!this.f8760k) {
            C(0L);
        }
    }

    public final void B() {
        xf.a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        } else if (D(r())) {
            A();
        }
    }

    public synchronized void C(long j10) {
        l(new v0(this, Math.min(Math.max(30L, 2 * j10), f8747m)), j10);
        this.f8760k = true;
    }

    public boolean D(u0.a aVar) {
        return aVar == null || aVar.b(this.f8759j.a());
    }

    public String k() {
        xf.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) sb.m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final u0.a r8 = r();
        if (!D(r8)) {
            return r8.f8863a;
        }
        final String c10 = g0.c(this.f8751a);
        try {
            return (String) sb.m.a(this.f8754e.b(c10, new p0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.p0.a
                public final Task start() {
                    Task n10;
                    n10 = r0.f8753d.f().n(r0.f8757h, new sb.j() { // from class: com.google.firebase.messaging.x
                        @Override // sb.j
                        public final Task then(Object obj) {
                            return FirebaseMessaging.a(FirebaseMessaging.this, r2, r3, (String) obj);
                        }
                    });
                    return n10;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void l(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f8750p == null) {
                    f8750p = new ScheduledThreadPoolExecutor(1, new v9.b("TAG"));
                }
                f8750p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context m() {
        return this.f8752c;
    }

    public final String p() {
        return "[DEFAULT]".equals(this.f8751a.l()) ? "" : this.f8751a.n();
    }

    @NonNull
    public Task<String> q() {
        xf.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        final sb.k kVar = new sb.k();
        this.f8756g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(FirebaseMessaging.this, kVar);
            }
        });
        return kVar.a();
    }

    public u0.a r() {
        return o(this.f8752c).d(p(), g0.c(this.f8751a));
    }

    public final void t() {
        this.f8753d.e().f(this.f8756g, new sb.g() { // from class: com.google.firebase.messaging.v
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(FirebaseMessaging.this, (CloudMessage) obj);
            }
        });
    }

    public final void u() {
        k0.c(this.f8752c);
        m0.f(this.f8752c, this.f8753d, z());
        if (z()) {
            t();
        }
    }

    public final void v(String str) {
        if ("[DEFAULT]".equals(this.f8751a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f8751a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f8752c).g(intent);
        }
    }

    public boolean w() {
        return this.f8755f.c();
    }

    public boolean x() {
        return this.f8759j.g();
    }

    public synchronized void y(boolean z10) {
        this.f8760k = z10;
    }

    public final boolean z() {
        k0.c(this.f8752c);
        if (!k0.d(this.f8752c)) {
            return false;
        }
        if (this.f8751a.i(hf.a.class) != null) {
            return true;
        }
        return f0.a() && f8749o != null;
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<hg.i> bVar, yf.b<wf.j> bVar2, zf.h hVar, yf.b<y7.i> bVar3, vf.d dVar, g0 g0Var) {
        this(eVar, aVar, bVar3, dVar, g0Var, new b0(eVar, g0Var, bVar, bVar2, hVar), n.f(), n.c(), n.b());
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<y7.i> bVar, vf.d dVar, g0 g0Var, b0 b0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f8760k = false;
        f8749o = bVar;
        this.f8751a = eVar;
        this.b = aVar;
        this.f8755f = new a(dVar);
        Context j10 = eVar.j();
        this.f8752c = j10;
        o oVar = new o();
        this.f8761l = oVar;
        this.f8759j = g0Var;
        this.f8753d = b0Var;
        this.f8754e = new p0(executor);
        this.f8756g = executor2;
        this.f8757h = executor3;
        Context j11 = eVar.j();
        if (j11 instanceof Application) {
            ((Application) j11).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0653a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(FirebaseMessaging.this);
            }
        });
        Task<z0> e10 = z0.e(this, g0Var, b0Var, j10, n.g());
        this.f8758i = e10;
        e10.f(executor2, new sb.g() { // from class: com.google.firebase.messaging.s
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(FirebaseMessaging.this, (z0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.u();
            }
        });
    }
}
