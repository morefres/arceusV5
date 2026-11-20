package h7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.List;
import n7.t;

/* loaded from: classes3.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f19115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19116d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f19117e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.a<?, PointF> f19118f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.a<?, PointF> f19119g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.a<?, Float> f19120h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19123k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f19114a = new Path();
    public final RectF b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final b f19121i = new b();

    /* renamed from: j, reason: collision with root package name */
    public i7.a<Float, Float> f19122j = null;

    public o(h0 h0Var, o7.b bVar, n7.l lVar) {
        this.f19115c = lVar.c();
        this.f19116d = lVar.f();
        this.f19117e = h0Var;
        i7.a<PointF, PointF> a10 = lVar.d().a();
        this.f19118f = a10;
        i7.a<PointF, PointF> a11 = lVar.e().a();
        this.f19119g = a11;
        i7.d a12 = lVar.b().a();
        this.f19120h = a12;
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    private void f() {
        this.f19123k = false;
        this.f19117e.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        f();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f19121i.a(uVar);
                    uVar.c(this);
                }
            }
            if (cVar instanceof q) {
                this.f19122j = ((q) cVar).h();
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16992l) {
            this.f19119g.o(cVar);
        } else if (t8 == o0.f16994n) {
            this.f19118f.o(cVar);
        } else if (t8 == o0.f16993m) {
            this.f19120h.o(cVar);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f19115c;
    }

    @Override // h7.m
    public Path getPath() {
        i7.a<Float, Float> aVar;
        if (this.f19123k) {
            return this.f19114a;
        }
        this.f19114a.reset();
        if (this.f19116d) {
            this.f19123k = true;
            return this.f19114a;
        }
        PointF h10 = this.f19119g.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        i7.a<?, Float> aVar2 = this.f19120h;
        float r8 = aVar2 == null ? 0.0f : ((i7.d) aVar2).r();
        if (r8 == 0.0f && (aVar = this.f19122j) != null) {
            r8 = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (r8 > min) {
            r8 = min;
        }
        PointF h11 = this.f19118f.h();
        this.f19114a.moveTo(h11.x + f10, (h11.y - f11) + r8);
        this.f19114a.lineTo(h11.x + f10, (h11.y + f11) - r8);
        if (r8 > 0.0f) {
            RectF rectF = this.b;
            float f12 = h11.x;
            float f13 = r8 * 2.0f;
            float f14 = h11.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f19114a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.f19114a.lineTo((h11.x - f10) + r8, h11.y + f11);
        if (r8 > 0.0f) {
            RectF rectF2 = this.b;
            float f15 = h11.x;
            float f16 = h11.y;
            float f17 = r8 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f19114a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.f19114a.lineTo(h11.x - f10, (h11.y - f11) + r8);
        if (r8 > 0.0f) {
            RectF rectF3 = this.b;
            float f18 = h11.x;
            float f19 = h11.y;
            float f20 = r8 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f19114a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.f19114a.lineTo((h11.x + f10) - r8, h11.y - f11);
        if (r8 > 0.0f) {
            RectF rectF4 = this.b;
            float f21 = h11.x;
            float f22 = r8 * 2.0f;
            float f23 = h11.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f19114a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.f19114a.close();
        this.f19121i.b(this.f19114a);
        this.f19123k = true;
        return this.f19114a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
