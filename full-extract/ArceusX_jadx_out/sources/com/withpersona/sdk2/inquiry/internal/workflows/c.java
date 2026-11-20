package com.withpersona.sdk2.inquiry.internal.workflows;

import android.view.d0;
import android.view.l0;
import android.view.x0;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import fp.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mu.b0;
import mu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001'B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lfp/e0$b;", "inquiryStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lfp/e0$b;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Lfp/e0;", "e", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lfp/e0;", "", rl.d.f30696a, "()V", j6.b.f21518e, "Landroidx/lifecycle/l0;", "c", "Lfp/e0$b;", "Lmu/b0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Lmu/b0;", "_result", "Landroidx/lifecycle/d0;", "", "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "f", "getSessionToken", "setSessionToken", "sessionToken", "g", "Lfp/e0;", "inquiryStateManager", ve.a.f33391e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends x0 {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0.b inquiryStateManagerFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<InquiryWorkflow$Output> _result;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> inquiryId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> sessionToken;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e0 inquiryStateManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", ve.a.f33391e, "(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull l0 savedStateHandle);
    }

    public c(@NotNull l0 savedStateHandle, @NotNull e0.b inquiryStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(inquiryStateManagerFactory, "inquiryStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.inquiryStateManagerFactory = inquiryStateManagerFactory;
        this._result = i0.b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
    }

    @Override // android.view.x0
    public void d() {
        e0 e0Var = this.inquiryStateManager;
        if (e0Var != null) {
            e0Var.L();
        }
        super.d();
    }

    @NotNull
    public final e0 e(@NotNull InquiryWorkflow$Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        e0 e0Var = this.inquiryStateManager;
        if (e0Var != null) {
            return e0Var;
        }
        e0 a10 = this.inquiryStateManagerFactory.a(props, this.savedStateHandle);
        this.inquiryStateManager = a10;
        return a10;
    }
}
