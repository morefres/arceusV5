package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u extends qe.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f29761a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29762c;

    /* renamed from: d, reason: collision with root package name */
    public final c f29763d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f29764a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29765c;

        /* renamed from: d, reason: collision with root package name */
        public c f29766d;

        public u a() {
            Integer num = this.f29764a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f29766d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f29765c != null) {
                return new u(num.intValue(), this.b.intValue(), this.f29765c.intValue(), this.f29766d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29764a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f29765c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f29766d = cVar;
            return this;
        }

        public b() {
            this.f29764a = null;
            this.b = null;
            this.f29765c = null;
            this.f29766d = c.f29768d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f29767c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f29768d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29769a;

        public c(String str) {
            this.f29769a = str;
        }

        public String toString() {
            return this.f29769a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29763d != c.f29768d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29761a;
    }

    public int e() {
        return this.f29762c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.d() == d() && uVar.c() == c() && uVar.e() == e() && uVar.f() == f();
    }

    public c f() {
        return this.f29763d;
    }

    public int hashCode() {
        return Objects.hash(u.class, Integer.valueOf(this.f29761a), Integer.valueOf(this.b), Integer.valueOf(this.f29762c), this.f29763d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f29763d + ", " + this.b + "-byte IV, " + this.f29762c + "-byte tag, and " + this.f29761a + "-byte key)";
    }

    public u(int i10, int i11, int i12, c cVar) {
        this.f29761a = i10;
        this.b = i11;
        this.f29762c = i12;
        this.f29763d = cVar;
    }
}
