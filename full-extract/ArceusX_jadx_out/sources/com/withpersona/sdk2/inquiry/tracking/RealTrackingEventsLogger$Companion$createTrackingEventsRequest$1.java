package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$Companion", f = "RealTrackingEventsLogger.kt", l = {101, 111}, m = "createTrackingEventsRequest")
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTrackingEventsLogger.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(RealTrackingEventsLogger.Companion companion, mt.b<? super RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1> bVar) {
        super(bVar);
        this.this$0 = companion;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return this.this$0.createTrackingEventsRequest(null, null, this);
    }
}
