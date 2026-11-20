package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {94}, m = "beginFlush")
/* loaded from: classes3.dex */
public final class TrackingEventsCache$beginFlush$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsCache$beginFlush$1(TrackingEventsCache trackingEventsCache, mt.b<? super TrackingEventsCache$beginFlush$1> bVar) {
        super(bVar);
        this.this$0 = trackingEventsCache;
    }

    @Override // ot.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return this.this$0.beginFlush(null, this);
    }
}
