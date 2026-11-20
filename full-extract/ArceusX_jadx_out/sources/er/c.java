package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16190a;

    @NonNull
    public final TextInputLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16191c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16192d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16193e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16194f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16195g;

    public c(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout4) {
        this.f16190a = constraintLayout;
        this.b = textInputLayout;
        this.f16191c = textInputEditText;
        this.f16192d = textInputLayout2;
        this.f16193e = textInputLayout3;
        this.f16194f = textInputEditText2;
        this.f16195g = textInputLayout4;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = yq.d.J;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = yq.d.K;
            TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
            if (textInputEditText != null) {
                i10 = yq.d.M;
                TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = yq.d.C0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                    if (textInputLayout3 != null) {
                        i10 = yq.d.D0;
                        TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                        if (textInputEditText2 != null) {
                            i10 = yq.d.L0;
                            TextInputLayout textInputLayout4 = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout4 != null) {
                                return new c((ConstraintLayout) view, textInputLayout, textInputEditText, textInputLayout2, textInputLayout3, textInputEditText2, textInputLayout4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36988c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16190a;
    }
}
