package qe;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29637a = b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    public static final String b = b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* renamed from: c, reason: collision with root package name */
    public static final String f29638c = b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* renamed from: d, reason: collision with root package name */
    public static final String f29639d = b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* renamed from: e, reason: collision with root package name */
    public static final String f29640e = b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* renamed from: f, reason: collision with root package name */
    public static final String f29641f = b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* renamed from: g, reason: collision with root package name */
    public static final String f29642g = b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* renamed from: h, reason: collision with root package name */
    public static final String f29643h = b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f29644i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f29645j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final af.q0 f29646k;

    static {
        af.q0 a02 = af.q0.a0();
        f29644i = a02;
        f29645j = a02;
        f29646k = a02;
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
        e.d();
        xe.p.c();
        j.d(true);
        t.e(true);
        if (te.a.a()) {
            return;
        }
        o.e(true);
        y.e(true);
        d0.f(true);
        h0.f(true);
        l0.f(true);
        s1.f(true);
        n1.d(true);
    }
}
