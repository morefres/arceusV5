package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1ySDK extends FilterInputStream {
    private final int AFKeystoreWrapper;
    private final int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private final int f5505d;

    /* renamed from: e, reason: collision with root package name */
    private int f5506e;
    private long[] force;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f5507i;
    private int registerClient;
    private long[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private short f5508v;

    /* renamed from: w, reason: collision with root package name */
    private int f5509w;

    public AFk1ySDK(InputStream inputStream, int i10, int i11, short s8, int i12, int i13) {
        this(inputStream, i10, i11, s8, i12, i13, (byte) 0);
    }

    private int AFKeystoreWrapper() {
        int i10;
        if (this.f5506e == Integer.MAX_VALUE) {
            this.f5506e = ((FilterInputStream) this).in.read();
        }
        if (this.f5509w == this.AFKeystoreWrapper) {
            byte[] bArr = this.f5507i;
            int i11 = this.f5506e;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.f5507i, i12, this.AFKeystoreWrapper - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < this.AFKeystoreWrapper);
            if (i12 < this.AFKeystoreWrapper) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.AFLogger;
            if (i13 == this.f5505d) {
                unregisterClient();
            } else {
                if (this.registerClient <= i13) {
                    unregisterClient();
                }
                int i14 = this.registerClient;
                if (i14 < this.f5505d) {
                    this.registerClient = i14 + 1;
                } else {
                    this.registerClient = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.f5506e = read2;
            this.f5509w = 0;
            if (read2 < 0) {
                int i15 = this.AFKeystoreWrapper;
                i10 = i15 - (this.f5507i[i15 - 1] & 255);
            } else {
                i10 = this.AFKeystoreWrapper;
            }
            this.afInfoLog = i10;
        }
        return this.afInfoLog;
    }

    private void unregisterClient() {
        long[] jArr = this.unregisterClient;
        long[] jArr2 = this.force;
        short s8 = this.f5508v;
        long j10 = jArr[s8 % 4] * 2147483085;
        long j11 = jArr2[(s8 + 2) % 4];
        int i10 = (s8 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.AFKeystoreWrapper; i11++) {
            this.f5507i[i11] = (byte) (r1[i11] ^ ((this.unregisterClient[this.f5508v] >> (i11 << 3)) & 255));
        }
        this.f5508v = (short) ((this.f5508v + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFKeystoreWrapper();
        return this.afInfoLog - this.f5509w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFKeystoreWrapper();
        int i10 = this.f5509w;
        if (i10 >= this.afInfoLog) {
            return -1;
        }
        byte[] bArr = this.f5507i;
        this.f5509w = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1ySDK(InputStream inputStream, int i10, int i11, short s8, int i12, int i13, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.registerClient = 1;
        this.f5506e = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s8, 4), 8);
        this.AFKeystoreWrapper = min;
        this.f5507i = new byte[min];
        this.unregisterClient = new long[4];
        this.force = new long[4];
        this.f5509w = min;
        this.afInfoLog = min;
        this.unregisterClient = AFk1wSDK.AFKeystoreWrapper(i10 ^ i13, min ^ i13);
        this.force = AFk1wSDK.AFKeystoreWrapper(i11 ^ i13, i12 ^ i13);
        this.AFLogger = 100;
        this.f5505d = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFKeystoreWrapper();
            int i14 = this.f5509w;
            if (i14 >= this.afInfoLog) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.f5507i;
            this.f5509w = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
