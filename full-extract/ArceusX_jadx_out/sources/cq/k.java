package cq;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq/b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "rendering", "", rl.d.f30696a, "(Llq/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;)V", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    public static final void d(lq.b bVar, final SelfieWorkflow.c.d dVar) {
        NavigationState navigationState = dVar.getNavigationState();
        Function0 function0 = new Function0() { // from class: cq.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit e10;
                e10 = k.e(SelfieWorkflow.c.d.this);
                return e10;
            }
        };
        Function0 function02 = new Function0() { // from class: cq.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit f10;
                f10 = k.f(SelfieWorkflow.c.d.this);
                return f10;
            }
        };
        Pi2NavigationBar navigationBar = bVar.f23826e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.SelfieStepStyle styles = dVar.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = dVar.getNavBarTitle();
        StepStyles.SelfieStepStyle styles2 = dVar.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(SelfieWorkflow.c.d dVar) {
        dVar.c().invoke();
        return Unit.f22894a;
    }

    public static final Unit f(SelfieWorkflow.c.d dVar) {
        dVar.d().invoke();
        return Unit.f22894a;
    }
}
