package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private final int AFLoggerLogLevel;
    private final byte[] afDebugLog;
    private int afErrorLog;
    private final int afInfoLog;
    private int afWarnLog;

    /* renamed from: e, reason: collision with root package name */
    private final int f5499e;
    private final byte[] force;
    private int getEntries;
    private int getLevel;

    /* renamed from: i, reason: collision with root package name */
    private final byte[][] f5500i;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f5501v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f5502w;
    private static final byte[] AFLogger = AFk1xSDK.registerClient;
    private static final int[] unregisterClient = AFk1xSDK.f5503d;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5498d = AFk1xSDK.unregisterClient;
    private static final int[] registerClient = AFk1xSDK.AFKeystoreWrapper;
    private static final int[] AFKeystoreWrapper = AFk1xSDK.AFLogger;

    public AFk1vSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i10, bArr, bArr2, (byte) 0);
    }

    private void registerClient(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f5502w;
        boolean z10 = true;
        char c10 = 2;
        char c11 = '\b';
        char c12 = 3;
        int i10 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f5501v;
        iArr[0] = i10 ^ iArr2[0];
        char c13 = 5;
        char c14 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c15 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i11 = 1;
        int i12 = 4;
        while (i11 < this.f5499e) {
            int[] iArr3 = unregisterClient;
            int[] iArr4 = this.f5502w;
            boolean z11 = z10;
            byte[][] bArr3 = this.f5500i;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = f5498d;
            byte[] bArr5 = bArr3[z11 ? 1 : 0];
            char c16 = c10;
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = registerClient;
            byte[] bArr6 = bArr3[c16];
            char c17 = c12;
            int i15 = i14 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFKeystoreWrapper;
            byte[] bArr7 = bArr3[c17];
            char c18 = c11;
            int i16 = i15 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.f5501v;
            int i17 = i16 ^ iArr8[i12];
            char c19 = c15;
            char c20 = c13;
            int i18 = (((iArr3[iArr4[bArr4[z11 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z11 ? 1 : 0]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[z11 ? 1 : 0]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[z11 ? 1 : 0]] & 255]) ^ iArr8[i12 + 1];
            int i19 = (((iArr3[iArr4[bArr4[c16]] >>> 24] ^ iArr5[(iArr4[bArr5[c16]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c16]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c16]] & 255]) ^ iArr8[i12 + 2];
            int i20 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i12 + 3];
            iArr4[0] = i17;
            iArr4[z11 ? 1 : 0] = i18;
            iArr4[c16] = i19;
            iArr4[c17] = i20;
            i11++;
            i12 += 4;
            z10 = z11 ? 1 : 0;
            c10 = c16;
            c12 = c17;
            c11 = c18;
            c13 = c20;
            c15 = c19;
            c14 = c14;
        }
        boolean z12 = z10;
        char c21 = c10;
        char c22 = c12;
        char c23 = c11;
        char c24 = c15;
        int[] iArr9 = this.f5501v;
        int i21 = iArr9[i12];
        byte[] bArr8 = AFLogger;
        int[] iArr10 = this.f5502w;
        byte[][] bArr9 = this.f5500i;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i21 >>> 24));
        byte[] bArr11 = bArr9[z12 ? 1 : 0];
        bArr2[z12 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i21 >>> 16));
        byte[] bArr12 = bArr9[c21];
        bArr2[c21] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i21 >>> 8));
        byte[] bArr13 = bArr9[c22];
        bArr2[c22] = (byte) (i21 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i22 = iArr9[i12 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z12 ? 1 : 0]] >>> 24] ^ (i22 >>> 24));
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr11[z12 ? 1 : 0]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr12[z12 ? 1 : 0]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[7] = (byte) (i22 ^ bArr8[iArr10[bArr13[z12 ? 1 : 0]] & 255]);
        int i23 = iArr9[i12 + 2];
        bArr2[c23] = (byte) (bArr8[iArr10[bArr10[c21]] >>> 24] ^ (i23 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c21]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c21]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[11] = (byte) (i23 ^ bArr8[iArr10[bArr13[c21]] & 255]);
        int i24 = iArr9[i12 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c22]] >>> 24] ^ (i24 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c22]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c24] = (byte) (bArr8[(iArr10[bArr12[c22]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[15] = (byte) (i24 ^ bArr8[iArr10[bArr13[c22]] & 255]);
    }

    private int unregisterClient() {
        if (this.afErrorLog == Integer.MAX_VALUE) {
            this.afErrorLog = ((FilterInputStream) this).in.read();
        }
        if (this.getLevel == 16) {
            byte[] bArr = this.force;
            int i10 = this.afErrorLog;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.force, i11, 16 - i11);
                if (read <= 0) {
                    break;
                }
                i11 += read;
            } while (i11 < 16);
            if (i11 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.AFLoggerLogLevel;
            if (i12 == this.afInfoLog) {
                registerClient(this.force, this.afDebugLog);
            } else {
                if (this.afWarnLog <= i12) {
                    registerClient(this.force, this.afDebugLog);
                } else {
                    byte[] bArr2 = this.force;
                    System.arraycopy(bArr2, 0, this.afDebugLog, 0, bArr2.length);
                }
                int i13 = this.afWarnLog;
                if (i13 < this.afInfoLog) {
                    this.afWarnLog = i13 + 1;
                } else {
                    this.afWarnLog = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.afErrorLog = read2;
            this.getLevel = 0;
            this.getEntries = read2 < 0 ? 16 - (this.afDebugLog[15] & 255) : 16;
        }
        return this.getEntries;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        unregisterClient();
        return this.getEntries - this.getLevel;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        unregisterClient();
        int i10 = this.getLevel;
        if (i10 >= this.getEntries) {
            return -1;
        }
        byte[] bArr = this.afDebugLog;
        this.getLevel = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1vSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f5502w = new int[4];
        this.force = new byte[16];
        this.afDebugLog = new byte[16];
        this.afWarnLog = 1;
        this.afErrorLog = Integer.MAX_VALUE;
        this.getLevel = 16;
        this.getEntries = 16;
        this.f5499e = i10;
        this.f5501v = AFk1xSDK.AFLogger(bArr, i10);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            bArr3[i11] = new byte[bArr2[i11].length];
            int i12 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i11];
                if (i12 < bArr4.length) {
                    bArr3[i11][bArr4[i12]] = (byte) i12;
                    i12++;
                }
            }
        }
        this.f5500i = bArr3;
        this.AFLoggerLogLevel = 100;
        this.afInfoLog = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            unregisterClient();
            int i14 = this.getLevel;
            if (i14 >= this.getEntries) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.afDebugLog;
            this.getLevel = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
