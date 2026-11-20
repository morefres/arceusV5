package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import androidx.core.view.y0;
import i.f;
import i.g;
import i.j;
import q.a1;
import q.g1;

/* loaded from: classes.dex */
public class ActionBarContextView extends q.a {

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f856i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f857j;

    /* renamed from: k, reason: collision with root package name */
    public View f858k;

    /* renamed from: l, reason: collision with root package name */
    public View f859l;

    /* renamed from: m, reason: collision with root package name */
    public View f860m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f861n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f862o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f863p;

    /* renamed from: q, reason: collision with root package name */
    public int f864q;

    /* renamed from: r, reason: collision with root package name */
    public int f865r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f866s;

    /* renamed from: t, reason: collision with root package name */
    public int f867t;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.b f868a;

        public a(o.b bVar) {
            this.f868a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f868a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ y0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f858k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // q.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f857j;
    }

    public CharSequence getTitle() {
        return this.f856i;
    }

    public void h(o.b bVar) {
        View view = this.f858k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f867t, (ViewGroup) this, false);
            this.f858k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f858k);
        }
        View findViewById = this.f858k.findViewById(f.f19873i);
        this.f859l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        androidx.appcompat.widget.a aVar = this.f29220d;
        if (aVar != null) {
            aVar.z();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f29220d = aVar2;
        aVar2.K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f29220d, this.b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f29220d.p(this);
        this.f29219c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f29219c, layoutParams);
    }

    public final void i() {
        if (this.f861n == null) {
            LayoutInflater.from(getContext()).inflate(g.f19891a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f861n = linearLayout;
            this.f862o = (TextView) linearLayout.findViewById(f.f19869e);
            this.f863p = (TextView) this.f861n.findViewById(f.f19868d);
            if (this.f864q != 0) {
                this.f862o.setTextAppearance(getContext(), this.f864q);
            }
            if (this.f865r != 0) {
                this.f863p.setTextAppearance(getContext(), this.f865r);
            }
        }
        this.f862o.setText(this.f856i);
        this.f863p.setText(this.f857j);
        boolean isEmpty = TextUtils.isEmpty(this.f856i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f857j);
        this.f863p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f861n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f861n.getParent() == null) {
            addView(this.f861n);
        }
    }

    public boolean j() {
        return this.f866s;
    }

    public void k() {
        removeAllViews();
        this.f860m = null;
        this.f29219c = null;
        this.f29220d = null;
        View view = this.f859l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f29220d;
        if (aVar != null) {
            return aVar.L();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f29220d;
        if (aVar != null) {
            aVar.C();
            this.f29220d.D();
        }
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b = g1.b(this);
        int paddingRight = b ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f858k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f858k.getLayoutParams();
            int i14 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = q.a.d(paddingRight, i14, b);
            paddingRight = q.a.d(d10 + e(this.f858k, d10, paddingTop, paddingTop2, b), i15, b);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f861n;
        if (linearLayout != null && this.f860m == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f861n, i16, paddingTop, paddingTop2, b);
        }
        View view2 = this.f860m;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f29219c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f29221e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        View view = this.f858k;
        if (view != null) {
            int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f858k.getLayoutParams();
            paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f29219c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f29219c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f861n;
        if (linearLayout != null && this.f860m == null) {
            if (this.f866s) {
                this.f861n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f861n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f861n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f860m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f860m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f29221e > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // q.a
    public void setContentHeight(int i10) {
        this.f29221e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f860m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f860m = view;
        if (view != null && (linearLayout = this.f861n) != null) {
            removeView(linearLayout);
            this.f861n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f857j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f856i = charSequence;
        i();
        o0.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f866s) {
            requestLayout();
        }
        this.f866s = z10;
    }

    @Override // q.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f19807k);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1 v5 = a1.v(context, attributeSet, j.f20049y, i10, 0);
        setBackground(v5.g(j.f20054z));
        this.f864q = v5.n(j.D, 0);
        this.f865r = v5.n(j.C, 0);
        this.f29221e = v5.m(j.B, 0);
        this.f867t = v5.n(j.A, g.f19893d);
        v5.x();
    }
}
