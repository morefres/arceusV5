package go;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.ui.ClickableConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u001b\u001a\r\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b\u001a0\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J3\u0010.\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u00103R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010:R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010I\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'0Ej\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010P\u001a\u00020J2\u0006\u0010N\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010L\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lgo/k;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "iconStyle", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lhq/j0;", "Llo/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "H", "(Landroid/view/ViewGroup;I)Lhq/j0;", "e", "()I", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "viewHolder", "D", "(Llo/f;)V", "binding", "Landroid/graphics/drawable/Drawable;", "drawableRes", "J", "(Llo/f;Landroid/graphics/drawable/Drawable;)V", "strokeColor", "fillColor", "iconDrawable", "F", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "pressedColor", "Landroid/content/res/ColorStateList;", "E", "(I)Landroid/content/res/ColorStateList;", rl.d.f30696a, "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "g", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "getIconStyle", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "h", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "i", "Ljava/util/HashMap;", "cachedImages", "", "j", "Z", "useIcons", "value", "k", "isEnabled", "()Z", "I", "(Z)V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends RecyclerView.h<RecyclerView.f0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<EnabledIdClass> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.GovernmentIdStepStyle styles;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InquiryTheme.c iconStyle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<IdConfig, Unit> onClick;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<Integer, Drawable> cachedImages;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean useIcons;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isEnabled;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18644a;

        static {
            int[] iArr = new int[j2.values().length];
            try {
                iArr[j2.f18631a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j2.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j2.f18632c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j2.f18633d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18644a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull Context context, @NotNull List<EnabledIdClass> data, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.SelectPage selectPage, @NotNull InquiryTheme.c iconStyle, @NotNull Function1<? super IdConfig, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.data = data;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.iconStyle = iconStyle;
        this.onClick = onClick;
        this.cachedImages = new HashMap<>();
        this.useIcons = !hq.z.b(context, tp.a.f32340d, null, false, false, 14, null);
        this.isEnabled = true;
    }

    public static final void G(k kVar, EnabledIdClass enabledIdClass, View view) {
        kVar.onClick.invoke(enabledIdClass.getIdConfig());
    }

    public final void D(lo.f viewHolder) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
            TextView label = viewHolder.f23715e;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            hr.h0.l(label, governmentIdVerticalOptionTextStyle, null, 2, null);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (chevronColor = governmentIdStepStyle2.getChevronColor()) != null) {
            viewHolder.b.setColorFilter(chevronColor.intValue());
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this.styles;
        if (governmentIdStepStyle3 != null && (backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue()) != null) {
            int intValue = backgroundColorValue.intValue();
            Integer activeOptionBackgroundColorValue = this.styles.getActiveOptionBackgroundColorValue();
            if (activeOptionBackgroundColorValue != null) {
                viewHolder.getRoot().setBackground(new RippleDrawable(E(activeOptionBackgroundColorValue.intValue()), new ColorDrawable(intValue), null));
            }
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = this.styles;
        if (governmentIdStepStyle4 == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle4.getGovernmentIdSelectOptionMinRowHeight()) == null) {
            return;
        }
        viewHolder.f23716f.setMinHeight((int) hq.j.a(governmentIdSelectOptionMinRowHeight.doubleValue()));
    }

    public final ColorStateList E(int pressedColor) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{pressedColor});
    }

    public final Drawable F(Context context, Integer strokeColor, Integer fillColor, Drawable iconDrawable) {
        Drawable mutate;
        ArrayList arrayList = new ArrayList();
        if (strokeColor != null) {
            iconDrawable.mutate().setTint(strokeColor.intValue());
        }
        Drawable b = k.a.b(context, m2.f18663e);
        if (fillColor != null && b != null && (mutate = b.mutate()) != null) {
            mutate.setTint(fillColor.intValue());
        }
        if (b != null) {
            arrayList.add(b);
        }
        arrayList.add(iconDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public hq.j0<lo.f> t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        lo.f c10 = lo.f.c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        hq.j0<lo.f> j0Var = new hq.j0<>(c10);
        lo.f N = j0Var.N();
        Intrinsics.checkNotNullExpressionValue(N, "<get-binding>(...)");
        D(N);
        return j0Var;
    }

    public final void I(boolean z10) {
        if (this.isEnabled == z10) {
            return;
        }
        this.isEnabled = z10;
        j();
    }

    public final void J(lo.f binding, Drawable drawableRes) {
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        Integer num = null;
        Integer valueOf = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (governmentIdIconFillColor = governmentIdStepStyle2.getGovernmentIdIconFillColor()) != null) {
            num = Integer.valueOf(governmentIdIconFillColor.intValue());
        }
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable mutate = F(context, valueOf, num, drawableRes).mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        binding.f23713c.setImageDrawable(mutate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void r(@NotNull RecyclerView.f0 holder, int position) {
        RemoteImage iconPassport;
        int i10;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EnabledIdClass enabledIdClass = this.data.get(position);
        lo.f fVar = (lo.f) hq.k0.a(holder);
        fVar.f23715e.setText(enabledIdClass.getName());
        j2 icon = enabledIdClass.getIcon();
        int[] iArr = a.f18644a;
        int i11 = iArr[icon.ordinal()];
        if (i11 == 1) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.assetConfig;
            if (selectPage != null) {
                iconPassport = selectPage.getIconPassport();
            }
            iconPassport = null;
        } else if (i11 == 2) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage2 = this.assetConfig;
            if (selectPage2 != null) {
                iconPassport = selectPage2.getIconGovernmentId();
            }
            iconPassport = null;
        } else if (i11 == 3) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage3 = this.assetConfig;
            if (selectPage3 != null) {
                iconPassport = selectPage3.getIconDriversLicense();
            }
            iconPassport = null;
        } else {
            if (i11 != 4) {
                throw new gt.l();
            }
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage4 = this.assetConfig;
            if (selectPage4 == null || (iconPassport = selectPage4.getIconNationalId()) == null) {
                NextStep.GovernmentId.AssetConfig.SelectPage selectPage5 = this.assetConfig;
                if (selectPage5 != null) {
                    iconPassport = selectPage5.getIconGovernmentId();
                }
                iconPassport = null;
            }
        }
        Object tag = fVar.f23714d.getTag(n2.f18697m0);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            fVar.f23714d.removeView(view);
        }
        if (!this.useIcons || this.iconStyle == InquiryTheme.c.b) {
            fVar.f23714d.setVisibility(8);
            TextView label = fVar.f23715e;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            label.setPaddingRelative(0, label.getPaddingTop(), label.getPaddingEnd(), label.getPaddingBottom());
        } else if (iconPassport != null) {
            ConstraintLayout iconContainer = fVar.f23714d;
            Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
            fVar.f23714d.setTag(n2.f18697m0, jr.c.e(iconPassport, iconContainer, true));
            fVar.f23713c.setVisibility(8);
            TextView label2 = fVar.f23715e;
            Intrinsics.checkNotNullExpressionValue(label2, "label");
            label2.setPaddingRelative((int) hq.j.a(8.0d), label2.getPaddingTop(), label2.getPaddingEnd(), label2.getPaddingBottom());
        } else {
            fVar.f23713c.setVisibility(0);
            if (this.cachedImages.get(Integer.valueOf(position)) != null) {
                fVar.f23713c.setImageDrawable(this.cachedImages.get(Integer.valueOf(position)));
            } else {
                int i12 = iArr[enabledIdClass.getIcon().ordinal()];
                if (i12 == 1) {
                    i10 = m2.f18669k;
                } else if (i12 == 2) {
                    i10 = m2.f18662d;
                } else if (i12 == 3) {
                    i10 = m2.f18666h;
                } else {
                    if (i12 != 4) {
                        throw new gt.l();
                    }
                    i10 = m2.f18667i;
                }
                Drawable b = k.a.b(fVar.getRoot().getContext(), i10);
                if (b != null) {
                    J(fVar, b);
                    this.cachedImages.put(Integer.valueOf(position), fVar.f23713c.getDrawable());
                }
            }
            TextView label3 = fVar.f23715e;
            Intrinsics.checkNotNullExpressionValue(label3, "label");
            label3.setPaddingRelative((int) hq.j.a(8.0d), label3.getPaddingTop(), label3.getPaddingEnd(), label3.getPaddingBottom());
        }
        ClickableConstraintLayout root = fVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.a.a(root, tp.g.f32381a);
        fVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: go.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.G(k.this, enabledIdClass, view2);
            }
        });
        fVar.getRoot().setEnabled(this.isEnabled);
    }
}
