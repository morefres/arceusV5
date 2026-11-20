package xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f35551a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final d f35552c;

    /* renamed from: d, reason: collision with root package name */
    public final c f35553d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f35554a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public c f35555c;

        /* renamed from: d, reason: collision with root package name */
        public d f35556d;

        public static void f(int i10, c cVar) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f35557c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f35558d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f35559e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f35560f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public o a() {
            Integer num = this.f35554a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f35555c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f35556d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f35554a));
            }
            f(this.b.intValue(), this.f35555c);
            return new o(this.f35554a.intValue(), this.b.intValue(), this.f35556d, this.f35555c);
        }

        public b b(c cVar) {
            this.f35555c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f35554a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f35556d = dVar;
            return this;
        }

        public b() {
            this.f35554a = null;
            this.b = null;
            this.f35555c = null;
            this.f35556d = d.f35564e;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f35557c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f35558d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f35559e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f35560f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f35561a;

        public c(String str) {
            this.f35561a = str;
        }

        public String toString() {
            return this.f35561a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f35562c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f35563d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f35564e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f35565a;

        public d(String str) {
            this.f35565a = str;
        }

        public String toString() {
            return this.f35565a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f35552c != d.f35564e;
    }

    public int c() {
        return this.b;
    }

    public c d() {
        return this.f35553d;
    }

    public int e() {
        return this.f35551a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.e() == e() && oVar.f() == f() && oVar.g() == g() && oVar.d() == d();
    }

    public int f() {
        int c10;
        d dVar = this.f35552c;
        if (dVar == d.f35564e) {
            return c();
        }
        if (dVar == d.b) {
            c10 = c();
        } else if (dVar == d.f35562c) {
            c10 = c();
        } else {
            if (dVar != d.f35563d) {
                throw new IllegalStateException("Unknown variant");
            }
            c10 = c();
        }
        return c10 + 5;
    }

    public d g() {
        return this.f35552c;
    }

    public int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f35551a), Integer.valueOf(this.b), this.f35552c, this.f35553d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f35552c + ", hashType: " + this.f35553d + ", " + this.b + "-byte tags, and " + this.f35551a + "-byte key)";
    }

    public o(int i10, int i11, d dVar, c cVar) {
        this.f35551a = i10;
        this.b = i11;
        this.f35552c = dVar;
        this.f35553d = cVar;
    }
}
