package zf;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cg.d;
import cg.f;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import mf.x;
import zf.i;

/* loaded from: classes2.dex */
public class g implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f38019m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f38020n = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ff.e f38021a;
    public final cg.c b;

    /* renamed from: c, reason: collision with root package name */
    public final bg.c f38022c;

    /* renamed from: d, reason: collision with root package name */
    public final p f38023d;

    /* renamed from: e, reason: collision with root package name */
    public final x<bg.b> f38024e;

    /* renamed from: f, reason: collision with root package name */
    public final n f38025f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38026g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f38027h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f38028i;

    /* renamed from: j, reason: collision with root package name */
    public String f38029j;

    /* renamed from: k, reason: collision with root package name */
    public Set<ag.a> f38030k;

    /* renamed from: l, reason: collision with root package name */
    public final List<o> f38031l;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f38032a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f38032a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38033a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[f.b.values().length];
            b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f38033a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38033a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(final ff.e eVar, @NonNull yf.b<wf.i> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, eVar, new cg.c(eVar.j(), bVar), new bg.c(eVar), p.c(), new x(new yf.b() { // from class: zf.c
            @Override // yf.b
            public final Object get() {
                return g.e(ff.e.this);
            }
        }), new n());
    }

    public static /* synthetic */ bg.b e(ff.e eVar) {
        return new bg.b(eVar);
    }

    @NonNull
    public static g p() {
        return q(ff.e.k());
    }

    @NonNull
    public static g q(@NonNull ff.e eVar) {
        n9.m.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) eVar.i(h.class);
    }

    public final synchronized void A(String str) {
        this.f38029j = str;
    }

    public final synchronized void B(bg.d dVar, bg.d dVar2) {
        if (this.f38030k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<ag.a> it = this.f38030k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    @Override // zf.h
    @NonNull
    public Task<m> a(final boolean z10) {
        v();
        Task<m> f10 = f();
        this.f38027h.execute(new Runnable() { // from class: zf.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(z10);
            }
        });
        return f10;
    }

    public final Task<m> f() {
        sb.k kVar = new sb.k();
        h(new k(this.f38023d, kVar));
        return kVar.a();
    }

    public final Task<String> g() {
        sb.k kVar = new sb.k();
        h(new l(kVar));
        return kVar.a();
    }

    @Override // zf.h
    @NonNull
    public Task<String> getId() {
        v();
        String n10 = n();
        if (n10 != null) {
            return sb.m.f(n10);
        }
        Task<String> g10 = g();
        this.f38027h.execute(new Runnable() { // from class: zf.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(false);
            }
        });
        return g10;
    }

    public final void h(o oVar) {
        synchronized (this.f38026g) {
            this.f38031l.add(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r3) {
        /*
            r2 = this;
            bg.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: zf.i -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: zf.i -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            zf.p r3 = r2.f38023d     // Catch: zf.i -> L1d
            boolean r3 = r3.f(r0)     // Catch: zf.i -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            bg.d r3 = r2.k(r0)     // Catch: zf.i -> L1d
            goto L28
        L24:
            bg.d r3 = r2.x(r0)     // Catch: zf.i -> L1d
        L28:
            r2.u(r3)
            r2.B(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.A(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            zf.i r3 = new zf.i
            zf.i$a r0 = zf.i.a.BAD_CONFIG
            r3.<init>(r0)
            r2.y(r3)
            return
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.y(r3)
            return
        L5d:
            r2.z(r3)
            return
        L61:
            r2.y(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.g.i(boolean):void");
    }

    public final void j(final boolean z10) {
        bg.d s8 = s();
        if (z10) {
            s8 = s8.p();
        }
        z(s8);
        this.f38028i.execute(new Runnable() { // from class: zf.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.i(z10);
            }
        });
    }

    public final bg.d k(@NonNull bg.d dVar) {
        cg.f e10 = this.b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f38023d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    public String l() {
        return this.f38021a.m().b();
    }

    public String m() {
        return this.f38021a.m().c();
    }

    public final synchronized String n() {
        return this.f38029j;
    }

    public final bg.b o() {
        return this.f38024e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final bg.d r() {
        bg.d d10;
        synchronized (f38019m) {
            try {
                zf.b a10 = zf.b.a(this.f38021a.j(), "generatefid.lock");
                try {
                    d10 = this.f38022c.d();
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return d10;
    }

    /* JADX WARN: Finally extract failed */
    public final bg.d s() {
        bg.d d10;
        synchronized (f38019m) {
            try {
                zf.b a10 = zf.b.a(this.f38021a.j(), "generatefid.lock");
                try {
                    d10 = this.f38022c.d();
                    if (d10.j()) {
                        d10 = this.f38022c.b(d10.t(w(d10)));
                    }
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return d10;
    }

    public String t() {
        return this.f38021a.m().e();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(bg.d dVar) {
        synchronized (f38019m) {
            try {
                zf.b a10 = zf.b.a(this.f38021a.j(), "generatefid.lock");
                try {
                    this.f38022c.b(dVar);
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void v() {
        n9.m.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(bg.d dVar) {
        if ((!this.f38021a.l().equals("CHIME_ANDROID_SDK") && !this.f38021a.t()) || !dVar.m()) {
            return this.f38025f.a();
        }
        String f10 = o().f();
        return TextUtils.isEmpty(f10) ? this.f38025f.a() : f10;
    }

    public final bg.d x(bg.d dVar) {
        cg.d d10 = this.b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f38033a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f38023d.b(), d10.b().c(), d10.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f38026g) {
            try {
                Iterator<o> it = this.f38031l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(bg.d dVar) {
        synchronized (this.f38026g) {
            try {
                Iterator<o> it = this.f38031l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(ExecutorService executorService, Executor executor, ff.e eVar, cg.c cVar, bg.c cVar2, p pVar, x<bg.b> xVar, n nVar) {
        this.f38026g = new Object();
        this.f38030k = new HashSet();
        this.f38031l = new ArrayList();
        this.f38021a = eVar;
        this.b = cVar;
        this.f38022c = cVar2;
        this.f38023d = pVar;
        this.f38024e = xVar;
        this.f38025f = nVar;
        this.f38027h = executorService;
        this.f38028i = executor;
    }
}
