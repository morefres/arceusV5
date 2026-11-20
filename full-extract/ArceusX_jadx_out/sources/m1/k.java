package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import y1.c;

/* loaded from: classes.dex */
public class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f24179a;
    public final MediaCodec.BufferInfo b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24180c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f24181d;

    /* renamed from: e, reason: collision with root package name */
    public final ne.x<Void> f24182e;

    /* renamed from: f, reason: collision with root package name */
    public final c.a<Void> f24183f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f24184g = new AtomicBoolean(false);

    public k(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f24179a = (MediaCodec) x2.g.g(mediaCodec);
        this.f24180c = i10;
        this.f24181d = mediaCodec.getOutputBuffer(i10);
        this.b = (MediaCodec.BufferInfo) x2.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24182e = y1.c.a(new c.InterfaceC0669c() { // from class: m1.j
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return k.a(atomicReference, aVar);
            }
        });
        this.f24183f = (c.a) x2.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public ne.x<Void> b() {
        return r0.n.s(this.f24182e);
    }

    public final void c() {
        if (this.f24184g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        if (this.f24184g.getAndSet(true)) {
            return;
        }
        try {
            this.f24179a.releaseOutputBuffer(this.f24180c, false);
            this.f24183f.c(null);
        } catch (IllegalStateException e10) {
            this.f24183f.f(e10);
        }
    }

    @Override // m1.i
    public long d1() {
        return this.b.presentationTimeUs;
    }

    @Override // m1.i
    public MediaCodec.BufferInfo k0() {
        return this.b;
    }

    @Override // m1.i
    public long size() {
        return this.b.size;
    }

    @Override // m1.i
    public ByteBuffer t() {
        c();
        this.f24181d.position(this.b.offset);
        ByteBuffer byteBuffer = this.f24181d;
        MediaCodec.BufferInfo bufferInfo = this.b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f24181d;
    }

    @Override // m1.i
    public boolean t0() {
        return (this.b.flags & 1) != 0;
    }
}
