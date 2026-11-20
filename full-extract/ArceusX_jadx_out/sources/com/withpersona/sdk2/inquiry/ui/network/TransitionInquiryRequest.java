package com.withpersona.sdk2.inquiry.ui.network;

import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.i;

@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;)V", "", "inquiryId", "Landroid/content/ContentResolver;", "contentResolver", "", "Lokhttp3/MultipartBody$Part;", "c", "(Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "Data", "Attributes", "Meta", "FieldMapping", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransitionInquiryRequest {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Data data;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Meta meta;

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Ljava/util/Map;)V", ve.a.f33391e, "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Attributes {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, ComponentParam> componentParams;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(@Nullable Map<String, ? extends ComponentParam> map) {
            this.componentParams = map;
        }

        @Nullable
        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }
    }

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;)V", ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Data {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Attributes attributes;

        public Data(@NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", "", "", "sourceFieldName", "destinationFieldName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FieldMapping {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sourceFieldName;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String destinationFieldName;

        public FieldMapping(@NotNull String sourceFieldName, @NotNull String destinationFieldName) {
            Intrinsics.checkNotNullParameter(sourceFieldName, "sourceFieldName");
            Intrinsics.checkNotNullParameter(destinationFieldName, "destinationFieldName");
            this.sourceFieldName = sourceFieldName;
            this.destinationFieldName = destinationFieldName;
        }

        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getDestinationFieldName() {
            return this.destinationFieldName;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getSourceFieldName() {
            return this.sourceFieldName;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransitionInquiryRequest a(@NotNull UiComponent fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep, @Nullable String shareToken, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            Data data = new Data(new Attributes(componentParams));
            String name = fromComponent.getName();
            if (shareToken == null || shareToken.length() <= 0) {
                shareToken = null;
            }
            if (fieldMappings.isEmpty()) {
                fieldMappings = null;
            }
            return new TransitionInquiryRequest(data, new Meta(name, fromStep, shareToken, fieldMappings));
        }

        public Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14035a;

        static {
            int[] iArr = new int[op.a.values().length];
            try {
                iArr[op.a.f28088a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[op.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[op.a.f28089c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[op.a.f28090d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14035a = iArr;
        }
    }

    public TransitionInquiryRequest(@NotNull Data data, @NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x049d, code lost:
    
        if (r11 == null) goto L146;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<okhttp3.MultipartBody.Part> c(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.Nullable android.content.ContentResolver r21) {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest.c(java.lang.String, android.content.ContentResolver):java.util.List");
    }

    @i(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "", "", "fromComponent", "fromStep", "shareToken", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", d.f30696a, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Meta {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String shareToken;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<FieldMapping> fieldMappings;

        public Meta(@NotNull String fromComponent, @NotNull String fromStep, @Nullable String str, @Nullable List<FieldMapping> list) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.shareToken = str;
            this.fieldMappings = list;
        }

        @Nullable
        public final List<FieldMapping> a() {
            return this.fieldMappings;
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* renamed from: c, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @Nullable
        /* renamed from: d, reason: from getter */
        public final String getShareToken() {
            return this.shareToken;
        }

        public /* synthetic */ Meta(String str, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list);
        }
    }
}
