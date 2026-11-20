package pe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class g0 {
    public static p a(byte[] bArr, d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            return d.a(b.b(bArr));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static byte[] b(p pVar, d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            d.b(pVar, c.c(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new GeneralSecurityException("Serialize keyset failed");
        }
    }
}
