package com.google.android.material.appbar;

import ad.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.o0;
import hd.g;
import hd.h;
import ic.b;
import ic.j;
import q2.a;
import wc.c;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final int f7567b0 = j.D;

    /* renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f7568c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T;
    public boolean U;
    public boolean V;
    public ImageView.ScaleType W;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f7569a0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f20402i0);
    }

    public final Pair<Integer, Integer> T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void U(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : c.g(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.a0(valueOf);
            gVar.Q(context);
            gVar.Z(o0.u(this));
            o0.q0(this, gVar);
        }
    }

    public final void V(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    public final void W() {
        if (this.U || this.V) {
            TextView g10 = p.g(this);
            TextView e10 = p.e(this);
            if (g10 == null && e10 == null) {
                return;
            }
            Pair<Integer, Integer> T = T(g10, e10);
            if (this.U && g10 != null) {
                V(g10, T);
            }
            if (!this.V || e10 == null) {
                return;
            }
            V(e10, T);
        }
    }

    public final Drawable X(Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable r8 = a.r(drawable.mutate());
        a.n(r8, this.T.intValue());
        return r8;
    }

    public final void Y() {
        ImageView c10 = p.c(this);
        if (c10 != null) {
            Boolean bool = this.f7569a0;
            if (bool != null) {
                c10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                c10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f7569a0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f7569a0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof e;
        if (z10) {
            ((e) menu).e0();
        }
        super.x(i10);
        if (z10) {
            ((e) menu).d0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f7567b0
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = ic.k.f20804z4
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r9 = ic.k.C4
            boolean r9 = r8.hasValue(r9)
            r1 = -1
            if (r9 == 0) goto L2a
            int r9 = ic.k.C4
            int r9 = r8.getColor(r9, r1)
            r6.setNavigationIconTint(r9)
        L2a:
            int r9 = ic.k.E4
            boolean r9 = r8.getBoolean(r9, r7)
            r6.U = r9
            int r9 = ic.k.D4
            boolean r9 = r8.getBoolean(r9, r7)
            r6.V = r9
            int r9 = ic.k.B4
            int r9 = r8.getInt(r9, r1)
            if (r9 < 0) goto L4b
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.f7568c0
            int r2 = r1.length
            if (r9 >= r2) goto L4b
            r9 = r1[r9]
            r6.W = r9
        L4b:
            int r9 = ic.k.A4
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto L5f
            int r9 = ic.k.A4
            boolean r7 = r8.getBoolean(r9, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.f7569a0 = r7
        L5f:
            r8.recycle()
            r6.U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
