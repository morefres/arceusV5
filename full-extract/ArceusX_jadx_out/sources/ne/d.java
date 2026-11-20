package ne;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ne.m;

/* loaded from: classes2.dex */
public abstract class d<I, O, F, T> extends m.a<O> implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public x<? extends I> f26989h;

    /* renamed from: i, reason: collision with root package name */
    public F f26990i;

    public static final class a<I, O> extends d<I, O, i<? super I, ? extends O>, x<? extends O>> {
        public a(x<? extends I> xVar, i<? super I, ? extends O> iVar) {
            super(xVar, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends O> O(i<? super I, ? extends O> iVar, I i10) {
            x<? extends O> apply = iVar.apply(i10);
            he.n.n(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return apply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends O> xVar) {
            F(xVar);
        }
    }

    public static final class b<I, O> extends d<I, O, he.f<? super I, ? extends O>, O> {
        public b(x<? extends I> xVar, he.f<? super I, ? extends O> fVar) {
            super(xVar, fVar);
        }

        @Override // ne.d
        public void P(O o8) {
            D(o8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.d
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public O O(he.f<? super I, ? extends O> fVar, I i10) {
            return fVar.apply(i10);
        }
    }

    public d(x<? extends I> xVar, F f10) {
        this.f26989h = (x) he.n.l(xVar);
        this.f26990i = (F) he.n.l(f10);
    }

    public static <I, O> x<O> M(x<I> xVar, he.f<? super I, ? extends O> fVar, Executor executor) {
        he.n.l(fVar);
        b bVar = new b(xVar, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <I, O> x<O> N(x<I> xVar, i<? super I, ? extends O> iVar, Executor executor) {
        he.n.l(executor);
        a aVar = new a(xVar, iVar);
        xVar.a(aVar, a0.c(executor, aVar));
        return aVar;
    }

    @Override // ne.b
    public String A() {
        String str;
        x<? extends I> xVar = this.f26989h;
        F f10 = this.f26990i;
        String A = super.A();
        if (xVar != null) {
            String valueOf = String.valueOf(xVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(valueOf);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (f10 == null) {
            if (A == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return A.length() != 0 ? valueOf2.concat(A) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf3.length());
        sb3.append(str);
        sb3.append("function=[");
        sb3.append(valueOf3);
        sb3.append("]");
        return sb3.toString();
    }

    public abstract T O(F f10, I i10);

    public abstract void P(T t8);

    @Override // ne.b
    public final void o() {
        z(this.f26989h);
        this.f26989h = null;
        this.f26990i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x<? extends I> xVar = this.f26989h;
        F f10 = this.f26990i;
        if ((isCancelled() | (xVar == null)) || (f10 == null)) {
            return;
        }
        this.f26989h = null;
        if (xVar.isCancelled()) {
            F(xVar);
            return;
        }
        try {
            try {
                Object O = O(f10, s.f(xVar));
                this.f26990i = null;
                P(O);
            } catch (Throwable th2) {
                try {
                    E(th2);
                } finally {
                    this.f26990i = null;
                }
            }
        } catch (Error e10) {
            E(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            E(e11);
        } catch (ExecutionException e12) {
            E(e12.getCause());
        }
    }
}
