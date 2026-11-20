package com.withpersona.sdk2.inquiry.internal.network;

import androidx.core.view.PointerIconCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.m;
import sm.t;
import sm.z;

@sm.i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0003\n\u0006\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", j6.b.f21518e, "Data", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateInquiryRequest {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Data data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "attributes", "", Payload.TYPE, "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;Ljava/lang/String;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", j6.b.f21518e, "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "Adapter", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Data {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final a attributes;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String type;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "<init>", "()V", "Lsm/t;", "jsonWriter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$Data$Adapter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @sm.f
            @NotNull
            public final Data fromJson(@NotNull m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                reader.b();
                String str = "";
                String str2 = str;
                while (reader.f()) {
                    String n10 = reader.n();
                    if (Intrinsics.c(n10, "templateId")) {
                        str = reader.r();
                        Intrinsics.checkNotNullExpressionValue(str, "nextString(...)");
                    } else if (Intrinsics.c(n10, "environment")) {
                        str2 = reader.r();
                        Intrinsics.checkNotNullExpressionValue(str2, "nextString(...)");
                    } else {
                        reader.P();
                    }
                }
                reader.d();
                return new Data(new a(str, null, str2, "", null, null, null, null, null, null, PointerIconCompat.TYPE_ALIAS, null), null, 2, 0 == true ? 1 : 0);
            }

            @z
            public final void toJson(@NotNull t jsonWriter, @NotNull Data data) {
                Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
                Intrinsics.checkNotNullParameter(data, "data");
                jsonWriter.c();
                jsonWriter.n("attributes");
                jsonWriter.c();
                String templateId = data.getAttributes().getTemplateId();
                if (templateId != null) {
                    jsonWriter.n("inquiryTemplateId").M(templateId);
                }
                String templateVersion = data.getAttributes().getTemplateVersion();
                if (templateVersion != null) {
                    jsonWriter.n("inquiryTemplateVersionId").M(templateVersion);
                }
                jsonWriter.n("environment").M(data.getAttributes().getEnvironment());
                String environmentId = data.getAttributes().getEnvironmentId();
                if (environmentId != null) {
                    jsonWriter.n("environment_id").M(environmentId);
                }
                String accountId = data.getAttributes().getAccountId();
                if (accountId != null) {
                    jsonWriter.n("accountId").M(accountId);
                }
                String referenceId = data.getAttributes().getReferenceId();
                if (referenceId != null) {
                    jsonWriter.n("referenceId").M(referenceId);
                }
                String note = data.getAttributes().getNote();
                if (note != null) {
                    jsonWriter.n("note").M(note);
                }
                if (data.getAttributes().d() != null) {
                    jsonWriter.n("fields");
                    InquiryFieldMap.INSTANCE.toJson(jsonWriter, new InquiryFieldMap(data.getAttributes().d()));
                }
                if (data.getAttributes().getThemeSetId() != null) {
                    jsonWriter.n("themeSetId").M(data.getAttributes().getThemeSetId());
                }
                if (data.getAttributes().getRedirectUri() != null) {
                    jsonWriter.n("redirectUri").M(data.getAttributes().getRedirectUri());
                }
                jsonWriter.g();
                jsonWriter.g();
            }

            public Companion() {
            }
        }

        public Data(@NotNull a attributes, @NotNull String type) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(type, "type");
            this.attributes = attributes;
            this.type = type;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final a getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ Data(a aVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? "inquiry" : str);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;", "", "<init>", "()V", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "fields", "themeSetId", "redirectUri", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", ve.a.f33391e, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CreateInquiryRequest a(@Nullable String templateId, @Nullable String templateVersion, @NotNull String environment, @Nullable String environmentId, @Nullable String accountId, @Nullable String referenceId, @Nullable Map<String, ? extends InquiryField> fields, @Nullable String themeSetId, @Nullable String redirectUri) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new CreateInquiryRequest(new Data(new a(templateId, templateVersion, environment, environmentId, accountId, referenceId, null, fields != null ? ep.a.t(fields) : null, themeSetId, redirectUri, 64, null), null, 2, 0 == true ? 1 : 0));
        }

        public Companion() {
        }
    }

    public CreateInquiryRequest(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "", "", "templateId", "templateVersion", "environment", "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", "h", "()Ljava/lang/String;", j6.b.f21518e, "i", "c", rl.d.f30696a, "e", "f", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "j", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String templateId;

        /* renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String templateVersion;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String environment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String environmentId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String accountId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String referenceId;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String note;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> fields;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String themeSetId;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String redirectUri;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable String str, @Nullable String str2, @NotNull String environment, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> map, @Nullable String str7, @Nullable String str8) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.templateId = str;
            this.templateVersion = str2;
            this.environment = environment;
            this.environmentId = str3;
            this.accountId = str4;
            this.referenceId = str5;
            this.note = str6;
            this.fields = map;
            this.themeSetId = str7;
            this.redirectUri = str8;
        }

        @Nullable
        /* renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getEnvironment() {
            return this.environment;
        }

        @Nullable
        /* renamed from: c, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        @Nullable
        public final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> d() {
            return this.fields;
        }

        @Nullable
        /* renamed from: e, reason: from getter */
        public final String getNote() {
            return this.note;
        }

        @Nullable
        /* renamed from: f, reason: from getter */
        public final String getRedirectUri() {
            return this.redirectUri;
        }

        @Nullable
        /* renamed from: g, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        @Nullable
        /* renamed from: h, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        @Nullable
        /* renamed from: i, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        @Nullable
        /* renamed from: j, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : map, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9);
        }
    }
}
