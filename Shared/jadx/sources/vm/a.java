package vm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f33478g = Logger.getLogger(a.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f33479h = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f33480a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f33481c;

    /* renamed from: d, reason: collision with root package name */
    public b f33482d;

    /* renamed from: e, reason: collision with root package name */
    public b f33483e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f33484f = new byte[16];

    /* renamed from: vm.a$a, reason: collision with other inner class name */
    public class C0620a implements d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f33485a = true;
        public final /* synthetic */ StringBuilder b;

        public C0620a(StringBuilder sb2) {
            this.b = sb2;
        }

        @Override // vm.a.d
        public void a(InputStream inputStream, int i10) {
            if (this.f33485a) {
                this.f33485a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i10);
        }
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f33487c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f33488a;
        public final int b;

        public b(int i10, int i11) {
            this.f33488a = i10;
            this.b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f33488a + ", length = " + this.b + "]";
        }
    }

    public final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public int f33489a;
        public int b;

        public /* synthetic */ c(a aVar, b bVar, C0620a c0620a) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            a.k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            a.this.s(this.f33489a, bArr, i10, i11);
            this.f33489a = a.this.w(this.f33489a + i11);
            this.b -= i11;
            return i11;
        }

        public c(b bVar) {
            this.f33489a = a.this.w(bVar.f33488a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.b == 0) {
                return -1;
            }
            a.this.f33480a.seek(this.f33489a);
            int read = a.this.f33480a.read();
            this.f33489a = a.this.w(this.f33489a + 1);
            this.b--;
            return read;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public a(File file) {
        if (!file.exists()) {
            i(file);
        }
        this.f33480a = l(file);
        n();
    }

    public static void i(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile l10 = l(file2);
        try {
            l10.setLength(4096L);
            l10.seek(0L);
            byte[] bArr = new byte[16];
            z(bArr, 4096, 0, 0, 0);
            l10.write(bArr);
            l10.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            l10.close();
            throw th2;
        }
    }

    public static <T> T k(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile l(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int o(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void y(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void z(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            y(bArr, i10, i11);
            i10 += 4;
        }
    }

    public void d(byte[] bArr) {
        e(bArr, 0, bArr.length);
    }

    public synchronized void e(byte[] bArr, int i10, int i11) {
        int w5;
        try {
            k(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            g(i11);
            boolean j10 = j();
            if (j10) {
                w5 = 16;
            } else {
                b bVar = this.f33483e;
                w5 = w(bVar.f33488a + 4 + bVar.b);
            }
            b bVar2 = new b(w5, i11);
            y(this.f33484f, 0, i11);
            t(bVar2.f33488a, this.f33484f, 0, 4);
            t(bVar2.f33488a + 4, bArr, i10, i11);
            x(this.b, this.f33481c + 1, j10 ? bVar2.f33488a : this.f33482d.f33488a, bVar2.f33488a);
            this.f33483e = bVar2;
            this.f33481c++;
            if (j10) {
                this.f33482d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f() {
        try {
            this.f33480a.seek(0L);
            this.f33480a.write(f33479h);
            x(4096, 0, 0, 0);
            this.f33481c = 0;
            b bVar = b.f33487c;
            this.f33482d = bVar;
            this.f33483e = bVar;
            if (this.b > 4096) {
                u(4096);
            }
            this.b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void g(int i10) {
        int i11 = i10 + 4;
        int p8 = p();
        if (p8 >= i11) {
            return;
        }
        int i12 = this.b;
        do {
            p8 += i12;
            i12 <<= 1;
        } while (p8 < i11);
        u(i12);
        b bVar = this.f33483e;
        int w5 = w(bVar.f33488a + 4 + bVar.b);
        if (w5 <= this.f33482d.f33488a) {
            FileChannel channel = this.f33480a.getChannel();
            channel.position(this.b);
            int i13 = w5 - 16;
            long j10 = i13;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
            r(16, i13);
        }
        int i14 = this.f33483e.f33488a;
        int i15 = this.f33482d.f33488a;
        if (i14 < i15) {
            int i16 = (this.b + i14) - 16;
            x(i12, this.f33481c, i15, i16);
            this.f33483e = new b(i16, this.f33483e.b);
        } else {
            x(i12, this.f33481c, i15, i14);
        }
        this.b = i12;
    }

    public synchronized void h(d dVar) {
        int i10 = this.f33482d.f33488a;
        for (int i11 = 0; i11 < this.f33481c; i11++) {
            b m10 = m(i10);
            dVar.a(new c(this, m10, null), m10.b);
            i10 = w(m10.f33488a + 4 + m10.b);
        }
    }

    public synchronized boolean j() {
        return this.f33481c == 0;
    }

    public final b m(int i10) {
        if (i10 == 0) {
            return b.f33487c;
        }
        s(i10, this.f33484f, 0, 4);
        return new b(i10, o(this.f33484f, 0));
    }

    public final void n() {
        this.f33480a.seek(0L);
        this.f33480a.readFully(this.f33484f);
        int o8 = o(this.f33484f, 0);
        this.b = o8;
        if (o8 > this.f33480a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.f33480a.length());
        }
        if (this.b == 0) {
            throw new IOException("File is corrupt; length stored in header is 0.");
        }
        this.f33481c = o(this.f33484f, 4);
        int o10 = o(this.f33484f, 8);
        int o11 = o(this.f33484f, 12);
        this.f33482d = m(o10);
        this.f33483e = m(o11);
    }

    public final int p() {
        return this.b - v();
    }

    public synchronized void q() {
        try {
            if (j()) {
                throw new NoSuchElementException();
            }
            if (this.f33481c == 1) {
                f();
            } else {
                b bVar = this.f33482d;
                int i10 = bVar.b + 4;
                r(bVar.f33488a, i10);
                int w5 = w(this.f33482d.f33488a + i10);
                s(w5, this.f33484f, 0, 4);
                int o8 = o(this.f33484f, 0);
                x(this.b, this.f33481c - 1, w5, this.f33483e.f33488a);
                this.f33481c--;
                this.f33482d = new b(w5, o8);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r(int i10, int i11) {
        while (i11 > 0) {
            byte[] bArr = f33479h;
            int min = Math.min(i11, bArr.length);
            t(i10, bArr, 0, min);
            i11 -= min;
            i10 += min;
        }
    }

    public final void s(int i10, byte[] bArr, int i11, int i12) {
        int w5 = w(i10);
        int i13 = w5 + i12;
        int i14 = this.b;
        if (i13 <= i14) {
            this.f33480a.seek(w5);
            this.f33480a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - w5;
        this.f33480a.seek(w5);
        this.f33480a.readFully(bArr, i11, i15);
        this.f33480a.seek(16L);
        this.f33480a.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void t(int i10, byte[] bArr, int i11, int i12) {
        int w5 = w(i10);
        int i13 = w5 + i12;
        int i14 = this.b;
        if (i13 <= i14) {
            this.f33480a.seek(w5);
            this.f33480a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - w5;
        this.f33480a.seek(w5);
        this.f33480a.write(bArr, i11, i15);
        this.f33480a.seek(16L);
        this.f33480a.write(bArr, i11 + i15, i12 - i15);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.b);
        sb2.append(", size=");
        sb2.append(this.f33481c);
        sb2.append(", first=");
        sb2.append(this.f33482d);
        sb2.append(", last=");
        sb2.append(this.f33483e);
        sb2.append(", element lengths=[");
        try {
            h(new C0620a(sb2));
        } catch (IOException e10) {
            f33478g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void u(int i10) {
        this.f33480a.setLength(i10);
        this.f33480a.getChannel().force(true);
    }

    public final int v() {
        if (this.f33481c == 0) {
            return 16;
        }
        b bVar = this.f33483e;
        int i10 = bVar.f33488a;
        int i11 = this.f33482d.f33488a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.b + 16 : (((i10 + 4) + bVar.b) + this.b) - i11;
    }

    public final int w(int i10) {
        int i11 = this.b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void x(int i10, int i11, int i12, int i13) {
        z(this.f33484f, i10, i11, i12, i13);
        this.f33480a.seek(0L);
        this.f33480a.write(this.f33484f);
    }
}
