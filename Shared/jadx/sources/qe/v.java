package qe;

import java.security.GeneralSecurityException;
import qe.z;

/* loaded from: classes2.dex */
public final class v extends qe.b {

    /* renamed from: a, reason: collision with root package name */
    public final z f29784a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f29785c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29786d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public z f29787a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29788c;

        public v a() {
            z zVar = this.f29787a;
            if (zVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zVar.c() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f29787a.a() && this.f29788c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29787a.a() && this.f29788c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new v(this.f29787a, this.b, b(), this.f29788c);
        }

        public final ef.a b() {
            if (this.f29787a.d() == z.c.f29795d) {
                return we.e0.f34207a;
            }
            if (this.f29787a.d() == z.c.f29794c) {
                return we.e0.a(this.f29788c.intValue());
            }
            if (this.f29787a.d() == z.c.b) {
                return we.e0.b(this.f29788c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f29787a.d());
        }

        public b c(Integer num) {
            this.f29788c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(z zVar) {
            this.f29787a = zVar;
            return this;
        }

        public b() {
            this.f29787a = null;
            this.b = null;
            this.f29788c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29786d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29785c;
    }

    public z e() {
        return this.f29784a;
    }

    public v(z zVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f29784a = zVar;
        this.b = cVar;
        this.f29785c = aVar;
        this.f29786d = num;
    }
}
