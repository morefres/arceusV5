package ko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lko/h;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lko/a;", "viewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lko/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "o", "()V", "h", ve.a.f33391e, "Landroid/view/ViewGroup;", "Llo/c;", j6.b.f21518e, "Llo/c;", "binding", "", "value", "c", "Z", "g", "(Z)V", "isShowing", rl.d.f30696a, "setup", "Landroid/view/View;", "e", "Landroid/view/View;", "currentAssetIllustrationView", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* renamed from: b, reason: from kotlin metadata */
    @Nullable
    public lo.c binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isShowing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentAssetIllustrationView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22890a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.f10747d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.f10748e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.b.f10750g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22890a = iArr;
        }
    }

    public h(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    public static final Unit i(h hVar) {
        hVar.g(false);
        return Unit.f22894a;
    }

    public static final void j(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void k(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final Unit m(lo.c cVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = cVar.b;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomInset.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final void n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
        bottomSheetBehavior.Z0(true);
    }

    public static final Unit p(lo.c cVar) {
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(cVar.f23691c);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        q02.X0(5);
        FrameLayout root = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ym.e.c(root, null);
        return Unit.f22894a;
    }

    public final void g(boolean z10) {
        this.isShowing = z10;
        o();
    }

    public final void h() {
        lo.c cVar = this.binding;
        if (cVar == null || this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(cVar.f23691c);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        Function0 function0 = new Function0() { // from class: ko.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = h.i(h.this);
                return i10;
            }
        };
        FrameLayout bottomSheet = cVar.f23691c;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(q02, function0, bottomSheet, cVar.f23692d, cVar.f23698j);
        cVar.f23698j.setOnClickListener(new View.OnClickListener() { // from class: ko.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.j(BottomSheetBehavior.this, view);
            }
        });
        cVar.f23694f.setOnClickListener(new View.OnClickListener() { // from class: ko.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.k(BottomSheetBehavior.this, view);
            }
        });
        q02.Z0(true);
    }

    public final void l(@Nullable StepStyles.GovernmentIdStepStyle styles, @NotNull BottomSheetCaptureTipsViewModel viewModel, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage assetConfig) {
        RemoteImage idFrontHelpModalPictograph;
        StyleElements.SizeSet modalPaddingValue;
        Double dp2;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        final lo.c cVar = this.binding;
        if (cVar == null) {
            cVar = lo.c.c(LayoutInflater.from(this.contentView.getContext()), this.contentView, true);
            Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
        }
        this.binding = cVar;
        h();
        g(true);
        TextView title = cVar.f23700l;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        cr.h.e(title, viewModel.getTitle());
        TextView prompt = cVar.f23697i;
        Intrinsics.checkNotNullExpressionValue(prompt, "prompt");
        cr.h.e(prompt, viewModel.getPrompt());
        cVar.f23694f.setText(viewModel.getButtonText());
        LinearLayout tipsContainer = cVar.f23699k;
        Intrinsics.checkNotNullExpressionValue(tipsContainer, "tipsContainer");
        cr.a.e(tipsContainer, viewModel.getTips(), (styles == null || (textStyle2 = styles.getTextStyle()) == null || (base7 = textStyle2.getBase()) == null) ? null : base7.getBase());
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(cVar.f23691c);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView title2 = cVar.f23700l;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            h0.l(title2, base6, null, 2, null);
        }
        if (styles != null && (textStyle = styles.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView prompt2 = cVar.f23697i;
            Intrinsics.checkNotNullExpressionValue(prompt2, "prompt");
            h0.l(prompt2, base4, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyle = styles.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            PersonaMaterialButton continueButton = cVar.f23694f;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            hr.e.h(continueButton, base2, false, false, false, 14, null);
        }
        LinearLayout bottomSheetContent = cVar.f23692d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        hr.c.c(bottomSheetContent, styles, null, null, false, 14, null);
        if (styles != null && (modalPaddingValue = styles.getModalPaddingValue()) != null) {
            PersonaMaterialButton continueButton2 = cVar.f23694f;
            Intrinsics.checkNotNullExpressionValue(continueButton2, "continueButton");
            ViewGroup.LayoutParams layoutParams = continueButton2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top != null && (dp2 = top.getDp()) != null) {
                marginLayoutParams.topMargin = (int) hq.j.a(dp2.doubleValue());
            }
            continueButton2.setLayoutParams(marginLayoutParams);
        }
        IdConfig.b side = viewModel.getSide();
        int[] iArr = a.f22890a;
        int i10 = iArr[side.ordinal()];
        if (i10 == 1) {
            if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
            }
            idFrontHelpModalPictograph = null;
        } else if (i10 == 2) {
            if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdBackHelpModalPictograph();
            }
            idFrontHelpModalPictograph = null;
        } else if (i10 != 3) {
            if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
            }
            idFrontHelpModalPictograph = null;
        } else {
            if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getBarcodeHelpModalPictograph();
            }
            idFrontHelpModalPictograph = null;
        }
        if (idFrontHelpModalPictograph == null) {
            int i11 = iArr[viewModel.getSide().ordinal()];
            cVar.f23695g.setAnimation(i11 != 1 ? i11 != 2 ? i11 != 3 ? tp.f.f32370c : tp.f.b : tp.f.f32369a : tp.f.f32370c);
            int i12 = iArr[viewModel.getSide().ordinal()];
            if (i12 == 2) {
                ThemeableLottieAnimationView illustration = cVar.f23695g;
                Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
                hr.g.m(illustration, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, null, new String[0], 68, null);
            } else if (i12 != 3) {
                ThemeableLottieAnimationView illustration2 = cVar.f23695g;
                Intrinsics.checkNotNullExpressionValue(illustration2, "illustration");
                hr.g.m(illustration2, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, null, new String[0], 68, null);
            } else {
                ThemeableLottieAnimationView illustration3 = cVar.f23695g;
                Intrinsics.checkNotNullExpressionValue(illustration3, "illustration");
                hr.g.m(illustration3, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, null, new String[0], 68, null);
            }
        } else if (this.currentAssetIllustrationView == null) {
            ConstraintLayout illustrationContainer = cVar.f23696h;
            Intrinsics.checkNotNullExpressionValue(illustrationContainer, "illustrationContainer");
            this.currentAssetIllustrationView = jr.c.f(idFrontHelpModalPictograph, illustrationContainer, false, 2, null);
            cVar.f23695g.setVisibility(8);
        }
        Space bottomInset = cVar.b;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        uq.g.g(bottomInset, new Function1() { // from class: ko.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit m10;
                m10 = h.m(lo.c.this, (WindowInsetsCompat) obj);
                return m10;
            }
        });
        cVar.getRoot().postDelayed(new Runnable() { // from class: ko.c
            @Override // java.lang.Runnable
            public final void run() {
                h.n(BottomSheetBehavior.this);
            }
        }, 200L);
    }

    public final void o() {
        final lo.c cVar = this.binding;
        if (cVar == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout root = cVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ym.e.c(root, new Function0() { // from class: ko.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit p8;
                    p8 = h.p(lo.c.this);
                    return p8;
                }
            });
        } else {
            FrameLayout root2 = cVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            ym.e.c(root2, null);
        }
    }
}
