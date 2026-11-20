package bf;

import bf.a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
public final class b extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final c f4027a;
    public final ef.b b;

    /* renamed from: bf.b$b, reason: collision with other inner class name */
    public static class C0081b {

        /* renamed from: a, reason: collision with root package name */
        public c f4028a;
        public ef.b b;

        public static void d(BigInteger bigInteger, ECPoint eCPoint, a.c cVar) {
            BigInteger order = cVar.a().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!we.g.k(bigInteger, cVar.a()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        public b a() {
            if (this.f4028a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            ef.b bVar = this.b;
            if (bVar == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            d(bVar.b(pe.j.a()), this.f4028a.e(), this.f4028a.d().c());
            return new b(this.f4028a, this.b);
        }

        public C0081b b(ef.b bVar) {
            this.b = bVar;
            return this;
        }

        public C0081b c(c cVar) {
            this.f4028a = cVar;
            return this;
        }

        public C0081b() {
            this.f4028a = null;
            this.b = null;
        }
    }

    public static C0081b d() {
        return new C0081b();
    }

    public bf.a e() {
        return this.f4027a.d();
    }

    public ef.b f() {
        return this.b;
    }

    @Override // bf.b1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c c() {
        return this.f4027a;
    }

    public b(c cVar, ef.b bVar) {
        this.f4027a = cVar;
        this.b = bVar;
    }
}
