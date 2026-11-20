package bg;

import androidx.annotation.NonNull;
import bg.c;
import bg.d;

/* loaded from: classes2.dex */
public final class a extends d {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f4160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4161d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4162e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4163f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4164g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4165h;

    public static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f4166a;
        public c.a b;

        /* renamed from: c, reason: collision with root package name */
        public String f4167c;

        /* renamed from: d, reason: collision with root package name */
        public String f4168d;

        /* renamed from: e, reason: collision with root package name */
        public long f4169e;

        /* renamed from: f, reason: collision with root package name */
        public long f4170f;

        /* renamed from: g, reason: collision with root package name */
        public String f4171g;

        /* renamed from: h, reason: collision with root package name */
        public byte f4172h;

        @Override // bg.d.a
        public d a() {
            if (this.f4172h == 3 && this.b != null) {
                return new a(this.f4166a, this.b, this.f4167c, this.f4168d, this.f4169e, this.f4170f, this.f4171g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f4172h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f4172h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // bg.d.a
        public d.a b(String str) {
            this.f4167c = str;
            return this;
        }

        @Override // bg.d.a
        public d.a c(long j10) {
            this.f4169e = j10;
            this.f4172h = (byte) (this.f4172h | 1);
            return this;
        }

        @Override // bg.d.a
        public d.a d(String str) {
            this.f4166a = str;
            return this;
        }

        @Override // bg.d.a
        public d.a e(String str) {
            this.f4171g = str;
            return this;
        }

        @Override // bg.d.a
        public d.a f(String str) {
            this.f4168d = str;
            return this;
        }

        @Override // bg.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // bg.d.a
        public d.a h(long j10) {
            this.f4170f = j10;
            this.f4172h = (byte) (this.f4172h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f4166a = dVar.d();
            this.b = dVar.g();
            this.f4167c = dVar.b();
            this.f4168d = dVar.f();
            this.f4169e = dVar.c();
            this.f4170f = dVar.h();
            this.f4171g = dVar.e();
            this.f4172h = (byte) 3;
        }
    }

    @Override // bg.d
    public String b() {
        return this.f4161d;
    }

    @Override // bg.d
    public long c() {
        return this.f4163f;
    }

    @Override // bg.d
    public String d() {
        return this.b;
    }

    @Override // bg.d
    public String e() {
        return this.f4165h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f4160c.equals(dVar.g()) && ((str = this.f4161d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f4162e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f4163f == dVar.c() && this.f4164g == dVar.h() && ((str3 = this.f4165h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bg.d
    public String f() {
        return this.f4162e;
    }

    @Override // bg.d
    @NonNull
    public c.a g() {
        return this.f4160c;
    }

    @Override // bg.d
    public long h() {
        return this.f4164g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4160c.hashCode()) * 1000003;
        String str2 = this.f4161d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4162e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f4163f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f4164g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f4165h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // bg.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.f4160c + ", authToken=" + this.f4161d + ", refreshToken=" + this.f4162e + ", expiresInSecs=" + this.f4163f + ", tokenCreationEpochInSecs=" + this.f4164g + ", fisError=" + this.f4165h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.b = str;
        this.f4160c = aVar;
        this.f4161d = str2;
        this.f4162e = str3;
        this.f4163f = j10;
        this.f4164g = j11;
        this.f4165h = str4;
    }
}
