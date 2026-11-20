package com.withpersona.sdk2.inquiry.selfie.network;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse;
import j6.b;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rl.d;
import sm.h;
import sm.m;
import sm.t;
import sm.w;
import ve.a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse_SelfiePoseStateJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", a.f33391e, "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "Lsm/t;", "writer", "value_", "", b.f21518e, "(Lsm/t;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "", "Lsm/h;", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "nullableSelfiePoseAdapter", d.f30696a, "nullableStringAdapter", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse_SelfiePoseStateJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<SelfiePoseStateResponse.SelfiePoseState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<Integer> nullableIntAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<NextStep.Selfie.SelfiePose> nullableSelfiePoseAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<String> nullableStringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b a10 = m.b.a("index", "pose", "token");
        Intrinsics.checkNotNullExpressionValue(a10, "of(...)");
        this.options = a10;
        h<Integer> f10 = moshi.f(Integer.class, q0.d(), "index");
        Intrinsics.checkNotNullExpressionValue(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        h<NextStep.Selfie.SelfiePose> f11 = moshi.f(NextStep.Selfie.SelfiePose.class, q0.d(), "pose");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableSelfiePoseAdapter = f11;
        h<String> f12 = moshi.f(String.class, q0.d(), "token");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @Override // sm.h
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SelfiePoseStateResponse.SelfiePoseState fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        Integer num = null;
        NextStep.Selfie.SelfiePose selfiePose = null;
        String str = null;
        while (reader.f()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.M();
                reader.P();
            } else if (F == 0) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (F == 1) {
                selfiePose = this.nullableSelfiePoseAdapter.fromJson(reader);
            } else if (F == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new SelfiePoseStateResponse.SelfiePoseState(num, selfiePose, str);
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable SelfiePoseStateResponse.SelfiePoseState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("index");
        this.nullableIntAdapter.toJson(writer, (t) value_.getIndex());
        writer.n("pose");
        this.nullableSelfiePoseAdapter.toJson(writer, (t) value_.getPose());
        writer.n("token");
        this.nullableStringAdapter.toJson(writer, (t) value_.getToken());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SelfiePoseStateResponse.SelfiePoseState");
        sb2.append(')');
        return sb2.toString();
    }
}
