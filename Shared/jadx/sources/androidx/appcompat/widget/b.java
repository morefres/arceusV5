package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.o0;
import i.j;
import q.a1;
import q.g1;

/* loaded from: classes.dex */
public class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1115a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1116c;

    /* renamed from: d, reason: collision with root package name */
    public int f1117d;

    /* renamed from: e, reason: collision with root package name */
    public int f1118e;

    /* renamed from: f, reason: collision with root package name */
    public int f1119f;

    /* renamed from: g, reason: collision with root package name */
    public float f1120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1121h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1122i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1123j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f1124k;

    /* renamed from: l, reason: collision with root package name */
    public int f1125l;

    /* renamed from: m, reason: collision with root package name */
    public int f1126m;

    /* renamed from: n, reason: collision with root package name */
    public int f1127n;

    /* renamed from: o, reason: collision with root package name */
    public int f1128o;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public b(@NonNull Context context) {
        this(context, null);
    }

    private void j(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View q10 = q(i13);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = q10.getMeasuredHeight();
                    i12 = i11;
                    measureChildWithMargins(q10, makeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                    i13++;
                    i11 = i12;
                }
            }
            i12 = i11;
            i13++;
            i11 = i12;
        }
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean b = g1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View q10 = q(i11);
            if (q10 != null && q10.getVisibility() != 8 && r(i11)) {
                a aVar = (a) q10.getLayoutParams();
                h(canvas, b ? q10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (q10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1125l);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            if (q11 != null) {
                a aVar2 = (a) q11.getLayoutParams();
                if (b) {
                    left = q11.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f1125l;
                    right = left - i10;
                } else {
                    right = q11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f1125l;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    public void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View q10 = q(i10);
            if (q10 != null && q10.getVisibility() != 8 && r(i10)) {
                g(canvas, (q10.getTop() - ((LinearLayout.LayoutParams) ((a) q10.getLayoutParams())).topMargin) - this.f1126m);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            g(canvas, q11 == null ? (getHeight() - getPaddingBottom()) - this.f1126m : q11.getBottom() + ((LinearLayout.LayoutParams) ((a) q11.getLayoutParams())).bottomMargin);
        }
    }

    public void g(Canvas canvas, int i10) {
        this.f1124k.setBounds(getPaddingLeft() + this.f1128o, i10, (getWidth() - getPaddingRight()) - this.f1128o, this.f1126m + i10);
        this.f1124k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f1116c;
        if (this.f1117d == 1 && (i10 = this.f1118e & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1119f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1119f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.f1124k;
    }

    public int getDividerPadding() {
        return this.f1128o;
    }

    public int getDividerWidth() {
        return this.f1125l;
    }

    public int getGravity() {
        return this.f1118e;
    }

    public int getOrientation() {
        return this.f1117d;
    }

    public int getShowDividers() {
        return this.f1127n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1120g;
    }

    public void h(Canvas canvas, int i10) {
        this.f1124k.setBounds(i10, getPaddingTop() + this.f1128o, this.f1125l + i10, (getHeight() - getPaddingBottom()) - this.f1128o);
        this.f1124k.draw(canvas);
    }

    public final void i(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View q10 = q(i13);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = q10.getMeasuredWidth();
                    i12 = i11;
                    measureChildWithMargins(q10, i12, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                    i13++;
                    i11 = i12;
                }
            }
            i12 = i11;
            i13++;
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1117d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int n(View view, int i10) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f1124k == null) {
            return;
        }
        if (this.f1117d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1117d == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1117d == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    public int p(View view) {
        return 0;
    }

    public View q(int i10) {
        return getChildAt(i10);
    }

    public boolean r(int i10) {
        if (i10 == 0) {
            return (this.f1127n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1127n & 4) != 0;
        }
        if ((this.f1127n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1115a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1124k) {
            return;
        }
        this.f1124k = drawable;
        if (drawable != null) {
            this.f1125l = drawable.getIntrinsicWidth();
            this.f1126m = drawable.getIntrinsicHeight();
        } else {
            this.f1125l = 0;
            this.f1126m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1128o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1118e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1118e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i12 = this.f1118e;
        if ((8388615 & i12) != i11) {
            this.f1118e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1121h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1117d != i10) {
            this.f1117d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1127n) {
            requestLayout();
        }
        this.f1127n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1118e;
        if ((i12 & 112) != i11) {
            this.f1118e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1120g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f1118e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f1119f
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f1119f
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.q(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.w(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.b$a r10 = (androidx.appcompat.widget.b.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = r11.getLayoutDirection()
            int r3 = androidx.core.view.k.b(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.r(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f1126m
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.o(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.y(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.p(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.n(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.t(int, int, int, int):void");
    }

    public void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.v(int, int):void");
    }

    public int w(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.x(int, int):void");
    }

    public b(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1115a = true;
        this.b = -1;
        this.f1116c = 0;
        this.f1118e = 8388659;
        a1 v5 = a1.v(context, attributeSet, j.f19941c1, i10, 0);
        o0.k0(this, context, j.f19941c1, attributeSet, v5.r(), i10, 0);
        int k10 = v5.k(j.f19951e1, -1);
        if (k10 >= 0) {
            setOrientation(k10);
        }
        int k11 = v5.k(j.f19946d1, -1);
        if (k11 >= 0) {
            setGravity(k11);
        }
        boolean a10 = v5.a(j.f19956f1, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f1120g = v5.i(j.f19966h1, -1.0f);
        this.b = v5.k(j.f19961g1, -1);
        this.f1121h = v5.a(j.f19981k1, false);
        setDividerDrawable(v5.g(j.f19971i1));
        this.f1127n = v5.k(j.f19986l1, 0);
        this.f1128o = v5.f(j.f19976j1, 0);
        v5.x();
    }
}
