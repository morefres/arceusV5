package m1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import y1.c;

/* loaded from: classes.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24104a;
    public final MediaCodec.BufferInfo b;

    /* renamed from: c, reason: collision with root package name */
    public final ne.x<Void> f24105c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a<Void> f24106d;

    public g(i iVar) {
        this.b = c(iVar);
        this.f24104a = b(iVar);
        final AtomicReference atomicReference = new AtomicReference();
        this.f24105c = y1.c.a(new c.InterfaceC0669c() { // from class: m1.f
            @Override // y1.c.InterfaceC0669c
            public final Object a(c.a aVar) {
                return g.a(atomicReference, aVar);
            }
        });
        this.f24106d = (c.a) x2.g.g((c.a) atomicReference.get());
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "Data closed";
    }

    public final ByteBuffer b(i iVar) {
        ByteBuffer t8 = iVar.t();
        MediaCodec.BufferInfo k02 = iVar.k0();
        t8.position(k02.offset);
        t8.limit(k02.offset + k02.size);
        ByteBuffer allocate = ByteBuffer.allocate(k02.size);
        allocate.order(t8.order());
        allocate.put(t8);
        allocate.flip();
        return allocate;
    }

    public final MediaCodec.BufferInfo c(i iVar) {
        MediaCodec.BufferInfo k02 = iVar.k0();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, k02.size, k02.presentationTimeUs, k02.flags);
        return bufferInfo;
    }

    @Override // m1.i, java.lang.AutoCloseable
    public void close() {
        this.f24106d.c(null);
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
        return this.f24104a;
    }

    @Override // m1.i
    public boolean t0() {
        return (this.b.flags & 1) != 0;
    }
}
