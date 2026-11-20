package wa;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements x8.b {

    /* renamed from: e, reason: collision with root package name */
    public static x8.b f34175e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f34176a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f34177c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f34178d;

    public l(Context context) {
        this.b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f34177c = newSingleThreadScheduledExecutor;
        this.f34178d = Executors.newSingleThreadExecutor();
        this.f34176a = context;
        if (this.b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    @NonNull
    public static synchronized x8.b c(@NonNull Context context) {
        x8.b bVar;
        synchronized (l.class) {
            try {
                n9.m.m(context, "Context must not be null");
                if (f34175e == null) {
                    f34175e = new l(context.getApplicationContext());
                }
                bVar = f34175e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static final void e(Context context) {
        if (!f(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (f(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    public static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void g(Context context) {
        if (f(context).edit().putLong("app_set_id_last_used_time", u9.h.c().a()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    public final long a() {
        long j10 = f(this.f34176a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    public final /* synthetic */ void d(sb.k kVar) {
        String string = f(this.f34176a).getString("app_set_id", null);
        long a10 = a();
        if (string == null || u9.h.c().a() > a10) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f34176a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                g(context);
                Context context2 = this.f34176a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", u9.h.c().a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e10) {
                kVar.b(e10);
                return;
            }
        } else {
            try {
                g(this.f34176a);
            } catch (k e11) {
                kVar.b(e11);
                return;
            }
        }
        kVar.c(new x8.c(string, 1));
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        final sb.k kVar = new sb.k();
        this.f34178d.execute(new Runnable() { // from class: wa.h
            @Override // java.lang.Runnable
            public final void run() {
                l.this.d(kVar);
            }
        });
        return kVar.a();
    }
}
