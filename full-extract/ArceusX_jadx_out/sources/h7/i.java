package h7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import f7.h0;
import f7.o0;

/* loaded from: classes3.dex */
public class i extends a {
    public i7.q A;

    /* renamed from: q, reason: collision with root package name */
    public final String f19080q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f19081r;

    /* renamed from: s, reason: collision with root package name */
    public final w1.g<LinearGradient> f19082s;

    /* renamed from: t, reason: collision with root package name */
    public final w1.g<RadialGradient> f19083t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f19084u;

    /* renamed from: v, reason: collision with root package name */
    public final n7.g f19085v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19086w;

    /* renamed from: x, reason: collision with root package name */
    public final i7.a<n7.d, n7.d> f19087x;

    /* renamed from: y, reason: collision with root package name */
    public final i7.a<PointF, PointF> f19088y;

    /* renamed from: z, reason: collision with root package name */
    public final i7.a<PointF, PointF> f19089z;

    public i(h0 h0Var, o7.b bVar, n7.f fVar) {
        super(h0Var, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f19082s = new w1.g<>();
        this.f19083t = new w1.g<>();
        this.f19084u = new RectF();
        this.f19080q = fVar.j();
        this.f19085v = fVar.f();
        this.f19081r = fVar.n();
        this.f19086w = (int) (h0Var.J().d() / 32.0f);
        i7.a<n7.d, n7.d> a10 = fVar.e().a();
        this.f19087x = a10;
        a10.a(this);
        bVar.j(a10);
        i7.a<PointF, PointF> a11 = fVar.l().a();
        this.f19088y = a11;
        a11.a(this);
        bVar.j(a11);
        i7.a<PointF, PointF> a12 = fVar.d().a();
        this.f19089z = a12;
        a12.a(this);
        bVar.j(a12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h7.a, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.L) {
            i7.q qVar = this.A;
            if (qVar != null) {
                this.f19019f.H(qVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.A = qVar2;
            qVar2.a(this);
            this.f19019f.j(this.A);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f19080q;
    }

    @Override // h7.a, h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f19081r) {
            return;
        }
        e(this.f19084u, matrix, false);
        this.f19022i.setShader(this.f19085v == n7.g.LINEAR ? m() : n());
        super.i(canvas, matrix, i10, bVar);
    }

    public final int[] k(int[] iArr) {
        i7.q qVar = this.A;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    public final int l() {
        int round = Math.round(this.f19088y.f() * this.f19086w);
        int round2 = Math.round(this.f19089z.f() * this.f19086w);
        int round3 = Math.round(this.f19087x.f() * this.f19086w);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    public final LinearGradient m() {
        long l10 = l();
        LinearGradient e10 = this.f19082s.e(l10);
        if (e10 != null) {
            return e10;
        }
        PointF h10 = this.f19088y.h();
        PointF h11 = this.f19089z.h();
        n7.d h12 = this.f19087x.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, k(h12.d()), h12.e(), Shader.TileMode.CLAMP);
        this.f19082s.i(l10, linearGradient);
        return linearGradient;
    }

    public final RadialGradient n() {
        long l10 = l();
        RadialGradient e10 = this.f19083t.e(l10);
        if (e10 != null) {
            return e10;
        }
        PointF h10 = this.f19088y.h();
        PointF h11 = this.f19089z.h();
        n7.d h12 = this.f19087x.h();
        int[] k10 = k(h12.d());
        float[] e11 = h12.e();
        RadialGradient radialGradient = new RadialGradient(h10.x, h10.y, (float) Math.hypot(h11.x - r7, h11.y - r8), k10, e11, Shader.TileMode.CLAMP);
        this.f19083t.i(l10, radialGradient);
        return radialGradient;
    }
}
