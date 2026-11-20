package nr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import mr.r1;
import mr.s1;

/* loaded from: classes3.dex */
public final class b implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f27329a;

    @NonNull
    public final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f27330c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f27331d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Flow f27332e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f27333f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f27334g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final SignatureView f27335h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f27336i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f27337j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f27338k;

    public b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f27329a = frameLayout;
        this.b = frameLayout2;
        this.f27330c = button;
        this.f27331d = imageView;
        this.f27332e = flow;
        this.f27333f = button2;
        this.f27334g = view;
        this.f27335h = signatureView;
        this.f27336i = textView;
        this.f27337j = textView2;
        this.f27338k = constraintLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View a10;
        int i10 = r1.f24906a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = r1.b;
            Button button = (Button) r5.b.a(view, i10);
            if (button != null) {
                i10 = r1.f24907c;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = r1.f24909e;
                    Flow flow = (Flow) r5.b.a(view, i10);
                    if (flow != null) {
                        i10 = r1.f24920p;
                        Button button2 = (Button) r5.b.a(view, i10);
                        if (button2 != null && (a10 = r5.b.a(view, (i10 = r1.f24921q))) != null) {
                            i10 = r1.f24922r;
                            SignatureView signatureView = (SignatureView) r5.b.a(view, i10);
                            if (signatureView != null) {
                                i10 = r1.f24923s;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = r1.f24924t;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = r1.f24925u;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                                        if (constraintLayout != null) {
                                            return new b((FrameLayout) view, frameLayout, button, imageView, flow, button2, a10, signatureView, textView, textView2, constraintLayout);
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
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s1.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f27329a;
    }
}
