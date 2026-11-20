package com.google.android.material.floatingactionbutton;

import ad.s;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.stateful.ExtendableSavedState;
import hd.n;
import ic.j;
import java.util.List;
import jc.h;
import jc.k;
import q.p;
import x2.g;

/* loaded from: classes2.dex */
public class FloatingActionButton extends s implements yc.a, n, CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f7986r = j.f20555h;
    public ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f7987c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f7988d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f7989e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f7990f;

    /* renamed from: g, reason: collision with root package name */
    public int f7991g;

    /* renamed from: h, reason: collision with root package name */
    public int f7992h;

    /* renamed from: i, reason: collision with root package name */
    public int f7993i;

    /* renamed from: j, reason: collision with root package name */
    public int f7994j;

    /* renamed from: k, reason: collision with root package name */
    public int f7995k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7996l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f7997m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f7998n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final p f7999o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final yc.b f8000p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f8001q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(@NonNull CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class a implements a.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f8004a;

        public a(b bVar) {
            this.f8004a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f8004a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f8004a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements gd.b {
        public c() {
        }

        @Override // gd.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f7997m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f7994j, i11 + FloatingActionButton.this.f7994j, i12 + FloatingActionButton.this.f7994j, i13 + FloatingActionButton.this.f7994j);
        }

        @Override // gd.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // gd.b
        public boolean c() {
            return FloatingActionButton.this.f7996l;
        }
    }

    public class d<T extends FloatingActionButton> implements a.j {
        public d(@NonNull k<T> kVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20414u);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f8001q == null) {
            this.f8001q = h();
        }
        return this.f8001q;
    }

    @Override // yc.a
    public boolean a() {
        return this.f8000p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(@NonNull k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f7987c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f7993i;
    }

    public int getExpandedComponentIdHint() {
        return this.f8000p.b();
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f7990f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f7990f;
    }

    @NonNull
    public hd.k getShapeAppearanceModel() {
        return (hd.k) g.g(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f7992h;
    }

    public int getSizeDimension() {
        return k(this.f7992h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7988d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f7989e;
    }

    public boolean getUseCompatPadding() {
        return this.f7996l;
    }

    @NonNull
    public final com.google.android.material.floatingactionbutton.a h() {
        return new zc.b(this, new c());
    }

    @Deprecated
    public boolean i(@NonNull Rect rect) {
        if (!o0.R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public final int k(int i10) {
        int i11 = this.f7993i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(ic.d.f20432c) : resources.getDimensionPixelSize(ic.d.b) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    public final void l(@NonNull Rect rect) {
        j(rect);
        int i10 = -this.f8001q.v();
        rect.inset(i10, i10);
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    public void n(b bVar, boolean z10) {
        getImpl().w(u(bVar), z10);
    }

    public boolean o() {
        return getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f7994j = (sizeDimension - this.f7995k) / 2;
        getImpl().f0();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f7997m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.f8000p.d((Bundle) g.g(extendableSavedState.f8259c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f8259c.put("expandableWidgetHelper", this.f8000p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f7998n);
            if (!this.f7998n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public final void q(@NonNull Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f7997m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f7988d;
        if (colorStateList == null) {
            q2.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f7989e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(q.k.e(colorForState, mode));
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f7987c != mode) {
            this.f7987c = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().N(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f7993i) {
            this.f7993i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().g0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().O(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f8000p.f(i10);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().P(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f7988d != null) {
                r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f7999o.i(i10);
        r();
    }

    public void setMaxImageSize(int i10) {
        this.f7995k = i10;
        getImpl().S(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().W(z10);
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull hd.k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().Y(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f7993i = 0;
        if (i10 != this.f7992h) {
            this.f7992h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7988d != colorStateList) {
            this.f7988d = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f7989e != mode) {
            this.f7989e = mode;
            r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f7996l != z10) {
            this.f7996l = z10;
            getImpl().C();
        }
    }

    @Override // ad.s, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void t(b bVar, boolean z10) {
        getImpl().c0(u(bVar), z10);
    }

    public final a.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f8002a;
        public b b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8003c;

        public BaseBehavior() {
            this.f8003c = true;
        }

        private static boolean J(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f7997m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f7997m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                o0.X(floatingActionButton, i10);
            }
            if (i11 != 0) {
                o0.W(floatingActionButton, i11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> r8 = coordinatorLayout.r(floatingActionButton);
            int size = r8.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r8.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean N(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f8003c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean O(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8002a == null) {
                this.f8002a = new Rect();
            }
            Rect rect = this.f8002a;
            ad.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        public final boolean P(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f1579h == 0) {
                fVar.f1579h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.k.W1);
            this.f8003c = obtainStyledAttributes.getBoolean(ic.k.X1, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionButton(@androidx.annotation.NonNull android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.floatingactionbutton.FloatingActionButton.f7986r
            android.content.Context r11 = md.a.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f7997m = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f7998n = r11
            android.content.Context r0 = r10.getContext()
            int[] r2 = ic.k.G1
            r11 = 0
            int[] r5 = new int[r11]
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r13 = ic.k.I1
            android.content.res.ColorStateList r13 = ed.c.a(r0, r12, r13)
            r10.b = r13
            int r13 = ic.k.J1
            r2 = -1
            int r13 = r12.getInt(r13, r2)
            r5 = 0
            android.graphics.PorterDuff$Mode r13 = ad.r.i(r13, r5)
            r10.f7987c = r13
            int r13 = ic.k.T1
            android.content.res.ColorStateList r13 = ed.c.a(r0, r12, r13)
            r10.f7990f = r13
            int r13 = ic.k.O1
            int r13 = r12.getInt(r13, r2)
            r10.f7992h = r13
            int r13 = ic.k.N1
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.f7993i = r13
            int r13 = ic.k.K1
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.f7991g = r13
            int r13 = ic.k.L1
            r2 = 0
            float r13 = r12.getDimension(r13, r2)
            int r5 = ic.k.Q1
            float r5 = r12.getDimension(r5, r2)
            int r6 = ic.k.S1
            float r2 = r12.getDimension(r6, r2)
            int r6 = ic.k.V1
            boolean r6 = r12.getBoolean(r6, r11)
            r10.f7996l = r6
            android.content.res.Resources r6 = r10.getResources()
            int r7 = ic.d.f20431b0
            int r6 = r6.getDimensionPixelSize(r7)
            int r7 = ic.k.R1
            int r7 = r12.getDimensionPixelSize(r7, r11)
            r10.setMaxImageSize(r7)
            int r7 = ic.k.U1
            jc.h r7 = jc.h.b(r0, r12, r7)
            int r8 = ic.k.P1
            jc.h r8 = jc.h.b(r0, r12, r8)
            hd.c r9 = hd.k.f19280m
            hd.k$b r0 = hd.k.g(r0, r1, r3, r4, r9)
            hd.k r0 = r0.m()
            int r4 = ic.k.M1
            boolean r11 = r12.getBoolean(r4, r11)
            int r4 = ic.k.H1
            r9 = 1
            boolean r4 = r12.getBoolean(r4, r9)
            r10.setEnabled(r4)
            r12.recycle()
            q.p r12 = new q.p
            r12.<init>(r10)
            r10.f7999o = r12
            r12.g(r1, r3)
            yc.b r12 = new yc.b
            r12.<init>(r10)
            r10.f8000p = r12
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.X(r0)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            android.content.res.ColorStateList r0 = r10.b
            android.graphics.PorterDuff$Mode r1 = r10.f7987c
            android.content.res.ColorStateList r3 = r10.f7990f
            int r4 = r10.f7991g
            r12.x(r0, r1, r3, r4)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.T(r6)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.N(r13)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.Q(r5)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.U(r2)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.Y(r7)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.P(r8)
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.O(r11)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f7990f != colorStateList) {
            this.f7990f = colorStateList;
            getImpl().V(this.f7990f);
        }
    }
}
