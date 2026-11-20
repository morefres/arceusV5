package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class l implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16239a;

    @NonNull
    public final TextInputEditText b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16240c;

    public l(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.f16239a = textInputLayout;
        this.b = textInputEditText;
        this.f16240c = textInputLayout2;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = yq.d.B;
        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new l(textInputLayout, textInputEditText, textInputLayout);
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36998m, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f16239a;
    }
}
