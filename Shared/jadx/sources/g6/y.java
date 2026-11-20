package g6;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class y implements h6.a {
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f18388c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f18387a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final Object f18389d = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final y f18390a;
        public final Runnable b;

        public a(y yVar, Runnable runnable) {
            this.f18390a = yVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
                synchronized (this.f18390a.f18389d) {
                    this.f18390a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f18390a.f18389d) {
                    this.f18390a.b();
                    throw th2;
                }
            }
        }
    }

    public y(Executor executor) {
        this.b = executor;
    }

    public void b() {
        a poll = this.f18387a.poll();
        this.f18388c = poll;
        if (poll != null) {
            this.b.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f18389d) {
            try {
                this.f18387a.add(new a(this, runnable));
                if (this.f18388c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
