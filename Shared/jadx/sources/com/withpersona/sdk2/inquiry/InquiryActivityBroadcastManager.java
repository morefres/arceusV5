package com.withpersona.sdk2.inquiry;

import ju.g1;
import ju.k;
import ju.p0;
import ju.q0;
import ju.z2;
import kotlin.Metadata;
import mu.b0;
import mu.g0;
import mu.i0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;", "", "<init>", "()V", "", "skipBackendCall", "", "cancelRunningInquiries", "(Z)V", "Lju/p0;", "coroutineScope", "Lju/p0;", "Lmu/b0;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "_eventFlow", "Lmu/b0;", "Lmu/g0;", "getEventFlow", "()Lmu/g0;", "eventFlow", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InquiryActivityBroadcastManager {

    @NotNull
    public static final InquiryActivityBroadcastManager INSTANCE = new InquiryActivityBroadcastManager();

    @NotNull
    private static final p0 coroutineScope = q0.a(g1.a().plus(z2.b(null, 1, null)));

    @NotNull
    private static final b0<InquiryActivityEvent> _eventFlow = i0.b(0, 0, null, 7, null);

    private InquiryActivityBroadcastManager() {
    }

    public static /* synthetic */ void cancelRunningInquiries$default(InquiryActivityBroadcastManager inquiryActivityBroadcastManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        inquiryActivityBroadcastManager.cancelRunningInquiries(z10);
    }

    public final void cancelRunningInquiries(boolean skipBackendCall) {
        k.d(coroutineScope, null, null, new InquiryActivityBroadcastManager$cancelRunningInquiries$1(skipBackendCall, null), 3, null);
    }

    @NotNull
    public final g0<InquiryActivityEvent> getEventFlow() {
        return _eventFlow;
    }
}
