package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import hd.n;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator D = jc.a.f21660c;
    public static final int E = ic.b.F;
    public static final int F = ic.b.P;
    public static final int G = ic.b.G;
    public static final int H = ic.b.N;
    public static final int[] I = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] M = {R.attr.state_enabled};
    public static final int[] N = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* renamed from: a, reason: collision with root package name */
    public hd.k f8007a;
    public hd.g b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f8008c;

    /* renamed from: d, reason: collision with root package name */
    public zc.a f8009d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8010e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8011f;

    /* renamed from: h, reason: collision with root package name */
    public float f8013h;

    /* renamed from: i, reason: collision with root package name */
    public float f8014i;

    /* renamed from: j, reason: collision with root package name */
    public float f8015j;

    /* renamed from: k, reason: collision with root package name */
    public int f8016k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ad.j f8017l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f8018m;

    /* renamed from: n, reason: collision with root package name */
    public jc.h f8019n;

    /* renamed from: o, reason: collision with root package name */
    public jc.h f8020o;

    /* renamed from: p, reason: collision with root package name */
    public float f8021p;

    /* renamed from: r, reason: collision with root package name */
    public int f8023r;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f8025t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f8026u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<j> f8027v;

    /* renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f8028w;

    /* renamed from: x, reason: collision with root package name */
    public final gd.b f8029x;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8012g = true;

    /* renamed from: q, reason: collision with root package name */
    public float f8022q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f8024s = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f8030y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f8031z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0127a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8032a;
        public final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f8033c;

        public C0127a(boolean z10, k kVar) {
            this.b = z10;
            this.f8033c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8032a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f8024s = 0;
            a.this.f8018m = null;
            if (this.f8032a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f8028w;
            boolean z10 = this.b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f8033c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f8028w.b(0, this.b);
            a.this.f8024s = 1;
            a.this.f8018m = animator;
            this.f8032a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8035a;
        public final /* synthetic */ k b;

        public b(boolean z10, k kVar) {
            this.f8035a = z10;
            this.b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f8024s = 0;
            a.this.f8018m = null;
            k kVar = this.b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f8028w.b(0, this.f8035a);
            a.this.f8024s = 2;
            a.this.f8018m = animator;
        }
    }

    public class c extends jc.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            a.this.f8022q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f8038a;
        public final /* synthetic */ float b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f8039c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f8040d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f8041e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f8042f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f8043g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f8044h;

        public d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f8038a = f10;
            this.b = f11;
            this.f8039c = f12;
            this.f8040d = f13;
            this.f8041e = f14;
            this.f8042f = f15;
            this.f8043g = f16;
            this.f8044h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f8028w.setAlpha(jc.a.b(this.f8038a, this.b, 0.0f, 0.2f, floatValue));
            a.this.f8028w.setScaleX(jc.a.a(this.f8039c, this.f8040d, floatValue));
            a.this.f8028w.setScaleY(jc.a.a(this.f8041e, this.f8040d, floatValue));
            a.this.f8022q = jc.a.a(this.f8042f, this.f8043g, floatValue);
            a.this.h(jc.a.a(this.f8042f, this.f8043g, floatValue), this.f8044h);
            a.this.f8028w.setImageMatrix(this.f8044h);
        }
    }

    public class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        public FloatEvaluator f8046a = new FloatEvaluator();

        public e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f8046a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.H();
            return true;
        }
    }

    public class g extends m {
        public g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return 0.0f;
        }
    }

    public class h extends m {
        public h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f8013h + aVar.f8014i;
        }
    }

    public class i extends m {
        public i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            a aVar = a.this;
            return aVar.f8013h + aVar.f8015j;
        }
    }

    public interface j {
        void a();

        void b();
    }

    public interface k {
        void a();

        void b();
    }

    public class l extends m {
        public l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        public float a() {
            return a.this.f8013h;
        }
    }

    public abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8052a;
        public float b;

        /* renamed from: c, reason: collision with root package name */
        public float f8053c;

        public m() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.g0((int) this.f8053c);
            this.f8052a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f8052a) {
                hd.g gVar = a.this.b;
                this.b = gVar == null ? 0.0f : gVar.w();
                this.f8053c = a();
                this.f8052a = true;
            }
            a aVar = a.this;
            float f10 = this.b;
            aVar.g0((int) (f10 + ((this.f8053c - f10) * valueAnimator.getAnimatedFraction())));
        }

        public /* synthetic */ m(a aVar, C0127a c0127a) {
            this();
        }
    }

    public a(FloatingActionButton floatingActionButton, gd.b bVar) {
        this.f8028w = floatingActionButton;
        this.f8029x = bVar;
        ad.j jVar = new ad.j();
        this.f8017l = jVar;
        jVar.a(I, k(new i()));
        jVar.a(J, k(new h()));
        jVar.a(K, k(new h()));
        jVar.a(L, k(new h()));
        jVar.a(M, k(new l()));
        jVar.a(N, k(new g()));
        this.f8021p = floatingActionButton.getRotation();
    }

    public void A() {
        throw null;
    }

    public void B() {
        hd.g gVar = this.b;
        if (gVar != null) {
            hd.h.f(this.f8028w, gVar);
        }
        if (K()) {
            this.f8028w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    public void C() {
        throw null;
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.f8028w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    public void E(int[] iArr) {
        throw null;
    }

    public void F(float f10, float f11, float f12) {
        throw null;
    }

    public void G(@NonNull Rect rect) {
        x2.g.h(this.f8010e, "Didn't initialize content background");
        if (!Z()) {
            this.f8029x.b(this.f8010e);
        } else {
            this.f8029x.b(new InsetDrawable(this.f8010e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void H() {
        float rotation = this.f8028w.getRotation();
        if (this.f8021p != rotation) {
            this.f8021p = rotation;
            d0();
        }
    }

    public void I() {
        ArrayList<j> arrayList = this.f8027v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.b();
            }
        }
    }

    public void J() {
        ArrayList<j> arrayList = this.f8027v;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                j jVar = arrayList.get(i10);
                i10++;
                jVar.a();
            }
        }
    }

    public boolean K() {
        throw null;
    }

    public void L(ColorStateList colorStateList) {
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        zc.a aVar = this.f8009d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void M(PorterDuff.Mode mode) {
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    public final void N(float f10) {
        if (this.f8013h != f10) {
            this.f8013h = f10;
            F(f10, this.f8014i, this.f8015j);
        }
    }

    public void O(boolean z10) {
        this.f8011f = z10;
    }

    public final void P(jc.h hVar) {
        this.f8020o = hVar;
    }

    public final void Q(float f10) {
        if (this.f8014i != f10) {
            this.f8014i = f10;
            F(this.f8013h, f10, this.f8015j);
        }
    }

    public final void R(float f10) {
        this.f8022q = f10;
        Matrix matrix = this.B;
        h(f10, matrix);
        this.f8028w.setImageMatrix(matrix);
    }

    public final void S(int i10) {
        if (this.f8023r != i10) {
            this.f8023r = i10;
            e0();
        }
    }

    public void T(int i10) {
        this.f8016k = i10;
    }

    public final void U(float f10) {
        if (this.f8015j != f10) {
            this.f8015j = f10;
            F(this.f8013h, this.f8014i, f10);
        }
    }

    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f8008c;
        if (drawable != null) {
            q2.a.o(drawable, fd.b.a(colorStateList));
        }
    }

    public void W(boolean z10) {
        this.f8012g = z10;
        f0();
    }

    public final void X(@NonNull hd.k kVar) {
        this.f8007a = kVar;
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f8008c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        zc.a aVar = this.f8009d;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    public final void Y(jc.h hVar) {
        this.f8019n = hVar;
    }

    public boolean Z() {
        throw null;
    }

    public final boolean a0() {
        return o0.R(this.f8028w) && !this.f8028w.isInEditMode();
    }

    public final boolean b0() {
        return !this.f8011f || this.f8028w.getSizeDimension() >= this.f8016k;
    }

    public void c0(k kVar, boolean z10) {
        a aVar;
        AnimatorSet j10;
        if (z()) {
            return;
        }
        Animator animator = this.f8018m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f8019n == null;
        if (!a0()) {
            this.f8028w.b(0, z10);
            this.f8028w.setAlpha(1.0f);
            this.f8028w.setScaleY(1.0f);
            this.f8028w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f8028w.getVisibility() != 0) {
            this.f8028w.setAlpha(0.0f);
            this.f8028w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f8028w.setScaleX(z11 ? 0.4f : 0.0f);
            R(z11 ? 0.4f : 0.0f);
        }
        jc.h hVar = this.f8019n;
        if (hVar != null) {
            j10 = i(hVar, 1.0f, 1.0f, 1.0f);
            aVar = this;
        } else {
            aVar = this;
            j10 = aVar.j(1.0f, 1.0f, 1.0f, E, F);
        }
        j10.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f8025t;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                j10.addListener(animatorListener);
            }
        }
        j10.start();
    }

    public void d0() {
        throw null;
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f8026u == null) {
            this.f8026u = new ArrayList<>();
        }
        this.f8026u.add(animatorListener);
    }

    public final void e0() {
        R(this.f8022q);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f8025t == null) {
            this.f8025t = new ArrayList<>();
        }
        this.f8025t.add(animatorListener);
    }

    public final void f0() {
        Rect rect = this.f8030y;
        r(rect);
        G(rect);
        this.f8029x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(@NonNull j jVar) {
        if (this.f8027v == null) {
            this.f8027v = new ArrayList<>();
        }
        this.f8027v.add(jVar);
    }

    public void g0(float f10) {
        hd.g gVar = this.b;
        if (gVar != null) {
            gVar.Z(f10);
        }
    }

    public final void h(float f10, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.f8028w.getDrawable() == null || this.f8023r == 0) {
            return;
        }
        RectF rectF = this.f8031z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f8023r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f8023r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @NonNull
    public final AnimatorSet i(@NonNull jc.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8028w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8028w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8028w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f12, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f8028w, new jc.f(), new c(), new Matrix(this.B));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        jc.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f8028w.getAlpha(), f10, this.f8028w.getScaleX(), f11, this.f8028w.getScaleY(), this.f8022q, f12, new Matrix(this.B)));
        arrayList.add(ofFloat);
        jc.b.a(animatorSet, arrayList);
        animatorSet.setDuration(cd.h.f(this.f8028w.getContext(), i10, this.f8028w.getContext().getResources().getInteger(ic.g.b)));
        animatorSet.setInterpolator(cd.h.g(this.f8028w.getContext(), i11, jc.a.b));
        return animatorSet;
    }

    @NonNull
    public final ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final Drawable l() {
        return this.f8010e;
    }

    public float m() {
        throw null;
    }

    public boolean n() {
        return this.f8011f;
    }

    public final jc.h o() {
        return this.f8020o;
    }

    public float p() {
        return this.f8014i;
    }

    @NonNull
    public final ViewTreeObserver.OnPreDrawListener q() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    public void r(@NonNull Rect rect) {
        int v5 = v();
        int max = Math.max(v5, (int) Math.ceil(this.f8012g ? m() + this.f8015j : 0.0f));
        int max2 = Math.max(v5, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public float s() {
        return this.f8015j;
    }

    public final hd.k t() {
        return this.f8007a;
    }

    public final jc.h u() {
        return this.f8019n;
    }

    public int v() {
        if (this.f8011f) {
            return Math.max((this.f8016k - this.f8028w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void w(k kVar, boolean z10) {
        a aVar;
        AnimatorSet j10;
        if (y()) {
            return;
        }
        Animator animator = this.f8018m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f8028w.b(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        jc.h hVar = this.f8020o;
        if (hVar != null) {
            j10 = i(hVar, 0.0f, 0.0f, 0.0f);
            aVar = this;
        } else {
            aVar = this;
            j10 = aVar.j(0.0f, 0.4f, 0.4f, G, H);
        }
        j10.addListener(new C0127a(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = aVar.f8026u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Animator.AnimatorListener animatorListener = arrayList.get(i10);
                i10++;
                j10.addListener(animatorListener);
            }
        }
        j10.start();
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public boolean y() {
        return this.f8028w.getVisibility() == 0 ? this.f8024s == 1 : this.f8024s != 2;
    }

    public boolean z() {
        return this.f8028w.getVisibility() != 0 ? this.f8024s == 2 : this.f8024s != 1;
    }
}
