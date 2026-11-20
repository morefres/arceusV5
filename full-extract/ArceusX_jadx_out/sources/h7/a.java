package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.ArrayList;
import java.util.List;
import n7.t;

/* loaded from: classes3.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final h0 f19018e;

    /* renamed from: f, reason: collision with root package name */
    public final o7.b f19019f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f19021h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f19022i;

    /* renamed from: j, reason: collision with root package name */
    public final i7.a<?, Float> f19023j;

    /* renamed from: k, reason: collision with root package name */
    public final i7.a<?, Integer> f19024k;

    /* renamed from: l, reason: collision with root package name */
    public final List<i7.a<?, Float>> f19025l;

    /* renamed from: m, reason: collision with root package name */
    public final i7.a<?, Float> f19026m;

    /* renamed from: n, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19027n;

    /* renamed from: o, reason: collision with root package name */
    public i7.a<Float, Float> f19028o;

    /* renamed from: p, reason: collision with root package name */
    public float f19029p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f19015a = new PathMeasure();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f19016c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f19017d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final List<b> f19020g = new ArrayList();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<m> f19030a;
        public final u b;

        public b(u uVar) {
            this.f19030a = new ArrayList();
            this.b = uVar;
        }
    }

    public a(h0 h0Var, o7.b bVar, Paint.Cap cap, Paint.Join join, float f10, m7.d dVar, m7.b bVar2, List<m7.b> list, m7.b bVar3) {
        g7.a aVar = new g7.a(1);
        this.f19022i = aVar;
        this.f19029p = 0.0f;
        this.f19018e = h0Var;
        this.f19019f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f19024k = dVar.a();
        this.f19023j = bVar2.a();
        if (bVar3 == null) {
            this.f19026m = null;
        } else {
            this.f19026m = bVar3.a();
        }
        this.f19025l = new ArrayList(list.size());
        this.f19021h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f19025l.add(list.get(i10).a());
        }
        bVar.j(this.f19024k);
        bVar.j(this.f19023j);
        for (int i11 = 0; i11 < this.f19025l.size(); i11++) {
            bVar.j(this.f19025l.get(i11));
        }
        i7.a<?, Float> aVar2 = this.f19026m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f19024k.a(this);
        this.f19023j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f19025l.get(i12).a(this);
        }
        i7.a<?, Float> aVar3 = this.f19026m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            i7.d a10 = bVar.x().a().a();
            this.f19028o = a10;
            a10.a(this);
            bVar.j(this.f19028o);
        }
    }

    @Override // i7.a.b
    public void a() {
        this.f19018e.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.k() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f19020g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f19030a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f19020g.add(bVar);
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16984d) {
            this.f19024k.o(cVar);
            return;
        }
        if (t8 == o0.f16999s) {
            this.f19023j.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19027n;
            if (aVar != null) {
                this.f19019f.H(aVar);
            }
            if (cVar == null) {
                this.f19027n = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19027n = qVar;
            qVar.a(this);
            this.f19019f.j(this.f19027n);
            return;
        }
        if (t8 == o0.f16990j) {
            i7.a<Float, Float> aVar2 = this.f19028o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.f19028o = qVar2;
            qVar2.a(this);
            this.f19019f.j(this.f19028o);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#getBounds");
        }
        this.b.reset();
        for (int i10 = 0; i10 < this.f19020g.size(); i10++) {
            b bVar = this.f19020g.get(i10);
            for (int i11 = 0; i11 < bVar.f19030a.size(); i11++) {
                this.b.addPath(((m) bVar.f19030a.get(i11)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.f19017d, false);
        float r8 = ((i7.d) this.f19023j).r();
        RectF rectF2 = this.f19017d;
        float f10 = r8 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f19017d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (f7.e.h()) {
            f7.e.c("StrokeContent#getBounds");
        }
    }

    public final void f() {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f19025l.isEmpty()) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f19025l.size(); i10++) {
            this.f19021h[i10] = this.f19025l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f19021h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f19021h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        i7.a<?, Float> aVar = this.f19026m;
        this.f19022i.setPathEffect(new DashPathEffect(this.f19021h, aVar == null ? 0.0f : aVar.h().floatValue()));
        if (f7.e.h()) {
            f7.e.c("StrokeContent#applyDashPattern");
        }
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#draw");
        }
        if (s7.m.h(matrix)) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float intValue = this.f19024k.h().intValue() / 100.0f;
        this.f19022i.setAlpha(s7.j.c((int) (i10 * intValue), 0, 255));
        this.f19022i.setStrokeWidth(((i7.d) this.f19023j).r());
        if (this.f19022i.getStrokeWidth() <= 0.0f) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        f();
        i7.a<ColorFilter, ColorFilter> aVar = this.f19027n;
        if (aVar != null) {
            this.f19022i.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f19028o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f19022i.setMaskFilter(null);
            } else if (floatValue != this.f19029p) {
                this.f19022i.setMaskFilter(this.f19019f.y(floatValue));
            }
            this.f19029p = floatValue;
        }
        if (bVar != null) {
            bVar.c((int) (intValue * 255.0f), this.f19022i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f19020g.size(); i11++) {
            b bVar2 = this.f19020g.get(i11);
            if (bVar2.b != null) {
                j(canvas, bVar2);
            } else {
                if (f7.e.h()) {
                    f7.e.b("StrokeContent#buildPath");
                }
                this.b.reset();
                for (int size = bVar2.f19030a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((m) bVar2.f19030a.get(size)).getPath());
                }
                if (f7.e.h()) {
                    f7.e.c("StrokeContent#buildPath");
                    f7.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.b, this.f19022i);
                if (f7.e.h()) {
                    f7.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (f7.e.h()) {
            f7.e.c("StrokeContent#draw");
        }
    }

    public final void j(Canvas canvas, b bVar) {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.b == null) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.b.reset();
        for (int size = bVar.f19030a.size() - 1; size >= 0; size--) {
            this.b.addPath(((m) bVar.f19030a.get(size)).getPath());
        }
        float floatValue = bVar.b.j().h().floatValue() / 100.0f;
        float floatValue2 = bVar.b.f().h().floatValue() / 100.0f;
        float floatValue3 = bVar.b.h().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.f19022i);
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f19015a.setPath(this.b, false);
        float length = this.f19015a.getLength();
        while (this.f19015a.nextContour()) {
            length += this.f19015a.getLength();
        }
        float f10 = floatValue3 * length;
        float f11 = (floatValue * length) + f10;
        float min = Math.min((floatValue2 * length) + f10, (f11 + length) - 1.0f);
        float f12 = 0.0f;
        for (int size2 = bVar.f19030a.size() - 1; size2 >= 0; size2--) {
            this.f19016c.set(((m) bVar.f19030a.get(size2)).getPath());
            this.f19015a.setPath(this.f19016c, false);
            float length2 = this.f19015a.getLength();
            if (min > length) {
                float f13 = min - length;
                if (f13 < f12 + length2 && f12 < f13) {
                    s7.m.a(this.f19016c, f11 > length ? (f11 - length) / length2 : 0.0f, Math.min(f13 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f19016c, this.f19022i);
                    f12 += length2;
                }
            }
            float f14 = f12 + length2;
            if (f14 >= f11 && f12 <= min) {
                if (f14 > min || f11 >= f12) {
                    s7.m.a(this.f19016c, f11 < f12 ? 0.0f : (f11 - f12) / length2, min > f14 ? 1.0f : (min - f12) / length2, 0.0f);
                    canvas.drawPath(this.f19016c, this.f19022i);
                } else {
                    canvas.drawPath(this.f19016c, this.f19022i);
                }
            }
            f12 += length2;
        }
        if (f7.e.h()) {
            f7.e.c("StrokeContent#applyTrimPath");
        }
    }
}
