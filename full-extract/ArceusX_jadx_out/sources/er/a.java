package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f16177a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16178c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f16179d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f16180e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f16181f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16182g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16183h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f16184i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f16185j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16186k;

    public a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f16177a = frameLayout;
        this.b = frameLayout2;
        this.f16178c = linearLayout;
        this.f16179d = view;
        this.f16180e = imageView;
        this.f16181f = recyclerView;
        this.f16182g = textInputEditText;
        this.f16183h = textInputLayout;
        this.f16184i = view2;
        this.f16185j = textView;
        this.f16186k = linearLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View a10;
        View a11;
        int i10 = yq.d.f36961n;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = yq.d.f36937a0;
            LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
            if (linearLayout != null && (a10 = r5.b.a(view, (i10 = yq.d.f36938b0))) != null) {
                i10 = yq.d.f36944e0;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = yq.d.f36986z0;
                    RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = yq.d.A0;
                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = yq.d.B0;
                            TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout != null && (a11 = r5.b.a(view, (i10 = yq.d.E0))) != null) {
                                i10 = yq.d.K0;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = yq.d.M0;
                                    LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                                    if (linearLayout2 != null) {
                                        return new a((FrameLayout) view, frameLayout, linearLayout, a10, imageView, recyclerView, textInputEditText, textInputLayout, a11, textView, linearLayout2);
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
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36987a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f16177a;
    }
}
