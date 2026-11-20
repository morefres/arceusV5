package qe;

import java.security.GeneralSecurityException;
import qe.u;

/* loaded from: classes2.dex */
public final class q extends qe.b {

    /* renamed from: a, reason: collision with root package name */
    public final u f29738a;
    public final ef.c b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f29739c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29740d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public u f29741a;
        public ef.c b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29742c;

        public q a() {
            u uVar = this.f29741a;
            if (uVar == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (uVar.d() != this.b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f29741a.a() && this.f29742c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f29741a.a() && this.f29742c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new q(this.f29741a, this.b, b(), this.f29742c);
        }

        public final ef.a b() {
            if (this.f29741a.f() == u.c.f29768d) {
                return we.e0.f34207a;
            }
            if (this.f29741a.f() == u.c.f29767c) {
                return we.e0.a(this.f29742c.intValue());
            }
            if (this.f29741a.f() == u.c.b) {
                return we.e0.b(this.f29742c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f29741a.f());
        }

        public b c(Integer num) {
            this.f29742c = num;
            return this;
        }

        public b d(ef.c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(u uVar) {
            this.f29741a = uVar;
            return this;
        }

        public b() {
            this.f29741a = null;
            this.b = null;
            this.f29742c = null;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.l
    public Integer a() {
        return this.f29740d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29739c;
    }

    public u e() {
        return this.f29738a;
    }

    public q(u uVar, ef.c cVar, ef.a aVar, Integer num) {
        this.f29738a = uVar;
        this.b = cVar;
        this.f29739c = aVar;
        this.f29740d = num;
    }
}
