package df;

import bf.i;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import ue.b;

/* loaded from: classes2.dex */
public final class i implements pe.z {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0592b f14658e = b.EnumC0592b.f32672a;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14659a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14660c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14661d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f14662a;
        public final byte[] b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f14662a = bArr;
            this.b = bArr2;
        }

        public static a c() {
            return d(u.a(32));
        }

        public static a d(byte[] bArr) {
            if (bArr.length == 32) {
                return new a(we.e.v(we.e.j(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        public byte[] a() {
            byte[] bArr = this.b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        public byte[] b() {
            byte[] bArr = this.f14662a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f14658e.a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] j10 = we.e.j(bArr);
        this.f14659a = j10;
        this.b = we.e.v(j10);
        this.f14660c = bArr2;
        this.f14661d = bArr3;
    }

    public static pe.z b(bf.j jVar) {
        return new i(jVar.f().d(pe.j.a()), jVar.b().d(), jVar.e().c().equals(i.a.f4056d) ? new byte[]{0} : new byte[0]);
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f14661d;
        byte[] c10 = bArr2.length == 0 ? c(bArr) : c(e.a(bArr, bArr2));
        byte[] bArr3 = this.f14660c;
        return bArr3.length == 0 ? c10 : e.a(bArr3, c10);
    }

    public final byte[] c(byte[] bArr) {
        return we.e.x(bArr, this.b, this.f14659a);
    }
}
