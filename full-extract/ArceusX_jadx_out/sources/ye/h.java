package ye;

import java.security.GeneralSecurityException;
import ue.b;

/* loaded from: classes2.dex */
public final class h implements xe.g {
    public static final b.EnumC0592b b = b.EnumC0592b.b;

    /* renamed from: a, reason: collision with root package name */
    public final xe.i f36587a;

    public h(xe.i iVar) {
        if (!b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f36587a = iVar;
    }
}
