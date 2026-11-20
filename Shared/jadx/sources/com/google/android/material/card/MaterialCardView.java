package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import hd.h;
import hd.k;
import hd.n;
import ic.b;
import ic.j;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7744n = {R.attr.state_checkable};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f7745o = {R.attr.state_checked};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f7746p = {b.Z};

    /* renamed from: q, reason: collision with root package name */
    public static final int f7747q = j.f20564q;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final pc.b f7748j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7749k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7750l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7751m;

    public interface a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.A);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f7748j.l().getBounds());
        return rectF;
    }

    public final void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f7748j.k();
        }
    }

    public boolean g() {
        pc.b bVar = this.f7748j;
        return bVar != null && bVar.F();
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f7748j.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f7748j.n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7748j.o();
    }

    public int getCheckedIconGravity() {
        return this.f7748j.p();
    }

    public int getCheckedIconMargin() {
        return this.f7748j.q();
    }

    public int getCheckedIconSize() {
        return this.f7748j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7748j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f7748j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f7748j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f7748j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f7748j.C().top;
    }

    public float getProgress() {
        return this.f7748j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f7748j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f7748j.x();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f7748j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f7748j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7748j.A();
    }

    public int getStrokeWidth() {
        return this.f7748j.B();
    }

    public boolean h() {
        return this.f7751m;
    }

    public void i(int i10, int i11, int i12, int i13) {
        super.d(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7750l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7748j.f0();
        h.f(this, this.f7748j.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, f7744n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7745o);
        }
        if (h()) {
            View.mergeDrawableStates(onCreateDrawableState, f7746p);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f7748j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f7749k) {
            if (!this.f7748j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f7748j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f7748j.L(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f7748j.h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f7748j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f7748j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f7750l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7748j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f7748j.p() != i10) {
            this.f7748j.R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f7748j.S(i10);
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f7748j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f7748j.Q(k.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f7748j.T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f7748j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f7748j.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        pc.b bVar = this.f7748j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f7751m != z10) {
            this.f7751m = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f7748j.j0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f7748j.j0();
        this.f7748j.g0();
    }

    public void setProgress(float f10) {
        this.f7748j.W(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f7748j.V(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f7748j.X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f7748j.X(k.a.a(getContext(), i10));
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f7748j.Y(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        this.f7748j.a0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f7748j.j0();
        this.f7748j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.f7750l = !this.f7750l;
            refreshDrawableState();
            f();
            this.f7748j.P(this.f7750l, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.card.MaterialCardView.f7747q
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            r7 = 0
            r6.f7750l = r7
            r6.f7751m = r7
            r0 = 1
            r6.f7749k = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = ic.k.A3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r7 = ad.o.i(r0, r1, r2, r3, r4, r5)
            pc.b r8 = new pc.b
            r8.<init>(r6, r1, r3, r4)
            r6.f7748j = r8
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r8.L(r9)
            int r9 = super.getContentPaddingLeft()
            int r0 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r8.b0(r9, r0, r1, r2)
            r8.I(r7)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7748j.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f7748j.Z(colorStateList);
        invalidate();
    }
}
