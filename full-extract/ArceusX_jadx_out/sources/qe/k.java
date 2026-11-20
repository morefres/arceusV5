package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k extends qe.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f29687a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29688c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29689d;

    /* renamed from: e, reason: collision with root package name */
    public final d f29690e;

    /* renamed from: f, reason: collision with root package name */
    public final c f29691f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f29692a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29693c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f29694d;

        /* renamed from: e, reason: collision with root package name */
        public c f29695e;

        /* renamed from: f, reason: collision with root package name */
        public d f29696f;

        public static void h(int i10, c cVar) {
            if (cVar == c.b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f29697c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f29698d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f29699e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f29700f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public k a() {
            if (this.f29692a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f29693c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f29694d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f29695e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f29696f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f29695e);
            return new k(this.f29692a.intValue(), this.b.intValue(), this.f29693c.intValue(), this.f29694d.intValue(), this.f29696f, this.f29695e);
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29692a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f29695e = cVar;
            return this;
        }

        public b d(int i10) {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b e(int i10) {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f29693c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f29694d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f29696f = dVar;
            return this;
        }

        public b() {
            this.f29692a = null;
            this.b = null;
            this.f29693c = null;
            this.f29694d = null;
            this.f29695e = null;
            this.f29696f = d.f29703d;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f29697c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f29698d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f29699e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f29700f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f29701a;

        public c(String str) {
            this.f29701a = str;
        }

        public String toString() {
            return this.f29701a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f29702c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f29703d = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29704a;

        public d(String str) {
            this.f29704a = str;
        }

        public String toString() {
            return this.f29704a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29690e != d.f29703d;
    }

    public int c() {
        return this.f29687a;
    }

    public c d() {
        return this.f29691f;
    }

    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.c() == c() && kVar.e() == e() && kVar.f() == f() && kVar.g() == g() && kVar.h() == h() && kVar.d() == d();
    }

    public int f() {
        return this.f29688c;
    }

    public int g() {
        return this.f29689d;
    }

    public d h() {
        return this.f29690e;
    }

    public int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f29687a), Integer.valueOf(this.b), Integer.valueOf(this.f29688c), Integer.valueOf(this.f29689d), this.f29690e, this.f29691f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f29690e + ", hashType: " + this.f29691f + ", " + this.f29688c + "-byte IV, and " + this.f29689d + "-byte tags, and " + this.f29687a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }

    public k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f29687a = i10;
        this.b = i11;
        this.f29688c = i12;
        this.f29689d = i13;
        this.f29690e = dVar;
        this.f29691f = cVar;
    }
}
