package be;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e1 {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair c10 = f1.c(randomAccessFile);
            if (c10 == null) {
                throw new b1("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) c10.first;
            long longValue = ((Long) c10.second).longValue();
            long j10 = (-20) + longValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new b1("ZIP64 APK not supported");
                }
            }
            long a10 = f1.a(byteBuffer);
            if (a10 >= longValue) {
                throw new b1("ZIP Central Directory offset out of range: " + a10 + ". ZIP End of Central Directory offset: " + longValue);
            }
            if (f1.b(byteBuffer) + a10 != longValue) {
                throw new b1("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (a10 < 32) {
                throw new b1("APK too small for APK Signing Block. ZIP Central Directory offset: " + a10);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(a10 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new b1("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = allocate.getLong(0);
            if (j11 < allocate.capacity() || j11 > 2147483639) {
                throw new b1("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = a10 - i11;
            if (j12 < 0) {
                throw new b1("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i11);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j13 = allocate2.getLong(0);
            if (j13 != j11) {
                throw new b1("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                while (slice.hasRemaining()) {
                    i10++;
                    if (slice.remaining() < 8) {
                        throw new b1("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = slice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new b1("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int position2 = slice.position() + i12;
                    if (i12 > slice.remaining()) {
                        throw new b1("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] l10 = l(randomAccessFile.getChannel(), new a1(e(slice, i12 - 4), longValue2, a10, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return l10;
                    }
                    long j15 = longValue2;
                    slice.position(position2);
                    longValue2 = j15;
                }
                throw new b1("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    public static int c(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static String d(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i10) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (i11 < position || i11 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return e(byteBuffer, i10);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
    }

    public static void g(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static void h(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        w0 w0Var = new w0(fileChannel, 0L, j10);
        w0 w0Var2 = new w0(fileChannel, j11, j12 - j11);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        f1.d(duplicate, j10);
        a aVar = new a(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] k10 = k(iArr, new w[]{w0Var, w0Var2, aVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), k10[i11])) {
                    throw new SecurityException(d(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    public static byte[] i(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = c(r6);
        r12 = c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be.e1.j(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static byte[][] k(int[] iArr, w[] wVarArr) {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        String str;
        int i12 = 0;
        int i13 = 0;
        long j11 = 0;
        while (true) {
            j10 = 1048576;
            i10 = 3;
            if (i13 >= 3) {
                break;
            }
            j11 += (wVarArr[i13].zza() + 1048575) / 1048576;
            i13++;
        }
        if (j11 >= 2097151) {
            throw new DigestException("Too many chunks: " + j11);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i14 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i14 >= length) {
                break;
            }
            int i15 = (int) j11;
            byte[] bArr2 = new byte[(b(iArr[i14]) * i15) + 5];
            bArr2[0] = 90;
            g(i15, bArr2, 1);
            bArr[i14] = bArr2;
            i14++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i16 = 0;
        while (true) {
            str = " digest not supported";
            if (i16 >= iArr.length) {
                break;
            }
            String d10 = d(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(d10);
                i16++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(d10.concat(" digest not supported"), e10);
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10) {
            w wVar = wVarArr[i17];
            int i19 = i17;
            long zza = wVar.zza();
            byte[][] bArr4 = bArr;
            long j12 = 0;
            while (zza > 0) {
                int i20 = i18;
                String str2 = str;
                int min = (int) Math.min(zza, j10);
                g(min, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    wVar.a(messageDigestArr, j12, min);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr5 = bArr4[i22];
                        int b = b(i23);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int digest = messageDigest.digest(bArr5, (i20 * b) + 5, b);
                        if (digest != b) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i22++;
                        c10 = c11;
                    }
                    long j13 = min;
                    j12 += j13;
                    zza -= j13;
                    i18 = i20 + 1;
                    str = str2;
                    j10 = 1048576;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException("Failed to digest chunk #" + i20 + " of section #" + i12, e11);
                }
            }
            i12++;
            i17 = i19 + 1;
            bArr = bArr4;
            j10 = 1048576;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr8 = bArr6[i24];
            String d11 = d(i25);
            try {
                bArr7[i24] = MessageDigest.getInstance(d11).digest(bArr8);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(d11.concat(str3), e12);
            }
        }
        return bArr7;
    }

    public static X509Certificate[][] l(FileChannel fileChannel, a1 a1Var) {
        ByteBuffer byteBuffer;
        long j10;
        long j11;
        long j12;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = a1Var.f3951a;
                ByteBuffer f10 = f(byteBuffer);
                int i10 = 0;
                while (f10.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(j(f(f10), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                j10 = a1Var.b;
                j11 = a1Var.f3952c;
                j12 = a1Var.f3953d;
                byteBuffer2 = a1Var.f3954e;
                h(hashMap, fileChannel, j10, j11, j12, byteBuffer2);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
