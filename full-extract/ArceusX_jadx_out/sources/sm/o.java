package sm;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import sm.m;

/* loaded from: classes2.dex */
public final class o extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final wu.h f31468n = wu.h.e("'\\");

    /* renamed from: o, reason: collision with root package name */
    public static final wu.h f31469o = wu.h.e("\"\\");

    /* renamed from: p, reason: collision with root package name */
    public static final wu.h f31470p = wu.h.e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q, reason: collision with root package name */
    public static final wu.h f31471q = wu.h.e("\n\r");

    /* renamed from: r, reason: collision with root package name */
    public static final wu.h f31472r = wu.h.e("*/");

    /* renamed from: g, reason: collision with root package name */
    public final wu.g f31473g;

    /* renamed from: h, reason: collision with root package name */
    public final wu.e f31474h;

    /* renamed from: i, reason: collision with root package name */
    public int f31475i;

    /* renamed from: j, reason: collision with root package name */
    public long f31476j;

    /* renamed from: k, reason: collision with root package name */
    public int f31477k;

    /* renamed from: l, reason: collision with root package name */
    public String f31478l;

    /* renamed from: m, reason: collision with root package name */
    public r f31479m;

    public o(wu.g gVar) {
        this.f31475i = 0;
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f31473g = gVar;
        this.f31474h = gVar.getBufferField();
        y(6);
    }

    public final void B0() {
        long p12 = this.f31473g.p1(f31470p);
        wu.e eVar = this.f31474h;
        if (p12 == -1) {
            p12 = eVar.getSize();
        }
        eVar.skip(p12);
    }

    @Override // sm.m
    public int F(m.b bVar) {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return Z(this.f31478l, bVar);
        }
        int y02 = this.f31473g.y0(bVar.b);
        if (y02 != -1) {
            this.f31475i = 0;
            this.f31452c[this.f31451a - 1] = bVar.f31457a[y02];
            return y02;
        }
        String str = this.f31452c[this.f31451a - 1];
        String n10 = n();
        int Z = Z(n10, bVar);
        if (Z == -1) {
            this.f31475i = 15;
            this.f31478l = n10;
            this.f31452c[this.f31451a - 1] = str;
        }
        return Z;
    }

    @Override // sm.m
    public int H(m.b bVar) {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 < 8 || i10 > 11) {
            return -1;
        }
        if (i10 == 11) {
            return a0(this.f31478l, bVar);
        }
        int y02 = this.f31473g.y0(bVar.b);
        if (y02 != -1) {
            this.f31475i = 0;
            int[] iArr = this.f31453d;
            int i11 = this.f31451a - 1;
            iArr[i11] = iArr[i11] + 1;
            return y02;
        }
        String r8 = r();
        int a02 = a0(r8, bVar);
        if (a02 == -1) {
            this.f31475i = 11;
            this.f31478l = r8;
            this.f31453d[this.f31451a - 1] = r0[r1] - 1;
        }
        return a02;
    }

    @Override // sm.m
    public void M() {
        if (this.f31455f) {
            m.c u8 = u();
            n();
            throw new j("Cannot skip unexpected " + u8 + " at " + getPath());
        }
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 14) {
            B0();
        } else if (i10 == 13) {
            v0(f31469o);
        } else if (i10 == 12) {
            v0(f31468n);
        } else if (i10 != 15) {
            throw new j("Expected a name but was " + u() + " at path " + getPath());
        }
        this.f31475i = 0;
        this.f31452c[this.f31451a - 1] = "null";
    }

    @Override // sm.m
    public void P() {
        if (this.f31455f) {
            throw new j("Cannot skip unexpected " + u() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int i11 = this.f31475i;
            if (i11 == 0) {
                i11 = Y();
            }
            if (i11 == 3) {
                y(1);
            } else if (i11 == 1) {
                y(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f31451a--;
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f31451a--;
                } else if (i11 == 14 || i11 == 10) {
                    B0();
                } else if (i11 == 9 || i11 == 13) {
                    v0(f31469o);
                } else if (i11 == 8 || i11 == 12) {
                    v0(f31468n);
                } else if (i11 == 17) {
                    this.f31474h.skip(this.f31477k);
                } else if (i11 == 18) {
                    throw new j("Expected a value but was " + u() + " at path " + getPath());
                }
                this.f31475i = 0;
            }
            i10++;
            this.f31475i = 0;
        } while (i10 != 0);
        int[] iArr = this.f31453d;
        int i12 = this.f31451a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f31452c[i12 - 1] = "null";
    }

    public final void X() {
        if (!this.f31454e) {
            throw U("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int Y() {
        int[] iArr = this.b;
        int i10 = this.f31451a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int e02 = e0(true);
            this.f31474h.readByte();
            if (e02 != 44) {
                if (e02 != 59) {
                    if (e02 != 93) {
                        throw U("Unterminated array");
                    }
                    this.f31475i = 4;
                    return 4;
                }
                X();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int e03 = e0(true);
                    this.f31474h.readByte();
                    if (e03 != 44) {
                        if (e03 != 59) {
                            if (e03 != 125) {
                                throw U("Unterminated object");
                            }
                            this.f31475i = 2;
                            return 2;
                        }
                        X();
                    }
                }
                int e04 = e0(true);
                if (e04 == 34) {
                    this.f31474h.readByte();
                    this.f31475i = 13;
                    return 13;
                }
                if (e04 == 39) {
                    this.f31474h.readByte();
                    X();
                    this.f31475i = 12;
                    return 12;
                }
                if (e04 != 125) {
                    X();
                    if (!c0((char) e04)) {
                        throw U("Expected name");
                    }
                    this.f31475i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw U("Expected name");
                }
                this.f31474h.readByte();
                this.f31475i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int e05 = e0(true);
                this.f31474h.readByte();
                if (e05 != 58) {
                    if (e05 != 61) {
                        throw U("Expected ':'");
                    }
                    X();
                    if (this.f31473g.request(1L) && this.f31474h.j(0L) == 62) {
                        this.f31474h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (e0(false) == -1) {
                    this.f31475i = 18;
                    return 18;
                }
                X();
            } else {
                if (i11 == 9) {
                    this.f31479m.b();
                    this.f31479m = null;
                    this.f31451a--;
                    return Y();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int e06 = e0(true);
        if (e06 == 34) {
            this.f31474h.readByte();
            this.f31475i = 9;
            return 9;
        }
        if (e06 == 39) {
            X();
            this.f31474h.readByte();
            this.f31475i = 8;
            return 8;
        }
        if (e06 != 44 && e06 != 59) {
            if (e06 == 91) {
                this.f31474h.readByte();
                this.f31475i = 3;
                return 3;
            }
            if (e06 != 93) {
                if (e06 == 123) {
                    this.f31474h.readByte();
                    this.f31475i = 1;
                    return 1;
                }
                int o02 = o0();
                if (o02 != 0) {
                    return o02;
                }
                int q02 = q0();
                if (q02 != 0) {
                    return q02;
                }
                if (!c0(this.f31474h.j(0L))) {
                    throw U("Expected value");
                }
                X();
                this.f31475i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f31474h.readByte();
                this.f31475i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw U("Unexpected value");
        }
        X();
        this.f31475i = 7;
        return 7;
    }

    public final int Z(String str, m.b bVar) {
        int length = bVar.f31457a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f31457a[i10])) {
                this.f31475i = 0;
                this.f31452c[this.f31451a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // sm.m
    public void a() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 3) {
            y(1);
            this.f31453d[this.f31451a - 1] = 0;
            this.f31475i = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + u() + " at path " + getPath());
        }
    }

    public final int a0(String str, m.b bVar) {
        int length = bVar.f31457a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f31457a[i10])) {
                this.f31475i = 0;
                int[] iArr = this.f31453d;
                int i11 = this.f31451a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // sm.m
    public void b() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 1) {
            y(3);
            this.f31475i = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + u() + " at path " + getPath());
    }

    @Override // sm.m
    public void c() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 != 4) {
            throw new j("Expected END_ARRAY but was " + u() + " at path " + getPath());
        }
        int i11 = this.f31451a;
        this.f31451a = i11 - 1;
        int[] iArr = this.f31453d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f31475i = 0;
    }

    public final boolean c0(int i10) {
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
        X();
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31475i = 0;
        this.b[0] = 8;
        this.f31451a = 1;
        this.f31474h.a();
        this.f31473g.close();
    }

    @Override // sm.m
    public void d() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 != 2) {
            throw new j("Expected END_OBJECT but was " + u() + " at path " + getPath());
        }
        int i11 = this.f31451a;
        int i12 = i11 - 1;
        this.f31451a = i12;
        this.f31452c[i12] = null;
        int[] iArr = this.f31453d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f31475i = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f31474h.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        X();
        x0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f31473g.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        X();
        r3 = r6.f31474h.j(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f31474h.readByte();
        r6.f31474h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (w0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw U("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f31474h.readByte();
        r6.f31474h.readByte();
        x0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            wu.g r2 = r6.f31473g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            wu.e r2 = r6.f31474h
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
            wu.e r3 = r6.f31474h
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            wu.g r3 = r6.f31473g
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.X()
            wu.e r3 = r6.f31474h
            r4 = 1
            byte r3 = r3.j(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            wu.e r1 = r6.f31474h
            r1.readByte()
            wu.e r1 = r6.f31474h
            r1.readByte()
            r6.x0()
            goto L1
        L5a:
            wu.e r1 = r6.f31474h
            r1.readByte()
            wu.e r1 = r6.f31474h
            r1.readByte()
            boolean r1 = r6.w0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            sm.k r7 = r6.U(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.X()
            r6.x0()
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
        throw new UnsupportedOperationException("Method not decompiled: sm.o.e0(boolean):int");
    }

    @Override // sm.m
    public boolean f() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public final String g0(wu.h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long p12 = this.f31473g.p1(hVar);
            if (p12 == -1) {
                throw U("Unterminated string");
            }
            if (this.f31474h.j(p12) != 92) {
                if (sb2 == null) {
                    String E1 = this.f31474h.E1(p12);
                    this.f31474h.readByte();
                    return E1;
                }
                sb2.append(this.f31474h.E1(p12));
                this.f31474h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f31474h.E1(p12));
            this.f31474h.readByte();
            sb2.append(u0());
        }
    }

    @Override // sm.m
    public boolean h() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 5) {
            this.f31475i = 0;
            int[] iArr = this.f31453d;
            int i11 = this.f31451a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f31475i = 0;
            int[] iArr2 = this.f31453d;
            int i12 = this.f31451a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + u() + " at path " + getPath());
    }

    @Override // sm.m
    public double j() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 16) {
            this.f31475i = 0;
            int[] iArr = this.f31453d;
            int i11 = this.f31451a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f31476j;
        }
        if (i10 == 17) {
            this.f31478l = this.f31474h.E1(this.f31477k);
        } else if (i10 == 9) {
            this.f31478l = g0(f31469o);
        } else if (i10 == 8) {
            this.f31478l = g0(f31468n);
        } else if (i10 == 10) {
            this.f31478l = j0();
        } else if (i10 != 11) {
            throw new j("Expected a double but was " + u() + " at path " + getPath());
        }
        this.f31475i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31478l);
            if (this.f31454e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.f31478l = null;
                this.f31475i = 0;
                int[] iArr2 = this.f31453d;
                int i12 = this.f31451a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new k("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f31478l + " at path " + getPath());
        }
    }

    public final String j0() {
        long p12 = this.f31473g.p1(f31470p);
        return p12 != -1 ? this.f31474h.E1(p12) : this.f31474h.S2();
    }

    @Override // sm.m
    public int l() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 16) {
            long j10 = this.f31476j;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f31475i = 0;
                int[] iArr = this.f31453d;
                int i12 = this.f31451a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new j("Expected an int but was " + this.f31476j + " at path " + getPath());
        }
        if (i10 == 17) {
            this.f31478l = this.f31474h.E1(this.f31477k);
        } else if (i10 == 9 || i10 == 8) {
            String g02 = i10 == 9 ? g0(f31469o) : g0(f31468n);
            this.f31478l = g02;
            try {
                int parseInt = Integer.parseInt(g02);
                this.f31475i = 0;
                int[] iArr2 = this.f31453d;
                int i13 = this.f31451a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new j("Expected an int but was " + u() + " at path " + getPath());
        }
        this.f31475i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31478l);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f31478l = null;
                this.f31475i = 0;
                int[] iArr3 = this.f31453d;
                int i15 = this.f31451a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new j("Expected an int but was " + this.f31478l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f31478l + " at path " + getPath());
        }
    }

    @Override // sm.m
    public long m() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 16) {
            this.f31475i = 0;
            int[] iArr = this.f31453d;
            int i11 = this.f31451a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f31476j;
        }
        if (i10 == 17) {
            this.f31478l = this.f31474h.E1(this.f31477k);
        } else if (i10 == 9 || i10 == 8) {
            String g02 = i10 == 9 ? g0(f31469o) : g0(f31468n);
            this.f31478l = g02;
            try {
                long parseLong = Long.parseLong(g02);
                this.f31475i = 0;
                int[] iArr2 = this.f31453d;
                int i12 = this.f31451a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new j("Expected a long but was " + u() + " at path " + getPath());
        }
        this.f31475i = 11;
        try {
            long longValueExact = new BigDecimal(this.f31478l).longValueExact();
            this.f31478l = null;
            this.f31475i = 0;
            int[] iArr3 = this.f31453d;
            int i13 = this.f31451a - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new j("Expected a long but was " + this.f31478l + " at path " + getPath());
        }
    }

    @Override // sm.m
    public String n() {
        String str;
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 14) {
            str = j0();
        } else if (i10 == 13) {
            str = g0(f31469o);
        } else if (i10 == 12) {
            str = g0(f31468n);
        } else {
            if (i10 != 15) {
                throw new j("Expected a name but was " + u() + " at path " + getPath());
            }
            str = this.f31478l;
            this.f31478l = null;
        }
        this.f31475i = 0;
        this.f31452c[this.f31451a - 1] = str;
        return str;
    }

    @Override // sm.m
    public <T> T o() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 7) {
            this.f31475i = 0;
            int[] iArr = this.f31453d;
            int i11 = this.f31451a - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        throw new j("Expected null but was " + u() + " at path " + getPath());
    }

    public final int o0() {
        String str;
        String str2;
        int i10;
        byte j10 = this.f31474h.j(0L);
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
            if (!this.f31473g.request(i12)) {
                return 0;
            }
            byte j11 = this.f31474h.j(i11);
            if (j11 != str.charAt(i11) && j11 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f31473g.request(length + 1) && c0(this.f31474h.j(length))) {
            return 0;
        }
        this.f31474h.skip(length);
        this.f31475i = i10;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    @Override // sm.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wu.g q() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.o.q():wu.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (c0(r1) != false) goto L66;
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
    
        r19.f31476j = r8;
        r19.f31474h.skip(r5);
        r19.f31475i = 16;
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
    
        r19.f31477k = r5;
        r19.f31475i = 17;
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
    public final int q0() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.o.q0():int");
    }

    @Override // sm.m
    public String r() {
        String E1;
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        if (i10 == 10) {
            E1 = j0();
        } else if (i10 == 9) {
            E1 = g0(f31469o);
        } else if (i10 == 8) {
            E1 = g0(f31468n);
        } else if (i10 == 11) {
            E1 = this.f31478l;
            this.f31478l = null;
        } else if (i10 == 16) {
            E1 = Long.toString(this.f31476j);
        } else {
            if (i10 != 17) {
                throw new j("Expected a string but was " + u() + " at path " + getPath());
            }
            E1 = this.f31474h.E1(this.f31477k);
        }
        this.f31475i = 0;
        int[] iArr = this.f31453d;
        int i11 = this.f31451a - 1;
        iArr[i11] = iArr[i11] + 1;
        return E1;
    }

    public String toString() {
        return "JsonReader(" + this.f31473g + ")";
    }

    @Override // sm.m
    public m.c u() {
        int i10 = this.f31475i;
        if (i10 == 0) {
            i10 = Y();
        }
        switch (i10) {
            case 1:
                return m.c.BEGIN_OBJECT;
            case 2:
                return m.c.END_OBJECT;
            case 3:
                return m.c.BEGIN_ARRAY;
            case 4:
                return m.c.END_ARRAY;
            case 5:
            case 6:
                return m.c.BOOLEAN;
            case 7:
                return m.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return m.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return m.c.NAME;
            case 16:
            case 17:
                return m.c.NUMBER;
            case 18:
                return m.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char u0() {
        int i10;
        if (!this.f31473g.request(1L)) {
            throw U("Unterminated escape sequence");
        }
        byte readByte = this.f31474h.readByte();
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
            if (this.f31454e) {
                return (char) readByte;
            }
            throw U("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f31473g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte j10 = this.f31474h.j(i11);
            char c11 = (char) (c10 << 4);
            if (j10 >= 48 && j10 <= 57) {
                i10 = j10 - 48;
            } else if (j10 >= 97 && j10 <= 102) {
                i10 = j10 - 87;
            } else {
                if (j10 < 65 || j10 > 70) {
                    throw U("\\u" + this.f31474h.E1(4L));
                }
                i10 = j10 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f31474h.skip(4L);
        return c10;
    }

    public final void v0(wu.h hVar) {
        while (true) {
            long p12 = this.f31473g.p1(hVar);
            if (p12 == -1) {
                throw U("Unterminated string");
            }
            if (this.f31474h.j(p12) != 92) {
                this.f31474h.skip(p12 + 1);
                return;
            } else {
                this.f31474h.skip(p12 + 1);
                u0();
            }
        }
    }

    @Override // sm.m
    public m w() {
        return new o(this);
    }

    public final boolean w0() {
        long y22 = this.f31473g.y2(f31472r);
        boolean z10 = y22 != -1;
        wu.e eVar = this.f31474h;
        eVar.skip(z10 ? y22 + r1.I() : eVar.getSize());
        return z10;
    }

    @Override // sm.m
    public void x() {
        if (f()) {
            this.f31478l = n();
            this.f31475i = 11;
        }
    }

    public final void x0() {
        long p12 = this.f31473g.p1(f31471q);
        wu.e eVar = this.f31474h;
        eVar.skip(p12 != -1 ? p12 + 1 : eVar.getSize());
    }

    public o(o oVar) {
        super(oVar);
        this.f31475i = 0;
        wu.g peek = oVar.f31473g.peek();
        this.f31473g = peek;
        this.f31474h = peek.getBufferField();
        this.f31475i = oVar.f31475i;
        this.f31476j = oVar.f31476j;
        this.f31477k = oVar.f31477k;
        this.f31478l = oVar.f31478l;
        try {
            peek.v1(oVar.f31474h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
