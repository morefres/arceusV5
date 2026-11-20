package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import hq.t;
import hq.u;

/* loaded from: classes3.dex */
public final class e implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23842a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23843c;

    public e(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f23842a = linearLayout;
        this.b = textView;
        this.f23843c = themeableLottieAnimationView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = t.f19618h;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = t.f19622l;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
            if (themeableLottieAnimationView != null) {
                return new e((LinearLayout) view, textView, themeableLottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(u.f19640e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23842a;
    }
}
