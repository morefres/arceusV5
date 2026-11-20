package ao;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "rendering", "", rl.d.f30696a, "(Llq/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)V", "document_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    public static final void d(lq.b bVar, final DocumentWorkflow.c.b bVar2) {
        NavigationState navigationState = bVar2.getNavigationState();
        Function0 function0 = new Function0() { // from class: ao.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit e10;
                e10 = i.e(DocumentWorkflow.c.b.this);
                return e10;
            }
        };
        Function0 function02 = new Function0() { // from class: ao.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit f10;
                f10 = i.f(DocumentWorkflow.c.b.this);
                return f10;
            }
        };
        Pi2NavigationBar navigationBar = bVar.f23826e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle styles = bVar2.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        String navBarTitle = bVar2.getNavBarTitle();
        StepStyles.DocumentStepStyle styles2 = bVar2.getStyles();
        gr.c.e(navigationState, function0, function02, null, navigationBar, root, h10, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(DocumentWorkflow.c.b bVar) {
        bVar.d().invoke();
        return Unit.f22894a;
    }

    public static final Unit f(DocumentWorkflow.c.b bVar) {
        bVar.e().invoke();
        return Unit.f22894a;
    }
}
