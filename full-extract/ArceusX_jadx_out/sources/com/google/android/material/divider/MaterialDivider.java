package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import hd.g;
import ic.b;
import ic.j;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7973f = j.f20573z;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final g f7974a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f7975c;

    /* renamed from: d, reason: collision with root package name */
    public int f7976d;

    /* renamed from: e, reason: collision with root package name */
    public int f7977e;

    public MaterialDivider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.C);
    }

    public int getDividerColor() {
        return this.f7975c;
    }

    public int getDividerInsetEnd() {
        return this.f7977e;
    }

    public int getDividerInsetStart() {
        return this.f7976d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = o0.z(this) == 1;
        int i11 = z10 ? this.f7977e : this.f7976d;
        if (z10) {
            width = getWidth();
            i10 = this.f7976d;
        } else {
            width = getWidth();
            i10 = this.f7977e;
        }
        this.f7974a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f7974a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f7975c != i10) {
            this.f7975c = i10;
            this.f7974a.a0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(l2.b.c(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f7977e = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f7976d = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.b != i10) {
            this.b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.f7973f
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            hd.g r7 = new hd.g
            r7.<init>()
            r6.f7974a = r7
            int[] r2 = ic.k.X3
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r9 = ic.k.f20588b4
            android.content.res.Resources r1 = r6.getResources()
            int r2 = ic.d.f20465z
            int r1 = r1.getDimensionPixelSize(r2)
            int r9 = r8.getDimensionPixelSize(r9, r1)
            r6.b = r9
            int r9 = ic.k.f20579a4
            int r9 = r8.getDimensionPixelOffset(r9, r7)
            r6.f7976d = r9
            int r9 = ic.k.Z3
            int r7 = r8.getDimensionPixelOffset(r9, r7)
            r6.f7977e = r7
            int r7 = ic.k.Y3
            android.content.res.ColorStateList r7 = ed.c.a(r0, r8, r7)
            int r7 = r7.getDefaultColor()
            r6.setDividerColor(r7)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
