package com.withpersona.sdk2.inquiry.steps.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import j6.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", ve.a.f33391e, "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", b.f21518e, "U0", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "i", "()Ljava/lang/Integer;", "backgroundColor", "j", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "k", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UiComponentScreen implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UiComponentScreen> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<UiComponent> components;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<UiComponentConfig> componentConfigs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final StepStyles.UiStepStyle styles;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UiComponentScreen> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiComponentScreen createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList2.add(parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList3.add(parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
            }
            return new UiComponentScreen(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UiComponentScreen[] newArray(int i10) {
            return new UiComponentScreen[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiComponentScreen(@Nullable List<? extends UiComponent> list, @NotNull List<? extends UiComponentConfig> componentConfigs, @Nullable StepStyles.UiStepStyle uiStepStyle) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        this.components = list;
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiComponentScreen g(UiComponentScreen uiComponentScreen, List list, List list2, StepStyles.UiStepStyle uiStepStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = uiComponentScreen.components;
        }
        if ((i10 & 2) != 0) {
            list2 = uiComponentScreen.componentConfigs;
        }
        if ((i10 & 4) != 0) {
            uiStepStyle = uiComponentScreen.styles;
        }
        return uiComponentScreen.f(list, list2, uiStepStyle);
    }

    @NotNull
    public final List<UiComponentConfig> U0() {
        return this.componentConfigs;
    }

    @Nullable
    public final Drawable a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return d.a(uiStepStyle, context);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiComponentScreen)) {
            return false;
        }
        UiComponentScreen uiComponentScreen = (UiComponentScreen) other;
        return Intrinsics.c(this.components, uiComponentScreen.components) && Intrinsics.c(this.componentConfigs, uiComponentScreen.componentConfigs) && Intrinsics.c(this.styles, uiComponentScreen.styles);
    }

    @NotNull
    public final UiComponentScreen f(@Nullable List<? extends UiComponent> components, @NotNull List<? extends UiComponentConfig> componentConfigs, @Nullable StepStyles.UiStepStyle styles) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        return new UiComponentScreen(components, componentConfigs, styles);
    }

    @Nullable
    public final List<UiComponent> getComponents() {
        return this.components;
    }

    @Nullable
    public final StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        List<UiComponent> list = this.components;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.componentConfigs.hashCode()) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return hashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    @Nullable
    public final Integer i() {
        StepStyles.StepBackgroundColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (backgroundColor = uiStepStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Nullable
    public final Integer j() {
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Nullable
    public final StyleElements.PositionType k() {
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return uiStepStyle.getPageLevelVerticalAlignment();
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "UiComponentScreen(components=" + this.components + ", componentConfigs=" + this.componentConfigs + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UiComponent> list = this.components;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<UiComponentConfig> list2 = this.componentConfigs;
        dest.writeInt(list2.size());
        Iterator<UiComponentConfig> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.styles, flags);
    }
}
