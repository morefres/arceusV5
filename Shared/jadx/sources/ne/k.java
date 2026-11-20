package ne;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import ne.g;

/* loaded from: classes2.dex */
public final class k<V> extends g<Object, V> {

    /* renamed from: p, reason: collision with root package name */
    public k<V>.b<?> f27019p;

    public final class a extends k<V>.b<V> {

        /* renamed from: e, reason: collision with root package name */
        public final Callable<V> f27020e;

        public a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f27020e = (Callable) he.n.l(callable);
        }

        @Override // ne.w
        public V e() {
            return this.f27020e.call();
        }

        @Override // ne.w
        public String f() {
            return this.f27020e.toString();
        }

        @Override // ne.k.b
        public void i(V v5) {
            k.this.D(v5);
        }
    }

    public abstract class b<T> extends w<T> {

        /* renamed from: c, reason: collision with root package name */
        public final Executor f27022c;

        public b(Executor executor) {
            this.f27022c = (Executor) he.n.l(executor);
        }

        @Override // ne.w
        public final void a(Throwable th2) {
            k.this.f27019p = null;
            if (th2 instanceof ExecutionException) {
                k.this.E(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                k.this.cancel(false);
            } else {
                k.this.E(th2);
            }
        }

        @Override // ne.w
        public final void b(T t8) {
            k.this.f27019p = null;
            i(t8);
        }

        @Override // ne.w
        public final boolean d() {
            return k.this.isDone();
        }

        public final void h() {
            try {
                this.f27022c.execute(this);
            } catch (RejectedExecutionException e10) {
                k.this.E(e10);
            }
        }

        public abstract void i(T t8);
    }

    public k(ie.r<? extends x<?>> rVar, boolean z10, Executor executor, Callable<V> callable) {
        super(rVar, z10, false);
        this.f27019p = new a(callable, executor);
        W();
    }

    @Override // ne.g
    public void R(int i10, Object obj) {
    }

    @Override // ne.g
    public void U() {
        k<V>.b<?> bVar = this.f27019p;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // ne.g
    public void Z(g.a aVar) {
        super.Z(aVar);
        if (aVar == g.a.OUTPUT_FUTURE_DONE) {
            this.f27019p = null;
        }
    }

    @Override // ne.b
    public void y() {
        k<V>.b<?> bVar = this.f27019p;
        if (bVar != null) {
            bVar.c();
        }
    }
}
