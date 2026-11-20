package okhttp3;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.io.EOFException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wu.b0;
import wu.e;
import wu.f0;
import wu.g;
import wu.h;
import wu.r0;
import wu.s0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lwu/g;", Payload.SOURCE, "", "boundary", "<init>", "(Lwu/g;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", Payload.RESPONSE, "(Lokhttp3/ResponseBody;)V", "", "maxByteCount", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "close", "()V", "Lwu/g;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lwu/h;", "dashDashBoundary", "Lwu/h;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final f0 afterBoundaryOptions;

    @NotNull
    private final String boundary;
    private boolean closed;

    @NotNull
    private final h crlfDashDashBoundary;

    @Nullable
    private PartSource currentPart;

    @NotNull
    private final h dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @NotNull
    private final g source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lwu/f0;", "afterBoundaryOptions", "Lwu/f0;", "getAfterBoundaryOptions", "()Lwu/f0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lwu/g;", "body", "<init>", "(Lokhttp3/Headers;Lwu/g;)V", "", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lwu/g;", "()Lwu/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Part implements Closeable {

        @NotNull
        private final g body;

        @NotNull
        private final Headers headers;

        public Part(@NotNull Headers headers, @NotNull g body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @NotNull
        /* renamed from: body, reason: from getter */
        public final g getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @NotNull
        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lwu/r0;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "Lwu/e;", "sink", "", "byteCount", "read", "(Lwu/e;J)J", "Lwu/s0;", "timeout", "()Lwu/s0;", "Lwu/s0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class PartSource implements r0 {

        @NotNull
        private final s0 timeout = new s0();

        public PartSource() {
        }

        @Override // wu.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.c(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // wu.r0
        public long read(@NotNull e sink, long byteCount) {
            long j10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!Intrinsics.c(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            s0 timeout = MultipartReader.this.source.getTimeout();
            s0 s0Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            long a10 = s0.INSTANCE.a(s0Var.getTimeoutNanos(), timeout.getTimeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(a10, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (s0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(s0Var.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    long read = currentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, currentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (s0Var.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th2) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (s0Var.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th2;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (s0Var.getHasDeadline()) {
                j10 = 0;
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), s0Var.deadlineNanoTime()));
            } else {
                j10 = 0;
            }
            try {
                long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                long read2 = currentPartBytesRemaining2 == j10 ? -1L : multipartReader.source.read(sink, currentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (s0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th3) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (s0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th3;
            }
        }

        @Override // wu.r0
        @NotNull
        /* renamed from: timeout, reason: from getter */
        public s0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        f0.Companion companion = f0.INSTANCE;
        h.Companion companion2 = h.INSTANCE;
        afterBoundaryOptions = companion.d(companion2.d("\r\n"), companion2.d("--"), companion2.d(" "), companion2.d("\t"));
    }

    public MultipartReader(@NotNull g source, @NotNull String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new e().A0("--").A0(boundary).G2();
        this.crlfDashDashBoundary = new e().A0("\r\n--").A0(boundary).G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxByteCount) {
        long min = Math.min(this.source.getBufferField().getSize(), maxByteCount) + 1;
        long g22 = this.source.g2(this.crlfDashDashBoundary, 0L, min);
        if (g22 != -1) {
            return g22;
        }
        if (this.source.getBufferField().getSize() >= min) {
            return Math.min(min, maxByteCount);
        }
        throw new EOFException();
    }

    @NotNull
    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Nullable
    public final Part nextPart() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.b1(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.I());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.I());
        }
        boolean z10 = false;
        while (true) {
            int y02 = this.source.y0(afterBoundaryOptions);
            if (y02 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (y02 == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, b0.c(partSource));
            }
            if (y02 == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (y02 == 2 || y02 == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(@org.jetbrains.annotations.NotNull okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            wu.g r0 = r3.getBodySource()
            okhttp3.MediaType r3 = r3.getMediaType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
