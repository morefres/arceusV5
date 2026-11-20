package b8;

import b8.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3866a;
    public final Integer b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3867c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3868d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3869e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f3870f;

    /* renamed from: b8.b$b, reason: collision with other inner class name */
    public static final class C0078b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f3871a;
        public Integer b;

        /* renamed from: c, reason: collision with root package name */
        public h f3872c;

        /* renamed from: d, reason: collision with root package name */
        public Long f3873d;

        /* renamed from: e, reason: collision with root package name */
        public Long f3874e;

        /* renamed from: f, reason: collision with root package name */
        public Map<String, String> f3875f;

        @Override // b8.i.a
        public i d() {
            String str = "";
            if (this.f3871a == null) {
                str = " transportName";
            }
            if (this.f3872c == null) {
                str = str + " encodedPayload";
            }
            if (this.f3873d == null) {
                str = str + " eventMillis";
            }
            if (this.f3874e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f3875f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f3871a, this.b, this.f3872c, this.f3873d.longValue(), this.f3874e.longValue(), this.f3875f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b8.i.a
        public Map<String, String> e() {
            Map<String, String> map = this.f3875f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // b8.i.a
        public i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f3875f = map;
            return this;
        }

        @Override // b8.i.a
        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // b8.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f3872c = hVar;
            return this;
        }

        @Override // b8.i.a
        public i.a i(long j10) {
            this.f3873d = Long.valueOf(j10);
            return this;
        }

        @Override // b8.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f3871a = str;
            return this;
        }

        @Override // b8.i.a
        public i.a k(long j10) {
            this.f3874e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b8.i
    public Map<String, String> c() {
        return this.f3870f;
    }

    @Override // b8.i
    public Integer d() {
        return this.b;
    }

    @Override // b8.i
    public h e() {
        return this.f3867c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3866a.equals(iVar.j()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f3867c.equals(iVar.e()) && this.f3868d == iVar.f() && this.f3869e == iVar.k() && this.f3870f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.i
    public long f() {
        return this.f3868d;
    }

    public int hashCode() {
        int hashCode = (this.f3866a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3867c.hashCode()) * 1000003;
        long j10 = this.f3868d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f3869e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f3870f.hashCode();
    }

    @Override // b8.i
    public String j() {
        return this.f3866a;
    }

    @Override // b8.i
    public long k() {
        return this.f3869e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3866a + ", code=" + this.b + ", encodedPayload=" + this.f3867c + ", eventMillis=" + this.f3868d + ", uptimeMillis=" + this.f3869e + ", autoMetadata=" + this.f3870f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f3866a = str;
        this.b = num;
        this.f3867c = hVar;
        this.f3868d = j10;
        this.f3869e = j11;
        this.f3870f = map;
    }
}
