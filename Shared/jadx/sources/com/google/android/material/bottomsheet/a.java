package com.google.android.material.bottomsheet;

import ad.r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c1;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hd.g;
import ic.h;
import ic.j;
import j.l;
import y2.p;

/* loaded from: classes2.dex */
public class a extends l {

    /* renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f7687g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f7688h;

    /* renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f7689i;

    /* renamed from: j, reason: collision with root package name */
    public FrameLayout f7690j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7691k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7692l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7693m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7694n;

    /* renamed from: o, reason: collision with root package name */
    public f f7695o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7696p;

    /* renamed from: q, reason: collision with root package name */
    public cd.c f7697q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public BottomSheetBehavior.g f7698r;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0122a implements y {
        public C0122a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f7695o != null) {
                a.this.f7687g.F0(a.this.f7695o);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f7695o = new f(aVar.f7690j, windowInsetsCompat, null);
                a.this.f7695o.e(a.this.getWindow());
                a.this.f7687g.c0(a.this.f7695o);
            }
            return windowInsetsCompat;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f7692l && aVar.isShowing() && a.this.A()) {
                a.this.cancel();
            }
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            if (!a.this.f7692l) {
                pVar.q0(false);
            } else {
                pVar.a(1048576);
                pVar.q0(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f7692l) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f7704a;

        @NonNull
        public final WindowInsetsCompat b;

        /* renamed from: c, reason: collision with root package name */
        public Window f7705c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7706d;

        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0122a c0122a) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.b.getSystemWindowInsetTop()) {
                Window window = this.f7705c;
                if (window != null) {
                    Boolean bool = this.f7704a;
                    ad.d.f(window, bool == null ? this.f7706d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f7705c;
                if (window2 != null) {
                    ad.d.f(window2, this.f7706d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.f7705c == window) {
                return;
            }
            this.f7705c = window;
            if (window != null) {
                this.f7706d = c1.a(window, window.getDecorView()).b();
            }
        }

        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
            g t02 = BottomSheetBehavior.q0(view).t0();
            ColorStateList x10 = t02 != null ? t02.x() : o0.r(view);
            if (x10 != null) {
                this.f7704a = Boolean.valueOf(uc.a.h(x10.getDefaultColor()));
                return;
            }
            Integer e10 = r.e(view);
            if (e10 != null) {
                this.f7704a = Boolean.valueOf(uc.a.h(e10.intValue()));
            } else {
                this.f7704a = null;
            }
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, m(context, i10));
        this.f7692l = true;
        this.f7693m = true;
        this.f7698r = new e();
        o(1);
        this.f7696p = getContext().getTheme().obtainStyledAttributes(new int[]{ic.b.f20413t}).getBoolean(0, false);
    }

    public static int m(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(ic.b.b, typedValue, true) ? typedValue.resourceId : j.f20550c;
    }

    public boolean A() {
        if (!this.f7694n) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f7693m = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f7694n = true;
        }
        return this.f7693m;
    }

    public final void B() {
        cd.c cVar = this.f7697q;
        if (cVar == null) {
            return;
        }
        if (this.f7692l) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    public final View C(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        u();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7688h.findViewById(ic.f.f20481e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f7696p) {
            o0.A0(this.f7690j, new C0122a());
        }
        this.f7690j.removeAllViews();
        if (layoutParams == null) {
            this.f7690j.addView(view);
        } else {
            this.f7690j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ic.f.V).setOnClickListener(new b());
        o0.m0(this.f7690j, new c());
        this.f7690j.setOnTouchListener(new d());
        return this.f7688h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> v5 = v();
        if (!this.f7691k || v5.v0() == 5) {
            super.cancel();
        } else {
            v5.X0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f7696p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7688h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f7689i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            c1.b(window, !z10);
            f fVar = this.f7695o;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        B();
    }

    @Override // j.l, e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f7695o;
        if (fVar != null) {
            fVar.e(null);
        }
        cd.c cVar = this.f7697q;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // e.w, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7687g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.v0() != 5) {
            return;
        }
        this.f7687g.X0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f7692l != z10) {
            this.f7692l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7687g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z10);
            }
            if (getWindow() != null) {
                B();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f7692l) {
            this.f7692l = true;
        }
        this.f7693m = z10;
        this.f7694n = true;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(C(i10, null, null));
    }

    public final FrameLayout u() {
        if (this.f7688h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f20505a, null);
            this.f7688h = frameLayout;
            this.f7689i = (CoordinatorLayout) frameLayout.findViewById(ic.f.f20481e);
            FrameLayout frameLayout2 = (FrameLayout) this.f7688h.findViewById(ic.f.f20482f);
            this.f7690j = frameLayout2;
            BottomSheetBehavior<FrameLayout> q02 = BottomSheetBehavior.q0(frameLayout2);
            this.f7687g = q02;
            q02.c0(this.f7698r);
            this.f7687g.P0(this.f7692l);
            this.f7697q = new cd.c(this.f7687g, this.f7690j);
        }
        return this.f7688h;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> v() {
        if (this.f7687g == null) {
            u();
        }
        return this.f7687g;
    }

    public boolean x() {
        return this.f7691k;
    }

    public void y() {
        this.f7687g.F0(this.f7698r);
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(C(0, view, null));
    }

    @Override // j.l, e.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(C(0, view, layoutParams));
    }
}
