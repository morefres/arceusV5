package g0;

import android.graphics.Matrix;
import n0.z3;

/* loaded from: classes.dex */
public final class g extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final z3 f17877a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17878c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f17879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17880e;

    public g(z3 z3Var, long j10, int i10, Matrix matrix, int i11) {
        if (z3Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f17877a = z3Var;
        this.b = j10;
        this.f17878c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f17879d = matrix;
        this.f17880e = i11;
    }

    @Override // g0.o1, g0.i1
    public int b() {
        return this.f17880e;
    }

    @Override // g0.o1, g0.i1
    public z3 c() {
        return this.f17877a;
    }

    @Override // g0.o1, g0.i1
    public int d() {
        return this.f17878c;
    }

    @Override // g0.o1, g0.i1
    public Matrix e() {
        return this.f17879d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f17877a.equals(o1Var.c()) && this.b == o1Var.getTimestamp() && this.f17878c == o1Var.d() && this.f17879d.equals(o1Var.e()) && this.f17880e == o1Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.o1, g0.i1
    public long getTimestamp() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (this.f17877a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        return ((((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f17878c) * 1000003) ^ this.f17879d.hashCode()) * 1000003) ^ this.f17880e;
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f17877a + ", timestamp=" + this.b + ", rotationDegrees=" + this.f17878c + ", sensorToBufferTransformMatrix=" + this.f17879d + ", flashState=" + this.f17880e + "}";
    }
}
