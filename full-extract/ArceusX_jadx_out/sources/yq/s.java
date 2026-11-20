package yq;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar.y4;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import er.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq.z;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JU\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.Jg\u00106\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010 \u001a\u00020\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170(2\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107Jm\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002010\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017092\u0006\u0010+\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"Lyq/s;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Lyq/p;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lyq/p;", "Llq/b;", "binding", "Lkotlin/Function2;", "", "Lyq/a;", "initialRendering", "", "shouldApplyFocus", "Lyq/g;", "l", "(Llq/b;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Lyq/g;", "Landroid/content/Context;", "context", "isLoading", "isModal", "g", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZ)Lyq/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "viewBindings", "Lar/y4;", "uiComponentHelper", "Landroid/view/View;", "f", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZLjava/util/Map;Lar/y4;ZZ)Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToComponent", "", "minLeftPadding", "minRightPadding", "e", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;Ljava/util/Map;ZLjava/util/Map;Lar/y4;II)Landroid/view/View;", "components", "", "componentViews", "k", "(Ljava/util/List;Ljava/util/Map;Landroid/content/Context;ZLjava/util/List;Lar/y4;II)Ljava/util/List;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f37035a = new s();

    public static final void d(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static /* synthetic */ g h(s sVar, Context context, UiComponentScreen uiComponentScreen, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        return sVar.g(context, uiComponentScreen, z10, z11, z12);
    }

    public static final Unit i(y4 y4Var) {
        y4Var.c();
        return Unit.f22894a;
    }

    public final void c(@NotNull ConstraintLayout parentView) {
        View view;
        Editable text;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ArrayList<View> focusables = parentView.getFocusables(2);
        Intrinsics.checkNotNullExpressionValue(focusables, "getFocusables(...)");
        int size = focusables.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                view = null;
                break;
            }
            view = focusables.get(i10);
            i10++;
            View view2 = view;
            if ((view2 instanceof EditText) && ((text = ((EditText) view2).getText()) == null || StringsKt.p0(text))) {
                break;
            }
        }
        final View view3 = view;
        if (view3 != null) {
            view3.requestFocus();
            view3.post(new Runnable() { // from class: yq.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.d(view3);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View e(Context context, FooterComponent component, Map<String, ? extends UiComponentConfig> componentNameToComponent, boolean isLoading, Map<String, ComponentView> viewBindings, y4 uiComponentHelper, int minLeftPadding, int minRightPadding) {
        ArrayList arrayList = new ArrayList();
        List<View> k10 = k(kotlin.collections.o.d(component), componentNameToComponent, context, isLoading, arrayList, uiComponentHelper, minLeftPadding, minRightPadding);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            viewBindings.put(((ComponentView) obj).c().getName(), obj);
        }
        return (View) CollectionsKt.d0(k10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, y4 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) {
        List<? extends UiComponent> k10;
        int i10;
        androidx.constraintlayout.widget.c cVar;
        ComponentView componentView;
        View d10;
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        t c10 = t.c(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        ConstraintLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        List<UiComponent> components = uiScreen.getComponents();
        if (components != null) {
            k10 = new ArrayList<>();
            for (Object obj : components) {
                if (!(((UiComponent) obj) instanceof FooterComponent)) {
                    k10.add(obj);
                }
            }
        } else {
            k10 = kotlin.collections.p.k();
        }
        List<? extends UiComponent> list = k10;
        ArrayList arrayList = new ArrayList();
        Map<String, ? extends UiComponentConfig> j10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.j(uiScreen.U0());
        StepStyles.UiStepStyle styles = uiScreen.getStyles();
        int a10 = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? hq.j.a(24.0d) : hq.j.a(dp3.doubleValue()));
        StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
        List<View> k11 = k(list, j10, context, isLoading, arrayList, uiComponentHelper, a10, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? hq.j.a(24.0d) : hq.j.a(dp2.doubleValue())));
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.f(root);
        Iterator<View> it = k11.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            next.setId(View.generateViewId());
            next.setSaveEnabled(false);
            root.addView(next);
            cVar2.h(next.getId(), 6, 0, 6);
            cVar2.h(next.getId(), 7, 0, 7);
            cVar2.l(next.getId(), -2);
            cVar2.k(next.getId(), 0);
            cVar2.F(next.getId(), 0.5f);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            viewBindings.put(((ComponentView) obj2).c().getName(), obj2);
        }
        if (k11.size() > 1) {
            List<View> list2 = k11;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it2.next()).getId()));
            }
            cVar2.q(0, 3, 0, 4, CollectionsKt.L0(arrayList2), null, 3);
            cVar = cVar2;
            if (uiScreen.getStyles() == null) {
                for (UiComponent uiComponent : list) {
                    int i12 = i10 + 1;
                    if (!(uiComponent instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(uiComponent.getName())) != null && (d10 = componentView.d()) != null && i10 != kotlin.collections.p.m(list)) {
                        cVar.E(d10.getId(), 4, (int) hq.j.a(16.0d));
                    }
                    i10 = i12;
                }
            }
        } else {
            cVar = cVar2;
        }
        if (!isModal) {
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), (int) hq.j.a(24.0d));
        }
        cVar.c(root);
        Context context2 = c10.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!hq.g.g(context2) && shouldApplyFocus) {
            c(root);
        }
        ConstraintLayout root2 = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @NotNull
    public final g g(@NotNull Context context, @NotNull UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) {
        FooterComponent footerComponent;
        StepStyles.StepPaddingStyle padding;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyle padding2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final y4 y4Var = new y4(context);
        View f10 = f(context, uiScreen, isLoading, linkedHashMap, y4Var, isModal, shouldApplyFocus);
        List<UiComponent> components = uiScreen.getComponents();
        View view = null;
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        } else {
            footerComponent = null;
        }
        if (footerComponent != null) {
            Map<String, UiComponentConfig> j10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.j(uiScreen.U0());
            StepStyles.UiStepStyle styles = uiScreen.getStyles();
            int a10 = (int) ((styles == null || (padding2 = styles.getPadding()) == null || (screen2 = padding2.getScreen()) == null || (base2 = screen2.getBase()) == null || (left = base2.getLeft()) == null || (dp3 = left.getDp()) == null) ? hq.j.a(24.0d) : hq.j.a(dp3.doubleValue()));
            StepStyles.UiStepStyle styles2 = uiScreen.getStyles();
            view = e(context, footerComponent, j10, isLoading, linkedHashMap, y4Var, a10, (int) ((styles2 == null || (padding = styles2.getPadding()) == null || (screen = padding.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) ? hq.j.a(24.0d) : hq.j.a(dp2.doubleValue())));
            linkedHashMap = linkedHashMap;
            y4Var = y4Var;
        }
        z.b(f10, new Function0() { // from class: yq.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = s.i(y4.this);
                return i10;
            }
        });
        return new g(new h(linkedHashMap), f10, view);
    }

    @NotNull
    public final UiStepBottomSheet j(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new UiStepBottomSheet(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.view.View> k(java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> r13, java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> r14, android.content.Context r15, boolean r16, java.util.List<yq.ComponentView> r17, ar.y4 r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq.s.k(java.util.List, java.util.Map, android.content.Context, boolean, java.util.List, ar.y4, int, int):java.util.List");
    }

    @NotNull
    public final g l(@NotNull lq.b binding, @NotNull UiComponentScreen uiScreen, @Nullable Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        g h10 = h(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.k() == StyleElements.PositionType.CENTER) {
            binding.f23824c.setFillViewport(true);
            h10.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = h10.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            contentView.setLayoutParams(layoutParams2);
        }
        binding.b.addView(h10.getContentView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 13, null);
        if (h10.getFooterView() != null) {
            binding.f23825d.addView(h10.getFooterView());
            uq.g.d(h10.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, h10.getViewBindings().a());
        }
        Integer j10 = uiScreen.j();
        if (j10 != null) {
            binding.f23826e.setControlsColor(j10.intValue());
        }
        return h10;
    }
}
