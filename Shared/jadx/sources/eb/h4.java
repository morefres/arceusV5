package eb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class h4 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f15792a;
    public g4 b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f15793c = new byte[8];

    /* renamed from: d, reason: collision with root package name */
    public final i4 f15794d = i4.a();

    public h4(InputStream inputStream) {
        this.f15792a = inputStream;
    }

    public final long a() {
        l(Byte.MIN_VALUE);
        j();
        long h10 = h();
        if (h10 < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (h10 > 0) {
            this.f15794d.g(h10);
        }
        return h10;
    }

    public final long b() {
        boolean z10;
        d();
        if (this.b.b() == 0) {
            z10 = true;
        } else {
            if (this.b.b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.b.c())));
            }
            z10 = false;
        }
        long h10 = h();
        if (h10 >= 0) {
            return z10 ? h10 : ~h10;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    public final long c() {
        l((byte) -96);
        j();
        long h10 = h();
        if (h10 < 0 || h10 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (h10 > 0) {
            this.f15794d.g(h10 + h10);
        }
        return h10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15792a.close();
        this.f15794d.b();
    }

    public final g4 d() {
        if (this.b == null) {
            int read = this.f15792a.read();
            if (read == -1) {
                this.f15794d.b();
                return null;
            }
            g4 g4Var = new g4(read);
            this.b = g4Var;
            byte b = g4Var.b();
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            this.f15794d.e(-1L);
                        } else {
                            if (b != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.b.c())));
                            }
                            this.f15794d.e(-2L);
                        }
                        this.f15794d.f();
                    }
                } else if (this.b.a() == 31) {
                    this.f15794d.c();
                }
            }
            this.f15794d.d();
            this.f15794d.f();
        }
        return this.b;
    }

    public final String e() {
        l((byte) 96);
        return new String(n(), StandardCharsets.UTF_8);
    }

    public final boolean f() {
        l((byte) -32);
        if (this.b.a() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int h10 = (int) h();
        if (h10 == 20) {
            return false;
        }
        if (h10 == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] g() {
        l((byte) 64);
        return n();
    }

    public final long h() {
        if (this.b.a() < 24) {
            long a10 = this.b.a();
            this.b = null;
            return a10;
        }
        if (this.b.a() == 24) {
            int read = this.f15792a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.b = null;
            return read & 255;
        }
        if (this.b.a() == 25) {
            m(this.f15793c, 2);
            byte[] bArr = this.f15793c;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.b.a() == 26) {
            m(this.f15793c, 4);
            byte[] bArr2 = this.f15793c;
            long j10 = bArr2[0];
            long j11 = bArr2[1];
            return (bArr2[3] & 255) | ((j11 & 255) << 16) | ((j10 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.b.a() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.b.a()), Integer.valueOf(this.b.c())));
        }
        m(this.f15793c, 8);
        byte[] bArr3 = this.f15793c;
        long j12 = bArr3[0];
        long j13 = bArr3[1];
        long j14 = bArr3[2];
        long j15 = bArr3[3];
        return (bArr3[7] & 255) | ((j14 & 255) << 40) | ((j12 & 255) << 56) | ((j13 & 255) << 48) | ((j15 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    public final void j() {
        d();
        if (this.b.a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.b.a())));
        }
    }

    public final void l(byte b) {
        d();
        if (this.b.b() != b) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b >> 5) & 7), Integer.valueOf(this.b.c())));
        }
    }

    public final void m(byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f15792a.read(bArr, i11, i10 - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
        this.b = null;
    }

    public final byte[] n() {
        j();
        long h10 = h();
        if (h10 < 0 || h10 > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.f15792a.available() < h10) {
            throw new EOFException();
        }
        int i10 = (int) h10;
        byte[] bArr = new byte[i10];
        m(bArr, i10);
        return bArr;
    }
}
