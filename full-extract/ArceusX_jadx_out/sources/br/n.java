package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import hr.e0;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl.t;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001f\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b'\u0010!\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lbr/n;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lbr/o;", "viewModel", "Lkotlin/Function0;", "", "onDismissed", "onLaunchAction", "onSecondaryLaunchAction", "x", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lbr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onClose", "", "n", "(Lkotlin/jvm/functions/Function0;)Z", "F", "()V", "u", ve.a.f33391e, "Landroid/view/ViewGroup;", "Lgt/h;", "Llq/d;", "Lkotlin/jvm/internal/EnhancedNullability;", j6.b.f21518e, "Lgt/h;", "lazyBinding", "c", "Z", "setup", rl.d.f30696a, "Lkotlin/jvm/functions/Function0;", "currentOnDismissed", "value", "e", t.f38095d, "(Z)V", "isShowing", "r", "()Llq/d;", "getBinding$delegate", "(Lbr/n;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h<lq.d> lazyBinding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> currentOnDismissed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowing;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"br/n$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", j6.b.f21518e, "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f4420a;
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> b;

        public a(Function0<Unit> function0, BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f4420a = function0;
            this.b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 5) {
                this.f4420a.invoke();
                this.b.F0(this);
            }
        }
    }

    public n(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = gt.i.b(new Function0() { // from class: br.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                lq.d s8;
                s8 = n.s(n.this);
                return s8;
            }
        });
        this.currentOnDismissed = new Function0() { // from class: br.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q10;
                q10 = n.q();
                return q10;
            }
        };
    }

    public static final void A(n nVar) {
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(nVar.r().f23833d);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        q02.X0(3);
    }

    public static final void B(n nVar, final Function0 function0, View view) {
        nVar.n(new Function0() { // from class: br.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit C;
                C = n.C(Function0.this);
                return C;
            }
        });
    }

    public static final Unit C(Function0 function0) {
        function0.invoke();
        return Unit.f22894a;
    }

    public static final void D(n nVar, final Function0 function0, View view) {
        nVar.n(new Function0() { // from class: br.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit E;
                E = n.E(Function0.this);
                return E;
            }
        });
    }

    public static final Unit E(Function0 function0) {
        function0.invoke();
        return Unit.f22894a;
    }

    public static final Unit G(lq.d dVar) {
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(dVar.f23833d);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        q02.X0(5);
        FrameLayout root = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ym.e.c(root, null);
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(n nVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: br.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit p8;
                    p8 = n.p();
                    return p8;
                }
            };
        }
        return nVar.n(function0);
    }

    public static final Unit p() {
        return Unit.f22894a;
    }

    public static final Unit q() {
        return Unit.f22894a;
    }

    public static final lq.d s(n nVar) {
        return lq.d.c(LayoutInflater.from(nVar.contentView.getContext()), nVar.contentView, true);
    }

    public static final Unit v(n nVar) {
        nVar.t(false);
        nVar.currentOnDismissed.invoke();
        return Unit.f22894a;
    }

    public static final void w(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void y(n nVar, View view) {
        o(nVar, null, 1, null);
    }

    public static final Unit z(n nVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = nVar.r().f23832c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomInset.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public final void F() {
        final lq.d r8 = r();
        if (r8 == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout root = r8.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ym.e.c(root, new Function0() { // from class: br.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit G;
                    G = n.G(lq.d.this);
                    return G;
                }
            });
        } else {
            FrameLayout root2 = r8.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            ym.e.c(root2, null);
        }
    }

    public final boolean n(@Nullable Function0<Unit> onClose) {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(r().f23833d);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        if (onClose != null) {
            q02.c0(new a(onClose, q02));
        }
        if (q02.v0() == 5) {
            return false;
        }
        q02.X0(5);
        return true;
    }

    public final lq.d r() {
        return this.lazyBinding.getValue();
    }

    public final void t(boolean z10) {
        this.isShowing = z10;
        F();
    }

    public final void u() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(r().f23833d);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        q02.Z0(true);
        Function0 function0 = new Function0() { // from class: br.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit v5;
                v5 = n.v(n.this);
                return v5;
            }
        };
        FrameLayout bottomSheet = r().f23833d;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(q02, function0, bottomSheet, r().f23834e, r().f23839j);
        r().f23839j.setOnClickListener(new View.OnClickListener() { // from class: br.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.w(BottomSheetBehavior.this, view);
            }
        });
    }

    public final void x(@Nullable StepStyles.UiStepStyle styles, @NotNull HelpBottomSheetViewModel viewModel, @NotNull Function0<Unit> onDismissed, @Nullable final Function0<Unit> onLaunchAction, @Nullable final Function0<Unit> onSecondaryLaunchAction) {
        ButtonSubmitComponentStyle secondaryButtonStyle;
        ButtonSubmitComponentStyle launchButtonStyle;
        StepStyles.UiStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        Integer fillColorValue;
        Integer strokeColorValue;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        this.currentOnDismissed = onDismissed;
        u();
        t(true);
        if (onLaunchAction != null) {
            r().b.setOnClickListener(new View.OnClickListener() { // from class: br.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.B(n.this, onLaunchAction, view);
                }
            });
        }
        if (onSecondaryLaunchAction != null) {
            r().f23838i.setOnClickListener(new View.OnClickListener() { // from class: br.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.D(n.this, onSecondaryLaunchAction, view);
                }
            });
        }
        r rVar = new r(viewModel.getComponentStyle());
        rVar.G(viewModel.e());
        r().f23841l.setAdapter(rVar);
        Pi2DotsTabIndicator dotsIndicator = r().f23836g;
        Intrinsics.checkNotNullExpressionValue(dotsIndicator, "dotsIndicator");
        if (rVar.e() > 1) {
            dotsIndicator.setVisibility(0);
        } else {
            dotsIndicator.setVisibility(8);
        }
        if (styles != null && (strokeColorValue = styles.getStrokeColorValue()) != null) {
            dotsIndicator.setSelectedDotColor(strokeColorValue.intValue());
        }
        if (styles != null && (fillColorValue = styles.getFillColorValue()) != null) {
            dotsIndicator.setDotsColor(fillColorValue.intValue());
        }
        ViewPager2 viewPager = r().f23841l;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        dotsIndicator.n(viewPager);
        String title = viewModel.getTitle();
        if (title != null) {
            r().f23840k.setText(title);
        }
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base = titleStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            TextView title2 = r().f23840k;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            h0.k(title2, base2, q0.g(e0.f19692c, e0.f19691a));
        }
        if (onLaunchAction != null) {
            String buttonText = viewModel.getButtonText();
            if (buttonText != null) {
                r().b.setText(buttonText);
            }
            HelpBottomSheetComponentStyle componentStyle = viewModel.getComponentStyle();
            if (componentStyle != null && (launchButtonStyle = componentStyle.getLaunchButtonStyle()) != null) {
                MaterialButton actionButton = r().b;
                Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
                hr.e.h(actionButton, launchButtonStyle, false, false, true, 6, null);
            }
            r().b.setVisibility(0);
        } else {
            r().b.setVisibility(8);
        }
        if (onSecondaryLaunchAction == null || viewModel.getSecondaryButtonActionComponentName() == null) {
            r().f23838i.setVisibility(8);
        } else {
            String secondaryButtonText = viewModel.getSecondaryButtonText();
            if (secondaryButtonText != null) {
                r().f23838i.setText(secondaryButtonText);
            }
            HelpBottomSheetComponentStyle componentStyle2 = viewModel.getComponentStyle();
            if (componentStyle2 != null && (secondaryButtonStyle = componentStyle2.getSecondaryButtonStyle()) != null) {
                MaterialButton secondaryActionButton = r().f23838i;
                Intrinsics.checkNotNullExpressionValue(secondaryActionButton, "secondaryActionButton");
                hr.e.h(secondaryActionButton, secondaryButtonStyle, false, false, true, 6, null);
            }
            r().f23838i.setVisibility(0);
        }
        r().f23835f.setOnClickListener(new View.OnClickListener() { // from class: br.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.y(n.this, view);
            }
        });
        LinearLayout bottomSheetContent = r().f23834e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        hr.c.c(bottomSheetContent, styles, null, null, true, 6, null);
        Space bottomInset = r().f23832c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        uq.g.g(bottomInset, new Function1() { // from class: br.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit z10;
                z10 = n.z(n.this, (WindowInsetsCompat) obj);
                return z10;
            }
        });
        r().getRoot().postDelayed(new Runnable() { // from class: br.k
            @Override // java.lang.Runnable
            public final void run() {
                n.A(n.this);
            }
        }, 100L);
    }
}
