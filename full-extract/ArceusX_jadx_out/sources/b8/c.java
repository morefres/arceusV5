package b8;

import b8.n;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final o f3876a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.d<?> f3877c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.g<?, byte[]> f3878d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.c f3879e;

    public static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public o f3880a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public y7.d<?> f3881c;

        /* renamed from: d, reason: collision with root package name */
        public y7.g<?, byte[]> f3882d;

        /* renamed from: e, reason: collision with root package name */
        public y7.c f3883e;

        @Override // b8.n.a
        public n a() {
            String str = "";
            if (this.f3880a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.f3881c == null) {
                str = str + " event";
            }
            if (this.f3882d == null) {
                str = str + " transformer";
            }
            if (this.f3883e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f3880a, this.b, this.f3881c, this.f3882d, this.f3883e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.n.a
        public n.a b(y7.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f3883e = cVar;
            return this;
        }

        @Override // b8.n.a
        public n.a c(y7.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f3881c = dVar;
            return this;
        }

        @Override // b8.n.a
        public n.a d(y7.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f3882d = gVar;
            return this;
        }

        @Override // b8.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f3880a = oVar;
            return this;
        }

        @Override // b8.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // b8.n
    public y7.c b() {
        return this.f3879e;
    }

    @Override // b8.n
    public y7.d<?> c() {
        return this.f3877c;
    }

    @Override // b8.n
    public y7.g<?, byte[]> e() {
        return this.f3878d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f3876a.equals(nVar.f()) && this.b.equals(nVar.g()) && this.f3877c.equals(nVar.c()) && this.f3878d.equals(nVar.e()) && this.f3879e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.n
    public o f() {
        return this.f3876a;
    }

    @Override // b8.n
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.f3876a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f3877c.hashCode()) * 1000003) ^ this.f3878d.hashCode()) * 1000003) ^ this.f3879e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3876a + ", transportName=" + this.b + ", event=" + this.f3877c + ", transformer=" + this.f3878d + ", encoding=" + this.f3879e + "}";
    }

    public c(o oVar, String str, y7.d<?> dVar, y7.g<?, byte[]> gVar, y7.c cVar) {
        this.f3876a = oVar;
        this.b = str;
        this.f3877c = dVar;
        this.f3878d = gVar;
        this.f3879e = cVar;
    }
}
