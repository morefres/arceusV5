package bf;

import bf.j0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class l0 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f4090a;
    public final BigInteger b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4092d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public j0 f4093a;
        public BigInteger b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f4094c;

        public l0 a() {
            if (this.f4093a == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.b;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int bitLength = bigInteger.bitLength();
            int d10 = this.f4093a.d();
            if (bitLength != d10) {
                throw new GeneralSecurityException("Got modulus size " + bitLength + ", but parameters requires modulus size " + d10);
            }
            if (this.f4093a.a() && this.f4094c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f4093a.a() && this.f4094c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l0(this.f4093a, this.b, b(), this.f4094c);
        }

        public final ef.a b() {
            if (this.f4093a.f() == j0.d.f4076e) {
                return we.e0.f34207a;
            }
            if (this.f4093a.f() == j0.d.f4075d || this.f4093a.f() == j0.d.f4074c) {
                return we.e0.a(this.f4094c.intValue());
            }
            if (this.f4093a.f() == j0.d.b) {
                return we.e0.b(this.f4094c.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f4093a.f());
        }

        public b c(Integer num) {
            this.f4094c = num;
            return this;
        }

        public b d(BigInteger bigInteger) {
            this.b = bigInteger;
            return this;
        }

        public b e(j0 j0Var) {
            this.f4093a = j0Var;
            return this;
        }

        public b() {
            this.f4093a = null;
            this.b = null;
            this.f4094c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f4092d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4091c;
    }

    public BigInteger d() {
        return this.b;
    }

    public j0 e() {
        return this.f4090a;
    }

    public l0(j0 j0Var, BigInteger bigInteger, ef.a aVar, Integer num) {
        this.f4090a = j0Var;
        this.b = bigInteger;
        this.f4091c = aVar;
        this.f4092d = num;
    }
}
