package ar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yq.ComponentView;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lar/y4;", "uiComponentHelper", "", "Lyq/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "", "minLeftPadding", "minRightPadding", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Lar/y4;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;II)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {
    @NotNull
    public static final View a(@NotNull FooterComponent footerComponent, @NotNull y4 uiComponentHelper, @NotNull List<ComponentView> componentViews, @NotNull List<? extends View> children, @NotNull Footer config, int i10, int i11) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        Intrinsics.checkNotNullParameter(footerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        er.g c10 = er.g.c(LayoutInflater.from(uiComponentHelper.getContext()));
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        Integer backgroundColor = config.getBackgroundColor();
        if (backgroundColor != null) {
            c10.b.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = config.getPadding();
        if (padding != null) {
            StyleElements.Size left = padding.getLeft();
            int c11 = kotlin.ranges.d.c((left == null || (dp6 = left.getDp()) == null) ? 0 : (int) hq.j.a(dp6.doubleValue()), i10);
            StyleElements.Size right = padding.getRight();
            int c12 = kotlin.ranges.d.c((right == null || (dp5 = right.getDp()) == null) ? 0 : (int) hq.j.a(dp5.doubleValue()), i11);
            ConstraintLayout constraintLayout = c10.f16225c;
            StyleElements.Size top = padding.getTop();
            int a10 = (top == null || (dp4 = top.getDp()) == null) ? 0 : (int) hq.j.a(dp4.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(c11, a10, c12, (bottom == null || (dp3 = bottom.getDp()) == null) ? 0 : (int) hq.j.a(dp3.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = config.getBorderWidth();
        if (borderWidth != null) {
            View hairline = c10.f16226d;
            Intrinsics.checkNotNullExpressionValue(hairline, "hairline");
            ViewGroup.LayoutParams layoutParams = hairline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp2 = top2.getDp()) == null) ? 0 : (int) hq.j.a(dp2.doubleValue());
            hairline.setLayoutParams(layoutParams);
        } else {
            View hairline2 = c10.f16226d;
            Intrinsics.checkNotNullExpressionValue(hairline2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = hairline2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) hq.j.a(1.0d);
            hairline2.setLayoutParams(layoutParams2);
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(c10.f16225c);
        ConstraintLayout footerContainerInner = c10.f16225c;
        Intrinsics.checkNotNullExpressionValue(footerContainerInner, "footerContainerInner");
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            footerContainerInner.addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        r4.b(footerContainerInner, cVar, componentViews, arrayList, StyleElements.PositionType.CENTER, null, 0);
        cVar.c(c10.f16225c);
        LinearLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
