package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class g implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36920a;

    @NonNull
    public final ShapeableImageView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f36921c;

    public g(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.f36920a = constraintLayout;
        this.b = shapeableImageView;
        this.f36921c = textView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = r.f34690z;
        ShapeableImageView shapeableImageView = (ShapeableImageView) r5.b.a(view, i10);
        if (shapeableImageView != null) {
            i10 = r.E;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                return new g((ConstraintLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s.f34702g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36920a;
    }
}
