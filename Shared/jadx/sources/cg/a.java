package cg;

import cg.d;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4907a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4908c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4909d;

    /* renamed from: e, reason: collision with root package name */
    public final d.b f4910e;

    public static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f4911a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f4912c;

        /* renamed from: d, reason: collision with root package name */
        public f f4913d;

        /* renamed from: e, reason: collision with root package name */
        public d.b f4914e;

        @Override // cg.d.a
        public d a() {
            return new a(this.f4911a, this.b, this.f4912c, this.f4913d, this.f4914e);
        }

        @Override // cg.d.a
        public d.a b(f fVar) {
            this.f4913d = fVar;
            return this;
        }

        @Override // cg.d.a
        public d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // cg.d.a
        public d.a d(String str) {
            this.f4912c = str;
            return this;
        }

        @Override // cg.d.a
        public d.a e(d.b bVar) {
            this.f4914e = bVar;
            return this;
        }

        @Override // cg.d.a
        public d.a f(String str) {
            this.f4911a = str;
            return this;
        }
    }

    @Override // cg.d
    public f b() {
        return this.f4909d;
    }

    @Override // cg.d
    public String c() {
        return this.b;
    }

    @Override // cg.d
    public String d() {
        return this.f4908c;
    }

    @Override // cg.d
    public d.b e() {
        return this.f4910e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f4907a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f4908c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f4909d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f4910e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // cg.d
    public String f() {
        return this.f4907a;
    }

    public int hashCode() {
        String str = this.f4907a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4908c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f4909d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f4910e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4907a + ", fid=" + this.b + ", refreshToken=" + this.f4908c + ", authToken=" + this.f4909d + ", responseCode=" + this.f4910e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f4907a = str;
        this.b = str2;
        this.f4908c = str3;
        this.f4909d = fVar;
        this.f4910e = bVar;
    }
}
