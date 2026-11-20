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
public final class f implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16216a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16217c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16218d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16219e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16220f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f16221g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16222h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16223i;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.f16216a = constraintLayout;
        this.b = textView;
        this.f16217c = textInputLayout;
        this.f16218d = textInputEditText;
        this.f16219e = textView2;
        this.f16220f = textInputLayout2;
        this.f16221g = autoCompleteTextView;
        this.f16222h = textInputLayout3;
        this.f16223i = textInputEditText2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = yq.d.f36981x;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = yq.d.f36983y;
            TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
            if (textInputLayout != null) {
                i10 = yq.d.f36985z;
                TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                if (textInputEditText != null) {
                    i10 = yq.d.H;
                    TextView textView2 = (TextView) r5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = yq.d.f36940c0;
                        TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                        if (textInputLayout2 != null) {
                            i10 = yq.d.f36942d0;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
                            if (autoCompleteTextView != null) {
                                i10 = yq.d.N0;
                                TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                                if (textInputLayout3 != null) {
                                    i10 = yq.d.O0;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                                    if (textInputEditText2 != null) {
                                        return new f((ConstraintLayout) view, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
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
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36991f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16216a;
    }
}
