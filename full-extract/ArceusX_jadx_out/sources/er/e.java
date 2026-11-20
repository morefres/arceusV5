package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* loaded from: classes3.dex */
public final class e implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16214a;

    @NonNull
    public final Guideline b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f16215c;

    public e(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.f16214a = constraintLayout;
        this.b = guideline;
        this.f16215c = guideline2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = yq.d.G;
        Guideline guideline = (Guideline) r5.b.a(view, i10);
        if (guideline != null) {
            i10 = yq.d.H0;
            Guideline guideline2 = (Guideline) r5.b.a(view, i10);
            if (guideline2 != null) {
                return new e((ConstraintLayout) view, guideline, guideline2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f36990e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16214a;
    }
}
