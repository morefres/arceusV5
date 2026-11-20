package kc;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.k;
import androidx.core.view.o0;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b extends c<View> {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f22492d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f22493e;

    /* renamed from: f, reason: collision with root package name */
    public int f22494f;

    /* renamed from: g, reason: collision with root package name */
    public int f22495g;

    public b() {
        this.f22492d = new Rect();
        this.f22493e = new Rect();
        this.f22494f = 0;
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // kc.c
    public void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        View L = L(coordinatorLayout.r(view));
        if (L == null) {
            super.J(coordinatorLayout, view, i10);
            this.f22494f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f22492d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, L.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && o0.w(coordinatorLayout) && !o0.w(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f22493e;
        k.a(R(fVar.f1574c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int M = M(L);
        view.layout(rect2.left, rect2.top - M, rect2.right, rect2.bottom - M);
        this.f22494f = rect2.top - L.getBottom();
    }

    public abstract View L(List<View> list);

    public final int M(View view) {
        if (this.f22495g == 0) {
            return 0;
        }
        float N = N(view);
        int i10 = this.f22495g;
        return s2.a.c((int) (N * i10), 0, i10);
    }

    public float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.f22495g;
    }

    public int P(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public final int Q() {
        return this.f22494f;
    }

    public final void S(int i10) {
        this.f22495g = i10;
    }

    public boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        View L;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (L = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (o0.w(L) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int P = size + P(L);
        int measuredHeight = L.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            P -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(P, i14 == -1 ? 1073741824 : EditorInfoCompat.IME_FLAG_FORCE_ASCII), i13);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22492d = new Rect();
        this.f22493e = new Rect();
        this.f22494f = 0;
    }
}
