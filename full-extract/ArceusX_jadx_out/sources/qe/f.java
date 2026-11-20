package qe;

import java.security.GeneralSecurityException;
import qe.k;

/* loaded from: classes2.dex */
public final class f extends qe.b {

    /* renamed from: a, reason: collision with root package name */
    public final k f29659a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.c f29660c;

    /* renamed from: d, reason: collision with root package name */
    public final ef.a f29661d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29662e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public k f29663a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public ef.c f29664c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f29665d;

        public f a() {
            k kVar = this.f29663a;
            if (kVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.b == null || this.f29664c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (kVar.c() != this.b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f29663a.e() != this.f29664c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f29663a.a() && this.f29665d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29663a.a() && this.f29665d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new f(this.f29663a, this.b, this.f29664c, b(), this.f29665d);
        }

        public final ef.a b() {
            if (this.f29663a.h() == k.d.f29703d) {
                return we.e0.f34207a;
            }
            if (this.f29663a.h() == k.d.f29702c) {
                return we.e0.a(this.f29665d.intValue());
            }
            if (this.f29663a.h() == k.d.b) {
                return we.e0.b(this.f29665d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f29663a.h());
        }

        public b c(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b d(ef.c cVar) {
            this.f29664c = cVar;
            return this;
        }

        public b e(Integer num) {
            this.f29665d = num;
            return this;
        }

        public b f(k kVar) {
            this.f29663a = kVar;
            return this;
        }

        public b() {
            this.f29663a = null;
            this.b = null;
            this.f29664c = null;
            this.f29665d = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29662e;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.c d() {
        return this.f29660c;
    }

    public ef.a e() {
        return this.f29661d;
    }

    public k f() {
        return this.f29659a;
    }

    public f(k kVar, ef.c cVar, ef.c cVar2, ef.a aVar, Integer num) {
        this.f29659a = kVar;
        this.b = cVar;
        this.f29660c = cVar2;
        this.f29661d = aVar;
        this.f29662e = num;
    }
}
