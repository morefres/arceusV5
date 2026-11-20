package com.github.luben.zstd;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ZstdCompressCtx extends AutoCloseBase {
    private long nativePtr;
    private ZstdDictCompress compression_dict = null;
    private SequenceProducer seqprod = null;
    private long seqprod_state = 0;

    static {
        Native.load();
    }

    public ZstdCompressCtx() {
        this.nativePtr = 0L;
        long init = init();
        this.nativePtr = init;
        if (0 == init) {
            throw new IllegalStateException("ZSTD_createCompressCtx failed");
        }
        storeFence();
    }

    private static native long compressByteArray0(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private static native long compressDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long compressDirectByteBufferStream0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Compression context is closed");
        }
    }

    private static native void free(long j10);

    private static native ZstdFrameProgression getFrameProgression0(long j10);

    private static native long init();

    private native long loadCDict0(long j10, byte[] bArr);

    private native long loadCDictFast0(long j10, ZstdDictCompress zstdDictCompress);

    private static native long reset0(long j10);

    private static native void setChecksum0(long j10, boolean z10);

    private static native void setContentSize0(long j10, boolean z10);

    private static native void setDictID0(long j10, boolean z10);

    private static native void setLevel0(long j10, int i10);

    private static native long setPledgedSrcSize0(long j10, long j11);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int compressDirectByteBuffer = compressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + compressDirectByteBuffer);
        return compressDirectByteBuffer;
    }

    public int compressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        Objects.checkFromIndexSize(i12, i13, bArr2.length);
        Objects.checkFromIndexSize(i10, i11, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long compressByteArray0 = compressByteArray0(this.nativePtr, bArr, i10, i11, bArr2, i12, i13);
            if (Zstd.isError(compressByteArray0)) {
                throw new ZstdException(compressByteArray0);
            }
            if (compressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) compressByteArray0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public int compressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        ensureOpen();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i12, i13, byteBuffer2.limit());
        Objects.checkFromIndexSize(i10, i11, byteBuffer.limit());
        acquireSharedLock();
        try {
            long compressDirectByteBuffer0 = compressDirectByteBuffer0(this.nativePtr, byteBuffer, i10, i11, byteBuffer2, i12, i13);
            if (Zstd.isError(compressDirectByteBuffer0)) {
                throw new ZstdException(compressDirectByteBuffer0);
            }
            if (compressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) compressDirectByteBuffer0;
            releaseSharedLock();
            return i14;
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public boolean compressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, EndDirective endDirective) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressDirectByteBufferStream0 = compressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit(), endDirective.value());
            if ((2147483648L & compressDirectByteBufferStream0) != 0) {
                long j10 = -(compressDirectByteBufferStream0 & 255);
                throw new ZstdException(j10, Zstd.getErrorName(j10));
            }
            byteBuffer2.position((int) (2147483647L & compressDirectByteBufferStream0));
            byteBuffer.position(((int) (compressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
            return (compressDirectByteBufferStream0 >>> 63) == 1;
        } finally {
            releaseSharedLock();
        }
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        long j10 = this.nativePtr;
        if (j10 != 0) {
            free(j10);
            this.nativePtr = 0L;
            SequenceProducer sequenceProducer = this.seqprod;
            if (sequenceProducer != null) {
                sequenceProducer.freeState(this.seqprod_state);
                this.seqprod = null;
            }
        }
    }

    public ZstdFrameProgression getFrameProgression() {
        ensureOpen();
        acquireSharedLock();
        try {
            return getFrameProgression0(this.nativePtr);
        } finally {
            releaseSharedLock();
        }
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public ZstdCompressCtx loadDict(ZstdDictCompress zstdDictCompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictCompress.acquireSharedLock();
        try {
            long loadCDictFast0 = loadCDictFast0(this.nativePtr, zstdDictCompress);
            if (Zstd.isError(loadCDictFast0)) {
                throw new ZstdException(loadCDictFast0);
            }
            this.compression_dict = zstdDictCompress;
            return this;
        } finally {
            zstdDictCompress.releaseSharedLock();
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx registerSequenceProducer(SequenceProducer sequenceProducer) {
        ensureOpen();
        acquireSharedLock();
        try {
            try {
                SequenceProducer sequenceProducer2 = this.seqprod;
                if (sequenceProducer2 != null) {
                    sequenceProducer2.freeState(this.seqprod_state);
                    this.seqprod = null;
                }
                if (sequenceProducer == null) {
                    Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                } else {
                    long createState = sequenceProducer.createState();
                    this.seqprod_state = createState;
                    Zstd.registerSequenceProducer(this.nativePtr, createState, sequenceProducer.getFunctionPointer());
                    this.seqprod = sequenceProducer;
                }
                releaseSharedLock();
                return this;
            } catch (Exception e10) {
                this.seqprod = null;
                Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                throw e10;
            }
        } catch (Throwable th2) {
            releaseSharedLock();
            throw th2;
        }
    }

    public void reset() {
        ensureOpen();
        acquireSharedLock();
        try {
            long reset0 = reset0(this.nativePtr);
            if (Zstd.isError(reset0)) {
                throw new ZstdException(reset0);
            }
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setChainLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionChainLog = Zstd.setCompressionChainLog(this.nativePtr, i10);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdException(compressionChainLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setChecksum(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setChecksum0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setContentSize(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setContentSize0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setDictID(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        setDictID0(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setEnableLongDistanceMatching(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long enableLongDistanceMatching = Zstd.setEnableLongDistanceMatching(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(enableLongDistanceMatching)) {
                throw new ZstdException(enableLongDistanceMatching);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setHashLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionHashLog = Zstd.setCompressionHashLog(this.nativePtr, i10);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdException(compressionHashLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setJobSize(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionJobSize = Zstd.setCompressionJobSize(this.nativePtr, i10);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdException(compressionJobSize);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setLevel(int i10) {
        ensureOpen();
        acquireSharedLock();
        setLevel0(this.nativePtr, i10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setLong(int i10) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionLong(this.nativePtr, i10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMagicless(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionMagicless(this.nativePtr, z10);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMinMatch(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.nativePtr, i10);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdException(compressionMinMatch);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setOverlapLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.nativePtr, i10);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdException(compressionOverlapLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public void setPledgedSrcSize(long j10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long pledgedSrcSize0 = setPledgedSrcSize0(this.nativePtr, j10);
            if (Zstd.isError(pledgedSrcSize0)) {
                throw new ZstdException(pledgedSrcSize0);
            }
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setSearchForExternalRepcodes(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long searchForExternalRepcodes = Zstd.setSearchForExternalRepcodes(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(searchForExternalRepcodes)) {
                throw new ZstdException(searchForExternalRepcodes);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setSearchLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.nativePtr, i10);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdException(compressionSearchLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setSequenceProducerFallback(boolean z10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long sequenceProducerFallback = Zstd.setSequenceProducerFallback(this.nativePtr, z10);
            if (Zstd.isError(sequenceProducerFallback)) {
                throw new ZstdException(sequenceProducerFallback);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setStrategy(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionStrategy = Zstd.setCompressionStrategy(this.nativePtr, i10);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdException(compressionStrategy);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setTargetLength(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.nativePtr, i10);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdException(compressionTargetLength);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setValidateSequences(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long validateSequences = Zstd.setValidateSequences(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(validateSequences)) {
                throw new ZstdException(validateSequences);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setWindowLog(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.nativePtr, i10);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdException(compressionWindowLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setWorkers(int i10) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWorkers = Zstd.setCompressionWorkers(this.nativePtr, i10);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdException(compressionWorkers);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ByteBuffer compress(ByteBuffer byteBuffer) {
        long compressBound = Zstd.compressBound(byteBuffer.limit() - byteBuffer.position());
        if (compressBound <= 2147483647L) {
            int i10 = (int) compressBound;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
            int compressDirectByteBuffer = compressDirectByteBuffer(allocateDirect, 0, i10, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
            byteBuffer.position(byteBuffer.limit());
            allocateDirect.limit(compressDirectByteBuffer);
            return allocateDirect;
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }

    public ZstdCompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long loadCDict0 = loadCDict0(this.nativePtr, bArr);
            if (!Zstd.isError(loadCDict0)) {
                this.compression_dict = null;
                return this;
            }
            throw new ZstdException(loadCDict0);
        } finally {
            releaseSharedLock();
        }
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] compress(byte[] bArr) {
        long compressBound = Zstd.compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            int i10 = (int) compressBound;
            byte[] bArr2 = new byte[i10];
            return Arrays.copyOfRange(bArr2, 0, compressByteArray(bArr2, 0, i10, bArr, 0, bArr.length));
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }
}
