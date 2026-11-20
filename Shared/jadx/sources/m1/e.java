package m1;

/* loaded from: classes.dex */
public final class e extends q1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f24097f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24098g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24099h;

    public e(int i10, int i11, int i12) {
        this.f24097f = i10;
        this.f24098g = i11;
        this.f24099h = i12;
    }

    @Override // m1.q1
    public int b() {
        return this.f24099h;
    }

    @Override // m1.q1
    public int c() {
        return this.f24097f;
    }

    @Override // m1.q1
    public int d() {
        return this.f24098g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f24097f == q1Var.c() && this.f24098g == q1Var.d() && this.f24099h == q1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24097f ^ 1000003) * 1000003) ^ this.f24098g) * 1000003) ^ this.f24099h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f24097f + ", transfer=" + this.f24098g + ", range=" + this.f24099h + "}";
    }
}
