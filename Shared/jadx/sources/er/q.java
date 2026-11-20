package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class q implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16249a;

    @NonNull
    public final ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16250c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f16251d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16252e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16253f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f16254g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f16255h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16256i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16257j;

    public q(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f16249a = constraintLayout;
        this.b = constraintLayout2;
        this.f16250c = textInputLayout;
        this.f16251d = autoCompleteTextView;
        this.f16252e = textView;
        this.f16253f = textInputLayout2;
        this.f16254g = autoCompleteTextView2;
        this.f16255h = textView2;
        this.f16256i = textInputLayout3;
        this.f16257j = textInputEditText;
    }

    @NonNull
    public static q a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = yq.d.P;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = yq.d.Q;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
            if (autoCompleteTextView != null) {
                i10 = yq.d.R;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = yq.d.S;
                    TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                    if (textInputLayout2 != null) {
                        i10 = yq.d.T;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) r5.b.a(view, i10);
                        if (autoCompleteTextView2 != null) {
                            i10 = yq.d.U;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = yq.d.V;
                                TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = yq.d.W;
                                    TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                                    if (textInputEditText != null) {
                                        return new q(constraintLayout, constraintLayout, textInputLayout, autoCompleteTextView, textView, textInputLayout2, autoCompleteTextView2, textView2, textInputLayout3, textInputEditText);
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
    public static q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f37003r, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16249a;
    }
}
