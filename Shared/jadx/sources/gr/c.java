package gr;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import hq.m0;
import hq.t;
import hr.e0;
import hr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0003*\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "back", "cancel", "launchHelp", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/view/View;", "backPressHandler", "Landroid/graphics/Rect;", "navBarPadding", "", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", d.f30696a, "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "style", "c", "(Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"gr/c$a", "", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18818a;

        public a(Function0<Unit> function0) {
            this.f18818a = function0;
        }
    }

    public static final void c(Pi2NavigationBar pi2NavigationBar, TextBasedComponentStyle textBasedComponentStyle) {
        if (textBasedComponentStyle == null) {
            return;
        }
        ColorStateList textColors = pi2NavigationBar.getNavBarTitleView().getTextColors();
        h0.k(pi2NavigationBar.getNavBarTitleView(), textBasedComponentStyle, q0.g(e0.f19692c, e0.b));
        pi2NavigationBar.getNavBarTitleView().setTextColor(textColors);
    }

    public static final void d(@NotNull final NavigationState navigationState, @NotNull final Function0<Unit> back, @NotNull final Function0<Unit> cancel, @NotNull Function0<Unit> launchHelp, @NotNull Pi2NavigationBar navigationBar, @NotNull View backPressHandler, @Nullable Rect rect, @Nullable String str, @Nullable TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(launchHelp, "launchHelp");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        Intrinsics.checkNotNullParameter(backPressHandler, "backPressHandler");
        if (rect != null) {
            navigationBar.setPreferredPadding(rect);
        }
        navigationBar.G(navigationState, back, cancel, launchHelp);
        navigationBar.setTitle(str);
        c(navigationBar, textBasedComponentStyle);
        Function0 function0 = new Function0() { // from class: gr.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g10;
                g10 = c.g(NavigationState.this, back, cancel);
                return g10;
            }
        };
        backPressHandler.setTag(t.f19630t, new a(function0));
        if (navigationState.getHandleBackPress()) {
            m0.e(backPressHandler, function0);
        }
    }

    public static /* synthetic */ void e(NavigationState navigationState, Function0 function0, Function0 function02, Function0 function03, Pi2NavigationBar pi2NavigationBar, View view, Rect rect, String str, TextBasedComponentStyle textBasedComponentStyle, int i10, Object obj) {
        TextBasedComponentStyle textBasedComponentStyle2;
        NavigationState navigationState2;
        Function0 function04;
        Function0 function05;
        Pi2NavigationBar pi2NavigationBar2;
        View view2;
        if ((i10 & 8) != 0) {
            function03 = new Function0() { // from class: gr.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit f10;
                    f10 = c.f();
                    return f10;
                }
            };
        }
        Function0 function06 = function03;
        Rect rect2 = (i10 & 64) != 0 ? null : rect;
        String str2 = (i10 & 128) != 0 ? null : str;
        if ((i10 & 256) != 0) {
            textBasedComponentStyle2 = null;
            navigationState2 = navigationState;
            function05 = function02;
            pi2NavigationBar2 = pi2NavigationBar;
            view2 = view;
            function04 = function0;
        } else {
            textBasedComponentStyle2 = textBasedComponentStyle;
            navigationState2 = navigationState;
            function04 = function0;
            function05 = function02;
            pi2NavigationBar2 = pi2NavigationBar;
            view2 = view;
        }
        d(navigationState2, function04, function05, function06, pi2NavigationBar2, view2, rect2, str2, textBasedComponentStyle2);
    }

    public static final Unit f() {
        return Unit.f22894a;
    }

    public static final Unit g(NavigationState navigationState, Function0 function0, Function0 function02) {
        if (navigationState.getShowBackButton()) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.f22894a;
    }
}
