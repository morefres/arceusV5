package r7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import wu.f0;
import wu.g;
import wu.h;

/* loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f30125g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f30126a;
    public int[] b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f30127c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f30128d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    public boolean f30129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30130f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f30131a;
        public final f0 b;

        public a(String[] strArr, f0 f0Var) {
            this.f30131a = strArr;
            this.b = f0Var;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                wu.e eVar = new wu.e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.w(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.G2();
                }
                return new a((String[]) strArr.clone(), f0.l(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
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

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f30125g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f30125g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c n(g gVar) {
        return new e(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(wu.f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = r7.c.f30125g
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
        throw new UnsupportedOperationException("Method not decompiled: r7.c.w(wu.f, java.lang.String):void");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public final String getPath() {
        return d.a(this.f30126a, this.b, this.f30127c, this.f30128d);
    }

    public abstract double h();

    public abstract int j();

    public abstract String l();

    public abstract String m();

    public abstract b o();

    public final void q(int i10) {
        int i11 = this.f30126a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new r7.a("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f30127c;
            this.f30127c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f30128d;
            this.f30128d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i12 = this.f30126a;
        this.f30126a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int r(a aVar);

    public abstract void s();

    public abstract void u();

    public final r7.b x(String str) {
        throw new r7.b(str + " at path " + getPath());
    }
}
