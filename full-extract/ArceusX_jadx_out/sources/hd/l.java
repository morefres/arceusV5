package hd;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f19303a = new m[4];
    public final Matrix[] b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f19304c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f19305d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f19306e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f19307f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final m f19308g = new m();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f19309h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f19310i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f19311j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f19312k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f19313l = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f19314a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final k f19315a;

        @NonNull
        public final Path b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public final RectF f19316c;

        /* renamed from: d, reason: collision with root package name */
        public final b f19317d;

        /* renamed from: e, reason: collision with root package name */
        public final float f19318e;

        public c(@NonNull k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f19317d = bVar;
            this.f19315a = kVar;
            this.f19318e = f10;
            this.f19316c = rectF;
            this.b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f19303a[i10] = new m();
            this.b[i10] = new Matrix();
            this.f19304c[i10] = new Matrix();
        }
    }

    @NonNull
    public static l k() {
        return a.f19314a;
    }

    public final float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    public final void b(@NonNull c cVar, int i10) {
        this.f19309h[0] = this.f19303a[i10].k();
        this.f19309h[1] = this.f19303a[i10].l();
        this.b[i10].mapPoints(this.f19309h);
        if (i10 == 0) {
            Path path = cVar.b;
            float[] fArr = this.f19309h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.f19309h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f19303a[i10].d(this.b[i10], cVar.b);
        b bVar = cVar.f19317d;
        if (bVar != null) {
            bVar.b(this.f19303a[i10], this.b[i10], i10);
        }
    }

    public final void c(@NonNull c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f19309h[0] = this.f19303a[i10].i();
        this.f19309h[1] = this.f19303a[i10].j();
        this.b[i10].mapPoints(this.f19309h);
        this.f19310i[0] = this.f19303a[i11].k();
        this.f19310i[1] = this.f19303a[i11].l();
        this.b[i11].mapPoints(this.f19310i);
        float f10 = this.f19309h[0];
        float[] fArr = this.f19310i;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f19316c, i10);
        this.f19308g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f19315a);
        j10.b(max, i12, cVar.f19318e, this.f19308g);
        this.f19311j.reset();
        this.f19308g.d(this.f19304c[i10], this.f19311j);
        if (this.f19313l && (j10.a() || l(this.f19311j, i10) || l(this.f19311j, i11))) {
            Path path = this.f19311j;
            path.op(path, this.f19307f, Path.Op.DIFFERENCE);
            this.f19309h[0] = this.f19308g.k();
            this.f19309h[1] = this.f19308g.l();
            this.f19304c[i10].mapPoints(this.f19309h);
            Path path2 = this.f19306e;
            float[] fArr2 = this.f19309h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f19308g.d(this.f19304c[i10], this.f19306e);
        } else {
            this.f19308g.d(this.f19304c[i10], cVar.b);
        }
        b bVar = cVar.f19317d;
        if (bVar != null) {
            bVar.a(this.f19308g, this.f19304c[i10], i10);
        }
    }

    public void d(k kVar, float f10, RectF rectF, @NonNull Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, @NonNull Path path) {
        path.rewind();
        this.f19306e.rewind();
        this.f19307f.rewind();
        this.f19307f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f19306e.close();
        if (this.f19306e.isEmpty()) {
            return;
        }
        path.op(this.f19306e, Path.Op.UNION);
    }

    public final void f(int i10, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final hd.c g(int i10, @NonNull k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final d h(int i10, @NonNull k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(@NonNull RectF rectF, int i10) {
        float[] fArr = this.f19309h;
        m mVar = this.f19303a[i10];
        fArr[0] = mVar.f19320c;
        fArr[1] = mVar.f19321d;
        this.b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f19309h[0]) : Math.abs(rectF.centerY() - this.f19309h[1]);
    }

    public final f j(int i10, @NonNull k kVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i10) {
        this.f19312k.reset();
        this.f19303a[i10].d(this.b[i10], this.f19312k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f19312k.computeBounds(rectF, true);
        path.op(this.f19312k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(@NonNull c cVar, int i10) {
        h(i10, cVar.f19315a).b(this.f19303a[i10], 90.0f, cVar.f19318e, cVar.f19316c, g(i10, cVar.f19315a));
        float a10 = a(i10);
        this.b[i10].reset();
        f(i10, cVar.f19316c, this.f19305d);
        Matrix matrix = this.b[i10];
        PointF pointF = this.f19305d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i10].preRotate(a10);
    }

    public final void n(int i10) {
        this.f19309h[0] = this.f19303a[i10].i();
        this.f19309h[1] = this.f19303a[i10].j();
        this.b[i10].mapPoints(this.f19309h);
        float a10 = a(i10);
        this.f19304c[i10].reset();
        Matrix matrix = this.f19304c[i10];
        float[] fArr = this.f19309h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f19304c[i10].preRotate(a10);
    }
}
