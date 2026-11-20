package df;

import bf.a;
import df.k;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import ue.b;

/* loaded from: classes2.dex */
public final class g implements pe.z {

    /* renamed from: g, reason: collision with root package name */
    public static final b.EnumC0592b f14638g = b.EnumC0592b.b;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14639h = new byte[0];

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14640i = {0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f14641j = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f14642a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f14643c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14644d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14645e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f14646f;

    public g(ECPrivateKey eCPrivateKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) {
        if (!f14638g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f14642a = eCPrivateKey;
        this.b = z.f(oVar);
        this.f14643c = cVar;
        this.f14644d = bArr;
        this.f14645e = bArr2;
        this.f14646f = we.c.a();
    }

    public static pe.z b(bf.b bVar) {
        g gVar = new g(k.h(h.f14652l.c(bVar.e().c()), bVar.f().b(pe.j.a()).toByteArray()), h.f14650j.c(bVar.e().d()), h.f14651k.c(bVar.e().e()), bVar.b().d(), bVar.e().f().equals(a.f.f4024d) ? f14640i : f14639h);
        pe.a0 b = h.b(bVar.c());
        try {
            byte[] bArr = f14641j;
            b.a(gVar.a(bArr), bArr);
            return gVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        Signature c10 = c(this.b);
        c10.initSign(this.f14642a);
        c10.update(bArr);
        byte[] bArr2 = this.f14645e;
        if (bArr2.length > 0) {
            c10.update(bArr2);
        }
        byte[] sign = c10.sign();
        if (this.f14643c == k.c.IEEE_P1363) {
            sign = k.b(sign, k.e(this.f14642a.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f14644d;
        return bArr3.length == 0 ? sign : e.a(bArr3, sign);
    }

    public final Signature c(String str) {
        Provider provider = this.f14646f;
        return provider != null ? Signature.getInstance(str, provider) : m.f14679d.a(str);
    }
}
