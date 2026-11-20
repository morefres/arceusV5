package l9;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l9.k;

/* loaded from: classes.dex */
public class f implements Handler.Callback {

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public static final Status f23293u = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: v, reason: collision with root package name */
    public static final Status f23294v = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: w, reason: collision with root package name */
    public static final Object f23295w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static f f23296x;

    /* renamed from: c, reason: collision with root package name */
    public TelemetryData f23298c;

    /* renamed from: d, reason: collision with root package name */
    public n9.q f23299d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f23300e;

    /* renamed from: f, reason: collision with root package name */
    public final j9.c f23301f;

    /* renamed from: g, reason: collision with root package name */
    public final n9.d0 f23302g;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f23309s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f23310t;

    /* renamed from: a, reason: collision with root package name */
    public long f23297a = 10000;
    public boolean b = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f23303h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f23304i = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    public final Map f23305o = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: p, reason: collision with root package name */
    public a0 f23306p = null;

    /* renamed from: q, reason: collision with root package name */
    public final Set f23307q = new w1.b();

    /* renamed from: r, reason: collision with root package name */
    public final Set f23308r = new w1.b();

    public f(Context context, Looper looper, j9.c cVar) {
        this.f23310t = true;
        this.f23300e = context;
        bb.j jVar = new bb.j(looper, this);
        this.f23309s = jVar;
        this.f23301f = cVar;
        this.f23302g = new n9.d0(cVar);
        if (u9.i.a(context)) {
            this.f23310t = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f23295w) {
            try {
                f fVar = f23296x;
                if (fVar != null) {
                    fVar.f23304i.incrementAndGet();
                    Handler handler = fVar.f23309s;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(b bVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @NonNull
    public static f u() {
        f fVar;
        synchronized (f23295w) {
            n9.m.m(f23296x, "Must guarantee manager is non-null before using getInstance");
            fVar = f23296x;
        }
        return fVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public static f v(@NonNull Context context) {
        f fVar;
        synchronized (f23295w) {
            try {
                if (f23296x == null) {
                    f23296x = new f(context.getApplicationContext(), n9.f.b().getLooper(), j9.c.o());
                }
                fVar = f23296x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final void E(@NonNull k9.e eVar, int i10, @NonNull com.google.android.gms.common.api.internal.a aVar) {
        this.f23309s.sendMessage(this.f23309s.obtainMessage(4, new v0(new k1(i10, aVar), this.f23304i.get(), eVar)));
    }

    public final void F(@NonNull k9.e eVar, int i10, @NonNull u uVar, @NonNull sb.k kVar, @NonNull s sVar) {
        k(kVar, uVar.f(), eVar);
        this.f23309s.sendMessage(this.f23309s.obtainMessage(4, new v0(new m1(i10, uVar, kVar, sVar), this.f23304i.get(), eVar)));
    }

    public final void G(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f23309s.sendMessage(this.f23309s.obtainMessage(18, new u0(methodInvocation, i10, j10, i11)));
    }

    public final void H(@NonNull ConnectionResult connectionResult, int i10) {
        if (f(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f23309s;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void I() {
        Handler handler = this.f23309s;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void J(@NonNull k9.e eVar) {
        Handler handler = this.f23309s;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(@NonNull a0 a0Var) {
        synchronized (f23295w) {
            try {
                if (this.f23306p != a0Var) {
                    this.f23306p = a0Var;
                    this.f23307q.clear();
                }
                this.f23307q.addAll(a0Var.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NonNull a0 a0Var) {
        synchronized (f23295w) {
            try {
                if (this.f23306p == a0Var) {
                    this.f23306p = null;
                    this.f23307q.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration a10 = n9.n.b().a();
        if (a10 != null && !a10.x3()) {
            return false;
        }
        int a11 = this.f23302g.a(this.f23300e, 203400000);
        return a11 == -1 || a11 == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f23301f.y(this.f23300e, connectionResult, i10);
    }

    @ResultIgnorabilityUnspecified
    public final j0 h(k9.e eVar) {
        Map map = this.f23305o;
        b u8 = eVar.u();
        j0 j0Var = (j0) map.get(u8);
        if (j0Var == null) {
            j0Var = new j0(this, eVar);
            this.f23305o.put(u8, j0Var);
        }
        if (j0Var.a()) {
            this.f23308r.add(u8);
        }
        j0Var.C();
        return j0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        b bVar;
        boolean o8;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        int i10 = message.what;
        j0 j0Var = null;
        switch (i10) {
            case 1:
                this.f23297a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f23309s.removeMessages(12);
                for (b bVar6 : this.f23305o.keySet()) {
                    Handler handler = this.f23309s;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar6), this.f23297a);
                }
                return true;
            case 2:
                p1 p1Var = (p1) message.obj;
                Iterator it = p1Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b bVar7 = (b) it.next();
                        j0 j0Var2 = (j0) this.f23305o.get(bVar7);
                        if (j0Var2 == null) {
                            p1Var.c(bVar7, new ConnectionResult(13), null);
                        } else if (j0Var2.N()) {
                            p1Var.c(bVar7, ConnectionResult.f5736k, j0Var2.t().getEndpointPackageName());
                        } else {
                            ConnectionResult r8 = j0Var2.r();
                            if (r8 != null) {
                                p1Var.c(bVar7, r8, null);
                            } else {
                                j0Var2.H(p1Var);
                                j0Var2.C();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (j0 j0Var3 : this.f23305o.values()) {
                    j0Var3.B();
                    j0Var3.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                v0 v0Var = (v0) message.obj;
                j0 j0Var4 = (j0) this.f23305o.get(v0Var.f23389c.u());
                if (j0Var4 == null) {
                    j0Var4 = h(v0Var.f23389c);
                }
                if (!j0Var4.a() || this.f23304i.get() == v0Var.b) {
                    j0Var4.D(v0Var.f23388a);
                } else {
                    v0Var.f23388a.a(f23293u);
                    j0Var4.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f23305o.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        j0 j0Var5 = (j0) it2.next();
                        if (j0Var5.p() == i11) {
                            j0Var = j0Var5;
                        }
                    }
                }
                if (j0Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.w3() == 13) {
                    j0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f23301f.e(connectionResult.w3()) + ": " + connectionResult.x3()));
                } else {
                    bVar = j0Var.f23326c;
                    j0Var.e(g(bVar, connectionResult));
                }
                return true;
            case 6:
                if (this.f23300e.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f23300e.getApplicationContext());
                    c.b().a(new e0(this));
                    if (!c.b().e(true)) {
                        this.f23297a = 300000L;
                    }
                }
                return true;
            case 7:
                h((k9.e) message.obj);
                return true;
            case 9:
                if (this.f23305o.containsKey(message.obj)) {
                    ((j0) this.f23305o.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it3 = this.f23308r.iterator();
                while (it3.hasNext()) {
                    j0 j0Var6 = (j0) this.f23305o.remove((b) it3.next());
                    if (j0Var6 != null) {
                        j0Var6.J();
                    }
                }
                this.f23308r.clear();
                return true;
            case 11:
                if (this.f23305o.containsKey(message.obj)) {
                    ((j0) this.f23305o.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f23305o.containsKey(message.obj)) {
                    ((j0) this.f23305o.get(message.obj)).b();
                }
                return true;
            case 14:
                b0 b0Var = (b0) message.obj;
                b a10 = b0Var.a();
                if (this.f23305o.containsKey(a10)) {
                    o8 = ((j0) this.f23305o.get(a10)).o(false);
                    b0Var.b().c(Boolean.valueOf(o8));
                } else {
                    b0Var.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                l0 l0Var = (l0) message.obj;
                Map map = this.f23305o;
                bVar2 = l0Var.f23340a;
                if (map.containsKey(bVar2)) {
                    Map map2 = this.f23305o;
                    bVar3 = l0Var.f23340a;
                    j0.z((j0) map2.get(bVar3), l0Var);
                }
                return true;
            case 16:
                l0 l0Var2 = (l0) message.obj;
                Map map3 = this.f23305o;
                bVar4 = l0Var2.f23340a;
                if (map3.containsKey(bVar4)) {
                    Map map4 = this.f23305o;
                    bVar5 = l0Var2.f23340a;
                    j0.A((j0) map4.get(bVar5), l0Var2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                u0 u0Var = (u0) message.obj;
                if (u0Var.f23386c == 0) {
                    i().c(new TelemetryData(u0Var.b, Arrays.asList(u0Var.f23385a)));
                } else {
                    TelemetryData telemetryData = this.f23298c;
                    if (telemetryData != null) {
                        List w32 = telemetryData.w3();
                        if (telemetryData.v3() != u0Var.b || (w32 != null && w32.size() >= u0Var.f23387d)) {
                            this.f23309s.removeMessages(17);
                            j();
                        } else {
                            this.f23298c.x3(u0Var.f23385a);
                        }
                    }
                    if (this.f23298c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u0Var.f23385a);
                        this.f23298c = new TelemetryData(u0Var.b, arrayList);
                        Handler handler2 = this.f23309s;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u0Var.f23386c);
                    }
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final n9.q i() {
        if (this.f23299d == null) {
            this.f23299d = n9.p.a(this.f23300e);
        }
        return this.f23299d;
    }

    public final void j() {
        TelemetryData telemetryData = this.f23298c;
        if (telemetryData != null) {
            if (telemetryData.v3() > 0 || e()) {
                i().c(telemetryData);
            }
            this.f23298c = null;
        }
    }

    public final void k(sb.k kVar, int i10, k9.e eVar) {
        t0 a10;
        if (i10 == 0 || (a10 = t0.a(this, i10, eVar.u())) == null) {
            return;
        }
        Task a11 = kVar.a();
        final Handler handler = this.f23309s;
        handler.getClass();
        a11.c(new Executor() { // from class: l9.d0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a10);
    }

    public final int l() {
        return this.f23303h.getAndIncrement();
    }

    public final j0 t(b bVar) {
        return (j0) this.f23305o.get(bVar);
    }

    @NonNull
    public final Task x(@NonNull Iterable iterable) {
        p1 p1Var = new p1(iterable);
        this.f23309s.sendMessage(this.f23309s.obtainMessage(2, p1Var));
        return p1Var.a();
    }

    @NonNull
    public final Task y(@NonNull k9.e eVar, @NonNull o oVar, @NonNull w wVar, @NonNull Runnable runnable) {
        sb.k kVar = new sb.k();
        k(kVar, oVar.e(), eVar);
        this.f23309s.sendMessage(this.f23309s.obtainMessage(8, new v0(new l1(new w0(oVar, wVar, runnable), kVar), this.f23304i.get(), eVar)));
        return kVar.a();
    }

    @NonNull
    public final Task z(@NonNull k9.e eVar, @NonNull k.a aVar, int i10) {
        sb.k kVar = new sb.k();
        k(kVar, i10, eVar);
        this.f23309s.sendMessage(this.f23309s.obtainMessage(13, new v0(new n1(aVar, kVar), this.f23304i.get(), eVar)));
        return kVar.a();
    }
}
