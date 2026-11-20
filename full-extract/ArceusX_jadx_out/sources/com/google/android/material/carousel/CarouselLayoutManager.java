package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;
import ic.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qc.e;
import qc.f;
import qc.h;
import x2.g;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.q implements qc.b, RecyclerView.a0.b {
    public int A;
    public Map<Integer, com.google.android.material.carousel.b> B;
    public e C;
    public final View.OnLayoutChangeListener D;
    public int E;
    public int F;
    public int G;

    /* renamed from: s, reason: collision with root package name */
    public int f7752s;

    /* renamed from: t, reason: collision with root package name */
    public int f7753t;

    /* renamed from: u, reason: collision with root package name */
    public int f7754u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7755v;

    /* renamed from: w, reason: collision with root package name */
    public final c f7756w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public f f7757x;

    /* renamed from: y, reason: collision with root package name */
    public com.google.android.material.carousel.c f7758y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.material.carousel.b f7759z;

    public class a extends l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.l
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f7758y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.l
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f7758y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f7761a;
        public final float b;

        /* renamed from: c, reason: collision with root package name */
        public final float f7762c;

        /* renamed from: d, reason: collision with root package name */
        public final d f7763d;

        public b(View view, float f10, float f11, d dVar) {
            this.f7761a = view;
            this.b = f10;
            this.f7762c = f11;
            this.f7763d = dVar;
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f7764a;
        public List<b.c> b;

        public c() {
            Paint paint = new Paint();
            this.f7764a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.b0 b0Var) {
            super.i(canvas, recyclerView, b0Var);
            this.f7764a.setStrokeWidth(recyclerView.getResources().getDimension(ic.d.f20453n));
            for (b.c cVar : this.b) {
                this.f7764a.setColor(androidx.core.graphics.c.c(-65281, -16776961, cVar.f7778c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).B2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).w2(), this.f7764a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.b, this.f7764a);
                }
            }
        }

        public void j(List<b.c> list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.c f7765a;
        public final b.c b;

        public d(b.c cVar, b.c cVar2) {
            g.a(cVar.f7777a <= cVar2.f7777a);
            this.f7765a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    public static d F2(List<b.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            b.c cVar = list.get(i14);
            float f15 = z10 ? cVar.b : cVar.f7777a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private int P2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f7758y == null) {
            M2(xVar);
        }
        int i22 = i2(i10, this.f7752s, this.f7753t, this.f7754u);
        this.f7752s += i22;
        W2(this.f7758y);
        float f10 = this.f7759z.f() / 2.0f;
        float f22 = f2(l0(N(0)));
        Rect rect = new Rect();
        float f11 = G2() ? this.f7759z.h().b : this.f7759z.a().b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View N = N(i11);
            float abs = Math.abs(f11 - L2(N, f22, f10, rect));
            if (N != null && abs < f12) {
                this.F = l0(N);
                f12 = abs;
            }
            f22 = Z1(f22, this.f7759z.f());
        }
        l2(xVar, b0Var);
        return i22;
    }

    public static /* synthetic */ void S1(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: qc.d
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.N2();
            }
        });
    }

    public static int i2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int k2(int i10) {
        int v22 = v2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            return v22 == 0 ? G2() ? 1 : -1 : EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (v22 == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            return v22 == 0 ? G2() ? -1 : 1 : EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130) {
            if (v22 == 1) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(@NonNull RecyclerView.b0 b0Var) {
        return this.f7754u - this.f7753t;
    }

    public final int A2() {
        return this.C.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (p()) {
            return P2(i10, xVar, b0Var);
        }
        return 0;
    }

    public final int B2() {
        return this.C.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.F = i10;
        if (this.f7758y == null) {
            return;
        }
        this.f7752s = D2(i10, r2(i10));
        this.A = s2.a.c(i10, 0, Math.max(0, e() - 1));
        W2(this.f7758y);
        y1();
    }

    public final int C2() {
        if (R() || !this.f7757x.f()) {
            return 0;
        }
        return v2() == 1 ? h0() : j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (q()) {
            return P2(i10, xVar, b0Var);
        }
        return 0;
    }

    public final int D2(int i10, com.google.android.material.carousel.b bVar) {
        return G2() ? (int) (((o2() - bVar.h().f7777a) - (i10 * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i10 * bVar.f()) - bVar.a().f7777a) + (bVar.f() / 2.0f));
    }

    public final int E2(int i10, @NonNull com.google.android.material.carousel.b bVar) {
        int i11 = Integer.MAX_VALUE;
        for (b.c cVar : bVar.e()) {
            float f10 = (i10 * bVar.f()) + (bVar.f() / 2.0f);
            int o22 = (G2() ? (int) ((o2() - cVar.f7777a) - f10) : (int) (f10 - cVar.f7777a)) - this.f7752s;
            if (Math.abs(i11) > Math.abs(o22)) {
                i11 = o22;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void F0(@NonNull View view, int i10, int i11) {
        if (!(view instanceof qc.g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        Rect rect = new Rect();
        o(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        com.google.android.material.carousel.c cVar = this.f7758y;
        float f10 = (cVar == null || this.C.f29632a != 0) ? ((ViewGroup.MarginLayoutParams) rVar).width : cVar.g().f();
        com.google.android.material.carousel.c cVar2 = this.f7758y;
        view.measure(RecyclerView.q.P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, (int) f10, p()), RecyclerView.q.P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, (int) ((cVar2 == null || this.C.f29632a != 1) ? ((ViewGroup.MarginLayoutParams) rVar).height : cVar2.g().f()), q()));
    }

    public boolean G2() {
        return f() && d0() == 1;
    }

    public final boolean H2(float f10, d dVar) {
        float a22 = a2(f10, t2(f10, dVar) / 2.0f);
        return G2() ? a22 < 0.0f : a22 > ((float) o2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    public final boolean I2(float f10, d dVar) {
        float Z1 = Z1(f10, t2(f10, dVar) / 2.0f);
        return G2() ? Z1 > ((float) o2()) : Z1 < 0.0f;
    }

    public final void J2() {
        if (this.f7755v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View N = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(N) + ", center:" + p2(N) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    public final b K2(RecyclerView.x xVar, float f10, int i10) {
        View o8 = xVar.o(i10);
        F0(o8, 0, 0);
        float Z1 = Z1(f10, this.f7759z.f() / 2.0f);
        d F2 = F2(this.f7759z.g(), Z1, false);
        return new b(o8, Z1, e2(o8, Z1, F2), F2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.f7757x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    public final float L2(View view, float f10, float f11, Rect rect) {
        float Z1 = Z1(f10, f11);
        d F2 = F2(this.f7759z.g(), Z1, false);
        float e22 = e2(view, Z1, F2);
        super.U(view, rect);
        V2(view, Z1, F2);
        this.C.o(view, rect, f11, e22);
        return e22;
    }

    public final void M2(RecyclerView.x xVar) {
        View o8 = xVar.o(0);
        F0(o8, 0, 0);
        com.google.android.material.carousel.b g10 = this.f7757x.g(this, o8);
        if (G2()) {
            g10 = com.google.android.material.carousel.b.n(g10, o2());
        }
        this.f7758y = com.google.android.material.carousel.c.f(this, g10, q2(), s2(), C2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        O1(aVar);
    }

    public final void N2() {
        this.f7758y = null;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(@NonNull View view, int i10, @NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        int k22;
        if (O() == 0 || (k22 = k2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (k22 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            b2(xVar, l0(N(0)) - 1, 0);
            return n2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        b2(xVar, l0(N(O() - 1)) + 1, -1);
        return m2();
    }

    public final void O2(RecyclerView.x xVar) {
        while (O() > 0) {
            View N = N(0);
            float p22 = p2(N);
            if (!I2(p22, F2(this.f7759z.g(), p22, true))) {
                break;
            } else {
                r1(N, xVar);
            }
        }
        while (O() - 1 >= 0) {
            View N2 = N(O() - 1);
            float p23 = p2(N2);
            if (!H2(p23, F2(this.f7759z.g(), p23, true))) {
                return;
            } else {
                r1(N2, xVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(@NonNull AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public final void Q2(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public void R2(int i10) {
        this.G = i10;
        N2();
    }

    public final void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f20676l0);
            R2(obtainStyledAttributes.getInt(k.f20685m0, 0));
            U2(obtainStyledAttributes.getInt(k.f20599c5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public void T2(@NonNull f fVar) {
        this.f7757x = fVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U(@NonNull View view, @NonNull Rect rect) {
        super.U(view, rect);
        float centerY = rect.centerY();
        if (f()) {
            centerY = rect.centerX();
        }
        float t22 = t2(centerY, F2(this.f7759z.g(), centerY, true));
        float width = f() ? (rect.width() - t22) / 2.0f : 0.0f;
        float height = f() ? 0.0f : (rect.height() - t22) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public void U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        e eVar = this.C;
        if (eVar == null || i10 != eVar.f29632a) {
            this.C = e.c(this, i10);
            N2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V2(View view, float f10, d dVar) {
        if (view instanceof qc.g) {
            b.c cVar = dVar.f7765a;
            float f11 = cVar.f7778c;
            b.c cVar2 = dVar.b;
            float b10 = jc.a.b(f11, cVar2.f7778c, cVar.f7777a, cVar2.f7777a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF f12 = this.C.f(height, width, jc.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b10), jc.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b10));
            float e22 = e2(view, f10, dVar);
            RectF rectF = new RectF(e22 - (f12.width() / 2.0f), e22 - (f12.height() / 2.0f), e22 + (f12.width() / 2.0f), (f12.height() / 2.0f) + e22);
            RectF rectF2 = new RectF(y2(), B2(), z2(), w2());
            if (this.f7757x.f()) {
                this.C.a(f12, rectF, rectF2);
            }
            this.C.n(f12, rectF, rectF2);
            ((qc.g) view).a(f12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.W0(recyclerView, i10, i11);
        X2();
    }

    public final void W2(@NonNull com.google.android.material.carousel.c cVar) {
        int i10 = this.f7754u;
        int i11 = this.f7753t;
        if (i10 <= i11) {
            this.f7759z = G2() ? cVar.h() : cVar.l();
        } else {
            this.f7759z = cVar.j(this.f7752s, i11, i10);
        }
        this.f7756w.j(this.f7759z.g());
    }

    public final void X2() {
        int e10 = e();
        int i10 = this.E;
        if (e10 == i10 || this.f7758y == null) {
            return;
        }
        if (this.f7757x.h(this, i10)) {
            N2();
        }
        this.E = e10;
    }

    public final void Y1(View view, int i10, b bVar) {
        float f10 = this.f7759z.f() / 2.0f;
        j(view, i10);
        float f11 = bVar.f7762c;
        this.C.m(view, (int) (f11 - f10), (int) (f11 + f10));
        V2(view, bVar.b, bVar.f7763d);
    }

    public final void Y2() {
        if (!this.f7755v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int l02 = l0(N(i10));
            int i11 = i10 + 1;
            int l03 = l0(N(i11));
            if (l02 > l03) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + l02 + "] and child at index [" + i11 + "] had adapter position [" + l03 + "].");
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.Z0(recyclerView, i10, i11);
        X2();
    }

    public final float Z1(float f10, float f11) {
        return G2() ? f10 - f11 : f10 + f11;
    }

    @Override // qc.b
    public int a() {
        return s0();
    }

    public final float a2(float f10, float f11) {
        return G2() ? f10 + f11 : f10 - f11;
    }

    @Override // qc.b
    public int b() {
        return b0();
    }

    public final void b2(@NonNull RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0 || i10 >= e()) {
            return;
        }
        b K2 = K2(xVar, f2(i10), i10);
        Y1(K2.f7761a, i11, K2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        if (this.f7758y == null) {
            return null;
        }
        int u22 = u2(i10, r2(i10));
        return f() ? new PointF(u22, 0.0f) : new PointF(0.0f, u22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (b0Var.b() <= 0 || o2() <= 0.0f) {
            p1(xVar);
            this.A = 0;
            return;
        }
        boolean G2 = G2();
        boolean z10 = this.f7758y == null;
        if (z10) {
            M2(xVar);
        }
        int j22 = j2(this.f7758y);
        int g22 = g2(b0Var, this.f7758y);
        this.f7753t = G2 ? g22 : j22;
        if (G2) {
            g22 = j22;
        }
        this.f7754u = g22;
        if (z10) {
            this.f7752s = j22;
            this.B = this.f7758y.i(e(), this.f7753t, this.f7754u, G2());
            int i10 = this.F;
            if (i10 != -1) {
                this.f7752s = D2(i10, r2(i10));
            }
        }
        int i11 = this.f7752s;
        this.f7752s = i11 + i2(0, i11, this.f7753t, this.f7754u);
        this.A = s2.a.c(this.A, 0, b0Var.b());
        W2(this.f7758y);
        B(xVar);
        l2(xVar, b0Var);
        this.E = e();
    }

    public final void c2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        float f22 = f2(i10);
        while (i10 < b0Var.b()) {
            b K2 = K2(xVar, f22, i10);
            if (H2(K2.f7762c, K2.f7763d)) {
                return;
            }
            f22 = Z1(f22, this.f7759z.f());
            if (!I2(K2.f7762c, K2.f7763d)) {
                Y1(K2.f7761a, -1, K2);
            }
            i10++;
        }
    }

    @Override // qc.b
    public int d() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = l0(N(0));
        }
        Y2();
    }

    public final void d2(RecyclerView.x xVar, int i10) {
        float f22 = f2(i10);
        while (i10 >= 0) {
            b K2 = K2(xVar, f22, i10);
            if (I2(K2.f7762c, K2.f7763d)) {
                return;
            }
            f22 = a2(f22, this.f7759z.f());
            if (!H2(K2.f7762c, K2.f7763d)) {
                Y1(K2.f7761a, 0, K2);
            }
            i10--;
        }
    }

    public final float e2(View view, float f10, d dVar) {
        b.c cVar = dVar.f7765a;
        float f11 = cVar.b;
        b.c cVar2 = dVar.b;
        float b10 = jc.a.b(f11, cVar2.b, cVar.f7777a, cVar2.f7777a, f10);
        if (dVar.b != this.f7759z.c() && dVar.f7765a != this.f7759z.j()) {
            return b10;
        }
        float e10 = this.C.e((RecyclerView.r) view.getLayoutParams()) / this.f7759z.f();
        b.c cVar3 = dVar.b;
        return b10 + ((f10 - cVar3.f7777a) * ((1.0f - cVar3.f7778c) + e10));
    }

    @Override // qc.b
    public boolean f() {
        return this.C.f29632a == 0;
    }

    public final float f2(int i10) {
        return Z1(A2() - this.f7752s, this.f7759z.f() * i10);
    }

    public final int g2(RecyclerView.b0 b0Var, com.google.android.material.carousel.c cVar) {
        boolean G2 = G2();
        com.google.android.material.carousel.b l10 = G2 ? cVar.l() : cVar.h();
        b.c a10 = G2 ? l10.a() : l10.h();
        int b10 = (int) (((((b0Var.b() - 1) * l10.f()) * (G2 ? -1.0f : 1.0f)) - (a10.f7777a - A2())) + (x2() - a10.f7777a) + (G2 ? -a10.f7782g : a10.f7783h));
        return G2 ? Math.min(0, b10) : Math.max(0, b10);
    }

    public int h2(int i10) {
        return (int) (this.f7752s - D2(i10, r2(i10)));
    }

    public final int j2(@NonNull com.google.android.material.carousel.c cVar) {
        boolean G2 = G2();
        com.google.android.material.carousel.b h10 = G2 ? cVar.h() : cVar.l();
        return (int) (A2() - a2((G2 ? h10.h() : h10.a()).f7777a, h10.f() / 2.0f));
    }

    public final void l2(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        O2(xVar);
        if (O() == 0) {
            d2(xVar, this.A - 1);
            c2(xVar, b0Var, this.A);
        } else {
            int l02 = l0(N(0));
            int l03 = l0(N(O() - 1));
            d2(xVar, l02 - 1);
            c2(xVar, b0Var, l03 + 1);
        }
        Y2();
    }

    public final View m2() {
        return N(G2() ? 0 : O() - 1);
    }

    public final View n2() {
        return N(G2() ? O() - 1 : 0);
    }

    public final int o2() {
        return f() ? a() : b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return f();
    }

    public final float p2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return !f();
    }

    public final int q2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) N(0).getLayoutParams();
        if (this.C.f29632a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    public final com.google.android.material.carousel.b r2(int i10) {
        com.google.android.material.carousel.b bVar;
        Map<Integer, com.google.android.material.carousel.b> map = this.B;
        return (map == null || (bVar = map.get(Integer.valueOf(s2.a.c(i10, 0, Math.max(0, e() + (-1)))))) == null) ? this.f7758y.g() : bVar;
    }

    public final int s2() {
        if (R() || !this.f7757x.f()) {
            return 0;
        }
        return v2() == 1 ? k0() : i0();
    }

    public final float t2(float f10, d dVar) {
        b.c cVar = dVar.f7765a;
        float f11 = cVar.f7779d;
        b.c cVar2 = dVar.b;
        return jc.a.b(f11, cVar2.f7779d, cVar.b, cVar2.b, f10);
    }

    public int u2(int i10, @NonNull com.google.android.material.carousel.b bVar) {
        return D2(i10, bVar) - this.f7752s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(@NonNull RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7758y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f7758y.g().f() / x(b0Var)));
    }

    public int v2() {
        return this.C.f29632a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(@NonNull RecyclerView.b0 b0Var) {
        return this.f7752s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    public final int w2() {
        return this.C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(@NonNull RecyclerView.b0 b0Var) {
        return this.f7754u - this.f7753t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int E2;
        if (this.f7758y == null || (E2 = E2(l0(view), r2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, E2(l0(view), this.f7758y.j(this.f7752s + i2(E2, this.f7752s, this.f7753t, this.f7754u), this.f7753t, this.f7754u)));
        return true;
    }

    public final int x2() {
        return this.C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(@NonNull RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7758y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f7758y.g().f() / A(b0Var)));
    }

    public final int y2() {
        return this.C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(@NonNull RecyclerView.b0 b0Var) {
        return this.f7752s;
    }

    public final int z2() {
        return this.C.j();
    }

    public CarouselLayoutManager(@NonNull f fVar) {
        this(fVar, 0);
    }

    public CarouselLayoutManager(@NonNull f fVar, int i10) {
        this.f7755v = false;
        this.f7756w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: qc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.S1(CarouselLayoutManager.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(fVar);
        U2(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f7755v = false;
        this.f7756w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: qc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.S1(CarouselLayoutManager.this, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(new h());
        S2(context, attributeSet);
    }
}
