package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import gt.s;
import hq.g0;
import hq.z;
import hr.h0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wp.t;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lyp/e;", "binding", "<init>", "(Lyp/e;)V", "rendering", "Lym/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lym/y;)V", "Ltq/a;", "systemUiController", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Ltq/a;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lin/a;", "orderedPoses", "Lkotlin/Pair;", "", "", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ltq/a;)V", j6.b.f21518e, "Lyp/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", rl.d.f30696a, ve.a.f33391e, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements ym.k<SelfieWorkflow.c.b> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yp.e binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentInstructionAssetView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/h$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.h$a, reason: from kotlin metadata */
    public static final class Companion implements a0<SelfieWorkflow.c.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<SelfieWorkflow.c.b> f13013a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0248a extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, yp.e> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0248a f13014a = new C0248a();

            public C0248a() {
                super(3, yp.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final yp.e d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return yp.e.c(p02, viewGroup, z10);
            }

            @Override // yt.n
            public /* bridge */ /* synthetic */ yp.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.selfie.h$a$b */
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<yp.e, h> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f13015a = new b();

            public b() {
                super(1, h.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final h invoke(yp.e p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return new h(p02);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f13013a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super SelfieWorkflow.c.b> getType() {
            return this.f13013a.getType();
        }

        public Companion() {
            k.Companion companion = ym.k.INSTANCE;
            this.f13013a = new x(d0.b(SelfieWorkflow.c.b.class), C0248a.f13014a, b.f13015a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$showRendering$1$5", f = "SelfieInstructionsRunner.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f13016t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ yp.e f13017u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f13018v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.b f13019w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13020x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yp.e eVar, int i10, SelfieWorkflow.c.b bVar, String str, mt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f13017u = eVar;
            this.f13018v = i10;
            this.f13019w = bVar;
            this.f13020x = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f13017u, this.f13018v, this.f13019w, this.f13020x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f13016t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            InputStream openRawResource = this.f13017u.f36903f.getContext().getResources().openRawResource(this.f13018v);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                String h10 = tt.n.h(bufferedReader);
                tt.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle styles = this.f13019w.getStyles();
                this.f13017u.f36903f.z(hr.g.g(h10, styles != null ? styles.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.f13020x);
                return Unit.f22894a;
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public h(@NotNull yp.e binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
    }

    public static final void i(SelfieWorkflow.c.b bVar, View view) {
        bVar.h().invoke();
    }

    public static final Unit j(SelfieWorkflow.c.b bVar) {
        bVar.f().invoke();
        return Unit.f22894a;
    }

    public static final Unit k(SelfieWorkflow.c.b bVar) {
        bVar.g().invoke();
        return Unit.f22894a;
    }

    public final void e(StepStyles.SelfieStepStyle styles, tq.a systemUiController) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.f36910m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f36910m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f36910m;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            h0.l(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f36909l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f36909l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f36909l;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieStartBody, "textviewSelfieStartBody");
            h0.l(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f36908k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f36908k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f36908k;
            Intrinsics.checkNotNullExpressionValue(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            h0.l(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int intValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(intValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, intValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable a10 = jr.d.a(styles, context2);
        if (a10 != null) {
            this.binding.getRoot().setBackground(a10);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f36904g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton startButton = this.binding.f36906i;
            Intrinsics.checkNotNullExpressionValue(startButton, "startButton");
            hr.e.h(startButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f36907j.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f36901d.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
    }

    public final Pair<Integer, String> f(SelfieType selfieType, List<? extends in.a> orderedPoses) {
        return (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12615a) || orderedPoses.size() == 1) ? s.a(Integer.valueOf(t.b), "pi2_head_turning_center") : CollectionsKt.f0(orderedPoses, 1) == in.a.f20966c ? s.a(Integer.valueOf(t.f34715c), "pi2_head_turning_reversed") : s.a(Integer.valueOf(t.f34714a), "pi2_head_turning");
    }

    public final void g(@NotNull final SelfieWorkflow.c.b rendering, @Nullable tq.a systemUiController) {
        android.view.s c10;
        android.view.m a10;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        yp.e eVar = this.binding;
        Context context = eVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer f10 = z.f(context, tp.a.f32356t, null, false, 6, null);
        if (f10 != null) {
            this.binding.f36902e.setImageResource(f10.intValue());
            this.binding.f36902e.setVisibility(0);
        }
        if (rendering.getErrorMessage() != null) {
            ScrollView root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            g0.b(root, rendering.getErrorMessage(), rendering.i(), null, 4, 3000, 8, null);
        }
        TextView textviewSelfieStartTitle = eVar.f36910m;
        Intrinsics.checkNotNullExpressionValue(textviewSelfieStartTitle, "textviewSelfieStartTitle");
        uq.t.b(textviewSelfieStartTitle, rendering.getTitle());
        eVar.f36909l.setText(rendering.getPrompt());
        ss.e.b(eVar.f36908k.getContext()).c(eVar.f36908k, rendering.getDisclosure());
        eVar.f36906i.setText(rendering.getStart());
        eVar.f36906i.setOnClickListener(new View.OnClickListener() { // from class: wp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.h.i(SelfieWorkflow.c.b.this, view);
            }
        });
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: wp.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.selfie.h.j(SelfieWorkflow.c.b.this);
                return j10;
            }
        };
        Function0 function02 = new Function0() { // from class: wp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k10;
                k10 = com.withpersona.sdk2.inquiry.selfie.h.k(SelfieWorkflow.c.b.this);
                return k10;
            }
        };
        Pi2NavigationBar navigationBar = eVar.f36904g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ScrollView root2 = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle styles2 = rendering.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root2, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer f11 = z.f(context2, tp.a.f32351o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage instructionAsset = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = eVar.f36905h;
                Intrinsics.checkNotNullExpressionValue(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = jr.c.f(instructionAsset, nestedUiContainer, false, 2, null);
                eVar.f36903f.setVisibility(8);
            }
        } else if (f11 != null) {
            eVar.f36903f.setAnimation(f11.intValue());
            eVar.f36903f.x();
        } else {
            SelfieType selfieType = rendering.getSelfieType();
            List<PoseInfo> j10 = rendering.j();
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(j10, 10));
            Iterator<T> it = j10.iterator();
            while (it.hasNext()) {
                arrayList.add(((PoseInfo) it.next()).getPose());
            }
            Pair<Integer, String> f12 = f(selfieType, arrayList);
            int intValue = f12.a().intValue();
            String b10 = f12.b();
            Context context3 = eVar.f36903f.getContext();
            if (context3 != null && (c10 = hq.g.c(context3)) != null && (a10 = android.view.t.a(c10)) != null) {
                ju.k.d(a10, null, null, new b(eVar, intValue, rendering, b10, null), 3, null);
            }
            l(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            e(rendering.getStyles(), systemUiController);
        }
    }

    @Override // ym.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull SelfieWorkflow.c.b rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        g(rendering, tq.c.a(viewEnvironment));
    }

    public final void l(StepStyles.SelfieStepStyle styles) {
        if (styles == null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f36903f;
            int parseColor = Color.parseColor("#022050");
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeableLottieAnimationView.F(parseColor, z.d(context, ic.b.f20406m, null, false, 6, null));
            ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f36903f;
            int parseColor2 = Color.parseColor("#AA85FF");
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeableLottieAnimationView2.F(parseColor2, z.d(context2, ic.b.f20407n, null, false, 6, null));
            Context context3 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int d10 = z.d(context3, ic.b.f20407n, null, false, 6, null);
            Context context4 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.binding.f36903f.F(Color.parseColor("#DBCCFF"), androidx.core.graphics.c.c(d10, z.d(context4, ic.b.f20408o, null, false, 6, null), 0.66f));
        }
    }
}
