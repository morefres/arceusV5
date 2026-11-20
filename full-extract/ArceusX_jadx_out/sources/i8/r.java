package i8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c8.g;
import e8.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k8.b;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20288a;
    public final c8.e b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.d f20289c;

    /* renamed from: d, reason: collision with root package name */
    public final x f20290d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f20291e;

    /* renamed from: f, reason: collision with root package name */
    public final k8.b f20292f;

    /* renamed from: g, reason: collision with root package name */
    public final l8.a f20293g;

    /* renamed from: h, reason: collision with root package name */
    public final l8.a f20294h;

    /* renamed from: i, reason: collision with root package name */
    public final j8.c f20295i;

    public r(Context context, c8.e eVar, j8.d dVar, x xVar, Executor executor, k8.b bVar, l8.a aVar, l8.a aVar2, j8.c cVar) {
        this.f20288a = context;
        this.b = eVar;
        this.f20289c = dVar;
        this.f20290d = xVar;
        this.f20291e = executor;
        this.f20292f = bVar;
        this.f20293g = aVar;
        this.f20294h = aVar2;
        this.f20295i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, b8.o oVar, long j10) {
        rVar.f20289c.r1(iterable);
        rVar.f20289c.n2(oVar, rVar.f20293g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f20295i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f20289c.J(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, b8.o oVar, int i10) {
        rVar.f20290d.b(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, b8.o oVar, long j10) {
        rVar.f20289c.n2(oVar, rVar.f20293g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f20295i.d(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final b8.o oVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                k8.b bVar = rVar.f20292f;
                final j8.d dVar = rVar.f20289c;
                Objects.requireNonNull(dVar);
                bVar.b(new b.a() { // from class: i8.i
                    @Override // k8.b.a
                    public final Object execute() {
                        return Integer.valueOf(j8.d.this.cleanUp());
                    }
                });
                if (rVar.k()) {
                    rVar.l(oVar, i10);
                } else {
                    rVar.f20292f.b(new b.a() { // from class: i8.j
                        @Override // k8.b.a
                        public final Object execute() {
                            return r.f(r.this, oVar, i10);
                        }
                    });
                }
                runnable.run();
            } catch (k8.a unused) {
                rVar.f20290d.b(oVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public b8.i j(c8.m mVar) {
        k8.b bVar = this.f20292f;
        final j8.c cVar = this.f20295i;
        Objects.requireNonNull(cVar);
        return mVar.a(b8.i.a().i(this.f20293g.a()).k(this.f20294h.a()).j("GDT_CLIENT_METRICS").h(new b8.h(y7.c.b("proto"), ((e8.a) bVar.b(new b.a() { // from class: i8.h
            @Override // k8.b.a
            public final Object execute() {
                return j8.c.this.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20288a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public c8.g l(final b8.o oVar, int i10) {
        c8.g b;
        c8.m a10 = this.b.a(oVar.b());
        c8.g e10 = c8.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f20292f.b(new b.a() { // from class: i8.k
            @Override // k8.b.a
            public final Object execute() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r.this.f20289c.K(oVar));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f20292f.b(new b.a() { // from class: i8.l
                @Override // k8.b.a
                public final Object execute() {
                    Iterable c12;
                    c12 = r.this.f20289c.c1(oVar);
                    return c12;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e10;
            }
            if (a10 == null) {
                f8.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                b = c8.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j8.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(a10));
                }
                b = a10.b(c8.f.a().b(arrayList).c(oVar.c()).a());
            }
            e10 = b;
            if (e10.c() == g.a.TRANSIENT_ERROR) {
                final b8.o oVar2 = oVar;
                this.f20292f.b(new b.a() { // from class: i8.m
                    @Override // k8.b.a
                    public final Object execute() {
                        return r.b(r.this, iterable, oVar2, j10);
                    }
                });
                this.f20290d.a(oVar2, i10 + 1, true);
                return e10;
            }
            b8.o oVar3 = oVar;
            this.f20292f.b(new b.a() { // from class: i8.n
                @Override // k8.b.a
                public final Object execute() {
                    return r.e(r.this, iterable);
                }
            });
            if (e10.c() == g.a.OK) {
                long max = Math.max(j10, e10.b());
                if (oVar3.e()) {
                    this.f20292f.b(new b.a() { // from class: i8.o
                        @Override // k8.b.a
                        public final Object execute() {
                            return r.c(r.this);
                        }
                    });
                }
                j10 = max;
            } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String j11 = ((j8.k) it2.next()).b().j();
                    if (hashMap.containsKey(j11)) {
                        hashMap.put(j11, Integer.valueOf(((Integer) hashMap.get(j11)).intValue() + 1));
                    } else {
                        hashMap.put(j11, 1);
                    }
                }
                this.f20292f.b(new b.a() { // from class: i8.p
                    @Override // k8.b.a
                    public final Object execute() {
                        return r.h(r.this, hashMap);
                    }
                });
            }
            oVar = oVar3;
        }
        final b8.o oVar4 = oVar;
        this.f20292f.b(new b.a() { // from class: i8.q
            @Override // k8.b.a
            public final Object execute() {
                return r.g(r.this, oVar4, j10);
            }
        });
        return e10;
    }

    public void m(final b8.o oVar, final int i10, final Runnable runnable) {
        this.f20291e.execute(new Runnable() { // from class: i8.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(r.this, oVar, i10, runnable);
            }
        });
    }
}
