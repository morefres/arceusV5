package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import um.c;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", ve.a.f33391e, "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lsm/t;", "writer", "value_", "", j6.b.f21518e, "(Lsm/t;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "Lsm/h;", "stringAdapter", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "c", "listOfUiComponentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", d.f30696a, "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "e", "nullableClickableStackComponentStyleAdapter", "", "f", "booleanAdapter", "", "g", "longAdapter", "Ljava/lang/reflect/Constructor;", "h", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<ClickableStackComponent> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<String> stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<List<UiComponent>> listOfUiComponentAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<Boolean> booleanAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<Long> longAdapter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile Constructor<ClickableStackComponent> constructorRef;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("name", "children", "hidden", "disabled", "styles", "isActive", "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<String> f10 = moshi.f(String.class, q0.d(), "name");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.stringAdapter = f10;
        h<List<UiComponent>> f11 = moshi.f(a0.j(List.class, UiComponent.class), q0.d(), "children");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfUiComponentAdapter = f11;
        h<JsonLogicBoolean> f12 = moshi.f(JsonLogicBoolean.class, q0.d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = f12;
        h<ClickableStack.ClickableStackComponentStyle> f13 = moshi.f(ClickableStack.ClickableStackComponentStyle.class, q0.d(), "styles");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableClickableStackComponentStyleAdapter = f13;
        h<Boolean> f14 = moshi.f(Boolean.TYPE, q0.d(), "isActive");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
        h<Long> f15 = moshi.f(Long.TYPE, q0.d(), "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.longAdapter = f15;
    }

    @Override // sm.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClickableStackComponent fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        JsonLogicBoolean jsonLogicBoolean = null;
        Boolean bool2 = bool;
        Long l10 = 0L;
        String str = null;
        List<UiComponent> list = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = null;
        int i10 = -1;
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
                        throw c.x("name", "name", reader);
                    }
                    break;
                case 1:
                    list = this.listOfUiComponentAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.x("children", "children", reader);
                    }
                    break;
                case 2:
                    jsonLogicBoolean = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    jsonLogicBoolean2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    clickableStackComponentStyle = this.nullableClickableStackComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.x("isActive", "isActive", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    l10 = this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        throw c.x("lastValueUpdateTs", "lastValueUpdateTs", reader);
                    }
                    i10 &= -65;
                    break;
            }
        }
        reader.d();
        if (i10 == -97) {
            if (str == null) {
                throw c.o("name", "name", reader);
            }
            if (list != null) {
                return new ClickableStackComponent(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle, bool2.booleanValue(), l10.longValue());
            }
            throw c.o("children", "children", reader);
        }
        Constructor<ClickableStackComponent> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, c.f33031c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.o("name", "name", reader);
        }
        if (list == null) {
            throw c.o("children", "children", reader);
        }
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle2 = clickableStackComponentStyle;
        ClickableStackComponent newInstance = constructor.newInstance(str, list, jsonLogicBoolean, jsonLogicBoolean2, clickableStackComponentStyle2, bool2, l10, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable ClickableStackComponent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("name");
        this.stringAdapter.toJson(writer, (t) value_.getName());
        writer.n("children");
        this.listOfUiComponentAdapter.toJson(writer, (t) value_.getChildren());
        writer.n("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (t) value_.getHidden());
        writer.n("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (t) value_.getDisabled());
        writer.n("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(writer, (t) value_.getStyles());
        writer.n("isActive");
        this.booleanAdapter.toJson(writer, (t) Boolean.valueOf(value_.getIsActive()));
        writer.n("lastValueUpdateTs");
        this.longAdapter.toJson(writer, (t) Long.valueOf(value_.getLastValueUpdateTs()));
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClickableStackComponent");
        sb2.append(')');
        return sb2.toString();
    }
}
