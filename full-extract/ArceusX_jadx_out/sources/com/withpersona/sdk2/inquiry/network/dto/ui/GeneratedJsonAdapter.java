package com.withpersona.sdk2.inquiry.network.dto.ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "stringAdapter", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableButtonTypeAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributesJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<BasicButtonAttributes> {

    @Nullable
    private volatile Constructor<BasicButtonAttributes> constructorRef;

    @NotNull
    private final h<Button.ButtonType> nullableButtonTypeAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a(Text.type, "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<String> f10 = moshi.f(String.class, q0.d(), Text.type);
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.stringAdapter = f10;
        h<Button.ButtonType> f11 = moshi.f(Button.ButtonType.class, q0.d(), "buttonType");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableButtonTypeAdapter = f11;
        h<String> f12 = moshi.f(String.class, q0.d(), "autoSubmitCountdownText");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        h<Integer> f13 = moshi.f(Integer.class, q0.d(), "autoSubmitIntervalSeconds");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableIntAdapter = f13;
        h<JsonLogicBoolean> f14 = moshi.f(JsonLogicBoolean.class, q0.d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = f14;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BasicButtonAttributes");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public BasicButtonAttributes fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        int i10 = -1;
        String str = null;
        Button.ButtonType buttonType = null;
        String str2 = null;
        Integer num = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.x(Text.type, Text.type, reader);
                    }
                    break;
                case 1:
                    buttonType = this.nullableButtonTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    jsonLogicBoolean = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    jsonLogicBoolean2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -61) {
            JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
            JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
            Integer num2 = num;
            String str3 = str2;
            Button.ButtonType buttonType2 = buttonType;
            String str4 = str;
            if (str4 != null) {
                return new BasicButtonAttributes(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3);
            }
            throw c.o(Text.type, Text.type, reader);
        }
        JsonLogicBoolean jsonLogicBoolean5 = jsonLogicBoolean2;
        JsonLogicBoolean jsonLogicBoolean6 = jsonLogicBoolean;
        Integer num3 = num;
        String str5 = str2;
        Button.ButtonType buttonType3 = buttonType;
        String str6 = str;
        Constructor<BasicButtonAttributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str6 == null) {
            throw c.o(Text.type, Text.type, reader);
        }
        BasicButtonAttributes newInstance = constructor.newInstance(str6, buttonType3, str5, num3, jsonLogicBoolean6, jsonLogicBoolean5, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable BasicButtonAttributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n(Text.type);
        this.stringAdapter.toJson(writer, (t) value_.getText());
        writer.n("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, (t) value_.getButtonType());
        writer.n("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, (t) value_.getAutoSubmitCountdownText());
        writer.n("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, (t) value_.getAutoSubmitIntervalSeconds());
        writer.n("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (t) value_.getHidden());
        writer.n("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (t) value_.getDisabled());
        writer.g();
    }
}
