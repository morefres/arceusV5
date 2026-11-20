package o7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import f7.h0;
import i7.a;
import i7.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n7.i;
import n7.o;
import o7.e;
import q7.j;
import s7.m;

/* loaded from: classes3.dex */
public abstract class b implements h7.e, a.b, l7.f {
    public Paint A;
    public float B;
    public BlurMaskFilter C;
    public g7.a D;

    /* renamed from: a, reason: collision with root package name */
    public final Path f27753a = new Path();
    public final Matrix b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f27754c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final Paint f27755d = new g7.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final Paint f27756e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f27757f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f27758g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f27759h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f27760i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f27761j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f27762k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f27763l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f27764m;

    /* renamed from: n, reason: collision with root package name */
    public final String f27765n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f27766o;

    /* renamed from: p, reason: collision with root package name */
    public final h0 f27767p;

    /* renamed from: q, reason: collision with root package name */
    public final e f27768q;

    /* renamed from: r, reason: collision with root package name */
    public i7.h f27769r;

    /* renamed from: s, reason: collision with root package name */
    public i7.d f27770s;

    /* renamed from: t, reason: collision with root package name */
    public b f27771t;

    /* renamed from: u, reason: collision with root package name */
    public b f27772u;

    /* renamed from: v, reason: collision with root package name */
    public List<b> f27773v;

    /* renamed from: w, reason: collision with root package name */
    public final List<i7.a<?, ?>> f27774w;

