package com.withpersona.sdk2.inquiry.tracking.model;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigDataJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "nullableUiFrameworkAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InquiryConfigDataJsonAdapter extends h<InquiryConfigData> {

    @Nullable
    private volatile Constructor<InquiryConfigData> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<UiFramework> nullableUiFrameworkAdapter;

    @NotNull
    private final m.b options;

    public InquiryConfigDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b a10 = m.b.a("template_id", "template_version", "environment", "environment_id", "organization_id", "ui_framework", "theme_set_id", "has_account_id", "has_fields", "has_inquiry_id", "has_one_time_link_code", "has_redirect_uri", "has_reference_id", "has_session_token", "has_theme");
        a10.getClass();
        this.options = a10;
        this.nullableStringAdapter = b.a(wVar, String.class, "templateId");
        this.nullableUiFrameworkAdapter = b.a(wVar, UiFramework.class, "uiFramework");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "hasAccountId");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(InquiryConfigData)", 39);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public InquiryConfigData fromJson(@NotNull m reader) {
        int i10;
        reader.getClass();
        reader.b();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        UiFramework uiFramework = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    continue;
                case 0:
                    i10 = -2;
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    i10 = -3;
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    i10 = -5;
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    i10 = -9;
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    i10 = -17;
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    i10 = -33;
                    uiFramework = this.nullableUiFrameworkAdapter.fromJson(reader);
                    break;
                case 6:
                    i10 = -65;
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    i10 = -129;
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    i10 = -257;
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    i10 = -513;
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    i10 = -1025;
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    i10 = -2049;
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 12:
                    i10 = -4097;
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i10 = -8193;
                    bool7 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 14:
                    i10 = -16385;
                    bool8 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -32768) {
            Boolean bool9 = bool2;
            Boolean bool10 = bool;
            String str7 = str6;
            UiFramework uiFramework2 = uiFramework;
            String str8 = str5;
            String str9 = str4;
            return new InquiryConfigData(str, str2, str3, str9, str8, uiFramework2, str7, bool10, bool9, bool3, bool4, bool5, bool6, bool7, bool8);
        }
        Boolean bool11 = bool2;
        Boolean bool12 = bool;
        String str10 = str6;
        UiFramework uiFramework3 = uiFramework;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        Constructor<InquiryConfigData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InquiryConfigData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, UiFramework.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        InquiryConfigData newInstance = constructor.newInstance(str15, str14, str13, str12, str11, uiFramework3, str10, bool12, bool11, bool3, bool4, bool5, bool6, bool7, bool8, Integer.valueOf(i11), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable InquiryConfigData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("template_id");
        this.nullableStringAdapter.toJson(writer, (t) value_.getTemplateId());
        writer.n("template_version");
        this.nullableStringAdapter.toJson(writer, (t) value_.getTemplateVersion());
        writer.n("environment");
        this.nullableStringAdapter.toJson(writer, (t) value_.getEnvironment());
        writer.n("environment_id");
        this.nullableStringAdapter.toJson(writer, (t) value_.getEnvironmentId());
        writer.n("organization_id");
        this.nullableStringAdapter.toJson(writer, (t) value_.getOrganizationId());
        writer.n("ui_framework");
        this.nullableUiFrameworkAdapter.toJson(writer, (t) value_.getUiFramework());
        writer.n("theme_set_id");
        this.nullableStringAdapter.toJson(writer, (t) value_.getThemeSetId());
        writer.n("has_account_id");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasAccountId());
        writer.n("has_fields");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasFields());
        writer.n("has_inquiry_id");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasInquiryId());
        writer.n("has_one_time_link_code");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasOneTimeLinkCode());
        writer.n("has_redirect_uri");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasRedirectUri());
        writer.n("has_reference_id");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasReferenceId());
        writer.n("has_session_token");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasSessionToken());
        writer.n("has_theme");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getHasTheme());
        writer.g();
    }
}
