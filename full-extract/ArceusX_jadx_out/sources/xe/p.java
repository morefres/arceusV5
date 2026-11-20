package xe;

import af.q0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35566a = b("type.googleapis.com/google.crypto.tink.HmacKey");

    @Deprecated
    public static final q0 b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final q0 f35567c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final q0 f35568d;

    static {
        q0 a02 = q0.a0();
        b = a02;
        f35567c = a02;
        f35568d = a02;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() {
        c();
    }

    public static String b(String str) {
        return str;
    }

    public static void c() {
        t.d();
        h.d();
        n.e(true);
        if (te.a.a()) {
            return;
        }
        e.h(true);
    }
}
