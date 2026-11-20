package nr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import mr.r1;
import mr.s1;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f27318a;

    @NonNull
    public final ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f27319c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialDivider f27320d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f27321e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f27322f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f27323g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f27324h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f27325i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ShadowedNestedScrollView f27326j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f27327k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f27328l;

    public a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.f27318a = coordinatorLayout;
        this.b = constraintLayout;
        this.f27319c = frameLayout;
        this.f27320d = materialDivider;
        this.f27321e = linearLayout;
        this.f27322f = coordinatorLayout2;
        this.f27323g = view;
        this.f27324h = nestedScrollView;
        this.f27325i = pi2NavigationBar;
        this.f27326j = shadowedNestedScrollView;
        this.f27327k = constraintLayout2;
        this.f27328l = frameLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View a10;
        int i10 = r1.f24908d;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = r1.f24910f;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                i10 = r1.f24911g;
                MaterialDivider materialDivider = (MaterialDivider) r5.b.a(view, i10);
                if (materialDivider != null) {
                    i10 = r1.f24912h;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = r1.f24913i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r5.b.a(view, i10);
                        if (coordinatorLayout != null && (a10 = r5.b.a(view, (i10 = r1.f24914j))) != null) {
                            i10 = r1.f24916l;
                            NestedScrollView nestedScrollView = (NestedScrollView) r5.b.a(view, i10);
                            if (nestedScrollView != null) {
                                i10 = r1.f24917m;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                if (pi2NavigationBar != null) {
                                    i10 = r1.f24918n;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) r5.b.a(view, i10);
                                    if (shadowedNestedScrollView != null) {
                                        i10 = r1.f24919o;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                        if (constraintLayout2 != null) {
                                            i10 = r1.f24926v;
                                            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                            if (frameLayout2 != null) {
                                                return new a((CoordinatorLayout) view, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, a10, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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
        View inflate = layoutInflater.inflate(s1.f24935a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f27318a;
    }
}
