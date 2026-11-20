package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class b<T> extends b0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f34890a;
    public final p0.g b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34891c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f34892d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f34893e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34894f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f34895g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e0 f34896h;

    public b(T t8, p0.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, n0.e0 e0Var) {
        if (t8 == null) {
            throw new NullPointerException("Null data");
        }
        this.f34890a = t8;
        this.b = gVar;
        this.f34891c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f34892d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f34893e = rect;
        this.f34894f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f34895g = matrix;
        if (e0Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f34896h = e0Var;
    }

    @Override // x0.b0
    public n0.e0 a() {
        return this.f34896h;
    }

    @Override // x0.b0
    public Rect b() {
        return this.f34893e;
    }

    @Override // x0.b0
    public T c() {
        return this.f34890a;
    }

    @Override // x0.b0
    public p0.g d() {
        return this.b;
    }

    @Override // x0.b0
    public int e() {
        return this.f34891c;
    }

    public boolean equals(Object obj) {
        p0.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f34890a.equals(b0Var.c()) && ((gVar = this.b) != null ? gVar.equals(b0Var.d()) : b0Var.d() == null) && this.f34891c == b0Var.e() && this.f34892d.equals(b0Var.h()) && this.f34893e.equals(b0Var.b()) && this.f34894f == b0Var.f() && this.f34895g.equals(b0Var.g()) && this.f34896h.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.b0
    public int f() {
        return this.f34894f;
    }

    @Override // x0.b0
    public Matrix g() {
        return this.f34895g;
    }

    @Override // x0.b0
    public Size h() {
        return this.f34892d;
    }

    public int hashCode() {
        int hashCode = (this.f34890a.hashCode() ^ 1000003) * 1000003;
        p0.g gVar = this.b;
        return ((((((((((((hashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f34891c) * 1000003) ^ this.f34892d.hashCode()) * 1000003) ^ this.f34893e.hashCode()) * 1000003) ^ this.f34894f) * 1000003) ^ this.f34895g.hashCode()) * 1000003) ^ this.f34896h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f34890a + ", exif=" + this.b + ", format=" + this.f34891c + ", size=" + this.f34892d + ", cropRect=" + this.f34893e + ", rotationDegrees=" + this.f34894f + ", sensorToBufferTransform=" + this.f34895g + ", cameraCaptureResult=" + this.f34896h + "}";
    }
}
