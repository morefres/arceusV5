package com.withpersona.sdk2.inquiry.network.dto;

import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_ConfigJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lsm/h;", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "nullableListOfUiComponentErrorAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep_Ui_ConfigJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<NextStep.Ui.Config> {

    @Nullable
    private volatile Constructor<NextStep.Ui.Config> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final h<List<UiComponentError>> nullableListOfUiComponentErrorAdapter;

    @NotNull
    private final h<NextStep.Ui.Localizations> nullableLocalizationsAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors", "webviewUrl");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<List<UiComponentConfig>> f10 = moshi.f(a0.j(List.class, UiComponentConfig.class), q0.d(), "components");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = f10;
        h<Boolean> f11 = moshi.f(Boolean.class, q0.d(), "backStepEnabled");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        h<NextStep.Ui.Localizations> f12 = moshi.f(NextStep.Ui.Localizations.class, q0.d(), "localizations");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLocalizationsAdapter = f12;
        h<List<UiComponentError>> f13 = moshi.f(a0.j(List.class, UiComponentError.class), q0.d(), "serverComponentErrors");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfUiComponentErrorAdapter = f13;
        h<String> f14 = moshi.f(String.class, q0.d(), "webviewUrl");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.Ui.Config");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public NextStep.Ui.Config fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        int i10 = -1;
        List<UiComponentConfig> list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        NextStep.Ui.Localizations localizations = null;
        List<UiComponentError> list2 = null;
        String str = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    list = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    localizations = this.nullableLocalizationsAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    list2 = this.nullableListOfUiComponentErrorAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -127) {
            String str2 = str;
            List<UiComponentError> list3 = list2;
            NextStep.Ui.Localizations localizations2 = localizations;
            Boolean bool4 = bool3;
            return new NextStep.Ui.Config(list, bool, bool2, bool4, localizations2, list3, str2);
        }
        String str3 = str;
        List<UiComponentError> list4 = list2;
        NextStep.Ui.Localizations localizations3 = localizations;
        Boolean bool5 = bool3;
        Boolean bool6 = bool2;
        Boolean bool7 = bool;
        List<UiComponentConfig> list5 = list;
        Constructor<NextStep.Ui.Config> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NextStep.Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.Ui.Localizations.class, List.class, String.class, Integer.TYPE, um.c.f33031c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        NextStep.Ui.Config newInstance = constructor.newInstance(list5, bool7, bool6, bool5, localizations3, list4, str3, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable NextStep.Ui.Config value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, (t) value_.getComponents());
        writer.n("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getBackStepEnabled());
        writer.n("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getCancelButtonEnabled());
        writer.n("terminal");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getTerminal());
        writer.n("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, (t) value_.getLocalizations());
        writer.n("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(writer, (t) value_.getServerComponentErrors());
        writer.n("webviewUrl");
        this.nullableStringAdapter.toJson(writer, (t) value_.getWebviewUrl());
        writer.g();
    }
}
