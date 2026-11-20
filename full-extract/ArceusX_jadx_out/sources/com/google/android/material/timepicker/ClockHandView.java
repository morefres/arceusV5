package com.google.android.material.timepicker;

import ad.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.o0;
import cd.h;
import com.google.mlkit.common.MlKitException;
import ic.j;
import ic.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f8366a;
    public final TimeInterpolator b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f8367c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8368d;

    /* renamed from: e, reason: collision with root package name */
    public float f8369e;

    /* renamed from: f, reason: collision with root package name */
    public float f8370f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8371g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8372h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8373i;

    /* renamed from: j, reason: collision with root package name */
    public final List<b> f8374j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8375k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8376l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f8377m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f8378n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8379o;

    /* renamed from: p, reason: collision with root package name */
    public float f8380p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8381q;

    /* renamed from: r, reason: collision with root package name */
    public double f8382r;

    /* renamed from: s, reason: collision with root package name */
    public int f8383s;

    /* renamed from: t, reason: collision with root package name */
    public int f8384t;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.B);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.f8374j.add(bVar);
    }

    public final void c(float f10, float f11) {
        this.f8384t = bd.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + r.d(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float h10 = h(this.f8384t);
        float cos = (((float) Math.cos(this.f8382r)) * h10) + f10;
        float f11 = height;
        float sin = (h10 * ((float) Math.sin(this.f8382r))) + f11;
        this.f8377m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f8375k, this.f8377m);
        double sin2 = Math.sin(this.f8382r);
        double cos2 = Math.cos(this.f8382r);
        this.f8377m.setStrokeWidth(this.f8379o);
        canvas.drawLine(f10, f11, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.f8377m);
        canvas.drawCircle(f10, f11, this.f8376l, this.f8377m);
    }

    public RectF e() {
        return this.f8378n;
    }

    public final int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float g() {
        return this.f8380p;
    }

    public final int h(int i10) {
        return i10 == 2 ? Math.round(this.f8383s * 0.66f) : this.f8383s;
    }

    public int i() {
        return this.f8375k;
    }

    public final Pair<Float, Float> j(float f10) {
        float g10 = g();
        if (Math.abs(g10 - f10) > 180.0f) {
            if (g10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (g10 < 180.0f && f10 > 180.0f) {
                g10 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(g10), Float.valueOf(f10));
    }

    public final boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f8368d) {
            z13 = true;
        }
        n(f12, z13);
        return true;
    }

    public void l(int i10) {
        this.f8383s = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f8367c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair<Float, Float> j10 = j(f10);
        this.f8367c.setFloatValues(((Float) j10.first).floatValue(), ((Float) j10.second).floatValue());
        this.f8367c.setDuration(this.f8366a);
        this.f8367c.setInterpolator(this.b);
        this.f8367c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(ClockHandView.this, valueAnimator2);
            }
        });
        this.f8367c.addListener(new a());
        this.f8367c.start();
    }

    public final void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f8380p = f11;
        this.f8382r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h10 = h(this.f8384t);
        float cos = width + (((float) Math.cos(this.f8382r)) * h10);
        float sin = height + (h10 * ((float) Math.sin(this.f8382r)));
        RectF rectF = this.f8378n;
        int i10 = this.f8375k;
        rectF.set(cos - i10, sin - i10, cos + i10, sin + i10);
        Iterator<b> it = this.f8374j.iterator();
        while (it.hasNext()) {
            it.next().a(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f8367c.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8369e = x10;
            this.f8370f = y10;
            this.f8371g = true;
            this.f8381q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f8369e);
            int i11 = (int) (y10 - this.f8370f);
            this.f8371g = (i10 * i10) + (i11 * i11) > this.f8372h;
            z11 = this.f8381q;
            boolean z13 = actionMasked == 1;
            if (this.f8373i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f8381q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    public void p(boolean z10) {
        if (this.f8373i && !z10) {
            this.f8384t = 1;
        }
        this.f8373i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8367c = new ValueAnimator();
        this.f8374j = new ArrayList();
        Paint paint = new Paint();
        this.f8377m = paint;
        this.f8378n = new RectF();
        this.f8384t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f20677l1, i10, j.C);
        this.f8366a = h.f(context, ic.b.F, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.b = h.g(context, ic.b.P, jc.a.b);
        this.f8383s = obtainStyledAttributes.getDimensionPixelSize(k.f20695n1, 0);
        this.f8375k = obtainStyledAttributes.getDimensionPixelSize(k.f20704o1, 0);
        this.f8379o = getResources().getDimensionPixelSize(ic.d.f20463x);
        this.f8376l = r7.getDimensionPixelSize(ic.d.f20461v);
        int color = obtainStyledAttributes.getColor(k.f20686m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f8372h = ViewConfiguration.get(context).getScaledTouchSlop();
        o0.w0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
