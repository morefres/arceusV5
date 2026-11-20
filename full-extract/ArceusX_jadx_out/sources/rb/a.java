package rb;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jb.i;
import n9.m;
import u9.h;
import u9.o;
import u9.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public static final long f30157r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    public static volatile ScheduledExecutorService f30158s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f30159t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static volatile e f30160u = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f30161a;
    public final PowerManager.WakeLock b;

    /* renamed from: c, reason: collision with root package name */
    public int f30162c;

    /* renamed from: d, reason: collision with root package name */
    public Future<?> f30163d;

    /* renamed from: e, reason: collision with root package name */
    public long f30164e;

    /* renamed from: f, reason: collision with root package name */
    public final Set<f> f30165f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30166g;

    /* renamed from: h, reason: collision with root package name */
    public int f30167h;

    /* renamed from: i, reason: collision with root package name */
    public jb.b f30168i;

    /* renamed from: j, reason: collision with root package name */
    public u9.e f30169j;

    /* renamed from: k, reason: collision with root package name */
    public WorkSource f30170k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30171l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30172m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30173n;

    /* renamed from: o, reason: collision with root package name */
    public final Map<String, d> f30174o;

    /* renamed from: p, reason: collision with root package name */
    public AtomicInteger f30175p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f30176q;

    public a(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f30161a = new Object();
        this.f30162c = 0;
        this.f30165f = new HashSet();
        this.f30166g = true;
        this.f30169j = h.c();
        this.f30174o = new HashMap();
        this.f30175p = new AtomicInteger(0);
        m.m(context, "WakeLock: context must not be null");
        m.g(str, "WakeLock: wakeLockName must not be empty");
        this.f30173n = context.getApplicationContext();
        this.f30172m = str;
        this.f30168i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f30171l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f30171l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.b = newWakeLock;
        if (q.c(context)) {
            WorkSource b = q.b(context, o.a(packageName) ? context.getPackageName() : packageName);
            this.f30170k = b;
            if (b != null) {
                i(newWakeLock, b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f30158s;
        if (scheduledExecutorService == null) {
            synchronized (f30159t) {
                try {
                    scheduledExecutorService = f30158s;
                    if (scheduledExecutorService == null) {
                        jb.h.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f30158s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f30176q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(@NonNull a aVar) {
        synchronized (aVar.f30161a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f30171l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f30162c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f30175p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f30157r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f30161a) {
            try {
                if (!b()) {
                    this.f30168i = jb.b.a(false, null);
                    this.b.acquire();
                    this.f30169j.b();
                }
                this.f30162c++;
                this.f30167h++;
                f(null);
                d dVar = this.f30174o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f30174o.put(null, dVar);
                }
                dVar.f30178a++;
                long b = this.f30169j.b();
                long j11 = Long.MAX_VALUE - b > max ? b + max : Long.MAX_VALUE;
                if (j11 > this.f30164e) {
                    this.f30164e = j11;
                    Future<?> future = this.f30163d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f30163d = this.f30176q.schedule(new Runnable() { // from class: rb.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f30161a) {
            z10 = this.f30162c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f30175p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f30171l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f30161a) {
            try {
                f(null);
                if (this.f30174o.containsKey(null)) {
                    d dVar = this.f30174o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f30178a - 1;
                        dVar.f30178a = i10;
                        if (i10 == 0) {
                            this.f30174o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f30171l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f30161a) {
            this.f30166g = z10;
        }
    }

    public final String f(String str) {
        if (this.f30166g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f30165f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f30165f);
        this.f30165f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void h(int i10) {
        synchronized (this.f30161a) {
            try {
                if (b()) {
                    if (this.f30166g) {
                        int i11 = this.f30162c - 1;
                        this.f30162c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f30162c = 0;
                    }
                    g();
                    Iterator<d> it = this.f30174o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f30178a = 0;
                    }
                    this.f30174o.clear();
                    Future<?> future = this.f30163d;
                    if (future != null) {
                        future.cancel(false);
                        this.f30163d = null;
                        this.f30164e = 0L;
                    }
                    this.f30167h = 0;
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.f30168i != null) {
                                    this.f30168i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f30171l).concat(" failed to release!"), e10);
                                if (this.f30168i != null) {
                                    this.f30168i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f30168i != null) {
                                this.f30168i = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f30171l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
