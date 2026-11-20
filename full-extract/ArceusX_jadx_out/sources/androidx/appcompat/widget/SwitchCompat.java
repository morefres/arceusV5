package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.emoji2.text.c;
import d3.i;
import i.h;
import i.j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import q.a0;
import q.a1;
import q.g1;
import q.k0;
import q.n;
import q.v0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> S = new a(Float.class, "thumbPos");
    public static final int[] T = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final a0 O;

    @NonNull
    public n P;
    public b Q;
    public final Rect R;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1029a;
    public ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1031d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1032e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1033f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1034g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1035h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1036i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1037j;

    /* renamed from: k, reason: collision with root package name */
    public int f1038k;

    /* renamed from: l, reason: collision with root package name */
    public int f1039l;

    /* renamed from: m, reason: collision with root package name */
    public int f1040m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1041n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f1042o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1043p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1044q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1045r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1046s;

    /* renamed from: t, reason: collision with root package name */
    public int f1047t;

    /* renamed from: u, reason: collision with root package name */
    public int f1048u;

    /* renamed from: v, reason: collision with root package name */
    public float f1049v;

    /* renamed from: w, reason: collision with root package name */
    public float f1050w;

    /* renamed from: x, reason: collision with root package name */
    public VelocityTracker f1051x;

    /* renamed from: y, reason: collision with root package name */
    public int f1052y;

    /* renamed from: z, reason: collision with root package name */
    public float f1053z;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1053z);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public static class b extends c.f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference<SwitchCompat> f1054a;

        public b(SwitchCompat switchCompat) {
            this.f1054a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f1054a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            SwitchCompat switchCompat = this.f1054a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.N);
    }

    public static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    @NonNull
    private n getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new n(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.f1053z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((g1.b(this) ? 1.0f - this.f1053z : this.f1053z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1033f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1029a;
        Rect d10 = drawable2 != null ? k0.d(drawable2) : k0.f29329c;
        return ((((this.A - this.C) - rect.left) - rect.right) - d10.left) - d10.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1044q = charSequence;
        this.f1045r = g(charSequence);
        this.L = null;
        if (this.f1046s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1042o = charSequence;
        this.f1043p = g(charSequence);
        this.K = null;
        if (this.f1046s) {
            p();
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, S, z10 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.f1029a;
        if (drawable != null) {
            if (this.f1031d || this.f1032e) {
                Drawable mutate = q2.a.r(drawable).mutate();
                this.f1029a = mutate;
                if (this.f1031d) {
                    q2.a.o(mutate, this.b);
                }
                if (this.f1032e) {
                    q2.a.p(this.f1029a, this.f1030c);
                }
                if (this.f1029a.isStateful()) {
                    this.f1029a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f1033f;
        if (drawable != null) {
            if (this.f1036i || this.f1037j) {
                Drawable mutate = q2.a.r(drawable).mutate();
                this.f1033f = mutate;
                if (this.f1036i) {
                    q2.a.o(mutate, this.f1034g);
                }
                if (this.f1037j) {
                    q2.a.p(this.f1033f, this.f1035h);
                }
                if (this.f1033f.isStateful()) {
                    this.f1033f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.R;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1029a;
        Rect d10 = drawable != null ? k0.d(drawable) : k0.f29329c;
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f1033f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1033f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1029a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f1029a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                q2.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1029a;
        if (drawable != null) {
            q2.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null) {
            q2.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1029a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.M);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!g1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1040m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1040m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.u(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1046s;
    }

    public boolean getSplitTrack() {
        return this.f1041n;
    }

    public int getSwitchMinWidth() {
        return this.f1039l;
    }

    public int getSwitchPadding() {
        return this.f1040m;
    }

    public CharSequence getTextOff() {
        return this.f1044q;
    }

    public CharSequence getTextOn() {
        return this.f1042o;
    }

    public Drawable getThumbDrawable() {
        return this.f1029a;
    }

    public final float getThumbPosition() {
        return this.f1053z;
    }

    public int getThumbTextPadding() {
        return this.f1038k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1030c;
    }

    public Drawable getTrackDrawable() {
        return this.f1033f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1034g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1035h;
    }

    public final boolean h(float f10, float f11) {
        if (this.f1029a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1029a.getPadding(this.R);
        int i10 = this.E;
        int i11 = this.f1048u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        int i14 = this.C + i13;
        Rect rect = this.R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f1042o);
        setTextOffInternal(this.f1044q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1029a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1044q;
            if (charSequence == null) {
                charSequence = getResources().getString(h.f19913d);
            }
            o0.E0(this, charSequence);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1042o;
            if (charSequence == null) {
                charSequence = getResources().getString(h.f19914e);
            }
            o0.E0(this, charSequence);
        }
    }

    public void m(Context context, int i10) {
        a1 t8 = a1.t(context, i10, j.U2);
        ColorStateList c10 = t8.c(j.Y2);
        if (c10 != null) {
            this.J = c10;
        } else {
            this.J = getTextColors();
        }
        int f10 = t8.f(j.V2, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.I.getTextSize()) {
                this.I.setTextSize(f11);
                requestLayout();
            }
        }
        o(t8.k(j.W2, -1), t8.k(j.X2, -1));
        if (t8.a(j.f19948d3, false)) {
            this.M = new n.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f1042o);
        setTextOffInternal(this.f1044q);
        t8.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(defaultFromStyle);
            int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
            this.I.setFakeBoldText((i11 & 1) != 0);
            this.I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f1033f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1029a;
        if (drawable != null) {
            if (!this.f1041n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = k0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1042o : this.f1044q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f1029a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f1033f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = k0.d(this.f1029a);
            i14 = Math.max(0, d10.left - rect.left);
            i19 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (g1.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.A + i15) - i14) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i15 = (width - this.A) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i16 = this.B;
            i17 = paddingTop - (i16 / 2);
        } else {
            if (gravity == 80) {
                i18 = getHeight() - getPaddingBottom();
                i17 = i18 - this.B;
                this.D = i15;
                this.E = i17;
                this.G = i18;
                this.F = width;
            }
            i17 = getPaddingTop();
            i16 = this.B;
        }
        i18 = i16 + i17;
        this.D = i15;
        this.E = i17;
        this.G = i18;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1046s) {
            if (this.K == null) {
                this.K = i(this.f1043p);
            }
            if (this.L == null) {
                this.L = i(this.f1045r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f1029a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1029a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1029a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.C = Math.max(this.f1046s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1038k * 2) : 0, i12);
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f1033f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1029a;
        if (drawable3 != null) {
            Rect d10 = k0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = this.H ? Math.max(this.f1039l, (this.C * 2) + i15 + i16) : this.f1039l;
        int max2 = Math.max(i14, i13);
        this.A = max;
        this.B = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1042o : this.f1044q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1051x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1047t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1049v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = q.g1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f1053z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1053z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1049v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1049v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1048u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1050w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1048u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1047t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1049v = r0
            r6.f1050w = r3
            return r1
        L89:
            int r0 = r6.f1047t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1047t = r0
            android.view.VelocityTracker r0 = r6.f1051x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1047t = r1
            r6.f1049v = r0
            r6.f1050w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.Q == null && this.P.b() && androidx.emoji2.text.c.i()) {
            androidx.emoji2.text.c c10 = androidx.emoji2.text.c.c();
            int e10 = c10.e();
            if (e10 == 3 || e10 == 0) {
                b bVar = new b(this);
                this.Q = bVar;
                c10.t(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f1047t = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f1051x.computeCurrentVelocity(1000);
            float xVelocity = this.f1051x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1052y) {
                z10 = getTargetCheckedState();
            } else if (!g1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1042o);
        setTextOffInternal(this.f1044q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1046s != z10) {
            this.f1046s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1041n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1039l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1040m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1029a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1029a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1053z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(k.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1038k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f1031d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1030c = mode;
        this.f1032e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1033f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1033f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1034g = colorStateList;
        this.f1036i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1035h = mode;
        this.f1037j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1029a || drawable == this.f1033f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = null;
        this.f1030c = null;
        this.f1031d = false;
        this.f1032e = false;
        this.f1034g = null;
        this.f1035h = null;
        this.f1036i = false;
        this.f1037j = false;
        this.f1051x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        v0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        a1 v5 = a1.v(context, attributeSet, j.F2, i10, 0);
        o0.k0(this, context, j.F2, attributeSet, v5.r(), i10, 0);
        Drawable g10 = v5.g(j.I2);
        this.f1029a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v5.g(j.R2);
        this.f1033f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v5.p(j.G2));
        setTextOffInternal(v5.p(j.H2));
        this.f1046s = v5.a(j.J2, true);
        this.f1038k = v5.f(j.O2, 0);
        this.f1039l = v5.f(j.L2, 0);
        this.f1040m = v5.f(j.M2, 0);
        this.f1041n = v5.a(j.K2, false);
        ColorStateList c10 = v5.c(j.P2);
        if (c10 != null) {
            this.b = c10;
            this.f1031d = true;
        }
        PorterDuff.Mode e10 = k0.e(v5.k(j.Q2, -1), null);
        if (this.f1030c != e10) {
            this.f1030c = e10;
            this.f1032e = true;
        }
        if (this.f1031d || this.f1032e) {
            b();
        }
        ColorStateList c11 = v5.c(j.S2);
        if (c11 != null) {
            this.f1034g = c11;
            this.f1036i = true;
        }
        PorterDuff.Mode e11 = k0.e(v5.k(j.T2, -1), null);
        if (this.f1035h != e11) {
            this.f1035h = e11;
            this.f1037j = true;
        }
        if (this.f1036i || this.f1037j) {
            c();
        }
        int n10 = v5.n(j.N2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        a0 a0Var = new a0(this);
        this.O = a0Var;
        a0Var.m(attributeSet, i10);
        v5.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1048u = viewConfiguration.getScaledTouchSlop();
        this.f1052y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
