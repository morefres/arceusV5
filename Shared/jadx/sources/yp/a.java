package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import wp.r;
import wp.s;

/* loaded from: classes3.dex */
public final class a implements r5.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36853a;

    @NonNull
    public final Button b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f36854c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f36855d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f36856e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f36857f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f36858g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36859h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final Barrier f36860i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f36861j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreviewView f36862k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final OldSelfieOverlayView f36863l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f36864m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f36865n;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull OldSelfieOverlayView oldSelfieOverlayView, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f36853a = constraintLayout;
        this.b = button;
        this.f36854c = camera2PreviewView;
        this.f36855d = view;
        this.f36856e = textView;
        this.f36857f = textView2;
        this.f36858g = progressBar;
        this.f36859h = pi2NavigationBar;
        this.f36860i = barrier;
        this.f36861j = frameLayout;
        this.f36862k = previewView;
        this.f36863l = oldSelfieOverlayView;
        this.f36864m = textView3;
        this.f36865n = textView4;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View a10;
        int i10 = r.f34672h;
        Button button = (Button) r5.b.a(view, i10);
        if (button != null) {
            i10 = r.f34673i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) r5.b.a(view, i10);
            if (camera2PreviewView != null && (a10 = r5.b.a(view, (i10 = r.f34674j))) != null) {
                i10 = r.f34679o;
                TextView textView = (TextView) r5.b.a(view, i10);
                if (textView != null) {
                    i10 = r.f34686v;
                    TextView textView2 = (TextView) r5.b.a(view, i10);
                    if (textView2 != null) {
                        i10 = r.C;
                        ProgressBar progressBar = (ProgressBar) r5.b.a(view, i10);
                        if (progressBar != null) {
                            i10 = r.F;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                            if (pi2NavigationBar != null) {
                                i10 = r.J;
                                Barrier barrier = (Barrier) r5.b.a(view, i10);
                                if (barrier != null) {
                                    i10 = r.K;
                                    FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                                    if (frameLayout != null) {
                                        i10 = r.L;
                                        PreviewView previewView = (PreviewView) r5.b.a(view, i10);
                                        if (previewView != null) {
                                            i10 = r.U;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) r5.b.a(view, i10);
                                            if (oldSelfieOverlayView != null) {
                                                i10 = r.f34661b0;
                                                TextView textView3 = (TextView) r5.b.a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = r.f34671g0;
                                                    TextView textView4 = (TextView) r5.b.a(view, i10);
                                                    if (textView4 != null) {
                                                        return new a((ConstraintLayout) view, button, camera2PreviewView, a10, textView, textView2, progressBar, pi2NavigationBar, barrier, frameLayout, previewView, oldSelfieOverlayView, textView3, textView4);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(s.f34697a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // r5.a
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f36853a;
    }
}
