package yn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import xn.n2;
import xn.o2;

/* loaded from: classes3.dex */
public final class e implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36844a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36845c;

    public e(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f36844a = frameLayout;
        this.b = frameLayout2;
        this.f36845c = frameLayout3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = n2.f35734e;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = n2.f35736g;
            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout2 != null) {
                return new e((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.f35756e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f36844a;
    }
}
