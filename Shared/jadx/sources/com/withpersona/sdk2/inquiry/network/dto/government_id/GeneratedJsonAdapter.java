package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
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
import um.c;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "stringAdapter", "Lsm/h;", "", "listOfStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableListOfCapturePageConfigAdapter", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.IdJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<Id> {

    @NotNull
    private final h<List<String>> listOfStringAdapter;

    @NotNull
    private final h<Id.IdIcon> nullableIdIconAdapter;

    @NotNull
    private final h<List<CapturePageConfig>> nullableListOfCapturePageConfigAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("class", "requiresSides", "icon", "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<String> f10 = moshi.f(String.class, q0.d(), "class");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.stringAdapter = f10;
        h<List<String>> f11 = moshi.f(a0.j(List.class, String.class), q0.d(), "requiresSides");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfStringAdapter = f11;
        h<Id.IdIcon> f12 = moshi.f(Id.IdIcon.class, q0.d(), "icon");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIdIconAdapter = f12;
        h<List<CapturePageConfig>> f13 = moshi.f(a0.j(List.class, CapturePageConfig.class), q0.d(), "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfCapturePageConfigAdapter = f13;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Id");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public Id fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String str = null;
        List<String> list = null;
        Id.IdIcon idIcon = null;
        List<CapturePageConfig> list2 = null;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.x("class_", "class", reader);
                }
            } else if (F == 1) {
                list = this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw c.x("requiresSides", "requiresSides", reader);
                }
            } else if (F == 2) {
                idIcon = this.nullableIdIconAdapter.fromJson(reader);
            } else if (F == 3) {
                list2 = this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.d();
        if (str == null) {
            throw c.o("class_", "class", reader);
        }
        if (list != null) {
            return new Id(str, list, idIcon, list2);
        }
        throw c.o("requiresSides", "requiresSides", reader);
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable Id value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("class");
        this.stringAdapter.toJson(writer, (t) value_.getClass());
        writer.n("requiresSides");
        this.listOfStringAdapter.toJson(writer, (t) value_.getRequiresSides());
        writer.n("icon");
        this.nullableIdIconAdapter.toJson(writer, (t) value_.getIcon());
        writer.n("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, (t) value_.getCapturePageConfigs());
        writer.g();
    }
}
