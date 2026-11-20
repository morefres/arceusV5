package com.withpersona.sdk2.inquiry.network.dto.selfie;

import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfigJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lsm/t;", "writer", "value_", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)V", "Lsm/m$b;", "options", "Lsm/m$b;", "nullableStringAdapter", "Lsm/h;", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfigJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<PoseConfig> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("pose", "allowReview", "manualCaptureEnabled", "manualCaptureDelayMs", "autoCaptureEnabled");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<String> f10 = moshi.f(String.class, q0.d(), "pose");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        h<Boolean> f11 = moshi.f(Boolean.class, q0.d(), "allowReview");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        h<Long> f12 = moshi.f(Long.class, q0.d(), "manualCaptureDelayMs");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLongAdapter = f12;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PoseConfig");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public PoseConfig fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l10 = null;
        Boolean bool3 = null;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (F == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (F == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
            } else if (F == 3) {
                l10 = this.nullableLongAdapter.fromJson(reader);
            } else if (F == 4) {
                bool3 = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new PoseConfig(str, bool, bool2, l10, bool3);
    }

    @Override // sm.h
    public void toJson(@NotNull t writer, @Nullable PoseConfig value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("pose");
        this.nullableStringAdapter.toJson(writer, (t) value_.getPose());
        writer.n("allowReview");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getAllowReview());
        writer.n("manualCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getManualCaptureEnabled());
        writer.n("manualCaptureDelayMs");
        this.nullableLongAdapter.toJson(writer, (t) value_.getManualCaptureDelayMs());
        writer.n("autoCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, (t) value_.getAutoCaptureEnabled());
        writer.g();
    }
}
