package com.withpersona.sdk2.inquiry.selfie.network;

import com.appsflyer.sdk_base.referrer.Payload;
import j6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sm.i;
import ve.a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;", "", "", Payload.TYPE, "id", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;)V", a.f33391e, "Ljava/lang/String;", "c", "()Ljava/lang/String;", b.f21518e, "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "()Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfiePoseStateRequestData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SelfiePoseStateRequestAttributes attributes;

    public SelfiePoseStateRequestData(@NotNull String type, @NotNull String id2, @NotNull SelfiePoseStateRequestAttributes attributes) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.type = type;
        this.id = id2;
        this.attributes = attributes;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final SelfiePoseStateRequestAttributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
