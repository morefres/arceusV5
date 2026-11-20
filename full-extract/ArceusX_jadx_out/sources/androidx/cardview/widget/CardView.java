package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import u1.d;
import v1.b;
import v1.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f1321h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    public static final c f1322i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1323a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public int f1324c;

    /* renamed from: d, reason: collision with root package name */
    public int f1325d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1326e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1327f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1328g;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f1329a;

        public a() {
        }

        @Override // v1.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1327f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1326e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // v1.b
        public void b(Drawable drawable) {
            this.f1329a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // v1.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // v1.b
        public Drawable d() {
            return this.f1329a;
        }

        @Override // v1.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // v1.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        v1.a aVar = new v1.a();
        f1322i = aVar;
        aVar.o();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u1.a.f32567a);
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f1326e.set(i10, i11, i12, i13);
        f1322i.l(this.f1328g);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f1322i.g(this.f1328g);
    }

    public float getCardElevation() {
        return f1322i.d(this.f1328g);
    }

    public int getContentPaddingBottom() {
        return this.f1326e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1326e.left;
    }

    public int getContentPaddingRight() {
        return this.f1326e.right;
    }

    public int getContentPaddingTop() {
        return this.f1326e.top;
    }

    public float getMaxCardElevation() {
        return f1322i.i(this.f1328g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return f1322i.a(this.f1328g);
    }

    public boolean getUseCompatPadding() {
        return this.f1323a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (f1322i instanceof v1.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.b(this.f1328g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.h(this.f1328g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1322i.c(this.f1328g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1322i.k(this.f1328g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1322i.f(this.f1328g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1325d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1324c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.b) {
            this.b = z10;
            f1322i.j(this.f1328g);
        }
    }

    public void setRadius(float f10) {
        f1322i.n(this.f1328g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1323a != z10) {
            this.f1323a = z10;
            f1322i.m(this.f1328g);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1326e = rect;
        this.f1327f = new Rect();
        a aVar = new a();
        this.f1328g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f32570a, i10, u1.c.f32569a);
        if (obtainStyledAttributes.hasValue(d.f32572d)) {
            valueOf = obtainStyledAttributes.getColorStateList(d.f32572d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1321h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(u1.b.b) : getResources().getColor(u1.b.f32568a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(d.f32573e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(d.f32574f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(d.f32575g, 0.0f);
        this.f1323a = obtainStyledAttributes.getBoolean(d.f32577i, false);
        this.b = obtainStyledAttributes.getBoolean(d.f32576h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.f32578j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(d.f32580l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(d.f32582n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(d.f32581m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(d.f32579k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1324c = obtainStyledAttributes.getDimensionPixelSize(d.b, 0);
        this.f1325d = obtainStyledAttributes.getDimensionPixelSize(d.f32571c, 0);
        obtainStyledAttributes.recycle();
        f1322i.e(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1322i.c(this.f1328g, colorStateList);
    }
}
