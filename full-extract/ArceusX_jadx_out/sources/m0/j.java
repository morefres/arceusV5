package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import g0.f1;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f23962c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.f f23963d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.g f23964e;

    /* renamed from: f, reason: collision with root package name */
    public final f1.h f23965f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.h f23966g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f23967h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f23968i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23969j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23970k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23971l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23972m;

    /* renamed from: n, reason: collision with root package name */
    public final List<n0.u> f23973n;

    public j(Executor executor, f1.f fVar, f1.g gVar, f1.h hVar, f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f23962c = executor;
        this.f23963d = fVar;
        this.f23964e = gVar;
        this.f23965f = hVar;
        this.f23966g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f23967h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f23968i = matrix;
        this.f23969j = i10;
        this.f23970k = i11;
        this.f23971l = i12;
        this.f23972m = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f23973n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f23962c.equals(l1Var.g())) {
                l1Var.j();
                f1.g gVar = this.f23964e;
                if (gVar != null ? gVar.equals(l1Var.l()) : l1Var.l() == null) {
                    f1.h hVar = this.f23965f;
                    if (hVar != null ? hVar.equals(l1Var.m()) : l1Var.m() == null) {
                        f1.h hVar2 = this.f23966g;
                        if (hVar2 != null ? hVar2.equals(l1Var.o()) : l1Var.o() == null) {
                            if (this.f23967h.equals(l1Var.i()) && this.f23968i.equals(l1Var.p()) && this.f23969j == l1Var.n() && this.f23970k == l1Var.k() && this.f23971l == l1Var.h() && this.f23972m == l1Var.t() && this.f23973n.equals(l1Var.q())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m0.l1
    public Executor g() {
        return this.f23962c;
    }

    @Override // m0.l1
    public int h() {
        return this.f23971l;
    }

    public int hashCode() {
        int hashCode = (((this.f23962c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        f1.g gVar = this.f23964e;
        int hashCode2 = (hashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        f1.h hVar = this.f23965f;
        int hashCode3 = (hashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        f1.h hVar2 = this.f23966g;
        return ((((((((((((((hashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f23967h.hashCode()) * 1000003) ^ this.f23968i.hashCode()) * 1000003) ^ this.f23969j) * 1000003) ^ this.f23970k) * 1000003) ^ this.f23971l) * 1000003) ^ (this.f23972m ? 1231 : 1237)) * 1000003) ^ this.f23973n.hashCode();
    }

    @Override // m0.l1
    public Rect i() {
        return this.f23967h;
    }

    @Override // m0.l1
    public f1.f j() {
        return this.f23963d;
    }

    @Override // m0.l1
    public int k() {
        return this.f23970k;
    }

    @Override // m0.l1
    public f1.g l() {
        return this.f23964e;
    }

    @Override // m0.l1
    public f1.h m() {
        return this.f23965f;
    }

    @Override // m0.l1
    public int n() {
        return this.f23969j;
    }

    @Override // m0.l1
    public f1.h o() {
        return this.f23966g;
    }

    @Override // m0.l1
    public Matrix p() {
        return this.f23968i;
    }

    @Override // m0.l1
    public List<n0.u> q() {
        return this.f23973n;
    }

    @Override // m0.l1
    public boolean t() {
        return this.f23972m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f23962c + ", inMemoryCallback=" + this.f23963d + ", onDiskCallback=" + this.f23964e + ", outputFileOptions=" + this.f23965f + ", secondaryOutputFileOptions=" + this.f23966g + ", cropRect=" + this.f23967h + ", sensorToBufferTransform=" + this.f23968i + ", rotationDegrees=" + this.f23969j + ", jpegQuality=" + this.f23970k + ", captureMode=" + this.f23971l + ", simultaneousCapture=" + this.f23972m + ", sessionConfigCameraCaptureCallbacks=" + this.f23973n + "}";
    }
}
