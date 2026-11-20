package q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f29402a;
    public y0 b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f29403c;

    /* renamed from: d, reason: collision with root package name */
    public y0 f29404d;

    /* renamed from: e, reason: collision with root package name */
    public int f29405e = 0;

    public p(@NonNull ImageView imageView) {
        this.f29402a = imageView;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29404d == null) {
            this.f29404d = new y0();
        }
        y0 y0Var = this.f29404d;
        y0Var.a();
        ColorStateList a10 = d3.f.a(this.f29402a);
        if (a10 != null) {
            y0Var.f29478d = true;
            y0Var.f29476a = a10;
        }
        PorterDuff.Mode b = d3.f.b(this.f29402a);
        if (b != null) {
            y0Var.f29477c = true;
            y0Var.b = b;
        }
        if (!y0Var.f29478d && !y0Var.f29477c) {
            return false;
        }
        k.i(drawable, y0Var, this.f29402a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f29402a.getDrawable() != null) {
            this.f29402a.getDrawable().setLevel(this.f29405e);
        }
    }

    public void c() {
        Drawable drawable = this.f29402a.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            y0 y0Var = this.f29403c;
            if (y0Var != null) {
                k.i(drawable, y0Var, this.f29402a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.b;
            if (y0Var2 != null) {
                k.i(drawable, y0Var2, this.f29402a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        y0 y0Var = this.f29403c;
        if (y0Var != null) {
            return y0Var.f29476a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        y0 y0Var = this.f29403c;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f29402a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        a1 v5 = a1.v(this.f29402a.getContext(), attributeSet, i.j.R, i10, 0);
        ImageView imageView = this.f29402a;
        androidx.core.view.o0.k0(imageView, imageView.getContext(), i.j.R, attributeSet, v5.r(), i10, 0);
        try {
            Drawable drawable = this.f29402a.getDrawable();
            if (drawable == null && (n10 = v5.n(i.j.S, -1)) != -1 && (drawable = k.a.b(this.f29402a.getContext(), n10)) != null) {
                this.f29402a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            if (v5.s(i.j.T)) {
                d3.f.c(this.f29402a, v5.c(i.j.T));
            }
            if (v5.s(i.j.U)) {
                d3.f.d(this.f29402a, k0.e(v5.k(i.j.U, -1), null));
            }
            v5.x();
        } catch (Throwable th2) {
            v5.x();
            throw th2;
        }
    }

    public void h(@NonNull Drawable drawable) {
        this.f29405e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b = k.a.b(this.f29402a.getContext(), i10);
            if (b != null) {
                k0.b(b);
            }
            this.f29402a.setImageDrawable(b);
        } else {
            this.f29402a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f29403c == null) {
            this.f29403c = new y0();
        }
        y0 y0Var = this.f29403c;
        y0Var.f29476a = colorStateList;
        y0Var.f29478d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f29403c == null) {
            this.f29403c = new y0();
        }
        y0 y0Var = this.f29403c;
        y0Var.b = mode;
        y0Var.f29477c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
