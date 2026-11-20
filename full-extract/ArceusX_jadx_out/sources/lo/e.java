package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import go.o2;

/* loaded from: classes3.dex */
public final class e implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23711a;

    @NonNull
    public final FrameLayout b;

    public e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f23711a = frameLayout;
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
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f18729e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23711a;
    }
}
