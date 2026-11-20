package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import hd.g;
import hd.k;
import hd.l;
import hd.n;
import ic.j;
import q.q;

/* loaded from: classes2.dex */
public class ShapeableImageView extends q implements n {

    /* renamed from: v, reason: collision with root package name */
    public static final int f8055v = j.B;

    /* renamed from: d, reason: collision with root package name */
    public final l f8056d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f8057e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f8058f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f8059g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f8060h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f8061i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8062j;

    /* renamed from: k, reason: collision with root package name */
    public g f8063k;

    /* renamed from: l, reason: collision with root package name */
    public k f8064l;

    /* renamed from: m, reason: collision with root package name */
    public float f8065m;

    /* renamed from: n, reason: collision with root package name */
    public Path f8066n;

    /* renamed from: o, reason: collision with root package name */
    public int f8067o;

    /* renamed from: p, reason: collision with root package name */
    public int f8068p;

    /* renamed from: q, reason: collision with root package name */
    public int f8069q;

    /* renamed from: r, reason: collision with root package name */
    public int f8070r;

    /* renamed from: s, reason: collision with root package name */
    public int f8071s;

    /* renamed from: t, reason: collision with root package name */
    public int f8072t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8073u;

    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f8074a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f8064l == null) {
                return;
            }
            if (ShapeableImageView.this.f8063k == null) {
                ShapeableImageView.this.f8063k = new g(ShapeableImageView.this.f8064l);
            }
            ShapeableImageView.this.f8057e.round(this.f8074a);
            ShapeableImageView.this.f8063k.setBounds(this.f8074a);
            ShapeableImageView.this.f8063k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    public final void g(Canvas canvas) {
        if (this.f8062j == null) {
            return;
        }
        this.f8059g.setStrokeWidth(this.f8065m);
        int colorForState = this.f8062j.getColorForState(getDrawableState(), this.f8062j.getDefaultColor());
        if (this.f8065m <= 0.0f || colorForState == 0) {
            return;
        }
        this.f8059g.setColor(colorForState);
        canvas.drawPath(this.f8061i, this.f8059g);
    }

    public int getContentPaddingBottom() {
        return this.f8070r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f8072t;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f8067o : this.f8069q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8072t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8071s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8067o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f8071s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f8072t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f8069q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f8071s;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f8069q : this.f8067o;
    }

    public int getContentPaddingTop() {
        return this.f8068p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f8064l;
    }

    public ColorStateList getStrokeColor() {
        return this.f8062j;
    }

    public float getStrokeWidth() {
        return this.f8065m;
    }

    public final boolean h() {
        return (this.f8071s == Integer.MIN_VALUE && this.f8072t == Integer.MIN_VALUE) ? false : true;
    }

    public final void j(int i10, int i11) {
        this.f8057e.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f8056d.d(this.f8064l, 1.0f, this.f8057e, this.f8061i);
        this.f8066n.rewind();
        this.f8066n.addPath(this.f8061i);
        this.f8058f.set(0.0f, 0.0f, i10, i11);
        this.f8066n.addRect(this.f8058f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f8066n, this.f8060h);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f8073u && isLayoutDirectionResolved()) {
            this.f8073u = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f8064l = kVar;
        g gVar = this.f8063k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f8062j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f8065m != f10) {
            this.f8065m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f8055v
            android.content.Context r7 = md.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            hd.l r7 = hd.l.k()
            r6.f8056d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f8061i = r7
            r7 = 0
            r6.f8073u = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f8060h = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f8057e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f8058f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f8066n = r2
            int[] r2 = ic.k.f20753t5
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = ic.k.B5
            android.content.res.ColorStateList r4 = ed.c.a(r1, r2, r4)
            r6.f8062j = r4
            int r4 = ic.k.C5
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f8065m = r4
            int r4 = ic.k.f20762u5
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f8067o = r7
            r6.f8068p = r7
            r6.f8069q = r7
            r6.f8070r = r7
            int r4 = ic.k.f20787x5
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8067o = r4
            int r4 = ic.k.A5
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8068p = r4
            int r4 = ic.k.f20796y5
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f8069q = r4
            int r4 = ic.k.v5
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f8070r = r7
            int r7 = ic.k.f20805z5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f8071s = r7
            int r7 = ic.k.w5
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f8072t = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f8059g = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            hd.k$b r7 = hd.k.e(r1, r8, r9, r0)
            hd.k r7 = r7.m()
            r6.f8064l = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
