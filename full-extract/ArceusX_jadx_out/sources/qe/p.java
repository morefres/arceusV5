package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p extends qe.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f29726a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29727c;

    /* renamed from: d, reason: collision with root package name */
    public final c f29728d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f29729a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f29730c;

        /* renamed from: d, reason: collision with root package name */
        public c f29731d;

        public p a() {
            Integer num = this.f29729a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f29731d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f29730c != null) {
                return new p(num.intValue(), this.b.intValue(), this.f29730c.intValue(), this.f29731d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f29729a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f29730c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f29731d = cVar;
            return this;
        }

        public b() {
            this.f29729a = null;
            this.b = null;
            this.f29730c = null;
            this.f29731d = c.f29733d;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f29732c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f29733d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29734a;

        public c(String str) {
            this.f29734a = str;
        }

        public String toString() {
            return this.f29734a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // pe.x
    public boolean a() {
        return this.f29728d != c.f29733d;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f29726a;
    }

    public int e() {
        return this.f29727c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.d() == d() && pVar.c() == c() && pVar.e() == e() && pVar.f() == f();
    }

    public c f() {
        return this.f29728d;
    }

    public int hashCode() {
        return Objects.hash(p.class, Integer.valueOf(this.f29726a), Integer.valueOf(this.b), Integer.valueOf(this.f29727c), this.f29728d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f29728d + ", " + this.b + "-byte IV, " + this.f29727c + "-byte tag, and " + this.f29726a + "-byte key)";
    }

    public p(int i10, int i11, int i12, c cVar) {
        this.f29726a = i10;
        this.b = i11;
        this.f29727c = i12;
        this.f29728d = cVar;
    }
}
