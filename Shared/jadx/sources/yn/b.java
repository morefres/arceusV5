package yn;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import xn.n2;

/* loaded from: classes3.dex */
public final class b implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36827a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f36828c;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.f36827a = constraintLayout;
        this.b = themeableLottieAnimationView;
        this.f36828c = materialCardView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = n2.f35731a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
        if (themeableLottieAnimationView != null) {
            i10 = n2.f35735f;
            MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
            if (materialCardView != null) {
                return new b((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36827a;
    }
}
