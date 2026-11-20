package r;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f30016c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public static final Executor f30017d = new Executor() { // from class: r.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Executor f30018e = new Executor() { // from class: r.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public e f30019a;

    @NonNull
    public final e b;

    public c() {
        d dVar = new d();
        this.b = dVar;
        this.f30019a = dVar;
    }

    @NonNull
    public static Executor f() {
        return f30018e;
    }

    @NonNull
    public static c g() {
        if (f30016c != null) {
            return f30016c;
        }
        synchronized (c.class) {
            try {
                if (f30016c == null) {
                    f30016c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f30016c;
    }

    @Override // r.e
    public void a(@NonNull Runnable runnable) {
        this.f30019a.a(runnable);
    }

    @Override // r.e
    public boolean b() {
        return this.f30019a.b();
    }

    @Override // r.e
    public void c(@NonNull Runnable runnable) {
        this.f30019a.c(runnable);
    }
}
