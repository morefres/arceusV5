package n7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final List<l7.a> f25900a;
    public PointF b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25901c;

    public o(PointF pointF, boolean z10, List<l7.a> list) {
        this.b = pointF;
        this.f25901c = z10;
        this.f25900a = new ArrayList(list);
    }

    public List<l7.a> a() {
        return this.f25900a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f25901c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            s7.e.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f25900a.size() < min) {
            for (int size = this.f25900a.size(); size < min; size++) {
                this.f25900a.add(new l7.a());
            }
        } else if (this.f25900a.size() > min) {
            for (int size2 = this.f25900a.size() - 1; size2 >= min; size2--) {
                List<l7.a> list = this.f25900a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = oVar.b();
        PointF b10 = oVar2.b();
        f(s7.j.i(b.x, b10.x, f10), s7.j.i(b.y, b10.y, f10));
        for (int size3 = this.f25900a.size() - 1; size3 >= 0; size3--) {
            l7.a aVar = oVar.a().get(size3);
            l7.a aVar2 = oVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b11 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b12 = aVar2.b();
            PointF c11 = aVar2.c();
            this.f25900a.get(size3).d(s7.j.i(a10.x, a11.x, f10), s7.j.i(a10.y, a11.y, f10));
            this.f25900a.get(size3).e(s7.j.i(b11.x, b12.x, f10), s7.j.i(b11.y, b12.y, f10));
            this.f25900a.get(size3).f(s7.j.i(c10.x, c11.x, f10), s7.j.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f25901c;
    }

    public void e(boolean z10) {
        this.f25901c = z10;
    }

    public void f(float f10, float f11) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f25900a.size() + "closed=" + this.f25901c + '}';
    }

    public o() {
        this.f25900a = new ArrayList();
    }
}
