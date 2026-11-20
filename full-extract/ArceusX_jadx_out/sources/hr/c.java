package hr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Landroid/view/View;", "innerView", "Landroid/graphics/Rect;", "viewBuiltInPadding", "", "skipModalPadding", "", j6.b.f21518e, "(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;Z)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "cornerRadius", "Landroid/graphics/drawable/GradientDrawable;", rl.d.f30696a, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "e", "(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    public static final void b(@NotNull ViewGroup viewGroup, @Nullable StepStyle stepStyle, @NotNull View innerView, @Nullable Rect rect, boolean z10) {
        int d10;
        StyleElements.SizeSet modalPaddingValue;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(innerView, "innerView");
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            d10 = hq.z.d(context, ic.b.f20408o, null, false, 6, null);
        } else {
            d10 = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(d10));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable a10 = jr.d.a(stepStyle, context2);
            if (a10 != null) {
                e(viewGroup, a10);
            }
        }
        if (!z10 && stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp5 = left.getDp()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(((int) hq.j.a(dp5.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp4 = top.getDp()) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(((int) hq.j.a(dp4.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp3 = right.getDp()) == null) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(((int) hq.j.a(dp3.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp2 = bottom.getDp()) == null) {
                num4 = null;
            } else {
                num4 = Integer.valueOf(((int) hq.j.a(dp2.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            innerView.setPadding(num != null ? num.intValue() : viewGroup.getPaddingLeft(), num2 != null ? num2.intValue() : viewGroup.getPaddingTop(), num3 != null ? num3.intValue() : viewGroup.getPaddingRight(), num4 != null ? num4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(d(stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null));
    }

    public static /* synthetic */ void c(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            view = viewGroup;
        }
        if ((i10 & 4) != 0) {
            rect = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        b(viewGroup, stepStyle, view, rect, z10);
    }

    public static final GradientDrawable d(StyleElements.Size size) {
        Double dp2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float a10 = (float) hq.j.a((size == null || (dp2 = size.getDp()) == null) ? 12.0d : dp2.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{a10, a10, a10, a10, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    public static final void e(ViewGroup viewGroup, Drawable drawable) {
        Sequence p8 = hu.p.p(u0.a(viewGroup), new Function1() { // from class: hr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean f10;
                f10 = c.f((View) obj);
                return Boolean.valueOf(f10);
            }
        });
        if (hu.p.m(p8)) {
            ((View) hu.p.t(p8)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View aVar = new a(context);
        aVar.setBackground(drawable);
        viewGroup.addView(aVar, 0);
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.f1396t = viewGroup.getId();
        bVar.f1400v = viewGroup.getId();
        bVar.f1374i = viewGroup.getId();
        bVar.f1380l = viewGroup.getId();
        aVar.setLayoutParams(bVar);
    }

    public static final boolean f(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof a;
    }
}
