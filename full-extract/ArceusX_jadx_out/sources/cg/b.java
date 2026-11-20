package cg;

import androidx.annotation.NonNull;
import cg.f;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4915a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final f.b f4916c;

    /* renamed from: cg.b$b, reason: collision with other inner class name */
    public static final class C0106b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f4917a;
        public long b;

        /* renamed from: c, reason: collision with root package name */
        public f.b f4918c;

        /* renamed from: d, reason: collision with root package name */
        public byte f4919d;

        @Override // cg.f.a
        public f a() {
            if (this.f4919d == 1) {
                return new b(this.f4917a, this.b, this.f4918c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // cg.f.a
        public f.a b(f.b bVar) {
            this.f4918c = bVar;
            return this;
        }

        @Override // cg.f.a
        public f.a c(String str) {
            this.f4917a = str;
            return this;
        }

        @Override // cg.f.a
        public f.a d(long j10) {
            this.b = j10;
            this.f4919d = (byte) (this.f4919d | 1);
            return this;
        }
    }

    @Override // cg.f
    public f.b b() {
        return this.f4916c;
    }

    @Override // cg.f
    public String c() {
        return this.f4915a;
    }

    @Override // cg.f
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f4915a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.b == fVar.d() && ((bVar = this.f4916c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4915a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f4916c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f4915a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.f4916c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f4915a = str;
        this.b = j10;
        this.f4916c = bVar;
    }
}
