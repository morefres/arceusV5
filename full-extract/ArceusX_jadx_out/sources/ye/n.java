package ye;

import af.f0;
import af.p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import pe.w;
import we.e0;
import we.l0;
import we.o0;
import we.p;

/* loaded from: classes2.dex */
public final class n implements w {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f36594d = {0};

    /* renamed from: a, reason: collision with root package name */
    public final w f36595a;
    public final p0 b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f36596c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36597a;

        static {
            int[] iArr = new int[p0.values().length];
            f36597a = iArr;
            try {
                iArr[p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36597a[p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36597a[p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36597a[p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n(w wVar, p0 p0Var, byte[] bArr) {
        this.f36595a = wVar;
        this.b = p0Var;
        this.f36596c = bArr;
    }

    public static w c(p pVar) {
        byte[] d10;
        l0 b = pVar.b(pe.j.a());
        w wVar = (w) o0.d().e(f0.h0().D(b.f()).E(b.g()).C(b.d()).build(), w.class);
        p0 e10 = b.e();
        int i10 = a.f36597a[e10.ordinal()];
        if (i10 == 1) {
            d10 = e0.f34207a.d();
        } else if (i10 == 2 || i10 == 3) {
            d10 = e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            d10 = e0.b(pVar.a().intValue()).d();
        }
        return new n(wVar, e10, d10);
    }

    @Override // pe.w
    public void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.b.equals(p0.LEGACY)) {
            bArr2 = df.e.a(bArr2, f36594d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.b.equals(p0.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.f36596c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f36595a.a(bArr, bArr2);
    }

    @Override // pe.w
    public byte[] b(byte[] bArr) {
        if (this.b.equals(p0.LEGACY)) {
            bArr = df.e.a(bArr, f36594d);
        }
        return df.e.a(this.f36596c, this.f36595a.b(bArr));
    }
}
