package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    private int level;
    private final long stream;
    private ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i10) {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.target = byteBuffer;
        this.level = i10;
        this.stream = createCStream();
    }

    private native long compressDirectByteBuffer(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long createCStream();

    private native long endStream(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private native long flushStream(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private static native long freeCStream(long j10);

    private native long initCStream(long j10, int i10);

    private native long initCStreamWithDict(long j10, byte[] bArr, int i10, int i11);

    private native long initCStreamWithFastDict(long j10, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long endStream;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                do {
                    long j10 = this.stream;
                    ByteBuffer byteBuffer = this.target;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    try {
                        endStream = zstdDirectBufferCompressingStreamNoFinalizer.endStream(j10, byteBuffer, byteBuffer.position(), this.target.remaining());
                        if (Zstd.isError(endStream)) {
                            throw new ZstdIOException(endStream);
                        }
                        ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
                        byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
                        ByteBuffer flushBuffer = flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                        zstdDirectBufferCompressingStreamNoFinalizer.target = flushBuffer;
                        if (!flushBuffer.isDirect()) {
                            throw new IllegalArgumentException("Target buffer should be a direct buffer");
                        }
                        if (endStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                            throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
                        zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
                        zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
                        zstdDirectBufferCompressingStreamNoFinalizer.target = null;
                        throw th;
                    }
                } while (endStream > 0);
            } else {
                zstdDirectBufferCompressingStreamNoFinalizer = this;
            }
            freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
            zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
            zstdDirectBufferCompressingStreamNoFinalizer.target = null;
        } catch (Throwable th3) {
            th = th3;
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        }
    }

    public void compress(ByteBuffer byteBuffer) {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long initCStream;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.initialized) {
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        } else {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                zstdDictCompress.acquireSharedLock();
                try {
                    long initCStreamWithFastDict = initCStreamWithFastDict(this.stream, zstdDictCompress);
                    zstdDictCompress.releaseSharedLock();
                    initCStream = initCStreamWithFastDict;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                } catch (Throwable th2) {
                    zstdDictCompress.releaseSharedLock();
                    throw th2;
                }
            } else {
                byte[] bArr = this.dict;
                if (bArr != null) {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    initCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStreamWithDict(this.stream, bArr, bArr.length, this.level);
                } else {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    initCStream = initCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream, zstdDirectBufferCompressingStreamNoFinalizer.level);
                }
            }
            if (Zstd.isError(initCStream)) {
                throw new ZstdIOException(initCStream);
            }
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                ByteBuffer flushBuffer = flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                zstdDirectBufferCompressingStreamNoFinalizer.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j10 = zstdDirectBufferCompressingStreamNoFinalizer.stream;
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            ByteBuffer byteBuffer3 = byteBuffer;
            long compressDirectByteBuffer = zstdDirectBufferCompressingStreamNoFinalizer.compressDirectByteBuffer(j10, byteBuffer2, byteBuffer2.position(), zstdDirectBufferCompressingStreamNoFinalizer.target.remaining(), byteBuffer3, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(compressDirectByteBuffer)) {
                throw new ZstdIOException(compressDirectByteBuffer);
            }
            ByteBuffer byteBuffer4 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            byteBuffer4.position(byteBuffer4.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            byteBuffer3.position(byteBuffer3.position() + zstdDirectBufferCompressingStreamNoFinalizer.consumed);
            byteBuffer = byteBuffer3;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        long flushStream;
        if (this.closed) {
            throw new IOException("Already closed");
        }
        if (this.initialized) {
            do {
                long j10 = this.stream;
                ByteBuffer byteBuffer = this.target;
                flushStream = flushStream(j10, byteBuffer, byteBuffer.position(), this.target.remaining());
                if (Zstd.isError(flushStream)) {
                    throw new ZstdIOException(flushStream);
                }
                ByteBuffer byteBuffer2 = this.target;
                byteBuffer2.position(byteBuffer2.position() + this.produced);
                ByteBuffer flushBuffer = flushBuffer(this.target);
                this.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (flushStream > 0 && !this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            } while (flushStream > 0);
        }
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (this.initialized) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.dict = bArr;
        this.fastDict = null;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new IllegalStateException("Change of parameter on initialized stream");
    }
}
