package com.google.android.material.textfield;

import ad.n;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.core.view.o0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import ic.h;
import ic.i;
import ic.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kd.f;
import kd.g;
import kd.p;
import kd.r;
import kd.s;
import kd.u;
import kd.w;
import q.a1;
import q.b0;
import y2.c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8331a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8332c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f8333d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f8334e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f8335f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8336g;

    /* renamed from: h, reason: collision with root package name */
    public final d f8337h;

    /* renamed from: i, reason: collision with root package name */
    public int f8338i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f8339j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f8340k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f8341l;

    /* renamed from: m, reason: collision with root package name */
    public int f8342m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f8343n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f8344o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f8345p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f8346q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8347r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f8348s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f8349t;

    /* renamed from: u, reason: collision with root package name */
    public c.a f8350u;

    /* renamed from: v, reason: collision with root package name */
    public final TextWatcher f8351v;

    /* renamed from: w, reason: collision with root package name */
    public final TextInputLayout.f f8352w;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0130a extends n {
        public C0130a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // ad.n, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (a.this.f8348s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f8348s != null) {
                a.this.f8348s.removeTextChangedListener(a.this.f8351v);
                if (a.this.f8348s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f8348s.setOnFocusChangeListener(null);
                }
            }
            a.this.f8348s = textInputLayout.getEditText();
            if (a.this.f8348s != null) {
                a.this.f8348s.addTextChangedListener(a.this.f8351v);
            }
            a.this.m().n(a.this.f8348s);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<r> f8356a = new SparseArray<>();
        public final a b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8357c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8358d;

        public d(a aVar, a1 a1Var) {
            this.b = aVar;
            this.f8357c = a1Var.n(k.Y6, 0);
            this.f8358d = a1Var.n(k.f20780w7, 0);
        }

        public final r b(int i10) {
            if (i10 == -1) {
                return new g(this.b);
            }
            if (i10 == 0) {
                return new u(this.b);
            }
            if (i10 == 1) {
                return new w(this.b, this.f8358d);
            }
            if (i10 == 2) {
                return new f(this.b);
            }
            if (i10 == 3) {
                return new p(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        public r c(int i10) {
            r rVar = this.f8356a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r b = b(i10);
            this.f8356a.append(i10, b);
            return b;
        }
    }

    public a(TextInputLayout textInputLayout, a1 a1Var) {
        super(textInputLayout.getContext());
        this.f8338i = 0;
        this.f8339j = new LinkedHashSet<>();
        this.f8351v = new C0130a();
        b bVar = new b();
        this.f8352w = bVar;
        this.f8349t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8331a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, ic.f.O);
        this.f8332c = i10;
        CheckableImageButton i11 = i(frameLayout, from, ic.f.N);
        this.f8336g = i11;
        this.f8337h = new d(this, a1Var);
        b0 b0Var = new b0(getContext());
        this.f8346q = b0Var;
        C(a1Var);
        B(a1Var);
        D(a1Var);
        frameLayout.addView(i11);
        addView(b0Var);
        addView(frameLayout);
        addView(i10);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f8338i != 0;
    }

    public final void B(a1 a1Var) {
        if (!a1Var.s(k.f20789x7)) {
            if (a1Var.s(k.f20601c7)) {
                this.f8340k = ed.c.b(getContext(), a1Var, k.f20601c7);
            }
            if (a1Var.s(k.f20611d7)) {
                this.f8341l = ad.r.i(a1Var.k(k.f20611d7, -1), null);
            }
        }
        if (a1Var.s(k.f20582a7)) {
            U(a1Var.k(k.f20582a7, 0));
            if (a1Var.s(k.X6)) {
                Q(a1Var.p(k.X6));
            }
            O(a1Var.a(k.W6, true));
        } else if (a1Var.s(k.f20789x7)) {
            if (a1Var.s(k.f20798y7)) {
                this.f8340k = ed.c.b(getContext(), a1Var, k.f20798y7);
            }
            if (a1Var.s(k.f20807z7)) {
                this.f8341l = ad.r.i(a1Var.k(k.f20807z7, -1), null);
            }
            U(a1Var.a(k.f20789x7, false) ? 1 : 0);
            Q(a1Var.p(k.f20772v7));
        }
        T(a1Var.f(k.Z6, getResources().getDimensionPixelSize(ic.d.f20433c0)));
        if (a1Var.s(k.f20591b7)) {
            X(s.b(a1Var.k(k.f20591b7, -1)));
        }
    }

    public final void C(a1 a1Var) {
        if (a1Var.s(k.f20656i7)) {
            this.f8333d = ed.c.b(getContext(), a1Var, k.f20656i7);
        }
        if (a1Var.s(k.f20665j7)) {
            this.f8334e = ad.r.i(a1Var.k(k.f20665j7, -1), null);
        }
        if (a1Var.s(k.f20647h7)) {
            c0(a1Var.g(k.f20647h7));
        }
        this.f8332c.setContentDescription(getResources().getText(i.f20531f));
        o0.w0(this.f8332c, 2);
        this.f8332c.setClickable(false);
        this.f8332c.setPressable(false);
        this.f8332c.setFocusable(false);
    }

    public final void D(a1 a1Var) {
        this.f8346q.setVisibility(8);
        this.f8346q.setId(ic.f.U);
        this.f8346q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        o0.o0(this.f8346q, 1);
        q0(a1Var.n(k.O7, 0));
        if (a1Var.s(k.P7)) {
            r0(a1Var.c(k.P7));
        }
        p0(a1Var.p(k.N7));
    }

    public boolean E() {
        return A() && this.f8336g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.f8336g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f8332c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f8347r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f8331a.d0());
        }
    }

    public void J() {
        s.d(this.f8331a, this.f8336g, this.f8340k);
    }

    public void K() {
        s.d(this.f8331a, this.f8332c, this.f8333d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        r m10 = m();
        boolean z12 = true;
        if (!m10.l() || (isChecked = this.f8336g.isChecked()) == m10.m()) {
            z11 = false;
        } else {
            this.f8336g.setChecked(!isChecked);
            z11 = true;
        }
        if (!m10.j() || (isActivated = this.f8336g.isActivated()) == m10.k()) {
            z12 = z11;
        } else {
            N(!isActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        c.a aVar = this.f8350u;
        if (aVar == null || (accessibilityManager = this.f8349t) == null) {
            return;
        }
        y2.c.b(accessibilityManager, aVar);
    }

    public void N(boolean z10) {
        this.f8336g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f8336g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f8336g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f8336g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f8331a, this.f8336g, this.f8340k, this.f8341l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f8342m) {
            this.f8342m = i10;
            s.g(this.f8336g, i10);
            s.g(this.f8332c, i10);
        }
    }

    public void U(int i10) {
        if (this.f8338i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f8338i;
        this.f8338i = i10;
        j(i11);
        a0(i10 != 0);
        r m10 = m();
        R(t(m10));
        P(m10.c());
        O(m10.l());
        if (!m10.i(this.f8331a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8331a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(m10);
        V(m10.f());
        EditText editText = this.f8348s;
        if (editText != null) {
            m10.n(editText);
            h0(m10);
        }
        s.a(this.f8331a, this.f8336g, this.f8340k, this.f8341l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        s.h(this.f8336g, onClickListener, this.f8344o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f8344o = onLongClickListener;
        s.i(this.f8336g, onLongClickListener);
    }

    public void X(@NonNull ImageView.ScaleType scaleType) {
        this.f8343n = scaleType;
        s.j(this.f8336g, scaleType);
        s.j(this.f8332c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f8340k != colorStateList) {
            this.f8340k = colorStateList;
            s.a(this.f8331a, this.f8336g, colorStateList, this.f8341l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f8341l != mode) {
            this.f8341l = mode;
            s.a(this.f8331a, this.f8336g, this.f8340k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f8336g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f8331a.o0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? k.a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f8332c.setImageDrawable(drawable);
        w0();
        s.a(this.f8331a, this.f8332c, this.f8333d, this.f8334e);
    }

    public void d0(View.OnClickListener onClickListener) {
        s.h(this.f8332c, onClickListener, this.f8335f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f8335f = onLongClickListener;
        s.i(this.f8332c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f8333d != colorStateList) {
            this.f8333d = colorStateList;
            s.a(this.f8331a, this.f8332c, colorStateList, this.f8334e);
        }
    }

    public final void g() {
        if (this.f8350u == null || this.f8349t == null || !o0.Q(this)) {
            return;
        }
        y2.c.a(this.f8349t, this.f8350u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f8334e != mode) {
            this.f8334e = mode;
            s.a(this.f8331a, this.f8332c, this.f8333d, mode);
        }
    }

    public void h() {
        this.f8336g.performClick();
        this.f8336g.jumpDrawablesToCurrentState();
    }

    public final void h0(r rVar) {
        if (this.f8348s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f8348s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f8336g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(h.f20508e, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (ed.c.g(getContext())) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f8339j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f8331a, i10);
        }
    }

    public void j0(CharSequence charSequence) {
        this.f8336g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f8332c;
        }
        if (A() && F()) {
            return this.f8336g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f8336g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f8336g.setImageDrawable(drawable);
    }

    public r m() {
        return this.f8337h.c(this.f8338i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f8338i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f8336g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f8340k = colorStateList;
        s.a(this.f8331a, this.f8336g, colorStateList, this.f8341l);
    }

    public int o() {
        return this.f8342m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f8341l = mode;
        s.a(this.f8331a, this.f8336g, this.f8340k, mode);
    }

    public int p() {
        return this.f8338i;
    }

    public void p0(CharSequence charSequence) {
        this.f8345p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8346q.setText(charSequence);
        y0();
    }

    @NonNull
    public ImageView.ScaleType q() {
        return this.f8343n;
    }

    public void q0(int i10) {
        d3.i.s(this.f8346q, i10);
    }

    public CheckableImageButton r() {
        return this.f8336g;
    }

    public void r0(@NonNull ColorStateList colorStateList) {
        this.f8346q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f8332c.getDrawable();
    }

    public final void s0(@NonNull r rVar) {
        rVar.s();
        this.f8350u = rVar.h();
        g();
    }

    public final int t(r rVar) {
        int i10 = this.f8337h.f8357c;
        return i10 == 0 ? rVar.d() : i10;
    }

    public final void t0(@NonNull r rVar) {
        M();
        this.f8350u = null;
        rVar.u();
    }

    public CharSequence u() {
        return this.f8336g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f8331a, this.f8336g, this.f8340k, this.f8341l);
            return;
        }
        Drawable mutate = q2.a.r(n()).mutate();
        q2.a.n(mutate, this.f8331a.getErrorCurrentTextColors());
        this.f8336g.setImageDrawable(mutate);
    }

    public Drawable v() {
        return this.f8336g.getDrawable();
    }

    public final void v0() {
        this.b.setVisibility((this.f8336g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f8345p == null || this.f8347r) ? 8 : false)) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f8345p;
    }

    public final void w0() {
        this.f8332c.setVisibility(s() != null && this.f8331a.N() && this.f8331a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f8331a.o0();
    }

    public ColorStateList x() {
        return this.f8346q.getTextColors();
    }

    public void x0() {
        if (this.f8331a.f8278d == null) {
            return;
        }
        o0.B0(this.f8346q, getContext().getResources().getDimensionPixelSize(ic.d.K), this.f8331a.f8278d.getPaddingTop(), (F() || G()) ? 0 : o0.D(this.f8331a.f8278d), this.f8331a.f8278d.getPaddingBottom());
    }

    public int y() {
        return o0.D(this) + o0.D(this.f8346q) + ((F() || G()) ? this.f8336g.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) this.f8336g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.f8346q.getVisibility();
        int i10 = (this.f8345p == null || this.f8347r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f8346q.setVisibility(i10);
        this.f8331a.o0();
    }

    public TextView z() {
        return this.f8346q;
    }
}
