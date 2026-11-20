package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public c f1540a;

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f1540a == null) {
            this.f1540a = new c();
        }
        this.f1540a.g(this);
        return this.f1540a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;

        /* renamed from: x0, reason: collision with root package name */
        public float f1541x0;

        /* renamed from: y0, reason: collision with root package name */
        public boolean f1542y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f1543z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1541x0 = 1.0f;
            this.f1542y0 = false;
            this.f1543z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1541x0 = 1.0f;
            this.f1542y0 = false;
            this.f1543z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g2.d.f18270s4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g2.d.f18278t4) {
                    this.f1541x0 = obtainStyledAttributes.getFloat(index, this.f1541x0);
                } else if (index == g2.d.E4) {
                    this.f1543z0 = obtainStyledAttributes.getFloat(index, this.f1543z0);
                    this.f1542y0 = true;
                } else if (index == g2.d.B4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == g2.d.C4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == g2.d.A4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == g2.d.f18316y4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == g2.d.f18324z4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == g2.d.f18286u4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == g2.d.f18294v4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == g2.d.f18301w4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == g2.d.f18308x4) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == g2.d.D4) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
