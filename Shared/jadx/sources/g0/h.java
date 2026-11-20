package g0;

import android.graphics.Rect;
import android.util.Size;
import g0.j2;

/* loaded from: classes.dex */
public final class h extends j2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Size f17893a;
    public final Rect b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.p0 f17894c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17895d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17896e;

    public h(Size size, Rect rect, n0.p0 p0Var, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f17893a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.f17894c = p0Var;
        this.f17895d = i10;
        this.f17896e = z10;
    }

    @Override // g0.j2.a
    public n0.p0 a() {
        return this.f17894c;
    }

    @Override // g0.j2.a
    public Rect b() {
        return this.b;
    }

    @Override // g0.j2.a
    public Size c() {
        return this.f17893a;
    }

    @Override // g0.j2.a
    public boolean d() {
        return this.f17896e;
    }

    @Override // g0.j2.a
    public int e() {
        return this.f17895d;
    }

    public boolean equals(Object obj) {
        n0.p0 p0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2.a) {
            j2.a aVar = (j2.a) obj;
            if (this.f17893a.equals(aVar.c()) && this.b.equals(aVar.b()) && ((p0Var = this.f17894c) != null ? p0Var.equals(aVar.a()) : aVar.a() == null) && this.f17895d == aVar.e() && this.f17896e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f17893a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n0.p0 p0Var = this.f17894c;
        return ((((hashCode ^ (p0Var == null ? 0 : p0Var.hashCode())) * 1000003) ^ this.f17895d) * 1000003) ^ (this.f17896e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f17893a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.f17894c + ", rotationDegrees=" + this.f17895d + ", mirroring=" + this.f17896e + "}";
    }
}
