package n0;

import h0.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import n0.g1;
import n0.p0;

/* loaded from: classes.dex */
public final class g1 implements a.InterfaceC0338a {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f25346a = new StringBuilder();
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public int f25347c;

    /* renamed from: d, reason: collision with root package name */
    public final h0.a f25348d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<g0.l, a> f25349e;

    /* renamed from: f, reason: collision with root package name */
    public int f25350f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public p0.a f25351a;
        public final Executor b;

        /* renamed from: c, reason: collision with root package name */
        public final b f25352c;

        /* renamed from: d, reason: collision with root package name */
        public final c f25353d;

        public a(p0.a aVar, Executor executor, b bVar, c cVar) {
            this.f25351a = aVar;
            this.b = executor;
            this.f25352c = bVar;
            this.f25353d = cVar;
        }

        public p0.a a() {
            return this.f25351a;
        }

        public void b() {
            try {
                Executor executor = this.b;
                final b bVar = this.f25352c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: n0.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g1.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        public void c() {
            try {
                Executor executor = this.b;
                final c cVar = this.f25353d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: n0.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g1.c.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                g0.r1.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        public p0.a d(p0.a aVar) {
            p0.a aVar2 = this.f25351a;
            this.f25351a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public g1(h0.a aVar, int i10) {
        Object obj = new Object();
        this.b = obj;
        this.f25349e = new HashMap();
        this.f25347c = i10;
        synchronized (obj) {
            this.f25348d = aVar;
            this.f25350f = this.f25347c;
        }
    }

    public static boolean d(p0.a aVar) {
        return aVar != null && aVar.b();
    }

    public static void h(g0.l lVar, p0.a aVar) {
        if (n5.a.h()) {
            n5.a.j("CX:State[" + lVar + "]", aVar.ordinal());
        }
    }

    @Override // h0.a.InterfaceC0338a
    public void a(int i10, int i11) {
        synchronized (this.b) {
            boolean z10 = true;
            this.f25347c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public final a b(String str) {
        for (g0.l lVar : this.f25349e.keySet()) {
            if (str.equals(((o0) lVar.d()).e())) {
                return this.f25349e.get(lVar);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.b) {
            try {
                Iterator<Map.Entry<g0.l, a>> it = this.f25349e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == p0.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(g0.l r7, n0.p0.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            int r1 = r6.f25350f     // Catch: java.lang.Throwable -> Le
            n0.p0$a r2 = n0.p0.a.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            n0.p0$a r2 = r6.k(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            n0.p0$a r2 = r6.l(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            h0.a r2 = r6.f25348d     // Catch: java.lang.Throwable -> Le
            int r2 = r2.e()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            n0.p0$a r2 = n0.p0.a.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            g0.t r2 = r7.d()     // Catch: java.lang.Throwable -> Le
            n0.o0 r2 = (n0.o0) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> Le
            h0.a r3 = r6.f25348d     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.d(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            n0.g1$a r2 = r6.b(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.f25350f     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<g0.l, n0.g1$a> r8 = r6.f25349e     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            n0.g1$a r3 = (n0.g1.a) r3     // Catch: java.lang.Throwable -> Le
            n0.p0$a r3 = r3.a()     // Catch: java.lang.Throwable -> Le
            n0.p0$a r5 = n0.p0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            g0.l r3 = (g0.l) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            n0.g1$a r1 = (n0.g1.a) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            n0.p0$a r1 = n0.p0.a.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.f25350f     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map<g0.l, n0.g1$a> r8 = r6.f25349e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            n0.g1$a r8 = (n0.g1.a) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            n0.g1$a r8 = (n0.g1.a) r8
            r8.c()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.b()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.g1.e(g0.l, n0.p0$a, boolean):void");
    }

    public final void f() {
        if (g0.r1.f("CameraStateRegistry")) {
            this.f25346a.setLength(0);
            this.f25346a.append("Recalculating open cameras:\n");
            this.f25346a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f25346a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<g0.l, a> entry : this.f25349e.entrySet()) {
            if (g0.r1.f("CameraStateRegistry")) {
                this.f25346a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i10++;
            }
        }
        if (g0.r1.f("CameraStateRegistry")) {
            this.f25346a.append("-------------------------------------------------------------------\n");
            this.f25346a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f25347c)));
            g0.r1.a("CameraStateRegistry", this.f25346a.toString());
        }
        this.f25350f = Math.max(this.f25347c - i10, 0);
    }

    public void g(g0.l lVar, Executor executor, b bVar, c cVar) {
        synchronized (this.b) {
            x2.g.j(!this.f25349e.containsKey(lVar), "Camera is already registered: " + lVar);
            this.f25349e.put(lVar, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(g0.l lVar) {
        boolean z10;
        synchronized (this.b) {
            try {
                a aVar = (a) x2.g.h(this.f25349e.get(lVar), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (g0.r1.f("CameraStateRegistry")) {
                    this.f25346a.setLength(0);
                    this.f25346a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", lVar, Integer.valueOf(this.f25350f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f25350f > 0 || d(aVar.a())) {
                    p0.a aVar2 = p0.a.OPENING;
                    aVar.d(aVar2);
                    h(lVar, aVar2);
                    z10 = true;
                }
                if (g0.r1.f("CameraStateRegistry")) {
                    this.f25346a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    g0.r1.a("CameraStateRegistry", this.f25346a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            h0.a r1 = r5.f25348d     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.e()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L5b
        L11:
            n0.g1$a r6 = r5.b(r6)     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r6 == 0) goto L1d
            n0.p0$a r6 = r6.a()     // Catch: java.lang.Throwable -> Lf
            goto L1e
        L1d:
            r6 = r1
        L1e:
            if (r7 == 0) goto L25
            n0.g1$a r7 = r5.b(r7)     // Catch: java.lang.Throwable -> Lf
            goto L26
        L25:
            r7 = r1
        L26:
            if (r7 == 0) goto L2c
            n0.p0$a r1 = r7.a()     // Catch: java.lang.Throwable -> Lf
        L2c:
            n0.p0$a r7 = n0.p0.a.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r2 != 0) goto L40
            n0.p0$a r2 = n0.p0.a.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L3e
            goto L40
        L3e:
            r6 = r4
            goto L41
        L40:
            r6 = r3
        L41:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L52
            n0.p0$a r7 = n0.p0.a.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L50
            goto L52
        L50:
            r7 = r4
            goto L53
        L52:
            r7 = r3
        L53:
            if (r6 == 0) goto L58
            if (r7 == 0) goto L58
            goto L59
        L58:
            r3 = r4
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.g1.j(java.lang.String, java.lang.String):boolean");
    }

    public final p0.a k(g0.l lVar) {
        a remove = this.f25349e.remove(lVar);
        if (remove == null) {
            return null;
        }
        f();
        return remove.a();
    }

    public final p0.a l(g0.l lVar, p0.a aVar) {
        p0.a d10 = ((a) x2.g.h(this.f25349e.get(lVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        p0.a aVar2 = p0.a.OPENING;
        if (aVar == aVar2) {
            x2.g.j(d(aVar) || d10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d10 != aVar) {
            h(lVar, aVar);
            f();
        }
        return d10;
    }
}
