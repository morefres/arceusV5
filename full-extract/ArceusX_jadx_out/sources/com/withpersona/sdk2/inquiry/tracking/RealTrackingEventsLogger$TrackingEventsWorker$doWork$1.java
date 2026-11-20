package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$TrackingEventsWorker", f = "RealTrackingEventsLogger.kt", l = {218, 218, 218, 218, 218, 218, 191, 218, 218, 218}, m = "doWork")
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger$TrackingEventsWorker$doWork$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTrackingEventsLogger.TrackingEventsWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$TrackingEventsWorker$doWork$1(RealTrackingEventsLogger.TrackingEventsWorker trackingEventsWorker, mt.b<? super RealTrackingEventsLogger$TrackingEventsWorker$doWork$1> bVar) {
        super(bVar);
        this.this$0 = trackingEventsWorker;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return this.this$0.doWork(this);
    }
}
