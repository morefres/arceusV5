package qe;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u0 extends qe.c {

    /* renamed from: a, reason: collision with root package name */
    public final d f29770a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final c f29771c;

    /* renamed from: d, reason: collision with root package name */
    public final qe.c f29772d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public d f29773a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public c f29774c;

        /* renamed from: d, reason: collision with root package name */
        public qe.c f29775d;

        public static boolean b(c cVar, qe.c cVar2) {
            if (cVar.equals(c.b) && (cVar2 instanceof u)) {
                return true;
            }
            if (cVar.equals(c.f29777d) && (cVar2 instanceof e0)) {
                return true;
            }
            if (cVar.equals(c.f29776c) && (cVar2 instanceof t1)) {
                return true;
            }
            if (cVar.equals(c.f29778e) && (cVar2 instanceof k)) {
                return true;
            }
            if (cVar.equals(c.f29779f) && (cVar2 instanceof p)) {
                return true;
            }
            return cVar.equals(c.f29780g) && (cVar2 instanceof z);
        }

        public u0 a() {
            if (this.f29773a == null) {
                this.f29773a = d.f29782c;
            }
            if (this.b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f29774c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            qe.c cVar = this.f29775d;
            if (cVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (cVar.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f29774c, this.f29775d)) {
                return new u0(this.f29773a, this.b, this.f29774c, this.f29775d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f29774c.toString() + " when new keys are picked according to " + this.f29775d + ".");
        }

        public b c(qe.c cVar) {
            this.f29775d = cVar;
            return this;
        }

        public b d(c cVar) {
            this.f29774c = cVar;
            return this;
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b f(d dVar) {
            this.f29773a = dVar;
            return this;
        }

        public b() {
        }
    }

    public static final class c {
        public static final c b = new c("ASSUME_AES_GCM");

        /* renamed from: c, reason: collision with root package name */
        public static final c f29776c = new c("ASSUME_XCHACHA20POLY1305");

        /* renamed from: d, reason: collision with root package name */
        public static final c f29777d = new c("ASSUME_CHACHA20POLY1305");

        /* renamed from: e, reason: collision with root package name */
        public static final c f29778e = new c("ASSUME_AES_CTR_HMAC");

        /* renamed from: f, reason: collision with root package name */
        public static final c f29779f = new c("ASSUME_AES_EAX");

        /* renamed from: g, reason: collision with root package name */
        public static final c f29780g = new c("ASSUME_AES_GCM_SIV");

        /* renamed from: a, reason: collision with root package name */
        public final String f29781a;

        public c(String str) {
            this.f29781a = str;
        }

        public String toString() {
            return this.f29781a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f29782c = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29783a;

        public d(String str) {
            this.f29783a = str;
        }

        public String toString() {
            return this.f29783a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29770a != d.f29782c;
    }

    public qe.c c() {
        return this.f29772d;
    }

    public String d() {
        return this.b;
    }

    public d e() {
        return this.f29770a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f29771c.equals(this.f29771c) && u0Var.f29772d.equals(this.f29772d) && u0Var.b.equals(this.b) && u0Var.f29770a.equals(this.f29770a);
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.b, this.f29771c, this.f29772d, this.f29770a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.f29771c + ", dekParametersForNewKeys: " + this.f29772d + ", variant: " + this.f29770a + ")";
    }

    public u0(d dVar, String str, c cVar, qe.c cVar2) {
        this.f29770a = dVar;
        this.b = str;
        this.f29771c = cVar;
        this.f29772d = cVar2;
    }
}
