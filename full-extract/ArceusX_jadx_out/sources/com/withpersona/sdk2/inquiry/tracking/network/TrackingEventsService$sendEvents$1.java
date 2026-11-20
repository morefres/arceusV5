package com.withpersona.sdk2.inquiry.tracking.network;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import kotlin.Metadata;
import mt.b;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService", f = "TrackingEventsService.kt", l = {MotionEventCompat.AXIS_GENERIC_7}, m = "sendEvents-0E7RQCE$tracking_events_release")
/* loaded from: classes3.dex */
public final class TrackingEventsService$sendEvents$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsService$sendEvents$1(TrackingEventsService trackingEventsService, b<? super TrackingEventsService$sendEvents$1> bVar) {
        super(bVar);
        this.this$0 = trackingEventsService;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        Object m72sendEvents0E7RQCE$tracking_events_release = this.this$0.m72sendEvents0E7RQCE$tracking_events_release(null, null, this);
        return m72sendEvents0E7RQCE$tracking_events_release == c.e() ? m72sendEvents0E7RQCE$tracking_events_release : n.a(m72sendEvents0E7RQCE$tracking_events_release);
    }
}
