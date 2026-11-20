package f2;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import f2.j;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.c {

    /* renamed from: j, reason: collision with root package name */
    public boolean f16679j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16680k;

    /* renamed from: l, reason: collision with root package name */
    public float f16681l;

    /* renamed from: m, reason: collision with root package name */
    public View[] f16682m;

    @Override // f2.j.c
    public void a(j jVar, int i10, int i11) {
    }

    @Override // f2.j.c
    public void b(j jVar, int i10) {
    }

    @Override // f2.j.c
    public void c(j jVar, int i10, int i11, float f10) {
    }

    public float getProgress() {
        return this.f16681l;
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g2.d.D6) {
                    this.f16679j = obtainStyledAttributes.getBoolean(index, this.f16679j);
                } else if (index == g2.d.C6) {
                    this.f16680k = obtainStyledAttributes.getBoolean(index, this.f16680k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f16681l = f10;
        int i10 = 0;
        if (this.b > 0) {
            this.f16682m = l((ConstraintLayout) getParent());
            while (i10 < this.b) {
                x(this.f16682m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f16680k;
    }

    public boolean v() {
        return this.f16679j;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
