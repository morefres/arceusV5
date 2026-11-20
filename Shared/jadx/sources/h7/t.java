package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import f7.h0;
import f7.o0;

/* loaded from: classes3.dex */
public class t extends a {

    /* renamed from: q, reason: collision with root package name */
    public final o7.b f19142q;

    /* renamed from: r, reason: collision with root package name */
    public final String f19143r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f19144s;

    /* renamed from: t, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19145t;

    /* renamed from: u, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19146u;

    public t(h0 h0Var, o7.b bVar, n7.s sVar) {
        super(h0Var, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f19142q = bVar;
        this.f19143r = sVar.h();
        this.f19144s = sVar.k();
        i7.a<Integer, Integer> a10 = sVar.c().a();
        this.f19145t = a10;
        a10.a(this);
        bVar.j(a10);
    }

    @Override // h7.a, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.b) {
            this.f19145t.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19146u;
            if (aVar != null) {
                this.f19142q.H(aVar);
            }
            if (cVar == null) {
                this.f19146u = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19146u = qVar;
            qVar.a(this);
            this.f19142q.j(this.f19145t);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f19143r;
    }

    @Override // h7.a, h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f19144s) {
            return;
        }
        this.f19022i.setColor(((i7.b) this.f19145t).r());
        i7.a<ColorFilter, ColorFilter> aVar = this.f19146u;
        if (aVar != null) {
            this.f19022i.setColorFilter(aVar.h());
        }
        super.i(canvas, matrix, i10, bVar);
    }
}
