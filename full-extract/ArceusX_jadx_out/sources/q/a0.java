package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import n2.h;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f29227a;
    public y0 b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f29228c;

    /* renamed from: d, reason: collision with root package name */
    public y0 f29229d;

    /* renamed from: e, reason: collision with root package name */
    public y0 f29230e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f29231f;

    /* renamed from: g, reason: collision with root package name */
    public y0 f29232g;

    /* renamed from: h, reason: collision with root package name */
    public y0 f29233h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final c0 f29234i;

    /* renamed from: j, reason: collision with root package name */
    public int f29235j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f29236k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f29237l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29238m;

    public class a extends h.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f29239a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f29240c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f29239a = i10;
            this.b = i11;
            this.f29240c = weakReference;
        }

        @Override // n2.h.f
        public void f(int i10) {
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f29239a) != -1) {
                typeface = e.a(typeface, i10, (this.b & 2) != 0);
            }
            a0.this.n(this.f29240c, typeface);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f29242a;
        public final /* synthetic */ Typeface b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29243c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f29242a = textView;
            this.b = typeface;
            this.f29243c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29242a.setTypeface(this.b, this.f29243c);
        }
    }

    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public a0(@NonNull TextView textView) {
        this.f29227a = textView;
        this.f29234i = new c0(textView);
    }

    public static y0 d(Context context, k kVar, int i10) {
        ColorStateList f10 = kVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        y0 y0Var = new y0();
        y0Var.f29478d = true;
        y0Var.f29476a = f10;
        return y0Var;
    }

    public void A(int i10, float f10) {
        if (g1.f29307c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f29234i.t(i10, f10);
    }

    public final void C(Context context, a1 a1Var) {
        String o8;
        this.f29235j = a1Var.k(i.j.X2, this.f29235j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = a1Var.k(i.j.f19934a3, -1);
            this.f29236k = k10;
            if (k10 != -1) {
                this.f29235j &= 2;
            }
        }
        if (!a1Var.s(i.j.Z2) && !a1Var.s(i.j.f19938b3)) {
            if (a1Var.s(i.j.W2)) {
                this.f29238m = false;
                int k11 = a1Var.k(i.j.W2, 1);
                if (k11 == 1) {
                    this.f29237l = Typeface.SANS_SERIF;
                    return;
                } else if (k11 == 2) {
                    this.f29237l = Typeface.SERIF;
                    return;
                } else {
                    if (k11 != 3) {
                        return;
                    }
                    this.f29237l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f29237l = null;
        int i11 = a1Var.s(i.j.f19938b3) ? i.j.f19938b3 : i.j.Z2;
        int i12 = this.f29236k;
        int i13 = this.f29235j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = a1Var.j(i11, this.f29235j, new a(i12, i13, new WeakReference(this.f29227a)));
                if (j10 != null) {
                    if (i10 < 28 || this.f29236k == -1) {
                        this.f29237l = j10;
                    } else {
                        this.f29237l = e.a(Typeface.create(j10, 0), this.f29236k, (this.f29235j & 2) != 0);
                    }
                }
                this.f29238m = this.f29237l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f29237l != null || (o8 = a1Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f29236k == -1) {
            this.f29237l = Typeface.create(o8, this.f29235j);
        } else {
            this.f29237l = e.a(Typeface.create(o8, 0), this.f29236k, (this.f29235j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        k.i(drawable, y0Var, this.f29227a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.f29228c != null || this.f29229d != null || this.f29230e != null) {
            Drawable[] compoundDrawables = this.f29227a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f29228c);
            a(compoundDrawables[2], this.f29229d);
            a(compoundDrawables[3], this.f29230e);
        }
        if (this.f29231f == null && this.f29232g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f29227a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f29231f);
        a(compoundDrawablesRelative[2], this.f29232g);
    }

    public void c() {
        this.f29234i.a();
    }

    public int e() {
        return this.f29234i.f();
    }

    public int f() {
        return this.f29234i.g();
    }

    public int g() {
        return this.f29234i.h();
    }

    public int[] h() {
        return this.f29234i.i();
    }

    public int i() {
        return this.f29234i.j();
    }

    public ColorStateList j() {
        y0 y0Var = this.f29233h;
        if (y0Var != null) {
            return y0Var.f29476a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        y0 y0Var = this.f29233h;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.f29234i.n();
    }

    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        int i11;
        float f10;
        Context context = this.f29227a.getContext();
        k b10 = k.b();
        a1 v5 = a1.v(context, attributeSet, i.j.f19931a0, i10, 0);
        TextView textView = this.f29227a;
        androidx.core.view.o0.k0(textView, textView.getContext(), i.j.f19931a0, attributeSet, v5.r(), i10, 0);
        int n10 = v5.n(i.j.f19935b0, -1);
        if (v5.s(i.j.f19950e0)) {
            this.b = d(context, b10, v5.n(i.j.f19950e0, 0));
        }
        if (v5.s(i.j.f19940c0)) {
            this.f29228c = d(context, b10, v5.n(i.j.f19940c0, 0));
        }
        if (v5.s(i.j.f19955f0)) {
            this.f29229d = d(context, b10, v5.n(i.j.f19955f0, 0));
        }
        if (v5.s(i.j.f19945d0)) {
            this.f29230e = d(context, b10, v5.n(i.j.f19945d0, 0));
        }
        if (v5.s(i.j.f19960g0)) {
            this.f29231f = d(context, b10, v5.n(i.j.f19960g0, 0));
        }
        if (v5.s(i.j.f19965h0)) {
            this.f29232g = d(context, b10, v5.n(i.j.f19965h0, 0));
        }
        v5.x();
        boolean z12 = this.f29227a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z13 = true;
        if (n10 != -1) {
            a1 t8 = a1.t(context, n10, i.j.U2);
            if (z12 || !t8.s(i.j.f19948d3)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = t8.a(i.j.f19948d3, false);
                z11 = true;
            }
            C(context, t8);
            str = t8.s(i.j.f19953e3) ? t8.o(i.j.f19953e3) : null;
            str2 = t8.s(i.j.f19943c3) ? t8.o(i.j.f19943c3) : null;
            t8.x();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        a1 v10 = a1.v(context, attributeSet, i.j.U2, i10, 0);
        if (z12 || !v10.s(i.j.f19948d3)) {
            z13 = z11;
        } else {
            z10 = v10.a(i.j.f19948d3, false);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (v10.s(i.j.f19953e3)) {
            str = v10.o(i.j.f19953e3);
        }
        if (v10.s(i.j.f19943c3)) {
            str2 = v10.o(i.j.f19943c3);
        }
        if (i12 >= 28 && v10.s(i.j.V2) && v10.f(i.j.V2, -1) == 0) {
            this.f29227a.setTextSize(0, 0.0f);
        }
        C(context, v10);
        v10.x();
        if (!z12 && z13) {
            s(z10);
        }
        Typeface typeface = this.f29237l;
        if (typeface != null) {
            if (this.f29236k == -1) {
                this.f29227a.setTypeface(typeface, this.f29235j);
            } else {
                this.f29227a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            d.d(this.f29227a, str2);
        }
        if (str != null) {
            c.b(this.f29227a, c.a(str));
        }
        this.f29234i.o(attributeSet, i10);
        if (g1.f29307c && this.f29234i.j() != 0) {
            int[] i13 = this.f29234i.i();
            if (i13.length > 0) {
                if (d.a(this.f29227a) != -1.0f) {
                    d.b(this.f29227a, this.f29234i.g(), this.f29234i.f(), this.f29234i.h(), 0);
                } else {
                    d.c(this.f29227a, i13, 0);
                }
            }
        }
        a1 u8 = a1.u(context, attributeSet, i.j.f19970i0);
        int n11 = u8.n(i.j.f20010q0, -1);
        Drawable c10 = n11 != -1 ? b10.c(context, n11) : null;
        int n12 = u8.n(i.j.f20035v0, -1);
        Drawable c11 = n12 != -1 ? b10.c(context, n12) : null;
        int n13 = u8.n(i.j.f20015r0, -1);
        Drawable c12 = n13 != -1 ? b10.c(context, n13) : null;
        int n14 = u8.n(i.j.f20000o0, -1);
        Drawable c13 = n14 != -1 ? b10.c(context, n14) : null;
        int n15 = u8.n(i.j.f20020s0, -1);
        Drawable c14 = n15 != -1 ? b10.c(context, n15) : null;
        int n16 = u8.n(i.j.f20005p0, -1);
        y(c10, c11, c12, c13, c14, n16 != -1 ? b10.c(context, n16) : null);
        if (u8.s(i.j.f20025t0)) {
            d3.i.k(this.f29227a, u8.c(i.j.f20025t0));
        }
        if (u8.s(i.j.f20030u0)) {
            d3.i.l(this.f29227a, k0.e(u8.k(i.j.f20030u0, -1), null));
        }
        int f11 = u8.f(i.j.f20045x0, -1);
        int f12 = u8.f(i.j.f20050y0, -1);
        if (u8.s(i.j.f20055z0)) {
            TypedValue w5 = u8.w(i.j.f20055z0);
            if (w5 == null || w5.type != 5) {
                f10 = u8.f(i.j.f20055z0, -1);
                i11 = -1;
            } else {
                i11 = x2.i.b(w5.data);
                f10 = TypedValue.complexToFloat(w5.data);
            }
        } else {
            i11 = -1;
            f10 = -1.0f;
        }
        u8.x();
        if (f11 != -1) {
            d3.i.n(this.f29227a, f11);
        }
        if (f12 != -1) {
            d3.i.o(this.f29227a, f12);
        }
        if (f10 != -1.0f) {
            if (i11 == -1) {
                d3.i.p(this.f29227a, (int) f10);
            } else {
                d3.i.q(this.f29227a, i11, f10);
            }
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f29238m) {
            this.f29237l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f29235j));
                } else {
                    textView.setTypeface(typeface, this.f29235j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (g1.f29307c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String o8;
        a1 t8 = a1.t(context, i10, i.j.U2);
        if (t8.s(i.j.f19948d3)) {
            s(t8.a(i.j.f19948d3, false));
        }
        if (t8.s(i.j.V2) && t8.f(i.j.V2, -1) == 0) {
            this.f29227a.setTextSize(0, 0.0f);
        }
        C(context, t8);
        if (t8.s(i.j.f19943c3) && (o8 = t8.o(i.j.f19943c3)) != null) {
            d.d(this.f29227a, o8);
        }
        t8.x();
        Typeface typeface = this.f29237l;
        if (typeface != null) {
            this.f29227a.setTypeface(typeface, this.f29235j);
        }
    }

    public void r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a3.a.e(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f29227a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f29234i.p(i10, i11, i12, i13);
    }

    public void u(@NonNull int[] iArr, int i10) {
        this.f29234i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f29234i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f29233h == null) {
            this.f29233h = new y0();
        }
        y0 y0Var = this.f29233h;
        y0Var.f29476a = colorStateList;
        y0Var.f29478d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f29233h == null) {
            this.f29233h = new y0();
        }
        y0 y0Var = this.f29233h;
        y0Var.b = mode;
        y0Var.f29477c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f29227a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f29227a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f29227a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f29227a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f29227a.getCompoundDrawables();
        TextView textView2 = this.f29227a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        y0 y0Var = this.f29233h;
        this.b = y0Var;
        this.f29228c = y0Var;
        this.f29229d = y0Var;
        this.f29230e = y0Var;
        this.f29231f = y0Var;
        this.f29232g = y0Var;
    }
}
