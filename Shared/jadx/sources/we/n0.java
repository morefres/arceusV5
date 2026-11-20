package we;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f34270a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return n0.c();
        }
    }

    public static SecureRandom b() {
        Provider a10 = c.a();
        if (a10 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", a10);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider b = c.b();
        if (b != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", b);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static SecureRandom c() {
        SecureRandom b = b();
        b.nextLong();
        return b;
    }

    public static byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        f34270a.get().nextBytes(bArr);
        return bArr;
    }
}
