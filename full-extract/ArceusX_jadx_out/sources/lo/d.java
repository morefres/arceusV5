package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class d implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23701a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23702c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23703d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23704e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f23705f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23706g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f23707h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23708i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f23709j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23710k;

    public d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f23701a = coordinatorLayout;
        this.b = textView;
        this.f23702c = personaMaterialButton;
        this.f23703d = constraintLayout;
        this.f23704e = themeableLottieAnimationView;
        this.f23705f = view;
        this.f23706g = constraintLayout2;
        this.f23707h = cardView;
        this.f23708i = pi2NavigationBar;
        this.f23709j = textView2;
        this.f23710k = personaMaterialButton2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View a10;
        int i10 = n2.f18678d;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f18690j;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.f18708s;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n2.R;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                    if (themeableLottieAnimationView != null && (a10 = r5.b.a(view, (i10 = n2.S))) != null) {
                        i10 = n2.W;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = n2.f18677c0;
                            CardView cardView = (CardView) r5.b.a(view, i10);
                            if (cardView != null) {
                                i10 = n2.f18679d0;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = n2.L0;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.N0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new d((CoordinatorLayout) view, textView, personaMaterialButton, constraintLayout, themeableLottieAnimationView, a10, constraintLayout2, cardView, pi2NavigationBar, textView2, personaMaterialButton2);
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
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18728d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23701a;
    }
}
