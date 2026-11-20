package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class i implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36923a;

    @NonNull
    public final ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f36924c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f36925d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36926e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f36927f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36928g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36929h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f36930i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f36931j;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull Space space, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull TextView textView2) {
        this.f36923a = constraintLayout;
        this.b = constraintLayout2;
        this.f36924c = textView;
        this.f36925d = space;
        this.f36926e = constraintLayout3;
        this.f36927f = guideline;
        this.f36928g = pi2NavigationBar;
        this.f36929h = themeableLottieAnimationView;
        this.f36930i = guideline2;
        this.f36931j = textView2;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = r.f34659a;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = r.f34666e;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = r.f34670g;
                Space space = (Space) r5.b.a(view, i10);
                if (space != null) {
                    i10 = r.f34677m;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout2 != null) {
                        i10 = r.f34681q;
                        Guideline guideline = (Guideline) r5.b.a(view, i10);
                        if (guideline != null) {
                            i10 = r.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = r.I;
                                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                if (themeableLottieAnimationView != null) {
                                    i10 = r.X;
                                    Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                    if (guideline2 != null) {
                                        i10 = r.f34661b0;
                                        TextView textView2 = (TextView) r5.b.a(view, i10);
                                        if (textView2 != null) {
                                            return new i((ConstraintLayout) view, constraintLayout, textView, space, constraintLayout2, guideline, pi2NavigationBar, themeableLottieAnimationView, guideline2, textView2);
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
    public static i c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s.f34704i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36923a;
    }
}
