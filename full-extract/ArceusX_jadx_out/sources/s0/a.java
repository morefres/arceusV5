package s0;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final float f30815a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f30816c;

    /* renamed from: d, reason: collision with root package name */
    public final float f30817d;

    public a(float f10, float f11, float f12, float f13) {
        this.f30815a = f10;
        this.b = f11;
        this.f30816c = f12;
        this.f30817d = f13;
    }

    @Override // s0.h, g0.z2
    public float a() {
        return this.b;
    }

    @Override // s0.h, g0.z2
    public float b() {
        return this.f30817d;
    }

    @Override // s0.h, g0.z2
    public float c() {
        return this.f30816c;
    }

    @Override // s0.h, g0.z2
    public float d() {
        return this.f30815a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f30815a) == Float.floatToIntBits(hVar.d()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f30816c) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f30817d) == Float.floatToIntBits(hVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f30815a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.f30816c)) * 1000003) ^ Float.floatToIntBits(this.f30817d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f30815a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.f30816c + ", linearZoom=" + this.f30817d + "}";
    }
}
