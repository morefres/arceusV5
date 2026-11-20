package i1;

import android.annotation.SuppressLint;
import g0.r1;
import i1.p;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class c0 implements p {

    /* renamed from: g, reason: collision with root package name */
    public final p f20076g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20077h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20078i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20079j;

    /* renamed from: l, reason: collision with root package name */
    public int f20081l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20071a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final Queue<a> f20072c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final Executor f20073d = q0.c.g(q0.c.a());

    /* renamed from: e, reason: collision with root package name */
    public final Object f20074e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a f20075f = null;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f20080k = new AtomicBoolean(false);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20082a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f20083c;

        /* renamed from: d, reason: collision with root package name */
        public long f20084d;

        public a(ByteBuffer byteBuffer, p.c cVar, int i10, int i11) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit == cVar.a()) {
                this.f20082a = i10;
                this.b = i11;
                this.f20083c = byteBuffer;
                this.f20084d = cVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + cVar.a());
        }

        public int a() {
            return this.f20083c.remaining();
        }

        public p.c b(ByteBuffer byteBuffer) {
            int remaining;
            long j10 = this.f20084d;
            int position = this.f20083c.position();
            int position2 = byteBuffer.position();
            if (this.f20083c.remaining() > byteBuffer.remaining()) {
                remaining = byteBuffer.remaining();
                this.f20084d += t.d(t.g(remaining, this.f20082a), this.b);
                ByteBuffer duplicate = this.f20083c.duplicate();
                duplicate.position(position).limit(position + remaining);
                byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
            } else {
                remaining = this.f20083c.remaining();
                byteBuffer.put(this.f20083c).limit(position2 + remaining).position(position2);
            }
            this.f20083c.position(position + remaining);
            return p.c.c(remaining, j10);
        }
    }

    public c0(p pVar, i1.a aVar) {
        this.f20076g = pVar;
        int d10 = aVar.d();
        this.f20077h = d10;
        int e10 = aVar.e();
        this.f20078i = e10;
        x2.g.b(((long) d10) > 0, "mBytesPerFrame must be greater than 0.");
        x2.g.b(((long) e10) > 0, "mSampleRate must be greater than 0.");
        this.f20079j = 500;
        this.f20081l = d10 * 1024;
    }

    public static /* synthetic */ void c(c0 c0Var) {
        c0Var.f20080k.set(false);
        c0Var.f20076g.stop();
        synchronized (c0Var.f20074e) {
            c0Var.f20075f = null;
            c0Var.f20072c.clear();
        }
    }

    public static /* synthetic */ void d(c0 c0Var) {
        c0Var.getClass();
        try {
            c0Var.f20076g.start();
            c0Var.l();
        } catch (p.b e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ void e(c0 c0Var) {
        c0Var.f20080k.set(false);
        c0Var.f20076g.a();
        synchronized (c0Var.f20074e) {
            c0Var.f20075f = null;
            c0Var.f20072c.clear();
        }
    }

    private void i() {
        x2.g.j(!this.b.get(), "AudioStream has been released.");
    }

    private void j() {
        x2.g.j(this.f20071a.get(), "AudioStream has not been started.");
    }

    @Override // i1.p
    public void a() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.f20073d.execute(new Runnable() { // from class: i1.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.e(c0.this);
            }
        });
    }

    @Override // i1.p
    public void b(final p.a aVar, final Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20071a.get(), "AudioStream can not be started when setCallback.");
        i();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20073d.execute(new Runnable() { // from class: i1.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.f20076g.b(aVar, executor);
            }
        });
    }

    public final void k() {
        if (this.f20080k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f20081l);
            a aVar = new a(allocateDirect, this.f20076g.read(allocateDirect), this.f20077h, this.f20078i);
            int i10 = this.f20079j;
            synchronized (this.f20074e) {
                try {
                    this.f20072c.offer(aVar);
                    while (this.f20072c.size() > i10) {
                        this.f20072c.poll();
                        r1.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f20080k.get()) {
                this.f20073d.execute(new Runnable() { // from class: i1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0.this.k();
                    }
                });
            }
        }
    }

    public final void l() {
        if (this.f20080k.getAndSet(true)) {
            return;
        }
        k();
    }

    public final void m(int i10) {
        int i11 = this.f20081l;
        if (i11 == i10) {
            return;
        }
        int i12 = this.f20077h;
        this.f20081l = (i10 / i12) * i12;
        r1.a("BufferedAudioStream", "Update buffer size from " + i11 + " to " + this.f20081l);
    }

    public final void n(final int i10) {
        this.f20073d.execute(new Runnable() { // from class: i1.z
            @Override // java.lang.Runnable
            public final void run() {
                c0.this.m(i10);
            }
        });
    }

    @Override // i1.p
    @SuppressLint({"BanThreadSleep"})
    public p.c read(ByteBuffer byteBuffer) {
        boolean z10;
        i();
        j();
        n(byteBuffer.remaining());
        p.c c10 = p.c.c(0, 0L);
        do {
            synchronized (this.f20074e) {
                try {
                    a aVar = this.f20075f;
                    this.f20075f = null;
                    if (aVar == null) {
                        aVar = this.f20072c.poll();
                    }
                    if (aVar != null) {
                        c10 = aVar.b(byteBuffer);
                        if (aVar.a() > 0) {
                            this.f20075f = aVar;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z10 = c10.a() <= 0 && this.f20071a.get() && !this.b.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    r1.m("BufferedAudioStream", "Interruption while waiting for audio data", e10);
                    return c10;
                }
            }
        } while (z10);
        return c10;
    }

    @Override // i1.p
    public void start() {
        i();
        if (this.f20071a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: i1.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.d(c0.this);
            }
        }, null);
        this.f20073d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f20071a.set(false);
            throw new p.b(e10);
        }
    }

    @Override // i1.p
    public void stop() {
        i();
        if (this.f20071a.getAndSet(false)) {
            this.f20073d.execute(new Runnable() { // from class: i1.w
                @Override // java.lang.Runnable
                public final void run() {
                    c0.c(c0.this);
                }
            });
        }
    }
}
