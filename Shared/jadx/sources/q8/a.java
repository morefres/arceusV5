package q8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.roblox.client.personasdk.BuildConfig;
import j9.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import n9.m;
import ua.e;
import ua.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public j9.a f29604a;
    public f b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29605c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29606d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f29607e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f29608f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29609g;

    /* renamed from: q8.a$a, reason: collision with other inner class name */
    public static final class C0516a {

        /* renamed from: a, reason: collision with root package name */
        public final String f29610a;
        public final boolean b;

        @Deprecated
        public C0516a(String str, boolean z10) {
            this.f29610a = str;
            this.b = z10;
        }

        public String a() {
            return this.f29610a;
        }

        public boolean b() {
            return this.b;
        }

        @NonNull
        public String toString() {
            String str = this.f29610a;
            boolean z10 = this.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public a(@NonNull Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        m.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f29608f = context;
        this.f29605c = false;
        this.f29609g = j10;
    }

    @NonNull
    public static C0516a a(@NonNull Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0516a f10 = aVar.f(-1);
            aVar.e(f10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f10;
        } finally {
        }
    }

    public static void b(boolean z10) {
    }

    public final void c() {
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f29608f == null || this.f29604a == null) {
                    return;
                }
                try {
                    if (this.f29605c) {
                        t9.a.b().c(this.f29608f, this.f29604a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f29605c = false;
                this.b = null;
                this.f29604a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final void d(boolean z10) {
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f29605c) {
                    c();
                }
                Context context = this.f29608f;
                try {
                    context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 0);
                    int h10 = j9.d.f().h(context, h.f21609a);
                    if (h10 != 0 && h10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    j9.a aVar = new j9.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!t9.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f29604a = aVar;
                        try {
                            this.b = e.r2(aVar.a(10000L, TimeUnit.MILLISECONDS));
                            this.f29605c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new j9.e(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public final boolean e(C0516a c0516a, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0516a != null) {
            hashMap.put("limit_ad_tracking", true != c0516a.b() ? "0" : "1");
            String a10 = c0516a.a();
            if (a10 != null) {
                hashMap.put("ad_id_size", Integer.toString(a10.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(this, hashMap).start();
        return true;
    }

    public final C0516a f(int i10) {
        C0516a c0516a;
        m.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f29605c) {
                    synchronized (this.f29606d) {
                        c cVar = this.f29607e;
                        if (cVar == null || !cVar.f29614d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f29605c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                m.l(this.f29604a);
                m.l(this.b);
                try {
                    c0516a = new C0516a(this.b.zzc(), this.b.B(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
        return c0516a;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f29606d) {
            c cVar = this.f29607e;
            if (cVar != null) {
                cVar.f29613c.countDown();
                try {
                    this.f29607e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f29609g;
            if (j10 > 0) {
                this.f29607e = new c(this, j10);
            }
        }
    }
}
