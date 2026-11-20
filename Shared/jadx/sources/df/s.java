package df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import ue.b;

/* loaded from: classes2.dex */
public final class s implements ze.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0592b f14697e = b.EnumC0592b.b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Mac> f14698a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f14699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14700d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac a10 = m.f14678c.a(s.this.b);
                a10.init(s.this.f14699c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) {
        a aVar = new a();
        this.f14698a = aVar;
        if (!f14697e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.f14699c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f14700d = 20;
                break;
            case "HMACSHA224":
                this.f14700d = 28;
                break;
            case "HMACSHA256":
                this.f14700d = 32;
                break;
            case "HMACSHA384":
                this.f14700d = 48;
                break;
            case "HMACSHA512":
                this.f14700d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // ze.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > this.f14700d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f14698a.get().update(bArr);
        return Arrays.copyOf(this.f14698a.get().doFinal(), i10);
    }
}
