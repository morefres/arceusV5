package cf;

import af.p0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import we.l0;
import we.s0;

/* loaded from: classes2.dex */
public final class p implements pe.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a0 f4888a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4889c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4890a;

        static {
            int[] iArr = new int[p0.values().length];
            f4890a = iArr;
            try {
                iArr[p0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4890a[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4890a[p0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4890a[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public p(pe.a0 a0Var, byte[] bArr, byte[] bArr2) {
        this.f4888a = a0Var;
        this.b = bArr;
        this.f4889c = bArr2;
    }

    public static pe.a0 b(we.p pVar) {
        l0 b = pVar.b(pe.j.a());
        return new p((pe.a0) pe.b0.c(af.f0.h0().D(b.f()).E(b.g()).C(b.d()).build(), pe.a0.class), d(b), c(b));
    }

    public static byte[] c(l0 l0Var) {
        return l0Var.e().equals(p0.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] d(l0 l0Var) {
        int i10 = a.f4890a[l0Var.e().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return we.e0.a(l0Var.c().intValue()).d();
        }
        if (i10 == 3) {
            return we.e0.b(l0Var.c().intValue()).d();
        }
        if (i10 == 4) {
            return we.e0.f34207a.d();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0 && this.f4889c.length == 0) {
            this.f4888a.a(bArr, bArr2);
            return;
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.f4889c;
        if (bArr4.length != 0) {
            bArr2 = df.e.a(bArr2, bArr4);
        }
        this.f4888a.a(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
    }
}
