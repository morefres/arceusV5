package r0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ne.x;
import y1.c;

/* loaded from: classes.dex */
public class d<V> implements x<V> {

    /* renamed from: a, reason: collision with root package name */
    public final x<V> f30029a;
    public c.a<V> b;

    public class a implements c.InterfaceC0669c<V> {
        public a() {
        }

        @Override // y1.c.InterfaceC0669c
        public Object a(c.a<V> aVar) {
            x2.g.j(d.this.b == null, "The result can only set once!");
            d.this.b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(x<V> xVar) {
        this.f30029a = (x) x2.g.g(xVar);
    }

    public static <V> d<V> c(x<V> xVar) {
        return xVar instanceof d ? (d) xVar : new d<>(xVar);
    }

    @Override // ne.x
    public void a(Runnable runnable, Executor executor) {
        this.f30029a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f30029a.cancel(z10);
    }

    public boolean d(V v5) {
        c.a<V> aVar = this.b;
        if (aVar != null) {
            return aVar.c(v5);
        }
        return false;
    }

    public boolean e(Throwable th2) {
        c.a<V> aVar = this.b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    public final <T> d<T> f(t.a<? super V, T> aVar, Executor executor) {
        return (d) n.x(this, aVar, executor);
    }

    public final <T> d<T> g(r0.a<? super V, T> aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f30029a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f30029a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f30029a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f30029a.get(j10, timeUnit);
    }

    public d() {
        this.f30029a = y1.c.a(new a());
    }
}
