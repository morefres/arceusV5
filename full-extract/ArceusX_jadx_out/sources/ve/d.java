package ve;

import df.a0;
import df.u;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import pe.t;

/* loaded from: classes2.dex */
public final class d implements t {
    public static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f33404a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f33405a = null;

        public a() {
            if (!d.e()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    public d() {
        this(new a());
    }

    public static boolean d(String str) {
        synchronized (b) {
            try {
                String b10 = a0.b("android-keystore://", str);
                if (b.e(b10)) {
                    return false;
                }
                b.a(b10);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean e() {
        return true;
    }

    public static pe.a f(pe.a aVar) {
        byte[] a10 = u.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(a10, aVar.b(aVar.a(a10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // pe.t
    public boolean a(String str) {
        String str2 = this.f33404a;
        if (str2 == null || !str2.equals(str)) {
            return this.f33404a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // pe.t
    public pe.a b(String str) {
        pe.a f10;
        String str2 = this.f33404a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f33404a, str));
        }
        try {
            synchronized (b) {
                f10 = f(new c(a0.b("android-keystore://", str)));
            }
            return f10;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public d(a aVar) {
        this.f33404a = aVar.f33405a;
    }
}
