package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2944a;

    @NonNull
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final g.f<T> f2945c;

    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final Object f2946d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public static Executor f2947e;

        /* renamed from: a, reason: collision with root package name */
        public Executor f2948a;
        public Executor b;

        /* renamed from: c, reason: collision with root package name */
        public final g.f<T> f2949c;

        public a(@NonNull g.f<T> fVar) {
            this.f2949c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.b == null) {
                synchronized (f2946d) {
                    try {
                        if (f2947e == null) {
                            f2947e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.b = f2947e;
            }
            return new c<>(this.f2948a, this.b, this.f2949c);
        }
    }

    public c(Executor executor, @NonNull Executor executor2, @NonNull g.f<T> fVar) {
        this.f2944a = executor;
        this.b = executor2;
        this.f2945c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.b;
    }

    @NonNull
    public g.f<T> b() {
        return this.f2945c;
    }

    public Executor c() {
        return this.f2944a;
    }
}
