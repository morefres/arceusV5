package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import pp.p1;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f29999a;

    public a(@NonNull View view) {
        this.f29999a = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        if (view != null) {
            return new a(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(p1.f28951a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f29999a;
    }
}
