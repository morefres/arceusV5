package p0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f28195a;
    public ByteOrder b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f28195a = outputStream;
        this.b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.b = byteOrder;
    }

    public void b(int i10) {
        this.f28195a.write(i10);
    }

    public void c(int i10) {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f28195a.write(i10 & 255);
            this.f28195a.write((i10 >>> 8) & 255);
            this.f28195a.write((i10 >>> 16) & 255);
            this.f28195a.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f28195a.write((i10 >>> 24) & 255);
            this.f28195a.write((i10 >>> 16) & 255);
            this.f28195a.write((i10 >>> 8) & 255);
            this.f28195a.write(i10 & 255);
        }
    }

    public void d(short s8) {
        ByteOrder byteOrder = this.b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f28195a.write(s8 & 255);
            this.f28195a.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f28195a.write((s8 >>> 8) & 255);
            this.f28195a.write(s8 & 255);
        }
    }

    public void e(long j10) {
        c((int) j10);
    }

    public void f(int i10) {
        d((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f28195a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f28195a.write(bArr, i10, i11);
    }
}
