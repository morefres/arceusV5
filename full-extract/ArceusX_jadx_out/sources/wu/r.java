package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001b\u0010\u001a\u001a\u00060\u0017j\u0002`\u00188\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lwu/r;", "Lwu/p0;", "sink", "<init>", "(Lwu/p0;)V", "Lwu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lwu/e;J)V", "flush", "()V", "Lwu/s0;", "timeout", "()Lwu/s0;", "close", j6.b.f21518e, "buffer", ve.a.f33391e, "Lwu/k0;", "Lwu/k0;", "Ljava/util/zip/Deflater;", "Lokio/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lwu/i;", "c", "Lwu/i;", "deflaterSink", "", rl.d.f30696a, "Z", "closed", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r implements p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final buffer sink;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Deflater deflater;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeflaterSink deflaterSink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CRC32 crc;

    public r(@NotNull p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        buffer bufferVar = new buffer(sink);
        this.sink = bufferVar;
        Deflater deflater = new Deflater(xu.w.b(), true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((f) bufferVar, deflater);
        this.crc = new CRC32();
        e eVar = bufferVar.bufferField;
        eVar.writeShort(8075);
        eVar.writeByte(8);
        eVar.writeByte(0);
        eVar.writeInt(0);
        eVar.writeByte(0);
        eVar.writeByte(0);
    }

    public final void a(e buffer, long byteCount) {
        m0 m0Var = buffer.head;
        Intrinsics.checkNotNull(m0Var);
        while (byteCount > 0) {
            int min = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.crc.update(m0Var.data, m0Var.pos, min);
            byteCount -= min;
            m0Var = m0Var.next;
            Intrinsics.checkNotNull(m0Var);
        }
    }

    public final void b() {
        this.sink.a((int) this.crc.getValue());
        this.sink.a((int) this.deflater.getBytesRead());
    }

    @Override // wu.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.b();
            b();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // wu.p0, java.io.Flushable
    public void flush() {
        this.deflaterSink.flush();
    }

    @Override // wu.p0
    @NotNull
    /* renamed from: timeout */
    public s0 getTimeout() {
        return this.sink.getTimeout();
    }

    @Override // wu.p0
    public void write(@NotNull e source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        a(source, byteCount);
        this.deflaterSink.write(source, byteCount);
    }
}
