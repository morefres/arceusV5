package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r0 extends a1 {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f4108g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f4109a;
    public final BigInteger b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4110c;

    /* renamed from: d, reason: collision with root package name */
    public final c f4111d;

    /* renamed from: e, reason: collision with root package name */
    public final c f4112e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4113f;

    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        public static final BigInteger f4114g;

        /* renamed from: h, reason: collision with root package name */
        public static final BigInteger f4115h;

        /* renamed from: a, reason: collision with root package name */
        public Integer f4116a;
        public BigInteger b;

        /* renamed from: c, reason: collision with root package name */
        public c f4117c;

        /* renamed from: d, reason: collision with root package name */
        public c f4118d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f4119e;

        /* renamed from: f, reason: collision with root package name */
        public d f4120f;

        static {
            BigInteger valueOf = BigInteger.valueOf(2L);
            f4114g = valueOf;
            f4115h = valueOf.pow(256);
        }

        public r0 a() {
            Integer num = this.f4116a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f4117c == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f4118d == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f4120f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f4119e == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f4116a, 2048));
            }
            if (this.f4117c != this.f4118d) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            h(this.b);
            return new r0(this.f4116a.intValue(), this.b, this.f4120f, this.f4117c, this.f4118d, this.f4119e.intValue());
        }

        public b b(c cVar) {
            this.f4118d = cVar;
            return this;
        }

        public b c(int i10) {
            this.f4116a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(int i10) {
            if (i10 < 0) {
                throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
            }
            this.f4119e = Integer.valueOf(i10);
            return this;
        }

        public b f(c cVar) {
            this.f4117c = cVar;
            return this;
        }

        public b g(d dVar) {
            this.f4120f = dVar;
            return this;
        }

        public final void h(BigInteger bigInteger) {
            int compareTo = bigInteger.compareTo(r0.f4108g);
            if (compareTo == 0) {
                return;
            }
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f4114g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f4115h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f4116a = null;
            this.b = r0.f4108g;
            this.f4117c = null;
            this.f4118d = null;
            this.f4119e = null;
            this.f4120f = d.f4126e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* renamed from: c, reason: collision with root package name */
        public static final c f4121c = new c("SHA384");

        /* renamed from: d, reason: collision with root package name */
        public static final c f4122d = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f4123a;

        public c(String str) {
            this.f4123a = str;
        }

        public String toString() {
            return this.f4123a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f4124c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f4125d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f4126e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f4127a;

        public d(String str) {
            this.f4127a = str;
        }

        public String toString() {
            return this.f4127a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4110c != d.f4126e;
    }

    public c c() {
        return this.f4112e;
    }

    public int d() {
        return this.f4109a;
    }

    public BigInteger e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.d() == d() && Objects.equals(r0Var.e(), e()) && Objects.equals(r0Var.h(), h()) && Objects.equals(r0Var.g(), g()) && Objects.equals(r0Var.c(), c()) && r0Var.f() == f();
    }

    public int f() {
        return this.f4113f;
    }

    public c g() {
        return this.f4111d;
    }

    public d h() {
        return this.f4110c;
    }

    public int hashCode() {
        return Objects.hash(r0.class, Integer.valueOf(this.f4109a), this.b, this.f4110c, this.f4111d, this.f4112e, Integer.valueOf(this.f4113f));
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f4110c + ", signature hashType: " + this.f4111d + ", mgf1 hashType: " + this.f4112e + ", saltLengthBytes: " + this.f4113f + ", publicExponent: " + this.b + ", and " + this.f4109a + "-bit modulus)";
    }

    public r0(int i10, BigInteger bigInteger, d dVar, c cVar, c cVar2, int i11) {
        this.f4109a = i10;
        this.b = bigInteger;
        this.f4110c = dVar;
        this.f4111d = cVar;
        this.f4112e = cVar2;
        this.f4113f = i11;
    }
}
