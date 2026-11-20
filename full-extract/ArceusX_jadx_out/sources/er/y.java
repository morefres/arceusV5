package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;

/* loaded from: classes3.dex */
public final class y implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final PersonaTextView f16273a;

    @NonNull
    public final PersonaTextView b;

    public y(@NonNull PersonaTextView personaTextView, @NonNull PersonaTextView personaTextView2) {
        this.f16273a = personaTextView;
        this.b = personaTextView2;
    }

    @NonNull
    public static y a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PersonaTextView personaTextView = (PersonaTextView) view;
        return new y(personaTextView, personaTextView);
    }

    @NonNull
    public static y c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(yq.e.f37011z, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextView getRoot() {
        return this.f16273a;
    }
}
