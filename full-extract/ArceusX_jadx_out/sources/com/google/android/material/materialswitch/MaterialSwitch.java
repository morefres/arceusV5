package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.c;
import ic.b;
import ic.j;
import q2.a;

/* loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: k0, reason: collision with root package name */
    public static final int f8090k0 = j.f20558k;

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f8091l0 = {b.f20394e0};
    public Drawable U;
    public Drawable V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public Drawable f8092a0;

    /* renamed from: b0, reason: collision with root package name */
    public Drawable f8093b0;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f8094c0;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f8095d0;

    /* renamed from: e0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f8096e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f8097f0;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f8098g0;

    /* renamed from: h0, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f8099h0;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f8100i0;

    /* renamed from: j0, reason: collision with root package name */
    public int[] f8101j0;

    public MaterialSwitch(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.D);
    }

    public static void t(Drawable drawable, ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f10) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        a.n(drawable, c.c(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f10));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.U;
    }

    public Drawable getThumbIconDrawable() {
        return this.V;
    }

    public int getThumbIconSize() {
        return this.W;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f8095d0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f8096e0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.f8094c0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f8093b0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f8098g0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f8099h0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.f8092a0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.f8097f0;
    }

    @Override // android.view.View
    public void invalidate() {
        u();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.V != null) {
            View.mergeDrawableStates(onCreateDrawableState, f8091l0);
        }
        this.f8100i0 = wc.c.j(onCreateDrawableState);
        this.f8101j0 = wc.c.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public final void r() {
        this.U = wc.c.c(this.U, this.f8094c0, getThumbTintMode());
        this.V = wc.c.c(this.V, this.f8095d0, this.f8096e0);
        u();
        Drawable drawable = this.U;
        Drawable drawable2 = this.V;
        int i10 = this.W;
        super.setThumbDrawable(wc.c.b(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void s() {
        this.f8092a0 = wc.c.c(this.f8092a0, this.f8097f0, getTrackTintMode());
        this.f8093b0 = wc.c.c(this.f8093b0, this.f8098g0, this.f8099h0);
        u();
        Drawable drawable = this.f8092a0;
        if (drawable != null && this.f8093b0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f8092a0, this.f8093b0});
        } else if (drawable == null) {
            drawable = this.f8093b0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.U = drawable;
        r();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.V = drawable;
        r();
    }

    public void setThumbIconResource(int i10) {
        setThumbIconDrawable(k.a.b(getContext(), i10));
    }

    public void setThumbIconSize(int i10) {
        if (this.W != i10) {
            this.W = i10;
            r();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f8095d0 = colorStateList;
        r();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f8096e0 = mode;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8094c0 = colorStateList;
        r();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        r();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f8093b0 = drawable;
        s();
    }

    public void setTrackDecorationResource(int i10) {
        setTrackDecorationDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f8098g0 = colorStateList;
        s();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f8099h0 = mode;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.f8092a0 = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8097f0 = colorStateList;
        s();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        s();
    }

    public final void u() {
        if (this.f8094c0 == null && this.f8095d0 == null && this.f8097f0 == null && this.f8098g0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f8094c0;
        if (colorStateList != null) {
            t(this.U, colorStateList, this.f8100i0, this.f8101j0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f8095d0;
        if (colorStateList2 != null) {
            t(this.V, colorStateList2, this.f8100i0, this.f8101j0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f8097f0;
        if (colorStateList3 != null) {
            t(this.f8092a0, colorStateList3, this.f8100i0, this.f8101j0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f8098g0;
        if (colorStateList4 != null) {
            t(this.f8093b0, colorStateList4, this.f8100i0, this.f8101j0, thumbPosition);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.materialswitch.MaterialSwitch.f8090k0
            android.content.Context r8 = md.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            r8 = -1
            r7.W = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r1 = super.getThumbDrawable()
            r7.U = r1
            android.content.res.ColorStateList r1 = super.getThumbTintList()
            r7.f8094c0 = r1
            r1 = 0
            super.setThumbTintList(r1)
            android.graphics.drawable.Drawable r2 = super.getTrackDrawable()
            r7.f8092a0 = r2
            android.content.res.ColorStateList r2 = super.getTrackTintList()
            r7.f8097f0 = r2
            super.setTrackTintList(r1)
            int[] r2 = ic.k.f20653i4
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            q.a1 r9 = ad.o.j(r0, r1, r2, r3, r4, r5)
            int r10 = ic.k.f20662j4
            android.graphics.drawable.Drawable r10 = r9.g(r10)
            r7.V = r10
            int r10 = ic.k.f20671k4
            int r10 = r9.f(r10, r8)
            r7.W = r10
            int r10 = ic.k.f20680l4
            android.content.res.ColorStateList r10 = r9.c(r10)
            r7.f8095d0 = r10
            int r10 = ic.k.f20689m4
            int r10 = r9.k(r10, r8)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = ad.r.i(r10, r0)
            r7.f8096e0 = r10
            int r10 = ic.k.f20698n4
            android.graphics.drawable.Drawable r10 = r9.g(r10)
            r7.f8093b0 = r10
            int r10 = ic.k.f20707o4
            android.content.res.ColorStateList r10 = r9.c(r10)
            r7.f8098g0 = r10
            int r10 = ic.k.f20716p4
            int r8 = r9.k(r10, r8)
            android.graphics.PorterDuff$Mode r8 = ad.r.i(r8, r0)
            r7.f8099h0 = r8
            r9.x()
            r7.setEnforceSwitchWidth(r6)
            r7.r()
            r7.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
