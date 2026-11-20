package y1;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ne.x;

/* loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f36254a;
        public d<T> b;

        /* renamed from: c, reason: collision with root package name */
        public f<Void> f36255c = f.B();

        /* renamed from: d, reason: collision with root package name */
        public boolean f36256d;

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            f<Void> fVar = this.f36255c;
            if (fVar != null) {
                fVar.a(runnable, executor);
            }
        }

        public void b() {
            this.f36254a = null;
            this.b = null;
            this.f36255c.x(null);
        }

        public boolean c(T t8) {
            this.f36256d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.d(t8);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f36256d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.c(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f36254a = null;
            this.b = null;
            this.f36255c = null;
        }

        public boolean f(@NonNull Throwable th2) {
            this.f36256d = true;
            d<T> dVar = this.b;
            boolean z10 = dVar != null && dVar.e(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            f<Void> fVar;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.e(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f36254a));
            }
            if (this.f36256d || (fVar = this.f36255c) == null) {
                return;
            }
            fVar.x(null);
        }
    }

    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: y1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0669c<T> {
        Object a(@NonNull a<T> aVar);
    }

    public static final class d<T> implements x<T> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f36257a;
        public final y1.a<T> b = new a();

        public class a extends y1.a<T> {
            public a() {
            }

            @Override // y1.a
            public String u() {
                a<T> aVar = d.this.f36257a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f36254a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f36257a = new WeakReference<>(aVar);
        }

        @Override // ne.x
        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.b.a(runnable, executor);
        }

        public boolean c(boolean z10) {
            return this.b.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f36257a.get();
            boolean cancel = this.b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        public boolean d(T t8) {
            return this.b.x(t8);
        }

        public boolean e(Throwable th2) {
            return this.b.y(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        public String toString() {
            return this.b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) {
            return this.b.get(j10, timeUnit);
        }
    }

    @NonNull
    public static <T> x<T> a(@NonNull InterfaceC0669c<T> interfaceC0669c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.f36254a = interfaceC0669c.getClass();
        try {
            Object a10 = interfaceC0669c.a(aVar);
            if (a10 == null) {
                return dVar;
            }
            aVar.f36254a = a10;
            return dVar;
        } catch (Exception e10) {
            dVar.e(e10);
            return dVar;
        }
    }
}
