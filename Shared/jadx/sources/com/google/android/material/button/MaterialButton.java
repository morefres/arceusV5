package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import d3.i;
import hd.h;
import hd.k;
import hd.n;
import ic.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.f;

/* loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f7709r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f7710s = {R.attr.state_checked};

    /* renamed from: t, reason: collision with root package name */
    public static final int f7711t = j.f20563p;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final nc.a f7712d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<a> f7713e;

    /* renamed from: f, reason: collision with root package name */
    public b f7714f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f7715g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f7716h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f7717i;

    /* renamed from: j, reason: collision with root package name */
    public String f7718j;

    /* renamed from: k, reason: collision with root package name */
    public int f7719k;

    /* renamed from: l, reason: collision with root package name */
    public int f7720l;

    /* renamed from: m, reason: collision with root package name */
    public int f7721m;

    /* renamed from: n, reason: collision with root package name */
    public int f7722n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7723o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7724p;

    /* renamed from: q, reason: collision with root package name */
    public int f7725q;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f7726c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void f(@NonNull Parcel parcel) {
            this.f7726c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7726c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            f(parcel);
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public boolean a() {
        nc.a aVar = this.f7712d;
        return aVar != null && aVar.p();
    }

    public final boolean b() {
        int i10 = this.f7725q;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.f7725q;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.f7725q;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        return o0.z(this) == 1;
    }

    public final boolean f() {
        nc.a aVar = this.f7712d;
        return (aVar == null || aVar.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            i.m(this, this.f7717i, null, null, null);
        } else if (b()) {
            i.m(this, null, null, this.f7717i, null);
        } else if (d()) {
            i.m(this, null, this.f7717i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7718j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7718j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f7712d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7717i;
    }

    public int getIconGravity() {
        return this.f7725q;
    }

    public int getIconPadding() {
        return this.f7722n;
    }

    public int getIconSize() {
        return this.f7719k;
    }

    public ColorStateList getIconTint() {
        return this.f7716h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7715g;
    }

    public int getInsetBottom() {
        return this.f7712d.c();
    }

    public int getInsetTop() {
        return this.f7712d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f7712d.h();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f7712d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f7712d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f7712d.k();
        }
        return 0;
    }

    @Override // q.f
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f7712d.l() : super.getSupportBackgroundTintList();
    }

    @Override // q.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f7712d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f7717i;
        if (drawable != null) {
            Drawable mutate = q2.a.r(drawable).mutate();
            this.f7717i = mutate;
            q2.a.o(mutate, this.f7716h);
            PorterDuff.Mode mode = this.f7715g;
            if (mode != null) {
                q2.a.p(this.f7717i, mode);
            }
            int i10 = this.f7719k;
            if (i10 == 0) {
                i10 = this.f7717i.getIntrinsicWidth();
            }
            int i11 = this.f7719k;
            if (i11 == 0) {
                i11 = this.f7717i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7717i;
            int i12 = this.f7720l;
            int i13 = this.f7721m;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f7717i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] d10 = i.d(this);
        Drawable drawable3 = d10[0];
        Drawable drawable4 = d10[1];
        Drawable drawable5 = d10[2];
        if ((!c() || drawable3 == this.f7717i) && ((!b() || drawable5 == this.f7717i) && (!d() || drawable4 == this.f7717i))) {
            return;
        }
        g();
    }

    public final void i(int i10, int i11) {
        if (this.f7717i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f7720l = 0;
                if (this.f7725q == 16) {
                    this.f7721m = 0;
                    h(false);
                    return;
                }
                int i12 = this.f7719k;
                if (i12 == 0) {
                    i12 = this.f7717i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f7722n) - getPaddingBottom()) / 2);
                if (this.f7721m != max) {
                    this.f7721m = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f7721m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f7725q;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7720l = 0;
            h(false);
            return;
        }
        int i14 = this.f7719k;
        if (i14 == 0) {
            i14 = this.f7717i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - o0.D(this)) - i14) - this.f7722n) - o0.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f7725q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f7720l != textLayoutWidth) {
            this.f7720l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7723o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f7712d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f7709r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7710s);
        }
        return onCreateDrawableState;
    }

    @Override // q.f, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // q.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // q.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f7726c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7726c = this.f7723o;
        return savedState;
    }

    @Override // q.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f7712d.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7717i != null) {
            if (this.f7717i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7718j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f7712d.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // q.f, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f7712d.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // q.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f7712d.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f7723o != z10) {
            this.f7723o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f7723o);
            }
            if (this.f7724p) {
                return;
            }
            this.f7724p = true;
            Iterator<a> it = this.f7713e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f7723o);
            }
            this.f7724p = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f7712d.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f7712d.f().Z(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7717i != drawable) {
            this.f7717i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f7725q != i10) {
            this.f7725q = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f7722n != i10) {
            this.f7722n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7719k != i10) {
            this.f7719k = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7716h != colorStateList) {
            this.f7716h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7715g != mode) {
            this.f7715g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(k.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f7712d.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f7712d.x(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f7714f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f7714f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7712d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(k.a.a(getContext(), i10));
        }
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7712d.z(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f7712d.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f7712d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(k.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f7712d.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // q.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f7712d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // q.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f7712d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f7712d.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7723o);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20417x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButton.f7711t
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f7713e = r7
            r7 = 0
            r6.f7723o = r7
            r6.f7724p = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = ic.k.F2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r9 = ic.k.S2
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f7722n = r9
            int r9 = ic.k.V2
            r2 = -1
            int r9 = r8.getInt(r9, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = ad.r.i(r9, r2)
            r6.f7715g = r9
            android.content.Context r9 = r6.getContext()
            int r2 = ic.k.U2
            android.content.res.ColorStateList r9 = ed.c.a(r9, r8, r2)
            r6.f7716h = r9
            android.content.Context r9 = r6.getContext()
            int r2 = ic.k.Q2
            android.graphics.drawable.Drawable r9 = ed.c.d(r9, r8, r2)
            r6.f7717i = r9
            int r9 = ic.k.R2
            r2 = 1
            int r9 = r8.getInteger(r9, r2)
            r6.f7725q = r9
            int r9 = ic.k.T2
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f7719k = r9
            hd.k$b r9 = hd.k.e(r0, r1, r3, r4)
            hd.k r9 = r9.m()
            nc.a r0 = new nc.a
            r0.<init>(r6, r9)
            r6.f7712d = r0
            r0.r(r8)
            r8.recycle()
            int r8 = r6.f7722n
            r6.setCompoundDrawablePadding(r8)
            android.graphics.drawable.Drawable r8 = r6.f7717i
            if (r8 == 0) goto L82
            r7 = r2
        L82:
            r6.h(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
