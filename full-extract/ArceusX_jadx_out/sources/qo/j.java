package qo;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import hq.v;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq.t;
import uq.z;
import ym.ViewEnvironment;
import ym.a0;
import ym.k;
import ym.x;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lqo/j;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Llo/a;", "binding", "<init>", "(Llo/a;)V", "rendering", "Lym/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lym/y;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", Title.type, "Landroid/widget/Button;", "continueButton", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentContainer", "Landroid/widget/LinearLayout;", Footer.type, "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lym/y;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V", j6.b.f21518e, "Llo/a;", "c", ve.a.f33391e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements ym.k<Screen.d> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lo.a binding;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqo/j$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: qo.j$a, reason: from kotlin metadata */
    public static final class Companion implements a0<Screen.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Screen.d> f29984a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: qo.j$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0525a extends kotlin.jvm.internal.k implements yt.n<LayoutInflater, ViewGroup, Boolean, lo.a> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0525a f29985a = new C0525a();

            public C0525a() {
                super(3, lo.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);
            }

            public final lo.a d(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return lo.a.c(p02, viewGroup, z10);
            }

            @Override // yt.n
            public /* bridge */ /* synthetic */ lo.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: qo.j$a$b */
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<lo.a, j> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f29986a = new b();

            public b() {
                super(1, j.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final j invoke(lo.a p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return new j(p02);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f29984a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super Screen.d> getType() {
            return this.f29984a.getType();
        }

        public Companion() {
            k.Companion companion = ym.k.INSTANCE;
            this.f29984a = new x(d0.b(Screen.d.class), C0525a.f29985a, b.f29986a);
        }
    }

    public j(@NotNull lo.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
    }

    public static final Unit h(Screen.d dVar) {
        dVar.f().invoke();
        return Unit.f22894a;
    }

    public static final Unit i(Screen.d dVar) {
        dVar.g().invoke();
        return Unit.f22894a;
    }

    public static final Unit j(lo.a aVar, LocalImageComponentStyle localImageComponentStyle) {
        ThemeableLottieAnimationView illustration = aVar.f23661e;
        Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
        hr.g.e(illustration, localImageComponentStyle, new String[]{"#190051"}, new String[]{"#AA84FF"}, null, new String[0], 8, null);
        return Unit.f22894a;
    }

    public static final void k(Screen.d dVar, View view) {
        dVar.h().invoke();
    }

    public final void f(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, Button continueButton, ViewEnvironment viewEnvironment, ConstraintLayout contentContainer, LinearLayout footer) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int intValue = backgroundColorValue.intValue();
            root.setBackgroundColor(intValue);
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            tq.c.b(viewEnvironment, context, intValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = styles.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            h0.l(title, base4, null, 2, null);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = styles.getButtonPrimaryStyle();
        if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            hr.e.h(continueButton, base2, false, false, false, 14, null);
        }
        hr.p.b(contentContainer, styles, false, false, 6, null);
    }

    @Override // ym.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.d rendering, @NotNull ViewEnvironment viewEnvironment) {
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final lo.a aVar = this.binding;
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: qo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit h10;
                h10 = j.h(Screen.d.this);
                return h10;
            }
        };
        Function0 function02 = new Function0() { // from class: qo.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = j.i(Screen.d.this);
                return i10;
            }
        };
        Pi2NavigationBar navigationBar = aVar.f23663g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = aVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        final LocalImageComponentStyle localImageComponentStyle = null;
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = rendering.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = rendering.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
        StepStyles.GovernmentIdStepStyle styles3 = rendering.getStyles();
        if (styles3 != null && (imageLocalStyle = styles3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
            localImageComponentStyle = illustration.getBase();
        }
        aVar.f23661e.setAnimation(v.f19654l);
        if (localImageComponentStyle != null) {
            CoordinatorLayout root2 = aVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            z.b(root2, new Function0() { // from class: qo.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit j10;
                    j10 = j.j(lo.a.this, localImageComponentStyle);
                    return j10;
                }
            });
        }
        TextView title = aVar.f23664h;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        t.b(title, rendering.getTitleText());
        aVar.f23659c.setText(rendering.getContinueButtonText());
        aVar.f23659c.setOnClickListener(new View.OnClickListener() { // from class: qo.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.k(Screen.d.this, view);
            }
        });
        StepStyles.GovernmentIdStepStyle styles4 = rendering.getStyles();
        if (styles4 != null) {
            CoordinatorLayout root3 = aVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = aVar.f23663g;
            Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
            TextView title2 = aVar.f23664h;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            Button continueButton = aVar.f23659c;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            ConstraintLayout innerContent = aVar.f23662f;
            Intrinsics.checkNotNullExpressionValue(innerContent, "innerContent");
            LinearLayout footer = aVar.f23660d;
            Intrinsics.checkNotNullExpressionValue(footer, "footer");
            f(styles4, root3, navigationBar2, title2, continueButton, viewEnvironment, innerContent, footer);
        }
    }
}
