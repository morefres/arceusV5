package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import f7.o0;
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
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/m;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "Llo/m;", "binding", "<init>", "(Llo/m;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "rendering", "Lym/y;", "viewEnvironment", "", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lym/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lym/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", j6.b.f21518e, "Llo/m;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", rl.d.f30696a, ve.a.f33391e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements ym.k<Screen.j> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lo.m binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/m$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a, reason: from kotlin metadata */
    public static final class Companion implements a0<Screen.j> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Screen.j> f10981a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0204a extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lo.m> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0204a f10982a = new C0204a();

            public C0204a() {
                super(3, lo.m.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;", 0);
            }

            public final lo.m d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return lo.m.c(p02, viewGroup, z10);
            }

            @Override // yt.n
            public /* bridge */ /* synthetic */ lo.m invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.m$a$b */
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<lo.m, m> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f10983a = new b();

            public b() {
                super(1, m.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final m invoke(lo.m p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return new m(p02);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.j initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f10981a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super Screen.j> getType() {
            return this.f10981a.getType();
        }

        public Companion() {
            k.Companion companion = ym.k.INSTANCE;
            this.f10981a = new x(d0.b(Screen.j.class), C0204a.f10982a, b.f10983a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10984a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10984a = iArr;
        }
    }

    public m(@NotNull final lo.m binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer f10 = z.f(context, tp.a.f32350n, null, false, 6, null);
        if (f10 != null) {
            binding.f23783f.setAnimation(f10.intValue());
            binding.f23783f.x();
        } else {
            binding.f23783f.l(new l7.e("scanner", "**"), o0.f16982a, new t7.e() { // from class: go.v
                @Override // t7.e
                public final Object a(t7.b bVar) {
                    return com.withpersona.sdk2.inquiry.governmentid.m.c(com.withpersona.sdk2.inquiry.governmentid.m.this, binding, bVar);
                }
            });
        }
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
    }

    public static Integer c(m mVar, lo.m mVar2, t7.b bVar) {
        Context context = mVar2.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(g(mVar, context, i.a.f19822z, null, false, 6, null));
    }

    private final int f(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    public static /* synthetic */ int g(m mVar, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return mVar.f(context, i10, typedValue, z10);
    }

    public static final Unit i(Screen.j jVar) {
        jVar.g().invoke();
        return Unit.f22894a;
    }

    public static final Unit j(Screen.j jVar) {
        jVar.h().invoke();
        return Unit.f22894a;
    }

    public final void e(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f10;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f23784g.getId(), this.binding.f23780c.getId(), this.binding.b.getId()} : new int[]{this.binding.b.getId(), this.binding.f23784g.getId(), this.binding.f23780c.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f23781d);
        int i10 = b.f10984a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            f10 = 1.0f;
        }
        cVar.q(0, 3, 0, 4, iArr, null, 2);
        cVar.F(kotlin.collections.m.K(iArr), f10);
        cVar.c(this.binding.f23781d);
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
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f23784g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f23780c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int intValue2 = fillColorValue.intValue();
            this.binding.f23783f.F(Color.parseColor("#AA85FF"), intValue2);
            this.binding.f23783f.F(Color.parseColor("#4600EB"), intValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f23783f.F(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int intValue3 = backgroundColorValue2.intValue();
            this.binding.f23783f.F(Color.parseColor("#FFFFFF"), intValue3);
            this.binding.f23783f.F(Color.parseColor("#F1EBFF"), intValue3);
        }
    }

    @Override // ym.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.j rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        lo.m mVar = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: go.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = com.withpersona.sdk2.inquiry.governmentid.m.i(Screen.j.this);
                return i10;
            }
        };
        Function0 function02 = new Function0() { // from class: go.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j10;
                j10 = com.withpersona.sdk2.inquiry.governmentid.m.j(Screen.j.this);
                return j10;
            }
        };
        Pi2NavigationBar navigationBar = mVar.f23782e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = mVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        if (StringsKt.p0(rendering.getTitle())) {
            mVar.f23784g.setVisibility(8);
        } else {
            mVar.f23784g.setVisibility(0);
            mVar.f23784g.setText(rendering.getTitle());
            TextView title = mVar.f23784g;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            uq.z.f(title);
        }
        if (rendering.getDescription().length() == 0) {
            mVar.f23780c.setVisibility(8);
        } else {
            mVar.f23780c.setText(rendering.getDescription());
        }
        NextStep.GovernmentId.AssetConfig.PendingPage assetConfig = rendering.getAssetConfig();
        RemoteImage loadingPictograph = assetConfig != null ? assetConfig.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = jr.c.e(loadingPictograph, animationContainer, true);
            mVar.f23783f.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null) {
            e(styles3, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
