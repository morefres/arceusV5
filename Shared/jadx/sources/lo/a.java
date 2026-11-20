package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23658a;

    @NonNull
    public final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f23659c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23660d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23661e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23662f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23663g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f23664h;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.f23658a = coordinatorLayout;
        this.b = linearLayout;
        this.f23659c = button;
        this.f23660d = linearLayout2;
        this.f23661e = themeableLottieAnimationView;
        this.f23662f = constraintLayout;
        this.f23663g = pi2NavigationBar;
        this.f23664h = textView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = n2.f18712u;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = n2.f18714v;
            Button button = (Button) r5.b.a(view, i10);
            if (button != null) {
                i10 = n2.J;
                LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                if (linearLayout2 != null) {
                    i10 = n2.T;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                    if (themeableLottieAnimationView != null) {
                        i10 = n2.Y;
                        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                        if (constraintLayout != null) {
                            i10 = n2.f18679d0;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = n2.L0;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    return new a((CoordinatorLayout) view, linearLayout, button, linearLayout2, themeableLottieAnimationView, constraintLayout, pi2NavigationBar, textView);
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
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18726a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23658a;
    }
}
