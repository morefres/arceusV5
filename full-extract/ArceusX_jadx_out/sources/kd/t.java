package kd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import q.b0;

/* loaded from: classes2.dex */
public final class t {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f22549a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22550c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22551d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22552e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22553f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f22554g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f22555h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f22556i;

    /* renamed from: j, reason: collision with root package name */
    public int f22557j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f22558k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f22559l;

    /* renamed from: m, reason: collision with root package name */
    public final float f22560m;

    /* renamed from: n, reason: collision with root package name */
    public int f22561n;

    /* renamed from: o, reason: collision with root package name */
    public int f22562o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f22563p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22564q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f22565r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f22566s;

    /* renamed from: t, reason: collision with root package name */
    public int f22567t;

    /* renamed from: u, reason: collision with root package name */
    public int f22568u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f22569v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f22570w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22571x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f22572y;

    /* renamed from: z, reason: collision with root package name */
    public int f22573z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f22574a;
        public final /* synthetic */ TextView b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22575c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f22576d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f22574a = i10;
            this.b = textView;
            this.f22575c = i11;
            this.f22576d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f22561n = this.f22574a;
            t.this.f22559l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f22575c == 1 && t.this.f22565r != null) {
                    t.this.f22565r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f22576d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f22576d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f22576d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f22576d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f22555h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f22554g = context;
        this.f22555h = textInputLayout;
        this.f22560m = context.getResources().getDimensionPixelSize(ic.d.f20440g);
        this.f22549a = cd.h.f(context, ic.b.M, 217);
        this.b = cd.h.f(context, ic.b.I, 167);
        this.f22550c = cd.h.f(context, ic.b.M, 167);
        this.f22551d = cd.h.g(context, ic.b.O, jc.a.f21661d);
        int i10 = ic.b.O;
        TimeInterpolator timeInterpolator = jc.a.f21659a;
        this.f22552e = cd.h.g(context, i10, timeInterpolator);
        this.f22553f = cd.h.g(context, ic.b.Q, timeInterpolator);
    }

    public boolean A() {
        return this.f22564q;
    }

    public boolean B() {
        return this.f22571x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f22556i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f22558k) == null) {
            this.f22556i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f22557j - 1;
        this.f22557j = i11;
        O(this.f22556i, i11);
    }

    public final void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11 = m(i11)) != null) {
            m11.setVisibility(0);
            m11.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10 = m(i10)) != null) {
            m10.setVisibility(4);
            if (i10 == 1) {
                m10.setText((CharSequence) null);
            }
        }
        this.f22561n = i11;
    }

    public void E(int i10) {
        this.f22567t = i10;
        TextView textView = this.f22565r;
        if (textView != null) {
            o0.o0(textView, i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f22566s = charSequence;
        TextView textView = this.f22565r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f22564q == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f22554g);
            this.f22565r = b0Var;
            b0Var.setId(ic.f.Q);
            this.f22565r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f22565r.setTypeface(typeface);
            }
            H(this.f22568u);
            I(this.f22569v);
            F(this.f22566s);
            E(this.f22567t);
            this.f22565r.setVisibility(4);
            e(this.f22565r, 0);
        } else {
            w();
            C(this.f22565r, 0);
            this.f22565r = null;
            this.f22555h.p0();
            this.f22555h.A0();
        }
        this.f22564q = z10;
    }

    public void H(int i10) {
        this.f22568u = i10;
        TextView textView = this.f22565r;
        if (textView != null) {
            this.f22555h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f22569v = colorStateList;
        TextView textView = this.f22565r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f22573z = i10;
        TextView textView = this.f22572y;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f22571x == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f22554g);
            this.f22572y = b0Var;
            b0Var.setId(ic.f.R);
            this.f22572y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f22572y.setTypeface(typeface);
            }
            this.f22572y.setVisibility(4);
            o0.o0(this.f22572y, 1);
            J(this.f22573z);
            L(this.A);
            e(this.f22572y, 1);
            this.f22572y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f22572y, 1);
            this.f22572y = null;
            this.f22555h.p0();
            this.f22555h.A0();
        }
        this.f22571x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f22572y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f22565r, typeface);
            M(this.f22572y, typeface);
        }
    }

    public final void O(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, @NonNull CharSequence charSequence) {
        if (o0.R(this.f22555h) && this.f22555h.isEnabled()) {
            return (this.f22562o == this.f22561n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f22563p = charSequence;
        this.f22565r.setText(charSequence);
        int i10 = this.f22561n;
        if (i10 != 1) {
            this.f22562o = 1;
        }
        S(i10, this.f22562o, P(this.f22565r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f22570w = charSequence;
        this.f22572y.setText(charSequence);
        int i10 = this.f22561n;
        if (i10 != 2) {
            this.f22562o = 2;
        }
        S(i10, this.f22562o, P(this.f22572y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        t tVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22559l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f22571x, this.f22572y, 2, i10, i11);
            tVar.i(arrayList, tVar.f22564q, tVar.f22565r, 1, i10, i11);
            jc.b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f22555h.p0();
        tVar.f22555h.u0(z10);
        tVar.f22555h.A0();
    }

    public void e(TextView textView, int i10) {
        if (this.f22556i == null && this.f22558k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f22554g);
            this.f22556i = linearLayout;
            linearLayout.setOrientation(0);
            this.f22555h.addView(this.f22556i, -1, -2);
            this.f22558k = new FrameLayout(this.f22554g);
            this.f22556i.addView(this.f22558k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f22555h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f22558k.setVisibility(0);
            this.f22558k.addView(textView);
        } else {
            this.f22556i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f22556i.setVisibility(0);
        this.f22557j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f22555h.getEditText();
            boolean g10 = ed.c.g(this.f22554g);
            o0.B0(this.f22556i, v(g10, ic.d.I, o0.E(editText)), v(g10, ic.d.J, this.f22554g.getResources().getDimensionPixelSize(ic.d.H)), v(g10, ic.d.I, o0.D(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f22556i == null || this.f22555h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f22559l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(@NonNull List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator j10 = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                j10.setStartDelay(this.f22550c);
            }
            list.add(j10);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator k10 = k(textView);
            k10.setStartDelay(this.f22550c);
            list.add(k10);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(z10 ? this.b : this.f22550c);
        ofFloat.setInterpolator(z10 ? this.f22552e : this.f22553f);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f22560m, 0.0f);
        ofFloat.setDuration(this.f22549a);
        ofFloat.setInterpolator(this.f22551d);
        return ofFloat;
    }

    public boolean l() {
        return y(this.f22562o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f22565r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f22572y;
    }

    public int n() {
        return this.f22567t;
    }

    public CharSequence o() {
        return this.f22566s;
    }

    public CharSequence p() {
        return this.f22563p;
    }

    public int q() {
        TextView textView = this.f22565r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f22565r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f22570w;
    }

    public View t() {
        return this.f22572y;
    }

    public int u() {
        TextView textView = this.f22572y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f22554g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f22563p = null;
        h();
        if (this.f22561n == 1) {
            if (!this.f22571x || TextUtils.isEmpty(this.f22570w)) {
                this.f22562o = 0;
            } else {
                this.f22562o = 2;
            }
        }
        S(this.f22561n, this.f22562o, P(this.f22565r, ""));
    }

    public void x() {
        h();
        int i10 = this.f22561n;
        if (i10 == 2) {
            this.f22562o = 0;
        }
        S(i10, this.f22562o, P(this.f22572y, ""));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f22565r == null || TextUtils.isEmpty(this.f22563p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
