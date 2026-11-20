package com.google.android.material.checkbox;

import ad.r;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import d3.d;
import ic.f;
import ic.i;
import ic.j;
import ic.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.a1;
import q.g;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends g {
    public static final int[] A;
    public static final int[][] B;

    @SuppressLint({"DiscouragedApi"})
    public static final int C;

    /* renamed from: y, reason: collision with root package name */
    public static final int f7790y = j.f20568u;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f7791z = {ic.b.f20388b0};

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f7792e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f7793f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f7794g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7795h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7796i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7797j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f7798k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f7799l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f7800m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7801n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f7802o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f7803p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f7804q;

    /* renamed from: r, reason: collision with root package name */
    public int f7805r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f7806s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7807t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f7808u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7809v;

    /* renamed from: w, reason: collision with root package name */
    public final p5.c f7810w;

    /* renamed from: x, reason: collision with root package name */
    public final p5.b f7811x;

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f7812a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        public final String a() {
            int i10 = this.f7812a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f7812a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7812a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends p5.b {
        public a() {
        }

        @Override // p5.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f7802o;
            if (colorStateList != null) {
                q2.a.o(drawable, colorStateList);
            }
        }

        @Override // p5.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f7802o;
            if (colorStateList != null) {
                q2.a.n(drawable, colorStateList.getColorForState(materialCheckBox.f7806s, MaterialCheckBox.this.f7802o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = ic.b.f20387a0;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20391d);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f7805r;
        return i10 == 1 ? getResources().getString(i.f20533h) : i10 == 0 ? getResources().getString(i.f20535j) : getResources().getString(i.f20534i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7794g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int d10 = uc.a.d(this, ic.b.f20397g);
            int d11 = uc.a.d(this, ic.b.f20401i);
            int d12 = uc.a.d(this, ic.b.f20408o);
            int d13 = uc.a.d(this, ic.b.f20403j);
            iArr2[0] = uc.a.j(d12, d11, 1.0f);
            iArr2[1] = uc.a.j(d12, d10, 1.0f);
            iArr2[2] = uc.a.j(d12, d13, 0.54f);
            iArr2[3] = uc.a.j(d12, d13, 0.38f);
            iArr2[4] = uc.a.j(d12, d13, 0.38f);
            this.f7794g = new ColorStateList(iArr, iArr2);
        }
        return this.f7794g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7802o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void c(@NonNull b bVar) {
        this.f7793f.add(bVar);
    }

    public final boolean d(a1 a1Var) {
        return a1Var.n(k.M3, 0) == C && a1Var.n(k.N3, 0) == 0;
    }

    public boolean e() {
        return this.f7797j;
    }

    public final void f() {
        this.f7799l = wc.c.d(this.f7799l, this.f7802o, d.c(this));
        this.f7800m = wc.c.d(this.f7800m, this.f7803p, this.f7804q);
        h();
        i();
        super.setButtonDrawable(wc.c.a(this.f7799l, this.f7800m));
        refreshDrawableState();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f7808u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7799l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7800m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f7803p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f7804q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7802o;
    }

    public int getCheckedState() {
        return this.f7805r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7798k;
    }

    public final void h() {
        p5.c cVar;
        if (this.f7801n) {
            p5.c cVar2 = this.f7810w;
            if (cVar2 != null) {
                cVar2.f(this.f7811x);
                this.f7810w.b(this.f7811x);
            }
            Drawable drawable = this.f7799l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f7810w) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(f.b, f.W, cVar, false);
            ((AnimatedStateListDrawable) this.f7799l).addTransition(f.f20486j, f.W, this.f7810w, false);
        }
    }

    public final void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f7799l;
        if (drawable != null && (colorStateList2 = this.f7802o) != null) {
            q2.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f7800m;
        if (drawable2 == null || (colorStateList = this.f7803p) == null) {
            return;
        }
        q2.a.o(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f7805r == 1;
    }

    public final void j() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7795h && this.f7802o == null && this.f7803p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f7791z);
        }
        if (e()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        this.f7806s = wc.c.f(onCreateDrawableState);
        j();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f7796i || !TextUtils.isEmpty(getText()) || (a10 = d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (r.h(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            q2.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && e()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7798k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f7812a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7812a = getCheckedState();
        return savedState;
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7800m = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(k.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f7803p == colorStateList) {
            return;
        }
        this.f7803p = colorStateList;
        f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f7804q == mode) {
            return;
        }
        this.f7804q = mode;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7802o == colorStateList) {
            return;
        }
        this.f7802o = colorStateList;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f7796i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7805r != i10) {
            this.f7805r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            g();
            if (this.f7807t) {
                return;
            }
            this.f7807t = true;
            LinkedHashSet<b> linkedHashSet = this.f7793f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f7805r);
                }
            }
            if (this.f7805r != 2 && (onCheckedChangeListener = this.f7809v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f7807t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7798k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f7797j == z10) {
            return;
        }
        this.f7797j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f7792e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f7797j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7809v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f7808u = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7795h = z10;
        if (z10) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f7790y
            android.content.Context r8 = md.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f7792e = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f7793f = r8
            android.content.Context r8 = r7.getContext()
            int r0 = ic.e.f20472h
            p5.c r8 = p5.c.a(r8, r0)
            r7.f7810w = r8
            com.google.android.material.checkbox.MaterialCheckBox$a r8 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r8.<init>()
            r7.f7811x = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = d3.d.a(r7)
            r7.f7799l = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.f7802o = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            int[] r2 = ic.k.L3
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            q.a1 r9 = ad.o.j(r0, r1, r2, r3, r4, r5)
            int r10 = ic.k.O3
            android.graphics.drawable.Drawable r10 = r9.g(r10)
            r7.f7800m = r10
            android.graphics.drawable.Drawable r10 = r7.f7799l
            r1 = 1
            if (r10 == 0) goto L7b
            boolean r10 = ad.o.g(r0)
            if (r10 == 0) goto L7b
            boolean r10 = r7.d(r9)
            if (r10 == 0) goto L7b
            super.setButtonDrawable(r8)
            int r8 = ic.e.f20471g
            android.graphics.drawable.Drawable r8 = k.a.b(r0, r8)
            r7.f7799l = r8
            r7.f7801n = r1
            android.graphics.drawable.Drawable r8 = r7.f7800m
            if (r8 != 0) goto L7b
            int r8 = ic.e.f20473i
            android.graphics.drawable.Drawable r8 = k.a.b(r0, r8)
            r7.f7800m = r8
        L7b:
            int r8 = ic.k.P3
            android.content.res.ColorStateList r8 = ed.c.b(r0, r9, r8)
            r7.f7803p = r8
            int r8 = ic.k.Q3
            r10 = -1
            int r8 = r9.k(r8, r10)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = ad.r.i(r8, r10)
            r7.f7804q = r8
            int r8 = ic.k.V3
            boolean r8 = r9.a(r8, r6)
            r7.f7795h = r8
            int r8 = ic.k.R3
            boolean r8 = r9.a(r8, r1)
            r7.f7796i = r8
            int r8 = ic.k.U3
            boolean r8 = r9.a(r8, r6)
            r7.f7797j = r8
            int r8 = ic.k.T3
            java.lang.CharSequence r8 = r9.p(r8)
            r7.f7798k = r8
            int r8 = ic.k.S3
            boolean r8 = r9.s(r8)
            if (r8 == 0) goto Lc3
            int r8 = ic.k.S3
            int r8 = r9.k(r8, r6)
            r7.setCheckedState(r8)
        Lc3:
            r9.x()
            r7.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // q.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7799l = drawable;
        this.f7801n = false;
        f();
    }
}
