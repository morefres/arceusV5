package c4;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import backtraceio.library.anr.BacktraceANRSettings;
import c4.b;
import com.google.mlkit.common.MlKitException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class a {
    public static final SimpleDateFormat V;
    public static final SimpleDateFormat W;

    /* renamed from: a0, reason: collision with root package name */
    public static final e[] f4608a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final e[] f4609b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final e[] f4610c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final e[] f4611d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final e[] f4612e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final e f4613f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final e[] f4614g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final e[] f4615h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final e[] f4616i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final e[] f4617j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final e[][] f4618k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final e[] f4619l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final HashMap<Integer, e>[] f4620m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final HashMap<String, e>[] f4621n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final Set<String> f4622o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f4623p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final Charset f4624q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final byte[] f4625r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final byte[] f4626s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f4627t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f4628u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f4629v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final Pattern f4631w0;

    /* renamed from: a, reason: collision with root package name */
    public String f4635a;
    public FileDescriptor b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f4636c;

    /* renamed from: d, reason: collision with root package name */
    public int f4637d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4638e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f4639f;

    /* renamed from: g, reason: collision with root package name */
    public Set<Integer> f4640g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f4641h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4642i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4643j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4644k;

    /* renamed from: l, reason: collision with root package name */
    public int f4645l;

    /* renamed from: m, reason: collision with root package name */
    public int f4646m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f4647n;

    /* renamed from: o, reason: collision with root package name */
    public int f4648o;

    /* renamed from: p, reason: collision with root package name */
    public int f4649p;

    /* renamed from: q, reason: collision with root package name */
    public int f4650q;

    /* renamed from: r, reason: collision with root package name */
    public int f4651r;

    /* renamed from: s, reason: collision with root package name */
    public int f4652s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4653t;

    /* renamed from: u, reason: collision with root package name */
    public d f4654u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4655v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f4630w = Log.isLoggable("ExifInterface", 3);

    /* renamed from: x, reason: collision with root package name */
    public static final List<Integer> f4632x = Arrays.asList(1, 6, 3, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final List<Integer> f4633y = Arrays.asList(2, 7, 4, 5);

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4634z = {8, 8, 8};
    public static final int[] A = {4};
    public static final int[] B = {8};
    public static final byte[] C = {-1, -40, -1};
    public static final byte[] D = {102, 116, 121, 112};
    public static final byte[] E = {109, 105, 102, 49};
    public static final byte[] F = {104, 101, 105, 99};
    public static final byte[] G = {97, 118, 105, 102};
    public static final byte[] H = {97, 118, 105, 115};
    public static final byte[] I = {79, 76, 89, 77, 80, 0};
    public static final byte[] J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] K = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] M = {82, 73, 70, 70};
    public static final byte[] N = {87, 69, 66, 80};
    public static final byte[] O = {69, 88, 73, 70};
    public static final byte[] P = {-99, 1, 42};
    public static final byte[] Q = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] S = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] T = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] U = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public class C0095a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        public long f4656a;
        public final /* synthetic */ g b;

        public C0095a(g gVar) {
            this.b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f4656a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.b.available()) {
                        return -1;
                    }
                    this.b.g(j10);
                    this.f4656a = j10;
                }
                if (i11 > this.b.available()) {
                    i11 = this.b.available();
                }
                int read = this.b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f4656a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f4656a = -1L;
            return -1;
        }
    }

    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final DataOutputStream f4662a;
        public ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4662a = new DataOutputStream(outputStream);
            this.b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void b(int i10) {
            this.f4662a.write(i10);
        }

        public void c(int i10) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4662a.write(i10 & 255);
                this.f4662a.write((i10 >>> 8) & 255);
                this.f4662a.write((i10 >>> 16) & 255);
                this.f4662a.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4662a.write((i10 >>> 24) & 255);
                this.f4662a.write((i10 >>> 16) & 255);
                this.f4662a.write((i10 >>> 8) & 255);
                this.f4662a.write(i10 & 255);
            }
        }

        public void d(short s8) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4662a.write(s8 & 255);
                this.f4662a.write((s8 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f4662a.write((s8 >>> 8) & 255);
                this.f4662a.write(s8 & 255);
            }
        }

        public void e(long j10) {
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            c((int) j10);
        }

        public void f(int i10) {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f4662a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f4662a.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f4663a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4664c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f4665d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f4624q0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4669a);
                wrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f4624q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4669a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o8 = o(byteOrder);
            if (o8 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o8 instanceof String) {
                return Double.parseDouble((String) o8);
            }
            if (o8 instanceof long[]) {
                if (((long[]) o8).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o8 instanceof int[]) {
                if (((int[]) o8).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o8 instanceof double[]) {
                double[] dArr = (double[]) o8;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o8 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o8;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o8 = o(byteOrder);
            if (o8 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o8 instanceof String) {
                return Integer.parseInt((String) o8);
            }
            if (o8 instanceof long[]) {
                long[] jArr = (long[]) o8;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o8 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o8;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o8 = o(byteOrder);
            if (o8 == null) {
                return null;
            }
            if (o8 instanceof String) {
                return (String) o8;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o8 instanceof long[]) {
                long[] jArr = (long[]) o8;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o8 instanceof int[]) {
                int[] iArr = (int[]) o8;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o8 instanceof double[]) {
                double[] dArr = (double[]) o8;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(o8 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o8;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f4669a);
                sb2.append('/');
                sb2.append(fVarArr[i10].b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:110:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:119:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v21, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v23, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v25, types: [c4.a$f[]] */
        /* JADX WARN: Type inference failed for: r13v27, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v29, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v31, types: [c4.a$f[]] */
        /* JADX WARN: Type inference failed for: r13v33, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v36, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o(java.nio.ByteOrder r13) {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c4.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.Y[this.f4663a] * this.b;
        }

        public String toString() {
            return "(" + a.X[this.f4663a] + ", data length:" + this.f4665d.length + ")";
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f4663a = i10;
            this.b = i11;
            this.f4664c = j10;
            this.f4665d = bArr;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f4669a;
        public final long b;

        public /* synthetic */ f(long j10, long j11, C0095a c0095a) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                return new f(d10 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double abs = Math.abs(d10);
            long j13 = 0;
            long j14 = 1;
            double d11 = abs;
            long j15 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j16 = (long) (d11 - d12);
                j10 = j15 + (j16 * j12);
                j11 = (j16 * j13) + j14;
                d11 = 1.0d / d12;
                long j17 = j12;
                if (Math.abs(abs - (j10 / j11)) <= 1.0E-8d * abs) {
                    break;
                }
                j14 = j13;
                j12 = j10;
                j15 = j17;
                j13 = j11;
            }
            if (d10 < 0.0d) {
                j10 = -j10;
            }
            return new f(j10, j11);
        }

        public double a() {
            return this.f4669a / this.b;
        }

        public String toString() {
            return this.f4669a + "/" + this.b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f4669a = 0L;
                this.b = 1L;
            } else {
                this.f4669a = j10;
                this.b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", InputDeviceCompat.SOURCE_KEYBOARD, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f4608a0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4609b0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f4610c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f4611d0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", InputDeviceCompat.SOURCE_KEYBOARD, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", InputDeviceCompat.SOURCE_DPAD, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4612e0 = eVarArr5;
        f4613f0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f4614g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", InputDeviceCompat.SOURCE_KEYBOARD, 4), new e("PreviewImageLength", 258, 4)};
        f4615h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f4616i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f4617j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f4618k0 = eVarArr10;
        f4619l0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f4620m0 = new HashMap[eVarArr10.length];
        f4621n0 = new HashMap[eVarArr10.length];
        f4622o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f4623p0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f4624q0 = forName;
        f4625r0 = "Exif\u0000\u0000".getBytes(forName);
        f4626s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f4618k0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> hashMap = f4623p0;
                e[] eVarArr12 = f4619l0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f4666a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f4666a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f4666a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f4666a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f4666a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f4666a), 8);
                f4627t0 = Pattern.compile(".*[1-9].*");
                f4628u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4629v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4631w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4620m0[i10] = new HashMap<>();
            f4621n0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f4620m0[i10].put(Integer.valueOf(eVar.f4666a), eVar);
                f4621n0[i10].put(eVar.b, eVar);
            }
            i10++;
        }
    }

    public a(String str) {
        e[][] eVarArr = f4618k0;
        this.f4639f = new HashMap[eVarArr.length];
        this.f4640g = new HashSet(eVarArr.length);
        this.f4641h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        G(str);
    }

    public static int C(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    public static Pair<Integer, Integer> D(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> D2 = D(split[0]);
            if (((Integer) D2.first).intValue() == 2) {
                return D2;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> D3 = D(split[i10]);
                int intValue = (((Integer) D3.first).equals(D2.first) || ((Integer) D3.second).equals(D2.first)) ? ((Integer) D2.first).intValue() : -1;
                int intValue2 = (((Integer) D2.second).intValue() == -1 || !(((Integer) D3.first).equals(D2.second) || ((Integer) D3.second).equals(D2.second))) ? -1 : ((Integer) D2.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    D2 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    D2 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return D2;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static boolean J(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean O(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f4630w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean Q(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    public static double g(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static boolean l0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static void n0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] A() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f4642i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f4647n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f4636c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            c4.b.b(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.f4635a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.f4635a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            c4.a$b r4 = new c4.a$b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f4645l     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.f4649p     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.f(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f4646m     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.f4647n = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            c4.b.b(r1)
            if (r3 == 0) goto L76
            c4.b.a(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            c4.b.b(r1)
            if (r3 == 0) goto L8f
            c4.b.a(r3)
        L8f:
            return r2
        L90:
            c4.b.b(r2)
            if (r3 == 0) goto L98
            c4.b.a(r3)
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.A():byte[]");
    }

    public final void B(b bVar) {
        if (f4630w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(M.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = N;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(O, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f4625r0;
                    if (c4.b.f(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f4649p = i10;
                    X(bArr3, 0);
                    k0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(readInt2);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void E(b bVar, HashMap<String, d> hashMap) {
        d dVar = hashMap.get("JPEGInterchangeFormat");
        d dVar2 = hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m10 = dVar.m(this.f4641h);
        int m11 = dVar2.m(this.f4641h);
        if (this.f4637d == 7) {
            m10 += this.f4650q;
        }
        if (m10 > 0 && m11 > 0) {
            this.f4642i = true;
            if (this.f4635a == null && this.f4636c == null && this.b == null) {
                byte[] bArr = new byte[m11];
                bVar.f(m10);
                bVar.readFully(bArr);
                this.f4647n = bArr;
            }
            this.f4645l = m10;
            this.f4646m = m11;
        }
        if (f4630w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
        }
    }

    public final void F(b bVar, HashMap<String, d> hashMap) {
        int i10;
        d dVar = hashMap.get("StripOffsets");
        d dVar2 = hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] c10 = c4.b.c(dVar.o(this.f4641h));
        long[] c11 = c4.b.c(dVar2.o(this.f4641h));
        if (c10 == null || c10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c11 == null || c11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c10.length != c11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : c11) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f4644k = true;
        this.f4643j = true;
        this.f4642i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < c10.length) {
            int i16 = (int) c10[i13];
            int i17 = (int) c11[i13];
            if (i13 < c10.length - i12) {
                i10 = i13;
                if (i16 + i17 != c10[i10 + 1]) {
                    this.f4644k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.f(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f4647n = bArr;
        if (this.f4644k) {
            this.f4645l = (int) c10[0];
            this.f4646m = i11;
        }
    }

    public final void G(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f4636c = null;
        this.f4635a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (O(fileInputStream.getFD())) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            T(fileInputStream);
            c4.b.b(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            c4.b.b(fileInputStream2);
            throw th;
        }
    }

    public boolean H() {
        int m10 = m("Orientation", 1);
        return m10 == 2 || m10 == 7 || m10 == 4 || m10 == 5;
    }

    public final int I(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (f4630w) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, D)) {
            bVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return 0;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            try {
                bVar.readFully(bArr3);
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, E)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, F)) {
                        z11 = true;
                    } else if (Arrays.equals(bArr3, G) || Arrays.equals(bArr3, H)) {
                        z12 = true;
                    }
                    if (!z10) {
                        continue;
                    } else {
                        if (z11) {
                            bVar.close();
                            return 12;
                        }
                        if (z12) {
                            bVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return 0;
            }
        }
        bVar.close();
        return 0;
    }

    public final boolean K(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder W2 = W(bVar2);
                this.f4641h = W2;
                bVar2.e(W2);
                short readShort = bVar2.readShort();
                boolean z10 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean L(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean M(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean N(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder W2 = W(bVar2);
                this.f4641h = W2;
                bVar2.e(W2);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean P(HashMap<String, d> hashMap) {
        d dVar;
        int m10;
        d dVar2 = hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f4641h);
            int[] iArr2 = f4634z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4637d == 3 && (dVar = hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f4641h)) == 1 && Arrays.equals(iArr, B)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f4630w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean R(HashMap<String, d> hashMap) {
        d dVar = hashMap.get("ImageLength");
        d dVar2 = hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f4641h) <= 512 && dVar2.m(this.f4641h) <= 512;
    }

    public final boolean S(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x001c, B:9:0x0020, B:10:0x002e, B:12:0x0036, B:14:0x003f, B:22:0x0071, B:28:0x0050, B:35:0x005e, B:38:0x0066, B:39:0x006a, B:40:0x006e, B:41:0x007b, B:43:0x0085, B:46:0x008d, B:49:0x0095, B:52:0x009d, B:61:0x00ab, B:63:0x00af), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            c4.a$e[][] r2 = c4.a.f4618k0     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 >= r2) goto L1c
            java.util.HashMap<java.lang.String, c4.a$d>[] r2 = r4.f4639f     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2[r1] = r3     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r1 = r1 + 1
            goto L2
        L13:
            r5 = move-exception
            goto Lbf
        L16:
            r5 = move-exception
            goto Lab
        L19:
            r5 = move-exception
            goto Lab
        L1c:
            boolean r1 = r4.f4638e     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 != 0) goto L2e
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.r(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.f4637d = r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r5 = r1
        L2e:
            int r1 = r4.f4637d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r1 = l0(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 == 0) goto L7b
            c4.a$g r0 = new c4.a$g     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r5 = r4.f4638e     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 == 0) goto L50
            boolean r5 = r4.y(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 != 0) goto L71
            r4.e()
            boolean r5 = c4.a.f4630w
            if (r5 == 0) goto Lbe
            r4.V()
            return
        L50:
            int r5 = r4.f4637d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1 = 12
            if (r5 == r1) goto L6e
            r1 = 15
            if (r5 != r1) goto L5b
            goto L6e
        L5b:
            r1 = 7
            if (r5 != r1) goto L62
            r4.s(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L62:
            r1 = 10
            if (r5 != r1) goto L6a
            r4.x(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6a:
            r4.v(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6e:
            r4.o(r0, r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        L71:
            int r5 = r4.f4649p     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.g(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.k0(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L7b:
            c4.a$b r1 = new c4.a$b     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.f4637d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 4
            if (r5 != r2) goto L89
            r4.p(r1, r0, r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L89:
            r0 = 13
            if (r5 != r0) goto L91
            r4.t(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L91:
            r0 = 9
            if (r5 != r0) goto L99
            r4.u(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L99:
            r0 = 14
            if (r5 != r0) goto La0
            r4.B(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        La0:
            r4.e()
            boolean r5 = c4.a.f4630w
            if (r5 == 0) goto Lbe
            r4.V()
            return
        Lab:
            boolean r0 = c4.a.f4630w     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lb6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L13
        Lb6:
            r4.e()
            if (r0 == 0) goto Lbe
            r4.V()
        Lbe:
            return
        Lbf:
            r4.e()
            boolean r0 = c4.a.f4630w
            if (r0 == 0) goto Lc9
            r4.V()
        Lc9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.T(java.io.InputStream):void");
    }

    public final void U(b bVar) {
        ByteOrder W2 = W(bVar);
        this.f4641h = W2;
        bVar.e(W2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f4637d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.f(i11);
        }
    }

    public final void V() {
        for (int i10 = 0; i10 < this.f4639f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f4639f[i10].size());
            for (Map.Entry<String, d> entry : this.f4639f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f4641h) + "'");
            }
        }
    }

    public final ByteOrder W(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f4630w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f4630w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void X(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        U(gVar);
        Y(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(c4.a.g r26, int r27) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.Y(c4.a$g, int):void");
    }

    public final void Z(String str) {
        for (int i10 = 0; i10 < f4618k0.length; i10++) {
            this.f4639f[i10].remove(str);
        }
    }

    public final void a0(int i10, String str, String str2) {
        if (this.f4639f[i10].isEmpty() || this.f4639f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f4639f[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f4639f[i10].remove(str);
    }

    public final void b0(g gVar, int i10) {
        d dVar = this.f4639f[i10].get("ImageLength");
        d dVar2 = this.f4639f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f4639f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f4639f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m10 = dVar3.m(this.f4641h);
            int m11 = dVar3.m(this.f4641h);
            gVar.g(m10);
            byte[] bArr = new byte[m11];
            gVar.readFully(bArr);
            p(new b(bArr), m10, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.c0():void");
    }

    public final void d0(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        if (f4630w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        cVar.b(-1);
        cVar.b(-31);
        this.f4649p = q0(cVar);
        if (this.f4654u != null) {
            cVar.write(-1);
            cVar.b(-31);
            byte[] bArr2 = f4626s0;
            cVar.f(bArr2.length + 2 + this.f4654u.f4665d.length);
            cVar.write(bArr2);
            cVar.write(this.f4654u.f4665d);
            this.f4655v = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                c4.b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.f(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr3, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr3, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i11 = readUnsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = f4626s0;
                if (i11 >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f4625r0;
                    bArr = i11 >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (c4.b.f(bArr, f4625r0) || c4.b.f(bArr, bArr4)) {
                        bVar.f(i11 - bArr.length);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.f(readUnsignedShort2);
                if (bArr != null) {
                    i11 -= bArr.length;
                    cVar.write(bArr);
                }
                while (i11 > 0) {
                    int read2 = bVar.read(bArr3, 0, Math.min(i11, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr3, 0, read2);
                        i11 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void e() {
        String k10 = k("DateTimeOriginal");
        if (k10 != null && k("DateTime") == null) {
            this.f4639f[0].put("DateTime", d.e(k10));
        }
        if (k("ImageWidth") == null) {
            this.f4639f[0].put("ImageWidth", d.f(0L, this.f4641h));
        }
        if (k("ImageLength") == null) {
            this.f4639f[0].put("ImageLength", d.f(0L, this.f4641h));
        }
        if (k("Orientation") == null) {
            this.f4639f[0].put("Orientation", d.f(0L, this.f4641h));
        }
        if (k("LightSource") == null) {
            this.f4639f[1].put("LightSource", d.f(0L, this.f4641h));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0078 -> B:9:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = c4.a.f4630w
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L27:
            c4.a$b r0 = new c4.a$b
            r0.<init>(r9)
            c4.a$c r9 = new c4.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = c4.a.K
            int r10 = r10.length
            c4.b.e(r0, r9, r10)
            c4.a$d r10 = r8.f4654u
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L43
            boolean r10 = r8.f4655v
            if (r10 == 0) goto L78
        L43:
            r10 = r1
        L44:
            if (r1 != 0) goto L4d
            if (r10 == 0) goto L49
            goto L4d
        L49:
            c4.b.d(r0, r9)
            return
        L4d:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L7a
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            c4.b.e(r0, r9, r3)
            int r3 = r8.f4649p
            if (r3 != 0) goto L6d
            r8.r0(r9)
            r1 = r2
        L6d:
            c4.a$d r3 = r8.f4654u
            if (r3 == 0) goto L44
            boolean r3 = r8.f4655v
            if (r3 != 0) goto L44
            r8.s0(r9)
        L78:
            r10 = r2
            goto L44
        L7a:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L8b
            if (r1 == 0) goto L8b
            r8.r0(r9)
            int r3 = r3 + 4
            r0.f(r3)
            r1 = r2
            goto L44
        L8b:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lbd
            byte[] r5 = c4.a.L
            int r6 = r5.length
            if (r3 < r6) goto Lbd
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lb0
            c4.a$d r10 = r8.f4654u
            if (r10 == 0) goto Lac
            r8.s0(r9)
        Lac:
            r0.f(r6)
            goto L78
        Lb0:
            r9.c(r3)
            r9.c(r4)
            r9.write(r7)
            c4.b.e(r0, r9, r6)
            goto L44
        Lbd:
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            c4.b.e(r0, r9, r3)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.e0(java.io.InputStream, java.io.OutputStream):void");
    }

    public final String f(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0213 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:9:0x004f, B:11:0x005b, B:13:0x006f, B:14:0x0071, B:17:0x01f7, B:19:0x0213, B:20:0x021c, B:24:0x0086, B:26:0x0095, B:28:0x009d, B:29:0x00a1, B:32:0x00b1, B:34:0x00bc, B:35:0x00c1, B:37:0x00c3, B:42:0x00d1, B:40:0x00d6, B:45:0x00da, B:47:0x00e6, B:49:0x00ee, B:53:0x00fc, B:55:0x0104, B:57:0x010b, B:59:0x011a, B:61:0x012a, B:62:0x0186, B:64:0x0192, B:65:0x0199, B:67:0x01d3, B:69:0x01f0, B:70:0x01e1, B:72:0x01e9, B:73:0x013e, B:74:0x0145, B:75:0x0146, B:77:0x0150, B:79:0x0156, B:82:0x016f, B:84:0x0177, B:85:0x017e), top: B:8:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(java.io.InputStream r22, java.io.OutputStream r23) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.f0(java.io.InputStream, java.io.OutputStream):void");
    }

    public void g0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        h0("GPSAltitude", f.b(Math.abs(d10)).toString());
        h0("GPSAltitudeRef", str);
    }

    public final void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public void h0(String str, String str2) {
        e eVar;
        int i10;
        String str3;
        int i11;
        int i12;
        String str4 = str;
        String str5 = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f4630w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i13 = 2;
        String str6 = "/";
        int i14 = 1;
        if (str5 != null) {
            if (f4622o0.contains(str4) && !str5.contains("/")) {
                try {
                    str5 = f.b(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f4628u0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean find = f4629v0.matcher(str5).find();
                boolean find2 = f4631w0.matcher(str5).find();
                if (str5.length() != 19 || (!find && !find2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                if (find2) {
                    str5 = str5.replaceAll("-", ":");
                }
            }
        }
        int i15 = 0;
        if ("Xmp".equals(str4)) {
            boolean z10 = this.f4639f[0].containsKey("Xmp") || this.f4639f[5].containsKey("Xmp");
            int C2 = C(this.f4637d);
            if ((C2 == 2 && (this.f4654u != null || !z10)) || (C2 == 3 && !z10)) {
                this.f4654u = str5 != null ? d.a(str5) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < f4618k0.length) {
            if ((i16 != 4 || this.f4642i) && (eVar = f4621n0[i16].get(str4)) != null) {
                if (str5 == null) {
                    this.f4639f[i16].remove(str4);
                } else {
                    Pair<Integer, Integer> D2 = D(str5);
                    if (eVar.f4667c == ((Integer) D2.first).intValue() || eVar.f4667c == ((Integer) D2.second).intValue()) {
                        i10 = eVar.f4667c;
                    } else {
                        int i17 = eVar.f4668d;
                        if (i17 == -1 || !(i17 == ((Integer) D2.first).intValue() || eVar.f4668d == ((Integer) D2.second).intValue())) {
                            int i18 = eVar.f4667c;
                            if (i18 == i14 || i18 == 7 || i18 == i13) {
                                i10 = i18;
                            } else if (f4630w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = X;
                                sb2.append(strArr[eVar.f4667c]);
                                sb2.append(eVar.f4668d == -1 ? "" : ", " + strArr[eVar.f4668d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) D2.first).intValue()]);
                                sb2.append(((Integer) D2.second).intValue() != -1 ? ", " + strArr[((Integer) D2.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f4668d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            str3 = str6;
                            i11 = i14;
                            i12 = i15;
                            this.f4639f[i16].put(str4, d.a(str5));
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            i11 = i14;
                            i12 = i15;
                            this.f4639f[i16].put(str4, d.e(str5));
                            break;
                        case 3:
                            str3 = str6;
                            i11 = i14;
                            i12 = i15;
                            String[] split = str5.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i19 = i12; i19 < split.length; i19++) {
                                iArr[i19] = Integer.parseInt(split[i19]);
                            }
                            this.f4639f[i16].put(str4, d.k(iArr, this.f4641h));
                            break;
                        case 4:
                            str3 = str6;
                            i11 = i14;
                            i12 = i15;
                            String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i20 = i12; i20 < split2.length; i20++) {
                                jArr[i20] = Long.parseLong(split2[i20]);
                            }
                            this.f4639f[i16].put(str4, d.g(jArr, this.f4641h));
                            break;
                        case 5:
                            i11 = i14;
                            i12 = i15;
                            String[] split3 = str5.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i21 = i12;
                            while (i21 < split3.length) {
                                String[] split4 = split3[i21].split(str6, -1);
                                fVarArr[i21] = new f((long) Double.parseDouble(split4[i12]), (long) Double.parseDouble(split4[i11]), null);
                                i21++;
                                str6 = str6;
                            }
                            str3 = str6;
                            this.f4639f[i16].put(str4, d.i(fVarArr, this.f4641h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f4630w) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                                break;
                            }
                            break;
                        case 9:
                            i11 = i14;
                            i12 = i15;
                            String[] split5 = str5.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i22 = i12; i22 < split5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(split5[i22]);
                            }
                            this.f4639f[i16].put(str4, d.c(iArr2, this.f4641h));
                            str3 = str6;
                            break;
                        case 10:
                            String[] split6 = str5.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i23 = i15;
                            while (i23 < split6.length) {
                                String[] split7 = split6[i23].split(str6, -1);
                                int i24 = i14;
                                int i25 = i23;
                                fVarArr2[i25] = new f((long) Double.parseDouble(split7[i15]), (long) Double.parseDouble(split7[i24]), null);
                                i23 = i25 + 1;
                                i14 = i24;
                                split6 = split6;
                                i15 = i15;
                            }
                            i11 = i14;
                            i12 = i15;
                            this.f4639f[i16].put(str4, d.d(fVarArr2, this.f4641h));
                            str3 = str6;
                            break;
                        case 12:
                            String[] split8 = str5.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i26 = i15; i26 < split8.length; i26++) {
                                dArr[i26] = Double.parseDouble(split8[i26]);
                            }
                            this.f4639f[i16].put(str4, d.b(dArr, this.f4641h));
                            break;
                    }
                    i16++;
                    i14 = i11;
                    i15 = i12;
                    str6 = str3;
                    i13 = 2;
                }
            }
            str3 = str6;
            i11 = i14;
            i12 = i15;
            i16++;
            i14 = i11;
            i15 = i12;
            str6 = str3;
            i13 = 2;
        }
    }

    public final void i(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        c4.b.e(bVar, cVar, readInt);
    }

    public void i0(Location location) {
        if (location == null) {
            return;
        }
        h0("GPSProcessingMethod", location.getProvider());
        j0(location.getLatitude(), location.getLongitude());
        g0(location.getAltitude());
        h0("GPSSpeedRef", "K");
        h0("GPSSpeed", f.b((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = V.format(new Date(location.getTime())).split("\\s+", -1);
        h0("GPSDateStamp", split[0]);
        h0("GPSTimeStamp", split[1]);
    }

    public double j(double d10) {
        double l10 = l("GPSAltitude", -1.0d);
        int m10 = m("GPSAltitudeRef", -1);
        if (l10 < 0.0d || m10 < 0) {
            return d10;
        }
        return l10 * (m10 != 1 ? 1 : -1);
    }

    public void j0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        h0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        h0("GPSLatitude", f(Math.abs(d10)));
        h0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        h0("GPSLongitude", f(Math.abs(d11)));
    }

    public String k(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d n10 = n(str);
        if (n10 == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f4622o0.contains(str)) {
                return n10.n(this.f4641h);
            }
            try {
                return Double.toString(n10.l(this.f4641h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = n10.f4663a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + n10.f4663a);
            return null;
        }
        f[] fVarArr = (f[]) n10.o(this.f4641h);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer valueOf = Integer.valueOf((int) (fVar.f4669a / fVar.b));
        f fVar2 = fVarArr[1];
        Integer valueOf2 = Integer.valueOf((int) (fVar2.f4669a / fVar2.b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f4669a / fVar3.b)));
    }

    public final void k0(b bVar) {
        HashMap<String, d> hashMap = this.f4639f[4];
        d dVar = hashMap.get("Compression");
        if (dVar == null) {
            this.f4648o = 6;
            E(bVar, hashMap);
            return;
        }
        int m10 = dVar.m(this.f4641h);
        this.f4648o = m10;
        if (m10 != 1) {
            if (m10 == 6) {
                E(bVar, hashMap);
                return;
            } else if (m10 != 7) {
                return;
            }
        }
        if (P(hashMap)) {
            F(bVar, hashMap);
        }
    }

    public double l(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d n10 = n(str);
        if (n10 != null) {
            try {
                return n10.l(this.f4641h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int m(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d n10 = n(str);
        if (n10 != null) {
            try {
                return n10.m(this.f4641h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void m0(int i10, int i11) {
        if (this.f4639f[i10].isEmpty() || this.f4639f[i11].isEmpty()) {
            if (f4630w) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f4639f[i10].get("ImageLength");
        d dVar2 = this.f4639f[i10].get("ImageWidth");
        d dVar3 = this.f4639f[i11].get("ImageLength");
        d dVar4 = this.f4639f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f4630w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f4630w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m10 = dVar.m(this.f4641h);
        int m11 = dVar2.m(this.f4641h);
        int m12 = dVar3.m(this.f4641h);
        int m13 = dVar4.m(this.f4641h);
        if (m10 >= m12 || m11 >= m13) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f4639f;
        HashMap<String, d> hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    public final d n(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f4630w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && C(this.f4637d) == 2 && (dVar2 = this.f4654u) != null) {
            return dVar2;
        }
        for (int i10 = 0; i10 < f4618k0.length; i10++) {
            d dVar3 = this.f4639f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f4654u) == null) {
            return null;
        }
        return dVar;
    }

    public final void o(g gVar, int i10) {
        String str;
        String str2;
        String str3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.a.a(mediaMetadataRetriever, new C0095a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f4639f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f4641h));
                }
                if (str3 != null) {
                    this.f4639f[0].put("ImageLength", d.j(Integer.parseInt(str3), this.f4641h));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    this.f4639f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f4641h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.g(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i12 = parseInt2 + 6;
                    int i13 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f4625r0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i13];
                    gVar.readFully(bArr2);
                    this.f4649p = i12;
                    X(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j10 = parseInt4;
                    gVar.g(j10);
                    byte[] bArr3 = new byte[parseInt5];
                    gVar.readFully(bArr3);
                    this.f4654u = new d(1, parseInt5, j10, bArr3);
                    this.f4655v = true;
                }
                if (f4630w) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e10) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
        }
    }

    public final void o0(g gVar, int i10) {
        d j10;
        d j11;
        d dVar = this.f4639f[i10].get("DefaultCropSize");
        d dVar2 = this.f4639f[i10].get("SensorTopBorder");
        d dVar3 = this.f4639f[i10].get("SensorLeftBorder");
        d dVar4 = this.f4639f[i10].get("SensorBottomBorder");
        d dVar5 = this.f4639f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                b0(gVar, i10);
                return;
            }
            int m10 = dVar2.m(this.f4641h);
            int m11 = dVar4.m(this.f4641h);
            int m12 = dVar5.m(this.f4641h);
            int m13 = dVar3.m(this.f4641h);
            if (m11 <= m10 || m12 <= m13) {
                return;
            }
            d j12 = d.j(m11 - m10, this.f4641h);
            d j13 = d.j(m12 - m13, this.f4641h);
            this.f4639f[i10].put("ImageLength", j12);
            this.f4639f[i10].put("ImageWidth", j13);
            return;
        }
        if (dVar.f4663a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f4641h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            j10 = d.h(fVarArr[0], this.f4641h);
            j11 = d.h(fVarArr[1], this.f4641h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f4641h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            j10 = d.j(iArr[0], this.f4641h);
            j11 = d.j(iArr[1], this.f4641h);
        }
        this.f4639f[i10].put("ImageWidth", j10);
        this.f4639f[i10].put("ImageLength", j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r21.e(r20.f4641h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159 A[LOOP:0: B:9:0x0037->B:32:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(c4.a.b r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.p(c4.a$b, int, int):void");
    }

    public final void p0() {
        m0(0, 5);
        m0(0, 4);
        m0(5, 4);
        d dVar = this.f4639f[1].get("PixelXDimension");
        d dVar2 = this.f4639f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f4639f[0].put("ImageWidth", dVar);
            this.f4639f[0].put("ImageLength", dVar2);
        }
        if (this.f4639f[4].isEmpty() && R(this.f4639f[5])) {
            HashMap<String, d>[] hashMapArr = this.f4639f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!R(this.f4639f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        a0(0, "ThumbnailOrientation", "Orientation");
        a0(0, "ThumbnailImageLength", "ImageLength");
        a0(0, "ThumbnailImageWidth", "ImageWidth");
        a0(5, "ThumbnailOrientation", "Orientation");
        a0(5, "ThumbnailImageLength", "ImageLength");
        a0(5, "ThumbnailImageWidth", "ImageWidth");
        a0(4, "Orientation", "ThumbnailOrientation");
        a0(4, "ImageLength", "ThumbnailImageLength");
        a0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public double[] q() {
        String k10 = k("GPSLatitude");
        String k11 = k("GPSLatitudeRef");
        String k12 = k("GPSLongitude");
        String k13 = k("GPSLongitudeRef");
        if (k10 == null || k11 == null || k12 == null || k13 == null) {
            return null;
        }
        try {
            return new double[]{g(k10, k11), g(k12, k13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", k10, k11, k12, k13));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q0(c4.a.c r19) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.q0(c4.a$c):int");
    }

    public final int r(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
        byte[] bArr = new byte[BacktraceANRSettings.DEFAULT_ANR_TIMEOUT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (J(bArr)) {
            return 4;
        }
        if (M(bArr)) {
            return 9;
        }
        int I2 = I(bArr);
        if (I2 != 0) {
            return I2;
        }
        if (K(bArr)) {
            return 7;
        }
        if (N(bArr)) {
            return 10;
        }
        if (L(bArr)) {
            return 13;
        }
        return S(bArr) ? 14 : 0;
    }

    public final void r0(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f4649p = cVar.f4662a.size() + q0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.c((int) crc32.getValue());
    }

    public final void s(g gVar) {
        int i10;
        int i11;
        v(gVar);
        d dVar = this.f4639f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f4665d);
            gVar2.e(this.f4641h);
            byte[] bArr = I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.g(0L);
            byte[] bArr3 = J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.g(12L);
            }
            Y(gVar2, 6);
            d dVar2 = this.f4639f[7].get("PreviewImageStart");
            d dVar3 = this.f4639f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f4639f[5].put("JPEGInterchangeFormat", dVar2);
                this.f4639f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f4639f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f4641h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d j10 = d.j(i14, this.f4641h);
                d j11 = d.j(i15, this.f4641h);
                this.f4639f[0].put("ImageWidth", j10);
                this.f4639f[0].put("ImageLength", j11);
            }
        }
    }

    public final void s0(c cVar) {
        cVar.c(this.f4654u.f4665d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.c(1767135348);
        n0(crc32, 1767135348);
        byte[] bArr = L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f4654u.f4665d);
        crc32.update(this.f4654u.f4665d);
        cVar.c((int) crc32.getValue());
        this.f4655v = true;
    }

    public final void t(b bVar) {
        if (f4630w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        int b10 = bVar.b();
        bVar.f(K.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int b11 = bVar.b() + readInt + 4;
                if (bVar.b() - b10 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z10) {
                    this.f4649p = bVar.b() - b10;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    n0(crc32, readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    X(bArr, 0);
                    p0();
                    k0(new b(bArr));
                    z10 = true;
                } else if (readInt2 == 1767135348 && !z11) {
                    byte[] bArr2 = L;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int b12 = bVar.b() - b10;
                            int i10 = readInt - length;
                            byte[] bArr4 = new byte[i10];
                            bVar.readFully(bArr4);
                            this.f4654u = new d(1, i10, b12, bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar.f(b11 - bVar.b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f4655v = z11;
    }

    public final void u(b bVar) {
        boolean z10 = f4630w;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.f(i10 - bVar.b());
        bVar.readFully(bArr4);
        p(new b(bArr4), i10, 5);
        bVar.f(i12 - bVar.b());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4613f0.f4666a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f4641h);
                d j11 = d.j(readShort2, this.f4641h);
                this.f4639f[0].put("ImageLength", j10);
                this.f4639f[0].put("ImageWidth", j11);
                if (f4630w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.f(readUnsignedShort2);
        }
    }

    public final void v(g gVar) {
        d dVar;
        U(gVar);
        Y(gVar, 0);
        o0(gVar, 0);
        o0(gVar, 5);
        o0(gVar, 4);
        p0();
        if (this.f4637d != 8 || (dVar = this.f4639f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f4665d);
        gVar2.e(this.f4641h);
        gVar2.f(6);
        Y(gVar2, 9);
        d dVar2 = this.f4639f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f4639f[1].put("ColorSpace", dVar2);
        }
    }

    public int w() {
        switch (m("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void x(g gVar) {
        if (f4630w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        v(gVar);
        d dVar = this.f4639f[0].get("JpgFromRaw");
        if (dVar != null) {
            p(new b(dVar.f4665d), (int) dVar.f4664c, 5);
        }
        d dVar2 = this.f4639f[0].get("ISO");
        d dVar3 = this.f4639f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f4639f[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean y(g gVar) {
        byte[] bArr = f4625r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] c10 = gVar.c();
        this.f4649p = bArr.length;
        X(c10, 0);
        return true;
    }

    public byte[] z() {
        int i10 = this.f4648o;
        if (i10 == 6 || i10 == 7) {
            return A();
        }
        return null;
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f4658a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f4659c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f4660d;

        /* renamed from: e, reason: collision with root package name */
        public int f4661e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f4661e = bArr.length;
        }

        public int a() {
            return this.f4661e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4658a.available();
        }

        public int b() {
            return this.b;
        }

        public byte[] c() {
            byte[] bArr = new byte[1024];
            int i10 = 0;
            while (true) {
                if (i10 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
                int read = this.f4658a.read(bArr, i10, bArr.length - i10);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i10);
                }
                i10 += read;
                this.b += read;
            }
        }

        public long d() {
            return readInt() & 4294967295L;
        }

        public void e(ByteOrder byteOrder) {
            this.f4659c = byteOrder;
        }

        public void f(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f4658a.skip(i12);
                if (skip <= 0) {
                    if (this.f4660d == null) {
                        this.f4660d = new byte[8192];
                    }
                    skip = this.f4658a.read(this.f4660d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.b += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.b++;
            return this.f4658a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.b++;
            return this.f4658a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.b++;
            int read = this.f4658a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.b += 2;
            return this.f4658a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.b += i11;
            this.f4658a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.b += 4;
            int read = this.f4658a.read();
            int read2 = this.f4658a.read();
            int read3 = this.f4658a.read();
            int read4 = this.f4658a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4659c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f4659c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.b += 8;
            int read = this.f4658a.read();
            int read2 = this.f4658a.read();
            int read3 = this.f4658a.read();
            int read4 = this.f4658a.read();
            int read5 = this.f4658a.read();
            int read6 = this.f4658a.read();
            int read7 = this.f4658a.read();
            int read8 = this.f4658a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4659c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f4659c);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.b += 2;
            int read = this.f4658a.read();
            int read2 = this.f4658a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4659c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f4659c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.b += 2;
            return this.f4658a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.b++;
            return this.f4658a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.b += 2;
            int read = this.f4658a.read();
            int read2 = this.f4658a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4659c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f4659c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f4658a.read(bArr, i10, i11);
            this.b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.b += bArr.length;
            this.f4658a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4658a = dataInputStream;
            dataInputStream.mark(0);
            this.b = 0;
            this.f4659c = byteOrder;
            this.f4661e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f4658a.mark(Integer.MAX_VALUE);
        }

        public void g(long j10) {
            int i10 = this.b;
            if (i10 > j10) {
                this.b = 0;
                this.f4658a.reset();
            } else {
                j10 -= i10;
            }
            f((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f4658a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f4666a;
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4667c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4668d;

        public e(String str, int i10, int i11) {
            this.b = str;
            this.f4666a = i10;
            this.f4667c = i11;
            this.f4668d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f4667c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f4668d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public e(String str, int i10, int i11, int i12) {
            this.b = str;
            this.f4666a = i10;
            this.f4667c = i11;
            this.f4668d = i12;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f4618k0;
        this.f4639f = new HashMap[eVarArr.length];
        this.f4640g = new HashSet(eVarArr.length);
        this.f4641h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f4635a = null;
            boolean z10 = i10 == 1;
            this.f4638e = z10;
            if (z10) {
                this.f4636c = null;
                this.b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f4636c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (O(fileInputStream.getFD())) {
                        this.f4636c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.f4636c = null;
                this.b = null;
            }
            T(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
