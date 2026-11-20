package com.withpersona.sdk2.inquiry.ui.network;

import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.lang.reflect.Constructor;
import java.util.List;
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

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest_MetaJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", ve.a.f33391e, "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "Lsm/t;", "writer", "value_", "", j6.b.f21518e, "(Lsm/t;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "Lsm/h;", "stringAdapter", "c", "nullableStringAdapter", "", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", d.f30696a, "nullableListOfFieldMappingAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest_MetaJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<TransitionInquiryRequest.Meta> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<String> stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<String> nullableStringAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<List<TransitionInquiryRequest.FieldMapping>> nullableListOfFieldMappingAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile Constructor<TransitionInquiryRequest.Meta> constructorRef;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("fromComponent", "fromStep", "shareToken", "fieldMappings");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<String> f10 = moshi.f(String.class, q0.d(), "fromComponent");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.stringAdapter = f10;
        h<String> f11 = moshi.f(String.class, q0.d(), "shareToken");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        h<List<TransitionInquiryRequest.FieldMapping>> f12 = moshi.f(a0.j(List.class, TransitionInquiryRequest.FieldMapping.class), q0.d(), "fieldMappings");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfFieldMappingAdapter = f12;
    }

    @Override // sm.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TransitionInquiryRequest.Meta fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        List<TransitionInquiryRequest.FieldMapping> list = null;
        int i10 = -1;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw um.c.x("fromComponent", "fromComponent", reader);
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw um.c.x("fromStep", "fromStep", reader);
                }
            } else if (F == 2) {
                str3 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            } else if (F == 3) {
                list = this.nullableListOfFieldMappingAdapter.fromJson(reader);
                i10 &= -9;
            }
        }
        reader.d();
        if (i10 == -13) {
            if (str == null) {
                throw um.c.o("fromComponent", "fromComponent", reader);
            }
            if (str2 != null) {
                return new TransitionInquiryRequest.Meta(str, str2, str3, list);
            }
            throw um.c.o("fromStep", "fromStep", reader);
        }
        Constructor<TransitionInquiryRequest.Meta> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TransitionInquiryRequest.Meta.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, Integer.TYPE, um.c.f33031c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw um.c.o("fromComponent", "fromComponent", reader);
        }
        if (str2 == null) {
            throw um.c.o("fromStep", "fromStep", reader);
        }
        TransitionInquiryRequest.Meta newInstance = constructor.newInstance(str, str2, str3, list, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable TransitionInquiryRequest.Meta value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("fromComponent");
        this.stringAdapter.toJson(writer, (t) value_.getFromComponent());
        writer.n("fromStep");
        this.stringAdapter.toJson(writer, (t) value_.getFromStep());
        writer.n("shareToken");
        this.nullableStringAdapter.toJson(writer, (t) value_.getShareToken());
        writer.n("fieldMappings");
        this.nullableListOfFieldMappingAdapter.toJson(writer, (t) value_.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TransitionInquiryRequest.Meta");
        sb2.append(')');
        return sb2.toString();
    }
}
