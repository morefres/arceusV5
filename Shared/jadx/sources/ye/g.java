package ye;

import java.security.GeneralSecurityException;
import ue.b;

/* loaded from: classes2.dex */
public final class g implements xe.g {
    public static final b.EnumC0592b b = b.EnumC0592b.f32672a;

    /* renamed from: a, reason: collision with root package name */
    public final xe.a f36586a;

    public g(xe.a aVar) {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f36586a = aVar;
    }
}
