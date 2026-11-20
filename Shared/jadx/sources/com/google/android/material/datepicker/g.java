package com.google.android.material.datepicker;

import ad.r;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class g<S> extends e4.k {
    public static final Object Z0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: a1, reason: collision with root package name */
    public static final Object f7933a1 = "CANCEL_BUTTON_TAG";

    /* renamed from: b1, reason: collision with root package name */
    public static final Object f7934b1 = "TOGGLE_BUTTON_TAG";
    public DateSelector<S> A0;
    public m<S> B0;
    public CalendarConstraints C0;
    public DayViewDecorator D0;
    public e<S> E0;
    public int F0;
    public CharSequence G0;
    public boolean H0;
    public int I0;
    public int J0;
    public CharSequence K0;
    public int L0;
    public CharSequence M0;
    public int N0;
    public CharSequence O0;
    public int P0;
    public CharSequence Q0;
    public TextView R0;
    public TextView S0;
    public CheckableImageButton T0;
    public hd.g U0;
    public Button V0;
    public boolean W0;
    public CharSequence X0;
    public CharSequence Y0;

    /* renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet<h<? super S>> f7935v0 = new LinkedHashSet<>();

    /* renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f7936w0 = new LinkedHashSet<>();

    /* renamed from: x0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f7937x0 = new LinkedHashSet<>();

    /* renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f7938y0 = new LinkedHashSet<>();

    /* renamed from: z0, reason: collision with root package name */
    public int f7939z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f7935v0.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(g.this.G2());
            }
            g.this.e2();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = g.this.f7936w0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            g.this.e2();
        }
    }

    public class c implements y {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7942a;
        public final /* synthetic */ View b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7943c;

        public c(int i10, View view, int i11) {
            this.f7942a = i10;
            this.b = view;
            this.f7943c = i11;
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f7942a >= 0) {
                this.b.getLayoutParams().height = this.f7942a + i10;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.f7943c + i10, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    public class d extends l<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s8) {
            g gVar = g.this;
            gVar.O2(gVar.E2());
            g.this.V0.setEnabled(g.this.B2().L2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> B2() {
        if (this.A0 == null) {
            this.A0 = (DateSelector) t().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.A0;
    }

    public static CharSequence C2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    public static int F2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ic.d.P);
        int i10 = Month.o().f7882d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ic.d.R) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ic.d.U));
    }

    public static boolean J2(@NonNull Context context) {
        return M2(context, R.attr.windowFullscreen);
    }

    public static boolean L2(@NonNull Context context) {
        return M2(context, ic.b.S);
    }

    public static boolean M2(@NonNull Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ed.b.d(context, ic.b.f20419z, e.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public static /* synthetic */ void u2(g gVar, View view) {
        gVar.V0.setEnabled(gVar.B2().L2());
        gVar.T0.toggle();
        gVar.I0 = gVar.I0 == 1 ? 0 : 1;
        gVar.Q2(gVar.T0);
        gVar.N2();
    }

    @NonNull
    public static Drawable z2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, k.a.b(context, ic.e.f20469e));
        stateListDrawable.addState(new int[0], k.a.b(context, ic.e.f20470f));
        return stateListDrawable;
    }

    public final void A2(Window window) {
        if (this.W0) {
            return;
        }
        View findViewById = J1().findViewById(ic.f.f20485i);
        ad.d.a(window, true, r.e(findViewById), null);
        o0.A0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.W0 = true;
    }

    public final String D2() {
        return B2().L0(I1());
    }

    public String E2() {
        return B2().K1(w());
    }

    @Override // e4.k, androidx.fragment.app.c
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7939z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.A0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.C0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.D0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.F0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.I0 = bundle.getInt("INPUT_MODE_KEY");
        this.J0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.L0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.P0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.G0;
        if (charSequence == null) {
            charSequence = I1().getResources().getText(this.F0);
        }
        this.X0 = charSequence;
        this.Y0 = C2(charSequence);
    }

    public final S G2() {
        return B2().a3();
    }

    public final int H2(Context context) {
        int i10 = this.f7939z0;
        return i10 != 0 ? i10 : B2().R0(context);
    }

    public final void I2(Context context) {
        this.T0.setTag(f7934b1);
        this.T0.setImageDrawable(z2(context));
        this.T0.setChecked(this.I0 != 0);
        o0.m0(this.T0, null);
        Q2(this.T0);
        this.T0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.u2(g.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.c
    @NonNull
    public final View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.H0 ? ic.h.f20526w : ic.h.f20525v, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.D0;
        if (dayViewDecorator != null) {
            dayViewDecorator.n(context);
        }
        if (this.H0) {
            inflate.findViewById(ic.f.f20502z).setLayoutParams(new LinearLayout.LayoutParams(F2(context), -2));
        } else {
            inflate.findViewById(ic.f.A).setLayoutParams(new LinearLayout.LayoutParams(F2(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(ic.f.G);
        this.S0 = textView;
        o0.o0(textView, 1);
        this.T0 = (CheckableImageButton) inflate.findViewById(ic.f.H);
        this.R0 = (TextView) inflate.findViewById(ic.f.I);
        I2(context);
        this.V0 = (Button) inflate.findViewById(ic.f.f20480d);
        if (B2().L2()) {
            this.V0.setEnabled(true);
        } else {
            this.V0.setEnabled(false);
        }
        this.V0.setTag(Z0);
        CharSequence charSequence = this.K0;
        if (charSequence != null) {
            this.V0.setText(charSequence);
        } else {
            int i10 = this.J0;
            if (i10 != 0) {
                this.V0.setText(i10);
            }
        }
        CharSequence charSequence2 = this.M0;
        if (charSequence2 != null) {
            this.V0.setContentDescription(charSequence2);
        } else if (this.L0 != 0) {
            this.V0.setContentDescription(w().getResources().getText(this.L0));
        }
        this.V0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(ic.f.f20478a);
        button.setTag(f7933a1);
        CharSequence charSequence3 = this.O0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.N0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.Q0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.P0 != 0) {
            button.setContentDescription(w().getResources().getText(this.P0));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final boolean K2() {
        return S().getConfiguration().orientation == 2;
    }

    public final void N2() {
        int H2 = H2(I1());
        i t22 = e.t2(B2(), H2, this.C0, this.D0);
        this.E0 = t22;
        if (this.I0 == 1) {
            t22 = i.d2(B2(), H2, this.C0);
        }
        this.B0 = t22;
        P2();
        O2(E2());
        androidx.fragment.app.h r8 = u().r();
        r8.n(ic.f.f20502z, this.B0);
        r8.i();
        this.B0.b2(new d());
    }

    public void O2(String str) {
        this.S0.setContentDescription(D2());
        this.S0.setText(str);
    }

    public final void P2() {
        this.R0.setText((this.I0 == 1 && K2()) ? this.Y0 : this.X0);
    }

    public final void Q2(@NonNull CheckableImageButton checkableImageButton) {
        this.T0.setContentDescription(this.I0 == 1 ? checkableImageButton.getContext().getString(ic.i.f20543r) : checkableImageButton.getContext().getString(ic.i.f20545t));
    }

    @Override // e4.k, androidx.fragment.app.c
    public final void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7939z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A0);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.C0);
        e<S> eVar = this.E0;
        Month o22 = eVar == null ? null : eVar.o2();
        if (o22 != null) {
            bVar.b(o22.f7884f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.D0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.G0);
        bundle.putInt("INPUT_MODE_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.K0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.L0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.O0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Q0);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        Window window = o2().getWindow();
        if (this.H0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.U0);
            A2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = S().getDimensionPixelOffset(ic.d.T);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new vc.a(o2(), rect));
        }
        N2();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void d1() {
        this.B0.c2();
        super.d1();
    }

    @Override // e4.k
    @NonNull
    public final Dialog k2(Bundle bundle) {
        Dialog dialog = new Dialog(I1(), H2(I1()));
        Context context = dialog.getContext();
        this.H0 = J2(context);
        this.U0 = new hd.g(context, null, ic.b.f20419z, ic.j.f20572y);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ic.k.f20625f3, ic.b.f20419z, ic.j.f20572y);
        int color = obtainStyledAttributes.getColor(ic.k.f20634g3, 0);
        obtainStyledAttributes.recycle();
        this.U0.Q(context);
        this.U0.a0(ColorStateList.valueOf(color));
        this.U0.Z(o0.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f7937x0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f7938y0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) j0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
