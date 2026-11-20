package yn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import xn.n2;
import xn.o2;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f36829a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f36830c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f36831d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f36832e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36833f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f36834g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f36835h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f36836i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f36837j;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView3) {
        this.f36829a = coordinatorLayout;
        this.b = textView;
        this.f36830c = guideline;
        this.f36831d = textView2;
        this.f36832e = guideline2;
        this.f36833f = pi2NavigationBar;
        this.f36834g = recyclerView;
        this.f36835h = guideline3;
        this.f36836i = personaMaterialButton;
        this.f36837j = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = n2.f35732c;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f35733d;
            Guideline guideline = (Guideline) r5.b.a(view, i10);
            if (guideline != null) {
                i10 = n2.f35738i;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = n2.f35739j;
                    Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                    if (guideline2 != null) {
                        i10 = n2.f35744o;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = n2.f35747r;
                            RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = n2.f35748s;
                                Guideline guideline3 = (Guideline) r5.b.a(view, i10);
                                if (guideline3 != null) {
                                    i10 = n2.f35749t;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = n2.f35750u;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
                                        if (textView3 != null) {
                                            return new c((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, personaMaterialButton, textView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f36829a;
    }
}
