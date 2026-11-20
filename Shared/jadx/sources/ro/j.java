package ro;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import f7.n0;
import go.OverlayAssets;
import go.l2;
import go.n2;
import go.o2;
import hq.g0;
import hq.z;
import hr.e0;
import hr.h0;
import java.io.File;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o5.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;
import ym.ViewEnvironment;
import zl.t;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJß\u0001\u0010,\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0'H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020$2\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\nR\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lro/j;", "Lro/k;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", ve.a.f33391e, "()V", "Lym/y;", "viewEnvironment", "Lk6/s;", "imageLoader", "", "imagePath", "messageText", "disclaimerText", "acceptText", "retryText", "confirmCaptureTitle", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlayImage", "Lgo/k2;", "overlayAssets", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "iconAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "", "isEnabled", "isProcessing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "error", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "navBarTitle", "Lkotlin/Function0;", "onAcceptImageClick", "onRetryClick", "onCancelClick", "onErrorDismissed", j6.b.f21518e, "(Lym/y;Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lgo/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "y", "(Z)V", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "preferredAxis", "", "originalCallTimestamp", "u", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;J)V", t.f38095d, "Llo/i;", "Llo/i;", "binding", "Landroidx/constraintlayout/widget/c;", "Landroidx/constraintlayout/widget/c;", "constraintSet", "Landroid/view/View;", "c", "Landroid/view/View;", "currentOverlayAssetView", rl.d.f30696a, "Z", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lo.i binding;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.constraintlayout.widget.c constraintSet;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentOverlayAssetView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isProcessing;

    public j(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        lo.i c10 = lo.i.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        this.binding = c10;
        this.constraintSet = new androidx.constraintlayout.widget.c();
    }

    public static final void m(lo.i iVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(iVar.f23737j, "alpha", 0.9f, 0.0f).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
        iVar.getRoot().setHapticFeedbackEnabled(true);
        iVar.getRoot().performHapticFeedback(1, 2);
    }

    public static final void n(lo.i iVar, f7.i iVar2) {
        iVar.f23743p.setProgress(1.0f);
    }

    public static final Unit o(lo.i iVar, String str, s sVar) {
        int f10 = kotlin.ranges.d.f(iVar.f23749v.getMeasuredWidth(), 2000);
        if (f10 > 0) {
            iVar.f23749v.setTag(tp.e.f32368a, str);
            ImageView reviewImage = iVar.f23749v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            ImageRequest.a q10 = x6.j.q(new ImageRequest.a(reviewImage.getContext()).c(new File(str)), reviewImage);
            q10.s(f10, f10);
            q10.j(str);
            sVar.c(q10.b());
        }
        return Unit.f22894a;
    }

    public static final Unit p(Function0 function0) {
        function0.invoke();
        return Unit.f22894a;
    }

    public static final Unit q(Function0 function0) {
        function0.invoke();
        return Unit.f22894a;
    }

    public static final void r(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void s(Function0 function0, View view) {
        function0.invoke();
    }

    public static /* synthetic */ void v(j jVar, StyleElements.Axis axis, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        jVar.u(axis, j10);
    }

    public static final Unit w(lo.i iVar, long j10, final j jVar, StyleElements.Axis axis) {
        boolean z10 = (iVar.b.getLineCount() == 0 || iVar.f23748u.getLineCount() == 0) ? false : true;
        boolean z11 = System.currentTimeMillis() - j10 > 300;
        if (!z10 && !z11) {
            jVar.u(axis, j10);
            return Unit.f22894a;
        }
        if (z10 && (iVar.b.getLineCount() > 1 || iVar.f23748u.getLineCount() > 1 || axis == StyleElements.Axis.VERTICAL)) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            ViewGroup.LayoutParams layoutParams = acceptButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iVar.f23738k.getWidth();
            acceptButton.setLayoutParams(layoutParams);
            PersonaMaterialButton retryButton = iVar.f23748u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            ViewGroup.LayoutParams layoutParams2 = retryButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iVar.f23738k.getWidth();
            retryButton.setLayoutParams(layoutParams2);
            iVar.f23738k.setReferencedIds(new int[]{iVar.b.getId(), iVar.f23748u.getId()});
            jVar.binding.f23739l.setAccessibilityTraversalAfter(n2.f18717w0);
        }
        b0.a(iVar.b, new Runnable() { // from class: ro.i
            @Override // java.lang.Runnable
            public final void run() {
                j.x(j.this);
            }
        });
        return Unit.f22894a;
    }

    public static final void x(j jVar) {
        jVar.t();
    }

    @Override // ro.k
    public void a() {
        CoordinatorLayout cameraScreenContent = this.binding.f23731d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        uq.g.d(cameraScreenContent, false, false, false, false, 15, null);
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f23743p;
        int parseColor = Color.parseColor("#43957D");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.F(parseColor, z.d(context, i.a.f19822z, null, false, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ro.k
    public void b(@NotNull ViewEnvironment viewEnvironment, @NotNull final s imageLoader, @NotNull final String imagePath, @NotNull String messageText, @NotNull String disclaimerText, @NotNull String acceptText, @NotNull String retryText, @NotNull String confirmCaptureTitle, @NotNull Screen.Overlay overlayImage, @NotNull OverlayAssets overlayAssets, @Nullable RemoteImage iconAsset, @NotNull NavigationState navigationState, boolean isEnabled, boolean isProcessing, @Nullable StepStyles.GovernmentIdStepStyle styles, @Nullable String error, @NotNull StyleElements.Axis reviewCaptureButtonsAxis, @Nullable String navBarTitle, @NotNull final Function0<Unit> onAcceptImageClick, @NotNull final Function0<Unit> onRetryClick, @NotNull final Function0<Unit> onCancelClick, @NotNull Function0<Unit> onErrorDismissed) {
        TextBasedComponentStyle textBasedComponentStyle;
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        Intrinsics.checkNotNullParameter(acceptText, "acceptText");
        Intrinsics.checkNotNullParameter(retryText, "retryText");
        Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
        Intrinsics.checkNotNullParameter(overlayImage, "overlayImage");
        Intrinsics.checkNotNullParameter(overlayAssets, "overlayAssets");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
        Intrinsics.checkNotNullParameter(onAcceptImageClick, "onAcceptImageClick");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
        final lo.i iVar = this.binding;
        if (iVar.f23730c.isChecked()) {
            iVar.f23743p.j(new n0() { // from class: ro.b
                @Override // f7.n0
                public final void a(f7.i iVar2) {
                    j.n(lo.i.this, iVar2);
                }
            });
        } else {
            iVar.f23730c.setChecked(true);
            iVar.getRoot().post(new Runnable() { // from class: ro.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.m(lo.i.this);
                }
            });
        }
        Object tag = iVar.f23749v.getTag(tp.e.f32368a);
        if (!Intrinsics.c(tag instanceof String ? (String) tag : null, imagePath)) {
            ImageView reviewImage = iVar.f23749v;
            Intrinsics.checkNotNullExpressionValue(reviewImage, "reviewImage");
            uq.z.b(reviewImage, new Function0() { // from class: ro.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit o8;
                    o8 = j.o(lo.i.this, imagePath, imageLoader);
                    return o8;
                }
            });
        }
        iVar.f23745r.setText(messageText);
        iVar.f23734g.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f23733f.setVisibility(StringsKt.p0(disclaimerText) ? 8 : 0);
        iVar.f23733f.setText(disclaimerText);
        iVar.b.setText(acceptText);
        iVar.f23748u.setText(retryText);
        iVar.f23753z.setText(confirmCaptureTitle);
        TextView textView = iVar.f23753z;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(StringsKt.p0(text) ? 8 : 0);
        Context context = iVar.getRoot().getContext();
        View view = iVar.f23740m;
        Intrinsics.checkNotNull(context);
        view.setBackground(com.withpersona.sdk2.inquiry.governmentid.o.a(context, tp.a.f32347k));
        if (z.b(context, tp.a.f32344h, null, false, false, 14, null)) {
            iVar.f23745r.setGravity(17);
            TextView overlayText = iVar.f23745r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            overlayText.setLayoutParams(marginLayoutParams);
        }
        Integer f10 = z.f(context, tp.a.f32352p, null, false, 6, null);
        if (f10 != null) {
            iVar.f23734g.setImageResource(f10.intValue());
        }
        iVar.f23741n.setImageResource(overlayAssets.getGuideDrawable());
        if (iconAsset == null) {
            textBasedComponentStyle = null;
            iVar.f23743p.setAnimation(overlayAssets.getHintAnimation());
        } else if (this.currentOverlayAssetView == null) {
            ConstraintLayout overlayIconContainer = iVar.f23744q;
            Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
            textBasedComponentStyle = null;
            this.currentOverlayAssetView = jr.c.f(iconAsset, overlayIconContainer, false, 2, null);
            iVar.f23743p.setVisibility(8);
        } else {
            textBasedComponentStyle = null;
        }
        Function0 function0 = new Function0() { // from class: ro.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit p8;
                p8 = j.p(Function0.this);
                return p8;
            }
        };
        Function0 function02 = new Function0() { // from class: ro.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q10;
                q10 = j.q(Function0.this);
                return q10;
            }
        };
        Pi2NavigationBar navigationBar = iVar.f23739l;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout root = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, styles != null ? cr.h.h(styles) : textBasedComponentStyle, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : textBasedComponentStyle, 8, null);
        iVar.b.setOnClickListener(new View.OnClickListener() { // from class: ro.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.r(Function0.this, view2);
            }
        });
        iVar.f23748u.setOnClickListener(new View.OnClickListener() { // from class: ro.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.s(Function0.this, view2);
            }
        });
        iVar.b.setEnabled(isEnabled);
        iVar.f23748u.setEnabled(isEnabled);
        y(isProcessing);
        if (styles != null) {
            l(styles);
            int c10 = l2.b.c(this.binding.getRoot().getContext(), tp.b.f32357a);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tq.c.b(viewEnvironment, context2, c10);
        }
        v(this, reviewCaptureButtonsAxis, 0L, 2, null);
        CoordinatorLayout cameraScreenContent = this.binding.f23731d;
        Intrinsics.checkNotNullExpressionValue(cameraScreenContent, "cameraScreenContent");
        g0.b(cameraScreenContent, error, onErrorDismissed, null, 0, 0, 56, null);
    }

    @Override // ro.k
    @NotNull
    public View getRoot() {
        FrameLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final Unit l(StepStyles.GovernmentIdStepStyle styles) {
        int i10;
        StyleElements.FontWeight fontWeight;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        lo.i iVar = this.binding;
        float a10 = (float) hq.j.a(8.0d);
        int a11 = (int) hq.j.a(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.f23753z;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
            this.binding.f23753z.setTextColor(-1);
        }
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.f23745r;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            h0.k(overlayText, governmentIdCaptureHintTextStyle, p0.c(e0.f19691a));
        }
        Integer governmentIdReviewImageBoxBorderColorValue = styles.getGovernmentIdReviewImageBoxBorderColorValue();
        if (governmentIdReviewImageBoxBorderColorValue != null) {
            i10 = governmentIdReviewImageBoxBorderColorValue.intValue();
            iVar.f23747t.setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{i10}));
        } else {
            i10 = -1;
        }
        TextView disclaimer = this.binding.f23733f;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base5 = textStyle.getBase()) == null || (base6 = base5.getBase()) == null) ? null : base6.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base3 = textStyle2.getBase()) == null || (base4 = base3.getBase()) == null || (fontWeight = base4.getFontWeightValue()) == null) {
            fontWeight = StyleElements.FontWeight.NORMAL;
        }
        h0.i(disclaimer, fontNameValue, fontWeight, null, 4, null);
        Double governmentIdReviewImageBoxBorderRadiusValue = styles.getGovernmentIdReviewImageBoxBorderRadiusValue();
        if (governmentIdReviewImageBoxBorderRadiusValue != null) {
            a10 = (float) hq.j.a(governmentIdReviewImageBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdReviewImageBoxBorderWidthValue = styles.getGovernmentIdReviewImageBoxBorderWidthValue();
        if (governmentIdReviewImageBoxBorderWidthValue != null) {
            a11 = (int) Math.ceil(hq.j.a(governmentIdReviewImageBoxBorderWidthValue.doubleValue()));
        }
        iVar.f23750w.setRadius(a11 + a10);
        View view = iVar.f23740m;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(a10);
        gradientDrawable.setStroke(a11, i10);
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = iVar.f23742o;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a10, a10, a10, a10});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) hq.j.a(6.0d)));
        ButtonSubmitComponentStyle submitPhotoButtonStyleValue = styles.getSubmitPhotoButtonStyleValue();
        if (submitPhotoButtonStyleValue != null) {
            PersonaMaterialButton acceptButton = iVar.b;
            Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
            hr.e.h(acceptButton, submitPhotoButtonStyleValue, false, false, false, 10, null);
        }
        ButtonCancelComponentStyle retakePhotoButtonStyleValue = styles.getRetakePhotoButtonStyleValue();
        if (retakePhotoButtonStyleValue != null) {
            PersonaMaterialButton retryButton = iVar.f23748u;
            Intrinsics.checkNotNullExpressionValue(retryButton, "retryButton");
            hr.e.h(retryButton, retakePhotoButtonStyleValue, false, false, false, 10, null);
        }
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.f23743p.F(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.f23743p.F(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.f23739l.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f23752y.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return null;
        }
        this.binding.f23736i.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
        return Unit.f22894a;
    }

    public final void t() {
        lo.i iVar = this.binding;
        if (iVar.b.getTop() < iVar.f23735h.getBottom() + iVar.getRoot().getContext().getResources().getDimensionPixelOffset(l2.f18654a)) {
            this.constraintSet.e(iVar.getRoot().getContext(), o2.f18734j);
            y.a(this.binding.f23731d, new o5.a());
            this.constraintSet.c(this.binding.f23732e);
        }
    }

    public final void u(final StyleElements.Axis preferredAxis, final long originalCallTimestamp) {
        final lo.i iVar = this.binding;
        PersonaMaterialButton acceptButton = iVar.b;
        Intrinsics.checkNotNullExpressionValue(acceptButton, "acceptButton");
        uq.z.b(acceptButton, new Function0() { // from class: ro.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit w5;
                w5 = j.w(lo.i.this, originalCallTimestamp, this, preferredAxis);
                return w5;
            }
        });
    }

    public final void y(boolean isProcessing) {
        if (this.isProcessing == isProcessing) {
            return;
        }
        this.isProcessing = isProcessing;
        lo.i iVar = this.binding;
        o5.b0 t02 = new o5.b0().D0(new o5.e(3)).D0(new o5.b()).D0(new o5.c()).D0(new o5.d()).M0(0).t0(300L);
        Intrinsics.checkNotNullExpressionValue(t02, "setDuration(...)");
        y.a(iVar.getRoot(), t02);
        if (isProcessing) {
            iVar.f23746s.setVisibility(0);
            iVar.f23735h.setVisibility(4);
            iVar.b.setVisibility(4);
            iVar.f23748u.setVisibility(4);
            iVar.f23742o.setVisibility(4);
            return;
        }
        iVar.f23746s.setVisibility(4);
        iVar.f23735h.setVisibility(0);
        iVar.b.setVisibility(0);
        iVar.f23748u.setVisibility(0);
        iVar.f23742o.setVisibility(0);
    }
}
