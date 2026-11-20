package df;

import bf.a;
import df.k;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import ue.b;
import we.s0;

/* loaded from: classes2.dex */
public final class h implements pe.a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final b.EnumC0592b f14647g = b.EnumC0592b.b;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14648h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14649i = {0};

    /* renamed from: j, reason: collision with root package name */
    public static final we.h<o, a.d> f14650j = we.h.a().a(o.SHA256, a.d.b).a(o.SHA384, a.d.f4018c).a(o.SHA512, a.d.f4019d).b();

    /* renamed from: k, reason: collision with root package name */
    public static final we.h<k.c, a.e> f14651k = we.h.a().a(k.c.IEEE_P1363, a.e.b).a(k.c.DER, a.e.f4021c).b();

    /* renamed from: l, reason: collision with root package name */
    public static final we.h<k.b, a.c> f14652l = we.h.a().a(k.b.NIST_P256, a.c.f4014c).a(k.b.NIST_P384, a.c.f4015d).a(k.b.NIST_P521, a.c.f4016e).b();

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f14653a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f14654c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14655d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14656e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f14657f;

    public h(ECPublicKey eCPublicKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) {
        if (!f14647g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        k.a(eCPublicKey);
        this.b = z.f(oVar);
        this.f14653a = eCPublicKey;
        this.f14654c = cVar;
        this.f14655d = bArr;
        this.f14656e = bArr2;
        this.f14657f = we.c.a();
    }

    public static pe.a0 b(bf.c cVar) {
        return new h(k.i(f14652l.c(cVar.d().c()), cVar.e().getAffineX().toByteArray(), cVar.e().getAffineY().toByteArray()), f14650j.c(cVar.d().d()), f14651k.c(cVar.d().e()), cVar.b().d(), cVar.d().f().equals(a.f.f4024d) ? f14649i : f14648h);
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f14655d;
        if (bArr3.length == 0) {
            d(bArr, bArr2);
        } else {
            if (!s0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            d(Arrays.copyOfRange(bArr, this.f14655d.length, bArr.length), bArr2);
        }
    }

    public final Signature c(String str) {
        Provider provider = this.f14657f;
        return provider != null ? Signature.getInstance(str, provider) : m.f14679d.a(str);
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        boolean z10;
        if (this.f14654c == k.c.IEEE_P1363) {
            if (bArr.length != k.e(this.f14653a.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = k.c(bArr);
        }
        if (!k.n(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature c10 = c(this.b);
        c10.initVerify(this.f14653a);
        c10.update(bArr2);
        byte[] bArr3 = this.f14656e;
        if (bArr3.length > 0) {
            c10.update(bArr3);
        }
        try {
            z10 = c10.verify(bArr);
        } catch (RuntimeException unused) {
            z10 = false;
        }
        if (!z10) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
