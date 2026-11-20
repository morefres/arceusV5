package o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import i7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o7.e;
import s7.l;

/* loaded from: classes3.dex */
public class c extends b {
    public i7.a<Float, Float> E;
    public final List<b> F;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final l J;
    public final l.a K;
    public float L;
    public boolean M;
    public i7.c N;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27779a;

        static {
            int[] iArr = new int[e.b.values().length];
            f27779a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27779a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(h0 h0Var, e eVar, List<e> list, f7.i iVar) {
        super(h0Var, eVar);
        int i10;
        b bVar;
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new l();
        this.K = new l.a();
        this.M = true;
        m7.b v5 = eVar.v();
        if (v5 != null) {
            i7.d a10 = v5.a();
            this.E = a10;
            j(a10);
            this.E.a(this);
        } else {
            this.E = null;
        }
        w1.g gVar = new w1.g(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b v10 = b.v(this, eVar2, h0Var, iVar);
            if (v10 != null) {
                gVar.i(v10.A().e(), v10);
                if (bVar2 != null) {
                    bVar2.J(v10);
                    bVar2 = null;
                } else {
                    this.F.add(0, v10);
                    int i11 = a.f27779a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = v10;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < gVar.n(); i10++) {
            b bVar3 = (b) gVar.e(gVar.h(i10));
            if (bVar3 != null && (bVar = (b) gVar.e(bVar3.A().k())) != null) {
                bVar3.L(bVar);
            }
        }
        if (z() != null) {
            this.N = new i7.c(this, this, z());
        }
    }

    @Override // o7.b
    public void I(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            this.F.get(i11).h(eVar, i10, list, eVar2);
        }
    }

    @Override // o7.b
    public void K(boolean z10) {
        super.K(z10);
        Iterator<b> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().K(z10);
        }
    }

    @Override // o7.b
    public void M(float f10) {
        if (f7.e.h()) {
            f7.e.b("CompositionLayer#setProgress");
        }
        this.L = f10;
        super.M(f10);
        if (this.E != null) {
            f10 = ((this.E.h().floatValue() * this.f27768q.c().i()) - this.f27768q.c().p()) / (this.f27767p.J().e() + 0.01f);
        }
        if (this.E == null) {
            f10 -= this.f27768q.s();
        }
        if (this.f27768q.w() != 0.0f && !"__container".equals(this.f27768q.j())) {
            f10 /= this.f27768q.w();
        }
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).M(f10);
        }
        if (f7.e.h()) {
            f7.e.c("CompositionLayer#setProgress");
        }
    }

    public float P() {
        return this.L;
    }

    public void Q(boolean z10) {
        this.M = z10;
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.c cVar2;
        i7.c cVar3;
        i7.c cVar4;
        i7.c cVar5;
        i7.c cVar6;
        super.c(t8, cVar);
        if (t8 == o0.E) {
            if (cVar == null) {
                i7.a<Float, Float> aVar = this.E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.E = qVar;
            qVar.a(this);
            j(this.E);
            return;
        }
        if (t8 == o0.f16985e && (cVar6 = this.N) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t8 == o0.G && (cVar5 = this.N) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t8 == o0.H && (cVar4 = this.N) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t8 == o0.I && (cVar3 = this.N) != null) {
            cVar3.e(cVar);
        } else {
            if (t8 != o0.J || (cVar2 = this.N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.F.get(size).e(this.G, this.f27766o, true);
            rectF.union(this.G);
        }
    }

    @Override // o7.b
    public void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Canvas canvas2;
        if (f7.e.h()) {
            f7.e.b("CompositionLayer#draw");
        }
        boolean z10 = false;
        boolean z11 = (bVar == null && this.N == null) ? false : true;
        if ((this.f27767p.f0() && this.F.size() > 1 && i10 != 255) || (z11 && this.f27767p.g0())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        i7.c cVar = this.N;
        if (cVar != null) {
            bVar = cVar.b(matrix, i11);
        }
        if (this.M || !"__container".equals(this.f27768q.j())) {
            this.H.set(0.0f, 0.0f, this.f27768q.m(), this.f27768q.l());
            matrix.mapRect(this.H);
        } else {
            this.H.setEmpty();
            Iterator<b> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().e(this.I, matrix, true);
                this.H.union(this.I);
            }
        }
        if (z10) {
            this.K.f();
            l.a aVar = this.K;
            aVar.f30957a = i10;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            }
            canvas2 = this.J.j(canvas, this.H, this.K);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.H)) {
            for (int size = this.F.size() - 1; size >= 0; size--) {
                this.F.get(size).i(canvas2, matrix, i11, bVar);
            }
        }
        if (z10) {
            this.J.e();
        }
        canvas.restore();
        if (f7.e.h()) {
            f7.e.c("CompositionLayer#draw");
        }
    }
}
