package f7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class h0 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean T = false;
    public static final List<String> U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final Executor V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new s7.f());
    public Canvas A;
    public Rect B;
    public RectF C;
    public Paint D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public float[] J;
    public Matrix K;
    public boolean L;
    public f7.a M;
    public final ValueAnimator.AnimatorUpdateListener N;
    public final Semaphore O;
    public Handler P;
    public Runnable Q;
    public final Runnable R;
    public float S;

    /* renamed from: a, reason: collision with root package name */
    public i f16921a;
    public final s7.h b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16923d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16924e;

    /* renamed from: f, reason: collision with root package name */
    public b f16925f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<a> f16926g;

    /* renamed from: h, reason: collision with root package name */
    public k7.b f16927h;

    /* renamed from: i, reason: collision with root package name */
    public String f16928i;

    /* renamed from: j, reason: collision with root package name */
    public k7.a f16929j;

    /* renamed from: k, reason: collision with root package name */
    public Map<String, Typeface> f16930k;

    /* renamed from: l, reason: collision with root package name */
    public String f16931l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f16932m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16933n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16934o;

    /* renamed from: p, reason: collision with root package name */
    public o7.c f16935p;

    /* renamed from: q, reason: collision with root package name */
    public int f16936q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16937r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16938s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16939t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16940u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16941v;

    /* renamed from: w, reason: collision with root package name */
    public x0 f16942w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16943x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f16944y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f16945z;

    public interface a {
        void a(i iVar);
    }

    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    public h0() {
        s7.h hVar = new s7.h();
        this.b = hVar;
        this.f16922c = true;
        this.f16923d = false;
        this.f16924e = false;
        this.f16925f = b.NONE;
        this.f16926g = new ArrayList<>();
        this.f16932m = new j0();
        this.f16933n = false;
        this.f16934o = true;
        this.f16936q = 255;
        this.f16941v = false;
        this.f16942w = x0.AUTOMATIC;
        this.f16943x = false;
        this.f16944y = new Matrix();
        this.J = new float[9];
        this.L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: f7.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.g(h0.this, valueAnimator);
            }
        };
        this.N = animatorUpdateListener;
        this.O = new Semaphore(1);
        this.R = new Runnable() { // from class: f7.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.k(h0.this);
            }
        };
        this.S = -3.4028235E38f;
        hVar.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void g(h0 h0Var, ValueAnimator valueAnimator) {
        if (h0Var.F()) {
            h0Var.invalidateSelf();
            return;
        }
        o7.c cVar = h0Var.f16935p;
        if (cVar != null) {
            cVar.M(h0Var.b.o());
        }
    }

    public static /* synthetic */ void k(final h0 h0Var) {
        o7.c cVar = h0Var.f16935p;
        if (cVar == null) {
            return;
        }
        try {
            h0Var.O.acquire();
            cVar.M(h0Var.b.o());
            if (T && h0Var.L) {
                if (h0Var.P == null) {
                    h0Var.P = new Handler(Looper.getMainLooper());
                    h0Var.Q = new Runnable() { // from class: f7.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0.n(h0.this);
                        }
                    };
                }
                h0Var.P.post(h0Var.Q);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            h0Var.O.release();
            throw th2;
        }
        h0Var.O.release();
    }

    public static /* synthetic */ void n(h0 h0Var) {
        Drawable.Callback callback = h0Var.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(h0Var);
        }
    }

    public void A(i0 i0Var, boolean z10) {
        boolean a10 = this.f16932m.a(i0Var, z10);
        if (this.f16921a == null || !a10) {
            return;
        }
        t();
    }

    @Deprecated
    public void A0(boolean z10) {
        this.f16923d = z10;
    }

    public void B() {
        this.f16926g.clear();
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16925f = b.NONE;
    }

    public void B0(c cVar) {
        k7.b bVar = this.f16927h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public final void C(int i10, int i11) {
        Bitmap bitmap = this.f16945z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f16945z.getHeight() < i11) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f16945z = createBitmap;
            this.A.setBitmap(createBitmap);
            this.L = true;
            return;
        }
        if (this.f16945z.getWidth() > i10 || this.f16945z.getHeight() > i11) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f16945z, 0, 0, i10, i11);
            this.f16945z = createBitmap2;
            this.A.setBitmap(createBitmap2);
            this.L = true;
        }
    }

    public void C0(String str) {
        this.f16928i = str;
    }

    public final void D() {
        if (this.A != null) {
            return;
        }
        this.A = new Canvas();
        this.H = new RectF();
        this.I = new Matrix();
        this.K = new Matrix();
        this.B = new Rect();
        this.C = new RectF();
        this.D = new g7.a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    public void D0(boolean z10) {
        this.f16933n = z10;
    }

    public f7.a E() {
        f7.a aVar = this.M;
        return aVar != null ? aVar : e.d();
    }

    public void E0(final int i10) {
        if (this.f16921a == null) {
            this.f16926g.add(new a() { // from class: f7.s
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.E0(i10);
                }
            });
        } else {
            this.b.K(i10 + 0.99f);
        }
    }

    public boolean F() {
        return E() == f7.a.ENABLED;
    }

    public void F0(final String str) {
        i iVar = this.f16921a;
        if (iVar == null) {
            this.f16926g.add(new a() { // from class: f7.z
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    h0.this.F0(str);
                }
            });
            return;
        }
        l7.h l10 = iVar.l(str);
        if (l10 != null) {
            E0((int) (l10.b + l10.f23273c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public Bitmap G(String str) {
        k7.b N = N();
        if (N != null) {
            return N.a(str);
        }
        return null;
    }

    public void G0(final float f10) {
        i iVar = this.f16921a;
        if (iVar == null) {
            this.f16926g.add(new a() { // from class: f7.v
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    h0.this.G0(f10);
                }
            });
        } else {
            this.b.K(s7.j.i(iVar.p(), this.f16921a.f(), f10));
        }
    }

    public boolean H() {
        return this.f16941v;
    }

    public void H0(final int i10, final int i11) {
        if (this.f16921a == null) {
            this.f16926g.add(new a() { // from class: f7.w
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.H0(i10, i11);
                }
            });
        } else {
            this.b.N(i10, i11 + 0.99f);
        }
    }

    public boolean I() {
        return this.f16934o;
    }

    public void I0(final String str) {
        i iVar = this.f16921a;
        if (iVar == null) {
            this.f16926g.add(new a() { // from class: f7.r
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    h0.this.I0(str);
                }
            });
            return;
        }
        l7.h l10 = iVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.b;
            H0(i10, ((int) l10.f23273c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public i J() {
        return this.f16921a;
    }

    public void J0(final int i10) {
        if (this.f16921a == null) {
            this.f16926g.add(new a() { // from class: f7.t
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.J0(i10);
                }
            });
        } else {
            this.b.O(i10);
        }
    }

    public final Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void K0(final String str) {
        i iVar = this.f16921a;
        if (iVar == null) {
            this.f16926g.add(new a() { // from class: f7.a0
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    h0.this.K0(str);
                }
            });
            return;
        }
        l7.h l10 = iVar.l(str);
        if (l10 != null) {
            J0((int) l10.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final k7.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f16929j == null) {
            k7.a aVar = new k7.a(getCallback(), null);
            this.f16929j = aVar;
            String str = this.f16931l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f16929j;
    }

    public void L0(final float f10) {
        i iVar = this.f16921a;
        if (iVar == null) {
            this.f16926g.add(new a() { // from class: f7.e0
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    h0.this.L0(f10);
                }
            });
        } else {
            J0((int) s7.j.i(iVar.p(), this.f16921a.f(), f10));
        }
    }

    public int M() {
        return (int) this.b.p();
    }

    public void M0(boolean z10) {
        if (this.f16938s == z10) {
            return;
        }
        this.f16938s = z10;
        o7.c cVar = this.f16935p;
        if (cVar != null) {
            cVar.K(z10);
        }
    }

    public final k7.b N() {
        k7.b bVar = this.f16927h;
        if (bVar != null && !bVar.b(K())) {
            this.f16927h = null;
        }
        if (this.f16927h == null) {
            this.f16927h = new k7.b(getCallback(), this.f16928i, null, this.f16921a.j());
        }
        return this.f16927h;
    }

    public void N0(boolean z10) {
        this.f16937r = z10;
        i iVar = this.f16921a;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    public String O() {
        return this.f16928i;
    }

    public void O0(final float f10) {
        if (this.f16921a == null) {
            this.f16926g.add(new a() { // from class: f7.f0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.O0(f10);
                }
            });
            return;
        }
        if (e.h()) {
            e.b("Drawable#setProgress");
        }
        this.b.J(this.f16921a.h(f10));
        if (e.h()) {
            e.c("Drawable#setProgress");
        }
    }

    public k0 P(String str) {
        i iVar = this.f16921a;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void P0(x0 x0Var) {
        this.f16942w = x0Var;
        w();
    }

    public boolean Q() {
        return this.f16933n;
    }

    public void Q0(int i10) {
        this.b.setRepeatCount(i10);
    }

    public l7.h R() {
        Iterator<String> it = U.iterator();
        l7.h hVar = null;
        while (it.hasNext()) {
            hVar = this.f16921a.l(it.next());
            if (hVar != null) {
                break;
            }
        }
        return hVar;
    }

    public void R0(int i10) {
        this.b.setRepeatMode(i10);
    }

    public float S() {
        return this.b.r();
    }

    public void S0(boolean z10) {
        this.f16924e = z10;
    }

    public float T() {
        return this.b.s();
    }

    public void T0(float f10) {
        this.b.P(f10);
    }

    public u0 U() {
        i iVar = this.f16921a;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void U0(z0 z0Var) {
    }

    public float V() {
        return this.b.o();
    }

    public void V0(boolean z10) {
        this.b.Q(z10);
    }

    public x0 W() {
        return this.f16943x ? x0.SOFTWARE : x0.HARDWARE;
    }

    public final boolean W0() {
        i iVar = this.f16921a;
        if (iVar == null) {
            return false;
        }
        float f10 = this.S;
        float o8 = this.b.o();
        this.S = o8;
        return Math.abs(o8 - f10) * iVar.d() >= 50.0f;
    }

    public int X() {
        return this.b.getRepeatCount();
    }

    public boolean X0() {
        return this.f16930k == null && this.f16921a.c().j() > 0;
    }

    @SuppressLint({"WrongConstant"})
    public int Y() {
        return this.b.getRepeatMode();
    }

    public float Z() {
        return this.b.t();
    }

    public z0 a0() {
        return null;
    }

    public Typeface b0(l7.c cVar) {
        Map<String, Typeface> map = this.f16930k;
        if (map != null) {
            String a10 = cVar.a();
            if (map.containsKey(a10)) {
                return map.get(a10);
            }
            String b10 = cVar.b();
            if (map.containsKey(b10)) {
                return map.get(b10);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        k7.a L = L();
        if (L != null) {
            return L.b(cVar);
        }
        return null;
    }

    public final boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public boolean d0() {
        s7.h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        o7.c cVar = this.f16935p;
        if (cVar == null) {
            return;
        }
        boolean F = F();
        if (F) {
            try {
                this.O.acquire();
            } catch (InterruptedException unused) {
                if (e.h()) {
                    e.c("Drawable#draw");
                }
                if (!F) {
                    return;
                }
                this.O.release();
                if (cVar.P() == this.b.o()) {
                    return;
                }
            } catch (Throwable th2) {
                if (e.h()) {
                    e.c("Drawable#draw");
                }
                if (F) {
                    this.O.release();
                    if (cVar.P() != this.b.o()) {
                        V.execute(this.R);
                    }
                }
                throw th2;
            }
        }
        if (e.h()) {
            e.b("Drawable#draw");
        }
        if (F && W0()) {
            O0(this.b.o());
        }
        if (this.f16924e) {
            try {
                if (this.f16943x) {
                    m0(canvas, cVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th3) {
                s7.e.b("Lottie crashed in draw!", th3);
            }
        } else if (this.f16943x) {
            m0(canvas, cVar);
        } else {
            z(canvas);
        }
        this.L = false;
        if (e.h()) {
            e.c("Drawable#draw");
        }
        if (F) {
            this.O.release();
            if (cVar.P() == this.b.o()) {
                return;
            }
            V.execute(this.R);
        }
    }

    public boolean e0() {
        if (isVisible()) {
            return this.b.isRunning();
        }
        b bVar = this.f16925f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f16939t;
    }

    public boolean g0() {
        return this.f16940u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16936q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        i iVar = this.f16921a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        i iVar = this.f16921a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0(i0 i0Var) {
        return this.f16932m.b(i0Var);
    }

    public void i0() {
        this.f16926g.clear();
        this.b.w();
        if (isVisible()) {
            return;
        }
        this.f16925f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.L) {
            return;
        }
        this.L = true;
        if ((!T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    public void j0() {
        if (this.f16935p == null) {
            this.f16926g.add(new a() { // from class: f7.d0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.j0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.x();
                this.f16925f = b.NONE;
            } else {
                this.f16925f = b.PLAY;
            }
        }
        if (s(K())) {
            return;
        }
        l7.h R = R();
        if (R != null) {
            z0((int) R.b);
        } else {
            z0((int) (Z() < 0.0f ? T() : S()));
        }
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16925f = b.NONE;
    }

    public void k0() {
        this.b.removeAllListeners();
    }

    public void l0() {
        this.b.removeAllUpdateListeners();
        this.b.addUpdateListener(this.N);
    }

    public final void m0(Canvas canvas, o7.c cVar) {
        if (this.f16921a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        x(this.B, this.C);
        this.I.mapRect(this.C);
        y(this.C, this.B);
        if (this.f16934o) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.e(this.H, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        p0(this.H, width, height);
        if (!c0()) {
            RectF rectF = this.H;
            Rect rect = this.B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.H.width());
        int ceil2 = (int) Math.ceil(this.H.height());
        if (ceil <= 0 || ceil2 <= 0) {
            return;
        }
        C(ceil, ceil2);
        if (this.L) {
            this.I.getValues(this.J);
            float[] fArr = this.J;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f16944y.set(this.I);
            this.f16944y.preScale(width, height);
            Matrix matrix = this.f16944y;
            RectF rectF2 = this.H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f16944y.postScale(1.0f / f10, 1.0f / f11);
            this.f16945z.eraseColor(0);
            this.A.setMatrix(s7.m.f30964a);
            this.A.scale(f10, f11);
            cVar.i(this.A, this.f16944y, this.f16936q, null);
            this.I.invert(this.K);
            this.K.mapRect(this.G, this.H);
            y(this.G, this.F);
        }
        this.E.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f16945z, this.E, this.F, this.D);
    }

    public List<l7.e> n0(l7.e eVar) {
        if (this.f16935p == null) {
            s7.e.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f16935p.h(eVar, 0, arrayList, new l7.e(new String[0]));
        return arrayList;
    }

    public void o0() {
        if (this.f16935p == null) {
            this.f16926g.add(new a() { // from class: f7.y
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.o0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.D();
                this.f16925f = b.NONE;
            } else {
                this.f16925f = b.RESUME;
            }
        }
        if (s(K())) {
            return;
        }
        z0((int) (Z() < 0.0f ? T() : S()));
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16925f = b.NONE;
    }

    public final void p0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    public void q0(boolean z10) {
        this.f16939t = z10;
    }

    public <T> void r(final l7.e eVar, final T t8, final t7.c<T> cVar) {
        o7.c cVar2 = this.f16935p;
        if (cVar2 == null) {
            this.f16926g.add(new a() { // from class: f7.u
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.r(eVar, t8, cVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == l7.e.f23269c) {
            cVar2.c(t8, cVar);
        } else if (eVar.d() != null) {
            eVar.d().c(t8, cVar);
        } else {
            List<l7.e> n02 = n0(eVar);
            for (int i10 = 0; i10 < n02.size(); i10++) {
                n02.get(i10).d().c(t8, cVar);
            }
            z10 = true ^ n02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t8 == o0.E) {
                O0(V());
            }
        }
    }

    public void r0(boolean z10) {
        this.f16940u = z10;
    }

    public boolean s(Context context) {
        if (this.f16923d) {
            return true;
        }
        return this.f16922c && e.f().a(context) == j7.a.STANDARD_MOTION;
    }

    public void s0(f7.a aVar) {
        this.M = aVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f16936q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        s7.e.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f16925f;
            if (bVar == b.PLAY) {
                j0();
                return visible;
            }
            if (bVar == b.RESUME) {
                o0();
                return visible;
            }
        } else {
            if (this.b.isRunning()) {
                i0();
                this.f16925f = b.RESUME;
                return visible;
            }
            if (isVisible) {
                this.f16925f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public final void t() {
        i iVar = this.f16921a;
        if (iVar == null) {
            return;
        }
        o7.c cVar = new o7.c(this, q7.v.a(iVar), iVar.k(), iVar);
        this.f16935p = cVar;
        if (this.f16938s) {
            cVar.K(true);
        }
        this.f16935p.Q(this.f16934o);
    }

    public void t0(boolean z10) {
        if (z10 != this.f16941v) {
            this.f16941v = z10;
            invalidateSelf();
        }
    }

    public void u() {
        this.f16926g.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.f16925f = b.NONE;
    }

    public void u0(boolean z10) {
        if (z10 != this.f16934o) {
            this.f16934o = z10;
            o7.c cVar = this.f16935p;
            if (cVar != null) {
                cVar.Q(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v() {
        if (this.b.isRunning()) {
            this.b.cancel();
            if (!isVisible()) {
                this.f16925f = b.NONE;
            }
        }
        this.f16921a = null;
        this.f16935p = null;
        this.f16927h = null;
        this.S = -3.4028235E38f;
        this.b.k();
        invalidateSelf();
    }

    public boolean v0(i iVar) {
        if (this.f16921a == iVar) {
            return false;
        }
        this.L = true;
        v();
        this.f16921a = iVar;
        t();
        this.b.G(iVar);
        O0(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f16926g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f16926g.clear();
        iVar.v(this.f16937r);
        w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void w() {
        i iVar = this.f16921a;
        if (iVar == null) {
            return;
        }
        this.f16943x = this.f16942w.b(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    public void w0(String str) {
        this.f16931l = str;
        k7.a L = L();
        if (L != null) {
            L.c(str);
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x0(f7.b bVar) {
        k7.a aVar = this.f16929j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public final void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void y0(Map<String, Typeface> map) {
        if (map == this.f16930k) {
            return;
        }
        this.f16930k = map;
        invalidateSelf();
    }

    public final void z(Canvas canvas) {
        o7.c cVar = this.f16935p;
        i iVar = this.f16921a;
        if (cVar == null || iVar == null) {
            return;
        }
        this.f16944y.reset();
        if (!getBounds().isEmpty()) {
            this.f16944y.preTranslate(r2.left, r2.top);
            this.f16944y.preScale(r2.width() / iVar.b().width(), r2.height() / iVar.b().height());
        }
        cVar.i(canvas, this.f16944y, this.f16936q, null);
    }

    public void z0(final int i10) {
        if (this.f16921a == null) {
            this.f16926g.add(new a() { // from class: f7.g0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    h0.this.z0(i10);
                }
            });
        } else {
            this.b.J(i10);
        }
    }
}
