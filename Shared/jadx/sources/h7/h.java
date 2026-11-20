package h7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f19061a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.b f19062c;

    /* renamed from: d, reason: collision with root package name */
    public final w1.g<LinearGradient> f19063d = new w1.g<>();

    /* renamed from: e, reason: collision with root package name */
    public final w1.g<RadialGradient> f19064e = new w1.g<>();

    /* renamed from: f, reason: collision with root package name */
    public final Path f19065f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f19066g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f19067h;

    /* renamed from: i, reason: collision with root package name */
    public final List<m> f19068i;

    /* renamed from: j, reason: collision with root package name */
    public final n7.g f19069j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.a<n7.d, n7.d> f19070k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19071l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.a<PointF, PointF> f19072m;

    /* renamed from: n, reason: collision with root package name */
    public final i7.a<PointF, PointF> f19073n;

    /* renamed from: o, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19074o;

    /* renamed from: p, reason: collision with root package name */
    public i7.q f19075p;

    /* renamed from: q, reason: collision with root package name */
    public final h0 f19076q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19077r;

    /* renamed from: s, reason: collision with root package name */
    public i7.a<Float, Float> f19078s;

    /* renamed from: t, reason: collision with root package name */
    public float f19079t;

    public h(h0 h0Var, f7.i iVar, o7.b bVar, n7.e eVar) {
        Path path = new Path();
        this.f19065f = path;
        this.f19066g = new g7.a(1);
        this.f19067h = new RectF();
        this.f19068i = new ArrayList();
        this.f19079t = 0.0f;
        this.f19062c = bVar;
        this.f19061a = eVar.f();
        this.b = eVar.i();
        this.f19076q = h0Var;
        this.f19069j = eVar.e();
        path.setFillType(eVar.c());
        this.f19077r = (int) (iVar.d() / 32.0f);
        i7.a<n7.d, n7.d> a10 = eVar.d().a();
        this.f19070k = a10;
        a10.a(this);
        bVar.j(a10);
        i7.a<Integer, Integer> a11 = eVar.g().a();
        this.f19071l = a11;
        a11.a(this);
        bVar.j(a11);
        i7.a<PointF, PointF> a12 = eVar.h().a();
        this.f19072m = a12;
        a12.a(this);
        bVar.j(a12);
        i7.a<PointF, PointF> a13 = eVar.b().a();
        this.f19073n = a13;
        a13.a(this);
        bVar.j(a13);
        if (bVar.x() != null) {
            i7.d a14 = bVar.x().a().a();
            this.f19078s = a14;
            a14.a(this);
            bVar.j(this.f19078s);
        }
    }

    private int[] f(int[] iArr) {
        i7.q qVar = this.f19075p;
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

    private int j() {
        int round = Math.round(this.f19072m.f() * this.f19077r);
        int round2 = Math.round(this.f19073n.f() * this.f19077r);
        int round3 = Math.round(this.f19070k.f() * this.f19077r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        LinearGradient e10 = this.f19063d.e(j10);
        if (e10 != null) {
            return e10;
        }
        PointF h10 = this.f19072m.h();
        PointF h11 = this.f19073n.h();
        n7.d h12 = this.f19070k.h();
        int[] f10 = f(h12.d());
        float[] e11 = h12.e();
        if (f10.length < 2) {
            iArr = new int[]{f10[0], f10[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e11;
            iArr = f10;
        }
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f19063d.i(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient e10 = this.f19064e.e(j10);
        if (e10 != null) {
            return e10;
        }
        PointF h10 = this.f19072m.h();
        PointF h11 = this.f19073n.h();
        n7.d h12 = this.f19070k.h();
        int[] f10 = f(h12.d());
        float[] e11 = h12.e();
        if (f10.length < 2) {
            iArr = new int[]{f10[0], f10[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e11;
            iArr = f10;
        }
        float f11 = h10.x;
        float f12 = h10.y;
        float hypot = (float) Math.hypot(h11.x - f11, h11.y - f12);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f11, f12, hypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f19064e.i(j10, radialGradient);
        return radialGradient;
    }

    @Override // i7.a.b
    public void a() {
        this.f19076q.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f19068i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16984d) {
            this.f19071l.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19074o;
            if (aVar != null) {
                this.f19062c.H(aVar);
            }
            if (cVar == null) {
                this.f19074o = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19074o = qVar;
            qVar.a(this);
            this.f19062c.j(this.f19074o);
            return;
        }
        if (t8 != o0.L) {
            if (t8 == o0.f16990j) {
                i7.a<Float, Float> aVar2 = this.f19078s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                i7.q qVar2 = new i7.q(cVar);
                this.f19078s = qVar2;
                qVar2.a(this);
                this.f19062c.j(this.f19078s);
                return;
            }
            return;
        }
        i7.q qVar3 = this.f19075p;
        if (qVar3 != null) {
            this.f19062c.H(qVar3);
        }
        if (cVar == null) {
            this.f19075p = null;
            return;
        }
        this.f19063d.a();
        this.f19064e.a();
        i7.q qVar4 = new i7.q(cVar);
        this.f19075p = qVar4;
        qVar4.a(this);
        this.f19062c.j(this.f19075p);
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19065f.reset();
        for (int i10 = 0; i10 < this.f19068i.size(); i10++) {
            this.f19065f.addPath(this.f19068i.get(i10).getPath(), matrix);
        }
        this.f19065f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h7.c
    public String getName() {
        return this.f19061a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.b) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("GradientFillContent#draw");
        }
        this.f19065f.reset();
        for (int i11 = 0; i11 < this.f19068i.size(); i11++) {
            this.f19065f.addPath(this.f19068i.get(i11).getPath(), matrix);
        }
        this.f19065f.computeBounds(this.f19067h, false);
        Shader k10 = this.f19069j == n7.g.LINEAR ? k() : l();
        k10.setLocalMatrix(matrix);
        this.f19066g.setShader(k10);
        i7.a<ColorFilter, ColorFilter> aVar = this.f19074o;
        if (aVar != null) {
            this.f19066g.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f19078s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f19066g.setMaskFilter(null);
            } else if (floatValue != this.f19079t) {
                this.f19066g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f19079t = floatValue;
        }
        float intValue = this.f19071l.h().intValue() / 100.0f;
        this.f19066g.setAlpha(s7.j.c((int) (i10 * intValue), 0, 255));
        if (bVar != null) {
            bVar.c((int) (intValue * 255.0f), this.f19066g);
        }
        canvas.drawPath(this.f19065f, this.f19066g);
        if (f7.e.h()) {
            f7.e.c("GradientFillContent#draw");
        }
    }
}
