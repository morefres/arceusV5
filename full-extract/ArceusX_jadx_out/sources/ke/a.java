package ke;

import he.n;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22593a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final a b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    public static final a f22594c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    public static final a f22595d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    public static final a f22596e = new b("base16()", "0123456789ABCDEF");

    /* renamed from: ke.a$a, reason: collision with other inner class name */
    public static final class C0397a {

        /* renamed from: a, reason: collision with root package name */
        public final String f22597a;
        public final char[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22598c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22599d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22600e;

        /* renamed from: f, reason: collision with root package name */
        public final int f22601f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f22602g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean[] f22603h;

        public C0397a(String str, char[] cArr) {
            this.f22597a = (String) n.l(str);
            this.b = (char[]) n.l(cArr);
            try {
                int d10 = le.a.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f22599d = d10;
                int min = Math.min(8, Integer.lowestOneBit(d10));
                try {
                    this.f22600e = 8 / min;
                    this.f22601f = d10 / min;
                    this.f22598c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i10 = 0; i10 < cArr.length; i10++) {
                        char c10 = cArr[i10];
                        n.f(c10 < 128, "Non-ASCII character: %s", c10);
                        n.f(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i10;
                    }
                    this.f22602g = bArr;
                    boolean[] zArr = new boolean[this.f22600e];
                    for (int i11 = 0; i11 < this.f22601f; i11++) {
                        zArr[le.a.a(i11 * 8, this.f22599d, RoundingMode.CEILING)] = true;
                    }
                    this.f22603h = zArr;
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                int length = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString(), e11);
            }
        }

        public int b(char c10) {
            if (c10 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c10));
                throw new d(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f22602g[c10];
            if (b != -1) {
                return b;
            }
            if (c10 <= ' ' || c10 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c10));
                throw new d(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Unrecognized character: ");
            sb2.append(c10);
            throw new d(sb2.toString());
        }

        public char c(int i10) {
            return this.b[i10];
        }

        public final boolean d() {
            for (char c10 : this.b) {
                if (he.c.a(c10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (char c10 : this.b) {
                if (he.c.b(c10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0397a) {
                return Arrays.equals(this.b, ((C0397a) obj).b);
            }
            return false;
        }

        public boolean f(int i10) {
            return this.f22603h[i10 % this.f22600e];
        }

        public C0397a g() {
            if (!e()) {
                return this;
            }
            n.s(!d(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i10 >= cArr2.length) {
                    return new C0397a(String.valueOf(this.f22597a).concat(".lowerCase()"), cArr);
                }
                cArr[i10] = he.c.c(cArr2[i10]);
                i10++;
            }
        }

        public boolean h(char c10) {
            byte[] bArr = this.f22602g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public String toString() {
            return this.f22597a;
        }
    }

    public static final class b extends e {

        /* renamed from: i, reason: collision with root package name */
        public final char[] f22604i;

        public b(String str, String str2) {
            this(new C0397a(str, str2.toCharArray()));
        }

        @Override // ke.a.e, ke.a
        public int f(byte[] bArr, CharSequence charSequence) {
            n.l(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f22605f.b(charSequence.charAt(i10)) << 4) | this.f22605f.b(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // ke.a.e, ke.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f22604i[i13]);
                appendable.append(this.f22604i[i13 | 256]);
            }
        }

        @Override // ke.a.e
        public a q(C0397a c0397a, Character ch2) {
            return new b(c0397a);
        }

        public b(C0397a c0397a) {
            super(c0397a, null);
            this.f22604i = new char[512];
            n.d(c0397a.b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f22604i[i10] = c0397a.c(i10 >>> 4);
                this.f22604i[i10 | 256] = c0397a.c(i10 & 15);
            }
        }
    }

    public static final class c extends e {
        public c(String str, String str2, Character ch2) {
            this(new C0397a(str, str2.toCharArray()), ch2);
        }

        @Override // ke.a.e, ke.a
        public int f(byte[] bArr, CharSequence charSequence) {
            n.l(bArr);
            CharSequence o8 = o(charSequence);
            if (!this.f22605f.f(o8.length())) {
                int length = o8.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < o8.length()) {
                int i12 = i10 + 2;
                int b = (this.f22605f.b(o8.charAt(i10)) << 18) | (this.f22605f.b(o8.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (b >>> 16);
                if (i12 < o8.length()) {
                    int i14 = i10 + 3;
                    int b10 = b | (this.f22605f.b(o8.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((b10 >>> 8) & 255);
                    if (i14 < o8.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((b10 | this.f22605f.b(o8.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // ke.a.e, ke.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.l(appendable);
            int i12 = i10 + i11;
            n.q(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                appendable.append(this.f22605f.c(i15 >>> 18));
                appendable.append(this.f22605f.c((i15 >>> 12) & 63));
                appendable.append(this.f22605f.c((i15 >>> 6) & 63));
                appendable.append(this.f22605f.c(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                p(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // ke.a.e
        public a q(C0397a c0397a, Character ch2) {
            return new c(c0397a, ch2);
        }

        public c(C0397a c0397a, Character ch2) {
            super(c0397a, ch2);
            n.d(c0397a.b.length == 64);
        }
    }

    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    public static class e extends a {

        /* renamed from: f, reason: collision with root package name */
        public final C0397a f22605f;

        /* renamed from: g, reason: collision with root package name */
        public final Character f22606g;

        /* renamed from: h, reason: collision with root package name */
        public transient a f22607h;

        public e(String str, String str2, Character ch2) {
            this(new C0397a(str, str2.toCharArray()), ch2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f22605f.equals(eVar.f22605f) && he.j.a(this.f22606g, eVar.f22606g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ke.a
        public int f(byte[] bArr, CharSequence charSequence) {
            C0397a c0397a;
            n.l(bArr);
            CharSequence o8 = o(charSequence);
            if (!this.f22605f.f(o8.length())) {
                int length = o8.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < o8.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0397a = this.f22605f;
                    if (i12 >= c0397a.f22600e) {
                        break;
                    }
                    j10 <<= c0397a.f22599d;
                    if (i10 + i12 < o8.length()) {
                        j10 |= this.f22605f.b(o8.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0397a.f22601f;
                int i15 = (i14 * 8) - (i13 * c0397a.f22599d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f22605f.f22600e;
            }
            return i11;
        }

        public int hashCode() {
            return this.f22605f.hashCode() ^ he.j.b(this.f22606g);
        }

        @Override // ke.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                p(appendable, bArr, i10 + i12, Math.min(this.f22605f.f22601f, i11 - i12));
                i12 += this.f22605f.f22601f;
            }
        }

        @Override // ke.a
        public a k() {
            a aVar = this.f22607h;
            if (aVar == null) {
                C0397a g10 = this.f22605f.g();
                aVar = g10 == this.f22605f ? this : q(g10, this.f22606g);
                this.f22607h = aVar;
            }
            return aVar;
        }

        @Override // ke.a
        public int l(int i10) {
            return (int) (((this.f22605f.f22599d * i10) + 7) / 8);
        }

        @Override // ke.a
        public int m(int i10) {
            C0397a c0397a = this.f22605f;
            return c0397a.f22600e * le.a.a(i10, c0397a.f22601f, RoundingMode.CEILING);
        }

        @Override // ke.a
        public a n() {
            return this.f22606g == null ? this : q(this.f22605f, null);
        }

        @Override // ke.a
        public CharSequence o(CharSequence charSequence) {
            n.l(charSequence);
            Character ch2 = this.f22606g;
            if (ch2 == null) {
                return charSequence;
            }
            char charValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public void p(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            n.d(i11 <= this.f22605f.f22601f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f22605f.f22599d;
            while (i12 < i11 * 8) {
                C0397a c0397a = this.f22605f;
                appendable.append(c0397a.c(((int) (j10 >>> (i14 - i12))) & c0397a.f22598c));
                i12 += this.f22605f.f22599d;
            }
            if (this.f22606g != null) {
                while (i12 < this.f22605f.f22601f * 8) {
                    appendable.append(this.f22606g.charValue());
                    i12 += this.f22605f.f22599d;
                }
            }
        }

        public a q(C0397a c0397a, Character ch2) {
            return new e(c0397a, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f22605f.toString());
            if (8 % this.f22605f.f22599d != 0) {
                if (this.f22606g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f22606g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        public e(C0397a c0397a, Character ch2) {
            this.f22605f = (C0397a) n.l(c0397a);
            n.h(ch2 == null || !c0397a.h(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f22606g = ch2;
        }
    }

    public static a a() {
        return f22596e;
    }

    public static a b() {
        return f22593a;
    }

    public static a c() {
        return b;
    }

    public static byte[] j(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] d(CharSequence charSequence) {
        try {
            return e(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final byte[] e(CharSequence charSequence) {
        CharSequence o8 = o(charSequence);
        byte[] bArr = new byte[l(o8.length())];
        return j(bArr, f(bArr, o8));
    }

    public abstract int f(byte[] bArr, CharSequence charSequence);

    public String g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public final String h(byte[] bArr, int i10, int i11) {
        n.q(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(m(i11));
        try {
            i(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void i(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract a k();

    public abstract int l(int i10);

    public abstract int m(int i10);

    public abstract a n();

    public abstract CharSequence o(CharSequence charSequence);
}
