package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class d implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16196a;

    @NonNull
    public final TextInputLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16197c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16198d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f16199e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16200f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final MaterialAutoCompleteTextView f16201g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16202h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16203i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16204j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f16205k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16206l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16207m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16208n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16209o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16210p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16211q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16212r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f16213s;

    public d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.f16196a = constraintLayout;
        this.b = textInputLayout;
        this.f16197c = textView;
        this.f16198d = textInputLayout2;
        this.f16199e = materialAutoCompleteTextView;
        this.f16200f = textInputLayout3;
        this.f16201g = materialAutoCompleteTextView2;
        this.f16202h = constraintLayout2;
        this.f16203i = constraintLayout3;
        this.f16204j = constraintLayout4;
        this.f16205k = textView2;
        this.f16206l = textInputLayout4;
        this.f16207m = textInputLayout5;
        this.f16208n = textInputLayout6;
        this.f16209o = textInputEditText;
        this.f16210p = textInputEditText2;
        this.f16211q = textInputEditText3;
        this.f16212r = textInputEditText4;
        this.f16213s = circularProgressIndicator;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = yq.d.b;
        TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
        if (textInputLayout != null) {
            i10 = yq.d.f36939c;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.f36941d;
                TextInputLayout textInputLayout2 = (TextInputLayout) r5.b.a(view, i10);
                if (textInputLayout2 != null) {
                    i10 = yq.d.f36943e;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                    if (materialAutoCompleteTextView != null) {
                        i10 = yq.d.f36945f;
                        TextInputLayout textInputLayout3 = (TextInputLayout) r5.b.a(view, i10);
                        if (textInputLayout3 != null) {
                            i10 = yq.d.f36947g;
                            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) r5.b.a(view, i10);
                            if (materialAutoCompleteTextView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = yq.d.f36949h;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = yq.d.f36951i;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                    if (constraintLayout3 != null) {
                                        i10 = yq.d.f36953j;
                                        TextView textView2 = (TextView) r5.b.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = yq.d.f36955k;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) r5.b.a(view, i10);
                                            if (textInputLayout4 != null) {
                                                i10 = yq.d.f36957l;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) r5.b.a(view, i10);
                                                if (textInputLayout5 != null) {
                                                    i10 = yq.d.f36959m;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) r5.b.a(view, i10);
                                                    if (textInputLayout6 != null) {
                                                        i10 = yq.d.C;
                                                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                                                        if (textInputEditText != null) {
                                                            i10 = yq.d.D;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) r5.b.a(view, i10);
                                                            if (textInputEditText2 != null) {
                                                                i10 = yq.d.E;
                                                                TextInputEditText textInputEditText3 = (TextInputEditText) r5.b.a(view, i10);
                                                                if (textInputEditText3 != null) {
                                                                    i10 = yq.d.F;
                                                                    TextInputEditText textInputEditText4 = (TextInputEditText) r5.b.a(view, i10);
                                                                    if (textInputEditText4 != null) {
                                                                        i10 = yq.d.f36972s0;
                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
                                                                        if (circularProgressIndicator != null) {
                                                                            return new d(constraintLayout, textInputLayout, textView, textInputLayout2, materialAutoCompleteTextView, textInputLayout3, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, constraintLayout3, textView2, textInputLayout4, textInputLayout5, textInputLayout6, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, circularProgressIndicator);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36989d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16196a;
    }
}
