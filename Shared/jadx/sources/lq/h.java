package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import hq.u;

/* loaded from: classes3.dex */
public final class h implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f23846a;

    @NonNull
    public final ImageView b;

    public h(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f23846a = imageView;
        this.b = imageView2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new h(imageView, imageView);
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(u.f19643h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f23846a;
    }
}
