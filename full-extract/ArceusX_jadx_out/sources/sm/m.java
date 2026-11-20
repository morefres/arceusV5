package sm;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import wu.f0;

/* loaded from: classes2.dex */
public abstract class m implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f31451a;
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f31452c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f31453d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31454e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31455f;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31456a;

        static {
            int[] iArr = new int[c.values().length];
            f31456a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31456a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31456a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31456a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31456a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31456a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f31457a;
        public final f0 b;

        public b(String[] strArr, f0 f0Var) {
            this.f31457a = strArr;
            this.b = f0Var;
        }

        public static b a(String... strArr) {
            try {
                wu.h[] hVarArr = new wu.h[strArr.length];
                wu.e eVar = new wu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    p.g0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.G2();
                }
                return new b((String[]) strArr.clone(), f0.l(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public m() {
        this.b = new int[32];
        this.f31452c = new String[32];
        this.f31453d = new int[32];
    }

    public static m s(wu.g gVar) {
        return new o(gVar);
    }

    public final Object B() {
        switch (a.f31456a[u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (f()) {
                    arrayList.add(B());
                }
                c();
                return arrayList;
            case 2:
                u uVar = new u();
                b();
                while (f()) {
                    String n10 = n();
                    Object B = B();
                    Object put = uVar.put(n10, B);
                    if (put != null) {
                        throw new j("Map key '" + n10 + "' has multiple values at path " + getPath() + ": " + put + " and " + B);
                    }
                }
                d();
                return uVar;
            case 3:
                return r();
            case 4:
                return Double.valueOf(j());
            case 5:
                return Boolean.valueOf(h());
            case 6:
                return o();
            default:
                throw new IllegalStateException("Expected a value but was " + u() + " at path " + getPath());
        }
    }

    public abstract int F(b bVar);

    public abstract int H(b bVar);

    public final void I(boolean z10) {
        this.f31455f = z10;
    }

    public final void L(boolean z10) {
        this.f31454e = z10;
    }

    public abstract void M();

    public abstract void P();

    public final k U(String str) {
        throw new k(str + " at path " + getPath());
    }

    public final j W(Object obj, Object obj2) {
        if (obj == null) {
            return new j("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new j("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final boolean e() {
        return this.f31455f;
    }

    public abstract boolean f();

    public final boolean g() {
        return this.f31454e;
    }

    public final String getPath() {
        return n.a(this.f31451a, this.b, this.f31452c, this.f31453d);
    }

    public abstract boolean h();

    public abstract double j();

    public abstract int l();

    public abstract long m();

    public abstract String n();

    public abstract <T> T o();

    public abstract wu.g q();

    public abstract String r();

    public abstract c u();

    public abstract m w();

    public abstract void x();

    public final void y(int i10) {
        int i11 = this.f31451a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new j("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f31452c;
            this.f31452c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f31453d;
            this.f31453d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f31451a;
        this.f31451a = i12 + 1;
        iArr3[i12] = i10;
    }

    public m(m mVar) {
        this.f31451a = mVar.f31451a;
        this.b = (int[]) mVar.b.clone();
        this.f31452c = (String[]) mVar.f31452c.clone();
        this.f31453d = (int[]) mVar.f31453d.clone();
        this.f31454e = mVar.f31454e;
        this.f31455f = mVar.f31455f;
    }
}
