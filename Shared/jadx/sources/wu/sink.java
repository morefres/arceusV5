package wu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwu/g0;", "Lwu/p0;", "Ljava/io/OutputStream;", "out", "Lwu/s0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lwu/s0;)V", "Lwu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lwu/e;J)V", "flush", "()V", "close", "()Lwu/s0;", "", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/io/OutputStream;", j6.b.f21518e, "Lwu/s0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: wu.g0, reason: from toString */
/* loaded from: classes2.dex */
public final class sink implements p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OutputStream out;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s0 timeout;

    public sink(@NotNull OutputStream out, @NotNull s0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // wu.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // wu.p0, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // wu.p0
    @NotNull
    /* renamed from: timeout, reason: from getter */
    public s0 getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // wu.p0
    public void write(@NotNull e source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.throwIfReached();
            m0 m0Var = source.head;
            Intrinsics.checkNotNull(m0Var);
            int min = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.out.write(m0Var.data, m0Var.pos, min);
            m0Var.pos += min;
            long j10 = min;
            byteCount -= j10;
            source.U(source.getSize() - j10);
            if (m0Var.pos == m0Var.limit) {
                source.head = m0Var.b();
                n0.b(m0Var);
            }
        }
    }
}
