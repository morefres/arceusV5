package bf;

import bf.a;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
public final class c extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final bf.a f4029a;
    public final ECPoint b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f4030c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4031d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public bf.a f4032a;
        public ECPoint b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f4033c;

        public c a() {
            bf.a aVar = this.f4032a;
            if (aVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            we.g.b(eCPoint, aVar.c().a().getCurve());
            if (this.f4032a.a() && this.f4033c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f4032a.a() && this.f4033c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new c(this.f4032a, this.b, b(), this.f4033c);
        }

        public final ef.a b() {
            if (this.f4032a.f() == a.f.f4025e) {
                return we.e0.f34207a;
            }
            if (this.f4032a.f() == a.f.f4024d || this.f4032a.f() == a.f.f4023c) {
                return we.e0.a(this.f4033c.intValue());
            }
            if (this.f4032a.f() == a.f.b) {
                return we.e0.b(this.f4033c.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f4032a.f());
        }

        public b c(Integer num) {
            this.f4033c = num;
            return this;
        }

        public b d(bf.a aVar) {
            this.f4032a = aVar;
            return this;
        }

        public b e(ECPoint eCPoint) {
            this.b = eCPoint;
            return this;
        }

        public b() {
            this.f4032a = null;
            this.b = null;
            this.f4033c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f4031d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4030c;
    }

    public bf.a d() {
        return this.f4029a;
    }

    public ECPoint e() {
        return this.b;
    }

    public c(bf.a aVar, ECPoint eCPoint, ef.a aVar2, Integer num) {
        this.f4029a = aVar;
        this.b = eCPoint;
        this.f4030c = aVar2;
        this.f4031d = num;
    }
}
