package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class b implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f36866a;

    @NonNull
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Pi2CircleMaskView f36867c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f36868d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f36869e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f36870f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f36871g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2ProgressArcView f36872h;

    public b(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.f36866a = view;
        this.b = view2;
        this.f36867c = pi2CircleMaskView;
        this.f36868d = themeableLottieAnimationView;
        this.f36869e = imageView;
        this.f36870f = view3;
        this.f36871g = view4;
        this.f36872h = pi2ProgressArcView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View a10;
        View a11;
        int i10 = r.f34664d;
        View a12 = r5.b.a(view, i10);
        if (a12 != null) {
            i10 = r.f34676l;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) r5.b.a(view, i10);
            if (pi2CircleMaskView != null) {
                i10 = r.f34684t;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                if (themeableLottieAnimationView != null) {
                    i10 = r.f34685u;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null && (a10 = r5.b.a(view, (i10 = r.f34689y))) != null && (a11 = r5.b.a(view, (i10 = r.A))) != null) {
                        i10 = r.M;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) r5.b.a(view, i10);
                        if (pi2ProgressArcView != null) {
                            return new b(view, a12, pi2CircleMaskView, themeableLottieAnimationView, imageView, a10, a11, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(s.b, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f36866a;
    }
}
