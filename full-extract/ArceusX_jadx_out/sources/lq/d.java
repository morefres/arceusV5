package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import hq.t;
import hq.u;

/* loaded from: classes3.dex */
public final class d implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23831a;

    @NonNull
    public final MaterialButton b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Space f23832c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23833d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23834e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f23835f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2DotsTabIndicator f23836g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f23837h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final MaterialButton f23838i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f23839j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23840k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f23841l;

    public d(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Pi2DotsTabIndicator pi2DotsTabIndicator, @NonNull View view, @NonNull MaterialButton materialButton2, @NonNull View view2, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f23831a = frameLayout;
        this.b = materialButton;
        this.f23832c = space;
        this.f23833d = frameLayout2;
        this.f23834e = linearLayout;
        this.f23835f = imageView;
        this.f23836g = pi2DotsTabIndicator;
        this.f23837h = view;
        this.f23838i = materialButton2;
        this.f23839j = view2;
        this.f23840k = textView;
        this.f23841l = viewPager2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View a10;
        View a11;
        int i10 = t.f19612a;
        MaterialButton materialButton = (MaterialButton) r5.b.a(view, i10);
        if (materialButton != null) {
            i10 = t.b;
            Space space = (Space) r5.b.a(view, i10);
            if (space != null) {
                i10 = t.f19613c;
                FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                if (frameLayout != null) {
                    i10 = t.f19614d;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = t.f19615e;
                        ImageView imageView = (ImageView) r5.b.a(view, i10);
                        if (imageView != null) {
                            i10 = t.f19619i;
                            Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) r5.b.a(view, i10);
                            if (pi2DotsTabIndicator != null && (a10 = r5.b.a(view, (i10 = t.f19621k))) != null) {
                                i10 = t.f19633w;
                                MaterialButton materialButton2 = (MaterialButton) r5.b.a(view, i10);
                                if (materialButton2 != null && (a11 = r5.b.a(view, (i10 = t.f19635y))) != null) {
                                    i10 = t.f19636z;
                                    TextView textView = (TextView) r5.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = t.A;
                                        ViewPager2 viewPager2 = (ViewPager2) r5.b.a(view, i10);
                                        if (viewPager2 != null) {
                                            return new d((FrameLayout) view, materialButton, space, frameLayout, linearLayout, imageView, pi2DotsTabIndicator, a10, materialButton2, a11, textView, viewPager2);
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
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(u.f19639d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23831a;
    }
}
