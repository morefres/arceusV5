package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.n4;
import ar.o;
import ar.x;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import cr.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.g;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010G\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b!\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR(\u0010O\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bN\u0010F\u001a\u0004\b<\u0010K\"\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lar/n4;", "Lar/o;", "Lar/x;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)V", "newValue", "o", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getName", j6.b.f21518e, "Ljava/lang/Number;", "m", "()Ljava/lang/Number;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "k", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "f", "J", "P0", "()J", "", "Lkr/a;", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcr/k;", "h", "Lcr/k;", "()Lcr/k;", "n", "(Lcr/k;)V", "getNumberController$annotations", "numberController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputCurrencyComponent implements UiComponent, n4<InputCurrencyComponent>, o, x {

    @NotNull
    public static final Parcelable.Creator<InputCurrencyComponent> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Number value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final TextBasedComponentStyle errorTextStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<kr.a> associatedViews;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public k numberController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputCurrencyComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputCurrencyComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCurrencyComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputCurrencyComponent[] newArray(int i10) {
            return new InputCurrencyComponent[i10];
        }
    }

    public InputCurrencyComponent(@NotNull String name, @Nullable Number number, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable TextBasedComponentStyle textBasedComponentStyle, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.numberController = new k(number);
    }

    @g(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    public static /* synthetic */ InputCurrencyComponent j(InputCurrencyComponent inputCurrencyComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputCurrencyComponent.name;
        }
        if ((i10 & 2) != 0) {
            number = inputCurrencyComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputCurrencyComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputCurrencyComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            textBasedComponentStyle = inputCurrencyComponent.errorTextStyle;
        }
        if ((i10 & 32) != 0) {
            j10 = inputCurrencyComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputCurrencyComponent.g(str, number, jsonLogicBoolean3, jsonLogicBoolean2, textBasedComponentStyle2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* renamed from: P0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurrencyComponent)) {
            return false;
        }
        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) other;
        return Intrinsics.c(this.name, inputCurrencyComponent.name) && Intrinsics.c(this.value, inputCurrencyComponent.value) && Intrinsics.c(this.hidden, inputCurrencyComponent.hidden) && Intrinsics.c(this.disabled, inputCurrencyComponent.disabled) && Intrinsics.c(this.errorTextStyle, inputCurrencyComponent.errorTextStyle) && this.lastValueUpdateTs == inputCurrencyComponent.lastValueUpdateTs;
    }

    @Override // ar.n4
    @NotNull
    /* renamed from: f, reason: from getter */
    public k getNumberController() {
        return this.numberController;
    }

    @NotNull
    public final InputCurrencyComponent g(@NotNull String name, @Nullable Number value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable TextBasedComponentStyle errorTextStyle, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputCurrencyComponent(name, value, hidden, disabled, errorTextStyle, lastValueUpdateTs);
    }

    @Override // ar.o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // ar.x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Number number = this.value;
        int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode4 = (hashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        return ((hashCode4 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // ar.x
    @NotNull
    public List<kr.a> i() {
        return this.associatedViews;
    }

    @Nullable
    /* renamed from: k, reason: from getter */
    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    @Nullable
    /* renamed from: m, reason: from getter */
    public final Number getValue() {
        return this.value;
    }

    public void n(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.numberController = kVar;
    }

    @Override // ar.n4
    @NotNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public InputCurrencyComponent a(@Nullable Number newValue) {
        InputCurrencyComponent j10 = j(this, null, newValue, null, null, null, System.currentTimeMillis(), 29, null);
        j10.n(getNumberController());
        return j10;
    }

    @NotNull
    public String toString() {
        return "InputCurrencyComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ InputCurrencyComponent(String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, number, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle, (i10 & 32) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InputCurrencyComponent(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency r12) {
        /*
            r11 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.getName()
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency$Attributes r0 = r12.getAttributes()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Number r0 = r0.getPrefill()
            r3 = r0
            goto L17
        L16:
            r3 = r1
        L17:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency$Attributes r0 = r12.getAttributes()
            if (r0 == 0) goto L23
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getHidden()
            r4 = r0
            goto L24
        L23:
            r4 = r1
        L24:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency$Attributes r0 = r12.getAttributes()
            if (r0 == 0) goto L30
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getDisabled()
            r5 = r0
            goto L31
        L30:
            r5 = r1
        L31:
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle r12 = r12.getStyles()
            if (r12 == 0) goto L3b
            com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle r1 = r12.getErrorTextStyle()
        L3b:
            r6 = r1
            r9 = 32
            r10 = 0
            r7 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency):void");
    }
}
