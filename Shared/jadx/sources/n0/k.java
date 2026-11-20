package n0;

import n0.a2;

/* loaded from: classes.dex */
public final class k extends a2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f25417a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25421f;

    public k(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f25417a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25418c = i11;
        this.f25419d = i12;
        this.f25420e = i13;
        this.f25421f = i14;
    }

    @Override // n0.a2.a
    public int b() {
        return this.f25418c;
    }

    @Override // n0.a2.a
    public int c() {
        return this.f25420e;
    }

    @Override // n0.a2.a
    public int d() {
        return this.f25417a;
    }

    @Override // n0.a2.a
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.a) {
            a2.a aVar = (a2.a) obj;
            if (this.f25417a == aVar.d() && this.b.equals(aVar.e()) && this.f25418c == aVar.b() && this.f25419d == aVar.g() && this.f25420e == aVar.c() && this.f25421f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.a
    public int f() {
        return this.f25421f;
    }

    @Override // n0.a2.a
    public int g() {
        return this.f25419d;
    }

    public int hashCode() {
        return ((((((((((this.f25417a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25418c) * 1000003) ^ this.f25419d) * 1000003) ^ this.f25420e) * 1000003) ^ this.f25421f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f25417a + ", mediaType=" + this.b + ", bitrate=" + this.f25418c + ", sampleRate=" + this.f25419d + ", channels=" + this.f25420e + ", profile=" + this.f25421f + "}";
    }
}
