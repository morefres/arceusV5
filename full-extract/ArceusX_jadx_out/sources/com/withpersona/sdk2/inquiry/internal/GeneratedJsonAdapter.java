package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ErrorLogJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", ve.a.f33391e, "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;", "Lsm/t;", "writer", "value_", "", j6.b.f21518e, "(Lsm/t;Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "Lsm/h;", "nullableStringAdapter", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.ErrorLogJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends sm.h<ErrorLog> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sm.h<String> nullableStringAdapter;

    public GeneratedJsonAdapter(@NotNull sm.w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("info");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        sm.h<String> f10 = moshi.f(String.class, q0.d(), "info");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
    }

    @Override // sm.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ErrorLog fromJson(@NotNull sm.m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String str = null;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new ErrorLog(str);
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull sm.t writer, @Nullable ErrorLog value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("info");
        this.nullableStringAdapter.toJson(writer, (sm.t) value_.getInfo());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorLog");
        sb2.append(')');
        return sb2.toString();
    }
}
