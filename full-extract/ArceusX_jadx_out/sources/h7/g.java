package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f19050a;
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.b f19051c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19052d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19053e;

    /* renamed from: f, reason: collision with root package name */
    public final List<m> f19054f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19055g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19056h;

    /* renamed from: i, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19057i;

    /* renamed from: j, reason: collision with root package name */
    public final h0 f19058j;

    /* renamed from: k, reason: collision with root package name */
    public i7.a<Float, Float> f19059k;

    /* renamed from: l, reason: collision with root package name */
    public float f19060l;

    public g(h0 h0Var, o7.b bVar, n7.p pVar) {
        Path path = new Path();
        this.f19050a = path;
        this.b = new g7.a(1);
        this.f19054f = new ArrayList();
        this.f19051c = bVar;
        this.f19052d = pVar.d();
        this.f19053e = pVar.f();
        this.f19058j = h0Var;
        if (bVar.x() != null) {
            i7.d a10 = bVar.x().a().a();
            this.f19059k = a10;
            a10.a(this);
            bVar.j(this.f19059k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f19055g = null;
            this.f19056h = null;
            return;
        }
        path.setFillType(pVar.c());
        i7.a<Integer, Integer> a11 = pVar.b().a();
        this.f19055g = a11;
        a11.a(this);
        bVar.j(a11);
        i7.a<Integer, Integer> a12 = pVar.e().a();
        this.f19056h = a12;
        a12.a(this);
        bVar.j(a12);
    }

    @Override // i7.a.b
    public void a() {
        this.f19058j.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f19054f.add((m) cVar);
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16982a) {
            this.f19055g.o(cVar);
            return;
        }
        if (t8 == o0.f16984d) {
            this.f19056h.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19057i;
            if (aVar != null) {
                this.f19051c.H(aVar);
            }
            if (cVar == null) {
                this.f19057i = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19057i = qVar;
            qVar.a(this);
            this.f19051c.j(this.f19057i);
            return;
        }
        if (t8 == o0.f16990j) {
            i7.a<Float, Float> aVar2 = this.f19059k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.f19059k = qVar2;
            qVar2.a(this);
            this.f19051c.j(this.f19059k);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19050a.reset();
        for (int i10 = 0; i10 < this.f19054f.size(); i10++) {
            this.f19050a.addPath(this.f19054f.get(i10).getPath(), matrix);
        }
        this.f19050a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h7.c
    public String getName() {
        return this.f19052d;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f19053e) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("FillContent#draw");
        }
        float intValue = this.f19056h.h().intValue() / 100.0f;
        this.b.setColor((s7.j.c((int) (i10 * intValue), 0, 255) << 24) | (((i7.b) this.f19055g).r() & ViewCompat.MEASURED_SIZE_MASK));
        i7.a<ColorFilter, ColorFilter> aVar = this.f19057i;
        if (aVar != null) {
            this.b.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f19059k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.f19060l) {
                this.b.setMaskFilter(this.f19051c.y(floatValue));
            }
            this.f19060l = floatValue;
        }
        if (bVar != null) {
            bVar.c((int) (intValue * 255.0f), this.b);
        } else {
            this.b.clearShadowLayer();
        }
        this.f19050a.reset();
        for (int i11 = 0; i11 < this.f19054f.size(); i11++) {
            this.f19050a.addPath(this.f19054f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f19050a, this.b);
        if (f7.e.h()) {
            f7.e.c("FillContent#draw");
        }
    }
}
