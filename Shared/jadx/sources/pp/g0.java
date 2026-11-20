package pp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.g0;
import ym.ViewEnvironment;
import ym.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006+"}, d2 = {"Lpp/g0;", "Lym/b;", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lqp/c;", "binding", "l", "(Lqp/c;)V", "rendering", "Lym/y;", "viewEnvironment", "p", "(Lqp/c;Lpp/g0;Lym/y;)V", "", "isWrappingButtons", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lqp/c;Z)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "c", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "Lym/a0;", "h", "Lym/a0;", "()Lym/a0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g0 implements ym.b<g0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String titleText;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String messageText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String positiveButtonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onPositiveButtonClick;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String negativeButtonText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onNegativeButtonClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ym.a0<g0> viewFactory;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"pp/g0$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f28892a;

        public a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f28892a = bottomSheetBehavior;
        }

        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f28892a;
            view.postDelayed(new Runnable() { // from class: pp.f0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.a.b(BottomSheetBehavior.this);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, qp.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28893a = new b();

        public b() {
            super(3, qp.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
        }

        public final qp.c d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return qp.c.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ qp.c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public g0(@NotNull String titleText, @NotNull String messageText, @NotNull String positiveButtonText, @Nullable StepStyle stepStyle, @NotNull Function0<Unit> onPositiveButtonClick, @NotNull String negativeButtonText, @NotNull Function0<Unit> onNegativeButtonClick) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        this.titleText = titleText;
        this.messageText = messageText;
        this.positiveButtonText = positiveButtonText;
        this.styles = stepStyle;
        this.onPositiveButtonClick = onPositiveButtonClick;
        this.negativeButtonText = negativeButtonText;
        this.onNegativeButtonClick = onNegativeButtonClick;
        k.Companion companion = ym.k.INSTANCE;
        this.viewFactory = new ym.x(kotlin.jvm.internal.d0.b(g0.class), b.f28893a, new Function1() { // from class: pp.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ym.k u8;
                u8 = g0.u(g0.this, (qp.c) obj);
                return u8;
            }
        });
    }

    public static final Unit m(g0 g0Var) {
        g0Var.onNegativeButtonClick.invoke();
        return Unit.f22894a;
    }

    public static final void n(View view) {
    }

    public static final void o(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final Unit q(qp.c cVar, g0 g0Var) {
        boolean z10 = true;
        if (cVar.f30005f.getLineCount() > 1 || cVar.f30006g.getLineCount() > 1) {
            PersonaMaterialButton negativeButton = cVar.f30005f;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = cVar.f30003d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            PersonaMaterialButton positiveButton = cVar.f30006g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = cVar.f30003d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            cVar.f30003d.setReferencedIds(new int[]{cVar.f30006g.getId(), cVar.f30005f.getId()});
        } else {
            z10 = false;
        }
        g0Var.k(g0Var.styles, cVar, z10);
        return Unit.f22894a;
    }

    public static final void r(g0 g0Var, View view) {
        g0Var.onPositiveButtonClick.invoke();
    }

    public static final void s(g0 g0Var, View view) {
        g0Var.onNegativeButtonClick.invoke();
    }

    public static final Unit t(g0 g0Var) {
        g0Var.onNegativeButtonClick.invoke();
        return Unit.f22894a;
    }

    public static final ym.k u(final g0 g0Var, final qp.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        g0Var.l(it);
        return new ym.k() { // from class: pp.x
            @Override // ym.k
            public final void b(Object obj, ViewEnvironment viewEnvironment) {
                g0.v(g0.this, it, (g0) obj, viewEnvironment);
            }
        };
    }

    public static final void v(g0 g0Var, qp.c cVar, g0 rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNull(cVar);
        g0Var.p(cVar, rendering, viewEnvironment);
    }

    @Override // ym.b
    @NotNull
    public ym.a0<g0> a() {
        return this.viewFactory;
    }

    public final void k(StepStyle styles, qp.c binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f30002c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        hr.c.c(bottomSheet, styles, bottomSheetContent, null, false, 12, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f30008i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            hr.h0.l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f30004e;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            hr.h0.l(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton positiveButton = binding.f30006g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            hr.e.h(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, false, 10, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton negativeButton = binding.f30005f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        hr.e.h(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, false, 10, null);
    }

    public final void l(qp.c binding) {
        int d10;
        Integer backgroundColorValue;
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(binding.b);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        Function0 function0 = new Function0() { // from class: pp.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m10;
                m10 = g0.m(g0.this);
                return m10;
            }
        };
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(q02, function0, bottomSheet, null, binding.f30007h);
        binding.getRoot().addOnAttachStateChangeListener(new a(q02));
        binding.b.setOnClickListener(new View.OnClickListener() { // from class: pp.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.n(view);
            }
        });
        binding.f30007h.setOnClickListener(new View.OnClickListener() { // from class: pp.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.o(BottomSheetBehavior.this, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            d10 = hq.z.d(context, ic.b.f20408o, null, false, 6, null);
        } else {
            d10 = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(mp.g.f24673a, Integer.valueOf(d10));
    }

    public final void p(final qp.c binding, final g0 rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView title = binding.f30008i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            cr.h.e(title, this.titleText);
        } else {
            binding.f30008i.setVisibility(8);
        }
        TextView message = binding.f30004e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        cr.h.e(message, this.messageText);
        binding.f30006g.setText(rendering.positiveButtonText);
        binding.f30006g.setOnClickListener(new View.OnClickListener() { // from class: pp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.r(g0.this, view);
            }
        });
        binding.f30005f.setText(rendering.negativeButtonText);
        binding.f30005f.setOnClickListener(new View.OnClickListener() { // from class: pp.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.s(g0.this, view);
            }
        });
        FrameLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ym.e.c(bottomSheet, new Function0() { // from class: pp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit t8;
                t8 = g0.t(g0.this);
                return t8;
            }
        });
        PersonaMaterialButton negativeButton = binding.f30005f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        uq.z.b(negativeButton, new Function0() { // from class: pp.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q10;
                q10 = g0.q(qp.c.this, this);
                return q10;
            }
        });
    }
}
