package yj;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.io.IOException;
import java.lang.Thread;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.EnumMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class x implements Thread.UncaughtExceptionHandler {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f36716h = {"clientsettingscdn"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f36717i = {"apis", "friends", "locale", "users", "auth"};

    /* renamed from: j, reason: collision with root package name */
    public static final x f36718j = new x();

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap<o2, ne.e0<Boolean>> f36719a = new EnumMap<>(o2.class);
    public final ne.e0<Context> b = ne.e0.H();

    /* renamed from: c, reason: collision with root package name */
    public final ne.e0<Boolean> f36720c = ne.e0.H();

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f36721d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadFactory f36722e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f36723f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f36724g;

    public x() {
        ThreadFactory b = new ne.f0().g(10).f("AppStartupTaskManager-Tasks-%d").h(this).b();
        this.f36721d = b;
        ThreadFactory b10 = new ne.f0().g(5).f("AppStartupTaskManager-DNS-%d").h(this).b();
        this.f36722e = b10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f36723f = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingDeque(), b);
        this.f36724g = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingDeque(), b10);
        if (f36718j != null) {
            throw new IllegalStateException("Cannot re-instantiate app startup task manager as it is a singleton.");
        }
        for (o2 o2Var : o2.values()) {
            this.f36719a.put((EnumMap<o2, ne.e0<Boolean>>) o2Var, (o2) ne.e0.H());
        }
        this.f36723f.allowCoreThreadTimeOut(true);
        this.f36723f.prestartAllCoreThreads();
        D();
    }

    public static /* synthetic */ void a(Runnable runnable, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        LoggingProtocol.l(str + "_begin", Long.valueOf(elapsedRealtime));
        LoggingProtocol.l(str + "_end", Long.valueOf(elapsedRealtime2));
    }

    public static x m() {
        return f36718j;
    }

    public void A() {
        k("preload_native_libs", new Runnable() { // from class: yj.s
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.r();
            }
        });
    }

    public void B() {
        this.b.a(new Runnable() { // from class: yj.o
            @Override // java.lang.Runnable
            public final void run() {
                x.this.v();
            }
        }, this.f36723f);
    }

    public final void C(final Runnable runnable, final Executor executor) {
        n(o2.ROBLOX).a(new Runnable() { // from class: yj.v
            @Override // java.lang.Runnable
            public final void run() {
                x.this.w(runnable, executor);
            }
        }, executor);
    }

    public final void D() {
        C(new Runnable() { // from class: yj.m
            @Override // java.lang.Runnable
            public final void run() {
                LoggingProtocol.d();
            }
        }, ne.a0.a());
    }

    public void E() {
        this.f36720c.D(Boolean.TRUE);
    }

    public void F(Context context) {
        this.b.D(context.getApplicationContext());
    }

    public void G(o2 o2Var, boolean z10) {
        if (this.f36719a.containsKey(o2Var)) {
            n(o2Var).D(Boolean.valueOf(z10));
            return;
        }
        Log.e("AppStartupTaskManager", "Error setting isLibLoaded: " + o2Var + " is not a valid lib name");
    }

    public boolean H(o2 o2Var) {
        if (!this.f36719a.containsKey(o2Var)) {
            Log.e("AppStartupTaskManager", "Error waiting for lib loaded: " + o2Var + " is not a valid lib name");
            return false;
        }
        try {
            return n(o2Var).get().booleanValue();
        } catch (InterruptedException e10) {
            Log.e("AppStartupTaskManager", "InterruptedException waiting for lib: " + o2Var, e10);
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e11) {
            Log.e("AppStartupTaskManager", "Error waiting for lib " + o2Var + " loaded: " + e11, e11);
            return false;
        }
    }

    public final void k(final String str, final Runnable runnable) {
        this.f36723f.execute(new Runnable() { // from class: yj.u
            @Override // java.lang.Runnable
            public final void run() {
                x.a(runnable, str);
            }
        });
    }

    public final Context l() {
        try {
            return this.b.get();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("AppStartupTaskManager", "Error getting application context: " + e10, e10);
            return null;
        }
    }

    @NonNull
    public ne.e0<Boolean> n(o2 o2Var) {
        ne.e0<Boolean> e0Var = this.f36719a.get(o2Var);
        Objects.requireNonNull(e0Var);
        return e0Var;
    }

    public void o() {
        k("initialize_socket_factory", new Runnable() { // from class: yj.p
            @Override // java.lang.Runnable
            public final void run() {
                x.this.p();
            }
        });
        this.b.a(new Runnable() { // from class: yj.q
            @Override // java.lang.Runnable
            public final void run() {
                x.this.r();
            }
        }, this.f36723f);
    }

    public final /* synthetic */ void p() {
        com.roblox.client.startup.b.j();
        z();
    }

    public final /* synthetic */ void q() {
        Context l10 = l();
        if (l10 == null) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: context is null");
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            com.roblox.client.startup.b.g(l10).initialize();
            Log.i("AppStartupTaskManager", "OkHttp Cache initialized in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (IOException e10) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: " + e10, e10);
        }
    }

    public final /* synthetic */ void r() {
        k("initialize_okhttp_cache", new Runnable() { // from class: yj.t
            @Override // java.lang.Runnable
            public final void run() {
                x.this.q();
            }
        });
    }

    public final /* synthetic */ void s(String str) {
        y(str + "." + rg.a1.O());
    }

    public final /* synthetic */ void t() {
        for (String str : f36716h) {
            ci.n.c().d(str + "." + rg.a1.O());
        }
        for (final String str2 : f36717i) {
            this.f36724g.execute(new Runnable() { // from class: yj.n
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.s(str2);
                }
            });
        }
    }

    public final /* synthetic */ void u() {
        Context l10 = l();
        if (l10 != null) {
            ci.b.b().a(l10, "b80a8016163ae58891a14b51aec71f7e307963255b4ac92d955644daeda6bf85");
        } else {
            Log.e("AppStartupTaskManager", "Error preloading dictionary, app context is null");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        Log.e("AppStartupTaskManager", "Uncaught exception in thread " + thread.getName(), th2);
    }

    public final /* synthetic */ void v() {
        k("preload_zstd_dictionary", new Runnable() { // from class: yj.w
            @Override // java.lang.Runnable
            public final void run() {
                x.this.u();
            }
        });
    }

    public final /* synthetic */ void w(Runnable runnable, Executor executor) {
        this.f36720c.a(runnable, executor);
    }

    public void x() {
        k("prewarm_dns", new Runnable() { // from class: yj.r
            @Override // java.lang.Runnable
            public final void run() {
                x.this.t();
            }
        });
    }

    public final void y(String str) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pre-warmed DNS for ");
            sb2.append(str);
            sb2.append(", address count: ");
            sb2.append(allByName == null ? 0 : allByName.length);
            Log.d("AppStartupTaskManager", sb2.toString());
        } catch (UnknownHostException e10) {
            Log.e("AppStartupTaskManager", "Error pre-warming DNS for " + str, e10);
        }
    }

    public final void z() {
        try {
            Response execute = com.roblox.client.startup.b.h().newCall(new Request.Builder().url(com.roblox.client.startup.b.i()).method("HEAD", null).build()).execute();
            try {
                Log.d("AppStartupTaskManager", "Pre-warmed TLS: " + execute.code());
                execute.close();
            } finally {
            }
        } catch (Exception e10) {
            com.roblox.client.startup.b.l();
            Log.e("AppStartupTaskManager", "Error pre-warming TLS: " + e10, e10);
        }
    }
}
