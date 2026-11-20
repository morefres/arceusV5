package com.google.android.material.chip;

import ad.o;
import ad.r;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.o0;
import com.google.android.material.chip.a;
import ed.d;
import ed.f;
import hd.k;
import hd.n;
import ic.i;
import ic.j;
import java.util.List;
import jc.h;
import q.g;
import y2.p;

/* loaded from: classes2.dex */
public class Chip extends g implements a.InterfaceC0125a, n, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final int f7813w = j.f20566s;

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f7814x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f7815y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f7816z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f7817e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f7818f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f7819g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f7820h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7821i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7822j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7823k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7824l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7825m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7826n;

    /* renamed from: o, reason: collision with root package name */
    public int f7827o;

    /* renamed from: p, reason: collision with root package name */
    public int f7828p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f7829q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final c f7830r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7831s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f7832t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f7833u;

    /* renamed from: v, reason: collision with root package name */
    public final f f7834v;

    public class a extends f {
        public a() {
        }

        @Override // ed.f
        public void a(int i10) {
        }

        @Override // ed.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f7817e.P2() ? Chip.this.f7817e.k1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(MotionEventCompat.AXIS_WHEEL)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f7817e != null) {
                Chip.this.f7817e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends r3.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // r3.a
        public int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // r3.a
        public void C(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f7820h != null) {
                list.add(1);
            }
        }

        @Override // r3.a
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // r3.a
        public void M(@NonNull p pVar) {
            pVar.j0(Chip.this.r());
            pVar.m0(Chip.this.isClickable());
            pVar.l0(Chip.this.getAccessibilityClassName());
            pVar.K0(Chip.this.getText());
        }

        @Override // r3.a
        public void N(int i10, @NonNull p pVar) {
            if (i10 != 1) {
                pVar.p0("");
                pVar.g0(Chip.f7814x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                pVar.p0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                pVar.p0(Chip.this.getContext().getString(i.f20536k, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            pVar.g0(Chip.this.getCloseIconTouchBoundsInt());
            pVar.b(p.a.f36271i);
            pVar.r0(Chip.this.isEnabled());
        }

        @Override // r3.a
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f7825m = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20393e);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f7821i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f7833u.setEmpty();
        if (n() && this.f7820h != null) {
            this.f7817e.b1(this.f7833u);
        }
        return this.f7833u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7832t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7832t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f7824l != z10) {
            this.f7824l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f7823k != z10) {
            this.f7823k = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f7817e) == null) {
            return;
        }
        int M0 = (int) (aVar.M0() + this.f7817e.m1() + this.f7817e.t0());
        int R0 = (int) (this.f7817e.R0() + this.f7817e.n1() + this.f7817e.p0());
        if (this.f7818f != null) {
            Rect rect = new Rect();
            this.f7818f.getPadding(rect);
            R0 += rect.left;
            M0 += rect.right;
        }
        o0.B0(this, R0, getPaddingTop(), M0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f7834v);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0125a
    public void a() {
        l(this.f7828p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return !this.f7831s ? super.dispatchHoverEvent(motionEvent) : this.f7830r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7831s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f7830r.w(keyEvent) || this.f7830r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // q.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f7817e;
        if ((aVar == null || !aVar.s1()) ? false : this.f7817e.o2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f7829q)) {
            return this.f7829q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof rc.b) && ((rc.b) parent).f()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7818f;
        return insetDrawable == null ? this.f7817e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.L0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7817e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f7831s && (this.f7830r.A() == 1 || this.f7830r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f7817e.E();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public final void j(@NonNull com.google.android.material.chip.a aVar) {
        aVar.s2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] k() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f7825m) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f7824l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f7823k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f7825m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f7824l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f7823k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean l(int i10) {
        this.f7828p = i10;
        if (!v()) {
            if (this.f7818f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f7817e.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f7817e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f7818f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f7818f != null) {
            Rect rect = new Rect();
            this.f7818f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.f7818f && this.f7817e.getCallback() == null) {
            this.f7817e.setCallback(this.f7818f);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f7817e;
        return (aVar == null || aVar.U0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = o.i(context, attributeSet, ic.k.f20703o0, i10, f7813w, new int[0]);
        this.f7826n = i11.getBoolean(ic.k.U0, false);
        this.f7828p = (int) Math.ceil(i11.getDimension(ic.k.I0, (float) Math.ceil(r.d(getContext(), 48))));
        i11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hd.h.f(this, this.f7817e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7815y);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f7816z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f7831s) {
            this.f7830r.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof rc.b) {
            rc.b bVar = (rc.b) getParent();
            p.O0(accessibilityNodeInfo).o0(p.g.b(bVar.b(this), 1, bVar.c() ? bVar.d(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f7827o != i10) {
            this.f7827o = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f7823k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f7823k
            if (r0 == 0) goto L35
            r5.t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f7818f = new InsetDrawable((Drawable) this.f7817e, i10, i11, i12, i13);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f7817e;
        return aVar != null && aVar.r1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f7817e;
        return aVar != null && aVar.t1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f7829q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7819g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // q.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7819g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // q.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.A1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar == null) {
            this.f7822j = z10;
        } else if (aVar.r1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.C1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.E1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.I1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.K1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f7817e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f7817e = aVar;
            aVar.D2(false);
            j(this.f7817e);
            l(this.f7828p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.O1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.W1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.X1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.a2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.c2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.f2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.g2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.h2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.j2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.k2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.p2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // q.g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // q.g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.Z(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f7817e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.t2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f7826n = z10;
        l(this.f7828p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.u2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.w2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.y2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(ad.i<Chip> iVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f7817e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.A2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7821i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7820h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.B2(colorStateList);
        }
        if (this.f7817e.p1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.C2(i10);
            if (this.f7817e.p1()) {
                return;
            }
            z();
        }
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f7817e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.E2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.P2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f7817e;
        if (aVar2 != null) {
            aVar2.G2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.H2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.J2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.K2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.L2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.M2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.N2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f7820h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f7831s) {
            this.f7830r.U(1, 1);
        }
        return z10;
    }

    public final void u() {
        if (this.f7818f != null) {
            this.f7818f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f7826n;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.s2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f7820h != null) {
            o0.m0(this, this.f7830r);
            this.f7831s = true;
        } else {
            o0.m0(this, null);
            this.f7831s = false;
        }
    }

    public final void y() {
        if (fd.b.f17154a) {
            z();
            return;
        }
        this.f7817e.O2(true);
        o0.q0(this, getBackgroundDrawable());
        A();
        m();
    }

    public final void z() {
        this.f7819g = new RippleDrawable(fd.b.a(this.f7817e.i1()), getBackgroundDrawable(), null);
        this.f7817e.O2(false);
        o0.q0(this, this.f7819g);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f7813w
            android.content.Context r7 = md.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f7832t = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f7833u = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f7834v = r7
            android.content.Context r0 = r6.getContext()
            r6.C(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.y0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.o0.u(r6)
            r7.Z(r1)
            int[] r2 = ic.k.f20703o0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ad.o.i(r0, r1, r2, r3, r4, r5)
            int r9 = ic.k.Z0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f7830r = r8
            r6.x()
            if (r9 != 0) goto L59
            r6.p()
        L59:
            boolean r8 = r6.f7822j
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.k1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.e1()
            r6.setEllipsize(r7)
            r6.B()
            com.google.android.material.chip.a r7 = r6.f7817e
            boolean r7 = r7.P2()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.A()
            boolean r7 = r6.v()
            if (r7 == 0) goto L92
            int r7 = r6.f7828p
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.o0.z(r6)
            r6.f7827o = r7
            rc.a r7 = new rc.a
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.r2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.H1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.V1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.I2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f7817e;
        if (aVar != null) {
            aVar.I2(i10);
        }
        B();
    }
}
