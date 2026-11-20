package xe;

import java.security.GeneralSecurityException;
import we.e0;
import xe.o;

/* loaded from: classes2.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final o f35541a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f35542c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f35543d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public o f35544a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f35545c;

        public i a() {
            o oVar = this.f35544a;
            if (oVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (oVar.e() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f35544a.a() && this.f35545c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f35544a.a() && this.f35545c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f35544a, this.b, b(), this.f35545c);
        }

        public final ef.a b() {
            if (this.f35544a.g() == o.d.f35564e) {
                return e0.f34207a;
            }
            if (this.f35544a.g() == o.d.f35563d || this.f35544a.g() == o.d.f35562c) {
                return e0.a(this.f35545c.intValue());
            }
            if (this.f35544a.g() == o.d.b) {
                return e0.b(this.f35545c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f35544a.g());
        }

        public b c(Integer num) {
            this.f35545c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(o oVar) {
            this.f35544a = oVar;
            return this;
        }

        public b() {
            this.f35544a = null;
            this.b = null;
            this.f35545c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f35543d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f35542c;
    }

    public o e() {
        return this.f35541a;
    }

    public i(o oVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f35541a = oVar;
        this.b = cVar;
        this.f35542c = aVar;
        this.f35543d = num;
    }
}
