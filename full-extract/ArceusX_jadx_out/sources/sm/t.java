package sm;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class t implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    public String f31507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31509g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31510h;

    /* renamed from: a, reason: collision with root package name */
    public int f31504a = 0;
    public int[] b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f31505c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f31506d = new int[32];

    /* renamed from: i, reason: collision with root package name */
    public int f31511i = -1;

    public static t q(wu.f fVar) {
        return new p(fVar);
    }

    public final void B(boolean z10) {
        this.f31509g = z10;
    }

    public abstract t F(double d10);

    public abstract t H(long j10);

    public abstract t I(Boolean bool);

    public abstract t L(Number number);

    public abstract t M(String str);

    public final t P(wu.g gVar) {
        if (this.f31510h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        wu.f W = W();
        try {
            gVar.K2(W);
            if (W != null) {
                W.close();
            }
            return this;
        } catch (Throwable th2) {
            if (W != null) {
                try {
                    W.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract t U(boolean z10);

    public abstract wu.f W();

    public abstract t a();

    public final int b() {
        int r8 = r();
        if (r8 != 5 && r8 != 3 && r8 != 2 && r8 != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f31511i;
        this.f31511i = this.f31504a;
        return i10;
    }

    public abstract t c();

    public final boolean d() {
        int i10 = this.f31504a;
        int[] iArr = this.b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new j("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f31505c;
        this.f31505c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f31506d;
        this.f31506d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof s)) {
            return true;
        }
        s sVar = (s) this;
        Object[] objArr = sVar.f31501j;
        sVar.f31501j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract t e();

    public final void f(int i10) {
        this.f31511i = i10;
    }

    public abstract t g();

    public final String getPath() {
        return n.a(this.f31504a, this.b, this.f31505c, this.f31506d);
    }

    public final String h() {
        String str = this.f31507e;
        return str != null ? str : "";
    }

    public final boolean j() {
        return this.f31509g;
    }

    public final boolean l() {
        return this.f31508f;
    }

    public final t m(Object obj) {
        if (obj instanceof Map) {
            c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                n((String) key);
                m(entry.getValue());
            }
            g();
            return this;
        }
        if (obj instanceof List) {
            a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m(it.next());
            }
            e();
            return this;
        }
        if (obj instanceof String) {
            M((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            U(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            F(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            H(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            L((Number) obj);
            return this;
        }
        if (obj == null) {
            o();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public abstract t n(String str);

    public abstract t o();

    public final int r() {
        int i10 = this.f31504a;
        if (i10 != 0) {
            return this.b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void s() {
        int r8 = r();
        if (r8 != 5 && r8 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f31510h = true;
    }

    public final void u(int i10) {
        int[] iArr = this.b;
        int i11 = this.f31504a;
        this.f31504a = i11 + 1;
        iArr[i11] = i10;
    }

    public final void w(int i10) {
        this.b[this.f31504a - 1] = i10;
    }

    public void x(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f31507e = str;
    }

    public final void y(boolean z10) {
        this.f31508f = z10;
    }
}
