package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public final class w implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16266a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f16267c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16268d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16269e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f16270f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f16271g;

    public w(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.f16266a = constraintLayout;
        this.b = textView;
        this.f16267c = imageView;
        this.f16268d = textView2;
        this.f16269e = textView3;
        this.f16270f = materialCardView;
        this.f16271g = imageView2;
    }

    @NonNull
    public static w a(@NonNull View view) {
        int i10 = yq.d.f36936a;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = yq.d.A;
            ImageView imageView = (ImageView) r5.b.a(view, i10);
            if (imageView != null) {
                i10 = yq.d.H;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = yq.d.X;
                    TextView textView3 = (TextView) r5.b.a(view, i10);
                    if (textView3 != null) {
                        i10 = yq.d.F0;
                        MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
                        if (materialCardView != null) {
                            i10 = yq.d.G0;
                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                            if (imageView2 != null) {
                                return new w((ConstraintLayout) view, textView, imageView, textView2, textView3, materialCardView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f37009x, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16266a;
    }
}
