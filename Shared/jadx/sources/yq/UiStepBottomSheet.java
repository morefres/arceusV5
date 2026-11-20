package yq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;
import yq.UiStepBottomSheet;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010A\u001a\u0004\b&\u0010B¨\u0006D"}, d2 = {"Lyq/p;", "Lym/b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "", "hideWhenTappedOutside", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V", "Landroid/view/ViewGroup;", "container", "k", "(Landroid/view/ViewGroup;)V", "Llq/a;", "binding", "rendering", "l", "(Llq/a;Lyq/p;)V", "j", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", j6.b.f21518e, "Ljava/util/List;", "c", "Lkotlin/jvm/functions/Function0;", rl.d.f30696a, "Ljava/lang/String;", "e", "Z", "Lyq/g;", "f", "Lyq/g;", "i", "()Lyq/g;", "setUiScreenGenerationResult", "(Lyq/g;)V", "uiScreenGenerationResult", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "h", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "Lym/a0;", "Lym/a0;", "()Lym/a0;", "viewFactory", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: yq.p, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UiStepBottomSheet implements ym.b<UiStepBottomSheet> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> onCancelled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String cancelButtonName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean hideWhenTappedOutside;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g uiScreenGenerationResult;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<?> bottomSheetBehavior;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<UiStepBottomSheet> viewFactory;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"yq/p$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: yq.p$a */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lq.a f37029a;
        public final /* synthetic */ BottomSheetBehavior<?> b;

        public a(lq.a aVar, BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f37029a = aVar;
            this.b = bottomSheetBehavior;
        }

        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = this.f37029a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.d(context);
            final BottomSheetBehavior<?> bottomSheetBehavior = this.b;
            view.postDelayed(new Runnable() { // from class: yq.o
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.a.b(BottomSheetBehavior.this);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "binding", "Lym/k;", ve.a.f33391e, "(Lr5/a;)Lym/k;"}, k = 3, mv = {2, 2, 0})
    /* renamed from: yq.p$b */
    public static final class b extends kotlin.jvm.internal.m implements Function1<lq.a, ym.k<UiStepBottomSheet>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lym/y;", "viewEnvironment", "", j6.b.f21518e, "(Ljava/lang/Object;Lym/y;)V"}, k = 3, mv = {2, 2, 0})
        /* renamed from: yq.p$b$a */
        public static final class a<RenderingT> implements ym.k {
            public final /* synthetic */ r5.a b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UiStepBottomSheet f37031c;

            public a(r5.a aVar, UiStepBottomSheet uiStepBottomSheet) {
                this.b = aVar;
                this.f37031c = uiStepBottomSheet;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ym.k
            public final void b(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                lq.a aVar = (lq.a) this.b;
                UiStepBottomSheet uiStepBottomSheet = this.f37031c;
                Intrinsics.checkNotNull(aVar);
                uiStepBottomSheet.l(aVar, (UiStepBottomSheet) rendering);
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ym.k<UiStepBottomSheet> invoke(@NotNull lq.a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(binding, UiStepBottomSheet.this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: yq.p$c */
    public static final /* synthetic */ class c extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lq.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37032a = new c();

        public c() {
            super(3, lq.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
        }

        public final lq.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return lq.a.c(p02, viewGroup, z10);
        }

        @Override // yt.n
        public /* bridge */ /* synthetic */ lq.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiStepBottomSheet(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.onCancelled = onCancelled;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z10;
        k.Companion companion = ym.k.INSTANCE;
        this.viewFactory = new x(d0.b(UiStepBottomSheet.class), c.f37032a, new b());
    }

    public static final Unit m(UiStepBottomSheet uiStepBottomSheet) {
        uiStepBottomSheet.onCancelled.invoke();
        return Unit.f22894a;
    }

    public static final void n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
    }

    public static final void o(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final void p(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final Unit q(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
        return Unit.f22894a;
    }

    public static final void r(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    @Override // ym.b
    @NotNull
    public a0<UiStepBottomSheet> a() {
        return this.viewFactory;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepBottomSheet)) {
            return false;
        }
        UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) other;
        return Intrinsics.c(this.uiScreen, uiStepBottomSheet.uiScreen) && Intrinsics.c(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && Intrinsics.c(this.onCancelled, uiStepBottomSheet.onCancelled) && Intrinsics.c(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    @Nullable
    public final BottomSheetBehavior<?> h() {
        return this.bottomSheetBehavior;
    }

    public int hashCode() {
        int hashCode = ((((this.uiScreen.hashCode() * 31) + this.componentNamesToActions.hashCode()) * 31) + this.onCancelled.hashCode()) * 31;
        String str = this.cancelButtonName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideWhenTappedOutside);
    }

    @Nullable
    /* renamed from: i, reason: from getter */
    public final g getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    public final void j() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X0(5);
        }
        this.bottomSheetBehavior = null;
    }

    public final void k(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.bottomSheetBehavior != null) {
            return;
        }
        lq.a c10 = lq.a.c(LayoutInflater.from(container.getContext()), container, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        l(c10, this);
        container.removeAllViews();
        container.addView(c10.getRoot());
    }

    public final void l(@NotNull lq.a binding, @NotNull final UiStepBottomSheet rendering) {
        View d10;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ViewGroup.LayoutParams layoutParams = binding.b.getLayoutParams();
        Intrinsics.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
        Intrinsics.d(f10, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
        final BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) f10;
        if (!uq.g.f()) {
            CoordinatorLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            uq.g.d(root, false, false, false, false, 14, null);
        }
        Function0 function0 = new Function0() { // from class: yq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit m10;
                m10 = UiStepBottomSheet.m(UiStepBottomSheet.this);
                return m10;
            }
        };
        ConstraintLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(bottomSheetBehavior, function0, bottomSheet, binding.f23821d, binding.f23822e);
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (binding.getRoot().isAttachedToWindow()) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.d(context);
            binding.getRoot().postDelayed(new Runnable() { // from class: yq.j
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.n(BottomSheetBehavior.this);
                }
            }, 100L);
        } else {
            binding.getRoot().addOnAttachStateChangeListener(new a(binding, bottomSheetBehavior));
        }
        Context context2 = binding.getRoot().getContext();
        s sVar = s.f37035a;
        Intrinsics.checkNotNull(context2);
        g h10 = s.h(sVar, context2, this.uiScreen, false, true, false, 16, null);
        this.uiScreenGenerationResult = h10;
        binding.f23820c.addView(h10.getContentView());
        Map<String, ComponentView> a10 = h10.getViewBindings().a();
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNamesToActions) {
            String c10 = pair.c();
            final Function1<UiComponent, Unit> d11 = pair.d();
            final ComponentView componentView = a10.get(c10);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: yq.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UiStepBottomSheet.o(Function1.this, componentView, view);
                    }
                });
            }
        }
        ComponentView componentView2 = a10.get(this.cancelButtonName);
        if (componentView2 != null && (d10 = componentView2.d()) != null) {
            d10.setOnClickListener(new View.OnClickListener() { // from class: yq.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.p(BottomSheetBehavior.this, view);
                }
            });
        }
        ConstraintLayout bottomSheet2 = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
        ym.e.c(bottomSheet2, new Function0() { // from class: yq.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q10;
                q10 = UiStepBottomSheet.q(BottomSheetBehavior.this);
                return q10;
            }
        });
        if (rendering.hideWhenTappedOutside) {
            binding.f23822e.setOnClickListener(new View.OnClickListener() { // from class: yq.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.r(BottomSheetBehavior.this, view);
                }
            });
        } else {
            binding.f23822e.setOnClickListener(null);
        }
        NestedScrollView contentScrollView = binding.f23821d;
        Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
        StepStyles.UiStepStyle styles = this.uiScreen.getStyles();
        FrameLayout contentContainer = binding.f23820c;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        hr.c.c(contentScrollView, styles, contentContainer, null, false, 12, null);
    }

    @NotNull
    public String toString() {
        return "UiStepBottomSheet(uiScreen=" + this.uiScreen + ", componentNamesToActions=" + this.componentNamesToActions + ", onCancelled=" + this.onCancelled + ", cancelButtonName=" + this.cancelButtonName + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ")";
    }

    public /* synthetic */ UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, function0, str, (i10 & 16) != 0 ? true : z10);
    }
}
