package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger", f = "RealTrackingEventsLogger.kt", l = {570, 573, 583, 585, 587, 616}, m = "flush")
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger$flush$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTrackingEventsLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$flush$1(RealTrackingEventsLogger realTrackingEventsLogger, mt.b<? super RealTrackingEventsLogger$flush$1> bVar) {
        super(bVar);
        this.this$0 = realTrackingEventsLogger;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object flush;
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        flush = this.this$0.flush(this);
        return flush;
    }
}
