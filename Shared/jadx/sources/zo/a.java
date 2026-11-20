package zo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import xo.e0;
import xo.f0;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f38137a;

    @NonNull
    public final ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f38138c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f38139d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f38140e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f38141f;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f38137a = constraintLayout;
        this.b = constraintLayout2;
        this.f38138c = personaMaterialButton;
        this.f38139d = textView;
        this.f38140e = textView2;
        this.f38141f = personaMaterialButton2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = e0.b;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = e0.f35815g;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = e0.f35816h;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = e0.f35820l;
                    PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
                    if (personaMaterialButton2 != null) {
                        return new a(constraintLayout, constraintLayout, personaMaterialButton, textView, textView2, personaMaterialButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(f0.f35834a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38137a;
    }
}
