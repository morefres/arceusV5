package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import dd.c;
import dd.e;
import dd.f;
import ic.b;
import ic.j;

/* loaded from: classes2.dex */
public class CircularProgressIndicator extends a<e> {

    /* renamed from: p, reason: collision with root package name */
    public static final int f8102p = j.f20567t;

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f20395f);
    }

    public int getIndicatorDirection() {
        return ((e) this.f8104a).f14527j;
    }

    public int getIndicatorInset() {
        return ((e) this.f8104a).f14526i;
    }

    public int getIndicatorSize() {
        return ((e) this.f8104a).f14525h;
    }

    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public final void s() {
        c cVar = new c((e) this.f8104a);
        setIndeterminateDrawable(dd.j.t(getContext(), (e) this.f8104a, cVar));
        setProgressDrawable(f.v(getContext(), (e) this.f8104a, cVar));
    }

    public void setIndicatorDirection(int i10) {
        ((e) this.f8104a).f14527j = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s8 = this.f8104a;
        if (((e) s8).f14526i != i10) {
            ((e) s8).f14526i = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s8 = this.f8104a;
        if (((e) s8).f14525h != max) {
            ((e) s8).f14525h = max;
            ((e) s8).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((e) this.f8104a).e();
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f8102p);
        s();
    }
}
