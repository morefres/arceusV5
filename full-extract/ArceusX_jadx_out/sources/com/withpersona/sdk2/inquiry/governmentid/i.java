package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import go.n2;
import hq.g0;
import hq.z;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq.t;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "Llo/g;", "binding", "<init>", "(Llo/g;)V", "rendering", "Lym/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lym/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lym/y;)V", j6.b.f21518e, "Llo/g;", "", "c", "Z", "shouldHideSeparators", "Landroidx/recyclerview/widget/h;", rl.d.f30696a, "Landroidx/recyclerview/widget/h;", "dividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", ve.a.f33391e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements ym.k<Screen.e> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lo.g binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldHideSeparators;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.recyclerview.widget.h dividerItemDecoration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RecyclerView recyclerView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/i$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a, reason: from kotlin metadata */
    public static final class Companion implements a0<Screen.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Screen.e> f10972a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0203a extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lo.g> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0203a f10973a = new C0203a();

            public C0203a() {
                super(3, lo.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            public final lo.g d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return lo.g.c(p02, viewGroup, z10);
            }

            @Override // yt.n
            public /* bridge */ /* synthetic */ lo.g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.i$a$b */
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<lo.g, i> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f10974a = new b();

            public b() {
                super(1, i.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final i invoke(lo.g p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return new i(p02);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.e initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10972a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super Screen.e> getType() {
            return this.f10972a.getType();
        }

        public Companion() {
            k.Companion companion = ym.k.INSTANCE;
            this.f10972a = new x(d0.b(Screen.e.class), C0203a.f10973a, b.f10974a);
        }
    }

    public i(@NotNull lo.g binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean b = z.b(context, tp.a.f32341e, null, false, false, 14, null);
        this.shouldHideSeparators = b;
        androidx.recyclerview.widget.h hVar = new androidx.recyclerview.widget.h(binding.getRoot().getContext(), 1);
        this.dividerItemDecoration = hVar;
        RecyclerView recyclerView = binding.f23723h;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        if (!b) {
            recyclerView.j(hVar);
        }
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
    }

    public static final Unit g(i iVar, double d10) {
        View view = iVar.binding.f23721f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (d10 > 0.0d) {
            layoutParams.height = (int) hq.j.a(d10);
        } else {
            iVar.binding.f23721f.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit i(Screen.e eVar, IdConfig idClass) {
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        eVar.o().invoke(idClass);
        return Unit.f22894a;
    }

    public static final Unit j(Screen.e eVar) {
        eVar.k().invoke();
        return Unit.f22894a;
    }

    public static final Unit k(Screen.e eVar) {
        eVar.l().invoke();
        return Unit.f22894a;
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int intValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(intValue);
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tq.c.b(viewEnvironment, context, intValue);
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable a10 = jr.d.a(styles, context2);
        if (a10 != null) {
            this.binding.getRoot().setBackground(a10);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f23722g.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textviewGovernmentidInstructionsTitle = this.binding.f23726k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            h0.l(textviewGovernmentidInstructionsTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textviewGovernmentidInstructionsBody = this.binding.f23724i;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
            h0.l(textviewGovernmentidInstructionsBody, textStyleValue, null, 2, null);
            TextView textviewGovernmentidInstructionslistheader = this.binding.f23727l;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
            h0.l(textviewGovernmentidInstructionslistheader, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f23725j;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
            h0.l(textviewGovernmentidInstructionsDisclaimer, disclaimerStyleValue, null, 2, null);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int intValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{intValue2, intValue2});
            gradientDrawable.setSize((int) Math.ceil(hq.j.a(1.0d)), (int) Math.ceil(hq.j.a(1.0d)));
            this.dividerItemDecoration.m(gradientDrawable);
            this.binding.f23721f.setBackgroundColor(intValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            final double doubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.l();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(hq.j.a(doubleValue)), (int) Math.ceil(hq.j.a(doubleValue)));
            }
            View listDivider = this.binding.f23721f;
            Intrinsics.checkNotNullExpressionValue(listDivider, "listDivider");
            uq.z.b(listDivider, new Function0() { // from class: go.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit g10;
                    g10 = com.withpersona.sdk2.inquiry.governmentid.i.g(com.withpersona.sdk2.inquiry.governmentid.i.this, doubleValue);
                    return g10;
                }
            });
        }
        ConstraintLayout contentContainer = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        hr.p.b(contentContainer, styles, false, false, 6, null);
    }

    @Override // ym.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.e rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer f10 = z.f(context, tp.a.f32339c, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (f10 != null) {
            this.binding.f23720e.setImageResource(f10.intValue());
            TextView textviewGovernmentidInstructionsTitle = this.binding.f23726k;
            Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textviewGovernmentidInstructionsTitle.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textviewGovernmentidInstructionsTitle.setLayoutParams(marginLayoutParams);
            this.binding.f23719d.setVisibility(8);
            this.binding.f23720e.setVisibility(0);
        } else if (headerPictograph != null) {
            ConstraintLayout governmentidHeaderImageContainer = this.binding.f23719d;
            Intrinsics.checkNotNullExpressionValue(governmentidHeaderImageContainer, "governmentidHeaderImageContainer");
            jr.c.f(headerPictograph, governmentidHeaderImageContainer, false, 2, null);
            this.binding.f23719d.setVisibility(0);
            this.binding.f23720e.setVisibility(8);
        } else {
            this.binding.f23719d.setVisibility(8);
            this.binding.f23720e.setVisibility(8);
        }
        TextView textviewGovernmentidInstructionsTitle2 = this.binding.f23726k;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsTitle2, "textviewGovernmentidInstructionsTitle");
        t.b(textviewGovernmentidInstructionsTitle2, rendering.getTitle());
        TextView textviewGovernmentidInstructionsBody = this.binding.f23724i;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
        t.b(textviewGovernmentidInstructionsBody, rendering.getPrompt());
        TextView textviewGovernmentidInstructionslistheader = this.binding.f23727l;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
        t.b(textviewGovernmentidInstructionslistheader, rendering.getChooseText());
        TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f23725j;
        Intrinsics.checkNotNullExpressionValue(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
        t.b(textviewGovernmentidInstructionsDisclaimer, rendering.getDisclaimer());
        if (!StringsKt.p0(rendering.getDisclaimer())) {
            this.binding.f23722g.setAccessibilityTraversalAfter(n2.H0);
        }
        this.binding.f23721f.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.h adapter = this.recyclerView.getAdapter();
        go.k kVar = adapter instanceof go.k ? (go.k) adapter : null;
        if (kVar == null) {
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            kVar = new go.k(context2, rendering.f(), rendering.getStyles(), rendering.getAssetConfig(), rendering.getIconStyle(), new Function1() { // from class: go.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i10;
                    i10 = com.withpersona.sdk2.inquiry.governmentid.i.i(Screen.e.this, (IdConfig) obj);
                    return i10;
                }
            });
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(kVar);
        }
        kVar.I(rendering.getIsEnabled());
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: go.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.governmentid.i.j(Screen.e.this);
                return j10;
            }
        };
        Function0 function02 = new Function0() { // from class: go.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k10;
                k10 = com.withpersona.sdk2.inquiry.governmentid.i.k(Screen.e.this);
                return k10;
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f23722g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        CoordinatorLayout root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        g0.b(root2, rendering.getError(), rendering.m(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            f(styles3, viewEnvironment);
        }
    }
}
