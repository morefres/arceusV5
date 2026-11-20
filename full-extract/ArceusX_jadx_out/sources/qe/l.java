package qe;

import java.security.GeneralSecurityException;
import qe.p;

/* loaded from: classes2.dex */
public final class l extends qe.b {

    /* renamed from: a, reason: collision with root package name */
    public final p f29708a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f29709c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29710d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public p f29711a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29712c;

        public l a() {
            p pVar = this.f29711a;
            if (pVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (pVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f29711a.a() && this.f29712c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29711a.a() && this.f29712c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new l(this.f29711a, this.b, b(), this.f29712c);
        }

        public final ef.a b() {
            if (this.f29711a.f() == p.c.f29733d) {
                return we.e0.f34207a;
            }
            if (this.f29711a.f() == p.c.f29732c) {
                return we.e0.a(this.f29712c.intValue());
            }
            if (this.f29711a.f() == p.c.b) {
                return we.e0.b(this.f29712c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f29711a.f());
        }

        public b c(Integer num) {
            this.f29712c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(p pVar) {
            this.f29711a = pVar;
            return this;
        }

        public b() {
            this.f29711a = null;
            this.b = null;
            this.f29712c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29710d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29709c;
    }

    public p e() {
        return this.f29708a;
    }

    public l(p pVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f29708a = pVar;
        this.b = cVar;
        this.f29709c = aVar;
        this.f29710d = num;
    }
}
