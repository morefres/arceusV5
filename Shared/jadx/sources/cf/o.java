package cf;

import we.l0;

/* loaded from: classes2.dex */
public final class o implements pe.z {

    /* renamed from: a, reason: collision with root package name */
    public final pe.z f4886a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4887c;

    public o(pe.z zVar, byte[] bArr, byte[] bArr2) {
        this.f4886a = zVar;
        this.b = bArr;
        this.f4887c = bArr2;
    }

    public static pe.z b(we.p pVar) {
        l0 b = pVar.b(pe.j.a());
        return new o((pe.z) pe.b0.c(af.f0.h0().D(b.f()).E(b.g()).C(b.d()).build(), pe.z.class), p.d(b), p.c(b));
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f4887c;
        byte[] a10 = bArr2.length == 0 ? this.f4886a.a(bArr) : this.f4886a.a(df.e.a(bArr, bArr2));
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? a10 : df.e.a(bArr3, a10);
    }
}
