package iv;

import android.annotation.TargetApi;
import androidx.core.view.MotionEventCompat;
import iv.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(MotionEventCompat.AXIS_DISTANCE)
@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class g extends e.a {

    @IgnoreJRERequirement
    public static final class a<R> implements e<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f21141a;

        @IgnoreJRERequirement
        /* renamed from: iv.g$a$a, reason: collision with other inner class name */
        public class C0370a implements f<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f21142a;

            public C0370a(CompletableFuture<R> completableFuture) {
                this.f21142a = completableFuture;
            }

            @Override // iv.f
            public void a(d<R> dVar, Throwable th2) {
                this.f21142a.completeExceptionally(th2);
            }

            @Override // iv.f
            public void b(d<R> dVar, x<R> xVar) {
                if (xVar.g()) {
                    this.f21142a.complete(xVar.a());
                } else {
                    this.f21142a.completeExceptionally(new m(xVar));
                }
            }
        }

        public a(Type type) {
            this.f21141a = type;
        }

        @Override // iv.e
        public Type a() {
            return this.f21141a;
        }

        @Override // iv.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.F(new C0370a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a, reason: collision with root package name */
        public final d<?> f21143a;

        public b(d<?> dVar) {
            this.f21143a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f21143a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<x<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f21144a;

        @IgnoreJRERequirement
        public class a implements f<R> {

            /* renamed from: a, reason: collision with root package name */
            public final CompletableFuture<x<R>> f21145a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f21145a = completableFuture;
            }

            @Override // iv.f
            public void a(d<R> dVar, Throwable th2) {
                this.f21145a.completeExceptionally(th2);
            }

            @Override // iv.f
            public void b(d<R> dVar, x<R> xVar) {
                this.f21145a.complete(xVar);
            }
        }

        public c(Type type) {
            this.f21144a = type;
        }

        @Override // iv.e
        public Type a() {
            return this.f21144a;
        }

        @Override // iv.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.F(new a(bVar));
            return bVar;
        }
    }

    @Override // iv.e.a
    public e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type b10 = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(b10) != x.class) {
            return new a(b10);
        }
        if (b10 instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) b10));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
