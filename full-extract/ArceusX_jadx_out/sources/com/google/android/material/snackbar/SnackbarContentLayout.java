package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import cd.h;
import ic.b;
import ic.d;
import ic.f;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements jd.a {

    /* renamed from: a, reason: collision with root package name */
    public TextView f8249a;
    public Button b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f8250c;

    /* renamed from: d, reason: collision with root package name */
    public int f8251d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8250c = h.g(context, b.P, jc.a.b);
    }

    public static void d(@NonNull View view, int i10, int i11) {
        if (o0.T(view)) {
            o0.B0(view, o0.E(view), i10, o0.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    @Override // jd.a
    public void a(int i10, int i11) {
        this.f8249a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8249a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8250c).setStartDelay(j11).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f8250c).setStartDelay(j11).start();
        }
    }

    @Override // jd.a
    public void b(int i10, int i11) {
        this.f8249a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f8249a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8250c).setStartDelay(j11).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f8250c).setStartDelay(j11).start();
        }
    }

    public void c(float f10) {
        if (f10 != 1.0f) {
            this.b.setTextColor(uc.a.j(uc.a.d(this, b.f20408o), this.b.getCurrentTextColor(), f10));
        }
    }

    public final boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f8249a.getPaddingTop() == i11 && this.f8249a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f8249a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.f8249a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8249a = (TextView) findViewById(f.M);
        this.b = (Button) findViewById(f.L);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f20438f);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.f20436e);
        Layout layout = this.f8249a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f8251d <= 0 || this.b.getMeasuredWidth() <= this.f8251d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f8251d = i10;
    }
}
