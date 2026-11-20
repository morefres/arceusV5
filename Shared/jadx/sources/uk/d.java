package uk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Deque<Runnable> f32987a = new ArrayDeque();
    public final ScheduledExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f32988c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32989d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f32990a;

        public a(Runnable runnable) {
            this.f32990a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32990a.run();
            } finally {
                d.this.c();
            }
        }
    }

    public d(Executor executor, int i10) {
        this.b = (ScheduledExecutorService) executor;
        this.f32989d = i10;
    }

    public final synchronized void c() {
        Runnable poll = this.f32987a.poll();
        this.f32988c = poll;
        if (poll != null) {
            this.b.schedule(poll, this.f32989d, TimeUnit.MILLISECONDS);
            this.f32987a.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f32987a.addFirst(new a(runnable));
        if (this.f32988c == null) {
            c();
        }
    }
}
