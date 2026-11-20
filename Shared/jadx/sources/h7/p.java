package h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import i7.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f19124a = new Matrix();
    public final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final h0 f19125c;

    /* renamed from: d, reason: collision with root package name */
    public final o7.b f19126d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19127e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19128f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.a<Float, Float> f19129g;

    /* renamed from: h, reason: collision with root package name */
    public final i7.a<Float, Float> f19130h;

    /* renamed from: i, reason: collision with root package name */
    public final i7.p f19131i;

    /* renamed from: j, reason: collision with root package name */
    public d f19132j;

    public p(h0 h0Var, o7.b bVar, n7.m mVar) {
        this.f19125c = h0Var;
        this.f19126d = bVar;
        this.f19127e = mVar.c();
        this.f19128f = mVar.f();
        i7.d a10 = mVar.b().a();
        this.f19129g = a10;
        bVar.j(a10);
        a10.a(this);
        i7.d a11 = mVar.d().a();
        this.f19130h = a11;
        bVar.j(a11);
        a11.a(this);
        i7.p b = mVar.e().b();
        this.f19131i = b;
        b.a(bVar);
        b.b(this);
    }

    @Override // i7.a.b
    public void a() {
        this.f19125c.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        this.f19132j.b(list, list2);
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (this.f19131i.c(t8, cVar)) {
            return;
        }
        if (t8 == o0.f17001u) {
            this.f19129g.o(cVar);
        } else if (t8 == o0.f17002v) {
            this.f19130h.o(cVar);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19132j.e(rectF, matrix, z10);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        if (this.f19132j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f19132j = new d(this.f19125c, this.f19126d, "Repeater", this.f19128f, arrayList, null);
    }

    @Override // h7.c
    public String getName() {
        return this.f19127e;
    }

    @Override // h7.m
    public Path getPath() {
        Path path = this.f19132j.getPath();
        this.b.reset();
        float floatValue = this.f19129g.h().floatValue();
        float floatValue2 = this.f19130h.h().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f19124a.set(this.f19131i.g(i10 + floatValue2));
            this.b.addPath(path, this.f19124a);
        }
        return this.b;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f19132j.k().size(); i11++) {
            c cVar = this.f19132j.k().get(i11);
            if (cVar instanceof k) {
                s7.j.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        float floatValue = this.f19129g.h().floatValue();
        float floatValue2 = this.f19130h.h().floatValue();
        float floatValue3 = this.f19131i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f19131i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f19124a.set(matrix);
            float f10 = i11;
            this.f19124a.preConcat(this.f19131i.g(f10 + floatValue2));
            this.f19132j.i(canvas, this.f19124a, (int) (i10 * s7.j.i(floatValue3, floatValue4, f10 / floatValue)), bVar);
        }
    }
}
