package z;

import android.util.Range;
import z.g5;

/* loaded from: classes.dex */
public final class f extends g5.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f37105a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37106c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37107d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37108e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37109f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37110g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37111h;

    /* renamed from: i, reason: collision with root package name */
    public final Range<Integer> f37112i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f37113j;

    public f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        this.f37105a = i10;
        this.b = z10;
        this.f37106c = i11;
        this.f37107d = z11;
        this.f37108e = z12;
        this.f37109f = z13;
        this.f37110g = z14;
        this.f37111h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f37112i = range;
        this.f37113j = z16;
    }

    @Override // z.g5.d
    public int a() {
        return this.f37105a;
    }

    @Override // z.g5.d
    public int b() {
        return this.f37106c;
    }

    @Override // z.g5.d
    public Range<Integer> c() {
        return this.f37112i;
    }

    @Override // z.g5.d
    public boolean d() {
        return this.b;
    }

    @Override // z.g5.d
    public boolean e() {
        return this.f37110g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.d) {
            g5.d dVar = (g5.d) obj;
            if (this.f37105a == dVar.a() && this.b == dVar.d() && this.f37106c == dVar.b() && this.f37107d == dVar.g() && this.f37108e == dVar.i() && this.f37109f == dVar.f() && this.f37110g == dVar.e() && this.f37111h == dVar.k() && this.f37112i.equals(dVar.c()) && this.f37113j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g5.d
    public boolean f() {
        return this.f37109f;
    }

    @Override // z.g5.d
    public boolean g() {
        return this.f37107d;
    }

    @Override // z.g5.d
    public boolean h() {
        return this.f37113j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f37105a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.f37106c) * 1000003) ^ (this.f37107d ? 1231 : 1237)) * 1000003) ^ (this.f37108e ? 1231 : 1237)) * 1000003) ^ (this.f37109f ? 1231 : 1237)) * 1000003) ^ (this.f37110g ? 1231 : 1237)) * 1000003) ^ (this.f37111h ? 1231 : 1237)) * 1000003) ^ this.f37112i.hashCode()) * 1000003) ^ (this.f37113j ? 1231 : 1237);
    }

    @Override // z.g5.d
    public boolean i() {
        return this.f37108e;
    }

    @Override // z.g5.d
    public boolean k() {
        return this.f37111h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f37105a + ", hasVideoCapture=" + this.b + ", getRequiredMaxBitDepth=" + this.f37106c + ", isPreviewStabilizationOn=" + this.f37107d + ", isUltraHdrOn=" + this.f37108e + ", isHighSpeedOn=" + this.f37109f + ", isFeatureComboInvocation=" + this.f37110g + ", requiresFeatureComboQuery=" + this.f37111h + ", getTargetFpsRange=" + this.f37112i + ", isStrictFpsRequired=" + this.f37113j + "}";
    }
}
