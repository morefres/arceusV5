package xe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f35531a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final c f35532c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f35533a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public c f35534c;

        public f a() {
            Integer num = this.f35533a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f35534c != null) {
                return new f(num.intValue(), this.b.intValue(), this.f35534c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f35533a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 >= 10 && 16 >= i10) {
                this.b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f35534c = cVar;
            return this;
        }

        public b() {
            this.f35533a = null;
            this.b = null;
            this.f35534c = c.f35537e;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f35535c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f35536d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f35537e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f35538a;

        public c(String str) {
            this.f35538a = str;
        }

        public String toString() {
            return this.f35538a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f35532c != c.f35537e;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f35531a;
    }

    public int e() {
        int c10;
        c cVar = this.f35532c;
        if (cVar == c.f35537e) {
            return c();
        }
        if (cVar == c.b) {
            c10 = c();
        } else if (cVar == c.f35535c) {
            c10 = c();
        } else {
            if (cVar != c.f35536d) {
                throw new IllegalStateException("Unknown variant");
            }
            c10 = c();
        }
        return c10 + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.d() == d() && fVar.e() == e() && fVar.f() == f();
    }

    public c f() {
        return this.f35532c;
    }

    public int hashCode() {
        return Objects.hash(f.class, Integer.valueOf(this.f35531a), Integer.valueOf(this.b), this.f35532c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f35532c + ", " + this.b + "-byte tags, and " + this.f35531a + "-byte key)";
    }

    public f(int i10, int i11, c cVar) {
        this.f35531a = i10;
        this.b = i11;
        this.f35532c = cVar;
    }
}
