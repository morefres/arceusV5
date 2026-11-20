package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0509a f29218a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f29219c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.a f29220d;

    /* renamed from: e, reason: collision with root package name */
    public int f29221e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.core.view.y0 f29222f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29223g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29224h;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    public class C0509a implements androidx.core.view.z0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29225a = false;
        public int b;

        public C0509a() {
        }

        @Override // androidx.core.view.z0
        public void a(View view) {
            this.f29225a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f29225a) {
                return;
            }
            a aVar = a.this;
            aVar.f29222f = null;
            a.super.setVisibility(this.b);
        }

        @Override // androidx.core.view.z0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f29225a = false;
        }

        public C0509a d(androidx.core.view.y0 y0Var, int i10) {
            a.this.f29222f = y0Var;
            this.b = i10;
            return this;
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.y0 f(int i10, long j10) {
        androidx.core.view.y0 y0Var = this.f29222f;
        if (y0Var != null) {
            y0Var.c();
        }
        if (i10 != 0) {
            androidx.core.view.y0 b = androidx.core.view.o0.e(this).b(0.0f);
            b.e(j10);
            b.g(this.f29218a.d(b, i10));
            return b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.y0 b10 = androidx.core.view.o0.e(this).b(1.0f);
        b10.e(j10);
        b10.g(this.f29218a.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f29222f != null ? this.f29218a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f29221e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f19930a, i.a.f19799c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(i.j.f19974j, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f29220d;
        if (aVar != null) {
            aVar.G(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f29224h = false;
        }
        if (!this.f29224h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f29224h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f29224h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f29223g = false;
        }
        if (!this.f29223g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f29223g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f29223g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f29221e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.y0 y0Var = this.f29222f;
            if (y0Var != null) {
                y0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29218a = new C0509a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i.a.f19798a, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
