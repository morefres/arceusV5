package ne;

import java.lang.Throwable;
import java.util.concurrent.Executor;
import ne.m;

/* loaded from: classes2.dex */
public abstract class a<V, X extends Throwable, F, T> extends m.a<V> implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public x<? extends V> f26958h;

    /* renamed from: i, reason: collision with root package name */
    public Class<X> f26959i;

    /* renamed from: j, reason: collision with root package name */
    public F f26960j;

    /* renamed from: ne.a$a, reason: collision with other inner class name */
    public static final class C0459a<V, X extends Throwable> extends a<V, X, i<? super X, ? extends V>, x<? extends V>> {
        public C0459a(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar) {
            super(xVar, cls, iVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public x<? extends V> O(i<? super X, ? extends V> iVar, X x10) {
            x<? extends V> apply = iVar.apply(x10);
            he.n.n(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", iVar);
            return apply;
        }

        @Override // ne.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public void P(x<? extends V> xVar) {
            F(xVar);
        }
    }

    public static final class b<V, X extends Throwable> extends a<V, X, he.f<? super X, ? extends V>, V> {
        public b(x<? extends V> xVar, Class<X> cls, he.f<? super X, ? extends V> fVar) {
            super(xVar, cls, fVar);
        }

        @Override // ne.a
        public void P(V v5) {
            D(v5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ne.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public V O(he.f<? super X, ? extends V> fVar, X x10) {
            return fVar.apply(x10);
        }
    }

    public a(x<? extends V> xVar, Class<X> cls, F f10) {
        this.f26958h = (x) he.n.l(xVar);
        this.f26959i = (Class) he.n.l(cls);
        this.f26960j = (F) he.n.l(f10);
    }

    public static <V, X extends Throwable> x<V> M(x<? extends V> xVar, Class<X> cls, he.f<? super X, ? extends V> fVar, Executor executor) {
        b bVar = new b(xVar, cls, fVar);
        xVar.a(bVar, a0.c(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> x<V> N(x<? extends V> xVar, Class<X> cls, i<? super X, ? extends V> iVar, Executor executor) {
        C0459a c0459a = new C0459a(xVar, cls, iVar);
        xVar.a(c0459a, a0.c(executor, c0459a));
        return c0459a;
    }

    @Override // ne.b
    public String A() {
        String str;
        x<? extends V> xVar = this.f26958h;
        Class<X> cls = this.f26959i;
        F f10 = this.f26960j;
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
        if (cls == null || f10 == null) {
            if (A == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return A.length() != 0 ? valueOf2.concat(A) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(cls);
        String valueOf4 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 29 + valueOf3.length() + valueOf4.length());
        sb3.append(str);
        sb3.append("exceptionType=[");
        sb3.append(valueOf3);
        sb3.append("], fallback=[");
        sb3.append(valueOf4);
        sb3.append("]");
        return sb3.toString();
    }

    public abstract T O(F f10, X x10);

    public abstract void P(T t8);

    @Override // ne.b
    public final void o() {
        z(this.f26958h);
        this.f26958h = null;
        this.f26959i = null;
        this.f26960j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            ne.x<? extends V> r0 = r9.f26958h
            java.lang.Class<X extends java.lang.Throwable> r1 = r9.f26959i
            F r2 = r9.f26960j
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Lb3
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L21
            goto Lb3
        L21:
            r3 = 0
            r9.f26958h = r3
            boolean r4 = r0 instanceof oe.a     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            oe.a r4 = (oe.a) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = oe.b.a(r4)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = ne.s.f(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L84
        L3c:
            r5 = r3
            goto L84
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L82
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L82:
            r4 = r5
            goto L3c
        L84:
            if (r4 != 0) goto L8e
            java.lang.Object r0 = ne.b0.a(r5)
            r9.D(r0)
            return
        L8e:
            boolean r1 = ne.d0.a(r4, r1)
            if (r1 != 0) goto L98
            r9.F(r0)
            return
        L98:
            java.lang.Object r0 = r9.O(r2, r4)     // Catch: java.lang.Throwable -> La4
            r9.f26959i = r3
            r9.f26960j = r3
            r9.P(r0)
            return
        La4:
            r0 = move-exception
            r9.E(r0)     // Catch: java.lang.Throwable -> Lad
            r9.f26959i = r3
            r9.f26960j = r3
            return
        Lad:
            r0 = move-exception
            r9.f26959i = r3
            r9.f26960j = r3
            throw r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.a.run():void");
    }
}
