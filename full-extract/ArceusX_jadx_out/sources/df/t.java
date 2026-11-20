package df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import xe.f;
import xe.o;

/* loaded from: classes2.dex */
public class t implements pe.w {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14702e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final ze.a f14703a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14704c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14705d;

    public t(ze.a aVar, int i10) {
        this.f14703a = aVar;
        this.b = i10;
        this.f14704c = new byte[0];
        this.f14705d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static pe.w c(xe.a aVar) {
        return new t(aVar);
    }

    public static pe.w d(xe.i iVar) {
        return new t(iVar);
    }

    @Override // pe.w
    public void a(byte[] bArr, byte[] bArr2) {
        if (!e.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // pe.w
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = this.f14705d;
        return bArr2.length > 0 ? e.a(this.f14704c, this.f14703a.a(e.a(bArr, bArr2), this.b)) : e.a(this.f14704c, this.f14703a.a(bArr, this.b));
    }

    public t(xe.a aVar) {
        this.f14703a = new r(aVar.c().d(pe.j.a()));
        this.b = aVar.e().c();
        this.f14704c = aVar.d().d();
        if (aVar.e().f().equals(f.c.f35536d)) {
            byte[] bArr = f14702e;
            this.f14705d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f14705d = new byte[0];
        }
    }

    public t(xe.i iVar) {
        this.f14703a = new s("HMAC" + iVar.e().d(), new SecretKeySpec(iVar.c().d(pe.j.a()), "HMAC"));
        this.b = iVar.e().c();
        this.f14704c = iVar.d().d();
        if (iVar.e().g().equals(o.d.f35563d)) {
            byte[] bArr = f14702e;
            this.f14705d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f14705d = new byte[0];
        }
    }
}
