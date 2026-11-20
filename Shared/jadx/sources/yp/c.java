package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class c implements r5.a {

    @NonNull
    public final SpotlightView A;

    @NonNull
    public final Guideline B;

    @NonNull
    public final TextView C;

    @NonNull
    public final Space D;

    @NonNull
    public final ImageView E;

    @NonNull
    public final Space F;

    @NonNull
    public final TextView G;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36873a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36874c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f36875d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f36876e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f36877f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f36878g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f36879h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f36880i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f36881j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final Guideline f36882k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36883l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f36884m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f36885n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ProgressBar f36886o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36887p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f36888q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final Barrier f36889r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36890s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final PreviewView f36891t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f36892u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f36893v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36894w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f36895x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final View f36896y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final SelfieOverlayView f36897z;

    public c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull Space space, @NonNull ImageView imageView, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view2, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout2, @NonNull PreviewView previewView, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView7, @NonNull View view3, @NonNull SelfieOverlayView selfieOverlayView, @NonNull SpotlightView spotlightView, @NonNull Guideline guideline2, @NonNull TextView textView8, @NonNull Space space2, @NonNull ImageView imageView3, @NonNull Space space3, @NonNull TextView textView9) {
        this.f36873a = constraintLayout;
        this.b = textView;
        this.f36874c = circularProgressIndicator;
        this.f36875d = space;
        this.f36876e = imageView;
        this.f36877f = camera2PreviewView;
        this.f36878g = view;
        this.f36879h = textView2;
        this.f36880i = textView3;
        this.f36881j = view2;
        this.f36882k = guideline;
        this.f36883l = frameLayout;
        this.f36884m = textView4;
        this.f36885n = textView5;
        this.f36886o = progressBar;
        this.f36887p = pi2NavigationBar;
        this.f36888q = imageView2;
        this.f36889r = barrier;
        this.f36890s = frameLayout2;
        this.f36891t = previewView;
        this.f36892u = circularProgressIndicator2;
        this.f36893v = textView6;
        this.f36894w = constraintLayout2;
        this.f36895x = textView7;
        this.f36896y = view3;
        this.f36897z = selfieOverlayView;
        this.A = spotlightView;
        this.B = guideline2;
        this.C = textView8;
        this.D = space2;
        this.E = imageView3;
        this.F = space3;
        this.G = textView9;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View a10;
        View a11;
        View a12;
        int i10 = r.b;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = r.f34662c;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) r5.b.a(view, i10);
            if (circularProgressIndicator != null) {
                i10 = r.f34670g;
                Space space = (Space) r5.b.a(view, i10);
                if (space != null) {
                    i10 = r.f34672h;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null) {
                        i10 = r.f34673i;
                        Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
                        if (camera2PreviewView != null && (a10 = r5.b.a(view, (i10 = r.f34674j))) != null) {
                            i10 = r.f34675k;
                            TextView textView2 = (TextView) r5.b.a(view, i10);
                            if (textView2 != null) {
                                i10 = r.f34679o;
                                TextView textView3 = (TextView) r5.b.a(view, i10);
                                if (textView3 != null && (a11 = r5.b.a(view, (i10 = r.f34680p))) != null) {
                                    i10 = r.f34681q;
                                    Guideline guideline = (Guideline) r5.b.a(view, i10);
                                    if (guideline != null) {
                                        i10 = r.f34682r;
                                        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = r.f34687w;
                                            TextView textView4 = (TextView) r5.b.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = r.f34688x;
                                                TextView textView5 = (TextView) r5.b.a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = r.C;
                                                    ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                                                    if (progressBar != null) {
                                                        i10 = r.F;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                                                        if (pi2NavigationBar != null) {
                                                            i10 = r.H;
                                                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
                                                            if (imageView2 != null) {
                                                                i10 = r.J;
                                                                Barrier barrier = (Barrier) r5.b.a(view, i10);
                                                                if (barrier != null) {
                                                                    i10 = r.K;
                                                                    FrameLayout frameLayout2 = (FrameLayout) r5.b.a(view, i10);
                                                                    if (frameLayout2 != null) {
                                                                        i10 = r.L;
                                                                        PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                                                        if (previewView != null) {
                                                                            i10 = r.N;
                                                                            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) r5.b.a(view, i10);
                                                                            if (circularProgressIndicator2 != null) {
                                                                                i10 = r.O;
                                                                                TextView textView6 = (TextView) r5.b.a(view, i10);
                                                                                if (textView6 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    i10 = r.R;
                                                                                    TextView textView7 = (TextView) r5.b.a(view, i10);
                                                                                    if (textView7 != null && (a12 = r5.b.a(view, (i10 = r.S))) != null) {
                                                                                        i10 = r.T;
                                                                                        SelfieOverlayView selfieOverlayView = (SelfieOverlayView) r5.b.a(view, i10);
                                                                                        if (selfieOverlayView != null) {
                                                                                            i10 = r.V;
                                                                                            SpotlightView spotlightView = (SpotlightView) r5.b.a(view, i10);
                                                                                            if (spotlightView != null) {
                                                                                                i10 = r.X;
                                                                                                Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                                                                                if (guideline2 != null) {
                                                                                                    i10 = r.f34661b0;
                                                                                                    TextView textView8 = (TextView) r5.b.a(view, i10);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = r.f34663c0;
                                                                                                        Space space2 = (Space) r5.b.a(view, i10);
                                                                                                        if (space2 != null) {
                                                                                                            i10 = r.f34665d0;
                                                                                                            ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = r.f34667e0;
                                                                                                                Space space3 = (Space) r5.b.a(view, i10);
                                                                                                                if (space3 != null) {
                                                                                                                    i10 = r.f34671g0;
                                                                                                                    TextView textView9 = (TextView) r5.b.a(view, i10);
                                                                                                                    if (textView9 != null) {
                                                                                                                        return new c(constraintLayout, textView, circularProgressIndicator, space, imageView, camera2PreviewView, a10, textView2, textView3, a11, guideline, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, barrier, frameLayout2, previewView, circularProgressIndicator2, textView6, constraintLayout, textView7, a12, selfieOverlayView, spotlightView, guideline2, textView8, space2, imageView3, space3, textView9);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s.f34698c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36873a;
    }
}
