package wu;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H$¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0013H$¢\u0006\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010-\u001a\u00060'j\u0002`(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lwu/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lwu/e;", "sink", "byteCount", "j", "(JLwu/e;J)J", "size", "()J", "Lwu/r0;", "l", "(J)Lwu/r0;", "", "close", "()V", "", "array", "", "arrayOffset", "g", "(J[BII)I", "h", "f", ve.a.f33391e, "Z", "getReadWrite", "()Z", j6.b.f21518e, "closed", "c", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", rl.d.f30696a, "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class j implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean readWrite;

    /* renamed from: b, reason: from kotlin metadata */
    public boolean closed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int openStreamCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = v0.b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lwu/j$a;", "Lwu/r0;", "Lwu/j;", "fileHandle", "", "position", "<init>", "(Lwu/j;J)V", "Lwu/e;", "sink", "byteCount", "read", "(Lwu/e;J)J", "Lwu/s0;", "timeout", "()Lwu/s0;", "", "close", "()V", ve.a.f33391e, "Lwu/j;", "getFileHandle", "()Lwu/j;", j6.b.f21518e, "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j fileHandle;

        /* renamed from: b, reason: from kotlin metadata */
        public long position;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public a(@NotNull j fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j10;
        }

        @Override // wu.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                j jVar = this.fileHandle;
                jVar.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.f22894a;
                    lock.unlock();
                    this.fileHandle.f();
                }
            } finally {
                lock.unlock();
            }
        }

        @Override // wu.r0
        public long read(@NotNull e sink, long byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.fileHandle.j(this.position, sink, byteCount);
            if (j10 != -1) {
                this.position += j10;
            }
            return j10;
        }

        @Override // wu.r0
        @NotNull
        public s0 timeout() {
            return s0.NONE;
        }
    }

    public j(boolean z10) {
        this.readWrite = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            Unit unit = Unit.f22894a;
            reentrantLock.unlock();
            f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public abstract void f();

    public abstract int g(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount);

    public abstract long h();

    public final long j(long fileOffset, e sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j10 = byteCount + fileOffset;
        long j11 = fileOffset;
        while (true) {
            if (j11 >= j10) {
                break;
            }
            m0 Y = sink.Y(1);
            int g10 = g(j11, Y.data, Y.limit, (int) Math.min(j10 - j11, 8192 - r7));
            if (g10 == -1) {
                if (Y.pos == Y.limit) {
                    sink.head = Y.b();
                    n0.b(Y);
                }
                if (fileOffset == j11) {
                    return -1L;
                }
            } else {
                Y.limit += g10;
                long j12 = g10;
                j11 += j12;
                sink.U(sink.getSize() + j12);
            }
        }
        return j11 - fileOffset;
    }

    @NotNull
    public final r0 l(long fileOffset) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f22894a;
            reentrantLock.unlock();
            return h();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
