package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f1709a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f1710a;

        public a(View view) {
            this.f1710a = view;
        }

        @Override // androidx.core.view.i0.c
        public void a() {
            View view = this.f1710a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1710a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.i0.c
        public void b() {
            final View view = this.f1710a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f1710a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.h0
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public static class c {
        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }
    }

    public i0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1709a = new b(view);
        } else {
            this.f1709a = new a(view);
        }
    }

    public void a() {
        this.f1709a.a();
    }

    public void b() {
        this.f1709a.b();
    }

    public static class b extends a {
        public View b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f1711c;

        public b(View view) {
            super(view);
            this.b = view;
        }

        @Override // androidx.core.view.i0.a, androidx.core.view.i0.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f1711c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.j0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((r2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.i0.a, androidx.core.view.i0.c
        public void b() {
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f1711c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f1711c = windowInsetsController;
        }
    }

    @Deprecated
    public i0(WindowInsetsController windowInsetsController) {
        this.f1709a = new b(windowInsetsController);
    }
}
