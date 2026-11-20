package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class j0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f30207a;
    public final byte[] b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30208a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30208a = iArr;
            try {
                iArr[af.p0.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30208a[af.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30208a[af.p0.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30208a[af.p0.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j0(pe.a aVar, byte[] bArr) {
        this.f30207a = aVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static pe.a c(pe.a aVar, ef.a aVar2) {
        return new j0(aVar, aVar2.d());
    }

    public static pe.a d(we.p pVar) {
        byte[] d10;
        we.l0 b = pVar.b(pe.j.a());
        pe.a aVar = (pe.a) we.o0.d().e(af.f0.h0().D(b.f()).E(b.g()).C(b.d()).build(), pe.a.class);
        af.p0 e10 = b.e();
        int i10 = a.f30208a[e10.ordinal()];
        if (i10 == 1) {
            d10 = we.e0.f34207a.d();
        } else if (i10 == 2 || i10 == 3) {
            d10 = we.e0.a(pVar.a().intValue()).d();
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + e10);
            }
            d10 = we.e0.b(pVar.a().intValue()).d();
        }
        return new j0(aVar, d10);
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.f30207a.a(bArr, bArr2) : df.e.a(bArr3, this.f30207a.a(bArr, bArr2));
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.f30207a.b(bArr, bArr2);
        }
        if (we.s0.e(bArr3, bArr)) {
            return this.f30207a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
