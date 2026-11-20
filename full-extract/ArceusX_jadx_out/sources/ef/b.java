package ef;

import java.math.BigInteger;
import pe.d0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f16015a;

    public b(BigInteger bigInteger) {
        this.f16015a = bigInteger;
    }

    public static b a(BigInteger bigInteger, d0 d0Var) {
        if (d0Var != null) {
            return new b(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public BigInteger b(d0 d0Var) {
        if (d0Var != null) {
            return this.f16015a;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
