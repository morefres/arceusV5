package android.view;

import android.view.l;

/* loaded from: classes.dex */
public abstract class a0<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2542k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2543a;
    public s.b<e0<? super T>, a0<T>.d> b;

    /* renamed from: c, reason: collision with root package name */
    public int f2544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2545d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2546e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2547f;

    /* renamed from: g, reason: collision with root package name */
    public int f2548g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2549h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2550i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f2551j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (a0.this.f2543a) {
                obj = a0.this.f2547f;
                a0.this.f2547f = a0.f2542k;
            }
            a0.this.o(obj);
        }
    }

    public class b extends a0<T>.d {
        public b(e0<? super T> e0Var) {
            super(e0Var);
        }

        @Override // androidx.lifecycle.a0.d
        public boolean d() {
            return true;
        }
    }

    public class c extends a0<T>.d implements p {

        /* renamed from: e, reason: collision with root package name */
        public final s f2554e;

        public c(s sVar, e0<? super T> e0Var) {
            super(e0Var);
            this.f2554e = sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public void b() {
            this.f2554e.a().d(this);
        }

        @Override // androidx.lifecycle.a0.d
        public boolean c(s sVar) {
            return this.f2554e == sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public boolean d() {
            return this.f2554e.a().b().b(l.b.f2629d);
        }

        @Override // android.view.p
        public void f(s sVar, l.a aVar) {
            l.b b = this.f2554e.a().b();
            if (b == l.b.f2627a) {
                a0.this.n(this.f2556a);
                return;
            }
            l.b bVar = null;
            while (bVar != b) {
                a(d());
                bVar = b;
                b = this.f2554e.a().b();
            }
        }
    }

    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final e0<? super T> f2556a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public int f2557c = -1;

        public d(e0<? super T> e0Var) {
            this.f2556a = e0Var;
        }

        public void a(boolean z10) {
            if (z10 == this.b) {
                return;
            }
            this.b = z10;
            a0.this.c(z10 ? 1 : -1);
            if (this.b) {
                a0.this.e(this);
            }
        }

        public void b() {
        }

        public boolean c(s sVar) {
            return false;
        }

        public abstract boolean d();
    }

    public a0(T t8) {
        this.f2543a = new Object();
        this.b = new s.b<>();
        this.f2544c = 0;
        this.f2547f = f2542k;
        this.f2551j = new a();
        this.f2546e = t8;
        this.f2548g = 0;
    }

    public static void b(String str) {
        if (r.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i10) {
        int i11 = this.f2544c;
        this.f2544c = i10 + i11;
        if (this.f2545d) {
            return;
        }
        this.f2545d = true;
        while (true) {
            try {
                int i12 = this.f2544c;
                if (i11 == i12) {
                    this.f2545d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f2545d = false;
                throw th2;
            }
        }
    }

    public final void d(a0<T>.d dVar) {
        if (dVar.b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f2557c;
            int i11 = this.f2548g;
            if (i10 >= i11) {
                return;
            }
            dVar.f2557c = i11;
            dVar.f2556a.a((Object) this.f2546e);
        }
    }

    public void e(a0<T>.d dVar) {
        if (this.f2549h) {
            this.f2550i = true;
            return;
        }
        this.f2549h = true;
        do {
            this.f2550i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                s.b<e0<? super T>, a0<T>.d>.d c10 = this.b.c();
                while (c10.hasNext()) {
                    d((d) c10.next().getValue());
                    if (this.f2550i) {
                        break;
                    }
                }
            }
        } while (this.f2550i);
        this.f2549h = false;
    }

    public T f() {
        T t8 = (T) this.f2546e;
        if (t8 != f2542k) {
            return t8;
        }
        return null;
    }

    public int g() {
        return this.f2548g;
    }

    public boolean h() {
        return this.f2544c > 0;
    }

    public void i(s sVar, e0<? super T> e0Var) {
        b("observe");
        if (sVar.a().b() == l.b.f2627a) {
            return;
        }
        c cVar = new c(sVar, e0Var);
        a0<T>.d f10 = this.b.f(e0Var, cVar);
        if (f10 != null && !f10.c(sVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f10 != null) {
            return;
        }
        sVar.a().a(cVar);
    }

    public void j(e0<? super T> e0Var) {
        b("observeForever");
        b bVar = new b(e0Var);
        a0<T>.d f10 = this.b.f(e0Var, bVar);
        if (f10 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f10 != null) {
            return;
        }
        bVar.a(true);
    }

    public void k() {
    }

    public void l() {
    }

    public void m(T t8) {
        boolean z10;
        synchronized (this.f2543a) {
            z10 = this.f2547f == f2542k;
            this.f2547f = t8;
        }
        if (z10) {
            r.c.g().c(this.f2551j);
        }
    }

    public void n(e0<? super T> e0Var) {
        b("removeObserver");
        a0<T>.d g10 = this.b.g(e0Var);
        if (g10 == null) {
            return;
        }
        g10.b();
        g10.a(false);
    }

    public void o(T t8) {
        b("setValue");
        this.f2548g++;
        this.f2546e = t8;
        e(null);
    }

    public a0() {
        this.f2543a = new Object();
        this.b = new s.b<>();
        this.f2544c = 0;
        Object obj = f2542k;
        this.f2547f = obj;
        this.f2551j = new a();
        this.f2546e = obj;
        this.f2548g = -1;
    }
}
