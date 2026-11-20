package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class j implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23754a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f23755c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f23756d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f23757e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f23758f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f23759g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final CardView f23760h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23761i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final Guideline f23762j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23763k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ButtonWithLoadingIndicator f23764l;

    public j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Guideline guideline2, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f23754a = coordinatorLayout;
        this.b = textView;
        this.f23755c = personaMaterialButton;
        this.f23756d = guideline;
        this.f23757e = imageView;
        this.f23758f = textView2;
        this.f23759g = imageView2;
        this.f23760h = cardView;
        this.f23761i = pi2NavigationBar;
        this.f23762j = guideline2;
        this.f23763k = textView3;
        this.f23764l = buttonWithLoadingIndicator;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = n2.f18678d;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f18706r;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
            if (personaMaterialButton != null) {
                i10 = n2.D;
                Guideline guideline = (Guideline) r5.b.a(view, i10);
                if (guideline != null) {
                    i10 = n2.E;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = n2.F;
                        TextView textView2 = (TextView) r5.b.a(view, i10);
                        if (textView2 != null) {
                            i10 = n2.V;
                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                            if (imageView2 != null) {
                                i10 = n2.W;
                                CardView cardView = (CardView) r5.b.a(view, i10);
                                if (cardView != null) {
                                    i10 = n2.f18679d0;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                    if (pi2NavigationBar != null) {
                                        i10 = n2.D0;
                                        Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                        if (guideline2 != null) {
                                            i10 = n2.L0;
                                            TextView textView3 = (TextView) r5.b.a(view, i10);
                                            if (textView3 != null) {
                                                i10 = n2.O0;
                                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) r5.b.a(view, i10);
                                                if (buttonWithLoadingIndicator != null) {
                                                    return new j((CoordinatorLayout) view, textView, personaMaterialButton, guideline, imageView, textView2, imageView2, cardView, pi2NavigationBar, guideline2, textView3, buttonWithLoadingIndicator);
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
    public static j c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18735k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23754a;
    }
}
