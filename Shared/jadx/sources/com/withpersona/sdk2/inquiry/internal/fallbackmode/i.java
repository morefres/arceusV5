package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.view.l0;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import gt.l;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)V", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "g", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Ljava/util/List;", j6.b.f21518e, "Landroidx/lifecycle/l0;", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "inquiryId", rl.d.f30696a, "authorization", "", "value", "()I", "h", "(I)V", "currentStepIndex", "currentStep", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<NextStep> steps;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authorization;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", ve.a.f33391e, "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        i a(@NotNull List<? extends NextStep> steps, @NotNull String sessionToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull List<? extends NextStep> steps, @NotNull String sessionToken, @NotNull l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.steps = steps;
        this.savedStateHandle = savedStateHandle;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.inquiryId = uuid;
        this.authorization = "Bearer " + sessionToken;
    }

    @NotNull
    public final InquiryState a() {
        NextStep c10 = c();
        if (c10 instanceof NextStep.Ui) {
            return ep.a.I((NextStep.Ui) c10, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.a(), null, null, 96, null);
        }
        if (c10 instanceof NextStep.GovernmentId) {
            return ep.a.F((NextStep.GovernmentId) c10, this.authorization, this.inquiryId, null, InquirySessionConfig.INSTANCE.a(), null, null, 48, null);
        }
        if (c10 instanceof NextStep.Selfie) {
            return ep.a.H((NextStep.Selfie) c10, this.authorization, this.inquiryId, InquirySessionConfig.INSTANCE.a(), null, null, 24, null);
        }
        if (c10 instanceof NextStep.Document) {
            return ep.a.E((NextStep.Document) c10, this.authorization, this.inquiryId, InquirySessionConfig.INSTANCE.a(), null, null, 24, null);
        }
        if (c10 instanceof NextStep.Complete) {
            return ep.a.D((NextStep.Complete) c10, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.a(), null, null, 32, null);
        }
        if (c10 instanceof NextStep.Integration) {
            return ep.a.G((NextStep.Integration) c10, this.authorization, this.inquiryId, "fake_status", InquirySessionConfig.INSTANCE.a(), null, null, 48, null);
        }
        if (!Intrinsics.c(c10, NextStep.Unknown.INSTANCE)) {
            throw new l();
        }
        throw new IllegalArgumentException("Unknown type for step " + c10.getName());
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    public final NextStep c() {
        return this.steps.get(d());
    }

    public final int d() {
        Integer num = (Integer) this.savedStateHandle.b("current_fallback_mode_step_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @Nullable
    public final NextStep f() {
        if (d() == p.m(this.steps)) {
            return null;
        }
        h(d() + 1);
        return this.steps.get(d());
    }

    @Nullable
    public final NextStep g() {
        if (d() == 0) {
            return null;
        }
        h(d() - 1);
        return this.steps.get(d());
    }

    public final void h(int i10) {
        this.savedStateHandle.i("current_fallback_mode_step_index", Integer.valueOf(i10));
    }
}
