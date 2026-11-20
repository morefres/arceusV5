package z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f37628a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37629c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f37630d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f37631e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37632f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37633g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37634h;

    public b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f37628a = uuid;
        this.b = i10;
        this.f37629c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f37630d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f37631e = size;
        this.f37632f = i12;
        this.f37633g = z10;
        this.f37634h = z11;
    }

    @Override // z0.f
    public Rect a() {
        return this.f37630d;
    }

    @Override // z0.f
    public int b() {
        return this.f37629c;
    }

    @Override // z0.f
    public int c() {
        return this.f37632f;
    }

    @Override // z0.f
    public Size d() {
        return this.f37631e;
    }

    @Override // z0.f
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f37628a.equals(fVar.f()) && this.b == fVar.e() && this.f37629c == fVar.b() && this.f37630d.equals(fVar.a()) && this.f37631e.equals(fVar.d()) && this.f37632f == fVar.c() && this.f37633g == fVar.g() && this.f37634h == fVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.f
    public UUID f() {
        return this.f37628a;
    }

    @Override // z0.f
    public boolean g() {
        return this.f37633g;
    }

    public int hashCode() {
        return ((((((((((((((this.f37628a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37629c) * 1000003) ^ this.f37630d.hashCode()) * 1000003) ^ this.f37631e.hashCode()) * 1000003) ^ this.f37632f) * 1000003) ^ (this.f37633g ? 1231 : 1237)) * 1000003) ^ (this.f37634h ? 1231 : 1237);
    }

    @Override // z0.f
    public boolean k() {
        return this.f37634h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f37628a + ", getTargets=" + this.b + ", getFormat=" + this.f37629c + ", getCropRect=" + this.f37630d + ", getSize=" + this.f37631e + ", getRotationDegrees=" + this.f37632f + ", isMirroring=" + this.f37633g + ", shouldRespectInputCropRect=" + this.f37634h + "}";
    }
}
