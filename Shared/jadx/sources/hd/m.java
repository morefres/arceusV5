package hd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f19319a;

    @Deprecated
    public float b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f19320c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f19321d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f19322e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f19323f;

    /* renamed from: g, reason: collision with root package name */
    public final List<f> f19324g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List<g> f19325h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f19326i;

    public class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f19327c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f19328d;

        public a(List list, Matrix matrix) {
            this.f19327c = list;
            this.f19328d = matrix;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, gd.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f19327c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f19328d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public final d f19330c;

        public b(d dVar) {
            this.f19330c = dVar;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, @NonNull gd.a aVar, int i10, @NonNull Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f19330c.k(), this.f19330c.o(), this.f19330c.l(), this.f19330c.j()), i10, this.f19330c.m(), this.f19330c.n());
        }
    }

    public static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final e f19331c;

        /* renamed from: d, reason: collision with root package name */
        public final float f19332d;

        /* renamed from: e, reason: collision with root package name */
        public final float f19333e;

        public c(e eVar, float f10, float f11) {
            this.f19331c = eVar;
            this.f19332d = f10;
            this.f19333e = f11;
        }

        @Override // hd.m.g
        public void a(Matrix matrix, @NonNull gd.a aVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f19331c.f19340c - this.f19333e, this.f19331c.b - this.f19332d), 0.0f);
            this.f19342a.set(matrix);
            this.f19342a.preTranslate(this.f19332d, this.f19333e);
            this.f19342a.preRotate(c());
            aVar.b(canvas, this.f19342a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f19331c.f19340c - this.f19333e) / (this.f19331c.b - this.f19332d)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f19334h = new RectF();

        @Deprecated
        public float b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f19335c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f19336d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f19337e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f19338f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f19339g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // hd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19341a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f19334h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f19337e;
        }

        public final float k() {
            return this.b;
        }

        public final float l() {
            return this.f19336d;
        }

        public final float m() {
            return this.f19338f;
        }

        public final float n() {
            return this.f19339g;
        }

        public final float o() {
            return this.f19335c;
        }

        public final void p(float f10) {
            this.f19337e = f10;
        }

        public final void q(float f10) {
            this.b = f10;
        }

        public final void r(float f10) {
            this.f19336d = f10;
        }

        public final void s(float f10) {
            this.f19338f = f10;
        }

        public final void t(float f10) {
            this.f19339g = f10;
        }

        public final void u(float f10) {
            this.f19335c = f10;
        }
    }

    public static class e extends f {
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f19340c;

        @Override // hd.m.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f19341a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.f19340c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f19341a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {
        public static final Matrix b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f19342a = new Matrix();

        public abstract void a(Matrix matrix, gd.a aVar, int i10, Canvas canvas);

        public final void b(gd.a aVar, int i10, Canvas canvas) {
            a(b, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f19324g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f19325h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f19325h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f19324g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19324g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f19326i;
    }

    @NonNull
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f19325h), new Matrix(matrix));
    }

    public final float g() {
        return this.f19322e;
    }

    public final float h() {
        return this.f19323f;
    }

    public float i() {
        return this.f19320c;
    }

    public float j() {
        return this.f19321d;
    }

    public float k() {
        return this.f19319a;
    }

    public float l() {
        return this.b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.b = f10;
        eVar.f19340c = f11;
        this.f19324g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f19324g.clear();
        this.f19325h.clear();
        this.f19326i = false;
    }

    public final void p(float f10) {
        this.f19322e = f10;
    }

    public final void q(float f10) {
        this.f19323f = f10;
    }

    public final void r(float f10) {
        this.f19320c = f10;
    }

    public final void s(float f10) {
        this.f19321d = f10;
    }

    public final void t(float f10) {
        this.f19319a = f10;
    }

    public final void u(float f10) {
        this.b = f10;
    }
}
