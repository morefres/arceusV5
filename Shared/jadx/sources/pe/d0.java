package pe;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f28590a = new d0();

    public static d0 a() {
        return f28590a;
    }

    public static d0 b(d0 d0Var) {
        if (d0Var != null) {
            return d0Var;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
