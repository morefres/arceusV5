package p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f28207e = StandardCharsets.US_ASCII;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f28208f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f28209g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f28210h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final int f28211a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28212c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f28213d;

    public h(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static h a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f28207e);
        return new h(1, bytes.length, bytes);
    }

    public static h b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new h(12, dArr.length, wrap.array());
    }

    public static h c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new h(9, iArr.length, wrap.array());
    }

    public static h d(n[] nVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[10] * nVarArr.length]);
        wrap.order(byteOrder);
        for (n nVar : nVarArr) {
            wrap.putInt((int) nVar.b());
            wrap.putInt((int) nVar.a());
        }
        return new h(10, nVarArr.length, wrap.array());
    }

    public static h e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f28207e);
        return new h(2, bytes.length, bytes);
    }

    public static h f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static h g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new h(4, jArr.length, wrap.array());
    }

    public static h h(n[] nVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[5] * nVarArr.length]);
        wrap.order(byteOrder);
        for (n nVar : nVarArr) {
            wrap.putInt((int) nVar.b());
            wrap.putInt((int) nVar.a());
        }
        return new h(5, nVarArr.length, wrap.array());
    }

    public static h i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f28209g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new h(3, iArr.length, wrap.array());
    }

    public int j() {
        return f28209g[this.f28211a] * this.b;
    }

    public String toString() {
        return "(" + f28208f[this.f28211a] + ", data length:" + this.f28213d.length + ")";
    }

    public h(int i10, int i11, long j10, byte[] bArr) {
        this.f28211a = i10;
        this.b = i11;
        this.f28212c = j10;
        this.f28213d = bArr;
    }
}
