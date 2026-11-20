package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class j implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16232a;

    @NonNull
    public final LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16233c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16234d;

    public j(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16232a = linearLayout;
        this.b = linearLayout2;
        this.f16233c = textView;
        this.f16234d = textView2;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i10 = yq.d.f36969r;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = yq.d.f36971s;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.f36973t;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    return new j((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36996k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f16232a;
    }
}
