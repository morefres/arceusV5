package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import pp.o1;
import pp.p1;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f30001a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f30002c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f30003d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f30004e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f30005f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f30006g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f30007h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f30008i;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull View view, @NonNull TextView textView2) {
        this.f30001a = coordinatorLayout;
        this.b = frameLayout;
        this.f30002c = constraintLayout;
        this.f30003d = flow;
        this.f30004e = textView;
        this.f30005f = personaMaterialButton;
        this.f30006g = personaMaterialButton2;
        this.f30007h = view;
        this.f30008i = textView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View a10;
        int i10 = o1.f28941a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = o1.b;
            ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = o1.f28943d;
                Flow flow = (Flow) r5.b.a(view, i10);
                if (flow != null) {
                    i10 = o1.f28944e;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        i10 = o1.f28945f;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = o1.f28946g;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                            if (personaMaterialButton2 != null && (a10 = r5.b.a(view, (i10 = o1.f28947h))) != null) {
                                i10 = o1.f28948i;
                                TextView textView2 = (TextView) r5.b.a(view, i10);
                                if (textView2 != null) {
                                    return new c((CoordinatorLayout) view, frameLayout, constraintLayout, flow, textView, personaMaterialButton, personaMaterialButton2, a10, textView2);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(p1.f28952c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f30001a;
    }
}
