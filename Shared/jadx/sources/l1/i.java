package l1;

import l1.p;
import n0.a2;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f23197a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.c f23198c;

    public static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        public String f23199a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public a2.c f23200c;

        @Override // l1.p.a
        public p b() {
            String str = "";
            if (this.f23199a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new i(this.f23199a, this.b.intValue(), this.f23200c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l1.p.a
        public p.a c(a2.c cVar) {
            this.f23200c = cVar;
            return this;
        }

        public p.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f23199a = str;
            return this;
        }

        @Override // l1.l.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public p.a a(int i10) {
            this.b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // l1.l
    public String a() {
        return this.f23197a;
    }

    @Override // l1.l
    public int b() {
        return this.b;
    }

    @Override // l1.p
    public a2.c d() {
        return this.f23198c;
    }

    public boolean equals(Object obj) {
        a2.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f23197a.equals(pVar.a()) && this.b == pVar.b() && ((cVar = this.f23198c) != null ? cVar.equals(pVar.d()) : pVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f23197a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        a2.c cVar = this.f23198c;
        return hashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f23197a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.f23198c + "}";
    }

    public i(String str, int i10, a2.c cVar) {
        this.f23197a = str;
        this.b = i10;
        this.f23198c = cVar;
    }
}
