package nc;

import ad.r;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.button.MaterialButton;
import ed.c;
import hd.g;
import hd.k;
import hd.n;
import ic.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f26937u = true;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f26938v = false;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f26939a;

    @NonNull
    public k b;

    /* renamed from: c, reason: collision with root package name */
    public int f26940c;

    /* renamed from: d, reason: collision with root package name */
    public int f26941d;

    /* renamed from: e, reason: collision with root package name */
    public int f26942e;

    /* renamed from: f, reason: collision with root package name */
    public int f26943f;

    /* renamed from: g, reason: collision with root package name */
    public int f26944g;

    /* renamed from: h, reason: collision with root package name */
    public int f26945h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f26946i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f26947j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f26948k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f26949l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f26950m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26954q;

    /* renamed from: s, reason: collision with root package name */
    public LayerDrawable f26956s;

    /* renamed from: t, reason: collision with root package name */
    public int f26957t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26951n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26952o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26953p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26955r = true;

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.f26939a = materialButton;
        this.b = kVar;
    }

    public void A(boolean z10) {
        this.f26951n = z10;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.f26948k != colorStateList) {
            this.f26948k = colorStateList;
            J();
        }
    }

    public void C(int i10) {
        if (this.f26945h != i10) {
            this.f26945h = i10;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.f26947j != colorStateList) {
            this.f26947j = colorStateList;
            if (f() != null) {
                q2.a.o(f(), this.f26947j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.f26946i != mode) {
            this.f26946i = mode;
            if (f() == null || this.f26946i == null) {
                return;
            }
            q2.a.p(f(), this.f26946i);
        }
    }

    public void F(boolean z10) {
        this.f26955r = z10;
    }

    public final void G(int i10, int i11) {
        int E = o0.E(this.f26939a);
        int paddingTop = this.f26939a.getPaddingTop();
        int D = o0.D(this.f26939a);
        int paddingBottom = this.f26939a.getPaddingBottom();
        int i12 = this.f26942e;
        int i13 = this.f26943f;
        this.f26943f = i11;
        this.f26942e = i10;
        if (!this.f26952o) {
            H();
        }
        o0.B0(this.f26939a, E, (paddingTop + i10) - i12, D, (paddingBottom + i11) - i13);
    }

    public final void H() {
        this.f26939a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.Z(this.f26957t);
            f10.setState(this.f26939a.getDrawableState());
        }
    }

    public final void I(@NonNull k kVar) {
        if (f26938v && !this.f26952o) {
            int E = o0.E(this.f26939a);
            int paddingTop = this.f26939a.getPaddingTop();
            int D = o0.D(this.f26939a);
            int paddingBottom = this.f26939a.getPaddingBottom();
            H();
            o0.B0(this.f26939a, E, paddingTop, D, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public final void J() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.h0(this.f26945h, this.f26948k);
            if (n10 != null) {
                n10.g0(this.f26945h, this.f26951n ? uc.a.d(this.f26939a, b.f20408o) : 0);
            }
        }
    }

    @NonNull
    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f26940c, this.f26942e, this.f26941d, this.f26943f);
    }

    public final Drawable a() {
        g gVar = new g(this.b);
        gVar.Q(this.f26939a.getContext());
        q2.a.o(gVar, this.f26947j);
        PorterDuff.Mode mode = this.f26946i;
        if (mode != null) {
            q2.a.p(gVar, mode);
        }
        gVar.h0(this.f26945h, this.f26948k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.g0(this.f26945h, this.f26951n ? uc.a.d(this.f26939a, b.f20408o) : 0);
        if (f26937u) {
            g gVar3 = new g(this.b);
            this.f26950m = gVar3;
            q2.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(fd.b.a(this.f26949l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f26950m);
            this.f26956s = rippleDrawable;
            return rippleDrawable;
        }
        fd.a aVar = new fd.a(this.b);
        this.f26950m = aVar;
        q2.a.o(aVar, fd.b.a(this.f26949l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f26950m});
        this.f26956s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.f26944g;
    }

    public int c() {
        return this.f26943f;
    }

    public int d() {
        return this.f26942e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f26956s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f26956s.getNumberOfLayers() > 2 ? (n) this.f26956s.getDrawable(2) : (n) this.f26956s.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f26956s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f26937u ? (g) ((LayerDrawable) ((InsetDrawable) this.f26956s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f26956s.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f26949l;
    }

    @NonNull
    public k i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.f26948k;
    }

    public int k() {
        return this.f26945h;
    }

    public ColorStateList l() {
        return this.f26947j;
    }

    public PorterDuff.Mode m() {
        return this.f26946i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f26952o;
    }

    public boolean p() {
        return this.f26954q;
    }

    public boolean q() {
        return this.f26955r;
    }

    public void r(@NonNull TypedArray typedArray) {
        this.f26940c = typedArray.getDimensionPixelOffset(ic.k.H2, 0);
        this.f26941d = typedArray.getDimensionPixelOffset(ic.k.I2, 0);
        this.f26942e = typedArray.getDimensionPixelOffset(ic.k.J2, 0);
        this.f26943f = typedArray.getDimensionPixelOffset(ic.k.K2, 0);
        if (typedArray.hasValue(ic.k.O2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(ic.k.O2, -1);
            this.f26944g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.f26953p = true;
        }
        this.f26945h = typedArray.getDimensionPixelSize(ic.k.Y2, 0);
        this.f26946i = r.i(typedArray.getInt(ic.k.N2, -1), PorterDuff.Mode.SRC_IN);
        this.f26947j = c.a(this.f26939a.getContext(), typedArray, ic.k.M2);
        this.f26948k = c.a(this.f26939a.getContext(), typedArray, ic.k.X2);
        this.f26949l = c.a(this.f26939a.getContext(), typedArray, ic.k.W2);
        this.f26954q = typedArray.getBoolean(ic.k.L2, false);
        this.f26957t = typedArray.getDimensionPixelSize(ic.k.P2, 0);
        this.f26955r = typedArray.getBoolean(ic.k.Z2, true);
        int E = o0.E(this.f26939a);
        int paddingTop = this.f26939a.getPaddingTop();
        int D = o0.D(this.f26939a);
        int paddingBottom = this.f26939a.getPaddingBottom();
        if (typedArray.hasValue(ic.k.G2)) {
            t();
        } else {
            H();
        }
        o0.B0(this.f26939a, E + this.f26940c, paddingTop + this.f26942e, D + this.f26941d, paddingBottom + this.f26943f);
    }

    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void t() {
        this.f26952o = true;
        this.f26939a.setSupportBackgroundTintList(this.f26947j);
        this.f26939a.setSupportBackgroundTintMode(this.f26946i);
    }

    public void u(boolean z10) {
        this.f26954q = z10;
    }

    public void v(int i10) {
        if (this.f26953p && this.f26944g == i10) {
            return;
        }
        this.f26944g = i10;
        this.f26953p = true;
        z(this.b.w(i10));
    }

    public void w(int i10) {
        G(this.f26942e, i10);
    }

    public void x(int i10) {
        G(i10, this.f26943f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.f26949l != colorStateList) {
            this.f26949l = colorStateList;
            boolean z10 = f26937u;
            if (z10 && (this.f26939a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f26939a.getBackground()).setColor(fd.b.a(colorStateList));
            } else {
                if (z10 || !(this.f26939a.getBackground() instanceof fd.a)) {
                    return;
                }
                ((fd.a) this.f26939a.getBackground()).setTintList(fd.b.a(colorStateList));
            }
        }
    }

    public void z(@NonNull k kVar) {
        this.b = kVar;
        I(kVar);
    }
}
