package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import go.n2;
import go.o2;

/* loaded from: classes3.dex */
public final class b implements r5.a {

    @NonNull
    public final PreviewView A;

    @NonNull
    public final ProgressBar B;

    @NonNull
    public final LottieAnimationView C;

    @NonNull
    public final ScanningView D;

    @NonNull
    public final SpotlightView E;

    @NonNull
    public final Guideline F;

    @NonNull
    public final StaticCaptureTipsView G;

    @NonNull
    public final TextView H;

    @NonNull
    public final Space I;

    @NonNull
    public final TextView J;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23665a;

    @NonNull
    public final Space b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f23666c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f23667d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23668e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f23669f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f23670g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f23671h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f23672i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f23673j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23674k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final Guideline f23675l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ToggleButton f23676m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f23677n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23678o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23679p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final View f23680q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ImageView f23681r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23682s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f23683t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23684u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f23685v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final Barrier f23686w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23687x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f23688y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final Barrier f23689z;

    public b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ToggleButton toggleButton, @NonNull TextView textView4, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView5, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull StaticCaptureTipsView staticCaptureTipsView, @NonNull TextView textView6, @NonNull Space space3, @NonNull TextView textView7) {
        this.f23665a = frameLayout;
        this.b = space;
        this.f23666c = camera2PreviewView;
        this.f23667d = progressBar;
        this.f23668e = constraintLayout;
        this.f23669f = button;
        this.f23670g = space2;
        this.f23671h = textView;
        this.f23672i = textView2;
        this.f23673j = textView3;
        this.f23674k = linearLayout;
        this.f23675l = guideline;
        this.f23676m = toggleButton;
        this.f23677n = textView4;
        this.f23678o = frameLayout2;
        this.f23679p = pi2NavigationBar;
        this.f23680q = view;
        this.f23681r = imageView;
        this.f23682s = constraintLayout2;
        this.f23683t = themeableLottieAnimationView;
        this.f23684u = constraintLayout3;
        this.f23685v = textView5;
        this.f23686w = barrier;
        this.f23687x = frameLayout3;
        this.f23688y = view2;
        this.f23689z = barrier2;
        this.A = previewView;
        this.B = progressBar2;
        this.C = lottieAnimationView;
        this.D = scanningView;
        this.E = spotlightView;
        this.F = guideline2;
        this.G = staticCaptureTipsView;
        this.H = textView6;
        this.I = space3;
        this.J = textView7;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View a10;
        View a11;
        int i10 = n2.f18686h;
        Space space = (Space) r5.b.a(view, i10);
        if (space != null) {
            i10 = n2.f18688i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
            if (camera2PreviewView != null) {
                i10 = n2.f18692k;
                ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                if (progressBar != null) {
                    i10 = n2.f18696m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = n2.f18698n;
                        Button button = (Button) r5.b.a(view, i10);
                        if (button != null) {
                            i10 = n2.f18700o;
                            Space space2 = (Space) r5.b.a(view, i10);
                            if (space2 != null) {
                                i10 = n2.f18702p;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n2.f18720y;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.f18722z;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = n2.B;
                                            LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = n2.D;
                                                Guideline guideline = (Guideline) r5.b.a(view, i10);
                                                if (guideline != null) {
                                                    i10 = n2.H;
                                                    ToggleButton toggleButton = (ToggleButton) r5.b.a(view, i10);
                                                    if (toggleButton != null) {
                                                        i10 = n2.M;
                                                        TextView textView4 = (TextView) r5.b.a(view, i10);
                                                        if (textView4 != null) {
                                                            i10 = n2.Z;
                                                            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                                            if (frameLayout != null) {
                                                                i10 = n2.f18679d0;
                                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                                                if (pi2NavigationBar != null && (a10 = r5.b.a(view, (i10 = n2.f18681e0))) != null) {
                                                                    i10 = n2.f18683f0;
                                                                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                                                                    if (imageView != null) {
                                                                        i10 = n2.f18685g0;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = n2.f18687h0;
                                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) r5.b.a(view, i10);
                                                                            if (themeableLottieAnimationView != null) {
                                                                                i10 = n2.f18689i0;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) r5.b.a(view, i10);
                                                                                if (constraintLayout3 != null) {
                                                                                    i10 = n2.f18691j0;
                                                                                    TextView textView5 = (TextView) r5.b.a(view, i10);
                                                                                    if (textView5 != null) {
                                                                                        i10 = n2.f18699n0;
                                                                                        Barrier barrier = (Barrier) r5.b.a(view, i10);
                                                                                        if (barrier != null) {
                                                                                            i10 = n2.f18701o0;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                                                                            if (frameLayout2 != null && (a11 = r5.b.a(view, (i10 = n2.f18703p0))) != null) {
                                                                                                i10 = n2.f18705q0;
                                                                                                Barrier barrier2 = (Barrier) r5.b.a(view, i10);
                                                                                                if (barrier2 != null) {
                                                                                                    i10 = n2.f18707r0;
                                                                                                    PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                                                                                    if (previewView != null) {
                                                                                                        i10 = n2.f18711t0;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) r5.b.a(view, i10);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i10 = n2.f18721y0;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) r5.b.a(view, i10);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i10 = n2.f18723z0;
                                                                                                                ScanningView scanningView = (ScanningView) r5.b.a(view, i10);
                                                                                                                if (scanningView != null) {
                                                                                                                    i10 = n2.B0;
                                                                                                                    SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                                                    if (spotlightView != null) {
                                                                                                                        i10 = n2.D0;
                                                                                                                        Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                                                        if (guideline2 != null) {
                                                                                                                            i10 = n2.E0;
                                                                                                                            StaticCaptureTipsView staticCaptureTipsView = (StaticCaptureTipsView) r5.b.a(view, i10);
                                                                                                                            if (staticCaptureTipsView != null) {
                                                                                                                                i10 = n2.L0;
                                                                                                                                TextView textView6 = (TextView) r5.b.a(view, i10);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = n2.M0;
                                                                                                                                    Space space3 = (Space) r5.b.a(view, i10);
                                                                                                                                    if (space3 != null) {
                                                                                                                                        i10 = n2.P0;
                                                                                                                                        TextView textView7 = (TextView) r5.b.a(view, i10);
                                                                                                                                        if (textView7 != null) {
                                                                                                                                            return new b((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayout, button, space2, textView, textView2, textView3, linearLayout, guideline, toggleButton, textView4, frameLayout, pi2NavigationBar, a10, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView5, barrier, frameLayout2, a11, barrier2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, guideline2, staticCaptureTipsView, textView6, space3, textView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(o2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23665a;
    }
}
