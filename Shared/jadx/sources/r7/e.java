package r7;

import java.io.EOFException;
import r7.c;
import wu.g;
import wu.h;

/* loaded from: classes3.dex */
public final class e extends c {

    /* renamed from: n, reason: collision with root package name */
    public static final h f30142n = h.e("'\\");

    /* renamed from: o, reason: collision with root package name */
    public static final h f30143o = h.e("\"\\");

    /* renamed from: p, reason: collision with root package name */
    public static final h f30144p = h.e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q, reason: collision with root package name */
    public static final h f30145q = h.e("\n\r");

    /* renamed from: r, reason: collision with root package name */
    public static final h f30146r = h.e("*/");

    /* renamed from: h, reason: collision with root package name */
    public final g f30147h;

    /* renamed from: i, reason: collision with root package name */
    public final wu.e f30148i;

    /* renamed from: j, reason: collision with root package name */
    public int f30149j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f30150k;

    /* renamed from: l, reason: collision with root package name */
    public int f30151l;

    /* renamed from: m, reason: collision with root package name */
    public String f30152m;

    public e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f30147h = gVar;
        this.f30148i = gVar.getBufferField();
        q(6);
    }

    public final int B() {
        int[] iArr = this.b;
        int i10 = this.f30126a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int I = I(true);
            this.f30148i.readByte();
            if (I != 44) {
                if (I != 59) {
                    if (I != 93) {
                        throw x("Unterminated array");
                    }
                    this.f30149j = 4;
                    return 4;
                }
                y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int I2 = I(true);
                    this.f30148i.readByte();
                    if (I2 != 44) {
                        if (I2 != 59) {
                            if (I2 != 125) {
                                throw x("Unterminated object");
                            }
                            this.f30149j = 2;
                            return 2;
                        }
                        y();
                    }
                }
                int I3 = I(true);
                if (I3 == 34) {
                    this.f30148i.readByte();
                    this.f30149j = 13;
                    return 13;
                }
                if (I3 == 39) {
                    this.f30148i.readByte();
                    y();
                    this.f30149j = 12;
                    return 12;
                }
                if (I3 != 125) {
                    y();
                    if (!H((char) I3)) {
                        throw x("Expected name");
                    }
                    this.f30149j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw x("Expected name");
                }
                this.f30148i.readByte();
                this.f30149j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int I4 = I(true);
                this.f30148i.readByte();
                if (I4 != 58) {
                    if (I4 != 61) {
                        throw x("Expected ':'");
                    }
                    y();
                    if (this.f30147h.request(1L) && this.f30148i.j(0L) == 62) {
                        this.f30148i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (I(false) == -1) {
                    this.f30149j = 18;
                    return 18;
                }
                y();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int I5 = I(true);
        if (I5 == 34) {
            this.f30148i.readByte();
            this.f30149j = 9;
            return 9;
        }
        if (I5 == 39) {
            y();
            this.f30148i.readByte();
            this.f30149j = 8;
            return 8;
        }
        if (I5 != 44 && I5 != 59) {
            if (I5 == 91) {
                this.f30148i.readByte();
                this.f30149j = 3;
                return 3;
            }
            if (I5 != 93) {
                if (I5 == 123) {
                    this.f30148i.readByte();
                    this.f30149j = 1;
                    return 1;
                }
                int P = P();
                if (P != 0) {
                    return P;
                }
                int U = U();
                if (U != 0) {
                    return U;
                }
                if (!H(this.f30148i.j(0L))) {
                    throw x("Expected value");
                }
                y();
                this.f30149j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f30148i.readByte();
                this.f30149j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw x("Unexpected value");
        }
        y();
        this.f30149j = 7;
        return 7;
    }

    public final int F(String str, c.a aVar) {
        int length = aVar.f30131a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f30131a[i10])) {
                this.f30149j = 0;
                this.f30127c[this.f30126a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean H(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f30148i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        y();
        Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f30147h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        y();
        r3 = r6.f30148i.j(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f30148i.readByte();
        r6.f30148i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (Y() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw x("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f30148i.readByte();
        r6.f30148i.readByte();
        Z();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            wu.g r2 = r6.f30147h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            wu.e r2 = r6.f30148i
            long r4 = (long) r1
            byte r2 = r2.j(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            wu.e r3 = r6.f30148i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            wu.g r3 = r6.f30147h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.y()
            wu.e r3 = r6.f30148i
            r4 = 1
            byte r3 = r3.j(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            wu.e r1 = r6.f30148i
            r1.readByte()
            wu.e r1 = r6.f30148i
            r1.readByte()
            r6.Z()
            goto L1
        L5a:
            wu.e r1 = r6.f30148i
            r1.readByte()
            wu.e r1 = r6.f30148i
            r1.readByte()
            boolean r1 = r6.Y()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            r7.b r7 = r6.x(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.y()
            r6.Z()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.e.I(boolean):int");
    }

    public final String L(h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long p12 = this.f30147h.p1(hVar);
            if (p12 == -1) {
                throw x("Unterminated string");
            }
            if (this.f30148i.j(p12) != 92) {
                if (sb2 == null) {
                    String E1 = this.f30148i.E1(p12);
                    this.f30148i.readByte();
                    return E1;
                }
                sb2.append(this.f30148i.E1(p12));
                this.f30148i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f30148i.E1(p12));
            this.f30148i.readByte();
            sb2.append(W());
        }
    }

    public final String M() {
        long p12 = this.f30147h.p1(f30144p);
        return p12 != -1 ? this.f30148i.E1(p12) : this.f30148i.S2();
    }

    public final int P() {
        String str;
        String str2;
        int i10;
        byte j10 = this.f30148i.j(0L);
        if (j10 == 116 || j10 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (j10 == 102 || j10 == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (j10 != 110 && j10 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f30147h.request(i12)) {
                return 0;
            }
            byte j11 = this.f30148i.j(i11);
            if (j11 != str.charAt(i11) && j11 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f30147h.request(length + 1) && H(this.f30148i.j(length))) {
            return 0;
        }
        this.f30148i.skip(length);
        this.f30149j = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (H(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r19.f30150k = r8;
        r19.f30148i.skip(r5);
        r19.f30149j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r19.f30151l = r5;
        r19.f30149j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int U() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.e.U():int");
    }

    public final char W() {
        int i10;
        if (!this.f30147h.request(1L)) {
            throw x("Unterminated escape sequence");
        }
        byte readByte = this.f30148i.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f30129e) {
                return (char) readByte;
            }
            throw x("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f30147h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte j10 = this.f30148i.j(i11);
            char c11 = (char) (c10 << 4);
            if (j10 >= 48 && j10 <= 57) {
                i10 = j10 - 48;
            } else if (j10 >= 97 && j10 <= 102) {
                i10 = j10 - 87;
            } else {
                if (j10 < 65 || j10 > 70) {
                    throw x("\\u" + this.f30148i.E1(4L));
                }
                i10 = j10 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f30148i.skip(4L);
        return c10;
    }

    public final void X(h hVar) {
        while (true) {
            long p12 = this.f30147h.p1(hVar);
            if (p12 == -1) {
                throw x("Unterminated string");
            }
            if (this.f30148i.j(p12) != 92) {
                this.f30148i.skip(p12 + 1);
                return;
            } else {
                this.f30148i.skip(p12 + 1);
                W();
            }
        }
    }

    public final boolean Y() {
        long y22 = this.f30147h.y2(f30146r);
        boolean z10 = y22 != -1;
        wu.e eVar = this.f30148i;
        eVar.skip(z10 ? y22 + r1.I() : eVar.getSize());
        return z10;
    }

    public final void Z() {
        long p12 = this.f30147h.p1(f30145q);
        wu.e eVar = this.f30148i;
        eVar.skip(p12 != -1 ? p12 + 1 : eVar.getSize());
    }

    public final void a0() {
        long p12 = this.f30147h.p1(f30144p);
        wu.e eVar = this.f30148i;
        if (p12 == -1) {
            p12 = eVar.getSize();
        }
        eVar.skip(p12);
    }

    @Override // r7.c
    public void b() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 3) {
            q(1);
            this.f30128d[this.f30126a - 1] = 0;
            this.f30149j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + o() + " at path " + getPath());
        }
    }

    @Override // r7.c
    public void c() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 1) {
            q(3);
            this.f30149j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + o() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30149j = 0;
        this.b[0] = 8;
        this.f30126a = 1;
        this.f30148i.a();
        this.f30147h.close();
    }

    @Override // r7.c
    public void d() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 != 4) {
            throw new a("Expected END_ARRAY but was " + o() + " at path " + getPath());
        }
        int i11 = this.f30126a;
        this.f30126a = i11 - 1;
        int[] iArr = this.f30128d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f30149j = 0;
    }

    @Override // r7.c
    public void e() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 != 2) {
            throw new a("Expected END_OBJECT but was " + o() + " at path " + getPath());
        }
        int i11 = this.f30126a;
        int i12 = i11 - 1;
        this.f30126a = i12;
        this.f30127c[i12] = null;
        int[] iArr = this.f30128d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f30149j = 0;
    }

    @Override // r7.c
    public boolean f() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // r7.c
    public boolean g() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 5) {
            this.f30149j = 0;
            int[] iArr = this.f30128d;
            int i11 = this.f30126a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f30149j = 0;
            int[] iArr2 = this.f30128d;
            int i12 = this.f30126a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + o() + " at path " + getPath());
    }

    @Override // r7.c
    public double h() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 16) {
            this.f30149j = 0;
            int[] iArr = this.f30128d;
            int i11 = this.f30126a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f30150k;
        }
        if (i10 == 17) {
            this.f30152m = this.f30148i.E1(this.f30151l);
        } else if (i10 == 9) {
            this.f30152m = L(f30143o);
        } else if (i10 == 8) {
            this.f30152m = L(f30142n);
        } else if (i10 == 10) {
            this.f30152m = M();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + o() + " at path " + getPath());
        }
        this.f30149j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f30152m);
            if (this.f30129e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.f30152m = null;
                this.f30149j = 0;
                int[] iArr2 = this.f30128d;
                int i12 = this.f30126a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f30152m + " at path " + getPath());
        }
    }

    @Override // r7.c
    public int j() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 16) {
            long j10 = this.f30150k;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f30149j = 0;
                int[] iArr = this.f30128d;
                int i12 = this.f30126a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f30150k + " at path " + getPath());
        }
        if (i10 == 17) {
            this.f30152m = this.f30148i.E1(this.f30151l);
        } else if (i10 == 9 || i10 == 8) {
            String L = i10 == 9 ? L(f30143o) : L(f30142n);
            this.f30152m = L;
            try {
                int parseInt = Integer.parseInt(L);
                this.f30149j = 0;
                int[] iArr2 = this.f30128d;
                int i13 = this.f30126a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + o() + " at path " + getPath());
        }
        this.f30149j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f30152m);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f30152m = null;
                this.f30149j = 0;
                int[] iArr3 = this.f30128d;
                int i15 = this.f30126a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f30152m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f30152m + " at path " + getPath());
        }
    }

    @Override // r7.c
    public String l() {
        String str;
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 14) {
            str = M();
        } else if (i10 == 13) {
            str = L(f30143o);
        } else if (i10 == 12) {
            str = L(f30142n);
        } else {
            if (i10 != 15) {
                throw new a("Expected a name but was " + o() + " at path " + getPath());
            }
            str = this.f30152m;
        }
        this.f30149j = 0;
        this.f30127c[this.f30126a - 1] = str;
        return str;
    }

    @Override // r7.c
    public String m() {
        String E1;
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 10) {
            E1 = M();
        } else if (i10 == 9) {
            E1 = L(f30143o);
        } else if (i10 == 8) {
            E1 = L(f30142n);
        } else if (i10 == 11) {
            E1 = this.f30152m;
            this.f30152m = null;
        } else if (i10 == 16) {
            E1 = Long.toString(this.f30150k);
        } else {
            if (i10 != 17) {
                throw new a("Expected a string but was " + o() + " at path " + getPath());
            }
            E1 = this.f30148i.E1(this.f30151l);
        }
        this.f30149j = 0;
        int[] iArr = this.f30128d;
        int i11 = this.f30126a - 1;
        iArr[i11] = iArr[i11] + 1;
        return E1;
    }

    @Override // r7.c
    public c.b o() {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // r7.c
    public int r(c.a aVar) {
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return F(this.f30152m, aVar);
        }
        int y02 = this.f30147h.y0(aVar.b);
        if (y02 != -1) {
            this.f30149j = 0;
            this.f30127c[this.f30126a - 1] = aVar.f30131a[y02];
            return y02;
        }
        String str = this.f30127c[this.f30126a - 1];
        String l10 = l();
        int F = F(l10, aVar);
        if (F == -1) {
            this.f30149j = 15;
            this.f30152m = l10;
            this.f30127c[this.f30126a - 1] = str;
        }
        return F;
    }

    @Override // r7.c
    public void s() {
        if (this.f30130f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int i10 = this.f30149j;
        if (i10 == 0) {
            i10 = B();
        }
        if (i10 == 14) {
            a0();
        } else if (i10 == 13) {
            X(f30143o);
        } else if (i10 == 12) {
            X(f30142n);
        } else if (i10 != 15) {
            throw new a("Expected a name but was " + o() + " at path " + getPath());
        }
        this.f30149j = 0;
        this.f30127c[this.f30126a - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f30147h + ")";
    }

    @Override // r7.c
    public void u() {
        if (this.f30130f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int i11 = this.f30149j;
            if (i11 == 0) {
                i11 = B();
            }
            if (i11 == 3) {
                q(1);
            } else if (i11 == 1) {
                q(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f30126a--;
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f30126a--;
                } else if (i11 == 14 || i11 == 10) {
                    a0();
                } else if (i11 == 9 || i11 == 13) {
                    X(f30143o);
                } else if (i11 == 8 || i11 == 12) {
                    X(f30142n);
                } else if (i11 == 17) {
                    this.f30148i.skip(this.f30151l);
                } else if (i11 == 18) {
                    throw new a("Expected a value but was " + o() + " at path " + getPath());
                }
                this.f30149j = 0;
            }
            i10++;
            this.f30149j = 0;
        } while (i10 != 0);
        int[] iArr = this.f30128d;
        int i12 = this.f30126a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f30127c[i12 - 1] = "null";
    }

    public final void y() {
        if (!this.f30129e) {
            throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }
}
