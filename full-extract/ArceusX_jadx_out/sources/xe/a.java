package xe;

import java.security.GeneralSecurityException;
import we.e0;
import xe.f;

/* loaded from: classes2.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final f f35523a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f35524c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f35525d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public f f35526a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f35527c;

        public a a() {
            f fVar = this.f35526a;
            if (fVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f35526a.a() && this.f35527c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f35526a.a() && this.f35527c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f35526a, this.b, b(), this.f35527c);
        }

        public final ef.a b() {
            if (this.f35526a.f() == f.c.f35537e) {
                return e0.f34207a;
            }
            if (this.f35526a.f() == f.c.f35536d || this.f35526a.f() == f.c.f35535c) {
                return e0.a(this.f35527c.intValue());
            }
            if (this.f35526a.f() == f.c.b) {
                return e0.b(this.f35527c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f35526a.f());
        }

        public b c(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(Integer num) {
            this.f35527c = num;
            return this;
        }

        public b e(f fVar) {
            this.f35526a = fVar;
            return this;
        }

        public b() {
            this.f35526a = null;
            this.b = null;
            this.f35527c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f35525d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f35524c;
    }

    public f e() {
        return this.f35523a;
    }

    public a(f fVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f35523a = fVar;
        this.b = cVar;
        this.f35524c = aVar;
        this.f35525d = num;
    }
}
