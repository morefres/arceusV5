package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.DeflaterSink;
import wu.e;
import wu.h;
import wu.p0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lwu/e;", "Lwu/h;", "suffix", "endsWith", "(Lwu/e;Lwu/h;)Z", "buffer", "", "deflate", "(Lwu/e;)V", "close", "()V", "Z", "deflatedBytes", "Lwu/e;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lwu/i;", "deflaterSink", "Lwu/i;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {

    @NotNull
    private final e deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final DeflaterSink deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        e eVar = new e();
        this.deflatedBytes = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((p0) eVar, deflater);
    }

    private final boolean endsWith(e eVar, h hVar) {
        return eVar.b1(eVar.getSize() - hVar.I(), hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull e buffer) {
        h hVar;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.getSize() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.getSize());
        this.deflaterSink.flush();
        e eVar = this.deflatedBytes;
        hVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(eVar, hVar)) {
            long size = this.deflatedBytes.getSize() - 4;
            e.a w5 = e.w(this.deflatedBytes, null, 1, null);
            try {
                w5.c(size);
                tt.c.a(w5, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        e eVar2 = this.deflatedBytes;
        buffer.write(eVar2, eVar2.getSize());
    }
}
