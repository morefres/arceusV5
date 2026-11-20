package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.i;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1431a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Context f1432c;

    /* renamed from: d, reason: collision with root package name */
    public i f1433d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1434e;

    /* renamed from: f, reason: collision with root package name */
    public String f1435f;

    /* renamed from: g, reason: collision with root package name */
    public String f1436g;

    /* renamed from: h, reason: collision with root package name */
    public View[] f1437h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f1438i;

    public b(Context context) {
        super(context);
        this.f1431a = new int[32];
        this.f1434e = false;
        this.f1437h = null;
        this.f1438i = new HashMap<>();
        this.f1432c = context;
        m(null);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f1432c == null) {
            return;
        }
        String trim = str.trim();
        int k10 = k(trim);
        if (k10 != 0) {
            this.f1438i.put(Integer.valueOf(k10), trim);
            e(k10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.b + 1;
        int[] iArr = this.f1431a;
        if (i11 > iArr.length) {
            this.f1431a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1431a;
        int i12 = this.b;
        iArr2[i12] = i10;
        this.b = i12 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.f1432c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f1363c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1431a, this.b);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.b; i10++) {
            View q10 = constraintLayout.q(this.f1431a[i10]);
            if (q10 != null) {
                q10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    q10.setTranslationZ(q10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1432c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object l10 = constraintLayout.l(0, str);
            if (l10 instanceof Integer) {
                i10 = ((Integer) l10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = g2.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f1432c.getResources().getIdentifier(str, "id", this.f1432c.getPackageName()) : i10;
    }

    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1437h;
        if (viewArr == null || viewArr.length != this.b) {
            this.f1437h = new View[this.b];
        }
        for (int i10 = 0; i10 < this.b; i10++) {
            this.f1437h[i10] = constraintLayout.q(this.f1431a[i10]);
        }
        return this.f1437h;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g2.d.f18233o1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1435f = string;
                    setIds(string);
                } else if (index == g2.d.f18242p1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1436g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(c2.e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1435f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1436g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1434e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int j10;
        if (isInEditMode()) {
            setIds(this.f1435f);
        }
        i iVar = this.f1433d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i10 = 0; i10 < this.b; i10++) {
            int i11 = this.f1431a[i10];
            View q10 = constraintLayout.q(i11);
            if (q10 == null && (j10 = j(constraintLayout, (str = this.f1438i.get(Integer.valueOf(i11))))) != 0) {
                this.f1431a[i10] = j10;
                this.f1438i.put(Integer.valueOf(j10), str);
                q10 = constraintLayout.q(j10);
            }
            if (q10 != null) {
                this.f1433d.a(constraintLayout.r(q10));
            }
        }
        this.f1433d.b(constraintLayout.f1336c);
    }

    public void s() {
        if (this.f1433d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1401v0 = (c2.e) this.f1433d;
        }
    }

    public void setIds(String str) {
        this.f1435f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1436g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1435f = null;
        this.b = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1435f == null) {
            e(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1431a = new int[32];
        this.f1434e = false;
        this.f1437h = null;
        this.f1438i = new HashMap<>();
        this.f1432c = context;
        m(attributeSet);
    }
}
