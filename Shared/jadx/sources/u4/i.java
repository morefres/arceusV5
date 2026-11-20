package u4;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f32623a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(@NonNull byte[] bArr, int i10, int i11, @NonNull b bVar) {
        int m10 = m(i10, i11, bVar.f32609g);
        int i12 = m10 / 8;
        bArr[i12] = (byte) ((1 << (m10 % 8)) | bArr[i12]);
    }

    public static void B(@NonNull InputStream inputStream) {
        c.h(inputStream);
        int j10 = c.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            c.j(inputStream);
            for (int j11 = c.j(inputStream); j11 > 0; j11--) {
                c.h(inputStream);
            }
            j10--;
        }
    }

    public static boolean C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull b[] bVarArr) {
        if (Arrays.equals(bArr, j.f32624a)) {
            P(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.b)) {
            O(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f32626d)) {
            M(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f32625c)) {
            N(outputStream, bVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, j.f32627e)) {
            return false;
        }
        L(outputStream, bVarArr);
        return true;
    }

    public static void D(@NonNull OutputStream outputStream, @NonNull b bVar) {
        int[] iArr = bVar.f32610h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            c.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    public static k E(@NonNull b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i10 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f32605c);
                c.q(byteArrayOutputStream, bVar.f32606d);
                c.q(byteArrayOutputStream, bVar.f32609g);
                String j10 = j(bVar.f32604a, bVar.b, j.f32624a);
                int k10 = c.k(j10);
                c.p(byteArrayOutputStream, k10);
                i10 = i10 + 14 + k10;
                c.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                k kVar = new k(d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return kVar;
            }
            throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void F(@NonNull OutputStream outputStream, byte[] bArr) {
        outputStream.write(f32623a);
        outputStream.write(bArr);
    }

    public static void G(@NonNull OutputStream outputStream, @NonNull b bVar) {
        K(outputStream, bVar);
        D(outputStream, bVar);
        I(outputStream, bVar);
    }

    public static void H(@NonNull OutputStream outputStream, @NonNull b bVar, @NonNull String str) {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f32607e);
        c.q(outputStream, bVar.f32608f);
        c.q(outputStream, bVar.f32605c);
        c.q(outputStream, bVar.f32609g);
        c.n(outputStream, str);
    }

    public static void I(@NonNull OutputStream outputStream, @NonNull b bVar) {
        byte[] bArr = new byte[k(bVar.f32609g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f32611i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void J(@NonNull OutputStream outputStream, int i10, @NonNull b bVar) {
        byte[] bArr = new byte[l(i10, bVar.f32609g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f32611i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (bVar.f32609g * i11) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static void K(@NonNull OutputStream outputStream, @NonNull b bVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f32611i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.p(outputStream, intValue - i10);
                c.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static void L(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j10 = j(bVar.f32604a, bVar.b, j.f32627e);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f32611i.size());
            c.p(outputStream, bVar.f32610h.length);
            c.q(outputStream, bVar.f32605c);
            c.n(outputStream, j10);
            Iterator<Integer> it = bVar.f32611i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
            }
            for (int i10 : bVar.f32610h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void M(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            int size = bVar.f32611i.size() * 4;
            String j10 = j(bVar.f32604a, bVar.b, j.f32626d);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f32610h.length);
            c.q(outputStream, size);
            c.q(outputStream, bVar.f32605c);
            c.n(outputStream, j10);
            Iterator<Integer> it = bVar.f32611i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
                c.p(outputStream, 0);
            }
            for (int i10 : bVar.f32610h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void N(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        byte[] b10 = b(bVarArr, j.f32625c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void O(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        byte[] b10 = b(bVarArr, j.b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void P(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        Q(outputStream, bVarArr);
    }

    public static void Q(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = j.f32624a.length + f32623a.length + 4 + (arrayList.size() * 16);
        c.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k kVar = (k) arrayList.get(i10);
            c.q(outputStream, kVar.f32630a.b());
            c.q(outputStream, length2);
            if (kVar.f32632d) {
                byte[] bArr = kVar.f32631c;
                long length3 = bArr.length;
                byte[] b10 = c.b(bArr);
                arrayList2.add(b10);
                c.q(outputStream, b10.length);
                c.q(outputStream, length3);
                length = b10.length;
            } else {
                arrayList2.add(kVar.f32631c);
                c.q(outputStream, kVar.f32631c.length);
                c.q(outputStream, 0L);
                length = kVar.f32631c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(@NonNull b bVar) {
        Iterator<Map.Entry<Integer, Integer>> it = bVar.f32611i.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().getValue().intValue();
        }
        return i10;
    }

    @NonNull
    public static byte[] b(@NonNull b[] bVarArr, @NonNull byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += c.k(j(bVar.f32604a, bVar.b, bArr)) + 16 + (bVar.f32607e * 2) + bVar.f32608f + k(bVar.f32609g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, j.f32625c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                H(byteArrayOutputStream, bVar2, j(bVar2.f32604a, bVar2.b, bArr));
                G(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                H(byteArrayOutputStream, bVar3, j(bVar3.f32604a, bVar3.b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                G(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static k c(@NonNull b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                c.p(byteArrayOutputStream, i11);
                c.p(byteArrayOutputStream, bVar.f32607e);
                i10 = i10 + 4 + (bVar.f32607e * 2);
                D(byteArrayOutputStream, bVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static k d(@NonNull b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                int a10 = a(bVar);
                byte[] e10 = e(a10, bVar);
                byte[] f10 = f(bVar);
                c.p(byteArrayOutputStream, i11);
                int length = e10.length + 2 + f10.length;
                c.q(byteArrayOutputStream, length);
                c.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(int i10, @NonNull b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i10, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] f(@NonNull b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static String g(@NonNull String str, @NonNull String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    public static String h(@NonNull String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static b i(@NonNull b[] bVarArr, @NonNull String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].b.equals(h10)) {
                return bVarArr[i10];
            }
        }
        return null;
    }

    @NonNull
    public static String j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String a10 = j.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + j.a(bArr) + str2;
    }

    public static int k(int i10) {
        return z(i10 * 2) / 8;
    }

    public static int l(int i10, int i11) {
        return z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    public static int m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw c.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw c.c("Unexpected flag: " + i10);
    }

    public static int[] n(@NonNull InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += c.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static int o(@NonNull BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] p(@NonNull InputStream inputStream, @NonNull byte[] bArr) {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, j.b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void q(@NonNull InputStream inputStream, @NonNull b bVar) {
        int available = inputStream.available() - bVar.f32608f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += c.h(inputStream);
            bVar.f32611i.put(Integer.valueOf(i10), 1);
            for (int h10 = c.h(inputStream); h10 > 0; h10--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    @NonNull
    public static b[] r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, b[] bVarArr) {
        if (Arrays.equals(bArr, j.f32628f)) {
            if (Arrays.equals(j.f32624a, bArr2)) {
                throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, bVarArr);
        }
        if (Arrays.equals(bArr, j.f32629g)) {
            return u(inputStream, bArr2, bVarArr);
        }
        throw c.c("Unsupported meta version");
    }

    @NonNull
    public static b[] s(@NonNull InputStream inputStream, @NonNull byte[] bArr, b[] bVarArr) {
        if (!Arrays.equals(bArr, j.f32628f)) {
            throw c.c("Unsupported meta version");
        }
        int j10 = c.j(inputStream);
        byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            b[] t8 = t(byteArrayInputStream, j10, bVarArr);
            byteArrayInputStream.close();
            return t8;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] t(@NonNull InputStream inputStream, int i10, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = c.h(inputStream);
            iArr[i11] = c.h(inputStream);
            strArr[i11] = c.f(inputStream, h10);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.b.equals(strArr[i12])) {
                throw c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f32607e = i13;
            bVar.f32610h = n(inputStream, i13);
        }
        return bVarArr;
    }

    @NonNull
    public static b[] u(@NonNull InputStream inputStream, @NonNull byte[] bArr, b[] bVarArr) {
        int h10 = c.h(inputStream);
        byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            b[] v5 = v(byteArrayInputStream, bArr, h10, bVarArr);
            byteArrayInputStream.close();
            return v5;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i10, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            c.h(inputStream);
            String f10 = c.f(inputStream, c.h(inputStream));
            long i12 = c.i(inputStream);
            int h10 = c.h(inputStream);
            b i13 = i(bVarArr, f10);
            if (i13 == null) {
                throw c.c("Missing profile key: " + f10);
            }
            i13.f32606d = i12;
            int[] n10 = n(inputStream, h10);
            if (Arrays.equals(bArr, j.f32627e)) {
                i13.f32607e = h10;
                i13.f32610h = n10;
            }
        }
        return bVarArr;
    }

    public static void w(@NonNull InputStream inputStream, @NonNull b bVar) {
        BitSet valueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f32609g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = bVar.f32609g;
            if (i10 >= i11) {
                return;
            }
            int o8 = o(valueOf, i10, i11);
            if (o8 != 0) {
                Integer num = bVar.f32611i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                bVar.f32611i.put(Integer.valueOf(i10), Integer.valueOf(o8 | num.intValue()));
            }
            i10++;
        }
    }

    @NonNull
    public static b[] x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) {
        if (!Arrays.equals(bArr, j.b)) {
            throw c.c("Unsupported version");
        }
        int j10 = c.j(inputStream);
        byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            b[] y10 = y(byteArrayInputStream, str, j10);
            byteArrayInputStream.close();
            return y10;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] y(@NonNull InputStream inputStream, @NonNull String str, int i10) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = c.h(inputStream);
            int h11 = c.h(inputStream);
            bVarArr[i11] = new b(str, c.f(inputStream, h10), c.i(inputStream), 0L, h11, (int) c.i(inputStream), (int) c.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            q(inputStream, bVar);
            bVar.f32610h = n(inputStream, bVar.f32607e);
            w(inputStream, bVar);
        }
        return bVarArr;
    }

    public static int z(int i10) {
        return (i10 + 7) & (-8);
    }
}
