package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class i implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23729a;

    @NonNull
    public final PersonaMaterialButton b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckBox f23730c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23731d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23732e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f23733f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f23734g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23735h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f23736i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f23737j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final Flow f23738k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23739l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final View f23740m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f23741n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23742o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23743p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23744q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f23745r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23746s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final ProgressBar f23747t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23748u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final ImageView f23749v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final SpotlightView f23750w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final SpotlightView f23751x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final Guideline f23752y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final TextView f23753z;

    public i(@NonNull FrameLayout frameLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull CheckBox checkBox, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull Flow flow, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view2, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull ImageView imageView3, @NonNull SpotlightView spotlightView, @NonNull SpotlightView spotlightView2, @NonNull Guideline guideline2, @NonNull TextView textView3) {
        this.f23729a = frameLayout;
        this.b = personaMaterialButton;
        this.f23730c = checkBox;
        this.f23731d = coordinatorLayout;
        this.f23732e = constraintLayout;
        this.f23733f = textView;
        this.f23734g = imageView;
        this.f23735h = linearLayout;
        this.f23736i = guideline;
        this.f23737j = view;
        this.f23738k = flow;
        this.f23739l = pi2NavigationBar;
        this.f23740m = view2;
        this.f23741n = imageView2;
        this.f23742o = constraintLayout2;
        this.f23743p = themeableLottieAnimationView;
        this.f23744q = constraintLayout3;
        this.f23745r = textView2;
        this.f23746s = frameLayout2;
        this.f23747t = progressBar;
        this.f23748u = personaMaterialButton2;
        this.f23749v = imageView3;
        this.f23750w = spotlightView;
        this.f23751x = spotlightView2;
        this.f23752y = guideline2;
        this.f23753z = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        View a10;
        View a11;
        int i10 = n2.f18673a;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = n2.f18676c;
            CheckBox checkBox = (CheckBox) r5.b.a(view, i10);
            if (checkBox != null) {
                i10 = n2.f18694l;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r5.b.a(view, i10);
                if (coordinatorLayout != null) {
                    i10 = n2.f18696m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f18722z;
                        TextView textView = (TextView) r5.b.a(view, i10);
                        if (textView != null) {
                            i10 = n2.A;
                            ImageView imageView = (ImageView) r5.b.a(view, i10);
                            if (imageView != null) {
                                i10 = n2.C;
                                LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = n2.D;
                                    Guideline guideline = (Guideline) r5.b.a(view, i10);
                                    if (guideline != null && (a10 = r5.b.a(view, (i10 = n2.G))) != null) {
                                        i10 = n2.I;
                                        Flow flow = (Flow) r5.b.a(view, i10);
                                        if (flow != null) {
                                            i10 = n2.f18679d0;
                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                            if (pi2NavigationBar != null && (a11 = r5.b.a(view, (i10 = n2.f18681e0))) != null) {
                                                i10 = n2.f18683f0;
                                                ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                                                if (imageView2 != null) {
                                                    i10 = n2.f18685g0;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                                    if (constraintLayout2 != null) {
                                                        i10 = n2.f18687h0;
                                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                                        if (themeableLottieAnimationView != null) {
                                                            i10 = n2.f18689i0;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                                            if (constraintLayout3 != null) {
                                                                i10 = n2.f18691j0;
                                                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                                                if (textView2 != null) {
                                                                    i10 = n2.f18709s0;
                                                                    FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                                                    if (frameLayout != null) {
                                                                        i10 = n2.f18711t0;
                                                                        ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                                                                        if (progressBar != null) {
                                                                            i10 = n2.f18717w0;
                                                                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                                                                            if (personaMaterialButton2 != null) {
                                                                                i10 = n2.f18719x0;
                                                                                ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                                                                                if (imageView3 != null) {
                                                                                    i10 = n2.B0;
                                                                                    SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                    if (spotlightView != null) {
                                                                                        i10 = n2.C0;
                                                                                        SpotlightView spotlightView2 = (SpotlightView) r5.b.a(view, i10);
                                                                                        if (spotlightView2 != null) {
                                                                                            i10 = n2.D0;
                                                                                            Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                            if (guideline2 != null) {
                                                                                                i10 = n2.L0;
                                                                                                TextView textView3 = (TextView) r5.b.a(view, i10);
                                                                                                if (textView3 != null) {
                                                                                                    return new i((FrameLayout) view, personaMaterialButton, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, guideline, a10, flow, pi2NavigationBar, a11, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, personaMaterialButton2, imageView3, spotlightView, spotlightView2, guideline2, textView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18733i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23729a;
    }
}
