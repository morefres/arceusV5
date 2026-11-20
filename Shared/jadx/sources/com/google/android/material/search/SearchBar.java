package com.google.android.material.search;

import ad.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import hd.g;
import hd.h;
import ic.b;
import ic.d;
import ic.e;
import ic.j;
import uc.a;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* renamed from: i0, reason: collision with root package name */
    public static final int f8123i0 = j.f20559l;
    public final TextView T;
    public final boolean U;
    public final boolean V;
    public final Drawable W;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f8124a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f8125b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f8126c0;

    /* renamed from: d0, reason: collision with root package name */
    public Integer f8127d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f8128e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f8129f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f8130g0;

    /* renamed from: h0, reason: collision with root package name */
    public g f8131h0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public String f8132c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f8132c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8132c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private Drawable W(Drawable drawable) {
        int d10;
        if (!this.f8124a0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f8127d0;
        if (num != null) {
            d10 = num.intValue();
        } else {
            d10 = a.d(this, drawable == this.W ? b.f20404k : b.f20403j);
        }
        Drawable r8 = q2.a.r(drawable.mutate());
        q2.a.n(r8, d10);
        return r8;
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton d10 = p.d(this);
        if (d10 == null) {
            return;
        }
        d10.setClickable(!z10);
        d10.setFocusable(!z10);
        Drawable background = d10.getBackground();
        if (background != null) {
            this.f8128e0 = background;
        }
        d10.setBackgroundDrawable(z10 ? null : this.f8128e0);
        Z();
    }

    public final int T(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    public final void U() {
        View view = this.f8126c0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f8126c0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        V(this.f8126c0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    public final void V(View view, int i10, int i11, int i12, int i13) {
        if (o0.z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    public final void X(int i10, int i11) {
        View view = this.f8126c0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    public final void Y() {
        if (this.V && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(d.f20458s);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = T(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = T(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = T(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = T(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton d10 = p.d(this);
        int width = (d10 == null || !d10.isClickable()) ? 0 : z10 ? getWidth() - d10.getLeft() : d10.getRight();
        ActionMenuView a10 = p.a(this);
        int right = a10 != null ? z10 ? a10.getRight() : getWidth() - a10.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.U && this.f8126c0 == null && !(view instanceof ActionMenuView)) {
            this.f8126c0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b0() {
        if (getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) getLayoutParams();
            if (this.f8130g0) {
                if (dVar.c() == 0) {
                    dVar.g(53);
                }
            } else if (dVar.c() == 53) {
                dVar.g(0);
            }
        }
    }

    public View getCenterView() {
        return this.f8126c0;
    }

    public float getCompatElevation() {
        g gVar = this.f8131h0;
        return gVar != null ? gVar.w() : o0.u(this);
    }

    public float getCornerSize() {
        return this.f8131h0.J();
    }

    public int getDefaultMarginVerticalResource() {
        return d.f20459t;
    }

    public int getDefaultNavigationIconResource() {
        return e.f20467c;
    }

    public CharSequence getHint() {
        return this.T.getHint();
    }

    public int getMenuResId() {
        return this.f8129f0;
    }

    public int getStrokeColor() {
        return this.f8131h0.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f8131h0.H();
    }

    @NonNull
    public CharSequence getText() {
        return this.T.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f8131h0);
        Y();
        b0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
        Z();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        X(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f8132c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f8132c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.f8126c0;
        if (view2 != null) {
            removeView(view2);
            this.f8126c0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f8130g0 = z10;
        b0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = this.f8131h0;
        if (gVar != null) {
            gVar.Z(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.T.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f8125b0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f8131h0.i0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f8131h0.j0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.T.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.e;
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).e0();
        }
        super.x(i10);
        this.f8129f0 = i10;
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).d0();
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h, reason: collision with root package name */
        public boolean f8133h;

        public ScrollingViewBehavior() {
            this.f8133h = false;
        }

        @Override // kc.b
        public boolean T() {
            return true;
        }

        public final void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean l10 = super.l(coordinatorLayout, view, view2);
            if (!this.f8133h && (view2 instanceof AppBarLayout)) {
                this.f8133h = true;
                Y((AppBarLayout) view2);
            }
            return l10;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8133h = false;
        }
    }

    public void setHint(int i10) {
        this.T.setHint(i10);
    }

    public void setText(int i10) {
        this.T.setText(i10);
    }
}
