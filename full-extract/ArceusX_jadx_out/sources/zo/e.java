package zo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import xo.f0;

/* loaded from: classes3.dex */
public final class e implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f38148a;

    @NonNull
    public final FrameLayout b;

    public e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f38148a = frameLayout;
        this.b = frameLayout2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new e(frameLayout, frameLayout);
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(f0.f35837e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f38148a;
    }
}
