package xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wu.m0;
import wu.n0;
import wu.p0;
import wu.q0;
import wu.r0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxu/h;", "Lwu/q0;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "", "cancel", "()V", "", "toString", "()Ljava/lang/String;", ve.a.f33391e, "Ljava/net/Socket;", j6.b.f21518e, "()Ljava/net/Socket;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "closeBits", "Lwu/r0;", "c", "Lwu/r0;", "getSource", "()Lwu/r0;", Payload.SOURCE, "Lwu/p0;", rl.d.f30696a, "Lwu/p0;", "getSink", "()Lwu/p0;", "sink", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h implements q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger closeBits;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 sink;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lxu/h$a;", "Lwu/p0;", "<init>", "(Lxu/h;)V", "Lwu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lwu/e;J)V", "flush", "()V", "close", "Lxu/n;", ve.a.f33391e, "()Lxu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "kotlin.jvm.PlatformType", "Ljava/io/OutputStream;", "outputStream", j6.b.f21518e, "Lxu/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: xu.h$a, reason: from toString */
    public final class sink implements p0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final OutputStream outputStream;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public sink() {
            this.outputStream = h.this.getSocket().getOutputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // wu.p0
        @NotNull
        /* renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // wu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.enter();
            try {
                int a10 = u.a(hVar.closeBits, 1);
                if (a10 != 0) {
                    if (a10 != 3) {
                        if (!hVar.getSocket().isClosed() && !hVar.getSocket().isOutputShutdown()) {
                            this.outputStream.flush();
                            try {
                                hVar.getSocket().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.outputStream.close();
                            }
                        }
                        return;
                    }
                    hVar.getSocket().close();
                    Unit unit = Unit.f22894a;
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!nVar.exit()) {
                    throw e10;
                }
                throw nVar.access$newTimeoutException(e10);
            } finally {
                nVar.exit();
            }
        }

        @Override // wu.p0, java.io.Flushable
        public void flush() {
            n nVar = this.timeout;
            nVar.enter();
            try {
                this.outputStream.flush();
                Unit unit = Unit.f22894a;
                if (nVar.exit()) {
                    throw nVar.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!nVar.exit()) {
                    throw e10;
                }
                throw nVar.access$newTimeoutException(e10);
            } finally {
                nVar.exit();
            }
        }

        @NotNull
        public String toString() {
            return "sink(" + h.this.getSocket() + ')';
        }

        @Override // wu.p0
        public void write(@NotNull wu.e source, long byteCount) {
            Intrinsics.checkNotNullParameter(source, "source");
            wu.b.b(source.getSize(), 0L, byteCount);
            while (byteCount > 0) {
                this.timeout.throwIfReached();
                m0 m0Var = source.head;
                Intrinsics.checkNotNull(m0Var);
                int min = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
                n nVar = this.timeout;
                nVar.enter();
                try {
                    try {
                        this.outputStream.write(m0Var.data, m0Var.pos, min);
                        Unit unit = Unit.f22894a;
                        if (nVar.exit()) {
                            throw nVar.access$newTimeoutException(null);
                        }
                        m0Var.pos += min;
                        long j10 = min;
                        byteCount -= j10;
                        source.U(source.getSize() - j10);
                        if (m0Var.pos == m0Var.limit) {
                            source.head = m0Var.b();
                            n0.b(m0Var);
                        }
                    } catch (IOException e10) {
                        if (!nVar.exit()) {
                            throw e10;
                        }
                        throw nVar.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    nVar.exit();
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxu/h$b;", "Lwu/r0;", "<init>", "(Lxu/h;)V", "Lwu/e;", "sink", "", "byteCount", "read", "(Lwu/e;J)J", "", "close", "()V", "Lxu/n;", ve.a.f33391e, "()Lxu/n;", "", "toString", "()Ljava/lang/String;", "Ljava/io/InputStream;", "kotlin.jvm.PlatformType", "Ljava/io/InputStream;", "inputStream", j6.b.f21518e, "Lxu/n;", "timeout", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: xu.h$b, reason: from toString */
    public final class source implements r0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final InputStream inputStream;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n timeout;

        public source() {
            this.inputStream = h.this.getSocket().getInputStream();
            this.timeout = new n(h.this.getSocket());
        }

        @Override // wu.r0
        @NotNull
        /* renamed from: a, reason: from getter */
        public n getTimeout() {
            return this.timeout;
        }

        @Override // wu.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            n nVar = this.timeout;
            h hVar = h.this;
            nVar.enter();
            try {
                int a10 = u.a(hVar.closeBits, 2);
                if (a10 != 0) {
                    if (a10 == 3) {
                        hVar.getSocket().close();
                    } else {
                        if (hVar.getSocket().isClosed() || hVar.getSocket().isInputShutdown()) {
                            return;
                        }
                        try {
                            hVar.getSocket().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.inputStream.close();
                        }
                    }
                    Unit unit = Unit.f22894a;
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e10) {
                if (!nVar.exit()) {
                    throw e10;
                }
                throw nVar.access$newTimeoutException(e10);
            } finally {
                nVar.exit();
            }
        }

        @Override // wu.r0
        public long read(@NotNull wu.e sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount == 0) {
                return 0L;
            }
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            this.timeout.throwIfReached();
            m0 Y = sink.Y(1);
            int min = (int) Math.min(byteCount, 8192 - Y.limit);
            try {
                n nVar = this.timeout;
                nVar.enter();
                try {
                    int read = this.inputStream.read(Y.data, Y.limit, min);
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(null);
                    }
                    if (read != -1) {
                        Y.limit += read;
                        long j10 = read;
                        sink.U(sink.getSize() + j10);
                        return j10;
                    }
                    if (Y.pos != Y.limit) {
                        return -1L;
                    }
                    sink.head = Y.b();
                    n0.b(Y);
                    return -1L;
                } catch (IOException e10) {
                    if (nVar.exit()) {
                        throw nVar.access$newTimeoutException(e10);
                    }
                    throw e10;
                } finally {
                    nVar.exit();
                }
            } catch (AssertionError e11) {
                if (v.b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        @NotNull
        public String toString() {
            return "source(" + h.this.getSocket() + ')';
        }
    }

    public h(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.socket = socket;
        this.closeBits = new AtomicInteger();
        this.source = new source();
        this.sink = new sink();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // wu.q0
    public void cancel() {
        this.socket.close();
    }

    @Override // wu.q0
    @NotNull
    public p0 getSink() {
        return this.sink;
    }

    @Override // wu.q0
    @NotNull
    public r0 getSource() {
        return this.source;
    }

    @NotNull
    public String toString() {
        String socket = this.socket.toString();
        Intrinsics.checkNotNullExpressionValue(socket, "toString(...)");
        return socket;
    }
}
