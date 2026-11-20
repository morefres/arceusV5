package com.google.android.material.chip;

import ad.m;
import ad.o;
import ad.r;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import ed.d;
import fd.b;
import hd.g;
import ic.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jc.h;

/* loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, m.b {
    public static final int[] J0 = {R.attr.state_enabled};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0;
    public float B;
    public int[] B0;
    public float C;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList D0;
    public float E;

    @NonNull
    public WeakReference<InterfaceC0125a> E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public int H0;
    public Drawable I;
    public boolean I0;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public h W;
    public h X;
    public float Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f7838a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f7839b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f7840c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f7841d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f7842e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f7843f0;

    /* renamed from: g0, reason: collision with root package name */
    @NonNull
    public final Context f7844g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f7845h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint f7846i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint.FontMetrics f7847j0;

    /* renamed from: k0, reason: collision with root package name */
    public final RectF f7848k0;

    /* renamed from: l0, reason: collision with root package name */
    public final PointF f7849l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Path f7850m0;

    /* renamed from: n0, reason: collision with root package name */
    @NonNull
    public final m f7851n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f7852o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f7853p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f7854q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f7855r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f7856s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f7857t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f7858u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f7859v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f7860w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorFilter f7861x0;

    /* renamed from: y0, reason: collision with root package name */
    public PorterDuffColorFilter f7862y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f7863z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f7864z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0125a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.C = -1.0f;
        this.f7845h0 = new Paint(1);
        this.f7847j0 = new Paint.FontMetrics();
        this.f7848k0 = new RectF();
        this.f7849l0 = new PointF();
        this.f7850m0 = new Path();
        this.f7860w0 = 255;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference<>(null);
        Q(context);
        this.f7844g0 = context;
        m mVar = new m(this);
        this.f7851n0 = mVar;
        this.G = "";
        mVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f7846i0 = null;
        int[] iArr = J0;
        setState(iArr);
        o2(iArr);
        this.G0 = true;
        if (b.f17154a) {
            K0.setTint(-1);
        }
    }

    public static boolean q1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean u1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean w1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    @NonNull
    public static a y0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.x1(attributeSet, i10, i11);
        return aVar;
    }

    public final void A0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f7845h0.setColor(this.f7853p0);
        this.f7845h0.setStyle(Paint.Style.FILL);
        this.f7845h0.setColorFilter(o1());
        this.f7848k0.set(rect);
        canvas.drawRoundRect(this.f7848k0, L0(), L0(), this.f7845h0);
    }

    public void A1(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            float p02 = p0();
            if (!z10 && this.f7858u0) {
                this.f7858u0 = false;
            }
            float p03 = p0();
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public void A2(int i10) {
        this.H0 = i10;
    }

    public final void B0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (R2()) {
            o0(rect, this.f7848k0);
            RectF rectF = this.f7848k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.I.setBounds(0, 0, (int) this.f7848k0.width(), (int) this.f7848k0.height());
            this.I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void B1(int i10) {
        A1(this.f7844g0.getResources().getBoolean(i10));
    }

    public void B2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            U2();
            onStateChange(getState());
        }
    }

    public final void C0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.f7845h0.setColor(this.f7855r0);
        this.f7845h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.f7845h0.setColorFilter(o1());
        }
        RectF rectF = this.f7848k0;
        float f10 = rect.left;
        float f11 = this.E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.f7848k0, f12, f12, this.f7845h0);
    }

    public void C1(Drawable drawable) {
        if (this.U != drawable) {
            float p02 = p0();
            this.U = drawable;
            float p03 = p0();
            T2(this.U);
            n0(this.U);
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public void C2(int i10) {
        B2(k.a.a(this.f7844g0, i10));
    }

    public final void D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f7845h0.setColor(this.f7852o0);
        this.f7845h0.setStyle(Paint.Style.FILL);
        this.f7848k0.set(rect);
        canvas.drawRoundRect(this.f7848k0, L0(), L0(), this.f7845h0);
    }

    public void D1(int i10) {
        C1(k.a.b(this.f7844g0, i10));
    }

    public void D2(boolean z10) {
        this.G0 = z10;
    }

    public final void E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (S2()) {
            r0(rect, this.f7848k0);
            RectF rectF = this.f7848k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.N.setBounds(0, 0, (int) this.f7848k0.width(), (int) this.f7848k0.height());
            if (b.f17154a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    public void E1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (x0()) {
                q2.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void E2(h hVar) {
        this.W = hVar;
    }

    public final void F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f7845h0.setColor(this.f7856s0);
        this.f7845h0.setStyle(Paint.Style.FILL);
        this.f7848k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.f7848k0, L0(), L0(), this.f7845h0);
        } else {
            h(new RectF(rect), this.f7850m0);
            super.p(canvas, this.f7845h0, this.f7850m0, u());
        }
    }

    public void F1(int i10) {
        E1(k.a.a(this.f7844g0, i10));
    }

    public void F2(int i10) {
        E2(h.c(this.f7844g0, i10));
    }

    public final void G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.f7846i0;
        if (paint != null) {
            paint.setColor(c.l(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.f7846i0);
            if (R2() || Q2()) {
                o0(rect, this.f7848k0);
                canvas.drawRect(this.f7848k0, this.f7846i0);
            }
            if (this.G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f7846i0);
            } else {
                canvas2 = canvas;
            }
            if (S2()) {
                r0(rect, this.f7848k0);
                canvas2.drawRect(this.f7848k0, this.f7846i0);
            }
            this.f7846i0.setColor(c.l(SupportMenu.CATEGORY_MASK, 127));
            q0(rect, this.f7848k0);
            canvas2.drawRect(this.f7848k0, this.f7846i0);
            this.f7846i0.setColor(c.l(-16711936, 127));
            s0(rect, this.f7848k0);
            canvas2.drawRect(this.f7848k0, this.f7846i0);
        }
    }

    public void G1(int i10) {
        H1(this.f7844g0.getResources().getBoolean(i10));
    }

    public void G2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f7851n0.k(true);
        invalidateSelf();
        y1();
    }

    public final void H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.G != null) {
            Paint.Align w02 = w0(rect, this.f7849l0);
            u0(rect, this.f7848k0);
            if (this.f7851n0.e() != null) {
                this.f7851n0.f().drawableState = getState();
                this.f7851n0.l(this.f7844g0);
            }
            this.f7851n0.f().setTextAlign(w02);
            int i10 = 0;
            boolean z10 = Math.round(this.f7851n0.g(k1().toString())) > Math.round(this.f7848k0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f7848k0);
            }
            CharSequence charSequence = this.G;
            if (z10 && this.F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f7851n0.f(), this.f7848k0.width(), this.F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f7849l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f7851n0.f());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void H1(boolean z10) {
        if (this.T != z10) {
            boolean Q2 = Q2();
            this.T = z10;
            boolean Q22 = Q2();
            if (Q2 != Q22) {
                if (Q22) {
                    n0(this.U);
                } else {
                    T2(this.U);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public void H2(d dVar) {
        this.f7851n0.j(dVar, this.f7844g0);
    }

    public Drawable I0() {
        return this.U;
    }

    public void I1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void I2(int i10) {
        H2(new d(this.f7844g0, i10));
    }

    public ColorStateList J0() {
        return this.V;
    }

    public void J1(int i10) {
        I1(k.a.a(this.f7844g0, i10));
    }

    public void J2(float f10) {
        if (this.f7840c0 != f10) {
            this.f7840c0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public ColorStateList K0() {
        return this.A;
    }

    @Deprecated
    public void K1(float f10) {
        if (this.C != f10) {
            this.C = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void K2(int i10) {
        J2(this.f7844g0.getResources().getDimension(i10));
    }

    public float L0() {
        return this.I0 ? J() : this.C;
    }

    @Deprecated
    public void L1(int i10) {
        K1(this.f7844g0.getResources().getDimension(i10));
    }

    public void L2(float f10) {
        d l12 = l1();
        if (l12 != null) {
            l12.l(f10);
            this.f7851n0.f().setTextSize(f10);
            a();
        }
    }

    public float M0() {
        return this.f7843f0;
    }

    public void M1(float f10) {
        if (this.f7843f0 != f10) {
            this.f7843f0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public void M2(float f10) {
        if (this.f7839b0 != f10) {
            this.f7839b0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public Drawable N0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return q2.a.q(drawable);
        }
        return null;
    }

    public void N1(int i10) {
        M1(this.f7844g0.getResources().getDimension(i10));
    }

    public void N2(int i10) {
        M2(this.f7844g0.getResources().getDimension(i10));
    }

    public float O0() {
        return this.K;
    }

    public void O1(Drawable drawable) {
        Drawable N0 = N0();
        if (N0 != drawable) {
            float p02 = p0();
            this.I = drawable != null ? q2.a.r(drawable).mutate() : null;
            float p03 = p0();
            T2(N0);
            if (R2()) {
                n0(this.I);
            }
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public void O2(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            U2();
            onStateChange(getState());
        }
    }

    public ColorStateList P0() {
        return this.J;
    }

    public void P1(int i10) {
        O1(k.a.b(this.f7844g0, i10));
    }

    public boolean P2() {
        return this.G0;
    }

    public float Q0() {
        return this.B;
    }

    public void Q1(float f10) {
        if (this.K != f10) {
            float p02 = p0();
            this.K = f10;
            float p03 = p0();
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public final boolean Q2() {
        return this.T && this.U != null && this.f7858u0;
    }

    public float R0() {
        return this.Y;
    }

    public void R1(int i10) {
        Q1(this.f7844g0.getResources().getDimension(i10));
    }

    public final boolean R2() {
        return this.H && this.I != null;
    }

    public ColorStateList S0() {
        return this.D;
    }

    public void S1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (R2()) {
                q2.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean S2() {
        return this.M && this.N != null;
    }

    public float T0() {
        return this.E;
    }

    public void T1(int i10) {
        S1(k.a.a(this.f7844g0, i10));
    }

    public final void T2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable U0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return q2.a.q(drawable);
        }
        return null;
    }

    public void U1(int i10) {
        V1(this.f7844g0.getResources().getBoolean(i10));
    }

    public final void U2() {
        this.D0 = this.C0 ? b.a(this.F) : null;
    }

    public CharSequence V0() {
        return this.R;
    }

    public void V1(boolean z10) {
        if (this.H != z10) {
            boolean R2 = R2();
            this.H = z10;
            boolean R22 = R2();
            if (R2 != R22) {
                if (R22) {
                    n0(this.I);
                } else {
                    T2(this.I);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public final void V2() {
        this.O = new RippleDrawable(b.a(i1()), this.N, K0);
    }

    public float W0() {
        return this.f7842e0;
    }

    public void W1(float f10) {
        if (this.B != f10) {
            this.B = f10;
            invalidateSelf();
            y1();
        }
    }

    public float X0() {
        return this.Q;
    }

    public void X1(int i10) {
        W1(this.f7844g0.getResources().getDimension(i10));
    }

    public float Y0() {
        return this.f7841d0;
    }

    public void Y1(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            y1();
        }
    }

    @NonNull
    public int[] Z0() {
        return this.B0;
    }

    public void Z1(int i10) {
        Y1(this.f7844g0.getResources().getDimension(i10));
    }

    @Override // ad.m.b
    public void a() {
        y1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.P;
    }

    public void a2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                i0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b1(@NonNull RectF rectF) {
        s0(getBounds(), rectF);
    }

    public void b2(int i10) {
        a2(k.a.a(this.f7844g0, i10));
    }

    public final float c1() {
        Drawable drawable = this.f7858u0 ? this.U : this.I;
        float f10 = this.K;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(r.d(this.f7844g0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    public void c2(float f10) {
        if (this.E != f10) {
            this.E = f10;
            this.f7845h0.setStrokeWidth(f10);
            if (this.I0) {
                super.j0(f10);
            }
            invalidateSelf();
        }
    }

    public final float d1() {
        Drawable drawable = this.f7858u0 ? this.U : this.I;
        float f10 = this.K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void d2(int i10) {
        c2(this.f7844g0.getResources().getDimension(i10));
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.f7860w0;
        if (i11 < 255) {
            canvas2 = canvas;
            i10 = oc.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            i10 = 0;
        }
        D0(canvas2, bounds);
        A0(canvas2, bounds);
        if (this.I0) {
            super.draw(canvas2);
        }
        C0(canvas2, bounds);
        F0(canvas2, bounds);
        B0(canvas2, bounds);
        z0(canvas2, bounds);
        if (this.G0) {
            H0(canvas2, bounds);
        }
        E0(canvas2, bounds);
        G0(canvas2, bounds);
        if (this.f7860w0 < 255) {
            canvas2.restoreToCount(i10);
        }
    }

    public TextUtils.TruncateAt e1() {
        return this.F0;
    }

    public final void e2(ColorStateList colorStateList) {
        if (this.f7863z != colorStateList) {
            this.f7863z = colorStateList;
            onStateChange(getState());
        }
    }

    public h f1() {
        return this.X;
    }

    public void f2(Drawable drawable) {
        Drawable U0 = U0();
        if (U0 != drawable) {
            float t02 = t0();
            this.N = drawable != null ? q2.a.r(drawable).mutate() : null;
            if (b.f17154a) {
                V2();
            }
            float t03 = t0();
            T2(U0);
            if (S2()) {
                n0(this.N);
            }
            invalidateSelf();
            if (t02 != t03) {
                y1();
            }
        }
    }

    public float g1() {
        return this.f7838a0;
    }

    public void g2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = w2.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7860w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7861x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + p0() + this.f7839b0 + this.f7851n0.g(k1().toString()) + this.f7840c0 + t0() + this.f7843f0), this.H0);
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.Z;
    }

    public void h2(float f10) {
        if (this.f7842e0 != f10) {
            this.f7842e0 = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public ColorStateList i1() {
        return this.F;
    }

    public void i2(int i10) {
        h2(this.f7844g0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (u1(this.f7863z) || u1(this.A) || u1(this.D)) {
            return true;
        }
        return (this.C0 && u1(this.D0)) || w1(this.f7851n0.e()) || x0() || v1(this.I) || v1(this.U) || u1(this.f7864z0);
    }

    public h j1() {
        return this.W;
    }

    public void j2(int i10) {
        f2(k.a.b(this.f7844g0, i10));
    }

    public CharSequence k1() {
        return this.G;
    }

    public void k2(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public d l1() {
        return this.f7851n0.e();
    }

    public void l2(int i10) {
        k2(this.f7844g0.getResources().getDimension(i10));
    }

    public float m1() {
        return this.f7840c0;
    }

    public void m2(float f10) {
        if (this.f7841d0 != f10) {
            this.f7841d0 = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public final void n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        q2.a.m(drawable, q2.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(Z0());
            }
            q2.a.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            q2.a.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float n1() {
        return this.f7839b0;
    }

    public void n2(int i10) {
        m2(this.f7844g0.getResources().getDimension(i10));
    }

    public final void o0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (R2() || Q2()) {
            float f10 = this.Y + this.Z;
            float d12 = d1();
            if (q2.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + d12;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - d12;
            }
            float c12 = c1();
            float exactCenterY = rect.exactCenterY() - (c12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + c12;
        }
    }

    public final ColorFilter o1() {
        ColorFilter colorFilter = this.f7861x0;
        return colorFilter != null ? colorFilter : this.f7862y0;
    }

    public boolean o2(@NonNull int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (S2()) {
            return z1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (R2()) {
            onLayoutDirectionChanged |= q2.a.m(this.I, i10);
        }
        if (Q2()) {
            onLayoutDirectionChanged |= q2.a.m(this.U, i10);
        }
        if (S2()) {
            onLayoutDirectionChanged |= q2.a.m(this.N, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (R2()) {
            onLevelChange |= this.I.setLevel(i10);
        }
        if (Q2()) {
            onLevelChange |= this.U.setLevel(i10);
        }
        if (S2()) {
            onLevelChange |= this.N.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // hd.g, android.graphics.drawable.Drawable, ad.m.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return z1(iArr, Z0());
    }

    public float p0() {
        if (R2() || Q2()) {
            return this.Z + d1() + this.f7838a0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.C0;
    }

    public void p2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (S2()) {
                q2.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void q0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (S2()) {
            float f10 = this.f7843f0 + this.f7842e0 + this.Q + this.f7841d0 + this.f7840c0;
            if (q2.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void q2(int i10) {
        p2(k.a.a(this.f7844g0, i10));
    }

    public final void r0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f10 = this.f7843f0 + this.f7842e0;
            if (q2.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.Q;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean r1() {
        return this.S;
    }

    public void r2(boolean z10) {
        if (this.M != z10) {
            boolean S2 = S2();
            this.M = z10;
            boolean S22 = S2();
            if (S2 != S22) {
                if (S22) {
                    n0(this.N);
                } else {
                    T2(this.N);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public final void s0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f10 = this.f7843f0 + this.f7842e0 + this.Q + this.f7841d0 + this.f7840c0;
            if (q2.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean s1() {
        return v1(this.N);
    }

    public void s2(InterfaceC0125a interfaceC0125a) {
        this.E0 = new WeakReference<>(interfaceC0125a);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f7860w0 != i10) {
            this.f7860w0 = i10;
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7861x0 != colorFilter) {
            this.f7861x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f7864z0 != colorStateList) {
            this.f7864z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.f7862y0 = wc.c.l(this, this.f7864z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (R2()) {
            visible |= this.I.setVisible(z10, z11);
        }
        if (Q2()) {
            visible |= this.U.setVisible(z10, z11);
        }
        if (S2()) {
            visible |= this.N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t0() {
        if (S2()) {
            return this.f7841d0 + this.Q + this.f7842e0;
        }
        return 0.0f;
    }

    public boolean t1() {
        return this.M;
    }

    public void t2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public final void u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float p02 = this.Y + p0() + this.f7839b0;
            float t02 = this.f7843f0 + t0() + this.f7840c0;
            if (q2.a.f(this) == 0) {
                rectF.left = rect.left + p02;
                rectF.right = rect.right - t02;
            } else {
                rectF.left = rect.left + t02;
                rectF.right = rect.right - p02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void u2(h hVar) {
        this.X = hVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v0() {
        this.f7851n0.f().getFontMetrics(this.f7847j0);
        Paint.FontMetrics fontMetrics = this.f7847j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void v2(int i10) {
        u2(h.c(this.f7844g0, i10));
    }

    @NonNull
    public Paint.Align w0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float p02 = this.Y + p0() + this.f7839b0;
            if (q2.a.f(this) == 0) {
                pointF.x = rect.left + p02;
            } else {
                pointF.x = rect.right - p02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - v0();
        }
        return align;
    }

    public void w2(float f10) {
        if (this.f7838a0 != f10) {
            float p02 = p0();
            this.f7838a0 = f10;
            float p03 = p0();
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public final boolean x0() {
        return this.T && this.U != null && this.S;
    }

    public final void x1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray i12 = o.i(this.f7844g0, attributeSet, k.f20703o0, i10, i11, new int[0]);
        this.I0 = i12.hasValue(k.Z0);
        e2(ed.c.a(this.f7844g0, i12, k.M0));
        I1(ed.c.a(this.f7844g0, i12, k.f20800z0));
        W1(i12.getDimension(k.H0, 0.0f));
        if (i12.hasValue(k.A0)) {
            K1(i12.getDimension(k.A0, 0.0f));
        }
        a2(ed.c.a(this.f7844g0, i12, k.K0));
        c2(i12.getDimension(k.L0, 0.0f));
        B2(ed.c.a(this.f7844g0, i12, k.Y0));
        G2(i12.getText(k.f20748t0));
        d f10 = ed.c.f(this.f7844g0, i12, k.f20712p0);
        f10.l(i12.getDimension(k.f20721q0, f10.j()));
        H2(f10);
        int i13 = i12.getInt(k.f20730r0, 0);
        if (i13 == 1) {
            t2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            t2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            t2(TextUtils.TruncateAt.END);
        }
        V1(i12.getBoolean(k.G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            V1(i12.getBoolean(k.D0, false));
        }
        O1(ed.c.d(this.f7844g0, i12, k.C0));
        if (i12.hasValue(k.F0)) {
            S1(ed.c.a(this.f7844g0, i12, k.F0));
        }
        Q1(i12.getDimension(k.E0, -1.0f));
        r2(i12.getBoolean(k.T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            r2(i12.getBoolean(k.O0, false));
        }
        f2(ed.c.d(this.f7844g0, i12, k.N0));
        p2(ed.c.a(this.f7844g0, i12, k.S0));
        k2(i12.getDimension(k.Q0, 0.0f));
        A1(i12.getBoolean(k.f20757u0, false));
        H1(i12.getBoolean(k.f20791y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            H1(i12.getBoolean(k.f20774w0, false));
        }
        C1(ed.c.d(this.f7844g0, i12, k.f20766v0));
        if (i12.hasValue(k.f20782x0)) {
            E1(ed.c.a(this.f7844g0, i12, k.f20782x0));
        }
        E2(h.b(this.f7844g0, i12, k.f20576a1));
        u2(h.b(this.f7844g0, i12, k.V0));
        Y1(i12.getDimension(k.J0, 0.0f));
        y2(i12.getDimension(k.X0, 0.0f));
        w2(i12.getDimension(k.W0, 0.0f));
        M2(i12.getDimension(k.f20595c1, 0.0f));
        J2(i12.getDimension(k.f20585b1, 0.0f));
        m2(i12.getDimension(k.R0, 0.0f));
        h2(i12.getDimension(k.P0, 0.0f));
        M1(i12.getDimension(k.B0, 0.0f));
        A2(i12.getDimensionPixelSize(k.f20739s0, Integer.MAX_VALUE));
        i12.recycle();
    }

    public void x2(int i10) {
        w2(this.f7844g0.getResources().getDimension(i10));
    }

    public void y1() {
        InterfaceC0125a interfaceC0125a = this.E0.get();
        if (interfaceC0125a != null) {
            interfaceC0125a.a();
        }
    }

    public void y2(float f10) {
        if (this.Z != f10) {
            float p02 = p0();
            this.Z = f10;
            float p03 = p0();
            invalidateSelf();
            if (p02 != p03) {
                y1();
            }
        }
    }

    public final void z0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (Q2()) {
            o0(rect, this.f7848k0);
            RectF rectF = this.f7848k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.U.setBounds(0, 0, (int) this.f7848k0.width(), (int) this.f7848k0.height());
            this.U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean z1(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f7863z;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f7852o0) : 0);
        boolean z11 = true;
        if (this.f7852o0 != l10) {
            this.f7852o0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7853p0) : 0);
        if (this.f7853p0 != l11) {
            this.f7853p0 = l11;
            onStateChange = true;
        }
        int i10 = uc.a.i(l10, l11);
        if ((this.f7854q0 != i10) | (x() == null)) {
            this.f7854q0 = i10;
            a0(ColorStateList.valueOf(i10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7855r0) : 0;
        if (this.f7855r0 != colorForState) {
            this.f7855r0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !b.b(iArr)) ? 0 : this.D0.getColorForState(iArr, this.f7856s0);
        if (this.f7856s0 != colorForState2) {
            this.f7856s0 = colorForState2;
            if (this.C0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f7851n0.e() == null || this.f7851n0.e().i() == null) ? 0 : this.f7851n0.e().i().getColorForState(iArr, this.f7857t0);
        if (this.f7857t0 != colorForState3) {
            this.f7857t0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = q1(getState(), R.attr.state_checked) && this.S;
        if (this.f7858u0 == z12 || this.U == null) {
            z10 = false;
        } else {
            float p02 = p0();
            this.f7858u0 = z12;
            if (p02 != p0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f7864z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7859v0) : 0;
        if (this.f7859v0 != colorForState4) {
            this.f7859v0 = colorForState4;
            this.f7862y0 = wc.c.l(this, this.f7864z0, this.A0);
        } else {
            z11 = onStateChange;
        }
        if (v1(this.I)) {
            z11 |= this.I.setState(iArr);
        }
        if (v1(this.U)) {
            z11 |= this.U.setState(iArr);
        }
        if (v1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.N.setState(iArr3);
        }
        if (b.f17154a && v1(this.O)) {
            z11 |= this.O.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            y1();
        }
        return z11;
    }

    public void z2(int i10) {
        y2(this.f7844g0.getResources().getDimension(i10));
    }
}
