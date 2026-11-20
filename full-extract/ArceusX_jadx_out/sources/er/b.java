package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* loaded from: classes3.dex */
public final class b implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16187a;

    @NonNull
    public final MaterialRadioButton b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16188c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16189d;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16187a = constraintLayout;
        this.b = materialRadioButton;
        this.f16188c = textView;
        this.f16189d = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = yq.d.f36974t0;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) r5.b.a(view, i10);
        if (materialRadioButton != null) {
            i10 = yq.d.f36978v0;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.f36980w0;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    return new b((ConstraintLayout) view, materialRadioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16187a;
    }
}
