package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class k0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4078a;
    public final ef.b b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.b f4079c;

    /* renamed from: d, reason: collision with root package name */
    public final ef.b f4080d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.b f4081e;

    /* renamed from: f, reason: collision with root package name */
    public final ef.b f4082f;

    /* renamed from: g, reason: collision with root package name */
    public final ef.b f4083g;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public l0 f4084a;
        public ef.b b;

        /* renamed from: c, reason: collision with root package name */
        public ef.b f4085c;

        /* renamed from: d, reason: collision with root package name */
        public ef.b f4086d;

        /* renamed from: e, reason: collision with root package name */
        public ef.b f4087e;

        /* renamed from: f, reason: collision with root package name */
        public ef.b f4088f;

        /* renamed from: g, reason: collision with root package name */
        public ef.b f4089g;

        public k0 a() {
            l0 l0Var = this.f4084a;
            if (l0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f4085c == null || this.f4086d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f4087e == null || this.f4088f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f4089g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger e10 = l0Var.e().e();
            BigInteger d10 = this.f4084a.d();
            BigInteger b = this.f4085c.b(pe.j.a());
            BigInteger b10 = this.f4086d.b(pe.j.a());
            BigInteger b11 = this.b.b(pe.j.a());
            BigInteger b12 = this.f4087e.b(pe.j.a());
            BigInteger b13 = this.f4088f.b(pe.j.a());
            BigInteger b14 = this.f4089g.b(pe.j.a());
            if (!b.isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!b10.isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!b.multiply(b10).equals(d10)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger subtract = b.subtract(bigInteger);
            BigInteger subtract2 = b10.subtract(bigInteger);
            if (!e10.multiply(b11).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!e10.multiply(b12).mod(subtract).equals(bigInteger)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!e10.multiply(b13).mod(subtract2).equals(bigInteger)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (b10.multiply(b14).mod(b).equals(bigInteger)) {
                return new k0(this.f4084a, this.f4085c, this.f4086d, this.b, this.f4087e, this.f4088f, this.f4089g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(ef.b bVar) {
            this.f4089g = bVar;
            return this;
        }

        public b c(ef.b bVar, ef.b bVar2) {
            this.f4087e = bVar;
            this.f4088f = bVar2;
            return this;
        }

        public b d(ef.b bVar, ef.b bVar2) {
            this.f4085c = bVar;
            this.f4086d = bVar2;
            return this;
        }

        public b e(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(l0 l0Var) {
            this.f4084a = l0Var;
            return this;
        }

        public b() {
            this.f4084a = null;
            this.b = null;
            this.f4085c = null;
            this.f4086d = null;
            this.f4087e = null;
            this.f4088f = null;
            this.f4089g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public ef.b e() {
        return this.f4083g;
    }

    public j0 f() {
        return this.f4078a.e();
    }

    public ef.b g() {
        return this.f4081e;
    }

    public ef.b h() {
        return this.f4082f;
    }

    public ef.b i() {
        return this.f4079c;
    }

    public ef.b j() {
        return this.f4080d;
    }

    public ef.b k() {
        return this.b;
    }

    @Override // bf.b1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public l0 c() {
        return this.f4078a;
    }

    public k0(l0 l0Var, ef.b bVar, ef.b bVar2, ef.b bVar3, ef.b bVar4, ef.b bVar5, ef.b bVar6) {
        this.f4078a = l0Var;
        this.f4079c = bVar;
        this.f4080d = bVar2;
        this.b = bVar3;
        this.f4081e = bVar4;
        this.f4082f = bVar5;
        this.f4083g = bVar6;
    }
}
