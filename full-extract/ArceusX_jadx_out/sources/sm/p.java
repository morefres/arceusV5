package sm;

import java.io.IOException;
import wu.b0;
import wu.p0;
import wu.s0;

/* loaded from: classes2.dex */
public final class p extends t {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f31480m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    public final wu.f f31481j;

    /* renamed from: k, reason: collision with root package name */
    public String f31482k = ":";

    /* renamed from: l, reason: collision with root package name */
    public String f31483l;

    public class a implements p0 {
        public a() {
        }

        @Override // wu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (p.this.r() != 9) {
                throw new AssertionError();
            }
            p pVar = p.this;
            int i10 = pVar.f31504a;
            pVar.f31504a = i10 - 1;
            int[] iArr = pVar.f31506d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // wu.p0, java.io.Flushable
        public void flush() {
            p.this.f31481j.flush();
        }

        @Override // wu.p0
        /* renamed from: timeout */
        public s0 getTimeout() {
            return s0.NONE;
        }

        @Override // wu.p0
        public void write(wu.e eVar, long j10) {
            p.this.f31481j.write(eVar, j10);
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31480m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31480m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public p(wu.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f31481j = fVar;
        u(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g0(wu.f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = sm.p.f31480m
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.I0(r8, r4, r3)
        L2e:
            r7.A0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.I0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.p.g0(wu.f, java.lang.String):void");
    }

    @Override // sm.t
    public t F(double d10) {
        if (!this.f31508f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f31510h) {
            this.f31510h = false;
            return n(Double.toString(d10));
        }
        j0();
        Z();
        this.f31481j.A0(Double.toString(d10));
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t H(long j10) {
        if (this.f31510h) {
            this.f31510h = false;
            return n(Long.toString(j10));
        }
        j0();
        Z();
        this.f31481j.A0(Long.toString(j10));
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t I(Boolean bool) {
        return bool == null ? o() : U(bool.booleanValue());
    }

    @Override // sm.t
    public t L(Number number) {
        if (number == null) {
            return o();
        }
        String obj = number.toString();
        if (!this.f31508f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f31510h) {
            this.f31510h = false;
            return n(obj);
        }
        j0();
        Z();
        this.f31481j.A0(obj);
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t M(String str) {
        if (str == null) {
            return o();
        }
        if (this.f31510h) {
            this.f31510h = false;
            return n(str);
        }
        j0();
        Z();
        g0(this.f31481j, str);
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t U(boolean z10) {
        if (this.f31510h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        j0();
        Z();
        this.f31481j.A0(z10 ? "true" : "false");
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public wu.f W() {
        if (this.f31510h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        j0();
        Z();
        u(9);
        return b0.b(new a());
    }

    public final void Y() {
        int r8 = r();
        if (r8 == 5) {
            this.f31481j.writeByte(44);
        } else if (r8 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        c0();
        w(4);
    }

    public final void Z() {
        int r8 = r();
        int i10 = 2;
        if (r8 != 1) {
            if (r8 != 2) {
                if (r8 == 4) {
                    this.f31481j.A0(this.f31482k);
                    i10 = 5;
                } else {
                    if (r8 == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    i10 = 7;
                    if (r8 != 6) {
                        if (r8 != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.f31508f) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                }
                w(i10);
            }
            this.f31481j.writeByte(44);
        }
        c0();
        w(i10);
    }

    @Override // sm.t
    public t a() {
        if (!this.f31510h) {
            j0();
            return e0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    public final t a0(int i10, int i11, char c10) {
        int r8 = r();
        if (r8 != i11 && r8 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f31483l != null) {
            throw new IllegalStateException("Dangling name: " + this.f31483l);
        }
        int i12 = this.f31504a;
        int i13 = this.f31511i;
        if (i12 == (~i13)) {
            this.f31511i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f31504a = i14;
        this.f31505c[i14] = null;
        int[] iArr = this.f31506d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (r8 == i11) {
            c0();
        }
        this.f31481j.writeByte(c10);
        return this;
    }

    @Override // sm.t
    public t c() {
        if (!this.f31510h) {
            j0();
            return e0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public final void c0() {
        if (this.f31507e == null) {
            return;
        }
        this.f31481j.writeByte(10);
        int i10 = this.f31504a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f31481j.A0(this.f31507e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31481j.close();
        int i10 = this.f31504a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31504a = 0;
    }

    @Override // sm.t
    public t e() {
        return a0(1, 2, ']');
    }

    public final t e0(int i10, int i11, char c10) {
        int i12 = this.f31504a;
        int i13 = this.f31511i;
        if (i12 == i13) {
            int[] iArr = this.b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f31511i = ~i13;
                return this;
            }
        }
        Z();
        d();
        u(i10);
        this.f31506d[this.f31504a - 1] = 0;
        this.f31481j.writeByte(c10);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f31504a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f31481j.flush();
    }

    @Override // sm.t
    public t g() {
        this.f31510h = false;
        return a0(3, 5, '}');
    }

    public final void j0() {
        if (this.f31483l != null) {
            Y();
            g0(this.f31481j, this.f31483l);
            this.f31483l = null;
        }
    }

    @Override // sm.t
    public t n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f31504a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int r8 = r();
        if ((r8 != 3 && r8 != 5) || this.f31483l != null || this.f31510h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f31483l = str;
        this.f31505c[this.f31504a - 1] = str;
        return this;
    }

    @Override // sm.t
    public t o() {
        if (this.f31510h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f31483l != null) {
            if (!this.f31509g) {
                this.f31483l = null;
                return this;
            }
            j0();
        }
        Z();
        this.f31481j.A0("null");
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public void x(String str) {
        super.x(str);
        this.f31482k = !str.isEmpty() ? ": " : ":";
    }
}
