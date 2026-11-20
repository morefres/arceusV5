package z0;

import z0.e;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f37622a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37624d;

    public static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public String f37625a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f37626c;

        /* renamed from: d, reason: collision with root package name */
        public String f37627d;

        @Override // z0.e.a
        public e a() {
            String str = "";
            if (this.f37625a == null) {
                str = " glVersion";
            }
            if (this.b == null) {
                str = str + " eglVersion";
            }
            if (this.f37626c == null) {
                str = str + " glExtensions";
            }
            if (this.f37627d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f37625a, this.b, this.f37626c, this.f37627d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f37627d = str;
            return this;
        }

        @Override // z0.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.b = str;
            return this;
        }

        @Override // z0.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f37626c = str;
            return this;
        }

        @Override // z0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f37625a = str;
            return this;
        }
    }

    @Override // z0.e
    public String b() {
        return this.f37624d;
    }

    @Override // z0.e
    public String c() {
        return this.b;
    }

    @Override // z0.e
    public String d() {
        return this.f37623c;
    }

    @Override // z0.e
    public String e() {
        return this.f37622a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f37622a.equals(eVar.e()) && this.b.equals(eVar.c()) && this.f37623c.equals(eVar.d()) && this.f37624d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f37622a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f37623c.hashCode()) * 1000003) ^ this.f37624d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f37622a + ", eglVersion=" + this.b + ", glExtensions=" + this.f37623c + ", eglExtensions=" + this.f37624d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f37622a = str;
        this.b = str2;
        this.f37623c = str3;
        this.f37624d = str4;
    }
}
