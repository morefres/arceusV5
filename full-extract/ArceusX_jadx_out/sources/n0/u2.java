package n0;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import n0.a3;
import n0.u2;
import y1.c;

/* loaded from: classes.dex */
public final class u2<T> implements a3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.d0<a<T>> f25580a = new android.view.d0<>();
    public final Map<a3.a<? super T>, Executor> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public android.view.e0<a<T>> f25581c;

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f25582a;
        public final Throwable b;

        public a(T t8, Throwable th2) {
            this.f25582a = t8;
            this.b = th2;
        }

        public static <T> a<T> b(T t8) {
            return new a<>(t8, null);
        }

        public boolean a() {
            return this.b == null;
        }

        public Throwable c() {
            return this.b;
        }

        public T d() {
            if (a()) {
                return this.f25582a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f25582a;
            } else {
                str = "Error: " + this.b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public static /* synthetic */ void a(u2 u2Var, final a aVar) {
        HashMap hashMap;
        synchronized (u2Var.b) {
            hashMap = new HashMap(u2Var.b);
        }
        for (final Map.Entry entry : hashMap.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: n0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    u2.f(entry, aVar);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(Map.Entry entry, a aVar) {
        a3.a aVar2 = (a3.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            x2.g.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object g(final u2 u2Var, final c.a aVar) {
        u2Var.getClass();
        q0.c.e().execute(new Runnable() { // from class: n0.o2
            @Override // java.lang.Runnable
            public final void run() {
                u2.k(u2.this, aVar);
            }
        });
        return u2Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void h(final u2 u2Var) {
        if (u2Var.f25581c == null) {
            u2Var.f25581c = new android.view.e0() { // from class: n0.p2
                @Override // android.view.e0
                public final void a(Object obj) {
                    u2.a(u2.this, (u2.a) obj);
                }
            };
        }
        u2Var.f25580a.j(u2Var.f25581c);
    }

    public static /* synthetic */ void i(u2 u2Var) {
        android.view.e0<a<T>> e0Var = u2Var.f25581c;
        if (e0Var != null) {
            u2Var.f25580a.n(e0Var);
        }
    }

    public static /* synthetic */ void j(u2 u2Var, a3.a aVar) {
        a<T> f10 = u2Var.f25580a.f();
        if (f10 == null) {
            return;
        }
        if (f10.a()) {
            aVar.a(f10.d());
        } else {
            x2.g.g(f10.c());
            aVar.onError(f10.c());
        }
    }

    public static /* synthetic */ void k(u2 u2Var, c.a aVar) {
        a<T> f10 = u2Var.f25580a.f();
        if (f10 == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (f10.a()) {
            aVar.c(f10.d());
        } else {
            x2.g.g(f10.c());
            aVar.f(f10.c());
        }
    }

    @Override // n0.a3
    public ne.x<T> b() {
        return y1.c.a(new c.InterfaceC0669c() { // from class: n0.s2
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return u2.g(u2.this, aVar);
            }
        });
    }

    @Override // n0.a3
    public void c(Executor executor, final a3.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                boolean isEmpty = this.b.isEmpty();
                this.b.put(aVar, executor);
                if (isEmpty) {
                    m();
                } else {
                    executor.execute(new Runnable() { // from class: n0.r2
                        @Override // java.lang.Runnable
                        public final void run() {
                            u2.j(u2.this, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                this.b.remove(aVar);
                if (this.b.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        q0.c.e().execute(new Runnable() { // from class: n0.t2
            @Override // java.lang.Runnable
            public final void run() {
                u2.i(u2.this);
            }
        });
    }

    public final void m() {
        q0.c.e().execute(new Runnable() { // from class: n0.n2
            @Override // java.lang.Runnable
            public final void run() {
                u2.h(u2.this);
            }
        });
    }

    public void n(T t8) {
        this.f25580a.m(a.b(t8));
    }
}
