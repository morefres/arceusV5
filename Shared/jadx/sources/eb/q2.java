package eb;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15879a;
    public final char[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15880c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15882e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15883f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f15884g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15885h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q2(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            eb.n0.d(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            eb.n0.d(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.q2.<init>(java.lang.String, char[]):void");
    }

    public final char a(int i10) {
        return this.b[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    public final q2 b() {
        int i10;
        boolean z10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char[] cArr = this.b;
            if (i12 >= cArr.length) {
                return this;
            }
            if (b0.a(cArr[i12])) {
                int i13 = 0;
                while (true) {
                    if (i13 >= cArr.length) {
                        z10 = false;
                        break;
                    }
                    char c10 = cArr[i13];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z10 = true;
                        break;
                    }
                    i13++;
                }
                n0.f(!z10, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.b.length];
                while (true) {
                    char[] cArr3 = this.b;
                    if (i11 >= cArr3.length) {
                        break;
                    }
                    char c11 = cArr3[i11];
                    if (b0.a(c11)) {
                        c11 ^= 32;
                    }
                    cArr2[i11] = (char) c11;
                    i11++;
                }
                q2 q2Var = new q2(this.f15879a.concat(".upperCase()"), cArr2);
                if (!this.f15885h || q2Var.f15885h) {
                    return q2Var;
                }
                byte[] bArr = q2Var.f15884g;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i14 = i10 | 32;
                    byte[] bArr2 = q2Var.f15884g;
                    byte b = bArr2[i10];
                    byte b10 = bArr2[i14];
                    if (b == -1) {
                        copyOf[i10] = b10;
                    } else {
                        char c12 = (char) i10;
                        char c13 = (char) i14;
                        if (b10 != -1) {
                            throw new IllegalStateException(p0.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                        }
                        copyOf[i14] = b;
                    }
                }
                return new q2(q2Var.f15879a.concat(".ignoreCase()"), q2Var.b, copyOf, true);
            }
            i12++;
        }
    }

    public final boolean c(char c10) {
        byte[] bArr = this.f15884g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            if (this.f15885h == q2Var.f15885h && Arrays.equals(this.b, q2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.f15885h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f15879a;
    }

    public q2(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f15879a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            int b = w2.b(length, RoundingMode.UNNECESSARY);
            this.f15881d = b;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(b);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.f15882e = i10;
            this.f15883f = b >> numberOfTrailingZeros;
            this.f15880c = length - 1;
            this.f15884g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f15883f; i11++) {
                zArr[w2.a(i11 * 8, this.f15881d, RoundingMode.CEILING)] = true;
            }
            this.f15885h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
