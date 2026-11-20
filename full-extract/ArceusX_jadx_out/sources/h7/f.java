package h7;

import android.graphics.Path;
import android.graphics.PointF;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.List;
import n7.t;

/* loaded from: classes3.dex */
public class f implements m, a.b, k {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f19044c;

    /* renamed from: d, reason: collision with root package name */
    public final i7.a<?, PointF> f19045d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.a<?, PointF> f19046e;

    /* renamed from: f, reason: collision with root package name */
    public final n7.b f19047f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19049h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f19043a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final b f19048g = new b();

    public f(h0 h0Var, o7.b bVar, n7.b bVar2) {
        this.b = bVar2.b();
        this.f19044c = h0Var;
        i7.a<PointF, PointF> a10 = bVar2.d().a();
        this.f19045d = a10;
        i7.a<PointF, PointF> a11 = bVar2.c().a();
        this.f19046e = a11;
        this.f19047f = bVar2;
        bVar.j(a10);
        bVar.j(a11);
        a10.a(this);
        a11.a(this);
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
                    this.f19048g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16991k) {
            this.f19045d.o(cVar);
        } else if (t8 == o0.f16994n) {
            this.f19046e.o(cVar);
        }
    }

    public final void f() {
        this.f19049h = false;
        this.f19044c.invalidateSelf();
    }

    @Override // h7.c
    public String getName() {
        return this.b;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f19049h) {
            return this.f19043a;
        }
        this.f19043a.reset();
        if (this.f19047f.e()) {
            this.f19049h = true;
            return this.f19043a;
        }
        PointF h10 = this.f19045d.h();
        float f10 = h10.x / 2.0f;
        float f11 = h10.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f19043a.reset();
        if (this.f19047f.f()) {
            float f14 = -f11;
            this.f19043a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f19043a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f19043a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f19043a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f19043a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f19043a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f19043a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f19043a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f19043a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f19043a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF h11 = this.f19046e.h();
        this.f19043a.offset(h11.x, h11.y);
        this.f19043a.close();
        this.f19048g.b(this.f19043a);
        this.f19049h = true;
        return this.f19043a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
