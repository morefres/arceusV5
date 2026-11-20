package bf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class s0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f4128a;
    public final ef.b b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.b f4129c;

    /* renamed from: d, reason: collision with root package name */
    public final ef.b f4130d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.b f4131e;

    /* renamed from: f, reason: collision with root package name */
    public final ef.b f4132f;

    /* renamed from: g, reason: collision with root package name */
    public final ef.b f4133g;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public t0 f4134a;
        public ef.b b;

        /* renamed from: c, reason: collision with root package name */
        public ef.b f4135c;

        /* renamed from: d, reason: collision with root package name */
        public ef.b f4136d;

        /* renamed from: e, reason: collision with root package name */
        public ef.b f4137e;

        /* renamed from: f, reason: collision with root package name */
        public ef.b f4138f;

        /* renamed from: g, reason: collision with root package name */
        public ef.b f4139g;

        public s0 a() {
            t0 t0Var = this.f4134a;
            if (t0Var == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f4135c == null || this.f4136d == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f4137e == null || this.f4138f == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f4139g == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger e10 = t0Var.e().e();
            BigInteger d10 = this.f4134a.d();
            BigInteger b = this.f4135c.b(pe.j.a());
            BigInteger b10 = this.f4136d.b(pe.j.a());
            BigInteger b11 = this.b.b(pe.j.a());
            BigInteger b12 = this.f4137e.b(pe.j.a());
            BigInteger b13 = this.f4138f.b(pe.j.a());
            BigInteger b14 = this.f4139g.b(pe.j.a());
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
                return new s0(this.f4134a, this.f4135c, this.f4136d, this.b, this.f4137e, this.f4138f, this.f4139g);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public b b(ef.b bVar) {
            this.f4139g = bVar;
            return this;
        }

        public b c(ef.b bVar, ef.b bVar2) {
            this.f4137e = bVar;
            this.f4138f = bVar2;
            return this;
        }

        public b d(ef.b bVar, ef.b bVar2) {
            this.f4135c = bVar;
            this.f4136d = bVar2;
            return this;
        }

        public b e(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public b f(t0 t0Var) {
            this.f4134a = t0Var;
            return this;
        }

        public b() {
            this.f4134a = null;
            this.b = null;
            this.f4135c = null;
            this.f4136d = null;
            this.f4137e = null;
            this.f4138f = null;
            this.f4139g = null;
        }
    }

    public static b d() {
        return new b();
    }

    public ef.b e() {
        return this.f4133g;
    }

    public r0 f() {
        return this.f4128a.e();
    }

    public ef.b g() {
        return this.f4131e;
    }

    public ef.b h() {
        return this.f4132f;
    }

    public ef.b i() {
        return this.f4129c;
    }

    public ef.b j() {
        return this.f4130d;
    }

    public ef.b k() {
        return this.b;
    }

    @Override // bf.b1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t0 c() {
        return this.f4128a;
    }

    public s0(t0 t0Var, ef.b bVar, ef.b bVar2, ef.b bVar3, ef.b bVar4, ef.b bVar5, ef.b bVar6) {
        this.f4128a = t0Var;
        this.f4129c = bVar;
        this.f4130d = bVar2;
        this.b = bVar3;
        this.f4131e = bVar4;
        this.f4132f = bVar5;
        this.f4133g = bVar6;
    }
}
