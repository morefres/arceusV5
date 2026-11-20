package i1;

import g0.r1;
import i1.p;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f20088a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final int f20089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20090d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f20091e;

    /* renamed from: f, reason: collision with root package name */
    public long f20092f;

    /* renamed from: g, reason: collision with root package name */
    public p.a f20093g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f20094h;

    public e0(a aVar) {
        this.f20089c = aVar.d();
        this.f20090d = aVar.e();
    }

    public static void d(long j10) {
        long g10 = j10 - g();
        if (g10 > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(g10));
            } catch (InterruptedException e10) {
                r1.m("SilentAudioStream", "Ignore interruption", e10);
            }
        }
    }

    private void e() {
        x2.g.j(!this.b.get(), "AudioStream has been released.");
    }

    private void f() {
        x2.g.j(this.f20088a.get(), "AudioStream has not been started.");
    }

    public static long g() {
        return System.nanoTime();
    }

    @Override // i1.p
    public void a() {
        this.b.getAndSet(true);
    }

    @Override // i1.p
    public void b(p.a aVar, Executor executor) {
        boolean z10 = true;
        x2.g.j(!this.f20088a.get(), "AudioStream can not be started when setCallback.");
        e();
        if (aVar != null && executor == null) {
            z10 = false;
        }
        x2.g.b(z10, "executor can't be null with non-null callback.");
        this.f20093g = aVar;
        this.f20094h = executor;
    }

    public final void h() {
        final p.a aVar = this.f20093g;
        Executor executor = this.f20094h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: i1.d0
            @Override // java.lang.Runnable
            public final void run() {
                p.a.this.a(true);
            }
        });
    }

    public final void i(ByteBuffer byteBuffer, int i10) {
        x2.g.i(i10 <= byteBuffer.remaining());
        byte[] bArr = this.f20091e;
        if (bArr == null || bArr.length < i10) {
            this.f20091e = new byte[i10];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.f20091e, 0, i10).limit(i10 + position).position(position);
    }

    @Override // i1.p
    public p.c read(ByteBuffer byteBuffer) {
        e();
        f();
        long g10 = t.g(byteBuffer.remaining(), this.f20089c);
        int e10 = (int) t.e(g10, this.f20089c);
        if (e10 <= 0) {
            return p.c.c(0, this.f20092f);
        }
        long d10 = this.f20092f + t.d(g10, this.f20090d);
        d(d10);
        i(byteBuffer, e10);
        p.c c10 = p.c.c(e10, this.f20092f);
        this.f20092f = d10;
        return c10;
    }

    @Override // i1.p
    public void start() {
        e();
        if (this.f20088a.getAndSet(true)) {
            return;
        }
        this.f20092f = g();
        h();
    }

    @Override // i1.p
    public void stop() {
        e();
        this.f20088a.set(false);
    }
}
