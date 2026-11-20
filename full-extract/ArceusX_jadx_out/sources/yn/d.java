package yn;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import xn.n2;

/* loaded from: classes3.dex */
public final class d implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36838a;

    @NonNull
    public final MaterialCardView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f36839c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f36840d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36841e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36842f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36843g;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f36838a = constraintLayout;
        this.b = materialCardView;
        this.f36839c = textView;
        this.f36840d = imageView;
        this.f36841e = linearLayout;
        this.f36842f = circularProgressIndicator;
        this.f36843g = themeableLottieAnimationView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = n2.f35735f;
        MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
        if (materialCardView != null) {
            i10 = n2.f35740k;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = n2.f35741l;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = n2.f35742m;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = n2.f35743n;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
                        if (circularProgressIndicator != null) {
                            i10 = n2.f35746q;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                            if (themeableLottieAnimationView != null) {
                                return new d((ConstraintLayout) view, materialCardView, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36838a;
    }
}
