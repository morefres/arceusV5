package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class f implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36911a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f36912c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36913d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36914e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f36915f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f36916g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f36917h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f36918i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f36919j;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline2, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f36911a = constraintLayout;
        this.b = textView;
        this.f36912c = guideline;
        this.f36913d = constraintLayout2;
        this.f36914e = pi2NavigationBar;
        this.f36915f = recyclerView;
        this.f36916g = personaMaterialButton;
        this.f36917h = guideline2;
        this.f36918i = textView2;
        this.f36919j = personaMaterialButton2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = r.f34666e;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = r.f34681q;
            Guideline guideline = (Guideline) r5.b.a(view, i10);
            if (guideline != null) {
                i10 = r.f34683s;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = r.F;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = r.P;
                        RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                        if (recyclerView != null) {
                            i10 = r.Q;
                            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                            if (personaMaterialButton != null) {
                                i10 = r.X;
                                Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                if (guideline2 != null) {
                                    i10 = r.f34661b0;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = r.f34669f0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new f((ConstraintLayout) view, textView, guideline, constraintLayout, pi2NavigationBar, recyclerView, personaMaterialButton, guideline2, textView2, personaMaterialButton2);
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
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s.f34701f, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36911a;
    }
}
