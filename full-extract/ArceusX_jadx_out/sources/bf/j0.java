package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j0 extends a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f4062e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f4063a;
    public final BigInteger b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4064c;

    /* renamed from: d, reason: collision with root package name */
    public final c f4065d;

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final BigInteger f4066e;

        /* renamed from: f, reason: collision with root package name */
        public static final BigInteger f4067f;

        /* renamed from: a, reason: collision with root package name */
        public Integer f4068a;
        public BigInteger b;

        /* renamed from: c, reason: collision with root package name */
        public c f4069c;

        /* renamed from: d, reason: collision with root package name */
        public d f4070d;

        static {
            BigInteger valueOf = BigInteger.valueOf(2L);
            f4066e = valueOf;
            f4067f = valueOf.pow(256);
        }

        public j0 a() {
            Integer num = this.f4068a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f4069c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f4070d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f4068a));
            }
            f(this.b);
            return new j0(this.f4068a.intValue(), this.b, this.f4070d, this.f4069c);
        }

        public b b(c cVar) {
            this.f4069c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f4068a = Integer.valueOf(i10);
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(d dVar) {
            this.f4070d = dVar;
            return this;
        }

        public final void f(BigInteger bigInteger) {
            int compareTo = bigInteger.compareTo(j0.f4062e);
            if (compareTo == 0) {
                return;
            }
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f4066e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f4067f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public b() {
            this.f4068a = null;
            this.b = j0.f4062e;
            this.f4069c = null;
            this.f4070d = d.f4076e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA256");

        /* renamed from: c, reason: collision with root package name */
        public static final c f4071c = new c("SHA384");

        /* renamed from: d, reason: collision with root package name */
        public static final c f4072d = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f4073a;

        public c(String str) {
            this.f4073a = str;
        }

        public String toString() {
            return this.f4073a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f4074c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f4075d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f4076e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f4077a;

        public d(String str) {
            this.f4077a = str;
        }

        public String toString() {
            return this.f4077a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f4064c != d.f4076e;
    }

    public c c() {
        return this.f4065d;
    }

    public int d() {
        return this.f4063a;
    }

    public BigInteger e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.d() == d() && Objects.equals(j0Var.e(), e()) && j0Var.f() == f() && j0Var.c() == c();
    }

    public d f() {
        return this.f4064c;
    }

    public int hashCode() {
        return Objects.hash(j0.class, Integer.valueOf(this.f4063a), this.b, this.f4064c, this.f4065d);
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f4064c + ", hashType: " + this.f4065d + ", publicExponent: " + this.b + ", and " + this.f4063a + "-bit modulus)";
    }

    public j0(int i10, BigInteger bigInteger, d dVar, c cVar) {
        this.f4063a = i10;
        this.b = bigInteger;
        this.f4064c = dVar;
        this.f4065d = cVar;
    }
}
