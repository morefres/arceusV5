package com.withpersona.sdk2.inquiry.jpmynumber;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import j6.b;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "Landroid/os/Parcelable;", "Ljp/b;", "operation", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "strings", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "Ljp/h;", "scanMethod", "<init>", "(Ljp/b;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Ljp/h;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljp/b;", "getOperation", "()Ljp/b;", b.f21518e, "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "getStrings", "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "getTransitionComponents", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", d.f30696a, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStepStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "f", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "g", "Ljp/h;", "getScanMethod", "()Ljp/h;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class JpMyNumberNfcReaderConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JpMyNumberNfcReaderConfig> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final jp.b operation;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final JpMyNumberNfcStrings strings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JpMyNumberNfcScan.TransitionComponents transitionComponents;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JpMyNumberNfcScan.JpMyNumberNfcScanStyles styles;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Integer theme;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final h scanMethod;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JpMyNumberNfcReaderConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcReaderConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JpMyNumberNfcReaderConfig(jp.b.valueOf(parcel.readString()), JpMyNumberNfcStrings.CREATOR.createFromParcel(parcel), (JpMyNumberNfcScan.TransitionComponents) parcel.readParcelable(JpMyNumberNfcReaderConfig.class.getClassLoader()), (JpMyNumberNfcScan.JpMyNumberNfcScanStyles) parcel.readParcelable(JpMyNumberNfcReaderConfig.class.getClassLoader()), (StepStyles.UiStepStyle) parcel.readParcelable(JpMyNumberNfcReaderConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcReaderConfig[] newArray(int i10) {
            return new JpMyNumberNfcReaderConfig[i10];
        }
    }

    public JpMyNumberNfcReaderConfig(@NotNull jp.b operation, @NotNull JpMyNumberNfcStrings strings, @Nullable JpMyNumberNfcScan.TransitionComponents transitionComponents, @Nullable JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @NotNull h scanMethod) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(scanMethod, "scanMethod");
        this.operation = operation;
        this.strings = strings;
        this.transitionComponents = transitionComponents;
        this.styles = jpMyNumberNfcScanStyles;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.scanMethod = scanMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JpMyNumberNfcReaderConfig)) {
            return false;
        }
        JpMyNumberNfcReaderConfig jpMyNumberNfcReaderConfig = (JpMyNumberNfcReaderConfig) other;
        return this.operation == jpMyNumberNfcReaderConfig.operation && Intrinsics.c(this.strings, jpMyNumberNfcReaderConfig.strings) && Intrinsics.c(this.transitionComponents, jpMyNumberNfcReaderConfig.transitionComponents) && Intrinsics.c(this.styles, jpMyNumberNfcReaderConfig.styles) && Intrinsics.c(this.stepStyles, jpMyNumberNfcReaderConfig.stepStyles) && Intrinsics.c(this.theme, jpMyNumberNfcReaderConfig.theme) && this.scanMethod == jpMyNumberNfcReaderConfig.scanMethod;
    }

    public int hashCode() {
        int hashCode = ((this.operation.hashCode() * 31) + this.strings.hashCode()) * 31;
        JpMyNumberNfcScan.TransitionComponents transitionComponents = this.transitionComponents;
        int hashCode2 = (hashCode + (transitionComponents == null ? 0 : transitionComponents.hashCode())) * 31;
        JpMyNumberNfcScan.JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles = this.styles;
        int hashCode3 = (hashCode2 + (jpMyNumberNfcScanStyles == null ? 0 : jpMyNumberNfcScanStyles.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.stepStyles;
        int hashCode4 = (hashCode3 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        Integer num = this.theme;
        return ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.scanMethod.hashCode();
    }

    @NotNull
    public String toString() {
        return "JpMyNumberNfcReaderConfig(operation=" + this.operation + ", strings=" + this.strings + ", transitionComponents=" + this.transitionComponents + ", styles=" + this.styles + ", stepStyles=" + this.stepStyles + ", theme=" + this.theme + ", scanMethod=" + this.scanMethod + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int intValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.operation.name());
        this.strings.writeToParcel(dest, flags);
        dest.writeParcelable(this.transitionComponents, flags);
        dest.writeParcelable(this.styles, flags);
        dest.writeParcelable(this.stepStyles, flags);
        Integer num = this.theme;
        if (num == null) {
            intValue = 0;
        } else {
            dest.writeInt(1);
            intValue = num.intValue();
        }
        dest.writeInt(intValue);
        dest.writeString(this.scanMethod.name());
    }
}
