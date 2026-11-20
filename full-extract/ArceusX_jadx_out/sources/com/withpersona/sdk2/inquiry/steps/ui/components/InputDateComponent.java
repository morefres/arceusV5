package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.l;
import ar.o;
import ar.x;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import cr.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 Jd\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b=\u0010>R&\u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bA\u00109\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010;R(\u0010L\u001a\u00020F8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bB\u0010G\u0012\u0004\bK\u0010D\u001a\u0004\b8\u0010H\"\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lar/l;", "Lar/o;", "Lar/x;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "monthPlaceholder", "", "monthList", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)V", "newDate", "m", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "getName", j6.b.f21518e, "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "getDisabled", "e", "getMonthPlaceholder", "f", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "J", "P0", "()J", "", "Lkr/a;", "h", "i", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcr/g;", "Lcr/g;", "()Lcr/g;", "k", "(Lcr/g;)V", "getDateController$annotations", "dateController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputDateComponent implements UiComponent, l<InputDateComponent>, o, x {

    @NotNull
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String monthPlaceholder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<String> monthList;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<kr.a> associatedViews;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public g dateController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputDateComponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDateComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputDateComponent[] newArray(int i10) {
            return new InputDateComponent[i10];
        }
    }

    public InputDateComponent(@NotNull String name, @Nullable String str, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str2, @NotNull List<String> monthList, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.name = name;
        this.value = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.monthPlaceholder = str2;
        this.monthList = monthList;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.dateController = new g(str, str2, monthList);
    }

    @sm.g(ignore = true)
    public static /* synthetic */ void getDateController$annotations() {
    }

    public static /* synthetic */ InputDateComponent j(InputDateComponent inputDateComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3, List list, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputDateComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputDateComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputDateComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputDateComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            str3 = inputDateComponent.monthPlaceholder;
        }
        if ((i10 & 32) != 0) {
            list = inputDateComponent.monthList;
        }
        if ((i10 & 64) != 0) {
            j10 = inputDateComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        String str4 = str3;
        List list2 = list;
        return inputDateComponent.g(str, str2, jsonLogicBoolean, jsonLogicBoolean2, str4, list2, j11);
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
        if (!(other instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) other;
        return Intrinsics.c(this.name, inputDateComponent.name) && Intrinsics.c(this.value, inputDateComponent.value) && Intrinsics.c(this.hidden, inputDateComponent.hidden) && Intrinsics.c(this.disabled, inputDateComponent.disabled) && Intrinsics.c(this.monthPlaceholder, inputDateComponent.monthPlaceholder) && Intrinsics.c(this.monthList, inputDateComponent.monthList) && this.lastValueUpdateTs == inputDateComponent.lastValueUpdateTs;
    }

    @Override // ar.l
    @NotNull
    /* renamed from: f, reason: from getter */
    public g getDateController() {
        return this.dateController;
    }

    @NotNull
    public final InputDateComponent g(@NotNull String name, @Nullable String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable String monthPlaceholder, @NotNull List<String> monthList, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        return new InputDateComponent(name, value, hidden, disabled, monthPlaceholder, monthList, lastValueUpdateTs);
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
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode4 = (hashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str2 = this.monthPlaceholder;
        return ((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.monthList.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // ar.x
    @NotNull
    public List<kr.a> i() {
        return this.associatedViews;
    }

    public void k(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.dateController = gVar;
    }

    @Override // ar.l
    @NotNull
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public InputDateComponent a(@Nullable String newDate) {
        InputDateComponent j10 = j(this, null, newDate, null, null, null, null, System.currentTimeMillis(), 61, null);
        j10.k(getDateController());
        return j10;
    }

    @NotNull
    public String toString() {
        return "InputDateComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", monthPlaceholder=" + this.monthPlaceholder + ", monthList=" + this.monthList + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.monthPlaceholder);
        dest.writeStringList(this.monthList);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ InputDateComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str3, List list, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, str3, list, (i10 & 64) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InputDateComponent(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate r13) {
        /*
            r12 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r2 = r13.getName()
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate$Attributes r0 = r13.getAttributes()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getPrefill()
            r3 = r0
            goto L17
        L16:
            r3 = r1
        L17:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate$Attributes r0 = r13.getAttributes()
            if (r0 == 0) goto L23
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getHidden()
            r4 = r0
            goto L24
        L23:
            r4 = r1
        L24:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate$Attributes r0 = r13.getAttributes()
            if (r0 == 0) goto L30
            com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean r0 = r0.getDisabled()
            r5 = r0
            goto L31
        L30:
            r5 = r1
        L31:
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate$Attributes r0 = r13.getAttributes()
            if (r0 == 0) goto L3b
            java.lang.String r1 = r0.getPlaceholderMonth()
        L3b:
            r6 = r1
            com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate$Attributes r13 = r13.getAttributes()
            if (r13 == 0) goto L4b
            java.util.List r13 = r13.getTextMonths()
            if (r13 != 0) goto L49
            goto L4b
        L49:
            r7 = r13
            goto L50
        L4b:
            java.util.List r13 = kotlin.collections.p.k()
            goto L49
        L50:
            r10 = 64
            r11 = 0
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate):void");
    }
}
