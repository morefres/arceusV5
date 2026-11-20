package com.withpersona.sdk2.inquiry.governmentid;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.m;
import sm.t;
import sm.w;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/RawExtractionJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", ve.a.f33391e, "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Lsm/t;", "writer", "value_", "", j6.b.f21518e, "(Lsm/t;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "Lsm/h;", "stringAdapter", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.RawExtractionJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends sm.h<RawExtraction> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sm.h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a(Payload.TYPE, "value");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        sm.h<String> f10 = moshi.f(String.class, q0.d(), Payload.TYPE);
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.stringAdapter = f10;
    }

    @Override // sm.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RawExtraction fromJson(@NotNull sm.m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw um.c.x(Payload.TYPE, Payload.TYPE, reader);
                }
            } else if (F == 1 && (str2 = this.stringAdapter.fromJson(reader)) == null) {
                throw um.c.x("value__", "value", reader);
            }
        }
        reader.d();
        if (str == null) {
            throw um.c.o(Payload.TYPE, Payload.TYPE, reader);
        }
        if (str2 != null) {
            return new RawExtraction(str, str2);
        }
        throw um.c.o("value__", "value", reader);
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable RawExtraction value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n(Payload.TYPE);
        this.stringAdapter.toJson(writer, (t) value_.getType());
        writer.n("value");
        this.stringAdapter.toJson(writer, (t) value_.getValue());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RawExtraction");
        sb2.append(')');
        return sb2.toString();
    }
}
