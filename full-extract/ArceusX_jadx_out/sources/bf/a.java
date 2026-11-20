package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a extends a1 {

    /* renamed from: a, reason: collision with root package name */
    public final e f4008a;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4009c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4010d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public e f4011a;
        public c b;

        /* renamed from: c, reason: collision with root package name */
        public d f4012c;

        /* renamed from: d, reason: collision with root package name */
        public f f4013d;

        public a a() {
            e eVar = this.f4011a;
            if (eVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            c cVar = this.b;
            if (cVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            d dVar = this.f4012c;
            if (dVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            f fVar = this.f4013d;
            if (fVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (cVar == c.f4014c && dVar != d.b) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (cVar == c.f4015d && dVar != d.f4018c && dVar != d.f4019d) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (cVar != c.f4016e || dVar == d.f4019d) {
                return new a(eVar, cVar, dVar, fVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        public b b(c cVar) {
            this.b = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f4012c = dVar;
            return this;
        }

        public b d(e eVar) {
            this.f4011a = eVar;
            return this;
        }

        public b e(f fVar) {
            this.f4013d = fVar;
            return this;
        }

        public b() {
            this.f4011a = null;
            this.b = null;
            this.f4012c = null;
            this.f4013d = f.f4025e;
        }
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f4014c = new c("NIST_P256", we.g.f34219a);

        /* renamed from: d, reason: collision with root package name */
        public static final c f4015d = new c("NIST_P384", we.g.b);

        /* renamed from: e, reason: collision with root package name */
        public static final c f4016e = new c("NIST_P521", we.g.f34220c);

        /* renamed from: a, reason: collision with root package name */
        public final String f4017a;
        public final ECParameterSpec b;

        public c(String str, ECParameterSpec eCParameterSpec) {
            this.f4017a = str;
            this.b = eCParameterSpec;
        }

        public ECParameterSpec a() {
            return this.b;
        }

        public String toString() {
            return this.f4017a;
        }
    }

    public static final class d {
        public static final d b = new d("SHA256");

        /* renamed from: c, reason: collision with root package name */
        public static final d f4018c = new d("SHA384");

        /* renamed from: d, reason: collision with root package name */
        public static final d f4019d = new d("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f4020a;

        public d(String str) {
            this.f4020a = str;
        }

        public String toString() {
            return this.f4020a;
        }
    }

    public static final class e {
        public static final e b = new e("IEEE_P1363");

        /* renamed from: c, reason: collision with root package name */
        public static final e f4021c = new e("DER");

        /* renamed from: a, reason: collision with root package name */
        public final String f4022a;

        public e(String str) {
            this.f4022a = str;
        }

        public String toString() {
            return this.f4022a;
        }
    }

    public static final class f {
        public static final f b = new f("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final f f4023c = new f("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final f f4024d = new f("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final f f4025e = new f("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f4026a;

        public f(String str) {
            this.f4026a = str;
        }

        public String toString() {
            return this.f4026a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4010d != f.f4025e;
    }

    public c c() {
        return this.b;
    }

    public d d() {
        return this.f4009c;
    }

    public e e() {
        return this.f4008a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.e() == e() && aVar.c() == c() && aVar.d() == d() && aVar.f() == f();
    }

    public f f() {
        return this.f4010d;
    }

    public int hashCode() {
        return Objects.hash(a.class, this.f4008a, this.b, this.f4009c, this.f4010d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f4010d + ", hashType: " + this.f4009c + ", encoding: " + this.f4008a + ", curve: " + this.b + ")";
    }

    public a(e eVar, c cVar, d dVar, f fVar) {
        this.f4008a = eVar;
        this.b = cVar;
        this.f4009c = dVar;
        this.f4010d = fVar;
    }
}
