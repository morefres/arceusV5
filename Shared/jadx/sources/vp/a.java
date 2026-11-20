package vp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33508a;

    @NonNull
    public final MaterialSwitch b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f33509c;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialToolbar materialToolbar) {
        this.f33508a = constraintLayout;
        this.b = materialSwitch;
        this.f33509c = materialToolbar;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = up.a.f33054c;
        MaterialSwitch materialSwitch = (MaterialSwitch) r5.b.a(view, i10);
        if (materialSwitch != null) {
            i10 = up.a.f33055d;
            MaterialToolbar materialToolbar = (MaterialToolbar) r5.b.a(view, i10);
            if (materialToolbar != null) {
                return new a((ConstraintLayout) view, materialSwitch, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(up.b.f33056a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33508a;
    }
}
