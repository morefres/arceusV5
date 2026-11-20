package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import hq.t;
import hq.u;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23819a;

    @NonNull
    public final ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23820c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f23821d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f23822e;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.f23819a = coordinatorLayout;
        this.b = constraintLayout;
        this.f23820c = frameLayout;
        this.f23821d = nestedScrollView;
        this.f23822e = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View a10;
        int i10 = t.f19613c;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = t.f19616f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = t.f19617g;
                NestedScrollView nestedScrollView = (NestedScrollView) r5.b.a(view, i10);
                if (nestedScrollView != null && (a10 = r5.b.a(view, (i10 = t.f19635y))) != null) {
                    return new a((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, a10);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(u.f19637a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23819a;
    }
}
