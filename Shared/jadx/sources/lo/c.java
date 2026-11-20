package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23690a;

    @NonNull
    public final Space b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23691c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23692d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23693e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23694f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23695g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23696h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f23697i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f23698j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23699k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f23700l;

    public c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f23690a = frameLayout;
        this.b = space;
        this.f23691c = frameLayout2;
        this.f23692d = linearLayout;
        this.f23693e = constraintLayout;
        this.f23694f = personaMaterialButton;
        this.f23695g = themeableLottieAnimationView;
        this.f23696h = constraintLayout2;
        this.f23697i = textView;
        this.f23698j = view;
        this.f23699k = linearLayout2;
        this.f23700l = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View a10;
        int i10 = n2.f18680e;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f18682f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = n2.f18684g;
                LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = n2.f18710t;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f18714v;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = n2.T;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                i10 = n2.U;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = n2.f18713u0;
                                    TextView textView = (TextView) r5.b.a(view, i10);
                                    if (textView != null && (a10 = r5.b.a(view, (i10 = n2.A0))) != null) {
                                        i10 = n2.K0;
                                        LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                                        if (linearLayout2 != null) {
                                            i10 = n2.L0;
                                            TextView textView2 = (TextView) r5.b.a(view, i10);
                                            if (textView2 != null) {
                                                return new c((FrameLayout) view, space, frameLayout, linearLayout, constraintLayout, personaMaterialButton, themeableLottieAnimationView, constraintLayout2, textView, a10, linearLayout2, textView2);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18727c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23690a;
    }
}
