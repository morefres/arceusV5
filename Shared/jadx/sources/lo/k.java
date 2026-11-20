package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class k implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23765a;

    @NonNull
    public final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23766c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f23767d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f23768e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23769f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f23770g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f23771h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23772i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23773j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23774k;

    public k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f23765a = coordinatorLayout;
        this.b = linearLayout;
        this.f23766c = personaMaterialButton;
        this.f23767d = textInputLayout;
        this.f23768e = textView;
        this.f23769f = linearLayout2;
        this.f23770g = textInputLayout2;
        this.f23771h = textView2;
        this.f23772i = constraintLayout;
        this.f23773j = pi2NavigationBar;
        this.f23774k = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = n2.f18712u;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n2.f18714v;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f18716w;
                TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout != null) {
                    i10 = n2.f18718x;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        i10 = n2.J;
                        LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = n2.P;
                            TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout2 != null) {
                                i10 = n2.Q;
                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                if (textView2 != null) {
                                    i10 = n2.Y;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = n2.f18679d0;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                        if (pi2NavigationBar != null) {
                                            i10 = n2.L0;
                                            TextView textView3 = (TextView) r5.b.a(view, i10);
                                            if (textView3 != null) {
                                                return new k((CoordinatorLayout) view, linearLayout, personaMaterialButton, textInputLayout, textView, linearLayout2, textInputLayout2, textView2, constraintLayout, pi2NavigationBar, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18736l, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23765a;
    }
}
