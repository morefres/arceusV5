package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.n4;
import ar.o;
import ar.x;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
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

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010B\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R(\u0010I\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010D\u0012\u0004\bH\u0010A\u001a\u0004\b<\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lar/n4;", "Lar/o;", "Lar/x;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;)V", "newValue", "m", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getName", j6.b.f21518e, "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "getDisabled", "e", "J", "P0", "()J", "", "Lkr/a;", "f", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcr/k;", "Lcr/k;", "()Lcr/k;", "k", "(Lcr/k;)V", "getNumberController$annotations", "numberController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputNumberComponent implements UiComponent, n4<InputNumberComponent>, o, x {

    @NotNull
    public static final Parcelable.Creator<InputNumberComponent> CREATOR = new a();

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
    public final long lastValueUpdateTs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<kr.a> associatedViews;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public k numberController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputNumberComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputNumberComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputNumberComponent[] newArray(int i10) {
            return new InputNumberComponent[i10];
        }
    }

    public InputNumberComponent(@NotNull String name, @Nullable Number number, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.numberController = new k(number);
    }

    @g(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    public static /* synthetic */ InputNumberComponent j(InputNumberComponent inputNumberComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputNumberComponent.name;
        }
        if ((i10 & 2) != 0) {
            number = inputNumberComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputNumberComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputNumberComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            j10 = inputNumberComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        return inputNumberComponent.g(str, number, jsonLogicBoolean, jsonLogicBoolean2, j11);
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
        if (!(other instanceof InputNumberComponent)) {
            return false;
        }
        InputNumberComponent inputNumberComponent = (InputNumberComponent) other;
        return Intrinsics.c(this.name, inputNumberComponent.name) && Intrinsics.c(this.value, inputNumberComponent.value) && Intrinsics.c(this.hidden, inputNumberComponent.hidden) && Intrinsics.c(this.disabled, inputNumberComponent.disabled) && this.lastValueUpdateTs == inputNumberComponent.lastValueUpdateTs;
    }

    @Override // ar.n4
    @NotNull
    /* renamed from: f, reason: from getter */
    public k getNumberController() {
        return this.numberController;
    }

    @NotNull
    public final InputNumberComponent g(@NotNull String name, @Nullable Number value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputNumberComponent(name, value, hidden, disabled, lastValueUpdateTs);
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
        return ((hashCode3 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // ar.x
    @NotNull
    public List<kr.a> i() {
        return this.associatedViews;
    }

    public void k(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.numberController = kVar;
    }

    @Override // ar.n4
    @NotNull
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public InputNumberComponent a(@Nullable Number newValue) {
        InputNumberComponent j10 = j(this, null, newValue, null, null, System.currentTimeMillis(), 13, null);
        j10.k(getNumberController());
        return j10;
    }

    @NotNull
    public String toString() {
        return "InputNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ InputNumberComponent(String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, number, jsonLogicBoolean, jsonLogicBoolean2, (i10 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InputNumberComponent(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber r11) {
        /*
            r10 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r2 = r11.getName()
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber$Attributes r0 = r11.getAttributes()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Number r0 = r0.getPrefill()
            r3 = r0
            goto L17
        L16:
            r3 = r1
        L17:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber$Attributes r0 = r11.getAttributes()
            if (r0 == 0) goto L23
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getHidden()
            r4 = r0
            goto L24
        L23:
            r4 = r1
        L24:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber$Attributes r11 = r11.getAttributes()
            if (r11 == 0) goto L2e
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r1 = r11.getDisabled()
        L2e:
            r5 = r1
            r8 = 16
            r9 = 0
            r6 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber):void");
    }
}
