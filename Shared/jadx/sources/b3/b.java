package b3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: l, reason: collision with root package name */
    public static final Interpolator f3710l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    public static final Interpolator f3711m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);

    /* renamed from: n, reason: collision with root package name */
    public static final Interpolator f3712n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final Interpolator f3713o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f3714a;
    public final a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public Insets f3715c;

    /* renamed from: d, reason: collision with root package name */
    public Insets f3716d;

    /* renamed from: e, reason: collision with root package name */
    public float f3717e;

    /* renamed from: f, reason: collision with root package name */
    public float f3718f;

    /* renamed from: g, reason: collision with root package name */
    public float f3719g;

    /* renamed from: h, reason: collision with root package name */
    public float f3720h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3721i;

    /* renamed from: j, reason: collision with root package name */
    public ValueAnimator f3722j;

    /* renamed from: k, reason: collision with root package name */
    public ValueAnimator f3723k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3724a = -1;
        public int b = -1;

        /* renamed from: c, reason: collision with root package name */
        public Insets f3725c = Insets.NONE;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3726d = false;

        /* renamed from: e, reason: collision with root package name */
        public Drawable f3727e = null;

        /* renamed from: f, reason: collision with root package name */
        public float f3728f = 0.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f3729g = 0.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f3730h = 1.0f;

        /* renamed from: i, reason: collision with root package name */
        public InterfaceC0069a f3731i;

        /* renamed from: b3.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0069a {
            default void a(int i10) {
            }

            default void b(boolean z10) {
            }

            default void c(Insets insets) {
            }

            default void d(float f10) {
            }

            default void e(int i10) {
            }

            default void f(float f10) {
            }

            default void g(float f10) {
            }

            default void h(Drawable drawable) {
            }
        }

        public final void A(int i10) {
            if (this.f3724a != i10) {
                this.f3724a = i10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.e(i10);
                }
            }
        }

        public float k() {
            return this.f3730h;
        }

        public Drawable l() {
            return this.f3727e;
        }

        public int m() {
            return this.b;
        }

        public Insets n() {
            return this.f3725c;
        }

        public float o() {
            return this.f3728f;
        }

        public float p() {
            return this.f3729g;
        }

        public int q() {
            return this.f3724a;
        }

        public boolean r() {
            return this.f3726d;
        }

        public final void s(float f10) {
            if (this.f3730h != f10) {
                this.f3730h = f10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.d(f10);
                }
            }
        }

        public void t(InterfaceC0069a interfaceC0069a) {
            if (this.f3731i != null && interfaceC0069a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.f3731i = interfaceC0069a;
        }

        public final void u(Drawable drawable) {
            this.f3727e = drawable;
            InterfaceC0069a interfaceC0069a = this.f3731i;
            if (interfaceC0069a != null) {
                interfaceC0069a.h(drawable);
            }
        }

        public final void v(int i10) {
            if (this.b != i10) {
                this.b = i10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.a(i10);
                }
            }
        }

        public final void w(Insets insets) {
            if (this.f3725c.equals(insets)) {
                return;
            }
            this.f3725c = insets;
            InterfaceC0069a interfaceC0069a = this.f3731i;
            if (interfaceC0069a != null) {
                interfaceC0069a.c(insets);
            }
        }

        public final void x(float f10) {
            if (this.f3728f != f10) {
                this.f3728f = f10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.f(f10);
                }
            }
        }

        public final void y(float f10) {
            if (this.f3729g != f10) {
                this.f3729g = f10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.g(f10);
                }
            }
        }

        public final void z(boolean z10) {
            if (this.f3726d != z10) {
                this.f3726d = z10;
                InterfaceC0069a interfaceC0069a = this.f3731i;
                if (interfaceC0069a != null) {
                    interfaceC0069a.b(z10);
                }
            }
        }
    }

    public b(int i10) {
        Insets insets = Insets.NONE;
        this.f3715c = insets;
        this.f3716d = insets;
        this.f3717e = 1.0f;
        this.f3718f = 1.0f;
        this.f3719g = 1.0f;
        this.f3720h = 1.0f;
        this.f3721i = null;
        this.f3722j = null;
        this.f3723k = null;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            this.f3714a = i10;
            return;
        }
        throw new IllegalArgumentException("Unexpected side: " + i10);
    }

    public void a(int i10) {
    }

    public Insets b(Insets insets, Insets insets2, Insets insets3) {
        this.f3715c = insets;
        this.f3716d = insets2;
        this.b.w(insets3);
        return o();
    }

    public a c() {
        return this.b;
    }

    public Object d() {
        return this.f3721i;
    }

    public int e() {
        return this.f3714a;
    }

    public int f(int i10) {
        return i10;
    }

    public boolean g() {
        return false;
    }

    public void h(Object obj) {
        this.f3721i = obj;
    }

    public void i(Drawable drawable) {
        this.b.u(drawable);
    }

    public void j(float f10) {
        this.f3717e = f10;
        m();
    }

    public void k(float f10) {
        this.f3719g = f10;
        n();
    }

    public void l(boolean z10) {
        this.b.z(z10);
    }

    public final void m() {
        this.b.s(this.f3717e * this.f3718f);
    }

    public final void n() {
        float f10 = this.f3720h * this.f3719g;
        int i10 = this.f3714a;
        if (i10 == 1) {
            this.b.x((-(1.0f - f10)) * r1.f3724a);
            return;
        }
        if (i10 == 2) {
            this.b.y((-(1.0f - f10)) * r1.b);
        } else if (i10 == 4) {
            this.b.x((1.0f - f10) * r1.f3724a);
        } else {
            if (i10 != 8) {
                return;
            }
            this.b.y((1.0f - f10) * r1.b);
        }
    }

    public Insets o() {
        int i10;
        Insets insets = Insets.NONE;
        int i11 = this.f3714a;
        if (i11 == 1) {
            i10 = this.f3715c.left;
            this.b.A(f(this.f3716d.left));
            if (g()) {
                insets = Insets.of(f(i10), 0, 0, 0);
            }
        } else if (i11 == 2) {
            i10 = this.f3715c.top;
            this.b.v(f(this.f3716d.top));
            if (g()) {
                insets = Insets.of(0, f(i10), 0, 0);
            }
        } else if (i11 == 4) {
            i10 = this.f3715c.right;
            this.b.A(f(this.f3716d.right));
            if (g()) {
                insets = Insets.of(0, 0, f(i10), 0);
            }
        } else if (i11 != 8) {
            i10 = 0;
        } else {
            i10 = this.f3715c.bottom;
            this.b.v(f(this.f3716d.bottom));
            if (g()) {
                insets = Insets.of(0, 0, 0, f(i10));
            }
        }
        l(i10 > 0);
        j(i10 > 0 ? 1.0f : 0.0f);
        k(i10 > 0 ? 1.0f : 0.0f);
        return insets;
    }
}
