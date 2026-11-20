package bf;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4150a = b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
    public static final String b = b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");

    /* renamed from: c, reason: collision with root package name */
    public static final String f4151c = b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");

    /* renamed from: d, reason: collision with root package name */
    public static final String f4152d = b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");

    /* renamed from: e, reason: collision with root package name */
    public static final String f4153e = b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");

    /* renamed from: f, reason: collision with root package name */
    public static final String f4154f = b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");

    /* renamed from: g, reason: collision with root package name */
    public static final String f4155g = b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");

    /* renamed from: h, reason: collision with root package name */
    public static final String f4156h = b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f4157i = af.q0.a0();

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f4158j = af.q0.a0();

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f4159k = af.q0.a0();

    static {
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
        g0.d();
        i0.d();
        g.e(true);
        p0.e(true);
        x0.e(true);
        if (te.a.a()) {
            return;
        }
        n.d(true);
    }
}
