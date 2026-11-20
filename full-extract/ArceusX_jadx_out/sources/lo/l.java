package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class l implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23775a;

    @NonNull
    public final ImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23776c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f23777d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f23778e;

    public l(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23775a = linearLayout;
        this.b = imageView;
        this.f23776c = constraintLayout;
        this.f23777d = textView;
        this.f23778e = textView2;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = n2.N;
        ImageView imageView = (ImageView) r5.b.a(view, i10);
        if (imageView != null) {
            i10 = n2.O;
            ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = n2.F0;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = n2.L0;
                    TextView textView2 = (TextView) r5.b.a(view, i10);
                    if (textView2 != null) {
                        return new l((LinearLayout) view, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18737m, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f23775a;
    }
}
