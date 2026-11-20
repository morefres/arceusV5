package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import d3.d;
import ic.b;
import ic.j;
import q.u;
import uc.a;

/* loaded from: classes2.dex */
public class MaterialRadioButton extends u {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8119g = j.f20569v;

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f8120h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f8121e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8122f;

    public MaterialRadioButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.T);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f8121e == null) {
            int d10 = a.d(this, b.f20397g);
            int d11 = a.d(this, b.f20403j);
            int d12 = a.d(this, b.f20408o);
            int[][] iArr = f8120h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = a.j(d12, d10, 1.0f);
            iArr2[1] = a.j(d12, d11, 0.54f);
            iArr2[2] = a.j(d12, d11, 0.38f);
            iArr2[3] = a.j(d12, d11, 0.38f);
            this.f8121e = new ColorStateList(iArr, iArr2);
        }
        return this.f8121e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8122f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f8122f = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f8119g
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = ic.k.f20598c4
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r9 = ic.k.f20608d4
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto L29
            int r9 = ic.k.f20608d4
            android.content.res.ColorStateList r9 = ed.c.a(r0, r8, r9)
            d3.d.d(r6, r9)
        L29:
            int r9 = ic.k.f20617e4
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f8122f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
