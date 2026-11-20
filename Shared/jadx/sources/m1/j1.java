package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y1.c;

/* loaded from: classes.dex */
public class j1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f24172a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f24173c;

    /* renamed from: d, reason: collision with root package name */
    public final ne.x<Void> f24174d;

    /* renamed from: e, reason: collision with root package name */
    public final c.a<Void> f24175e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24176f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public long f24177g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24178h = false;

    public j1(MediaCodec mediaCodec, int i10) {
        this.f24172a = (MediaCodec) x2.g.g(mediaCodec);
        this.b = x2.g.d(i10);
        this.f24173c = mediaCodec.getInputBuffer(i10);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24174d = y1.c.a(new c.InterfaceC0669c() { // from class: m1.i1
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return j1.e(atomicReference, aVar);
            }
        });
        this.f24175e = (c.a) x2.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object e(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // m1.h1
    public void a(boolean z10) {
        f();
        this.f24178h = z10;
    }

    @Override // m1.h1
    public boolean b() {
        if (this.f24176f.getAndSet(true)) {
            return false;
        }
        try {
            this.f24172a.queueInputBuffer(this.b, this.f24173c.position(), this.f24173c.limit(), this.f24177g, this.f24178h ? 4 : 0);
            this.f24175e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f24175e.f(e10);
            return false;
        }
    }

    @Override // m1.h1
    public void c(long j10) {
        f();
        x2.g.a(j10 >= 0);
        this.f24177g = j10;
    }

    @Override // m1.h1
    public boolean cancel() {
        if (this.f24176f.getAndSet(true)) {
            return false;
        }
        try {
            this.f24172a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            this.f24175e.c(null);
        } catch (IllegalStateException e10) {
            this.f24175e.f(e10);
        }
        return true;
    }

    @Override // m1.h1
    public ne.x<Void> d() {
        return r0.n.s(this.f24174d);
    }

    public final void f() {
        if (this.f24176f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // m1.h1
    public ByteBuffer t() {
        f();
        return this.f24173c;
    }
}
