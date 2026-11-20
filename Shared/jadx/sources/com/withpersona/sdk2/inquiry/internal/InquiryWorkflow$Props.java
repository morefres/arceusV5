package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props", "Landroid/os/Parcelable;", "Lxo/h;", "j0", "()Lxo/h;", "environment", "", "getTheme", "()Ljava/lang/Integer;", "theme", "", "p3", "()Ljava/lang/String;", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "f1", "()Ljava/util/List;", "fieldMappings", "", "M", "()Z", "redactAppIdentifyingInformation", "TemplateProps", "InquiryProps", "OneTimeCodeProps", "RelaySessionProps", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InquiryWorkflow$Props extends Parcelable {
    default boolean M() {
        return this instanceof RelaySessionProps;
    }

    @NotNull
    List<FieldMapping> f1();

    @Nullable
    Integer getTheme();

    @NotNull
    /* renamed from: j0 */
    xo.h getEnvironment();

    @Nullable
    /* renamed from: p3 */
    String getShareToken();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\t\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "oneTimeLinkCode", "Lxo/h;", "environment", "", "theme", "", "isCancelled", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Lxo/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "Lxo/h;", "j0", "()Lxo/h;", "c", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", rl.d.f30696a, "Z", "()Z", "e", "p3", "f", "Ljava/util/List;", "f1", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneTimeCodeProps implements InquiryWorkflow$Props {

        @NotNull
        public static final Parcelable.Creator<OneTimeCodeProps> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String oneTimeLinkCode;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final xo.h environment;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer theme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isCancelled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String shareToken;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<FieldMapping> fieldMappings;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OneTimeCodeProps> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OneTimeCodeProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                xo.h valueOf = xo.h.valueOf(parcel.readString());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(OneTimeCodeProps.class.getClassLoader()));
                }
                return new OneTimeCodeProps(readString, valueOf, valueOf2, z10, readString2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OneTimeCodeProps[] newArray(int i10) {
                return new OneTimeCodeProps[i10];
            }
        }

        public OneTimeCodeProps(@NotNull String oneTimeLinkCode, @NotNull xo.h environment, @Nullable Integer num, boolean z10, @Nullable String str, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            this.oneTimeLinkCode = oneTimeLinkCode;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z10;
            this.shareToken = str;
            this.fieldMappings = fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public boolean M() {
            return super.M();
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OneTimeCodeProps)) {
                return false;
            }
            OneTimeCodeProps oneTimeCodeProps = (OneTimeCodeProps) other;
            return Intrinsics.c(this.oneTimeLinkCode, oneTimeCodeProps.oneTimeLinkCode) && this.environment == oneTimeCodeProps.environment && Intrinsics.c(this.theme, oneTimeCodeProps.theme) && this.isCancelled == oneTimeCodeProps.isCancelled && Intrinsics.c(this.shareToken, oneTimeCodeProps.shareToken) && Intrinsics.c(this.fieldMappings, oneTimeCodeProps.fieldMappings);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        public List<FieldMapping> f1() {
            return this.fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        public Integer getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int hashCode = ((this.oneTimeLinkCode.hashCode() * 31) + this.environment.hashCode()) * 31;
            Integer num = this.theme;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled)) * 31;
            String str = this.shareToken;
            return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.fieldMappings.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        /* renamed from: j0, reason: from getter */
        public xo.h getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        /* renamed from: p3, reason: from getter */
        public String getShareToken() {
            return this.shareToken;
        }

        @NotNull
        public String toString() {
            return "OneTimeCodeProps(oneTimeLinkCode=" + this.oneTimeLinkCode + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ", shareToken=" + this.shareToken + ", fieldMappings=" + this.fieldMappings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int intValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.oneTimeLinkCode);
            dest.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                intValue = 0;
            } else {
                dest.writeInt(1);
                intValue = num.intValue();
            }
            dest.writeInt(intValue);
            dest.writeInt(this.isCancelled ? 1 : 0);
            dest.writeString(this.shareToken);
            List<FieldMapping> list = this.fieldMappings;
            dest.writeInt(list.size());
            Iterator<FieldMapping> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public /* synthetic */ OneTimeCodeProps(String str, xo.h hVar, Integer num, boolean z10, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, hVar, num, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? kotlin.collections.p.k() : list);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\t\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "relaySessionToken", "Lxo/h;", "environment", "", "theme", "", "isCancelled", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Lxo/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "Lxo/h;", "j0", "()Lxo/h;", "c", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", rl.d.f30696a, "Z", "()Z", "e", "p3", "f", "Ljava/util/List;", "f1", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RelaySessionProps implements InquiryWorkflow$Props {

        @NotNull
        public static final Parcelable.Creator<RelaySessionProps> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String relaySessionToken;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final xo.h environment;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer theme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isCancelled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String shareToken;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<FieldMapping> fieldMappings;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RelaySessionProps> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RelaySessionProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                xo.h valueOf = xo.h.valueOf(parcel.readString());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(RelaySessionProps.class.getClassLoader()));
                }
                return new RelaySessionProps(readString, valueOf, valueOf2, z10, readString2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RelaySessionProps[] newArray(int i10) {
                return new RelaySessionProps[i10];
            }
        }

        public RelaySessionProps(@NotNull String relaySessionToken, @NotNull xo.h environment, @Nullable Integer num, boolean z10, @Nullable String str, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(relaySessionToken, "relaySessionToken");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            this.relaySessionToken = relaySessionToken;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z10;
            this.shareToken = str;
            this.fieldMappings = fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public boolean M() {
            return super.M();
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getRelaySessionToken() {
            return this.relaySessionToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelaySessionProps)) {
                return false;
            }
            RelaySessionProps relaySessionProps = (RelaySessionProps) other;
            return Intrinsics.c(this.relaySessionToken, relaySessionProps.relaySessionToken) && this.environment == relaySessionProps.environment && Intrinsics.c(this.theme, relaySessionProps.theme) && this.isCancelled == relaySessionProps.isCancelled && Intrinsics.c(this.shareToken, relaySessionProps.shareToken) && Intrinsics.c(this.fieldMappings, relaySessionProps.fieldMappings);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        public List<FieldMapping> f1() {
            return this.fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        public Integer getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int hashCode = ((this.relaySessionToken.hashCode() * 31) + this.environment.hashCode()) * 31;
            Integer num = this.theme;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled)) * 31;
            String str = this.shareToken;
            return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.fieldMappings.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        /* renamed from: j0, reason: from getter */
        public xo.h getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        /* renamed from: p3, reason: from getter */
        public String getShareToken() {
            return this.shareToken;
        }

        @NotNull
        public String toString() {
            return "RelaySessionProps(relaySessionToken=" + this.relaySessionToken + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ", shareToken=" + this.shareToken + ", fieldMappings=" + this.fieldMappings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int intValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.relaySessionToken);
            dest.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                intValue = 0;
            } else {
                dest.writeInt(1);
                intValue = num.intValue();
            }
            dest.writeInt(intValue);
            dest.writeInt(this.isCancelled ? 1 : 0);
            dest.writeString(this.shareToken);
            List<FieldMapping> list = this.fieldMappings;
            dest.writeInt(list.size());
            Iterator<FieldMapping> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public /* synthetic */ RelaySessionProps(String str, xo.h hVar, Integer num, boolean z10, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, hVar, num, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? kotlin.collections.p.k() : list);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u000b\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u001bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "inquiryId", "sessionToken", "environmentId", "Lxo/h;", "environment", "", "theme", "", "isCancelled", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxo/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "y", "c", "getEnvironmentId", rl.d.f30696a, "Lxo/h;", "j0", "()Lxo/h;", "e", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "f", "Z", "()Z", "g", "p3", "h", "Ljava/util/List;", "f1", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InquiryProps implements InquiryWorkflow$Props {

        @NotNull
        public static final Parcelable.Creator<InquiryProps> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String sessionToken;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String environmentId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final xo.h environment;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer theme;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isCancelled;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String shareToken;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<FieldMapping> fieldMappings;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InquiryProps> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InquiryProps createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                xo.h valueOf = xo.h.valueOf(parcel.readString());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(InquiryProps.class.getClassLoader()));
                }
                return new InquiryProps(readString, readString2, readString3, valueOf, valueOf2, z10, readString4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InquiryProps[] newArray(int i10) {
                return new InquiryProps[i10];
            }
        }

        public InquiryProps(@NotNull String inquiryId, @Nullable String str, @Nullable String str2, @NotNull xo.h environment, @Nullable Integer num, boolean z10, @Nullable String str3, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            this.inquiryId = inquiryId;
            this.sessionToken = str;
            this.environmentId = str2;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z10;
            this.shareToken = str3;
            this.fieldMappings = fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public boolean M() {
            return super.M();
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryProps)) {
                return false;
            }
            InquiryProps inquiryProps = (InquiryProps) other;
            return Intrinsics.c(this.inquiryId, inquiryProps.inquiryId) && Intrinsics.c(this.sessionToken, inquiryProps.sessionToken) && Intrinsics.c(this.environmentId, inquiryProps.environmentId) && this.environment == inquiryProps.environment && Intrinsics.c(this.theme, inquiryProps.theme) && this.isCancelled == inquiryProps.isCancelled && Intrinsics.c(this.shareToken, inquiryProps.shareToken) && Intrinsics.c(this.fieldMappings, inquiryProps.fieldMappings);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        public List<FieldMapping> f1() {
            return this.fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        public Integer getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int hashCode = this.inquiryId.hashCode() * 31;
            String str = this.sessionToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.environmentId;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.environment.hashCode()) * 31;
            Integer num = this.theme;
            int hashCode4 = (((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled)) * 31;
            String str3 = this.shareToken;
            return ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.fieldMappings.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        /* renamed from: j0, reason: from getter */
        public xo.h getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        /* renamed from: p3, reason: from getter */
        public String getShareToken() {
            return this.shareToken;
        }

        @NotNull
        public String toString() {
            return "InquiryProps(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environmentId=" + this.environmentId + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ", shareToken=" + this.shareToken + ", fieldMappings=" + this.fieldMappings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int intValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeString(this.environmentId);
            dest.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                intValue = 0;
            } else {
                dest.writeInt(1);
                intValue = num.intValue();
            }
            dest.writeInt(intValue);
            dest.writeInt(this.isCancelled ? 1 : 0);
            dest.writeString(this.shareToken);
            List<FieldMapping> list = this.fieldMappings;
            dest.writeInt(list.size());
            Iterator<FieldMapping> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        @Nullable
        /* renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public /* synthetic */ InquiryProps(String str, String str2, String str3, xo.h hVar, Integer num, boolean z10, String str4, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, hVar, num, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? kotlin.collections.p.k() : list);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b*\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010$R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b7\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010C\u001a\u0004\b\u0013\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\b<\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\bF\u0010$R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "", "templateId", "templateVersion", "accountId", "referenceId", "environmentId", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lxo/h;", "environment", "", "theme", "", "isCancelled", "redirectUri", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lxo/h;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "Ljava/lang/String;", "m", j6.b.f21518e, "n", "c", rl.d.f30696a, "j", "e", "f", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "o", "h", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "k", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "i", "Lxo/h;", "j0", "()Lxo/h;", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Z", "()Z", "l", "p3", "Ljava/util/List;", "f1", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemplateProps implements InquiryWorkflow$Props {

        @NotNull
        public static final Parcelable.Creator<TemplateProps> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String templateId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String templateVersion;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String accountId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String referenceId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String environmentId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Map<String, InquiryField> fields;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String themeSetId;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StaticInquiryTemplate staticInquiryTemplate;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final xo.h environment;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Integer theme;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isCancelled;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String redirectUri;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String shareToken;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<FieldMapping> fieldMappings;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TemplateProps> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TemplateProps createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(TemplateProps.class.getClassLoader()));
                    }
                }
                String readString6 = parcel.readString();
                StaticInquiryTemplate staticInquiryTemplate = (StaticInquiryTemplate) parcel.readParcelable(TemplateProps.class.getClassLoader());
                xo.h valueOf = xo.h.valueOf(parcel.readString());
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                boolean z10 = parcel.readInt() != 0;
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                int readInt2 = parcel.readInt();
                Integer num = valueOf2;
                ArrayList arrayList = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    arrayList.add(parcel.readParcelable(TemplateProps.class.getClassLoader()));
                    i11++;
                    readInt2 = readInt2;
                }
                return new TemplateProps(readString, readString2, readString3, readString4, readString5, linkedHashMap, readString6, staticInquiryTemplate, valueOf, num, z10, readString7, readString8, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TemplateProps[] newArray(int i10) {
                return new TemplateProps[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateProps(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, ? extends InquiryField> map, @Nullable String str6, @Nullable StaticInquiryTemplate staticInquiryTemplate, @NotNull xo.h environment, @Nullable Integer num, boolean z10, @Nullable String str7, @Nullable String str8, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.referenceId = str4;
            this.environmentId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z10;
            this.redirectUri = str7;
            this.shareToken = str8;
            this.fieldMappings = fieldMappings;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public boolean M() {
            return super.M();
        }

        @Nullable
        /* renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateProps)) {
                return false;
            }
            TemplateProps templateProps = (TemplateProps) other;
            return Intrinsics.c(this.templateId, templateProps.templateId) && Intrinsics.c(this.templateVersion, templateProps.templateVersion) && Intrinsics.c(this.accountId, templateProps.accountId) && Intrinsics.c(this.referenceId, templateProps.referenceId) && Intrinsics.c(this.environmentId, templateProps.environmentId) && Intrinsics.c(this.fields, templateProps.fields) && Intrinsics.c(this.themeSetId, templateProps.themeSetId) && Intrinsics.c(this.staticInquiryTemplate, templateProps.staticInquiryTemplate) && this.environment == templateProps.environment && Intrinsics.c(this.theme, templateProps.theme) && this.isCancelled == templateProps.isCancelled && Intrinsics.c(this.redirectUri, templateProps.redirectUri) && Intrinsics.c(this.shareToken, templateProps.shareToken) && Intrinsics.c(this.fieldMappings, templateProps.fieldMappings);
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        public List<FieldMapping> f1() {
            return this.fieldMappings;
        }

        @Nullable
        public final Map<String, InquiryField> g() {
            return this.fields;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        public Integer getTheme() {
            return this.theme;
        }

        public int hashCode() {
            String str = this.templateId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.referenceId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environmentId;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            int hashCode8 = (((hashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.environment.hashCode()) * 31;
            Integer num = this.theme;
            int hashCode9 = (((hashCode8 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled)) * 31;
            String str7 = this.redirectUri;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.shareToken;
            return ((hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.fieldMappings.hashCode();
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @NotNull
        /* renamed from: j0, reason: from getter */
        public xo.h getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* renamed from: k, reason: from getter */
        public final StaticInquiryTemplate getStaticInquiryTemplate() {
            return this.staticInquiryTemplate;
        }

        @Nullable
        /* renamed from: m, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @Nullable
        /* renamed from: n, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        @Nullable
        /* renamed from: o, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        @Nullable
        /* renamed from: p3, reason: from getter */
        public String getShareToken() {
            return this.shareToken;
        }

        @NotNull
        public String toString() {
            return "TemplateProps(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ", redirectUri=" + this.redirectUri + ", shareToken=" + this.shareToken + ", fieldMappings=" + this.fieldMappings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.templateId);
            dest.writeString(this.templateVersion);
            dest.writeString(this.accountId);
            dest.writeString(this.referenceId);
            dest.writeString(this.environmentId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeString(this.themeSetId);
            dest.writeParcelable(this.staticInquiryTemplate, flags);
            dest.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.isCancelled ? 1 : 0);
            dest.writeString(this.redirectUri);
            dest.writeString(this.shareToken);
            List<FieldMapping> list = this.fieldMappings;
            dest.writeInt(list.size());
            Iterator<FieldMapping> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public /* synthetic */ TemplateProps(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, xo.h hVar, Integer num, boolean z10, String str7, String str8, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, hVar, num, (i10 & 1024) != 0 ? false : z10, str7, (i10 & 4096) != 0 ? null : str8, (i10 & 8192) != 0 ? kotlin.collections.p.k() : list);
        }
    }
}
