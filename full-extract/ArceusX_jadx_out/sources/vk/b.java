package vk;

import iv.f;
import iv.x;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes2.dex */
public class b<T> implements iv.d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f33454a;
    public final iv.d<T> b;

    public class a implements f<T> {

        /* renamed from: a, reason: collision with root package name */
        public f<T> f33455a;
        public boolean b;

        /* renamed from: vk.b$a$a, reason: collision with other inner class name */
        public class RunnableC0618a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f33457a;

            public RunnableC0618a(x xVar) {
                this.f33457a = xVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.isCanceled()) {
                    a.this.f33455a.a(b.this, new IOException("Canceled"));
                } else {
                    a.this.f33455a.b(b.this, this.f33457a);
                }
            }
        }

        /* renamed from: vk.b$a$b, reason: collision with other inner class name */
        public class RunnableC0619b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Throwable f33458a;

            public RunnableC0619b(Throwable th2) {
                this.f33458a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f33455a.a(b.this, this.f33458a);
            }
        }

        public a(b bVar, f<T> fVar) {
            this(fVar, false);
        }

        @Override // iv.f
        public void a(iv.d<T> dVar, Throwable th2) {
            b.this.f33454a.execute(new RunnableC0619b(th2));
        }

        @Override // iv.f
        public void b(iv.d<T> dVar, x<T> xVar) {
            if (xVar.b() != 403 || xVar.f().get("X-CSRF-TOKEN") == null || this.b) {
                b.this.f33454a.execute(new RunnableC0618a(xVar));
            } else {
                b.this.b.m226clone().F(new a(this.f33455a, true));
            }
        }

        public a(f<T> fVar, boolean z10) {
            this.f33455a = fVar;
            this.b = z10;
        }
    }

    public b(Executor executor, iv.d<T> dVar) {
        this.f33454a = executor;
        this.b = dVar;
    }

    @Override // iv.d
    public void F(f<T> fVar) {
        if (fVar == null) {
            throw new NullPointerException("callback == null");
        }
        this.b.F(new a(this, fVar));
    }

    @Override // iv.d
    public void cancel() {
        this.b.cancel();
    }

    @Override // iv.d
    public x<T> execute() {
        x<T> execute = this.b.execute();
        return (execute.b() != 403 || execute.f().get("X-CSRF-TOKEN") == null) ? execute : this.b.m226clone().execute();
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
    public iv.d<T> m226clone() {
        return new b(this.f33454a, this.b.m226clone());
    }
}
