package sm;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import wu.b0;
import wu.p0;

/* loaded from: classes2.dex */
public final class s extends t {

    /* renamed from: j, reason: collision with root package name */
    public Object[] f31501j = new Object[32];

    /* renamed from: k, reason: collision with root package name */
    public String f31502k;

    public class a extends wu.o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wu.e f31503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0 p0Var, wu.e eVar) {
            super(p0Var);
            this.f31503a = eVar;
        }

        @Override // wu.o, wu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.this.r() == 9) {
                s sVar = s.this;
                Object[] objArr = sVar.f31501j;
                int i10 = sVar.f31504a;
                if (objArr[i10] == null) {
                    sVar.f31504a = i10 - 1;
                    Object B = m.s(this.f31503a).B();
                    s sVar2 = s.this;
                    boolean z10 = sVar2.f31509g;
                    sVar2.f31509g = true;
                    try {
                        sVar2.Y(B);
                        s sVar3 = s.this;
                        sVar3.f31509g = z10;
                        int[] iArr = sVar3.f31506d;
                        int i11 = sVar3.f31504a - 1;
                        iArr[i11] = iArr[i11] + 1;
                        return;
                    } catch (Throwable th2) {
                        s.this.f31509g = z10;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public s() {
        u(6);
    }

    @Override // sm.t
    public t F(double d10) {
        if (!this.f31508f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f31510h) {
            this.f31510h = false;
            return n(Double.toString(d10));
        }
        Y(Double.valueOf(d10));
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
        Y(Long.valueOf(j10));
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t I(Boolean bool) {
        if (this.f31510h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        Y(bool);
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t L(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return H(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return F(number.doubleValue());
        }
        if (number == null) {
            return o();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f31510h) {
            this.f31510h = false;
            return n(bigDecimal.toString());
        }
        Y(bigDecimal);
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t M(String str) {
        if (this.f31510h) {
            this.f31510h = false;
            return n(str);
        }
        Y(str);
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
        Y(Boolean.valueOf(z10));
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
        if (r() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        u(9);
        wu.e eVar = new wu.e();
        return b0.b(new a(eVar, eVar));
    }

    public final s Y(Object obj) {
        String str;
        Object put;
        int r8 = r();
        int i10 = this.f31504a;
        if (i10 == 1) {
            if (r8 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[i10 - 1] = 7;
            this.f31501j[i10 - 1] = obj;
            return this;
        }
        if (r8 != 3 || (str = this.f31502k) == null) {
            if (r8 == 1) {
                ((List) this.f31501j[i10 - 1]).add(obj);
                return this;
            }
            if (r8 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f31509g) || (put = ((Map) this.f31501j[i10 - 1]).put(str, obj)) == null) {
            this.f31502k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f31502k + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
    }

    public Object Z() {
        int i10 = this.f31504a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f31501j[0];
    }

    @Override // sm.t
    public t a() {
        if (this.f31510h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f31504a;
        int i11 = this.f31511i;
        if (i10 == i11 && this.b[i10 - 1] == 1) {
            this.f31511i = ~i11;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        Y(arrayList);
        Object[] objArr = this.f31501j;
        int i12 = this.f31504a;
        objArr[i12] = arrayList;
        this.f31506d[i12] = 0;
        u(1);
        return this;
    }

    @Override // sm.t
    public t c() {
        if (this.f31510h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f31504a;
        int i11 = this.f31511i;
        if (i10 == i11 && this.b[i10 - 1] == 3) {
            this.f31511i = ~i11;
            return this;
        }
        d();
        u uVar = new u();
        Y(uVar);
        this.f31501j[this.f31504a] = uVar;
        u(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i10 = this.f31504a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31504a = 0;
    }

    @Override // sm.t
    public t e() {
        if (r() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f31504a;
        int i11 = this.f31511i;
        if (i10 == (~i11)) {
            this.f31511i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f31504a = i12;
        this.f31501j[i12] = null;
        int[] iArr = this.f31506d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f31504a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // sm.t
    public t g() {
        if (r() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f31502k != null) {
            throw new IllegalStateException("Dangling name: " + this.f31502k);
        }
        int i10 = this.f31504a;
        int i11 = this.f31511i;
        if (i10 == (~i11)) {
            this.f31511i = ~i11;
            return this;
        }
        this.f31510h = false;
        int i12 = i10 - 1;
        this.f31504a = i12;
        this.f31501j[i12] = null;
        this.f31505c[i12] = null;
        int[] iArr = this.f31506d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // sm.t
    public t n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f31504a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (r() != 3 || this.f31502k != null || this.f31510h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f31502k = str;
        this.f31505c[this.f31504a - 1] = str;
        return this;
    }

    @Override // sm.t
    public t o() {
        if (this.f31510h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        Y(null);
        int[] iArr = this.f31506d;
        int i10 = this.f31504a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
