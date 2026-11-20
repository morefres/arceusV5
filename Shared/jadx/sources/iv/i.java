package iv;

import iv.e;
import iv.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final class i extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21146a;

    public class a implements e<Object, d<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f21147a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.f21147a = type;
            this.b = executor;
        }

        @Override // iv.e
        public Type a() {
            return this.f21147a;
        }

        @Override // iv.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    public static final class b<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f21149a;
        public final d<T> b;

        public class a implements f<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f21150a;

            public a(f fVar) {
                this.f21150a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, x xVar) {
                if (b.this.b.isCanceled()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, xVar);
                }
            }

            @Override // iv.f
            public void a(d<T> dVar, final Throwable th2) {
                Executor executor = b.this.f21149a;
                final f fVar = this.f21150a;
                executor.execute(new Runnable() { // from class: iv.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(i.b.this, th2);
                    }
                });
            }

            @Override // iv.f
            public void b(d<T> dVar, final x<T> xVar) {
                Executor executor = b.this.f21149a;
                final f fVar = this.f21150a;
                executor.execute(new Runnable() { // from class: iv.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.d(i.b.a.this, fVar, xVar);
                    }
                });
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f21149a = executor;
            this.b = dVar;
        }

        @Override // iv.d
        public void F(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.b.F(new a(fVar));
        }

        @Override // iv.d
        public void cancel() {
            this.b.cancel();
        }

        @Override // iv.d
        public x<T> execute() {
            return this.b.execute();
        }

        @Override // iv.d
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // iv.d
        public Request request() {
            return this.b.request();
        }

        @Override // iv.d
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public d<T> m73clone() {
            return new b(this.f21149a, this.b.m226clone());
        }
    }

    public i(Executor executor) {
        this.f21146a = executor;
    }

    @Override // iv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f21146a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
