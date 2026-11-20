package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes3.dex */
public final class r implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16258a;

    @NonNull
    public final MaterialCheckBox b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16259c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16260d;

    public r(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f16258a = constraintLayout;
        this.b = materialCheckBox;
        this.f16259c = textView;
        this.f16260d = constraintLayout2;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = yq.d.f36963o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) r5.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = yq.d.X;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.Z;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    return new r((ConstraintLayout) view, materialCheckBox, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f37004s, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16258a;
    }
}
