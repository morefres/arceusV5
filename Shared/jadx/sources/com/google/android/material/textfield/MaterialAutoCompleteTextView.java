package com.google.android.material.textfield;

import ad.h;
import ad.o;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ed.c;
import hd.g;
import ic.j;
import ic.k;
import java.util.List;
import q.d;
import q.o0;

/* loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends d {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final o0 f8260e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f8261f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f8262g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8263h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8264i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8265j;

    /* renamed from: k, reason: collision with root package name */
    public int f8266k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8267l;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.l(i10 < 0 ? materialAutoCompleteTextView.f8260e.u() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f8260e.x();
                    i10 = MaterialAutoCompleteTextView.this.f8260e.w();
                    j10 = MaterialAutoCompleteTextView.this.f8260e.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f8260e.o(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f8260e.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: a, reason: collision with root package name */
        public ColorStateList f8269a;
        public ColorStateList b;

        public b(@NonNull Context context, int i10, @NonNull String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f8267l.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f8267l.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{uc.a.i(MaterialAutoCompleteTextView.this.f8266k, colorForState), uc.a.i(MaterialAutoCompleteTextView.this.f8266k, colorForState2), MaterialAutoCompleteTextView.this.f8266k});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f8266k);
            if (this.b == null) {
                return colorDrawable;
            }
            q2.a.o(colorDrawable, this.f8269a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        public final boolean c() {
            return MaterialAutoCompleteTextView.this.f8266k != 0;
        }

        public final boolean d() {
            return MaterialAutoCompleteTextView.this.f8267l != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f8267l.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.b = e();
            this.f8269a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                androidx.core.view.o0.q0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic.b.f20386a);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f8260e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        return i() || h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f8265j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f10 = f();
        return (f10 == null || !f10.R()) ? super.getHint() : f10.getHint();
    }

    public float getPopupElevation() {
        return this.f8264i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f8266k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f8267l;
    }

    public final boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f8261f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f8261f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        AccessibilityManager accessibilityManager = this.f8261f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f8260e.w()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable g10 = this.f8260e.g();
        if (g10 != null) {
            g10.getPadding(this.f8262g);
            Rect rect = this.f8262g;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    public final void k() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.r0();
        }
    }

    public final <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.R() && super.getHint() == null && h.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8260e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f8260e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o0 o0Var = this.f8260e;
        if (o0Var != null) {
            o0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f8265j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).a0(this.f8265j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f8260e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f8266k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f8267l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f8260e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(md.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f8262g = new Rect();
        Context context2 = getContext();
        TypedArray i11 = o.i(context2, attributeSet, k.f20784x2, i10, j.f20552e, new int[0]);
        if (i11.hasValue(k.f20793y2) && i11.getInt(k.f20793y2, 0) == 0) {
            setKeyListener(null);
        }
        this.f8263h = i11.getResourceId(k.B2, ic.h.f20516m);
        this.f8264i = i11.getDimensionPixelOffset(k.f20802z2, ic.d.Z);
        if (i11.hasValue(k.A2)) {
            this.f8265j = ColorStateList.valueOf(i11.getColor(k.A2, 0));
        }
        this.f8266k = i11.getColor(k.C2, 0);
        this.f8267l = c.a(context2, i11, k.D2);
        this.f8261f = (AccessibilityManager) context2.getSystemService("accessibility");
        o0 o0Var = new o0(context2);
        this.f8260e = o0Var;
        o0Var.I(true);
        o0Var.C(this);
        o0Var.H(2);
        o0Var.m(getAdapter());
        o0Var.K(new a());
        if (i11.hasValue(k.E2)) {
            setSimpleItems(i11.getResourceId(k.E2, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f8263h, strArr));
    }
}
