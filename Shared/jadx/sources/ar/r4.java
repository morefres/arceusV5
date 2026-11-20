package ar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yq.ComponentView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/ViewGroup;", "root", "Landroidx/constraintlayout/widget/c;", "constraintSet", "", "Lyq/a;", "componentViews", "", "childrenIds", "", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "alignment", "justify", "gap", "", ve.a.f33391e, "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/c;Ljava/util/List;Ljava/util/List;[ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", j6.b.f21518e, "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/c;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r4 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3574a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3574a = iArr;
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, @NotNull androidx.constraintlayout.widget.c constraintSet, @NotNull List<ComponentView> componentViews, @NotNull List<Integer> childrenIds, @Nullable int[] iArr, @Nullable StyleElements.PositionType positionType, @Nullable StyleElements.PositionType positionType2, int i10) {
        Integer num;
        int i11;
        Integer N;
        Object obj;
        Object obj2;
        List<kr.a> i12;
        ViewGroup root = viewGroup;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        double g02 = iArr != null ? kotlin.collections.m.g0(iArr) : 0.0d;
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i13 = 0;
        for (Object obj3 : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.p.t();
            }
            int intValue = ((Number) obj3).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kr.b bVar = new kr.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i13 != kotlin.collections.p.m(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ComponentView) obj2).d().getId() == intValue) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) obj2;
                UiComponent c10 = componentView != null ? componentView.c() : null;
                x xVar = c10 instanceof x ? (x) c10 : null;
                if (xVar != null && (i12 = xVar.i()) != null) {
                    i12.add(bVar);
                }
                root.addView(bVar);
                constraintSet.m(bVar.getId(), i10);
                constraintSet.o(bVar.getId(), true);
                constraintSet.l(bVar.getId(), 1);
                constraintSet.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i13 = i14;
        }
        int i15 = 0;
        for (Object obj4 : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                kotlin.collections.p.t();
            }
            int intValue2 = ((Number) obj4).intValue();
            Integer num2 = i15 > 0 ? (Integer) arrayList.get(i15 - 1) : null;
            if (i15 == kotlin.collections.p.m(childrenIds)) {
                constraintSet.h(intValue2, 7, 0, 7);
                Iterator<T> it2 = componentViews.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((ComponentView) obj).d().getId() == intValue2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) obj;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((kr.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
                i11 = 6;
            } else {
                num = (Integer) arrayList.get(i15);
                i11 = 6;
                constraintSet.h(intValue2, 7, num.intValue(), 6);
                constraintSet.h(num.intValue(), 6, intValue2, 7);
                constraintSet.h(num.intValue(), 7, childrenIds.get(i16).intValue(), 6);
                constraintSet.h(childrenIds.get(i16).intValue(), 6, num.intValue(), 7);
            }
            if (i15 == 0) {
                constraintSet.h(intValue2, i11, 0, i11);
            }
            constraintSet.l(intValue2, -2);
            constraintSet.n(intValue2, true);
            if (g02 > 0.0d) {
                double intValue3 = ((iArr == null || (N = kotlin.collections.m.N(iArr, i15)) == null) ? 0 : N.intValue()) / g02;
                if (intValue3 > 0.0d) {
                    constraintSet.D(intValue2, (float) intValue3);
                } else {
                    constraintSet.m(intValue2, -2);
                }
            } else {
                constraintSet.m(intValue2, -2);
                constraintSet.o(intValue2, true);
            }
            constraintSet.h(intValue2, 3, 0, 3);
            constraintSet.h(intValue2, 4, 0, 4);
            if (num != null) {
                constraintSet.h(num.intValue(), 3, 0, 3);
                constraintSet.h(num.intValue(), 4, 0, 4);
            }
            int i17 = positionType == null ? -1 : a.f3574a[positionType.ordinal()];
            if (i17 == 1) {
                constraintSet.F(intValue2, 0.0f);
            } else if (i17 != 2) {
                constraintSet.F(intValue2, 0.5f);
            } else {
                constraintSet.F(intValue2, 1.0f);
            }
            if (i15 == 0) {
                int i18 = positionType2 == null ? -1 : a.f3574a[positionType2.ordinal()];
                if (i18 == 1) {
                    constraintSet.C(intValue2, 2);
                    constraintSet.B(intValue2, 0.0f);
                } else if (i18 == 2) {
                    constraintSet.C(intValue2, 2);
                    constraintSet.B(intValue2, 1.0f);
                } else if (i18 == 3) {
                    constraintSet.C(intValue2, 2);
                    constraintSet.B(intValue2, 0.5f);
                }
            }
            root = viewGroup;
            i15 = i16;
        }
    }

    public static final void b(@NotNull ViewGroup root, @NotNull androidx.constraintlayout.widget.c constraintSet, @NotNull List<ComponentView> componentViews, @NotNull List<Integer> childrenIds, @Nullable StyleElements.PositionType positionType, @Nullable StyleElements.PositionType positionType2, int i10) {
        Integer num;
        boolean z10;
        Object obj;
        Object obj2;
        List<kr.a> i11;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i12 = 0;
        int i13 = 0;
        for (Object obj3 : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.p.t();
            }
            int intValue = ((Number) obj3).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kr.b bVar = new kr.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i13 != kotlin.collections.p.m(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ComponentView) obj2).d().getId() == intValue) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) obj2;
                UiComponent c10 = componentView != null ? componentView.c() : null;
                x xVar = c10 instanceof x ? (x) c10 : null;
                if (xVar != null && (i11 = xVar.i()) != null) {
                    i11.add(bVar);
                }
                root.addView(bVar);
                constraintSet.m(bVar.getId(), 1);
                constraintSet.o(bVar.getId(), true);
                constraintSet.l(bVar.getId(), i10);
                constraintSet.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i13 = i14;
        }
        int i15 = 0;
        for (Object obj4 : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                kotlin.collections.p.t();
            }
            int intValue2 = ((Number) obj4).intValue();
            Integer num2 = i15 > 0 ? (Integer) arrayList.get(i15 - 1) : null;
            if (i15 == kotlin.collections.p.m(childrenIds)) {
                constraintSet.h(intValue2, 4, i12, 4);
                Iterator<T> it2 = componentViews.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((ComponentView) obj).d().getId() == intValue2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) obj;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((kr.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
            } else {
                num = (Integer) arrayList.get(i15);
                constraintSet.h(num.intValue(), 3, intValue2, 4);
                constraintSet.h(intValue2, 4, num.intValue(), 3);
            }
            if (i15 == 0) {
                constraintSet.h(intValue2, 3, i12, 3);
            }
            if (num2 != null) {
                constraintSet.h(num2.intValue(), 4, intValue2, 3);
                constraintSet.h(intValue2, 3, num2.intValue(), 4);
            }
            constraintSet.h(intValue2, 6, i12, 6);
            constraintSet.h(intValue2, 7, i12, 7);
            if (num != null) {
                constraintSet.h(num.intValue(), 6, i12, 6);
                constraintSet.h(num.intValue(), 7, i12, 7);
            }
            constraintSet.l(intValue2, -2);
            constraintSet.m(intValue2, i12);
            int i17 = positionType == null ? -1 : a.f3574a[positionType.ordinal()];
            if (i17 == 1) {
                constraintSet.B(intValue2, 0.0f);
            } else if (i17 != 2) {
                constraintSet.B(intValue2, 0.5f);
            } else {
                constraintSet.B(intValue2, 1.0f);
            }
            if (i15 == 0) {
                int i18 = positionType2 == null ? -1 : a.f3574a[positionType2.ordinal()];
                z10 = true;
                if (i18 == 1) {
                    constraintSet.G(intValue2, 2);
                    constraintSet.F(intValue2, 0.0f);
                } else if (i18 == 2) {
                    constraintSet.G(intValue2, 2);
                    constraintSet.F(intValue2, 1.0f);
                } else if (i18 == 3) {
                    constraintSet.G(intValue2, 2);
                    constraintSet.F(intValue2, 0.5f);
                }
            } else {
                z10 = true;
            }
            i15 = i16;
            i12 = 0;
        }
    }
}
