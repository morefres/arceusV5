package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* loaded from: classes3.dex */
public final class k implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16235a;

    @NonNull
    public final PersonaMaterialButton b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16236c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16237d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16238e;

    public k(@NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f16235a = linearLayout;
        this.b = personaMaterialButton;
        this.f16236c = textView;
        this.f16237d = textView2;
        this.f16238e = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = yq.d.f36977v;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = yq.d.f36979w;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.I;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = yq.d.Y;
                    TextView textView3 = (TextView) r5.b.a(view, i10);
                    if (textView3 != null) {
                        return new k((LinearLayout) view, personaMaterialButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36997l, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f16235a;
    }
}
