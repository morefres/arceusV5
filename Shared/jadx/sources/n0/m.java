package n0;

import n0.a2;

/* loaded from: classes.dex */
public final class m extends a2.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f25448a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25451e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25452f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25453g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25454h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25455i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25456j;

    public m(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f25448a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25449c = i11;
        this.f25450d = i12;
        this.f25451e = i13;
        this.f25452f = i14;
        this.f25453g = i15;
        this.f25454h = i16;
        this.f25455i = i17;
        this.f25456j = i18;
    }

    @Override // n0.a2.c
    public int b() {
        return this.f25454h;
    }

    @Override // n0.a2.c
    public int c() {
        return this.f25449c;
    }

    @Override // n0.a2.c
    public int d() {
        return this.f25455i;
    }

    @Override // n0.a2.c
    public int e() {
        return this.f25448a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.c) {
            a2.c cVar = (a2.c) obj;
            if (this.f25448a == cVar.e() && this.b.equals(cVar.i()) && this.f25449c == cVar.c() && this.f25450d == cVar.f() && this.f25451e == cVar.l() && this.f25452f == cVar.h() && this.f25453g == cVar.j() && this.f25454h == cVar.b() && this.f25455i == cVar.d() && this.f25456j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.c
    public int f() {
        return this.f25450d;
    }

    @Override // n0.a2.c
    public int g() {
        return this.f25456j;
    }

    @Override // n0.a2.c
    public int h() {
        return this.f25452f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f25448a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25449c) * 1000003) ^ this.f25450d) * 1000003) ^ this.f25451e) * 1000003) ^ this.f25452f) * 1000003) ^ this.f25453g) * 1000003) ^ this.f25454h) * 1000003) ^ this.f25455i) * 1000003) ^ this.f25456j;
    }

    @Override // n0.a2.c
    public String i() {
        return this.b;
    }

    @Override // n0.a2.c
    public int j() {
        return this.f25453g;
    }

    @Override // n0.a2.c
    public int l() {
        return this.f25451e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f25448a + ", mediaType=" + this.b + ", bitrate=" + this.f25449c + ", frameRate=" + this.f25450d + ", width=" + this.f25451e + ", height=" + this.f25452f + ", profile=" + this.f25453g + ", bitDepth=" + this.f25454h + ", chromaSubsampling=" + this.f25455i + ", hdrFormat=" + this.f25456j + "}";
    }
}
