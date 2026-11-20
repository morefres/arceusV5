package pc;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.o0;
import cd.h;
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import ed.c;
import hd.d;
import hd.e;
import hd.g;
import hd.k;
import ic.f;
import ic.j;

/* loaded from: classes2.dex */
public class b {
    public static final Drawable A;

    /* renamed from: z, reason: collision with root package name */
    public static final double f28544z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f28545a;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final g f28546c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final g f28547d;

    /* renamed from: e, reason: collision with root package name */
    public int f28548e;

    /* renamed from: f, reason: collision with root package name */
    public int f28549f;

    /* renamed from: g, reason: collision with root package name */
    public int f28550g;

    /* renamed from: h, reason: collision with root package name */
    public int f28551h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f28552i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f28553j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f28554k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f28555l;

    /* renamed from: m, reason: collision with root package name */
    public k f28556m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f28557n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f28558o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f28559p;

    /* renamed from: q, reason: collision with root package name */
    public g f28560q;

    /* renamed from: r, reason: collision with root package name */
    public g f28561r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28563t;

    /* renamed from: u, reason: collision with root package name */
    public ValueAnimator f28564u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f28565v;

    /* renamed from: w, reason: collision with root package name */
    public final int f28566w;

    /* renamed from: x, reason: collision with root package name */
    public final int f28567x;

    @NonNull
    public final Rect b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    public boolean f28562s = false;

    /* renamed from: y, reason: collision with root package name */
    public float f28568y = 0.0f;

