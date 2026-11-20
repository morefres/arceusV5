package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f29295a;

    /* renamed from: d, reason: collision with root package name */
    public y0 f29297d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f29298e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f29299f;

    /* renamed from: c, reason: collision with root package name */
    public int f29296c = -1;
    public final k b = k.b();

    public e(@NonNull View view) {
        this.f29295a = view;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29299f == null) {
            this.f29299f = new y0();
        }
        y0 y0Var = this.f29299f;
        y0Var.a();
        ColorStateList r8 = androidx.core.view.o0.r(this.f29295a);
        if (r8 != null) {
            y0Var.f29478d = true;
            y0Var.f29476a = r8;
        }
        PorterDuff.Mode s8 = androidx.core.view.o0.s(this.f29295a);
        if (s8 != null) {
            y0Var.f29477c = true;
            y0Var.b = s8;
        }
        if (!y0Var.f29478d && !y0Var.f29477c) {
            return false;
        }
        k.i(drawable, y0Var, this.f29295a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f29295a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            y0 y0Var = this.f29298e;
            if (y0Var != null) {
                k.i(background, y0Var, this.f29295a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f29297d;
            if (y0Var2 != null) {
                k.i(background, y0Var2, this.f29295a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        y0 y0Var = this.f29298e;
        if (y0Var != null) {
            return y0Var.f29476a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        y0 y0Var = this.f29298e;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        a1 v5 = a1.v(this.f29295a.getContext(), attributeSet, i.j.M3, i10, 0);
        View view = this.f29295a;
        androidx.core.view.o0.k0(view, view.getContext(), i.j.M3, attributeSet, v5.r(), i10, 0);
        try {
            if (v5.s(i.j.N3)) {
                this.f29296c = v5.n(i.j.N3, -1);
                ColorStateList f10 = this.b.f(this.f29295a.getContext(), this.f29296c);
                if (f10 != null) {
                    h(f10);
                }
            }
            if (v5.s(i.j.O3)) {
                androidx.core.view.o0.r0(this.f29295a, v5.c(i.j.O3));
            }
            if (v5.s(i.j.P3)) {
                androidx.core.view.o0.s0(this.f29295a, k0.e(v5.k(i.j.P3, -1), null));
            }
            v5.x();
        } catch (Throwable th2) {
            v5.x();
            throw th2;
        }
    }

    public void f(Drawable drawable) {
        this.f29296c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f29296c = i10;
        k kVar = this.b;
        h(kVar != null ? kVar.f(this.f29295a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f29297d == null) {
                this.f29297d = new y0();
            }
            y0 y0Var = this.f29297d;
            y0Var.f29476a = colorStateList;
            y0Var.f29478d = true;
        } else {
            this.f29297d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f29298e == null) {
            this.f29298e = new y0();
        }
        y0 y0Var = this.f29298e;
        y0Var.f29476a = colorStateList;
        y0Var.f29478d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f29298e == null) {
            this.f29298e = new y0();
        }
        y0 y0Var = this.f29298e;
        y0Var.b = mode;
        y0Var.f29477c = true;
        b();
    }

    public final boolean k() {
        return this.f29297d != null;
    }
}