    /* renamed from: x, reason: collision with root package name */
    public final p f27775x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27776y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f27777z;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27778a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[i.a.values().length];
            b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f27778a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27778a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27778a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27778a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27778a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27778a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27778a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(h0 h0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f27756e = new g7.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f27757f = new g7.a(1, mode2);
        g7.a aVar = new g7.a(1);
        this.f27758g = aVar;
        this.f27759h = new g7.a(PorterDuff.Mode.CLEAR);
        this.f27760i = new RectF();
        this.f27761j = new RectF();
        this.f27762k = new RectF();
        this.f27763l = new RectF();
        this.f27764m = new RectF();
        this.f27766o = new Matrix();
        this.f27774w = new ArrayList();
        this.f27776y = true;
        this.B = 0.0f;
        this.f27767p = h0Var;
        this.f27768q = eVar;
        this.f27765n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b = eVar.x().b();
        this.f27775x = b;
        b.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            i7.h hVar = new i7.h(eVar.h());
            this.f27769r = hVar;
            Iterator<i7.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (i7.a<Integer, Integer> aVar2 : this.f27769r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    public static b v(c cVar, e eVar, h0 h0Var, f7.i iVar) {
        switch (a.f27778a[eVar.g().ordinal()]) {
            case 1:
                return new g(h0Var, eVar, cVar, iVar);
            case 2:
                return new c(h0Var, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(h0Var, eVar);
            case 4:
                return new d(h0Var, eVar);
            case 5:
                return new f(h0Var, eVar);
            case 6:
                return new i(h0Var, eVar);
            default:
                s7.e.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    public e A() {
        return this.f27768q;
    }

    public boolean B() {
        i7.h hVar = this.f27769r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean C() {
        return this.f27771t != null;
    }

    public final void D(RectF rectF, Matrix matrix) {
        this.f27762k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f27769r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                n7.i iVar = this.f27769r.b().get(i10);
                Path h10 = this.f27769r.a().get(i10).h();
                if (h10 != null) {
                    this.f27753a.set(h10);
                    this.f27753a.transform(matrix);
                    int i11 = a.b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f27753a.computeBounds(this.f27764m, false);
                    if (i10 == 0) {
                        this.f27762k.set(this.f27764m);
                    } else {
                        RectF rectF2 = this.f27762k;
                        rectF2.set(Math.min(rectF2.left, this.f27764m.left), Math.min(this.f27762k.top, this.f27764m.top), Math.max(this.f27762k.right, this.f27764m.right), Math.max(this.f27762k.bottom, this.f27764m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f27762k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void E(RectF rectF, Matrix matrix) {
        if (C() && this.f27768q.i() != e.b.INVERT) {
            this.f27763l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f27771t.e(this.f27763l, matrix, true);
            if (rectF.intersect(this.f27763l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F() {
        this.f27767p.invalidateSelf();
    }

    public final void G(float f10) {
        this.f27767p.J().n().a(this.f27768q.j(), f10);
    }

    public void H(i7.a<?, ?> aVar) {
        this.f27774w.remove(aVar);
    }

    public void I(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
    }

    public void J(b bVar) {
        this.f27771t = bVar;
    }

    public void K(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new g7.a();
        }
        this.f27777z = z10;
    }

    public void L(b bVar) {
        this.f27772u = bVar;
    }

    public void M(float f10) {
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress");
            f7.e.b("BaseLayer#setProgress.transform");
        }
        this.f27775x.j(f10);
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f27769r != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f27769r.a().size(); i10++) {
                this.f27769r.a().get(i10).n(f10);
            }
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f27770s != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.inout");
            }
            this.f27770s.n(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f27771t != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.matte");
            }
            this.f27771t.M(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress.animations." + this.f27774w.size());
        }
        for (int i11 = 0; i11 < this.f27774w.size(); i11++) {
            this.f27774w.get(i11).n(f10);
        }
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.animations." + this.f27774w.size());
            f7.e.c("BaseLayer#setProgress");
        }
    }

    public final void N(boolean z10) {
        if (z10 != this.f27776y) {
            this.f27776y = z10;
            F();
        }
    }

    public final void O() {
        if (this.f27768q.f().isEmpty()) {
            N(true);
            return;
        }
        i7.d dVar = new i7.d(this.f27768q.f());
        this.f27770s = dVar;
        dVar.m();
        this.f27770s.a(new a.b() { // from class: o7.a
            @Override // i7.a.b
            public final void a() {
                b.this.N(r2.f27770s.r() == 1.0f);
            }
        });
        N(this.f27770s.h().floatValue() == 1.0f);
        j(this.f27770s);
    }

    @Override // i7.a.b
    public void a() {
        F();
    }

    @Override // h7.c
    public void b(List<h7.c> list, List<h7.c> list2) {
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        this.f27775x.c(t8, cVar);
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f27760i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f27766o.set(matrix);
        if (z10) {
            List<b> list = this.f27773v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f27766o.preConcat(this.f27773v.get(size).f27775x.f());
                }
            } else {
                b bVar = this.f27772u;
                if (bVar != null) {
                    this.f27766o.preConcat(bVar.f27775x.f());
                }
            }
        }
        this.f27766o.preConcat(this.f27775x.f());
    }

    @Override // h7.c
    public String getName() {
        return this.f27768q.j();
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        b bVar = this.f27771t;
        if (bVar != null) {
            l7.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f27771t.getName(), i10)) {
                list.add(a10.i(this.f27771t));
            }
            if (eVar.g(this.f27771t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f27771t.I(eVar, eVar.e(this.f27771t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Paint paint;
        Integer h10;
        f7.e.b(this.f27765n);
        if (!this.f27776y || this.f27768q.y()) {
            f7.e.c(this.f27765n);
            return;
        }
        s();
        if (f7.e.h()) {
            f7.e.b("Layer#parentMatrix");
        }
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.f27773v.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.f27773v.get(size).f27775x.f());
        }
        if (f7.e.h()) {
            f7.e.c("Layer#parentMatrix");
        }
        i7.a<?, Integer> h11 = this.f27775x.h();
        int intValue = (int) ((((i10 / 255.0f) * ((h11 == null || (h10 = h11.h()) == null) ? 100 : h10.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == n7.h.NORMAL) {
            this.b.preConcat(this.f27775x.f());
            if (f7.e.h()) {
                f7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, intValue, bVar);
            if (f7.e.h()) {
                f7.e.c("Layer#drawLayer");
            }
            G(f7.e.c(this.f27765n));
            return;
        }
        if (f7.e.h()) {
            f7.e.b("Layer#computeBounds");
        }
        e(this.f27760i, this.b, false);
        E(this.f27760i, matrix);
        this.b.preConcat(this.f27775x.f());
        D(this.f27760i, this.b);
        this.f27761j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f27754c);
        if (!this.f27754c.isIdentity()) {
            Matrix matrix2 = this.f27754c;
            matrix2.invert(matrix2);
            this.f27754c.mapRect(this.f27761j);
        }
        if (!this.f27760i.intersect(this.f27761j)) {
            this.f27760i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#computeBounds");
        }
        if (this.f27760i.width() >= 1.0f && this.f27760i.height() >= 1.0f) {
            if (f7.e.h()) {
                f7.e.b("Layer#saveLayer");
            }
            this.f27755d.setAlpha(255);
            androidx.core.graphics.d.b(this.f27755d, w().b());
            m.n(canvas, this.f27760i, this.f27755d);
            if (f7.e.h()) {
                f7.e.c("Layer#saveLayer");
            }
            if (w() != n7.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.D == null) {
                    g7.a aVar = new g7.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f27760i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (f7.e.h()) {
                f7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, intValue, bVar);
            if (f7.e.h()) {
                f7.e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.b);
            }
            if (C()) {
                if (f7.e.h()) {
                    f7.e.b("Layer#drawMatte");
                    f7.e.b("Layer#saveLayer");
                }
                m.o(canvas, this.f27760i, this.f27758g, 19);
                if (f7.e.h()) {
                    f7.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f27771t.i(canvas, matrix, i10, null);
                if (f7.e.h()) {
                    f7.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (f7.e.h()) {
                    f7.e.c("Layer#restoreLayer");
                    f7.e.c("Layer#drawMatte");
                }
            }
            if (f7.e.h()) {
                f7.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (f7.e.h()) {
                f7.e.c("Layer#restoreLayer");
            }
        }
        if (this.f27777z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f27760i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f27760i, this.A);
        }
        G(f7.e.c(this.f27765n));
    }

    public void j(i7.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f27774w.add(aVar);
    }

    public final void k(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        this.f27755d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27753a, this.f27755d);
    }

    public final void l(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27760i, this.f27756e);
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        this.f27755d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27753a, this.f27755d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27760i, this.f27755d);
        canvas.drawRect(this.f27760i, this.f27755d);
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        this.f27755d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27753a, this.f27757f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27760i, this.f27756e);
        canvas.drawRect(this.f27760i, this.f27755d);
        this.f27757f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        canvas.drawPath(this.f27753a, this.f27757f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27760i, this.f27757f);
        canvas.drawRect(this.f27760i, this.f27755d);
        this.f27757f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        canvas.drawPath(this.f27753a, this.f27757f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        if (f7.e.h()) {
            f7.e.b("Layer#saveLayer");
        }
        m.o(canvas, this.f27760i, this.f27756e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f27769r.b().size(); i10++) {
            n7.i iVar = this.f27769r.b().get(i10);
            i7.a<o, Path> aVar = this.f27769r.a().get(i10);
            i7.a<Integer, Integer> aVar2 = this.f27769r.c().get(i10);
            int i11 = a.b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f27755d.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f27755d.setAlpha(255);
                        canvas.drawRect(this.f27760i, this.f27755d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f27755d.setAlpha(255);
                canvas.drawRect(this.f27760i, this.f27755d);
            }
        }
        if (f7.e.h()) {
            f7.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (f7.e.h()) {
            f7.e.c("Layer#restoreLayer");
        }
    }

    public final void q(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar) {
        this.f27753a.set(aVar.h());
        this.f27753a.transform(matrix);
        canvas.drawPath(this.f27753a, this.f27757f);
    }

    public final boolean r() {
        if (this.f27769r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27769r.b().size(); i10++) {
            if (this.f27769r.b().get(i10).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.f27773v != null) {
            return;
        }
        if (this.f27772u == null) {
            this.f27773v = Collections.EMPTY_LIST;
            return;
        }
        this.f27773v = new ArrayList();
        for (b bVar = this.f27772u; bVar != null; bVar = bVar.f27772u) {
            this.f27773v.add(bVar);
        }
    }

    public final void t(Canvas canvas) {
        if (f7.e.h()) {
            f7.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f27760i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f27759h);
        if (f7.e.h()) {
            f7.e.c("Layer#clearLayer");
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar);

    public n7.h w() {
        return this.f27768q.a();
    }

    public n7.a x() {
        return this.f27768q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    public j z() {
        return this.f27768q.d();
    }
}