    public class a extends InsetDrawable {
        public a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f28545a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f28546c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.f0(-12303292);
        k.b v5 = gVar.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ic.k.f20658j0, i10, j.f20549a);
        if (obtainStyledAttributes.hasValue(ic.k.f20667k0)) {
            v5.o(obtainStyledAttributes.getDimension(ic.k.f20667k0, 0.0f));
        }
        this.f28547d = new g();
        Y(v5.m());
        this.f28565v = h.g(materialCardView.getContext(), ic.b.Q, jc.a.f21659a);
        this.f28566w = h.f(materialCardView.getContext(), ic.b.K, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f28567x = h.f(materialCardView.getContext(), ic.b.J, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f28553j.setAlpha((int) (255.0f * floatValue));
        bVar.f28568y = floatValue;
    }

    public ColorStateList A() {
        return this.f28557n;
    }

    public int B() {
        return this.f28551h;
    }

    @NonNull
    public Rect C() {
        return this.b;
    }

    @NonNull
    public final Drawable D(Drawable drawable) {
        int i10;
        int i11;
        if (this.f28545a.getUseCompatPadding()) {
            i11 = (int) Math.ceil(f());
            i10 = (int) Math.ceil(e());
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new a(drawable, i10, i11, i10, i11);
    }

    public boolean E() {
        return this.f28562s;
    }

    public boolean F() {
        return this.f28563t;
    }

    public final boolean G() {
        return (this.f28550g & 80) == 80;
    }

    public final boolean H() {
        return (this.f28550g & GravityCompat.END) == 8388613;
    }

    public void I(@NonNull TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f28545a.getContext(), typedArray, ic.k.J3);
        this.f28557n = a10;
        if (a10 == null) {
            this.f28557n = ColorStateList.valueOf(-1);
        }
        this.f28551h = typedArray.getDimensionPixelSize(ic.k.K3, 0);
        boolean z10 = typedArray.getBoolean(ic.k.B3, false);
        this.f28563t = z10;
        this.f28545a.setLongClickable(z10);
        this.f28555l = c.a(this.f28545a.getContext(), typedArray, ic.k.H3);
        Q(c.d(this.f28545a.getContext(), typedArray, ic.k.D3));
        T(typedArray.getDimensionPixelSize(ic.k.G3, 0));
        S(typedArray.getDimensionPixelSize(ic.k.F3, 0));
        this.f28550g = typedArray.getInteger(ic.k.E3, 8388661);
        ColorStateList a11 = c.a(this.f28545a.getContext(), typedArray, ic.k.I3);
        this.f28554k = a11;
        if (a11 == null) {
            this.f28554k = ColorStateList.valueOf(uc.a.d(this.f28545a, ic.b.f20399h));
        }
        M(c.a(this.f28545a.getContext(), typedArray, ic.k.C3));
        k0();
        h0();
        l0();
        this.f28545a.setBackgroundInternal(D(this.f28546c));
        Drawable t8 = e0() ? t() : this.f28547d;
        this.f28552i = t8;
        this.f28545a.setForeground(D(t8));
    }

    public void J(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f28559p != null) {
            if (this.f28545a.getUseCompatPadding()) {
                i12 = (int) Math.ceil(f() * 2.0f);
                i13 = (int) Math.ceil(e() * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i16 = H() ? ((i10 - this.f28548e) - this.f28549f) - i13 : this.f28548e;
            int i17 = G() ? this.f28548e : ((i11 - this.f28548e) - this.f28549f) - i12;
            int i18 = H() ? this.f28548e : ((i10 - this.f28548e) - this.f28549f) - i13;
            int i19 = G() ? ((i11 - this.f28548e) - this.f28549f) - i12 : this.f28548e;
            if (o0.z(this.f28545a) == 1) {
                i15 = i18;
                i14 = i16;
            } else {
                i14 = i18;
                i15 = i16;
            }
            this.f28559p.setLayerInset(2, i15, i19, i14, i17);
        }
    }

    public void K(boolean z10) {
        this.f28562s = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.f28546c.a0(colorStateList);
    }

    public void M(ColorStateList colorStateList) {
        g gVar = this.f28547d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.a0(colorStateList);
    }

    public void N(boolean z10) {
        this.f28563t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f28553j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f28568y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    public void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = q2.a.r(drawable).mutate();
            this.f28553j = mutate;
            q2.a.o(mutate, this.f28555l);
            O(this.f28545a.isChecked());
        } else {
            this.f28553j = A;
        }
        LayerDrawable layerDrawable = this.f28559p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.D, this.f28553j);
        }
    }

    public void R(int i10) {
        this.f28550g = i10;
        J(this.f28545a.getMeasuredWidth(), this.f28545a.getMeasuredHeight());
    }

    public void S(int i10) {
        this.f28548e = i10;
    }

    public void T(int i10) {
        this.f28549f = i10;
    }

    public void U(ColorStateList colorStateList) {
        this.f28555l = colorStateList;
        Drawable drawable = this.f28553j;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        }
    }

    public void V(float f10) {
        Y(this.f28556m.w(f10));
        this.f28552i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    public void W(float f10) {
        this.f28546c.b0(f10);
        g gVar = this.f28547d;
        if (gVar != null) {
            gVar.b0(f10);
        }
        g gVar2 = this.f28561r;
        if (gVar2 != null) {
            gVar2.b0(f10);
        }
    }

    public void X(ColorStateList colorStateList) {
        this.f28554k = colorStateList;
        k0();
    }

    public void Y(@NonNull k kVar) {
        this.f28556m = kVar;
        this.f28546c.setShapeAppearanceModel(kVar);
        this.f28546c.e0(!r0.T());
        g gVar = this.f28547d;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        g gVar2 = this.f28561r;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f28560q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f28557n == colorStateList) {
            return;
        }
        this.f28557n = colorStateList;
        l0();
    }

    public void a0(int i10) {
        if (i10 == this.f28551h) {
            return;
        }
        this.f28551h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f28568y : this.f28568y;
        ValueAnimator valueAnimator = this.f28564u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28564u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28568y, f10);
        this.f28564u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pc.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(b.this, valueAnimator2);
            }
        });
        this.f28564u.setInterpolator(this.f28565v);
        this.f28564u.setDuration((long) ((z10 ? this.f28566w : this.f28567x) * f11));
        this.f28564u.start();
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.b.set(i10, i11, i12, i13);
        g0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f28556m.q(), this.f28546c.J()), d(this.f28556m.s(), this.f28546c.K())), Math.max(d(this.f28556m.k(), this.f28546c.t()), d(this.f28556m.i(), this.f28546c.s())));
    }

    public final boolean c0() {
        return this.f28545a.getPreventCornerOverlap() && !g();
    }

    public final float d(d dVar, float f10) {
        if (dVar instanceof hd.j) {
            return (float) ((1.0d - f28544z) * f10);
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.f28545a.getPreventCornerOverlap() && g() && this.f28545a.getUseCompatPadding();
    }

    public final float e() {
        return this.f28545a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    public final boolean e0() {
        if (this.f28545a.isClickable()) {
            return true;
        }
        View view = this.f28545a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float f() {
        return (this.f28545a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    public void f0() {
        Drawable drawable = this.f28552i;
        Drawable t8 = e0() ? t() : this.f28547d;
        this.f28552i = t8;
        if (drawable != t8) {
            i0(t8);
        }
    }

    public final boolean g() {
        return this.f28546c.T();
    }

    public void g0() {
        int c10 = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f28545a;
        Rect rect = this.b;
        materialCardView.i(rect.left + c10, rect.top + c10, rect.right + c10, rect.bottom + c10);
    }

    @NonNull
    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g j10 = j();
        this.f28560q = j10;
        j10.a0(this.f28554k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f28560q);
        return stateListDrawable;
    }

    public void h0() {
        this.f28546c.Z(this.f28545a.getCardElevation());
    }

    @NonNull
    public final Drawable i() {
        if (!fd.b.f17154a) {
            return h();
        }
        this.f28561r = j();
        return new RippleDrawable(this.f28554k, null, this.f28561r);
    }

    public final void i0(Drawable drawable) {
        if (this.f28545a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f28545a.getForeground()).setDrawable(drawable);
        } else {
            this.f28545a.setForeground(D(drawable));
        }
    }

    @NonNull
    public final g j() {
        return new g(this.f28556m);
    }

    public void j0() {
        if (!E()) {
            this.f28545a.setBackgroundInternal(D(this.f28546c));
        }
        this.f28545a.setForeground(D(this.f28552i));
    }

    public void k() {
        Drawable drawable = this.f28558o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f28558o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f28558o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void k0() {
        Drawable drawable;
        if (fd.b.f17154a && (drawable = this.f28558o) != null) {
            ((RippleDrawable) drawable).setColor(this.f28554k);
            return;
        }
        g gVar = this.f28560q;
        if (gVar != null) {
            gVar.a0(this.f28554k);
        }
    }

    @NonNull
    public g l() {
        return this.f28546c;
    }

    public void l0() {
        this.f28547d.h0(this.f28551h, this.f28557n);
    }

    public ColorStateList m() {
        return this.f28546c.x();
    }

    public ColorStateList n() {
        return this.f28547d.x();
    }

    public Drawable o() {
        return this.f28553j;
    }

    public int p() {
        return this.f28550g;
    }

    public int q() {
        return this.f28548e;
    }

    public int r() {
        return this.f28549f;
    }

    public ColorStateList s() {
        return this.f28555l;
    }

    @NonNull
    public final Drawable t() {
        if (this.f28558o == null) {
            this.f28558o = i();
        }
        if (this.f28559p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f28558o, this.f28547d, this.f28553j});
            this.f28559p = layerDrawable;
            layerDrawable.setId(2, f.D);
        }
        return this.f28559p;
    }

    public float u() {
        return this.f28546c.J();
    }

    public final float v() {
        if (this.f28545a.getPreventCornerOverlap() && this.f28545a.getUseCompatPadding()) {
            return (float) ((1.0d - f28544z) * this.f28545a.getCardViewRadius());
        }
        return 0.0f;
    }

    public float w() {
        return this.f28546c.y();
    }

    public ColorStateList x() {
        return this.f28554k;
    }

    public k y() {
        return this.f28556m;
    }

    public int z() {
        ColorStateList colorStateList = this.f28557n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
