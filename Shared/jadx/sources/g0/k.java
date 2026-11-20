package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import g0.v2;

/* loaded from: classes.dex */
public final class k extends v2.h {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f17916a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17917c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17918d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f17919e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17920f;

    public k(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f17916a = rect;
        this.b = i10;
        this.f17917c = i11;
        this.f17918d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f17919e = matrix;
        this.f17920f = z11;
    }

    @Override // g0.v2.h
    public Rect a() {
        return this.f17916a;
    }

    @Override // g0.v2.h
    public int b() {
        return this.b;
    }

    @Override // g0.v2.h
    public Matrix c() {
        return this.f17919e;
    }

    @Override // g0.v2.h
    public int d() {
        return this.f17917c;
    }

    @Override // g0.v2.h
    public boolean e() {
        return this.f17918d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2.h) {
            v2.h hVar = (v2.h) obj;
            if (this.f17916a.equals(hVar.a()) && this.b == hVar.b() && this.f17917c == hVar.d() && this.f17918d == hVar.e() && this.f17919e.equals(hVar.c()) && this.f17920f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.v2.h
    public boolean f() {
        return this.f17920f;
    }

    public int hashCode() {
        return ((((((((((this.f17916a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f17917c) * 1000003) ^ (this.f17918d ? 1231 : 1237)) * 1000003) ^ this.f17919e.hashCode()) * 1000003) ^ (this.f17920f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f17916a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.f17917c + ", hasCameraTransform=" + this.f17918d + ", getSensorToBufferTransform=" + this.f17919e + ", isMirroring=" + this.f17920f + "}";
    }
}
